package co.edu.unal.talp.laboratorios.bcc;

import co.edu.unal.talp.laboratorios.bcc.interpreter.BCCTreeBasedInterpreter;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BBCAnalyzerTest {

    //debería tomar un programa de ejemplo del disco y compararlo
    //la salida esperada.

    final String path = "src/test/java/co/edu/unal/talp/laboratorios/bcc/fixtures";

    SourceLoader sourceLoader = new SourceLoader();
    public void run(){
        //interpret("repeat_basic");
        //interpret("repeat_vars");
        //interpret("fun_basic");
        //interpret("fun_basic2");
        //interpret("repeat_fun");
        //interpret("repeat_for");
        //interpret("example_paper1");
        //interpret("example_paper2");
        //interpret("factorial");
        interpret("fibonacci_iterativo");
        //interpret("repeat_fun_input");
        /*
        compareLexerOutput("test1");
        compareLexerOutput("test2");
        compareLexerOutput("test3");
        compareLexerOutput("test4");
        */

        /*
        compareParserOutput("test5");
        compareParserOutput("test6");
        compareParserOutput("test7");
        compareParserOutput("test8");
        compareParserOutput("test9");
         */

    }

    public void interpret(String name){
        System.out.println("\nPrueba interpreter: " + name);
        String source = sourceLoader.loadFromFile("src/test/java/co/edu/unal/talp/laboratorios/bcc/" + name +".bcc");
        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(source);
        BCCTreeBasedInterpreter<Object> bccInterpreter = new BCCTreeBasedInterpreter<>();
        bccInterpreter.visit(bccAnalyzer.parse());
    }


    public void compareParserOutput(String name){
        System.out.println("\nPrueba parser: " + name);
        //String outputExpected = loadFromFile(path + name + "_output.txt");
        String source = sourceLoader.loadFromFile(path + name +".bcc");
        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(source);
        bccAnalyzer.parse();
        //compareText(outputLexer, outputExpected);
    }

    public void compareLexerOutput(String name){
        System.out.println("\nPrueba lexer: " + name);
        String outputExpected = sourceLoader.loadFromFile(path + name + "_output.txt");
        String source = sourceLoader.loadFromFile(path + name +".bcc");
        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(source);
        String outputLexer = bccAnalyzer.analyzeLexicon();
        compareText(outputLexer, outputExpected);
    }

    private void compareText(String output, String outputExpected) {
        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diffs = dmp.diffMain(output, outputExpected, false);
        List<DiffMatchPatch.Diff> filteredDiffs = diffs.stream().filter(Diff -> Diff.operation != DiffMatchPatch.Operation.EQUAL).collect(Collectors.toList());


        if(filteredDiffs.size() > 0){
            System.out.println("salida del programa: ");
            System.out.println(output);
            System.out.println("salida esperada: ");
            System.out.println(outputExpected);
            System.out.println("diferencias: ");
            for (DiffMatchPatch.Diff diff: diffs) {
                System.out.println(diff);
            }
        } else {
            System.out.println("La salida esperada es igual a la del lexer ");
        }


    }

}
