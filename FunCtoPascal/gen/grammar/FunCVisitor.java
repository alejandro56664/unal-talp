// Generated from C:/ws/unal/master/TALP/labs/practica3/Infix2Prefix/grammar\FunC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(FunCParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#tipofun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipofun(FunCParser.TipofunContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL(FunCParser.LContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLp(FunCParser.LpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(FunCParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(FunCParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM(FunCParser.MContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#argu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgu(FunCParser.ArguContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunCParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(FunCParser.TipoContext ctx);
}