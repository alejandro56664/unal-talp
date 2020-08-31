package org.unal.talp.laboratorios.cora.lang.interprete;

import java.util.Map;

public class VarAssign implements ASTNode {
    private String name;
    private ASTNode expression;

    public VarAssign(String name, ASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(name, expression.execute(symbolTable));
        return null;
    }
}
