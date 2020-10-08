grammar FunC;

/*
S       -> TipoFun L puntoycoma
TipoFun -> void
TipoFun -> int
TipoFun -> float
L       -> F Lp
Lp      -> coma F Lp
Lp      -> epsilon
F       -> ident Lpar A rpar
A       -> void
A       -> Argu M
M       -> coma Argu M
M       -> epsilon
Argu    -> Tipo ident
Argu    -> Tipo asterisco ident
Tipo    -> int
Tipo    -> float
*/

program:    s*;
s:          tipofun l PUNTOYCOMA;
tipofun:    VOID | INT | FLOAT;
l:          f lp;
lp:         COMA f lp | ;
f:          ID LPAR a RPAR;
a:          argu m | VOID;
m:          COMA argu m | ;
argu:       tipo ID | tipo ASTERISCO ID;
tipo:       INT | FLOAT;

PUNTOYCOMA: ';';
VOID:       'void';
INT:        'int';
FLOAT:      'float';
COMA:       ',';
ASTERISCO:  '*';
LPAR:       '(';
RPAR:       ')';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

COMMENTARIO: '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines