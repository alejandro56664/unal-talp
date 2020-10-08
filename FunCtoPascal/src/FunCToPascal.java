import grammar.FunCBaseListener;
import grammar.FunCParser;

import java.util.ArrayDeque;
import java.util.Deque;


public class FunCToPascal extends FunCBaseListener {


    //Tabla de simbolos
    //private Map<String, String> ts = new HashMap<>();

    //traducción
    private StringBuilder sb = new StringBuilder();

    private Deque<String> stack = new ArrayDeque<>();

    @Override
    public void exitProgram(FunCParser.ProgramContext ctx) {
        System.out.print(sb.toString());
    }

    // S       -> TipoFun { L.tfh := TipoFun.trad } L puntoycoma      { S.Trad := L.trad || ";" }
    @Override
    public void exitS(FunCParser.SContext ctx){
        String strad  = stack.removeLast() + ";\n"; //S.Trad := L.trad || ";"
        sb.append(strad);
    }

    /*
    TipoFun -> void  { TipoFun.trad := "" }
    TipoFun -> int   { TipoFun.trad := "integer" }
    TipoFun -> float { TipoFun.trad := "real" }
     */

    @Override
    public void exitTipofun(FunCParser.TipofunContext ctx){
        String tipofunlexema = ctx.getText();
        String tipofuntrad = tipotrad(tipofunlexema);
        stack.add(tipofuntrad);
    }

    /*
    L       -> { F.tfh := L.tfh} F { Lp.tfh = L.tfh }  Lp { L.trad =  F.trad || "; " || Lp.trad }
     */
    @Override
    public void enterL(FunCParser.LContext ctx){
        distribuirTh();
    }


    /*
    F       -> ident Lpar A rpar    { Si F.tfh == "" F.trad := "procedure" || ident.lexema || "(" || A.trad || ")"
                                      de lo contrario F.trad := "function " || ident.lexema || "(" || A.trad || ")" || ":" F.tfh }
     */
    @Override
    public  void exitF(FunCParser.FContext ctx) {

        //ya tuvimos que recorrer A
        String atrad = stack.removeLast();
        String ftfh = stack.removeLast();
        String identlexema = ctx.ID().getText();
        String ftrad;

        String params = "";

        if(!atrad.isEmpty()){
            params = "(" + atrad + ")";
        }

        if(ftfh.isEmpty()){
            ftrad = "procedure " + identlexema + params;
        } else {
            ftrad = "function " + identlexema + params + ":" + ftfh;
        }

        // movida rara: swap para que cuando salga de recorrer el arbol de F se
        // pueda tomar el tipo en L para Lp
        String lpth = stack.removeLast();
        stack.add(ftrad);
        stack.add(lpth);
    }

    /*
    A       -> void                     { A.trad := "" }
    A       -> Argu M                   { A.trad := Argu.trad || M.trad }
     */
    @Override
    public  void exitA(FunCParser.AContext ctx) {
        String atrad;
        if(ctx.getText().equals("void")){
            atrad = "";
        } else {
            String mtrad = stack.removeLast();
            String argutrad = stack.removeLast();

            atrad = argutrad + mtrad;
        }
        stack.add(atrad);


    }

    /*
    Argu    -> Tipo ident               { Argu.trad := ident.lexema || ": " || Tipo.trad }
    Argu    -> Tipo asterisco ident     { Argu.trad := "var " || ident.lexema || ": " || Tipo.trad }
     */
    @Override
    public  void exitArgu(FunCParser.ArguContext ctx) {
        //ya debimos pasar por tipo e ident
        String tipotrad = stack.removeLast();
        String identlexema = ctx.ID().getText();

        String argutrad;
        boolean hayAsterisco = (ctx.ASTERISCO() != null);

       if(hayAsterisco) {
           argutrad =  "var " + identlexema + ":" + tipotrad;
       } else {
           argutrad =  identlexema + ":" + tipotrad;
       }
       stack.add(argutrad);
    }

    @Override
    public  void exitTipo(FunCParser.TipoContext ctx) {
        String tipolexema = ctx.getText();
        String tipotrad = tipotrad(tipolexema);
        stack.add(tipotrad);
    }

    /*
    M       -> coma Argu M              { M.trad := ", " || Argu.trad  || M1.trad}
    M       -> epsilon                  { M.trad := "" }
     */
    @Override
    public void exitM(FunCParser.MContext ctx){
        String mtrad = "";

        boolean hayArgu = (ctx.argu() != null);
        if(hayArgu) {
            //ya tuvimos que recorrer Argu
            String mtrad1 = stack.removeLast();
            String argutrad  = stack.removeLast();
            mtrad = ", "+argutrad + mtrad1;

        }
        stack.add(mtrad);


    }


    /*
    Lp      -> coma { F.tfh := Lp.tfh } F { Lp1.th := Lp.tfh } Lp  { Lp.trad := F.trad || "; " || Lp1.trad }
    Lp      -> epsilon { Lp.trad := "" }
     */
    @Override
    public  void enterLp(FunCParser.LpContext ctx) {
        distribuirTh(); //{ F.tfh := Lp.tfh } F { Lp1.th := Lp.tfh } Lp
    }


    @Override
    public  void exitLp(FunCParser.LpContext ctx) {
        String lptrad ;

        boolean hayF = (ctx.f() != null);
        if(hayF) {
            //ya tuvimos que recorrer F
            String lptrad1  = stack.removeLast();
            String ftrad  = stack.removeLast();
            lptrad = ftrad + "; \n" + lptrad1;
            stack.add(lptrad);
        } else {
            //Si no hay argu
            lptrad = "";
            //quitamos los valores a los cuales hicimos la distribución
            stack.removeLast();
            stack.removeLast();
        }


    }


    private String tipotrad(String tipolexema) {
        String tipotrad;
        if (tipolexema.equals("int")) {
            tipotrad = "integer";
        } else if (tipolexema.equals("float")) {
            tipotrad = "real";
        } else /*void*/ {
            tipotrad = "";
        }
        return tipotrad;
    }

    private void distribuirTh() {
        String th = stack.removeLast();
        stack.add(th); //para F
        stack.add(th); //para Lp
    }

}
