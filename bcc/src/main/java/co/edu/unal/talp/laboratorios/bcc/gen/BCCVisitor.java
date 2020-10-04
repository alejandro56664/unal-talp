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
	 * Visit a parse tree produced by {@link BCCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BCCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#stmt_asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_asign(BCCParser.Stmt_asignContext ctx);
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
}