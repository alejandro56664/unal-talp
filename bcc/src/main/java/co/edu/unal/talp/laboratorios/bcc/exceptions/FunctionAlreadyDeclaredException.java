package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class FunctionAlreadyDeclaredException extends SemanticException {
    public FunctionAlreadyDeclaredException(String fid){
        super(String.format("Ya existe una función con el nombre '%s'", fid));
    }
}
