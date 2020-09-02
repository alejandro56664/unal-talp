package org.unal.talp.laboratorios.cora.lang.interprete.logica;

import org.unal.talp.laboratorios.cora.lang.interprete.ASTNode;

import java.util.Map;

public class Not implements ASTNode {
    private ASTNode operand1;

    public Not(ASTNode operand1) {
        super();
        this.operand1 = operand1;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return !(boolean)operand1.execute(symbolTable);
    }
}

