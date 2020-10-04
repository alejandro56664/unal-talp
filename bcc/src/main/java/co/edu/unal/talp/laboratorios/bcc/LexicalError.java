package co.edu.unal.talp.laboratorios.bcc;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class LexicalError extends ErrorHandling {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        System.err.println(">>> Error léxico(línea:"+line+','+"posición:"+(charPositionInLine+1)+")");
        System.exit(0);
    }
}