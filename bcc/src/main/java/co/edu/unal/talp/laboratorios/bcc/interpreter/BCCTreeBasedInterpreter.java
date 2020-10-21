package co.edu.unal.talp.laboratorios.bcc.interpreter;

import co.edu.unal.talp.laboratorios.bcc.gen.BCCBaseVisitor;
import co.edu.unal.talp.laboratorios.bcc.gen.BCCParser;

public class BCCTreeBasedInterpreter<T> extends BCCBaseVisitor {

    //TODO visitar var declaration
    //TODO visitar var asignación
    //TODO visitar factor id
    @Override
    public T visitPrint(BCCParser.PrintContext ctx){
        Object t = visitLexpr(ctx.lexpr());
        System.out.println(t);
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
    public T visitConditional(BCCParser.ConditionalContext ctx) {

        boolean condition = (Boolean) visitLexpr(ctx.lexpr());

        if(condition) {
            visitStmt_block(ctx.stmt_block(0));

        } else {
            visitStmt_block(ctx.stmt_block(1));
        }
        return null;

    }

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

    @Override
    public T visitNexpr(BCCParser.NexprContext ctx) {
        if(ctx.TK_NOT() != null){
            Boolean nlexpr = !(Boolean) visitLexpr(ctx.lexpr());
            return (T) nlexpr;
        } else {
            return (T) visitRexpr(ctx.rexpr());
        }
    }

    @Override
    public T visitRexpr(BCCParser.RexprContext ctx) {
        if(ctx.simple_expr().size() == 1){
            return (T) visitSimple_expr(ctx.simple_expr(0));
        } else {
            //suponemos que es mayor que uno
            //reconocemos el operador
            String op = getCompareOperator(ctx);
            Double a = (Double) visitSimple_expr(ctx.simple_expr(0));
            Double b = (Double) visitSimple_expr(ctx.simple_expr(1));
            Boolean result = compare(op, a, b);
            return (T) result;
        }

    }

    @Override
    public T visitSimple_expr(BCCParser.Simple_exprContext ctx) {
        if(ctx.term().size() == 1){
            return (T) visitTerm(ctx.term(0));
        } else {
            Double a = (Double) visitTerm(ctx.term(0));
            Double n;
            Double r = 0.0; //teniendo en cuenta que las simple_expr solo maneja sumas o restas
            for (int i = 0; i < ctx.term().size(); i++) {
                String op = getAritmeticOperator(ctx, i);
                n = (Double) visitTerm(ctx.term(i));
                r = compute(op, a, r);
            }
            return (T) r;
        }

    }

    @Override
    public T visitTerm(BCCParser.TermContext ctx) {
        if(ctx.factor().size() == 1){
            return (T) visitFactor(ctx.factor(0));
        } else {
            Double a = (Double) visitFactor(ctx.factor(0));
            Double n;
            Double r = 0.0; //teniendo en cuenta que las simple_expr solo maneja sumas o restas
            for (int i = 0; i < ctx.factor().size(); i++) {
                String op = getAritmeticOperator(ctx, i);
                n = (Double) visitFactor(ctx.factor(i));
                r = compute(op, a, r);
            }
            return (T) r;
        }

    }

    @Override
    public T visitFactor(BCCParser.FactorContext ctx) {
        if(ctx.TK_NUM() != null) return (T) (Double) Double.parseDouble(ctx.TK_NUM().toString());
        if(ctx.TRUE() != null) return (T) (Boolean) Boolean.TRUE;
        if(ctx.FALSE() != null) return (T) (Boolean) Boolean.FALSE;
        //TODO visitar Factor
        return null;
    }

    private String getAritmeticOperator(BCCParser.Simple_exprContext ctx, int i) {
        if(ctx.TK_MAS(i) != null) return ctx.TK_MAS(i).getText();
        if(ctx.TK_MENOS(i) != null) return ctx.TK_MENOS(i).getText();
        return null;
    }

    private String getAritmeticOperator(BCCParser.TermContext ctx, int i) {
        if(ctx.TK_DIV(i) != null) return ctx.TK_DIV(i).getText();
        if(ctx.TK_MUL(i) != null) return ctx.TK_MUL(i).getText();
        if(ctx.TK_MOD(i) != null) return ctx.TK_MOD(i).getText();
        return null;
    }

    private String getCompareOperator(BCCParser.RexprContext ctx) {
        //TK_MENOR|TK_IGUALDAD|TK_MENOR_IGUAL|TK_MAYOR|TK_MAYOR_IGUAL|TK_DIFERENTE
        if(ctx.TK_MENOR()!=null) return ctx.TK_MENOR().getText();
        if(ctx.TK_IGUALDAD()!=null) return ctx.TK_IGUALDAD().getText();
        if(ctx.TK_MENOR_IGUAL()!=null) return ctx.TK_MENOR_IGUAL().getText();
        if(ctx.TK_MAYOR()!=null) return ctx.TK_MAYOR().getText();
        if(ctx.TK_MAYOR_IGUAL()!=null) return ctx.TK_MAYOR_IGUAL().getText();
        if(ctx.TK_DIFERENTE()!=null) return ctx.TK_DIFERENTE().getText();
        return null;
    }

    private Boolean compare(String op, Double num1, Double num2){
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
        }

        return ans;
    }

    private Double compute(String op, Double num1, Double num2){
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

        }

        return ans;
    }

}
