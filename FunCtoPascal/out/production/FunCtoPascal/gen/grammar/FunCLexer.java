// Generated from C:/ws/unal/master/TALP/labs/practica3/Infix2Prefix/grammar\FunC.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTOYCOMA=1, VOID=2, INT=3, FLOAT=4, COMA=5, ASTERISCO=6, LPAR=7, RPAR=8, 
		ID=9, COMMENTARIO=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUNTOYCOMA", "VOID", "INT", "FLOAT", "COMA", "ASTERISCO", "LPAR", "RPAR", 
			"ID", "COMMENTARIO", "WS"
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


	public FunCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\n\65\n\n\f\n\16\n"+
		"8\13\n\3\13\3\13\3\13\3\13\7\13>\n\13\f\13\16\13A\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\6\fI\n\f\r\f\16\fJ\3\f\3\f\3?\2\r\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7 \3\2\2\2\t$\3\2\2\2\13*\3\2"+
		"\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23\62\3\2\2\2\259\3\2\2\2\27"+
		"H\3\2\2\2\31\32\7=\2\2\32\4\3\2\2\2\33\34\7x\2\2\34\35\7q\2\2\35\36\7"+
		"k\2\2\36\37\7f\2\2\37\6\3\2\2\2 !\7k\2\2!\"\7p\2\2\"#\7v\2\2#\b\3\2\2"+
		"\2$%\7h\2\2%&\7n\2\2&\'\7q\2\2\'(\7c\2\2()\7v\2\2)\n\3\2\2\2*+\7.\2\2"+
		"+\f\3\2\2\2,-\7,\2\2-\16\3\2\2\2./\7*\2\2/\20\3\2\2\2\60\61\7+\2\2\61"+
		"\22\3\2\2\2\62\66\t\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\24\3\2\2\28\66\3\2\2\29:\7\61\2\2:;\7,\2\2;"+
		"?\3\2\2\2<>\13\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?=\3\2\2\2@B\3\2\2\2"+
		"A?\3\2\2\2BC\7,\2\2CD\7\61\2\2DE\3\2\2\2EF\b\13\2\2F\26\3\2\2\2GI\t\4"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\f\2\2M\30\3"+
		"\2\2\2\6\2\66?J\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}