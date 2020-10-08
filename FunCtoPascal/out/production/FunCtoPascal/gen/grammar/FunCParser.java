// Generated from C:/ws/unal/master/TALP/labs/practica3/Infix2Prefix/grammar\FunC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTOYCOMA=1, VOID=2, INT=3, FLOAT=4, COMA=5, ASTERISCO=6, LPAR=7, RPAR=8, 
		ID=9, COMMENTARIO=10, WS=11;
	public static final int
		RULE_program = 0, RULE_s = 1, RULE_tipofun = 2, RULE_l = 3, RULE_lp = 4, 
		RULE_f = 5, RULE_a = 6, RULE_m = 7, RULE_argu = 8, RULE_tipo = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "s", "tipofun", "l", "lp", "f", "a", "m", "argu", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'void'", "'int'", "'float'", "','", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTOYCOMA", "VOID", "INT", "FLOAT", "COMA", "ASTERISCO", "LPAR", 
			"RPAR", "ID", "COMMENTARIO", "WS"
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
	public String getGrammarFileName() { return "FunC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(20);
				s();
				}
				}
				setState(25);
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

	public static class SContext extends ParserRuleContext {
		public TipofunContext tipofun() {
			return getRuleContext(TipofunContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(FunCParser.PUNTOYCOMA, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			tipofun();
			setState(27);
			l();
			setState(28);
			match(PUNTOYCOMA);
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

	public static class TipofunContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FunCParser.VOID, 0); }
		public TerminalNode INT() { return getToken(FunCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(FunCParser.FLOAT, 0); }
		public TipofunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipofun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterTipofun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitTipofun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitTipofun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipofunContext tipofun() throws RecognitionException {
		TipofunContext _localctx = new TipofunContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipofun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
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

	public static class LContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			f();
			setState(33);
			lp();
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

	public static class LpContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(FunCParser.COMA, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public LpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterLp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitLp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitLp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LpContext lp() throws RecognitionException {
		LpContext _localctx = new LpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lp);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(COMA);
				setState(36);
				f();
				setState(37);
				lp();
				}
				break;
			case PUNTOYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunCParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunCParser.LPAR, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunCParser.RPAR, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			match(LPAR);
			setState(44);
			a();
			setState(45);
			match(RPAR);
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

	public static class AContext extends ParserRuleContext {
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FunCParser.VOID, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				argu();
				setState(48);
				m();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(VOID);
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

	public static class MContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(FunCParser.COMA, 0); }
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_m);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(COMA);
				setState(54);
				argu();
				setState(55);
				m();
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArguContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunCParser.ID, 0); }
		public TerminalNode ASTERISCO() { return getToken(FunCParser.ASTERISCO, 0); }
		public ArguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterArgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitArgu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitArgu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argu);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				tipo();
				setState(61);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				tipo();
				setState(64);
				match(ASTERISCO);
				setState(65);
				match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FunCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(FunCParser.FLOAT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunCListener ) ((FunCListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunCVisitor ) return ((FunCVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rJ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6+\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\66\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t=\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nF\n\n\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\4\6\3\2\5\6\2D\2\31"+
		"\3\2\2\2\4\34\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n*\3\2\2\2\f,\3\2\2\2\16"+
		"\65\3\2\2\2\20<\3\2\2\2\22E\3\2\2\2\24G\3\2\2\2\26\30\5\4\3\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3"+
		"\2\2\2\34\35\5\6\4\2\35\36\5\b\5\2\36\37\7\3\2\2\37\5\3\2\2\2 !\t\2\2"+
		"\2!\7\3\2\2\2\"#\5\f\7\2#$\5\n\6\2$\t\3\2\2\2%&\7\7\2\2&\'\5\f\7\2\'("+
		"\5\n\6\2(+\3\2\2\2)+\3\2\2\2*%\3\2\2\2*)\3\2\2\2+\13\3\2\2\2,-\7\13\2"+
		"\2-.\7\t\2\2./\5\16\b\2/\60\7\n\2\2\60\r\3\2\2\2\61\62\5\22\n\2\62\63"+
		"\5\20\t\2\63\66\3\2\2\2\64\66\7\4\2\2\65\61\3\2\2\2\65\64\3\2\2\2\66\17"+
		"\3\2\2\2\678\7\7\2\289\5\22\n\29:\5\20\t\2:=\3\2\2\2;=\3\2\2\2<\67\3\2"+
		"\2\2<;\3\2\2\2=\21\3\2\2\2>?\5\24\13\2?@\7\13\2\2@F\3\2\2\2AB\5\24\13"+
		"\2BC\7\b\2\2CD\7\13\2\2DF\3\2\2\2E>\3\2\2\2EA\3\2\2\2F\23\3\2\2\2GH\t"+
		"\3\2\2H\25\3\2\2\2\7\31*\65<E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}