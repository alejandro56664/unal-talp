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
	 * Enter a parse tree produced by {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(BCCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(BCCParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#stmt_asign}.
	 * @param ctx the parse tree
	 */
	void enterStmt_asign(BCCParser.Stmt_asignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#stmt_asign}.
	 * @param ctx the parse tree
	 */
	void exitStmt_asign(BCCParser.Stmt_asignContext ctx);
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
}