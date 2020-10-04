package co.edu.unal.talp.laboratorios.bcc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SyntacticalError extends DefaultErrorStrategy {


    private String reportSyntaxError (Token token, Parser recognizer) {
        Vocabulary vocabulary = recognizer.getVocabulary();
        String tokenName = processName(this.getTokenErrorDisplay(token));

        List<Interval> intervals = this.getExpectedTokens(recognizer).getIntervals();

        List<String> expectedTokens = getOrderedExpectedTokens(vocabulary, intervals);

        String msg = formatError(token.getLine(),
                             token.getCharPositionInLine() + 1,
                                 tokenName,
                                 expectedTokens
                                 );
        System.out.println(msg);
        System.exit(0);
        return msg;
    }

    private List<String> getOrderedExpectedTokens(Vocabulary vocabulary, List<Interval> intervals) {
        Map<String, String> orderedExpectedTokens = new TreeMap<>();
        //Adapted from org.antlr.v4.runtime.misc.IntervalSet.toString(Vocabulary)
        if(intervals != null && ! intervals.isEmpty()) {
            for (Interval interval : intervals) {
                for(int i = interval.a; i <= interval.b; ++i) {
                    orderedExpectedTokens.put(vocabulary.getSymbolicName(i),
                                              processName(vocabulary.getDisplayName(i)));
                }
            }
        }
        return new ArrayList<>(orderedExpectedTokens.values());
    }

    private String processName(String name) {
        String result = name.toLowerCase();
        if(result.equals("fid")){
            return "\"identificador de funcion\"";
        }

        if(result.equals("id")){
            return "\"identificador\"";
        }

        if(result.equals("tk_num")){
            return "\"numero\"";
        }
        return result;
    }

    /**
    Debe retornar:
        <{linea},{col}> Error sintactico: se encontro: "{lexema del token}"; se esperaba: {lista de símbolos/tokens esperados entre comillas dobles separados por comas}.
     */
    private String formatError(int linea, int col, String lexem, List<String> expectedTokens){
        return
                String.format("<%d,%d> Error sintactico: se encontro: %s; se esperaba: %s.", linea, col, lexem, String.join(",", expectedTokens))
                      .replaceAll("'","\"");
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token token = recognizer.getCurrentToken();
            String msg = reportSyntaxError(token, recognizer);
            recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = reportSyntaxError(e.getOffendingToken(), recognizer);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if(!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token token = recognizer.getCurrentToken();
            String msg = reportSyntaxError(token, recognizer);
            recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        String msg = reportSyntaxError(e.getOffendingToken(), recognizer);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }
}
