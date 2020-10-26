package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class FunctionNotDeclaredException extends SemanticException {
    public FunctionNotDeclaredException(String fid){
        super(String.format("No se puede invocar la funcion '%s' ya que no fue declarada", fid));
    }
}
