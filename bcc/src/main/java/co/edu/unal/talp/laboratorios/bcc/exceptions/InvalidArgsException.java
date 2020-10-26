package co.edu.unal.talp.laboratorios.bcc.exceptions;

import java.util.Map;

public class InvalidArgsException extends SemanticException {
    public InvalidArgsException(String fid, Map<String, String> expectedArgs){
        super(String.format("Los argumentos pasados a la función '%s' no coinciden con la lista esperada '%s'",
                fid, expectedArgs.toString()));
    }

}
