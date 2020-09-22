package co.edu.talp.laboratorios.bcc;

import co.edu.talp.laboratorios.bcc.ErrorHandling;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class LexicalError extends ErrorHandling {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        System.err.println("\n>>> Error lexico(linea:"+line+','+"posicion:"+(charPositionInLine+1)+")");
        System.exit(0);
    }
}