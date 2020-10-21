// Generated from C:/ws/unal/master/TALP/unal-talp/bcc/src/main/resources\BCC.g4 by ANTLR 4.8
package co.edu.unal.talp.laboratorios.bcc.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BCCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BCCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(BCCParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BCCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BCCParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(BCCParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(BCCParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless(BCCParser.UnlessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(BCCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(BCCParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(BCCParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BCCParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(BCCParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dountil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDountil(BCCParser.DountilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(BCCParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(BCCParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(BCCParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(BCCParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(BCCParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(BCCParser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumAsign(BCCParser.SumAsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResAsign(BCCParser.ResAsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAsign(BCCParser.MulAsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAsign(BCCParser.DivAsignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAsign(BCCParser.ModAsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(BCCParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(BCCParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(BCCParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BCCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BCCParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorId(BCCParser.FactorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorPreIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPreIncrement(BCCParser.FactorPreIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorPosIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPosIncrement(BCCParser.FactorPosIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorLexpr}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorLexpr(BCCParser.FactorLexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorFunction}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFunction(BCCParser.FactorFunctionContext ctx);
}