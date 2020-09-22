package co.edu.talp.laboratorios.bcc;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BBCLexerTest {

    //debería tomar un programa de ejemplo del disco y compararlo
    //la salida experada.

    final String path = "src/test/java/co/edu/talp/laboratorios/bcc/";

    public void run(){

        compareTest("test1");
        compareTest("test2");
        compareTest("test3");
        compareTest("test4");
    }

    public void compareTest(String name){
        System.out.println("\nPrueba: " + name);
        compareLexerOutputFromFiles(path + name +".bcc", path + name + "_output.txt");
    }

    public void compareLexerOutputFromFiles(String sourceFile, String outputFile){
        compareLexerOutput(loadFromFile(sourceFile), loadFromFile(outputFile));
    }

    public void compareLexerOutput(String source, String outputExpected){
        BCCLexer bccLexer = new BCCLexer(source);
        String outputLexer = bccLexer.analyze();
        compareText(outputLexer, outputExpected);
    }

    private void compareText(String output, String outputExpected) {
        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diffs = dmp.diffMain(output, outputExpected, false);
        List<DiffMatchPatch.Diff> filteredDiffs = diffs.stream().filter(Diff -> Diff.operation != DiffMatchPatch.Operation.EQUAL).collect(Collectors.toList());


        if(filteredDiffs.size() > 0){
            System.out.println("salida del lexer: ");
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
