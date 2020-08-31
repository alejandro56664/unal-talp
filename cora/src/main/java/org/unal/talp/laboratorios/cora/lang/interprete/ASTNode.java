package org.unal.talp.laboratorios.cora.lang.interprete;

import java.util.Map;

public interface ASTNode {

    public Object execute(Map<String, Object> symbolTable);
}
