package co.edu.talp.laboratorios.bcc;

import co.edu.talp.laboratorios.bcc.gen.BCC;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


/*
La salida consiste en una lista de tokens separados por saltos de línea,
*/
public class BCCLexer {
    //La idea es encapsular en esta clase el trabajo del lexer

    enum TokenGroup {
        SYMBOL,
        OPERATOR,
        RESERVED_WORD,
        IDENT,
        FUNCTION,
        NUMBER,
        DEFAULT
    }

    final static int[] reservedWords = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    final static int[] operators = {14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
    final static int[] symbols = {33,34,35,36,37,38,39};
    final static int[] ident = {40};
    final static int[] function = {41};
    final static int[] number = {42};

    private BCC lexer;
    private StringBuilder sb;

    public BCCLexer(String source) {
        lexer = new BCC(CharStreams.fromString(source));
        sb = new StringBuilder();
    }

    public String analyze() {

        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexicalError());

        CommonTokenStream tokens = new CommonTokenStream(lexer);



        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            sb.append(toString(token));
            sb.append('\n');
        }

        return sb.toString();
    }

    /*
    - Los operadores y símbolos especiales deben imprimirse en el siguiente formato:  <nombre_token,fila,columna>
    - En el caso de las palabras reservadas, el token y el lexema son iguales.
      Entonces se debe imprimir el siguiente formato:                                 <tipo_de_token,fila,columna>

    - Los identificadores encontrados seguirán el siguiente formato:                  <id,lexema,fila,columna>
    - En el caso de los identificadores de función se deben presentar así:            <fid,lexema,fila,columna>
    - caso general:                                                                   <tipo_de_token,lexema,fila,columna>
    - El lexema del número puede ser entero o real (sin signo)
    - Se deben especificar los lexemas, dependiendo de su token:                      <tk_num,lexema,fila,columna>
    */
    private String toString(Token token) {
        String result = "";
        // fila,columna
        String posicion = token.getLine() + "," + (token.getCharPositionInLine() + 1);

        String lexema = token.getText();

        String tipo = toStringType(token.getType());

        switch(getTokenGroup(token)){
            case SYMBOL:
            case OPERATOR:
            case RESERVED_WORD: {
                // <nombre_token,fila,columna>
                result = "<" + tipo  + "," + posicion + ">";
                break;
            }
            case IDENT: {
                //<id,lexema,fila,columna>
                result = "<" + "id" + "," + lexema + "," + posicion + ">";
                break;
            }
            case FUNCTION: {
                //<fid,lexema,fila,columna>
                result = "<" + "fid" + "," + lexema + "," + posicion + ">";
                break;
            }
            case NUMBER: {
                //<tk_num,lexema,fila,columna>
                result = "<" + "tk_num" + "," + lexema + "," + posicion + ">";
                break;
            }
            case DEFAULT:
            default:{
                //<tipo_de_token,lexema,fila,columna>
                result = "<" + tipo + "," + lexema + "," + posicion + ">";
                break;
            }
        }

        return result;
    }

    private String toStringType(int tokenType){
        return lexer.getRuleNames()[tokenType-1].toLowerCase();
    }

    private TokenGroup getTokenGroup(Token token) {
        int type = token.getType();
        if( foundIn(symbols,type)) return TokenGroup.SYMBOL;
        if( foundIn(operators,type)) return TokenGroup.OPERATOR;
        if( foundIn(reservedWords,type)) return TokenGroup.RESERVED_WORD;
        if( foundIn(number,type)) return TokenGroup.NUMBER;
        if( foundIn(ident,type)) return TokenGroup.IDENT;
        if( foundIn(function,type)) return TokenGroup.FUNCTION;
        return TokenGroup.DEFAULT;
    }

    boolean foundIn(int[] types, int type) {
        for (int _type : types) {
            if (type == _type) return true;
        }
        return false;
    }
}
