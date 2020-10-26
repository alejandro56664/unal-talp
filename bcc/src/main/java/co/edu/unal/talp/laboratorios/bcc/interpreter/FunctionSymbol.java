package co.edu.unal.talp.laboratorios.bcc.interpreter;

import java.util.Map;

public class FunctionSymbol {

    private final String name;
    private final Map<String, String> args; //name & type
    private final Map<String, String> vars; //name & type
    private final String returnType;
    private final Object body;

    public FunctionSymbol(String name, Map<String, String> args, String returnType,  Map<String, String> vars, Object body){
        this.name = name;
        this.args = args;
        this.vars = vars;
        this.returnType = returnType;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public Map<String, String> getVars() {
        return vars;
    }

    public String getReturnType() {
        return returnType;
    }

    public Object getBody() {
        return body;
    }
}
