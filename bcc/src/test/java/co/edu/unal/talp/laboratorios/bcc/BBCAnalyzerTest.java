package co.edu.unal.talp.laboratorios.bcc;

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
    //la salida experada.

    final String path = "src/test/java/co/edu/unal/talp/laboratorios/bcc/";

    public void run(){

        compareParserOutput("test9");
        /*
        compareLexerOutput("testx");
        compareLexerOutput("test1");
        compareLexerOutput("test2");
        compareLexerOutput("test3");
        compareLexerOutput("test4");
        */

    }



    public void compareParserOutput(String name){
        System.out.println("\nPrueba parser: " + name);
        //String outputExpected = loadFromFile(path + name + "_output.txt");
        String source = loadFromFile(path + name +".bcc");
        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(source);
        bccAnalyzer.parse();
        //compareText(outputLexer, outputExpected);
    }

    public void compareLexerOutput(String name){
        System.out.println("\nPrueba lexer: " + name);
        String outputExpected = loadFromFile(path + name + "_output.txt");
        String source = loadFromFile(path + name +".bcc");
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

    private String loadFromFile(String sourceFile) {
        String sourceContent = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            sourceContent = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sourceContent;
    }


}
