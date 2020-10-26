package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class VarNotDeclaredException extends SemanticException {
    public VarNotDeclaredException(String id){
        super(String.format("No se puede usar la variable '%s' ya que no fue declarada", id));
    }
}
