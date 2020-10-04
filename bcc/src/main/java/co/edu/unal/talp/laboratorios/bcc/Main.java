package co.edu.unal.talp.laboratorios.bcc;
//Recuerde remover el paquete para subirlo en UNCode

import java.util.Scanner;

public class Main
{
    public static void main( String[] args) throws Exception
    {
        /*
            El programa debe recibir por la entrada estándar el código fuente de un programa escrito
            en el lenguaje de programación bcc. Para evaluar el analizador léxico de forma automática
            su programa debe realizar el análisis léxico de la entrada dada y generar la salida adecuada,
            de acuerdo a las especificaciones de este documento. Las salidas se deben generar por la
            salida estándar.
         */

        if (args.length>0) {
            // procesar entrada
            System.out.println("BCC Demo (Presiona Ctrl+D para terminar o en windows Ctrl+Z y luego Ctrl+D)");
            System.out.print(">>>");
        }



        Scanner sin = new Scanner(System.in);
        CharSequence end1 = "^D";
        StringBuilder sb = new StringBuilder();
        while(sin.hasNextLine())
        {
            String nextLine = sin.nextLine();

            if( (nextLine.contains(end1)) == true) break;
            sb.append(nextLine).append('\n');
        }

        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(sb.toString());

        //para analizar lexico
        bccAnalyzer.analyzeLexicon();
    }
}