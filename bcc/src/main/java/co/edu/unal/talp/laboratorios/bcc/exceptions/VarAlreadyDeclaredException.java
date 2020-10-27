package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class VarAlreadyDeclaredException extends SemanticException {
    public VarAlreadyDeclaredException(String id){
        super(String.format("Ya existe una variable con el nombre '%s'", id));
    }
}
