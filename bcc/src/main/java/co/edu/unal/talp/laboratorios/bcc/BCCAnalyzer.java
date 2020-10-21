package co.edu.unal.talp.laboratorios.bcc;

import co.edu.unal.talp.laboratorios.bcc.gen.BCCLexer;
import co.edu.unal.talp.laboratorios.bcc.gen.BCCParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


/*
La salida consiste en una lista de tokens separados por saltos de línea,
*/
public class BCCAnalyzer {
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

    final static int[] reservedWords = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
    final static int[] operators = {26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,};
    final static int[] symbols = {45,46,47,48,49,50,51};
    final static int[] ident = {52};
    final static int[] function = {53};
    final static int[] number = {54};

    private BCCLexer lexer;
    private BCCParser parser;
    private String source;

    public BCCAnalyzer(String source) {
        this.source = preprocess(source);
    }

    private String preprocess(String source) {
        return source.replaceAll("\t", "    ");
    }

    public String analyzeLexicon() {
        StringBuilder sb = new StringBuilder();

        prepareLexer();

        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            System.out.println(toString(token));
            sb.append(toString(token)).append('\n');
        }
        //eliminamos el ultimo saldo de linea
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }


    public ParseTree parse(){
        prepareParser();
        ParseTree tree = parser.programa(); // begin parsing at init rule
        System.out.println("El analisis sintactico ha finalizado correctamente.");
        return tree;
    }

    private void prepareParser() {
        prepareLexer();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new BCCParser(tokens);

        parser.removeErrorListeners();
        parser.setErrorHandler(new SyntacticalError());
    }


    private void prepareLexer() {
        lexer = new BCCLexer(CharStreams.fromString(source));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexicalError());
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
