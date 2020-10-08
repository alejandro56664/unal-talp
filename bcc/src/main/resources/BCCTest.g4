grammar BCCTest;

stmt_asign:
            VARIABLE TK_ASIGNACION TK_NUM TK_PUNTOYCOMA
          | VARIABLE TK_SUM_ASIG TK_NUM TK_PUNTOYCOMA
          | VARIABLE TK_MUL_ASIG TK_NUM TK_PUNTOYCOMA;

VARIABLE: 'variable';
TK_ASIGNACION: ':=';
TK_SUM_ASIG: '+=';
TK_MUL_ASIG: '*=';
TK_PUNTOYCOMA: ';';

TK_NUM: [0-9]+ ('.' [0-9]+)?;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
