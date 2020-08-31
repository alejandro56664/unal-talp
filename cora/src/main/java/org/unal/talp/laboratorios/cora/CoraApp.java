package org.unal.talp.laboratorios.cora;


import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.unal.talp.laboratorios.cora.lang.CoraCustomVisitor;
import org.unal.talp.laboratorios.cora.lang.gen.*;

import java.io.IOException;

public class CoraApp {

    static String EXTENSION = "cora";

    public static void main(String[] args) throws IOException {
        String program = args.length > 1 ? args[1] : "src/test/Cora/test2." + EXTENSION;
        CoraLexer lexer = new CoraLexer(new ANTLRFileStream(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoraParser parser = new CoraParser(tokens);

        CoraParser.ProgramContext tree = parser.program();

        CoraCustomVisitor visitor = new CoraCustomVisitor();
        visitor.visit(tree);
    }
}
