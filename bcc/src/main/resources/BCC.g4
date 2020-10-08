grammar BCC;

/* Consideraciónes gramaticales para BCC
Programa
    Un programa en bcc está formado de la siguiente forma:
        - Una lista de funciones (opcional)
        - Un programa principal
*/
programa: fn_decl_list* main_prog;

/*
A su vez, el programa principal (main_prog) está formado así:
Una única lista de declaración de variables (opcional)
Una lista de sentencias (0 o muchas)
*/

main_prog : (TK_VAR var_decl TK_PUNTOYCOMA)* stmt* TK_END;

/*
Declaración de funciones
*/
fn_decl_list:
            TK_FUNCTION FID TK_DOSPUNTOS datatype TK_PAR_IZQ var_decl TK_PAR_DER (TK_VAR var_decl TK_PUNTOYCOMA)? stmt_block;

stmt_block: TK_LLAVE_IZQ stmt+ TK_LLAVE_DER
            | stmt;

var_decl: ID TK_DOSPUNTOS datatype (TK_COMA ID TK_DOSPUNTOS datatype)*;

//Definir datatype
datatype: TK_NUMT | TK_BOOLT;

stmt: TK_PRINT lexpr TK_PUNTOYCOMA
	| TK_INPUT ID TK_PUNTOYCOMA
	| TK_WHEN TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_IF TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block TK_ELSE stmt_block
	| TK_UNLESS TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_WHILE TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block //originalmente era expr
	| TK_RETURN lexpr TK_PUNTOYCOMA //originalmente era expr
	| TK_UNTIL TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_LOOP stmt_block
	| TK_DO stmt_block TK_WHILE TK_PAR_IZQ lexpr TK_PAR_DER
	| TK_DO stmt_block TK_UNTIL TK_PAR_IZQ lexpr TK_PAR_DER
	| TK_REPEAT TK_NUM TK_DOSPUNTOS stmt_block
    | TK_FOR TK_PAR_IZQ lexpr TK_PUNTOYCOMA lexpr TK_PUNTOYCOMA lexpr TK_PAR_DER TK_DO stmt_block
    | TK_NEXT TK_PUNTOYCOMA
    | TK_BREAK TK_PUNTOYCOMA
    | TK_DECREMENTO ID TK_PUNTOYCOMA
    | TK_INCREMENTO ID TK_PUNTOYCOMA
    | stmt_asign;

stmt_asign: ID TK_ASIGNACION lexpr TK_PUNTOYCOMA
    | ID TK_SUM_ASIG lexpr TK_PUNTOYCOMA
    | ID TK_RES_ASIG lexpr TK_PUNTOYCOMA
    | ID TK_MUL_ASIG lexpr TK_PUNTOYCOMA
    | ID TK_DIV_ASIG lexpr TK_PUNTOYCOMA
    | ID TK_MOD_ASIG lexpr TK_PUNTOYCOMA
    | ID TK_INCREMENTO TK_PUNTOYCOMA
    | ID TK_DECREMENTO TK_PUNTOYCOMA;


lexpr: nexpr ((TK_AND nexpr)* | (TK_OR nexpr)*);

nexpr: TK_NOT TK_PAR_IZQ lexpr TK_PAR_DER
	| rexpr;

rexpr: simple_expr ((TK_MENOR|TK_IGUALDAD|TK_MENOR_IGUAL|TK_MAYOR|TK_MAYOR_IGUAL|TK_DIFERENTE) simple_expr)?;

simple_expr: term ((TK_MAS | TK_MENOS) term)*;

term: factor ((TK_MUL|TK_DIV|TK_MOD) factor)*;

factor: TK_NUM
        | TRUE
        | FALSE
        | (TK_INCREMENTO | TK_DECREMENTO) ID
        | ID
        | ID (TK_INCREMENTO | TK_DECREMENTO)
        | TK_PAR_IZQ simple_expr TK_PAR_DER //originalmente era lexpr
        | FID TK_PAR_IZQ (lexpr (TK_COMA lexpr)*) TK_PAR_DER;

/*
Donde nombre_token será determinado de la siguiente manera: tk_nombre_token.
El nombre_token debe ser alguno de la siguiente lista:

Para mayor claridad para saber cómo usarlos, refiérase a los ejemplos anteriores.

 */

// Define palabras reservadas

TK_PRINT: 'print';
TK_INPUT: 'input';
TK_WHILE: 'while';
TK_WHEN: 'when';
TK_IF: 'if';
TK_UNLESS: 'unless';
TK_RETURN: 'return';
TK_UNTIL: 'until';
TK_LOOP: 'loop';
TK_DO: 'do';
TK_REPEAT: 'repeat';
TK_FOR: 'for';
TK_END: 'end';
TK_NEXT: 'next';
TK_BREAK: 'break';
TK_BOOLT: 'bool';
TK_NUMT: 'num';
TK_VAR: 'var';
TK_AND: 'and';
TK_OR: 'or';
TK_NOT: 'not';
TK_ELSE: 'else';
TK_FUNCTION: 'function';
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
TK_MUL: '*';
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
TK_NUM: [0-9]+ ('.' [0-9]+)?;

COMMENTARIO: '#' .*? '\n' -> skip;
//Los comentarios deberán ser ignorados.

/*
Tenga en cuenta que este lenguaje es case sensitive, por lo que una cadena como
FOr no será aceptada como palabra reservada; en cambio, la palabra for sí es considerada
como palabra reservada.*/
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
