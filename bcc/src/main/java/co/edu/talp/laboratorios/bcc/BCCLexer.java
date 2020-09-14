package co.edu.talp.laboratorios.bcc;

/*
La salida consiste en una lista de tokens separados por saltos de línea,
los cuales deben seguir el siguiente formato:

<tipo_de_token,lexema,fila,columna>

En el caso de las palabras reservadas, el token y el lexema son iguales.
Entonces se debe imprimir el siguiente formato:

<tipo_de_token,fila,columna>

Queda como parte del ejercicio encontrar el conjunto de palabras reservadas del lenguaje,
según la especificación dada en el manual de referencia.

Se deben especificar los lexemas de la siguiente manera, dependiendo de su token.

<tk_num,lexema,fila,columna>

El lexema del número puede ser entero o real (sin signo)

Los identificadores encontrados seguirán el siguiente formato:

<id,lexema,fila,columna>

En el caso de los identificadores de función se deben presentar así:

<fid,lexema,fila,columna>


Los comentarios deberán ser ignorados.

Tenga en cuenta que este lenguaje es case sensitive, por lo que una cadena como
FOr no será aceptada como palabra reservada; en cambio, la palabra for sí es considerada
como palabra reservada.

Los operadores y símbolos especiales deben imprimirse en el siguiente formato:

<nombre_token,fila,columna>

*/
public class BCCLexer {
    //La idea es encapsular en esta clase el trabajo del lexer

    private String source;
    public BCCLexer() {

    }

    public void load(String source){
        this.source = source;
    }

    public String analyze() {
        return " ";
    }
}
