// Generated from C:/ws/unal/master/TALP/labs/practica3/Infix2Prefix/grammar\FunC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunCParser}.
 */
public interface FunCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(FunCParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(FunCParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#tipofun}.
	 * @param ctx the parse tree
	 */
	void enterTipofun(FunCParser.TipofunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#tipofun}.
	 * @param ctx the parse tree
	 */
	void exitTipofun(FunCParser.TipofunContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(FunCParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(FunCParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#lp}.
	 * @param ctx the parse tree
	 */
	void enterLp(FunCParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#lp}.
	 * @param ctx the parse tree
	 */
	void exitLp(FunCParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(FunCParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(FunCParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(FunCParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(FunCParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#m}.
	 * @param ctx the parse tree
	 */
	void enterM(FunCParser.MContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#m}.
	 * @param ctx the parse tree
	 */
	void exitM(FunCParser.MContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#argu}.
	 * @param ctx the parse tree
	 */
	void enterArgu(FunCParser.ArguContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#argu}.
	 * @param ctx the parse tree
	 */
	void exitArgu(FunCParser.ArguContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FunCParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FunCParser.TipoContext ctx);
}