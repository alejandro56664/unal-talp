package co.edu.unal.talp.laboratorios.bcc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SyntacticalError extends DefaultErrorStrategy {


    private static final String[] orderLex = {
            "!=",
            "%",
            "%=",
            "(",
            ")",
            "*",
            "*=",
            "+",
            "++",
            "+=",
            ",",
            "-",
            "--",
            "-=",
            "/",
            "/=",
            ":",
            ":=",
            ";",
            "<",
            "<=",
            "==",
            ">",
            ">=",
            "bool",
            "end",
            "false",
            "identificador",
            "identificador de funcion",
            "numero",
            "true",
            "{",
            "}"};

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
                    orderedExpectedTokens.put(getOrderLex(vocabulary.getDisplayName(i)),
                                              processName(vocabulary.getDisplayName(i)));
                }
            }
        }
        return new ArrayList<>(orderedExpectedTokens.values());
    }

    private String processName(String name) {
        String result = name.toLowerCase();
        if(result.equals("fid")){
            return "'identificador de funcion'";
        }

        if(result.equals("id")){
            return "'identificador'";
        }

        if(result.equals("tk_num")){
            return "'numero'";
        }
        return result;
    }

    private String getOrderLex(String input){
        for (int i = 0; i<orderLex.length; ++i){
            if(input.equals(orderLex[i])) return String.valueOf(i);
        }
        return processName(input);
    }

    /**
    Debe retornar:
        <{linea},{col}> Error sintactico: se encontro: "{lexema del token}"; se esperaba: {lista de símbolos/tokens esperados entre comillas dobles separados por comas}.
     */
    private String formatError(int linea, int col, String lexem, List<String> expectedTokens){
        String auxLexema = processName(lexem);
        String result;
        //regla muy especifica
        if(auxLexema.equals("'<eof>'")) {
            result = String.format("<%d:%d> Error sintactico: se encontro final de archivo; se esperaba 'end'.", linea, col);

        } else { //regla general
            result = String.format("<%d:%d> Error sintactico: se encontro: %s; se esperaba: %s.", linea, col, auxLexema, String.join(", ", expectedTokens));
        }

        return result;
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
