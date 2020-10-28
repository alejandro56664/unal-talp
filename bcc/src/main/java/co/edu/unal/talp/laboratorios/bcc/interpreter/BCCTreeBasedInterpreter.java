package co.edu.unal.talp.laboratorios.bcc.interpreter;

import co.edu.unal.talp.laboratorios.bcc.exceptions.*;
import co.edu.unal.talp.laboratorios.bcc.gen.BCCBaseVisitor;
import co.edu.unal.talp.laboratorios.bcc.gen.BCCParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Consumer;

public class BCCTreeBasedInterpreter<T> extends BCCBaseVisitor {

    private MemorySpace<T> global = new MemorySpace<>("global");
    private MemorySpace<T> currentSpace = global;
    private Deque<FunctionSpace<T> > stack = new LinkedList<>();
    private Map<String, FunctionSymbol> functions = new HashMap<>();
    private boolean breakSignal = false;

    @Override
    public T visitFn_decl_list(BCCParser.Fn_decl_listContext ctx) {

        String fid = ctx.FID().getText();
        String returnType = ctx.datatype().getText();
        Object body = ctx.stmt_block();
        Map<String, String> args = new HashMap<>();
        Map<String, String> vars = new HashMap<>();

        abstractVar_decl(ctx.var_decl(0), args);

        if(ctx.var_decl().size() > 1) {
            //solo se ejecuta si hay una declaración de variables
            abstractVar_decl(ctx.var_decl(1), vars);
        }

        FunctionSymbol fs = new FunctionSymbol(fid, args, returnType, vars, body);

        try {
            securedRegisterFun(fid, fs);
        } catch (FunctionAlreadyDeclaredException e) {
            reportSemanticError(ctx.getStart(), e);
        }

        return null;
    }


    @Override
    public T visitVar_decl(BCCParser.Var_declContext ctx) {
            abstractVar_decl(ctx, (nameType)-> {
                try {
                    currentSpace.registerVar(nameType.a, nameType.b);
                } catch (VarAlreadyDeclaredException e) {
                    reportSemanticError(ctx.getStart(), e);
                }
            });
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitDatatype(BCCParser.DatatypeContext ctx) {
        if(ctx.TK_BOOLT() != null) return (T) ctx.TK_BOOLT().getText();
        if(ctx.TK_NUMT() != null) return (T) ctx.TK_NUMT().getText();
        return null;
    }

    //stmt
    @Override
    public T visitAsigns(BCCParser.AsignsContext ctx){
        String id = ctx.ID().getText();

        if(ctx.TK_ASIGNACION() != null) {
            //asignación común y corriente, la de toda la vida
            Object value = visitLexpr(ctx.lexpr());
            try {
                updateVar(id, value);
            } catch (SemanticException se) {
                reportSemanticError(ctx.getStart(), se);
            } catch (Exception e){
                reportSemanticError(e.toString());
            }
        } else if(ctx.TK_SUM_ASIG() != null) {
            abstractOperationAndAsig(ctx.lexpr(), ctx.ID(), "+");
        } else if(ctx.TK_RES_ASIG() != null) {
            abstractOperationAndAsig(ctx.lexpr(), ctx.ID(), "-");
        } else if(ctx.TK_MUL_ASIG() != null) {
            abstractOperationAndAsig(ctx.lexpr(), ctx.ID(), "*");
        } else if(ctx.TK_DIV_ASIG() != null) {
            abstractOperationAndAsig(ctx.lexpr(), ctx.ID(), "/");
        } else if(ctx.TK_MOD_ASIG() != null) {
            abstractOperationAndAsig(ctx.lexpr(), ctx.ID(), "%");
        }
        return null;
    }

    @Override
    public T visitAsign(BCCParser.AsignContext ctx) {
        return visitAsigns(ctx.asigns());
    }

    @Override
    public T visitPrint(BCCParser.PrintContext ctx){
        Object t = visitLexpr(ctx.lexpr());
        System.out.println(t);
        return null;
    }

    @Override
    public T visitInput(BCCParser.InputContext ctx){
        //leer valor
        String id = ctx.ID().getText();
        System.out.println(String.format("Ingrese por favor el valor para '%s': ",id));
        Object value =  System.console().readLine();
        try {
            updateVar(id, value);
        } catch (SemanticException se) {
            reportSemanticError(ctx.getStart(), se);
        } catch (Exception e) {
            reportSemanticError(e.toString());
        }
        return null;
    }

    @Override
    public T visitRepeat(BCCParser.RepeatContext ctx) {
        int count = Integer.parseInt(ctx.TK_NUM().getText());

        for (int i = 0; i < count; i++) {
            visitStmt_block(ctx.stmt_block());
        }

        return null;
    }

    @Override
    public T visitLoop(BCCParser.LoopContext ctx) {

        while (true) {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            if(breakSignal) { breakSignal = false; break; }
        }
        return null;
    }

    @Override
    public T visitFor(BCCParser.ForContext ctx) {
        visitAsigns(ctx.asigns());
        while ((Boolean) visitLexpr(ctx.lexpr(0))) {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            //if(breakSignal) { breakSignal = false; break; }
            visitLexpr(ctx.lexpr(1));
        }
        return null;
    }

    @Override
    public T visitWhile(BCCParser.WhileContext ctx) {
        while ((Boolean) visitLexpr(ctx.lexpr())) {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            //if(breakSignal) { breakSignal = false; break; }
        }
        return null;
    }

    @Override
    public T visitUntil(BCCParser.UntilContext ctx) {
        while (!(Boolean) visitLexpr(ctx.lexpr())) {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            //if(breakSignal) { breakSignal = false; break; }
        }
        return null;
    }

    @Override
    public T visitDowhile(BCCParser.DowhileContext ctx) {
        do  {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            //if(breakSignal) { breakSignal = false; break; }
        } while((Boolean) visitLexpr(ctx.lexpr()));
        return null;
    }

    @Override
    public T visitDountil(BCCParser.DountilContext ctx) {
        do  {
            visitStmt_block(ctx.stmt_block());
            //mecanismo de break
            //if(breakSignal) { breakSignal = false; break; }
        } while(!(Boolean) visitLexpr(ctx.lexpr()));
        return null;
    }

    @Override
    public T visitBreak(BCCParser.BreakContext ctx) {
        breakSignal = true;
        return null;
    }

    @Override
    public T visitWhen(BCCParser.WhenContext ctx) {
        abstractCondition(ctx.lexpr(), ctx.stmt_block());
        return null;
    }

    @Override
    public T visitUnless(BCCParser.UnlessContext ctx) {
        abstractCondition(ctx.lexpr(), ctx.stmt_block());
        return null;
    }

    @Override
    public T visitConditional(BCCParser.ConditionalContext ctx) {

        boolean condition = (Boolean) visitLexpr(ctx.lexpr());

        if(condition) {
            visitStmt_block(ctx.stmt_block(0));

        } else {
            visitStmt_block(ctx.stmt_block(1));
        }
        return null;

    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitLexpr(BCCParser.LexprContext ctx) {

        if(ctx.TK_AND().isEmpty() && ctx.TK_OR().isEmpty()) {
            //solo hay un nexp
            return visitNexpr(ctx.nexpr(0));
        } else{
            Boolean result = (Boolean) visitNexpr(ctx.nexpr(0));
            Boolean nexpr;

            //validamos si el arreglo de ands no esta vacio para traer el numero de veces que
            //debemos repetir el and. En caso de estar vacio el array, tomamos el tamaño de ors

            if (!ctx.TK_AND().isEmpty()){
                for (int i = 0; i < ctx.TK_AND().size(); i++) {
                    nexpr = (Boolean) visitNexpr(ctx.nexpr(i));
                    result = result && nexpr;
                }

            }else{
                for (int i = 0; i < ctx.TK_OR().size(); i++) {
                    nexpr = (Boolean) visitNexpr(ctx.nexpr(i));
                    result = result || nexpr;
                }
            }

            return (T) result;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitNexpr(BCCParser.NexprContext ctx) {
        if(ctx.TK_NOT() != null){
            Boolean nlexpr = !(Boolean) visitLexpr(ctx.lexpr());
            return (T) nlexpr;
        } else {
            return visitRexpr(ctx.rexpr());
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitRexpr(BCCParser.RexprContext ctx) {
        if(ctx.simple_expr().size() == 1){
            return visitSimple_expr(ctx.simple_expr(0));
        } else {
            //suponemos que es mayor que uno
            //reconocemos el operador
            String op = getCompareOperator(ctx);
            Object a =  visitSimple_expr(ctx.simple_expr(0));
            Object b =  visitSimple_expr(ctx.simple_expr(1));
            Boolean result = null;
            try {
                result = compare(op, a, b);
            } catch (SemanticException e) {
                reportSemanticError(ctx.getStart(), e);
            }
            return (T) result;
        }

    }
    @SuppressWarnings("unchecked")
    @Override
    public T visitSimple_expr(BCCParser.Simple_exprContext ctx) {
        if(ctx.term().size() == 1){
            return visitTerm(ctx.term(0));
        } else {
            Double r = (Double) visitTerm(ctx.term(0));
            Double n;
            for (int i = 1; i < ctx.term().size(); i++) {
                String op = getAritmeticOperator(ctx, i-1);
                n = (Double) visitTerm(ctx.term(i));
                try {
                    r = compute(op, r, n);
                } catch (SemanticException e) {
                    reportSemanticError(ctx.getStart(), e);
                }
            }
            return (T) r;
        }

    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitTerm(BCCParser.TermContext ctx) {
        if(ctx.factor().size() == 1){
            return visitFactor(ctx.factor(0));
        } else {
            Double r = (Double) visitFactor(ctx.factor(0));
            Double n;
            for (int i = 1; i < ctx.factor().size(); i++) {
                String op = getAritmeticOperator(ctx, i-1);
                n = (Double) visitFactor(ctx.factor(i));
                try {
                    r = compute(op, r, n);
                } catch (SemanticException e) {
                    reportSemanticError(ctx.getStart(), e);
                }
            }
            return (T) r;
        }

    }

    @SuppressWarnings("unchecked")
    @Override
    public T visitFactor (BCCParser.FactorContext ctx){
        if(ctx.TK_NUM() != null) return (T) (Double) Double.parseDouble(ctx.TK_NUM().toString());
        if(ctx.TRUE() != null) return (T)  Boolean.TRUE;
        if(ctx.FALSE() != null) return (T)  Boolean.FALSE;

        try {
            if(ctx.TK_INCREMENTO()!=null || ctx.TK_DECREMENTO()!=null) return vistitFactorPrePostIncDec(ctx);
            if(ctx.ID()!=null) return visitFactorId(ctx);
            if(ctx.FID()!=null) return visitFactorFID(ctx);
        } catch (SemanticException sex){
            reportSemanticError(ctx.getStart(), sex);
        } catch (Exception ex){
            reportSemanticError(ex.toString());
        }

        if(ctx.lexpr()!=null) return visitLexpr(ctx.lexpr(0));
        return null;
    }

    @Override
    public T visitReturn(BCCParser.ReturnContext ctx) {
        //si vamos a retornar lo que se debe hacer es tratar de memoryspace
        T result = visitLexpr(ctx.lexpr());

        //TODO esto debería generar un error en el caso de haber un return en el memoryspace global
        String returnType = ((FunctionSpace)currentSpace).getFunctionSymbol().getReturnType();
        try {
            currentSpace.registerVar("return",returnType, result );
        } catch (VarAlreadyDeclaredException e) {
            e.printStackTrace();
        }
        return result;
    }


    private T vistitFactorPrePostIncDec(BCCParser.FactorContext ctx) throws Exception {

        boolean decrement = (ctx.TK_DECREMENTO()!=null);
        int startPosId = ctx.ID().getSymbol().getStartIndex();
        int startPosOp = (decrement)? ctx.TK_DECREMENTO().getSymbol().getStartIndex():
                                      ctx.TK_INCREMENTO().getSymbol().getStartIndex();

        String id = ctx.ID().getText();

        if (startPosOp < startPosId) {
            return visitFactorPreIncDec(id, decrement); //pre operador
        } else {
            return visitFactorPostIncDec(id, decrement); //post operador
        }

    }

    private T visitFactorId(BCCParser.FactorContext ctx) throws Exception {
        String id = ctx.ID().getText();
        return getVarValue(id);
    }

    @SuppressWarnings("unchecked")
    private T visitFactorPreIncDec(String id, boolean decrement) throws Exception {
        Double value = (Double) currentSpace.getVarValue(id);
        if(decrement){
            value = value - 1;
        } else { /*ctx.TK_INCREMENTO()!= null*/
            value = value + 1;
        }
        updateVar(id, value); //se guarda el valor modificado
        return (T) value; //se retorna el valor modificado
    }

    @SuppressWarnings("unchecked")
    private T visitFactorPostIncDec(String id, boolean decrement) throws Exception {
        Double value = (Double) currentSpace.getVarValue(id);
        Double newValue;
        if(decrement){
            newValue = value - 1;
        } else { /*ctx.TK_INCREMENTO()!= null*/
            newValue = value + 1;
        }
        updateVar(id, newValue); //se guarda el valor modificado
        return (T) value; //se retorna el valor sin modificar
    }

    private T visitFactorFID(BCCParser.FactorContext ctx) throws FunctionNotDeclaredException, InvalidArgsException {

        String fid = ctx.FID().getText();
        FunctionSymbol fs = getFunctionSymbol(fid);

        //creamos un nuevo memoryspace para la función
        FunctionSpace<T> functionSpace = new FunctionSpace<>(fs);

        //obtenemos los parametros antes de llamar a la función
        List<T> args = new ArrayList<>();
        ctx.lexpr().forEach((lexpr ->  args.add(visitLexpr(lexpr))));

        //una vez obtenidos se cargan en el memory space
        functionSpace.load(args);

        //revisar esta cambio donde es mejor
        MemorySpace<T> savedSpace = currentSpace;
        currentSpace = functionSpace;
        stack.add(functionSpace);


        //se invoca la ejecución de la función
        visitStmt_block((BCCParser.Stmt_blockContext) fs.getBody());

        T result = null;
        try {
            result = currentSpace.getVarValue("return");
        } catch (VarNotDeclaredException | VarNeverAssignedException e) {
            //no existen procedimientos en BCC por lo que siempre deben retornar algo
            reportSemanticError(ctx.getStart(), e);
        }

        //revisar donde es mejor poner esto
        stack.removeLast();
        currentSpace = (stack.size() > 0) ? savedSpace: global ;

        return result;
    }


    private String getAritmeticOperator(BCCParser.Simple_exprContext ctx, int i) {
        if(ctx.TK_MAS(i) != null) return ctx.TK_MAS(i).getText();
        if(ctx.TK_MENOS(i) != null) return ctx.TK_MENOS(i).getText();
        return "";
    }

    private String getAritmeticOperator(BCCParser.TermContext ctx, int i) {
        if(ctx.TK_DIV(i) != null) return ctx.TK_DIV(i).getText();
        if(ctx.TK_MUL(i) != null) return ctx.TK_MUL(i).getText();
        if(ctx.TK_MOD(i) != null) return ctx.TK_MOD(i).getText();
        return "";
    }

    private String getCompareOperator(BCCParser.RexprContext ctx) {
        //TK_MENOR|TK_IGUALDAD|TK_MENOR_IGUAL|TK_MAYOR|TK_MAYOR_IGUAL|TK_DIFERENTE
        if(ctx.TK_MENOR()!=null) return ctx.TK_MENOR().getText();
        if(ctx.TK_IGUALDAD()!=null) return ctx.TK_IGUALDAD().getText();
        if(ctx.TK_MENOR_IGUAL()!=null) return ctx.TK_MENOR_IGUAL().getText();
        if(ctx.TK_MAYOR()!=null) return ctx.TK_MAYOR().getText();
        if(ctx.TK_MAYOR_IGUAL()!=null) return ctx.TK_MAYOR_IGUAL().getText();
        if(ctx.TK_DIFERENTE()!=null) return ctx.TK_DIFERENTE().getText();
        return "";
    }

    private Boolean compare(String op, Object a, Object b) throws SemanticException {
        if(a instanceof Boolean && b instanceof Boolean){
            return compareBooleans(op, (Boolean)a, (Boolean)b);
        } else {
            return compareNumbers(op, (Double)a, (Double)b);
        }
    }

    private Boolean compareBooleans(String op, Boolean term1, Boolean term2) throws SemanticException {
        Boolean ans = null;

        switch (op) {
            case "==":
                ans = term1 == term2;
                break;
            case "!=":
                ans = term1 != term2;
                break;
            default:
                throw new SemanticException(String.format("El operador de comparación '%s' es invalido", op));
        }
        return ans;
    }

    private Boolean compareNumbers(String op, Double num1, Double num2) throws SemanticException {
        //TODO hacer referencia a los token directamente y no a sus lexemas
        Boolean ans = null;

        switch (op){
            case "<":
                ans = num1 < num2;
                break;
            case "<=":
                ans = num1 <= num2;
                break;
            case ">":
                ans = num1 > num2;
                break;
            case ">=":
                ans = num1 >= num2;
                break;
            case "==":
                ans = Math.abs(num1-num2) < 0.000000001;
                break;
            case "!=":
                ans = Math.abs(num1-num2) > 0.000000001;
                break;
            default:
                throw new SemanticException(String.format("El operador de comparación '%s' es invalido", op));

        }

        return ans;
    }

    private Double compute(String op, Double num1, Double num2) throws SemanticException {
        //TODO hacer referencia a los token directamente y no a sus lexemas
        Double ans = null;
        switch (op){
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "*":
                ans = num1 * num2;
                break;
            case "/":
                ans = num1 / num2;
                break;
            case "%":
                ans = num1 % num2;
                break;
            case "":
                ans = num2;
                break;

            default:
                throw new SemanticException(String.format("El operador aritmetico '%s' es invalido", op));
        }

        return ans;
    }

    private void abstractCondition(Object lexpr, Object block){
        boolean condition = (Boolean) visitLexpr((BCCParser.LexprContext)lexpr);

        if(condition) {
            visitStmt_block((BCCParser.Stmt_blockContext)block);
        }
    }

    private void abstractOperationAndAsig(BCCParser.LexprContext lexpr, TerminalNode ID, String op ){
        String id = ID.getText();
        Double resultExpr = (Double) visitLexpr(lexpr);
        try {
            Double currentValue = (Double) getVarValue(id);
            updateVar(id, compute(op, currentValue, resultExpr));
        } catch (SemanticException se) {
            reportSemanticError(lexpr.getStart(), se);
        } catch (Exception e) {
            reportSemanticError(e.toString());
        }
    }

    private Pair<String, String> extractVarNameType(BCCParser.Var_declContext ctx, int i) {
        String id = ctx.ID(i).getText();
        String type = (String)visitDatatype(ctx.datatype(i));

        return new Pair<>(id,type);
    }

    private void abstractVar_decl(BCCParser.Var_declContext ctx, Map<String,String> registry){
        abstractVar_decl(ctx, (nameType)-> {
            try {
                securedRegisterVar(nameType, registry);
            } catch (VarAlreadyDeclaredException e) {
                reportSemanticError(ctx.getStart(), e);
            }
        });
    }
    private void abstractVar_decl(BCCParser.Var_declContext ctx, Consumer<Pair<String,String>> registerVar) {
        Pair<String,String> nameType;
        if(ctx.ID().size() == 1){
            //solo hay una variable
            nameType = extractVarNameType(ctx,0);
            registerVar.accept(nameType);

        } else {
            //hay mas declaraciones
            for (int i = 0; i < ctx.ID().size(); i++) {
                nameType = extractVarNameType(ctx,i);
                registerVar.accept(nameType);
            }
        }
    }

    private void securedRegisterVar(Pair<String,String> nameType, Map<String,String> registry) throws VarAlreadyDeclaredException{
        String name = nameType.a;
        String type = nameType.b;
        if (registry.get(name) != null) throw new VarAlreadyDeclaredException(name);
        registry.put(name, type);
    }

    private void securedRegisterFun(String fid, FunctionSymbol fs) throws FunctionAlreadyDeclaredException {
        if (functions.get(fid) != null) throw new FunctionAlreadyDeclaredException(fid);
        functions.put(fid, fs);
    }

    private void updateVar(String id, Object value) throws VarNotDeclaredException {
        try {
            currentSpace.updateVar(id, value);
        } catch (VarNotDeclaredException ex1) {
            try {
                //intentamos buscar en el contexto global
                global.updateVar(id, value);
            } catch (VarNotDeclaredException ex2) {
                throw ex2;
            }
        }
    }

    private T getVarValue(String id) throws VarNotDeclaredException, VarNeverAssignedException {
        T result;
        try {
            result = currentSpace.getVarValue(id);
        } catch (VarNotDeclaredException | VarNeverAssignedException ex1) {
            try {
                //intentamos buscar en el contexto global
                result = global.getVarValue(id);
            } catch (VarNotDeclaredException | VarNeverAssignedException ex2) {
                throw ex2;
            }
        }
        return result;
    }

    private FunctionSymbol getFunctionSymbol(String fid) throws FunctionNotDeclaredException {
        FunctionSymbol fs = functions.get(fid);
        if(fs == null) {
            throw new FunctionNotDeclaredException(fid);
        }
        return fs;
    }


    private void reportSemanticError(Token token, SemanticException sex) {
        sex.setPosition(token.getLine(), token.getCharPositionInLine()+1);
        reportSemanticError(sex.toString());
    }

    private void reportSemanticError(String message) {
        System.err.println(message);
        System.exit(-1);
    }




}
