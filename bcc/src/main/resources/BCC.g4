lexer grammar BCC;

/*
Donde nombre_token será determinado de la siguiente manera: tk_nombre_token.
El nombre_token debe ser alguno de la siguiente lista:

tk_mayor,
tk_mayor_igual,
tk_menor,
tk_menor_igual,
tk_sum_asig,
tk_res_asig,
tk_mul_asig,
tk_div_asig,
tk_mod_asig,
tk_igualdad,
tk_diferente,
tk_incremento,
tk_decremento,
tk_mas,
tk_menos,
tk_mul,
tk_div,
tk_mod,
tk_coma,


Para mayor claridad para saber cómo usarlos, refiérase a los ejemplos anteriores.

 */

// Define palabras reservadas
WHILE: 'while';
PRINT: 'print';
NUM: 'num';
VAR: 'var';
END: 'end';

// simbolos y operadores
TK_MENOR: '<';
TK_ASIGNACION: ':=';
TK_LLAVE_IZQ: '{';
TK_LLAVE_DER: '}';
TK_PAR_IZQ: '(';
TK_MAS: '+';
TK_PAR_DER: ')';
TK_PUNTOYCOMA: ';';
TK_DOSPUNTOS: ':';
// El lexema del número puede ser entero o real (sin signo)
ID: [a-zA-Z_][a-zA-Z0-9_]*;
TK_NUM: [0-9]+;

//Los comentarios deberán ser ignorados.

/*
Tenga en cuenta que este lenguaje es case sensitive, por lo que una cadena como
FOr no será aceptada como palabra reservada; en cambio, la palabra for sí es considerada
como palabra reservada.*/
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
