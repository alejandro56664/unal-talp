package co.edu.talp.laboratorios.bcc;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class BBCLexerTest {

    //debería tomar un programa de ejemplo del disco y compararlo
    //la salida experada.

    final String path = "src/test/java/co/edu/talp/laboratorios/bcc/";

    public void run(){
        compareTest("test3");
        compareTest("test2");
        compareTest("test1");
    }

    public void compareTest(String name){
        System.out.println("Prueba: " + name);
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
        LinkedList<DiffMatchPatch.Diff> diff = dmp.diffMain(output, outputExpected, false);
        System.out.println("salida del lexer: ");
        System.out.println(output);
        System.out.println("salida esperada: ");
        System.out.println(outputExpected);
        System.out.println("diferencias: ");
        System.out.print(diff);
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
