package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class VarNeverAssignedException extends SemanticException {
    public VarNeverAssignedException(String id){
        super(String.format("No se puede usar la variable '%s' ya que nunca fue asignada", id));
    }
}
