package co.edu.unal.talp.laboratorios.bcc;
//Recuerde remover el paquete para subirlo en UNCode

import co.edu.unal.talp.laboratorios.bcc.interpreter.BCCTreeBasedInterpreter;

import org.apache.commons.cli.*;

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

        SourceLoader sourceLoader = new SourceLoader();

        if (args.length>0) {
            // procesar entrada
            CommandLine cmd = configureCommandLine(args);

            System.out.println("BCC Demo (Presiona Ctrl+D para terminar o en windows Ctrl+Z y luego Ctrl+D)");

            String isInteractive = cmd.getOptionValue("interactive");
            String sourceFilePath = cmd.getOptionValue("source");

            if(isInteractive != null) {
                System.out.print(isInteractive);
                System.out.print(">>>");
                interpret(sourceLoader.loadFromConsole());

            } else if(sourceFilePath !=null){
                interpret(sourceLoader.loadFromFile(sourceFilePath));
            }


        } else {
            interpret(sourceLoader.loadFromConsole());
        }

    }

    //TODO agregar opciones para hacer analisis lexico, sintactico y semantico
    private static CommandLine configureCommandLine(String[] args) {
        Options options = new Options();

        Option interactive = new Option("i", "interactive", false, "interactive function");
        interactive.setRequired(false);
        options.addOption(interactive);

        Option source = new Option("s", "source", true, "source input file");
        source.setRequired(false);
        options.addOption(source);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);
            cmd = null;
            System.exit(1);
        }
        return cmd;
    }

    private static void interpret(String source){
        BCCAnalyzer bccAnalyzer = new BCCAnalyzer(source);
        BCCTreeBasedInterpreter<Object> interpreter = new BCCTreeBasedInterpreter<>();
        interpreter.visit(bccAnalyzer.parse());
    }
}