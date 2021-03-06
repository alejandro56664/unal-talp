package org.unal.talp.laboratorios.cora.lang.interprete;

import java.util.Map;

public class Log implements ASTNode {
    private ASTNode data;

    public Log(ASTNode data) {
        super();
        this.data = data;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        System.out.println(data.execute(symbolTable));
        return null;
    }
}
