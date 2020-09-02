// Generated from C:/ws/unal/temas avanzados de lenguajes de programación/unal-talp/cora/src/main/java\Cora.g4 by ANTLR 4.8
package org.unal.talp.laboratorios.cora.lang.gen;

    import java.util.Map;
    import java.util.HashMap;

    import org.unal.talp.laboratorios.cora.lang.interprete.aritmetica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.logica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoraParser}.
 */
public interface CoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoraParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(CoraParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(CoraParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CoraParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CoraParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(CoraParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(CoraParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(CoraParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(CoraParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(CoraParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(CoraParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#nexpression}.
	 * @param ctx the parse tree
	 */
	void enterNexpression(CoraParser.NexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#nexpression}.
	 * @param ctx the parse tree
	 */
	void exitNexpression(CoraParser.NexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoraParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CoraParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CoraParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CoraParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CoraParser.TermContext ctx);
}