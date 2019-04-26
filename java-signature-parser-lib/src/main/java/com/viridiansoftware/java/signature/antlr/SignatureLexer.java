// Generated from Signature.g4 by ANTLR 4.7.2
package com.viridiansoftware.java.signature.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignatureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TypeParameters=3, TypeParameter=4, ClassBound=5, InterfaceBound=6, 
		SuperclassSignature=7, SuperinterfaceSignature=8, Result=9, ThrowsSignature=10, 
		VoidDescriptor=11, JavaTypeSignature=12, ReferenceTypeSignature=13, ClassTypeSignature=14, 
		PackageSpecifier=15, SimpleClassTypeSignature=16, TypeArguments=17, TypeArgument=18, 
		WildcardIndicator=19, ClassTypeSignatureSuffix=20, TypeVariableSignature=21, 
		ArrayTypeSignature=22, BaseType=23, EXTENDSWILDCARD=24, SUPERWILDCARD=25, 
		LEFTBRACKET=26, SEMICOLON=27, Identifier=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TypeParameters", "TypeParameter", "ClassBound", "InterfaceBound", 
			"SuperclassSignature", "SuperinterfaceSignature", "Result", "ThrowsSignature", 
			"VoidDescriptor", "JavaTypeSignature", "ReferenceTypeSignature", "ClassTypeSignature", 
			"PackageSpecifier", "SimpleClassTypeSignature", "TypeArguments", "TypeArgument", 
			"WildcardIndicator", "ClassTypeSignatureSuffix", "TypeVariableSignature", 
			"ArrayTypeSignature", "BaseType", "EXTENDSWILDCARD", "SUPERWILDCARD", 
			"LEFTBRACKET", "SEMICOLON", "Identifier", "JavaLetter", "JavaLetterOrDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, "'V'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'['", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TypeParameters", "TypeParameter", "ClassBound", "InterfaceBound", 
			"SuperclassSignature", "SuperinterfaceSignature", "Result", "ThrowsSignature", 
			"VoidDescriptor", "JavaTypeSignature", "ReferenceTypeSignature", "ClassTypeSignature", 
			"PackageSpecifier", "SimpleClassTypeSignature", "TypeArguments", "TypeArgument", 
			"WildcardIndicator", "ClassTypeSignatureSuffix", "TypeVariableSignature", 
			"ArrayTypeSignature", "BaseType", "EXTENDSWILDCARD", "SUPERWILDCARD", 
			"LEFTBRACKET", "SEMICOLON", "Identifier"
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


	public SignatureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Signature.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 29:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\6\4F\n\4\r\4\16\4G\3\4\3\4\3\5\3\5\3\5\7\5O\n\5\f"+
		"\5\16\5R\13\5\3\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n"+
		"a\n\n\3\13\3\13\3\13\3\13\5\13g\n\13\3\f\3\f\3\r\3\r\5\rm\n\r\3\16\3\16"+
		"\3\16\5\16r\n\16\3\17\3\17\5\17v\n\17\3\17\3\17\7\17z\n\17\f\17\16\17"+
		"}\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u0084\n\20\f\20\16\20\u0087\13\20"+
		"\3\21\3\21\5\21\u008b\n\21\3\22\3\22\6\22\u008f\n\22\r\22\16\22\u0090"+
		"\3\22\3\22\3\23\3\23\5\23\u0097\n\23\3\23\5\23\u009a\n\23\3\24\3\24\5"+
		"\24\u009e\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00b6\n\35"+
		"\f\35\16\35\u00b9\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00c1\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00c9\n\37\2\2 \3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2\3\2\b\7\2DFHHKL"+
		"UU\\\\\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\7\2&&\62;C\\aac|\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tK\3\2\2\2"+
		"\13S\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23`\3\2\2\2\25f\3\2\2"+
		"\2\27h\3\2\2\2\31l\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37\u0080\3\2\2\2!\u0088"+
		"\3\2\2\2#\u008c\3\2\2\2%\u0099\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a2\3\2\2\2-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad"+
		"\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00c0\3\2\2"+
		"\2=\u00c8\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7+\2\2B\6\3\2\2\2CE\7>\2\2DF\5"+
		"\t\5\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7@\2\2J\b\3"+
		"\2\2\2KL\59\35\2LP\5\13\6\2MO\5\r\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2Q\n\3\2\2\2RP\3\2\2\2SU\7<\2\2TV\5\33\16\2UT\3\2\2\2UV\3\2\2\2"+
		"V\f\3\2\2\2WX\7<\2\2XY\5\33\16\2Y\16\3\2\2\2Z[\5\35\17\2[\20\3\2\2\2\\"+
		"]\5\35\17\2]\22\3\2\2\2^a\5\31\r\2_a\5\27\f\2`^\3\2\2\2`_\3\2\2\2a\24"+
		"\3\2\2\2bc\7`\2\2cg\5\35\17\2de\7`\2\2eg\5+\26\2fb\3\2\2\2fd\3\2\2\2g"+
		"\26\3\2\2\2hi\7X\2\2i\30\3\2\2\2jm\5\33\16\2km\5/\30\2lj\3\2\2\2lk\3\2"+
		"\2\2m\32\3\2\2\2nr\5\35\17\2or\5+\26\2pr\5-\27\2qn\3\2\2\2qo\3\2\2\2q"+
		"p\3\2\2\2r\34\3\2\2\2su\7N\2\2tv\5\37\20\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2w{\5!\21\2xz\5)\25\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7=\2\2\177\36\3\2\2\2\u0080\u0081\59\35\2\u0081\u0085"+
		"\7\61\2\2\u0082\u0084\5\37\20\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086 \3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008a\59\35\2\u0089\u008b\5#\22\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\"\3\2\2\2\u008c\u008e\7>\2\2\u008d\u008f\5%\23\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7@\2\2\u0093$\3\2\2\2\u0094\u009a"+
		"\7,\2\2\u0095\u0097\5\'\24\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\5\33\16\2\u0099\u0094\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u009a&\3\2\2\2\u009b\u009e\5\61\31\2\u009c\u009e\5\63\32\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e(\3\2\2\2\u009f\u00a0\7\60\2\2"+
		"\u00a0\u00a1\5!\21\2\u00a1*\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\59"+
		"\35\2\u00a4\u00a5\7=\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7N\2\2\u00a7\u00a8"+
		"\5\31\r\2\u00a8.\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\7-\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\64\3\2\2\2\u00af\u00b0"+
		"\7]\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7=\2\2\u00b28\3\2\2\2\u00b3\u00b7"+
		"\5;\36\2\u00b4\u00b6\5=\37\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8:\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00c1\t\3\2\2\u00bb\u00bc\n\4\2\2\u00bc\u00c1\6\36\2\2\u00bd\u00be"+
		"\t\5\2\2\u00be\u00bf\t\6\2\2\u00bf\u00c1\6\36\3\2\u00c0\u00ba\3\2\2\2"+
		"\u00c0\u00bb\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1<\3\2\2\2\u00c2\u00c9\t"+
		"\7\2\2\u00c3\u00c4\n\4\2\2\u00c4\u00c9\6\37\4\2\u00c5\u00c6\t\5\2\2\u00c6"+
		"\u00c7\t\6\2\2\u00c7\u00c9\6\37\5\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3"+
		"\2\2\2\u00c8\u00c5\3\2\2\2\u00c9>\3\2\2\2\25\2GPU`flqu{\u0085\u008a\u0090"+
		"\u0096\u0099\u009d\u00b7\u00c0\u00c8\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}