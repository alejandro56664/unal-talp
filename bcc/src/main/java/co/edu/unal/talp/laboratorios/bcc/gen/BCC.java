// Generated from C:/ws/unal/master/TALP/unal-talp/bcc/src/main/resources\BCC.g4 by ANTLR 4.8
package co.edu.unal.talp.laboratorios.bcc.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCC extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, INPUT=2, WHILE=3, WHEN=4, IF=5, UNLESS=6, RETURN=7, UNTIL=8, 
		LOOP=9, DO=10, REPEAT=11, FOR=12, END=13, NEXT=14, BREAK=15, NUM=16, BOOL=17, 
		VAR=18, AND=19, OR=20, NOT=21, ELSE=22, FUNCTION=23, TRUE=24, FALSE=25, 
		TK_MENOR=26, TK_MENOR_IGUAL=27, TK_MAYOR=28, TK_MAYOR_IGUAL=29, TK_IGUALDAD=30, 
		TK_DIFERENTE=31, TK_ASIGNACION=32, TK_MAS=33, TK_MENOS=34, TK_MULT=35, 
		TK_DIV=36, TK_MOD=37, TK_SUM_ASIG=38, TK_RES_ASIG=39, TK_MUL_ASIG=40, 
		TK_DIV_ASIG=41, TK_MOD_ASIG=42, TK_INCREMENTO=43, TK_DECREMENTO=44, TK_LLAVE_IZQ=45, 
		TK_LLAVE_DER=46, TK_PAR_IZQ=47, TK_PAR_DER=48, TK_COMA=49, TK_PUNTOYCOMA=50, 
		TK_DOSPUNTOS=51, ID=52, FID=53, TK_NUM=54, COMMENTARIO=55, WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "INPUT", "WHILE", "WHEN", "IF", "UNLESS", "RETURN", "UNTIL", 
			"LOOP", "DO", "REPEAT", "FOR", "END", "NEXT", "BREAK", "NUM", "BOOL", 
			"VAR", "AND", "OR", "NOT", "ELSE", "FUNCTION", "TRUE", "FALSE", "TK_MENOR", 
			"TK_MENOR_IGUAL", "TK_MAYOR", "TK_MAYOR_IGUAL", "TK_IGUALDAD", "TK_DIFERENTE", 
			"TK_ASIGNACION", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", 
			"TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", "TK_MOD_ASIG", 
			"TK_INCREMENTO", "TK_DECREMENTO", "TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_COMA", "TK_PUNTOYCOMA", "TK_DOSPUNTOS", "ID", "FID", 
			"TK_NUM", "COMMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'input'", "'while'", "'when'", "'if'", "'unless'", 
			"'return'", "'until'", "'loop'", "'do'", "'repeat'", "'for'", "'end'", 
			"'next'", "'break'", "'num'", "'bool'", "'var'", "'and'", "'or'", "'not'", 
			"'else'", "'function'", "'true'", "'false'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "':='", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "','", 
			"';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "INPUT", "WHILE", "WHEN", "IF", "UNLESS", "RETURN", "UNTIL", 
			"LOOP", "DO", "REPEAT", "FOR", "END", "NEXT", "BREAK", "NUM", "BOOL", 
			"VAR", "AND", "OR", "NOT", "ELSE", "FUNCTION", "TRUE", "FALSE", "TK_MENOR", 
			"TK_MENOR_IGUAL", "TK_MAYOR", "TK_MAYOR_IGUAL", "TK_IGUALDAD", "TK_DIFERENTE", 
			"TK_ASIGNACION", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", "TK_MOD", 
			"TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", "TK_MOD_ASIG", 
			"TK_INCREMENTO", "TK_DECREMENTO", "TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_COMA", "TK_PUNTOYCOMA", "TK_DOSPUNTOS", "ID", "FID", 
			"TK_NUM", "COMMENTARIO", "WS"
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


	public BCC(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BCC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\7\65\u0137\n\65\f\65\16"+
		"\65\u013a\13\65\3\66\3\66\3\66\7\66\u013f\n\66\f\66\16\66\u0142\13\66"+
		"\3\67\7\67\u0145\n\67\f\67\16\67\u0148\13\67\3\67\5\67\u014b\n\67\3\67"+
		"\6\67\u014e\n\67\r\67\16\67\u014f\38\38\78\u0154\n8\f8\168\u0157\138\3"+
		"8\38\38\38\39\69\u015e\n9\r9\169\u015f\39\39\3\u0155\2:\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\6\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0169\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\3s\3\2\2\2\5y\3\2\2\2\7\177\3\2\2\2\t\u0085\3\2\2\2\13\u008a"+
		"\3\2\2\2\r\u008d\3\2\2\2\17\u0094\3\2\2\2\21\u009b\3\2\2\2\23\u00a1\3"+
		"\2\2\2\25\u00a6\3\2\2\2\27\u00a9\3\2\2\2\31\u00b0\3\2\2\2\33\u00b4\3\2"+
		"\2\2\35\u00b8\3\2\2\2\37\u00bd\3\2\2\2!\u00c3\3\2\2\2#\u00c7\3\2\2\2%"+
		"\u00cc\3\2\2\2\'\u00d0\3\2\2\2)\u00d4\3\2\2\2+\u00d7\3\2\2\2-\u00db\3"+
		"\2\2\2/\u00e0\3\2\2\2\61\u00e9\3\2\2\2\63\u00ee\3\2\2\2\65\u00f4\3\2\2"+
		"\2\67\u00f6\3\2\2\29\u00f9\3\2\2\2;\u00fb\3\2\2\2=\u00fe\3\2\2\2?\u0101"+
		"\3\2\2\2A\u0104\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G\u010b\3\2\2\2I"+
		"\u010d\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2\2\2O\u0114\3\2\2\2Q\u0117\3\2"+
		"\2\2S\u011a\3\2\2\2U\u011d\3\2\2\2W\u0120\3\2\2\2Y\u0123\3\2\2\2[\u0126"+
		"\3\2\2\2]\u0128\3\2\2\2_\u012a\3\2\2\2a\u012c\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0130\3\2\2\2g\u0132\3\2\2\2i\u0134\3\2\2\2k\u013b\3\2\2\2m\u0146\3\2"+
		"\2\2o\u0151\3\2\2\2q\u015d\3\2\2\2st\7r\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2"+
		"wx\7v\2\2x\4\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7r\2\2|}\7w\2\2}~\7v\2\2~\6\3"+
		"\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7g\2\2\u0084\b\3\2\2\2\u0085\u0086\7y\2\2\u0086\u0087"+
		"\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\n\3\2\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7h\2\2\u008c\f\3\2\2\2\u008d\u008e\7w\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7u\2\2\u0093\16\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2"+
		"\u009a\20\3\2\2\2\u009b\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7"+
		"v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\22\3\2\2\2\u00a1\u00a2"+
		"\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7r\2\2\u00a5"+
		"\24\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7q\2\2\u00a8\26\3\2\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7g\2\2"+
		"\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7"+
		"h\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\32\3\2\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7\34\3\2\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7z\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\36\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7m\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7w\2\2\u00c5\u00c6\7o\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7n\2\2\u00cb$\3\2\2\2\u00cc"+
		"\u00cd\7x\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7t\2\2\u00cf&\3\2\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3(\3\2\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6*\3\2\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7v\2\2\u00da,\3\2\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df.\3\2\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7e\2\2"+
		"\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7w\2\2\u00ec\u00ed\7g\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\64\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7"+
		"\u00f8\7?\2\2\u00f88\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa:\3\2\2\2\u00fb\u00fc"+
		"\7@\2\2\u00fc\u00fd\7?\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100"+
		"\7?\2\2\u0100>\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103\7?\2\2\u0103@\3"+
		"\2\2\2\u0104\u0105\7<\2\2\u0105\u0106\7?\2\2\u0106B\3\2\2\2\u0107\u0108"+
		"\7-\2\2\u0108D\3\2\2\2\u0109\u010a\7/\2\2\u010aF\3\2\2\2\u010b\u010c\7"+
		",\2\2\u010cH\3\2\2\2\u010d\u010e\7\61\2\2\u010eJ\3\2\2\2\u010f\u0110\7"+
		"\'\2\2\u0110L\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113\7?\2\2\u0113N\3\2"+
		"\2\2\u0114\u0115\7/\2\2\u0115\u0116\7?\2\2\u0116P\3\2\2\2\u0117\u0118"+
		"\7,\2\2\u0118\u0119\7?\2\2\u0119R\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c"+
		"\7?\2\2\u011cT\3\2\2\2\u011d\u011e\7\'\2\2\u011e\u011f\7?\2\2\u011fV\3"+
		"\2\2\2\u0120\u0121\7-\2\2\u0121\u0122\7-\2\2\u0122X\3\2\2\2\u0123\u0124"+
		"\7/\2\2\u0124\u0125\7/\2\2\u0125Z\3\2\2\2\u0126\u0127\7}\2\2\u0127\\\3"+
		"\2\2\2\u0128\u0129\7\177\2\2\u0129^\3\2\2\2\u012a\u012b\7*\2\2\u012b`"+
		"\3\2\2\2\u012c\u012d\7+\2\2\u012db\3\2\2\2\u012e\u012f\7.\2\2\u012fd\3"+
		"\2\2\2\u0130\u0131\7=\2\2\u0131f\3\2\2\2\u0132\u0133\7<\2\2\u0133h\3\2"+
		"\2\2\u0134\u0138\t\2\2\2\u0135\u0137\t\3\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139j\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013c\7B\2\2\u013c\u0140\t\2\2\2\u013d\u013f"+
		"\t\3\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141l\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\t\4\2\2"+
		"\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7\60\2\2"+
		"\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e"+
		"\t\4\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150n\3\2\2\2\u0151\u0155\7%\2\2\u0152\u0154\13\2\2\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\f\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\b8\2\2\u015bp\3\2\2\2\u015c\u015e\t\5\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b9\2\2\u0162r\3\2\2\2\n\2\u0138\u0140"+
		"\u0146\u014a\u014f\u0155\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}