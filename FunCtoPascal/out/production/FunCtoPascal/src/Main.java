import grammar.FunCLexer;
import grammar.FunCParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import static java.lang.System.in;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
        FunCLexer lexer;
	    if (args.length>0) {
            lexer = new FunCLexer(CharStreams.fromFileName(args[0]));
        } else {
            lexer = new FunCLexer(CharStreams.fromStream(in));
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FunCParser parser = new FunCParser(tokens);

        ParseTree tree = parser.program(); // begin parsing at init rule

        ParseTreeWalker walker = new ParseTreeWalker();

        //System.out.println(tree.toStringTree(parser));
        walker.walk(new FunCToPascal(), tree);


	}
}
