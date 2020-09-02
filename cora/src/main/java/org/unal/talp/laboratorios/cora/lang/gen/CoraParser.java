// Generated from C:/ws/unal/temas avanzados de lenguajes de programación/unal-talp/cora/src/main/java\Cora.g4 by ANTLR 4.8
package org.unal.talp.laboratorios.cora.lang.gen;

    import java.util.Map;
    import java.util.HashMap;

    import org.unal.talp.laboratorios.cora.lang.interprete.aritmetica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.logica.*;
    import org.unal.talp.laboratorios.cora.lang.interprete.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, LOG=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, BOOLEAN=24, 
		ID=25, NUMBER=26, WS=27;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_log = 4, RULE_conditional = 5, RULE_nexpression = 6, RULE_expression = 7, 
		RULE_factor = 8, RULE_term = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assign", "log", "conditional", 
			"nexpression", "expression", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'log'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "LOG", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "BOOLEAN", 
			"ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Cora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public CoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(CoraParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(CoraParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(CoraParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(20);
			match(PROGRAM);
			setState(21);
			match(ID);
			setState(22);
			match(BRACKET_OPEN);

			            List<ASTNode> body = new ArrayList<ASTNode>();
			            Map<String, Object> symbolTable = new HashMap<String, Object>();
			        
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LOG) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(24);
				((ProgramContext)_localctx).sentence = sentence();
				 body.add(((ProgramContext)_localctx).sentence.node); 
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(BRACKET_CLOSE);

			            for(ASTNode n: body) {
			                n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public LogContext log;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((SentenceContext)_localctx).log = log();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).log.node; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((SentenceContext)_localctx).conditional = conditional();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((SentenceContext)_localctx).var_decl = var_decl();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				((SentenceContext)_localctx).var_assign = var_assign();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node; 
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
		public ASTNode node;
		public Token ID;
		public TerminalNode VAR() { return getToken(CoraParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VAR);
			setState(50);
			((Var_declContext)_localctx).ID = match(ID);
			 ((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null)); 
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public NexpressionContext nexpression;
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoraParser.ASSIGN, 0); }
		public NexpressionContext nexpression() {
			return getRuleContext(NexpressionContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(54);
			match(ASSIGN);
			setState(55);
			((Var_assignContext)_localctx).nexpression = nexpression();
			 ((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).nexpression.node); 
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

	public static class LogContext extends ParserRuleContext {
		public ASTNode node;
		public NexpressionContext nexpression;
		public TerminalNode LOG() { return getToken(CoraParser.LOG, 0); }
		public NexpressionContext nexpression() {
			return getRuleContext(NexpressionContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LOG);
			setState(59);
			((LogContext)_localctx).nexpression = nexpression();
			 ((LogContext)_localctx).node =  new Log(((LogContext)_localctx).nexpression.node); 
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public NexpressionContext nexpression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(CoraParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CoraParser.PAR_OPEN, 0); }
		public NexpressionContext nexpression() {
			return getRuleContext(NexpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CoraParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(CoraParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(CoraParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(CoraParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(CoraParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(CoraParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IF);
			setState(63);
			match(PAR_OPEN);
			setState(64);
			((ConditionalContext)_localctx).nexpression = nexpression();
			setState(65);
			match(PAR_CLOSE);

			                List<ASTNode> body = new ArrayList<ASTNode>();
			             
			setState(67);
			match(BRACKET_OPEN);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LOG) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node); 
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(BRACKET_CLOSE);
			setState(77);
			match(ELSE);

			                 List<ASTNode> elseBody = new ArrayList<ASTNode>();
			             
			setState(79);
			match(BRACKET_OPEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LOG) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				((ConditionalContext)_localctx).s2 = sentence();
				 elseBody.add(((ConditionalContext)_localctx).s2.node); 
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(BRACKET_CLOSE);

			                ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).nexpression.node, body, elseBody);
			             
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

	public static class NexpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode NOT() { return getToken(CoraParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterNexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitNexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitNexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexpressionContext nexpression() throws RecognitionException {
		NexpressionContext _localctx = new NexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nexpression);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(NOT);
				setState(92);
				((NexpressionContext)_localctx).expression = expression();
				  ((NexpressionContext)_localctx).node =  new Not(((NexpressionContext)_localctx).expression.node); 
				}
				break;
			case PAR_OPEN:
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((NexpressionContext)_localctx).expression = expression();
				 ((NexpressionContext)_localctx).node =  ((NexpressionContext)_localctx).expression.node; 
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public FactorContext t3;
		public FactorContext t4;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CoraParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CoraParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CoraParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CoraParser.MINUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(CoraParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CoraParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((ExpressionContext)_localctx).t1 = factor();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node; 
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(102);
					match(PLUS);
					setState(103);
					((ExpressionContext)_localctx).t2 = factor();
					 ((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node); 
					}
					break;
				case MINUS:
					{
					setState(106);
					match(MINUS);
					setState(107);
					((ExpressionContext)_localctx).t3 = factor();
					 ((ExpressionContext)_localctx).node =  new Substraction(_localctx.node, ((ExpressionContext)_localctx).t3.node); 
					}
					break;
				case OR:
					{
					setState(110);
					match(OR);
					setState(111);
					((ExpressionContext)_localctx).t4 = factor();
					 ((ExpressionContext)_localctx).node =  new Or(_localctx.node, ((ExpressionContext)_localctx).t4.node); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
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
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public FactorContext t3;
		public FactorContext t4;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CoraParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CoraParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CoraParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CoraParser.DIV, i);
		}
		public List<TerminalNode> AND() { return getTokens(CoraParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CoraParser.AND, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((FactorContext)_localctx).t1 = term();
			 ((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node; 
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(133);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(121);
						match(MULT);
						setState(122);
						((FactorContext)_localctx).t2 = term();
						 ((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node); 
						}
						break;
					case DIV:
						{
						setState(125);
						match(DIV);
						setState(126);
						((FactorContext)_localctx).t3 = factor();
						 ((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t3.node); 
						}
						break;
					case AND:
						{
						setState(129);
						match(AND);
						setState(130);
						((FactorContext)_localctx).t4 = factor();
						 ((FactorContext)_localctx).node =  new And(_localctx.node, ((FactorContext)_localctx).t4.node); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ASTNode node;
		public Token NUMBER;
		public Token ID;
		public Token BOOLEAN;
		public NexpressionContext nexpression;
		public TerminalNode NUMBER() { return getToken(CoraParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(CoraParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CoraParser.PAR_OPEN, 0); }
		public NexpressionContext nexpression() {
			return getRuleContext(NexpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(CoraParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((TermContext)_localctx).ID = match(ID);
				 ((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null))); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(PAR_OPEN);
				setState(145);
				((TermContext)_localctx).nexpression = nexpression();
				 ((TermContext)_localctx).node =   ((TermContext)_localctx).nexpression.node; 
				setState(147);
				match(PAR_CLOSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n"+
		"\7\f\7\16\7Y\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tu\n\t\f\t\16\t"+
		"x\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0088"+
		"\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0098\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u009f"+
		"\2\26\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n<\3\2\2\2\f@\3\2"+
		"\2\2\16d\3\2\2\2\20f\3\2\2\2\22y\3\2\2\2\24\u0097\3\2\2\2\26\27\7\3\2"+
		"\2\27\30\7\33\2\2\30\31\7\26\2\2\31\37\b\2\1\2\32\33\5\4\3\2\33\34\b\2"+
		"\1\2\34\36\3\2\2\2\35\32\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2"+
		" \"\3\2\2\2!\37\3\2\2\2\"#\7\27\2\2#$\b\2\1\2$\3\3\2\2\2%&\5\n\6\2&\'"+
		"\b\3\1\2\'\62\3\2\2\2()\5\f\7\2)*\b\3\1\2*\62\3\2\2\2+,\5\6\4\2,-\b\3"+
		"\1\2-\62\3\2\2\2./\5\b\5\2/\60\b\3\1\2\60\62\3\2\2\2\61%\3\2\2\2\61(\3"+
		"\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62\5\3\2\2\2\63\64\7\4\2\2\64\65\7\33\2"+
		"\2\65\66\b\4\1\2\66\7\3\2\2\2\678\7\33\2\289\7\25\2\29:\5\16\b\2:;\b\5"+
		"\1\2;\t\3\2\2\2<=\7\5\2\2=>\5\16\b\2>?\b\6\1\2?\13\3\2\2\2@A\7\6\2\2A"+
		"B\7\30\2\2BC\5\16\b\2CD\7\31\2\2DE\b\7\1\2EK\7\26\2\2FG\5\4\3\2GH\b\7"+
		"\1\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2"+
		"\2\2NO\7\27\2\2OP\7\7\2\2PQ\b\7\1\2QW\7\26\2\2RS\5\4\3\2ST\b\7\1\2TV\3"+
		"\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7"+
		"\27\2\2[\\\b\7\1\2\\\r\3\2\2\2]^\7\16\2\2^_\5\20\t\2_`\b\b\1\2`e\3\2\2"+
		"\2ab\5\20\t\2bc\b\b\1\2ce\3\2\2\2d]\3\2\2\2da\3\2\2\2e\17\3\2\2\2fg\5"+
		"\22\n\2gv\b\t\1\2hi\7\b\2\2ij\5\22\n\2jk\b\t\1\2ku\3\2\2\2lm\7\t\2\2m"+
		"n\5\22\n\2no\b\t\1\2ou\3\2\2\2pq\7\r\2\2qr\5\22\n\2rs\b\t\1\2su\3\2\2"+
		"\2th\3\2\2\2tl\3\2\2\2tp\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2"+
		"\2\2xv\3\2\2\2yz\5\24\13\2z\u0089\b\n\1\2{|\7\n\2\2|}\5\24\13\2}~\b\n"+
		"\1\2~\u0088\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\5\22\n\2\u0081\u0082"+
		"\b\n\1\2\u0082\u0088\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\5\22\n\2"+
		"\u0085\u0086\b\n\1\2\u0086\u0088\3\2\2\2\u0087{\3\2\2\2\u0087\177\3\2"+
		"\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\23\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\34\2"+
		"\2\u008d\u0098\b\13\1\2\u008e\u008f\7\33\2\2\u008f\u0098\b\13\1\2\u0090"+
		"\u0091\7\32\2\2\u0091\u0098\b\13\1\2\u0092\u0093\7\30\2\2\u0093\u0094"+
		"\5\16\b\2\u0094\u0095\b\13\1\2\u0095\u0096\7\31\2\2\u0096\u0098\3\2\2"+
		"\2\u0097\u008c\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0092"+
		"\3\2\2\2\u0098\25\3\2\2\2\f\37\61KWdtv\u0087\u0089\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}