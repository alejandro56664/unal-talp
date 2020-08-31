// Generated from C:/ws/unal/temas avanzados de lenguajes de programación/labs/cora/src/main/java\Cora.g4 by ANTLR 4.8
package org.unal.talp.laboratorios.cora.lang.gen;

    import java.util.Map;
    import java.util.HashMap;

    import org.unal.talp.laboratorios.cora.lang.interprete.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoraParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoraParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(CoraParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CoraParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(CoraParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(CoraParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(CoraParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CoraParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CoraParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CoraParser.TermContext ctx);
}