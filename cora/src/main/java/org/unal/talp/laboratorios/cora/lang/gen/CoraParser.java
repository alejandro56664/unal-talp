// Generated from C:/ws/unal/temas avanzados de lenguajes de programación/labs/cora/src/main/java\Cora.g4 by ANTLR 4.8
package org.unal.talp.laboratorios.cora.lang.gen;

    import java.util.Map;
    import java.util.HashMap;

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
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		BOOLEAN=25, ID=26, NUMBER=27, WS=28;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_println = 4, RULE_conditional = 5, RULE_expression = 6, RULE_factor = 7, 
		RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assign", "println", "conditional", 
			"expression", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
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
			setState(18);
			match(PROGRAM);
			setState(19);
			match(ID);
			setState(20);
			match(BRACKET_OPEN);

			            List<ASTNode> body = new ArrayList<ASTNode>();
			            Map<String, Object> symbolTable = new HashMap<String, Object>();
			        
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				((ProgramContext)_localctx).sentence = sentence();
				 body.add(((ProgramContext)_localctx).sentence.node); 
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((SentenceContext)_localctx).println = println();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((SentenceContext)_localctx).conditional = conditional();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((SentenceContext)_localctx).var_decl = var_decl();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
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
		public TerminalNode SEMICOLON() { return getToken(CoraParser.SEMICOLON, 0); }
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
			setState(47);
			match(VAR);
			setState(48);
			((Var_declContext)_localctx).ID = match(ID);
			setState(49);
			match(SEMICOLON);
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
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoraParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CoraParser.SEMICOLON, 0); }
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
			setState(52);
			((Var_assignContext)_localctx).ID = match(ID);
			setState(53);
			match(ASSIGN);
			setState(54);
			((Var_assignContext)_localctx).expression = expression();
			setState(55);
			match(SEMICOLON);
			 ((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node); 
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(CoraParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CoraParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoraListener ) ((CoraListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoraVisitor ) return ((CoraVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINTLN);
			setState(59);
			((PrintlnContext)_localctx).expression = expression();
			setState(60);
			match(SEMICOLON);
			 ((PrintlnContext)_localctx).node =  new Print(((PrintlnContext)_localctx).expression.node); 
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
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(CoraParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CoraParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(63);
			match(IF);
			setState(64);
			match(PAR_OPEN);
			setState(65);
			((ConditionalContext)_localctx).expression = expression();
			setState(66);
			match(PAR_CLOSE);

			                List<ASTNode> body = new ArrayList<ASTNode>();
			             
			setState(68);
			match(BRACKET_OPEN);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node); 
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(BRACKET_CLOSE);
			setState(78);
			match(ELSE);

			                 List<ASTNode> elseBody = new ArrayList<ASTNode>();
			             
			setState(80);
			match(BRACKET_OPEN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				((ConditionalContext)_localctx).s2 = sentence();
				 elseBody.add(((ConditionalContext)_localctx).s2.node); 
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(BRACKET_CLOSE);

			                ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
			             
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
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((ExpressionContext)_localctx).t1 = factor();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node; 
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(94);
				match(PLUS);
				setState(95);
				((ExpressionContext)_localctx).t2 = factor();
				 ((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node); 
				}
				}
				setState(102);
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
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((FactorContext)_localctx).t1 = term();
			 ((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node; 
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(105);
				match(MULT);
				setState(106);
				((FactorContext)_localctx).t2 = term();
				 ((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node); 
				}
				}
				setState(113);
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
		public ASTNode node;
		public Token NUMBER;
		public Token ID;
		public Token BOOLEAN;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(CoraParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(CoraParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(CoraParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(CoraParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((TermContext)_localctx).ID = match(ID);
				 ((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null))); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(PAR_OPEN);
				setState(121);
				((TermContext)_localctx).expression = expression();
				 ((TermContext)_localctx).node =   ((TermContext)_localctx).expression.node; 
				setState(123);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7W"+
		"\n\7\f\7\16\7Z\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\be\n\b\f\b\16"+
		"\bh\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\2\2\u0083\2\24\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n"+
		"<\3\2\2\2\fA\3\2\2\2\16^\3\2\2\2\20i\3\2\2\2\22\177\3\2\2\2\24\25\7\3"+
		"\2\2\25\26\7\34\2\2\26\27\7\26\2\2\27\35\b\2\1\2\30\31\5\4\3\2\31\32\b"+
		"\2\1\2\32\34\3\2\2\2\33\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\27\2\2!\"\b\2\1\2\"\3\3\2\2\2#$\5"+
		"\n\6\2$%\b\3\1\2%\60\3\2\2\2&\'\5\f\7\2\'(\b\3\1\2(\60\3\2\2\2)*\5\6\4"+
		"\2*+\b\3\1\2+\60\3\2\2\2,-\5\b\5\2-.\b\3\1\2.\60\3\2\2\2/#\3\2\2\2/&\3"+
		"\2\2\2/)\3\2\2\2/,\3\2\2\2\60\5\3\2\2\2\61\62\7\4\2\2\62\63\7\34\2\2\63"+
		"\64\7\32\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\7\34\2\2\678\7\25\2\289"+
		"\5\16\b\29:\7\32\2\2:;\b\5\1\2;\t\3\2\2\2<=\7\5\2\2=>\5\16\b\2>?\7\32"+
		"\2\2?@\b\6\1\2@\13\3\2\2\2AB\7\6\2\2BC\7\30\2\2CD\5\16\b\2DE\7\31\2\2"+
		"EF\b\7\1\2FL\7\26\2\2GH\5\4\3\2HI\b\7\1\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\27\2\2PQ\7\7\2\2QR\b\7"+
		"\1\2RX\7\26\2\2ST\5\4\3\2TU\b\7\1\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\27\2\2\\]\b\7\1\2]\r\3\2\2\2"+
		"^_\5\20\t\2_f\b\b\1\2`a\7\b\2\2ab\5\20\t\2bc\b\b\1\2ce\3\2\2\2d`\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hf\3\2\2\2ij\5\22\n\2jq\b"+
		"\t\1\2kl\7\n\2\2lm\5\22\n\2mn\b\t\1\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo"+
		"\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sq\3\2\2\2tu\7\35\2\2u\u0080\b\n\1\2vw\7"+
		"\34\2\2w\u0080\b\n\1\2xy\7\33\2\2y\u0080\b\n\1\2z{\7\30\2\2{|\5\16\b\2"+
		"|}\b\n\1\2}~\7\31\2\2~\u0080\3\2\2\2\177t\3\2\2\2\177v\3\2\2\2\177x\3"+
		"\2\2\2\177z\3\2\2\2\u0080\23\3\2\2\2\t\35/LXfq\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}