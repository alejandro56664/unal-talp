lexer grammar BCC;

/*
Donde nombre_token será determinado de la siguiente manera: tk_nombre_token.
El nombre_token debe ser alguno de la siguiente lista:

Para mayor claridad para saber cómo usarlos, refiérase a los ejemplos anteriores.

 */

// Define palabras reservadas

PRINT: 'print';
INPUT: 'input';
WHILE: 'while';
WHEN: 'when';
IF: 'if';
UNLESS: 'unless';
RETURN: 'return';
UNTIL: 'until';
LOOP: 'loop';
DO: 'do';
REPEAT: 'repeat';
FOR: 'for';
END: 'end';
NEXT: 'next';
BREAK: 'break';
NUM: 'num';
BOOL: 'bool';
VAR: 'var';
AND: 'and';
OR: 'or';
NOT: 'not';
ELSE: 'else';
FUNCTION: 'function';
TRUE: 'true';
FALSE: 'false';

// simbolos y operadores
TK_MENOR: '<';
TK_MENOR_IGUAL: '<=';
TK_MAYOR: '>';
TK_MAYOR_IGUAL: '>=';
TK_IGUALDAD: '==';
TK_DIFERENTE: '!=';
TK_ASIGNACION: ':=';
TK_MAS: '+';
TK_MENOS: '-';
TK_MULT: '*';
TK_DIV: '/';
TK_MOD: '%';
TK_SUM_ASIG: '+=';
TK_RES_ASIG: '-=';
TK_MUL_ASIG: '*=';
TK_DIV_ASIG: '/=';
TK_MOD_ASIG: '%=';
TK_INCREMENTO: '++';
TK_DECREMENTO: '--';

TK_LLAVE_IZQ: '{';
TK_LLAVE_DER: '}';
TK_PAR_IZQ: '(';
TK_PAR_DER: ')';
TK_COMA: ',';
TK_PUNTOYCOMA: ';';
TK_DOSPUNTOS: ':';

// El lexema del número puede ser entero o real (sin signo)
ID: [a-zA-Z_][a-zA-Z0-9_]*;
FID: '@' [a-zA-Z_][a-zA-Z0-9_]*;
TK_NUM: [0-9]*'.'?[0-9]+;

COMMENTARIO: '#' .*? '\n' -> skip;
//Los comentarios deberán ser ignorados.

/*
Tenga en cuenta que este lenguaje es case sensitive, por lo que una cadena como
FOr no será aceptada como palabra reservada; en cambio, la palabra for sí es considerada
como palabra reservada.*/
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
