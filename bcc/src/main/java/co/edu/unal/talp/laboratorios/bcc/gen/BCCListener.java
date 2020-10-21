// Generated from C:/ws/unal/master/TALP/unal-talp/bcc/src/main/resources\BCC.g4 by ANTLR 4.8
package co.edu.unal.talp.laboratorios.bcc.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BCCParser}.
 */
public interface BCCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void enterMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void exitMain_prog(BCCParser.Main_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl_list(BCCParser.Fn_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(BCCParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(BCCParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(BCCParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(BCCParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BCCParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BCCParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput(BCCParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput(BCCParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhen(BCCParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code when}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhen(BCCParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterConditional(BCCParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitConditional(BCCParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnless(BCCParser.UnlessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unless}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnless(BCCParser.UnlessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(BCCParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(BCCParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(BCCParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(BCCParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUntil(BCCParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code until}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUntil(BCCParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BCCParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BCCParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(BCCParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(BCCParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dountil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDountil(BCCParser.DountilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dountil}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDountil(BCCParser.DountilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(BCCParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor(BCCParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor(BCCParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNext(BCCParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code next}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNext(BCCParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak(BCCParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak(BCCParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(BCCParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(BCCParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(BCCParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(BCCParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsign(BCCParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsign(BCCParser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSumAsign(BCCParser.SumAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSumAsign(BCCParser.SumAsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterResAsign(BCCParser.ResAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitResAsign(BCCParser.ResAsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterMulAsign(BCCParser.MulAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitMulAsign(BCCParser.MulAsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDivAsign(BCCParser.DivAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDivAsign(BCCParser.DivAsignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterModAsign(BCCParser.ModAsignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modAsign}
	 * labeled alternative in {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitModAsign(BCCParser.ModAsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(BCCParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(BCCParser.LexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void enterNexpr(BCCParser.NexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void exitNexpr(BCCParser.NexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void enterRexpr(BCCParser.RexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void exitRexpr(BCCParser.RexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(BCCParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BCCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BCCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BCCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BCCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactorId(BCCParser.FactorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactorId(BCCParser.FactorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorPreIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactorPreIncrement(BCCParser.FactorPreIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorPreIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactorPreIncrement(BCCParser.FactorPreIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorPosIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactorPosIncrement(BCCParser.FactorPosIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorPosIncrement}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactorPosIncrement(BCCParser.FactorPosIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorLexpr}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactorLexpr(BCCParser.FactorLexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorLexpr}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactorLexpr(BCCParser.FactorLexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFunction}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactorFunction(BCCParser.FactorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFunction}
	 * labeled alternative in {@link BCCParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactorFunction(BCCParser.FactorFunctionContext ctx);
}