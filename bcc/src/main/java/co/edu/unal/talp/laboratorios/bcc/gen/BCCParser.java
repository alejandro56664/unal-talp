// Generated from C:/ws/unal/master/TALP/unal-talp/bcc/src/main/resources\BCC.g4 by ANTLR 4.8
package co.edu.unal.talp.laboratorios.bcc.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_PRINT=1, TK_INPUT=2, TK_WHILE=3, TK_WHEN=4, TK_IF=5, TK_UNLESS=6, TK_RETURN=7, 
		TK_UNTIL=8, TK_LOOP=9, TK_DO=10, TK_REPEAT=11, TK_FOR=12, TK_END=13, TK_NEXT=14, 
		TK_BREAK=15, TK_BOOLT=16, TK_NUMT=17, TK_VAR=18, TK_AND=19, TK_OR=20, 
		TK_NOT=21, TK_ELSE=22, TK_FUNCTION=23, TRUE=24, FALSE=25, TK_MENOR=26, 
		TK_MENOR_IGUAL=27, TK_MAYOR=28, TK_MAYOR_IGUAL=29, TK_IGUALDAD=30, TK_DIFERENTE=31, 
		TK_ASIGNACION=32, TK_MAS=33, TK_MENOS=34, TK_MUL=35, TK_DIV=36, TK_MOD=37, 
		TK_SUM_ASIG=38, TK_RES_ASIG=39, TK_MUL_ASIG=40, TK_DIV_ASIG=41, TK_MOD_ASIG=42, 
		TK_INCREMENTO=43, TK_DECREMENTO=44, TK_LLAVE_IZQ=45, TK_LLAVE_DER=46, 
		TK_PAR_IZQ=47, TK_PAR_DER=48, TK_COMA=49, TK_PUNTOYCOMA=50, TK_DOSPUNTOS=51, 
		ID=52, FID=53, TK_NUM=54, COMMENTARIO=55, WS=56;
	public static final int
		RULE_programa = 0, RULE_main_prog = 1, RULE_fn_decl_list = 2, RULE_stmt_block = 3, 
		RULE_var_decl = 4, RULE_datatype = 5, RULE_stmt = 6, RULE_asigns = 7, 
		RULE_lexpr = 8, RULE_nexpr = 9, RULE_rexpr = 10, RULE_simple_expr = 11, 
		RULE_term = 12, RULE_factor = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "main_prog", "fn_decl_list", "stmt_block", "var_decl", "datatype", 
			"stmt", "asigns", "lexpr", "nexpr", "rexpr", "simple_expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'input'", "'while'", "'when'", "'if'", "'unless'", 
			"'return'", "'until'", "'loop'", "'do'", "'repeat'", "'for'", "'end'", 
			"'next'", "'break'", "'bool'", "'num'", "'var'", "'and'", "'or'", "'not'", 
			"'else'", "'function'", "'true'", "'false'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "':='", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "','", 
			"';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_PRINT", "TK_INPUT", "TK_WHILE", "TK_WHEN", "TK_IF", "TK_UNLESS", 
			"TK_RETURN", "TK_UNTIL", "TK_LOOP", "TK_DO", "TK_REPEAT", "TK_FOR", "TK_END", 
			"TK_NEXT", "TK_BREAK", "TK_BOOLT", "TK_NUMT", "TK_VAR", "TK_AND", "TK_OR", 
			"TK_NOT", "TK_ELSE", "TK_FUNCTION", "TRUE", "FALSE", "TK_MENOR", "TK_MENOR_IGUAL", 
			"TK_MAYOR", "TK_MAYOR_IGUAL", "TK_IGUALDAD", "TK_DIFERENTE", "TK_ASIGNACION", 
			"TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "TK_SUM_ASIG", "TK_RES_ASIG", 
			"TK_MUL_ASIG", "TK_DIV_ASIG", "TK_MOD_ASIG", "TK_INCREMENTO", "TK_DECREMENTO", 
			"TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_PAR_IZQ", "TK_PAR_DER", "TK_COMA", 
			"TK_PUNTOYCOMA", "TK_DOSPUNTOS", "ID", "FID", "TK_NUM", "COMMENTARIO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BCCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public List<Fn_decl_listContext> fn_decl_list() {
			return getRuleContexts(Fn_decl_listContext.class);
		}
		public Fn_decl_listContext fn_decl_list(int i) {
			return getRuleContext(Fn_decl_listContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(28);
				fn_decl_list();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			main_prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(BCCParser.TK_END, 0); }
		public List<TerminalNode> TK_VAR() { return getTokens(BCCParser.TK_VAR); }
		public TerminalNode TK_VAR(int i) {
			return getToken(BCCParser.TK_VAR, i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> TK_PUNTOYCOMA() { return getTokens(BCCParser.TK_PUNTOYCOMA); }
		public TerminalNode TK_PUNTOYCOMA(int i) {
			return getToken(BCCParser.TK_PUNTOYCOMA, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterMain_prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitMain_prog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitMain_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_VAR) {
				{
				{
				setState(36);
				match(TK_VAR);
				setState(37);
				var_decl();
				setState(38);
				match(TK_PUNTOYCOMA);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHILE) | (1L << TK_WHEN) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_DO) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				stmt();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(TK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_decl_listContext extends ParserRuleContext {
		public TerminalNode TK_FUNCTION() { return getToken(BCCParser.TK_FUNCTION, 0); }
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public TerminalNode TK_DOSPUNTOS() { return getToken(BCCParser.TK_DOSPUNTOS, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_VAR() { return getToken(BCCParser.TK_VAR, 0); }
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFn_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFn_decl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TK_FUNCTION);
			setState(54);
			match(FID);
			setState(55);
			match(TK_DOSPUNTOS);
			setState(56);
			datatype();
			setState(57);
			match(TK_PAR_IZQ);
			setState(58);
			var_decl();
			setState(59);
			match(TK_PAR_DER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(60);
				match(TK_VAR);
				setState(61);
				var_decl();
				setState(62);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(66);
			stmt_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQ() { return getToken(BCCParser.TK_LLAVE_IZQ, 0); }
		public TerminalNode TK_LLAVE_DER() { return getToken(BCCParser.TK_LLAVE_DER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt_block);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(TK_LLAVE_IZQ);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					stmt();
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHILE) | (1L << TK_WHEN) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_DO) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << ID))) != 0) );
				setState(74);
				match(TK_LLAVE_DER);
				}
				break;
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHILE:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BCCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BCCParser.ID, i);
		}
		public List<TerminalNode> TK_DOSPUNTOS() { return getTokens(BCCParser.TK_DOSPUNTOS); }
		public TerminalNode TK_DOSPUNTOS(int i) {
			return getToken(BCCParser.TK_DOSPUNTOS, i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(TK_DOSPUNTOS);
			setState(81);
			datatype();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(82);
				match(TK_COMA);
				setState(83);
				match(ID);
				setState(84);
				match(TK_DOSPUNTOS);
				setState(85);
				datatype();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode TK_NUMT() { return getToken(BCCParser.TK_NUMT, 0); }
		public TerminalNode TK_BOOLT() { return getToken(BCCParser.TK_BOOLT, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==TK_BOOLT || _la==TK_NUMT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextContext extends StmtContext {
		public TerminalNode TK_NEXT() { return getToken(BCCParser.TK_NEXT, 0); }
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public NextContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalContext extends StmtContext {
		public TerminalNode TK_IF() { return getToken(BCCParser.TK_IF, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode TK_ELSE() { return getToken(BCCParser.TK_ELSE, 0); }
		public ConditionalContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StmtContext {
		public TerminalNode TK_BREAK() { return getToken(BCCParser.TK_BREAK, 0); }
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StmtContext {
		public TerminalNode TK_FOR() { return getToken(BCCParser.TK_FOR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public AsignsContext asigns() {
			return getRuleContext(AsignsContext.class,0);
		}
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public ForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public TerminalNode TK_WHILE() { return getToken(BCCParser.TK_WHILE, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhenContext extends StmtContext {
		public TerminalNode TK_WHEN() { return getToken(BCCParser.TK_WHEN, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public WhenContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DountilContext extends StmtContext {
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_UNTIL() { return getToken(BCCParser.TK_UNTIL, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public DountilContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDountil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDountil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDountil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DowhileContext extends StmtContext {
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_WHILE() { return getToken(BCCParser.TK_WHILE, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public DowhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends StmtContext {
		public TerminalNode TK_INPUT() { return getToken(BCCParser.TK_INPUT, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public InputContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StmtContext {
		public TerminalNode TK_PRINT() { return getToken(BCCParser.TK_PRINT, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public PrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignContext extends StmtContext {
		public AsignsContext asigns() {
			return getRuleContext(AsignsContext.class,0);
		}
		public AsignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnlessContext extends StmtContext {
		public TerminalNode TK_UNLESS() { return getToken(BCCParser.TK_UNLESS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public UnlessContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitUnless(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends StmtContext {
		public TerminalNode TK_LOOP() { return getToken(BCCParser.TK_LOOP, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public LoopContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends StmtContext {
		public TerminalNode TK_REPEAT() { return getToken(BCCParser.TK_REPEAT, 0); }
		public TerminalNode TK_NUM() { return getToken(BCCParser.TK_NUM, 0); }
		public TerminalNode TK_DOSPUNTOS() { return getToken(BCCParser.TK_DOSPUNTOS, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public RepeatContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UntilContext extends StmtContext {
		public TerminalNode TK_UNTIL() { return getToken(BCCParser.TK_UNTIL, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public UntilContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StmtContext {
		public TerminalNode TK_RETURN() { return getToken(BCCParser.TK_RETURN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public ReturnContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(TK_PRINT);
				setState(94);
				lexpr();
				setState(95);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(TK_INPUT);
				setState(98);
				match(ID);
				setState(99);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				_localctx = new WhenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(TK_WHEN);
				setState(101);
				match(TK_PAR_IZQ);
				setState(102);
				lexpr();
				setState(103);
				match(TK_PAR_DER);
				setState(104);
				match(TK_DO);
				setState(105);
				stmt_block();
				}
				break;
			case 4:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(TK_IF);
				setState(108);
				match(TK_PAR_IZQ);
				setState(109);
				lexpr();
				setState(110);
				match(TK_PAR_DER);
				setState(111);
				match(TK_DO);
				setState(112);
				stmt_block();
				setState(113);
				match(TK_ELSE);
				setState(114);
				stmt_block();
				}
				break;
			case 5:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(TK_UNLESS);
				setState(117);
				match(TK_PAR_IZQ);
				setState(118);
				lexpr();
				setState(119);
				match(TK_PAR_DER);
				setState(120);
				match(TK_DO);
				setState(121);
				stmt_block();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(TK_WHILE);
				setState(124);
				match(TK_PAR_IZQ);
				setState(125);
				lexpr();
				setState(126);
				match(TK_PAR_DER);
				setState(127);
				match(TK_DO);
				setState(128);
				stmt_block();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(TK_RETURN);
				setState(131);
				lexpr();
				setState(132);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				_localctx = new UntilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(TK_UNTIL);
				setState(135);
				match(TK_PAR_IZQ);
				setState(136);
				lexpr();
				setState(137);
				match(TK_PAR_DER);
				setState(138);
				match(TK_DO);
				setState(139);
				stmt_block();
				}
				break;
			case 9:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(TK_LOOP);
				setState(142);
				stmt_block();
				}
				break;
			case 10:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				match(TK_DO);
				setState(144);
				stmt_block();
				setState(145);
				match(TK_WHILE);
				setState(146);
				match(TK_PAR_IZQ);
				setState(147);
				lexpr();
				setState(148);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				_localctx = new DountilContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(150);
				match(TK_DO);
				setState(151);
				stmt_block();
				setState(152);
				match(TK_UNTIL);
				setState(153);
				match(TK_PAR_IZQ);
				setState(154);
				lexpr();
				setState(155);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				match(TK_REPEAT);
				setState(158);
				match(TK_NUM);
				setState(159);
				match(TK_DOSPUNTOS);
				setState(160);
				stmt_block();
				}
				break;
			case 13:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(161);
				match(TK_FOR);
				setState(162);
				match(TK_PAR_IZQ);
				setState(163);
				asigns();
				setState(164);
				lexpr();
				setState(165);
				match(TK_PUNTOYCOMA);
				setState(166);
				lexpr();
				setState(167);
				match(TK_PAR_DER);
				setState(168);
				match(TK_DO);
				setState(169);
				stmt_block();
				}
				break;
			case 14:
				_localctx = new NextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(171);
				match(TK_NEXT);
				setState(172);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(173);
				match(TK_BREAK);
				setState(174);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				_localctx = new AsignContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(175);
				asigns();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(BCCParser.TK_ASIGNACION, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public TerminalNode TK_SUM_ASIG() { return getToken(BCCParser.TK_SUM_ASIG, 0); }
		public TerminalNode TK_RES_ASIG() { return getToken(BCCParser.TK_RES_ASIG, 0); }
		public TerminalNode TK_MUL_ASIG() { return getToken(BCCParser.TK_MUL_ASIG, 0); }
		public TerminalNode TK_DIV_ASIG() { return getToken(BCCParser.TK_DIV_ASIG, 0); }
		public TerminalNode TK_MOD_ASIG() { return getToken(BCCParser.TK_MOD_ASIG, 0); }
		public AsignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterAsigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitAsigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitAsigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignsContext asigns() throws RecognitionException {
		AsignsContext _localctx = new AsignsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asigns);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				setState(179);
				match(TK_ASIGNACION);
				setState(180);
				lexpr();
				setState(181);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(ID);
				setState(184);
				match(TK_SUM_ASIG);
				setState(185);
				lexpr();
				setState(186);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(ID);
				setState(189);
				match(TK_RES_ASIG);
				setState(190);
				lexpr();
				setState(191);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(ID);
				setState(194);
				match(TK_MUL_ASIG);
				setState(195);
				lexpr();
				setState(196);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(ID);
				setState(199);
				match(TK_DIV_ASIG);
				setState(200);
				lexpr();
				setState(201);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(ID);
				setState(204);
				match(TK_MOD_ASIG);
				setState(205);
				lexpr();
				setState(206);
				match(TK_PUNTOYCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(BCCParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(BCCParser.TK_AND, i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(BCCParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(BCCParser.TK_OR, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitLexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			nexpr();
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(211);
					match(TK_AND);
					setState(212);
					nexpr();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(218);
					match(TK_OR);
					setState(219);
					nexpr();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(BCCParser.TK_NOT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitNexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nexpr);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(TK_NOT);
				setState(228);
				match(TK_PAR_IZQ);
				setState(229);
				lexpr();
				setState(230);
				match(TK_PAR_DER);
				}
				break;
			case TRUE:
			case FALSE:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case TK_PAR_IZQ:
			case ID:
			case FID:
			case TK_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				rexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RexprContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode TK_MENOR() { return getToken(BCCParser.TK_MENOR, 0); }
		public TerminalNode TK_IGUALDAD() { return getToken(BCCParser.TK_IGUALDAD, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(BCCParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR() { return getToken(BCCParser.TK_MAYOR, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(BCCParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_DIFERENTE() { return getToken(BCCParser.TK_DIFERENTE, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			simple_expr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE))) != 0)) {
				{
				setState(236);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				simple_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TK_MAS() { return getTokens(BCCParser.TK_MAS); }
		public TerminalNode TK_MAS(int i) {
			return getToken(BCCParser.TK_MAS, i);
		}
		public List<TerminalNode> TK_MENOS() { return getTokens(BCCParser.TK_MENOS); }
		public TerminalNode TK_MENOS(int i) {
			return getToken(BCCParser.TK_MENOS, i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			term();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				term();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TK_MUL() { return getTokens(BCCParser.TK_MUL); }
		public TerminalNode TK_MUL(int i) {
			return getToken(BCCParser.TK_MUL, i);
		}
		public List<TerminalNode> TK_DIV() { return getTokens(BCCParser.TK_DIV); }
		public TerminalNode TK_DIV(int i) {
			return getToken(BCCParser.TK_DIV, i);
		}
		public List<TerminalNode> TK_MOD() { return getTokens(BCCParser.TK_MOD); }
		public TerminalNode TK_MOD(int i) {
			return getToken(BCCParser.TK_MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			factor();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				factor();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TK_NUM() { return getToken(BCCParser.TK_NUM, 0); }
		public TerminalNode TRUE() { return getToken(BCCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BCCParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(TK_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(ID);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(TK_PAR_IZQ);
				setState(265);
				lexpr();
				setState(266);
				match(TK_PAR_DER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(FID);
				setState(269);
				match(TK_PAR_IZQ);
				{
				setState(270);
				lexpr();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(271);
					match(TK_COMA);
					setState(272);
					lexpr();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(278);
				match(TK_PAR_DER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\7\3\61\n\3\f\3\16\3"+
		"\64\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4"+
		"\3\4\3\4\3\5\3\5\6\5I\n\5\r\5\16\5J\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t\3\n\3\n\3\n\7\n\u00d8\n\n\f\n\16"+
		"\n\u00db\13\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\5\n\u00e4\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ec\n\13\3\f\3\f\3\f\5\f\u00f1\n"+
		"\f\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\16\3\16\3\16\7\16\u00fe"+
		"\n\16\f\16\16\16\u0101\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0114\n\17\f\17\16\17"+
		"\u0117\13\17\3\17\3\17\5\17\u011b\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\7\3\2\22\23\3\2\34!\3\2#$\3\2%\'\3\2-.\2\u0138\2!\3"+
		"\2\2\2\4,\3\2\2\2\6\67\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\f]\3\2\2\2\16\u00b2"+
		"\3\2\2\2\20\u00d2\3\2\2\2\22\u00d4\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3"+
		"\2\2\2\30\u00f2\3\2\2\2\32\u00fa\3\2\2\2\34\u011a\3\2\2\2\36 \5\6\4\2"+
		"\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$"+
		"%\5\4\3\2%\3\3\2\2\2&\'\7\24\2\2\'(\5\n\6\2()\7\64\2\2)+\3\2\2\2*&\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\5\16\b\2"+
		"\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64"+
		"\62\3\2\2\2\65\66\7\17\2\2\66\5\3\2\2\2\678\7\31\2\289\7\67\2\29:\7\65"+
		"\2\2:;\5\f\7\2;<\7\61\2\2<=\5\n\6\2=B\7\62\2\2>?\7\24\2\2?@\5\n\6\2@A"+
		"\7\64\2\2AC\3\2\2\2B>\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\b\5\2E\7\3\2\2\2"+
		"FH\7/\2\2GI\5\16\b\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2"+
		"LM\7\60\2\2MP\3\2\2\2NP\5\16\b\2OF\3\2\2\2ON\3\2\2\2P\t\3\2\2\2QR\7\66"+
		"\2\2RS\7\65\2\2SZ\5\f\7\2TU\7\63\2\2UV\7\66\2\2VW\7\65\2\2WY\5\f\7\2X"+
		"T\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\t\2"+
		"\2\2^\r\3\2\2\2_`\7\3\2\2`a\5\22\n\2ab\7\64\2\2b\u00b3\3\2\2\2cd\7\4\2"+
		"\2de\7\66\2\2e\u00b3\7\64\2\2fg\7\6\2\2gh\7\61\2\2hi\5\22\n\2ij\7\62\2"+
		"\2jk\7\f\2\2kl\5\b\5\2l\u00b3\3\2\2\2mn\7\7\2\2no\7\61\2\2op\5\22\n\2"+
		"pq\7\62\2\2qr\7\f\2\2rs\5\b\5\2st\7\30\2\2tu\5\b\5\2u\u00b3\3\2\2\2vw"+
		"\7\b\2\2wx\7\61\2\2xy\5\22\n\2yz\7\62\2\2z{\7\f\2\2{|\5\b\5\2|\u00b3\3"+
		"\2\2\2}~\7\5\2\2~\177\7\61\2\2\177\u0080\5\22\n\2\u0080\u0081\7\62\2\2"+
		"\u0081\u0082\7\f\2\2\u0082\u0083\5\b\5\2\u0083\u00b3\3\2\2\2\u0084\u0085"+
		"\7\t\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7\64\2\2\u0087\u00b3\3\2\2\2"+
		"\u0088\u0089\7\n\2\2\u0089\u008a\7\61\2\2\u008a\u008b\5\22\n\2\u008b\u008c"+
		"\7\62\2\2\u008c\u008d\7\f\2\2\u008d\u008e\5\b\5\2\u008e\u00b3\3\2\2\2"+
		"\u008f\u0090\7\13\2\2\u0090\u00b3\5\b\5\2\u0091\u0092\7\f\2\2\u0092\u0093"+
		"\5\b\5\2\u0093\u0094\7\5\2\2\u0094\u0095\7\61\2\2\u0095\u0096\5\22\n\2"+
		"\u0096\u0097\7\62\2\2\u0097\u00b3\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a"+
		"\5\b\5\2\u009a\u009b\7\n\2\2\u009b\u009c\7\61\2\2\u009c\u009d\5\22\n\2"+
		"\u009d\u009e\7\62\2\2\u009e\u00b3\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1"+
		"\78\2\2\u00a1\u00a2\7\65\2\2\u00a2\u00b3\5\b\5\2\u00a3\u00a4\7\16\2\2"+
		"\u00a4\u00a5\7\61\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00a7\5\22\n\2\u00a7"+
		"\u00a8\7\64\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\62\2\2\u00aa\u00ab"+
		"\7\f\2\2\u00ab\u00ac\5\b\5\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\7\20\2\2"+
		"\u00ae\u00b3\7\64\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b3\7\64\2\2\u00b1"+
		"\u00b3\5\20\t\2\u00b2_\3\2\2\2\u00b2c\3\2\2\2\u00b2f\3\2\2\2\u00b2m\3"+
		"\2\2\2\u00b2v\3\2\2\2\u00b2}\3\2\2\2\u00b2\u0084\3\2\2\2\u00b2\u0088\3"+
		"\2\2\2\u00b2\u008f\3\2\2\2\u00b2\u0091\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2"+
		"\u009f\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\66\2\2\u00b5\u00b6"+
		"\7\"\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7\64\2\2\u00b8\u00d3\3\2\2\2"+
		"\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd"+
		"\7\64\2\2\u00bd\u00d3\3\2\2\2\u00be\u00bf\7\66\2\2\u00bf\u00c0\7)\2\2"+
		"\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7\64\2\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4"+
		"\7\66\2\2\u00c4\u00c5\7*\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7\64\2\2"+
		"\u00c7\u00d3\3\2\2\2\u00c8\u00c9\7\66\2\2\u00c9\u00ca\7+\2\2\u00ca\u00cb"+
		"\5\22\n\2\u00cb\u00cc\7\64\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\7\66\2"+
		"\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\64\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00b4\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00be\3\2"+
		"\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3"+
		"\21\3\2\2\2\u00d4\u00e3\5\24\13\2\u00d5\u00d6\7\25\2\2\u00d6\u00d8\5\24"+
		"\13\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00e4\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\26"+
		"\2\2\u00dd\u00df\5\24\13\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e6"+
		"\7\27\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7\62\2"+
		"\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5\26\f\2\u00eb\u00e5\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00f0\5\30\r\2\u00ee\u00ef\t\3\2"+
		"\2\u00ef\u00f1\5\30\r\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\27\3\2\2\2\u00f2\u00f7\5\32\16\2\u00f3\u00f4\t\4\2\2\u00f4\u00f6\5\32"+
		"\16\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00ff\5\34\17"+
		"\2\u00fb\u00fc\t\5\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\33\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u011b\78\2\2\u0103\u011b\7\32\2\2\u0104\u011b"+
		"\7\33\2\2\u0105\u011b\7\66\2\2\u0106\u0107\t\6\2\2\u0107\u011b\7\66\2"+
		"\2\u0108\u0109\7\66\2\2\u0109\u011b\t\6\2\2\u010a\u010b\7\61\2\2\u010b"+
		"\u010c\5\22\n\2\u010c\u010d\7\62\2\2\u010d\u011b\3\2\2\2\u010e\u010f\7"+
		"\67\2\2\u010f\u0110\7\61\2\2\u0110\u0115\5\22\n\2\u0111\u0112\7\63\2\2"+
		"\u0112\u0114\5\22\n\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\7\62\2\2\u0119\u011b\3\2\2\2\u011a\u0102\3\2\2\2\u011a\u0103\3"+
		"\2\2\2\u011a\u0104\3\2\2\2\u011a\u0105\3\2\2\2\u011a\u0106\3\2\2\2\u011a"+
		"\u0108\3\2\2\2\u011a\u010a\3\2\2\2\u011a\u010e\3\2\2\2\u011b\35\3\2\2"+
		"\2\24!,\62BJOZ\u00b2\u00d2\u00d9\u00e0\u00e3\u00eb\u00f0\u00f7\u00ff\u0115"+
		"\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}