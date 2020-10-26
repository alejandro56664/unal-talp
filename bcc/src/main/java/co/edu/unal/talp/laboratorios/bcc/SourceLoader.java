package co.edu.unal.talp.laboratorios.bcc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SourceLoader {

    public String loadFromConsole() {
        Scanner sin = new Scanner(System.in);
        CharSequence end1 = "^D";
        StringBuilder sb = new StringBuilder();
        while(sin.hasNextLine())
        {
            String nextLine = sin.nextLine();

            if( (nextLine.contains(end1)) == true) break;
            sb.append(nextLine).append('\n');
        }

        return sb.toString();
    }
    public String loadFromFile(String sourceFile) {
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
