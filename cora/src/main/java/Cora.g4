grammar Cora;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;

    import org.unal.talp.laboratorios.cora.lang.interprete.aritmetica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.logica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.*;
}

@parser::members {

}

program: PROGRAM ID BRACKET_OPEN
        {
            List<ASTNode> body = new ArrayList<ASTNode>();
            Map<String, Object> symbolTable = new HashMap<String, Object>();
        }
        ( sentence { body.add($sentence.node); })*
        BRACKET_CLOSE
        {
            for(ASTNode n: body) {
                n.execute(symbolTable);
            }
        };

sentence returns [ASTNode node]:
log { $node = $log.node; }
| conditional { $node = $conditional.node; }
| var_decl { $node = $var_decl.node; }
| var_assign { $node = $var_assign.node; }
;

var_decl returns [ASTNode node]:
            VAR ID { $node = new VarDecl($ID.text); }
            ;
var_assign returns [ASTNode node]:
            ID ASSIGN nexpression
         { $node = new VarAssign($ID.text, $nexpression.node); };

log returns [ASTNode node]: LOG nexpression
         { $node = new Log($nexpression.node); };

conditional returns [ASTNode node]:
             IF PAR_OPEN nexpression PAR_CLOSE
             {
                List<ASTNode> body = new ArrayList<ASTNode>();
             }
             BRACKET_OPEN ( s1=sentence { body.add($s1.node); } )* BRACKET_CLOSE
             ELSE
             {
                 List<ASTNode> elseBody = new ArrayList<ASTNode>();
             }
             BRACKET_OPEN ( s2=sentence { elseBody.add($s2.node); } )* BRACKET_CLOSE
             {
                $node = new If($nexpression.node, body, elseBody);
             };
nexpression returns [ASTNode node]:
            NOT expression {  $node = new Not($expression.node); }
            | expression { $node = $expression.node; };

expression returns [ASTNode node]:
            t1 = factor { $node = $t1.node; }
            (
                PLUS    t2 = factor { $node = new Addition($node, $t2.node); }
                | MINUS t3 = factor { $node = new Substraction($node, $t3.node); }
                | OR    t4 = factor { $node = new Or($node, $t4.node); }
            )*;

factor returns [ASTNode node]:
            t1 = term { $node = $t1.node; }
            (
                MULT    t2 = term { $node = new Multiplication($node, $t2.node); }
                | DIV   t3 = factor { $node = new Division($node, $t3.node); }
                | AND   t4 = factor { $node = new And($node, $t4.node); }
            )*;

term returns [ASTNode node]:
            NUMBER { $node = new Constant(Integer.parseInt($NUMBER.text)); }
            | ID { $node = new VarRef($ID.text); }
            | BOOLEAN { $node = new Constant(Boolean.parseBoolean($BOOLEAN.text)); }
            | PAR_OPEN nexpression { $node =  $nexpression.node; } PAR_CLOSE;

PROGRAM: 'program';
VAR: 'var';
LOG: 'log';
IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: 'and';
OR: 'or';
NOT: 'not';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';


BOOLEAN: 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9]+;


WS: [ \t\n\r]+ -> skip;

COMMENT: [#+^\n]* -> skip;