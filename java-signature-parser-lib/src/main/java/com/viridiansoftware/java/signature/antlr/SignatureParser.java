// Generated from Signature.g4 by ANTLR 4.7.2
package com.viridiansoftware.java.signature.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignatureParser extends Parser {
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
	public static final int
		RULE_classSignature = 0, RULE_methodSignature = 1, RULE_fieldSignature = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"classSignature", "methodSignature", "fieldSignature"
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

	@Override
	public String getGrammarFileName() { return "Signature.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SignatureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClassSignatureContext extends ParserRuleContext {
		public TerminalNode SuperclassSignature() { return getToken(SignatureParser.SuperclassSignature, 0); }
		public TerminalNode TypeParameters() { return getToken(SignatureParser.TypeParameters, 0); }
		public List<TerminalNode> SuperinterfaceSignature() { return getTokens(SignatureParser.SuperinterfaceSignature); }
		public TerminalNode SuperinterfaceSignature(int i) {
			return getToken(SignatureParser.SuperinterfaceSignature, i);
		}
		public ClassSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).enterClassSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).exitClassSignature(this);
		}
	}

	public final ClassSignatureContext classSignature() throws RecognitionException {
		ClassSignatureContext _localctx = new ClassSignatureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeParameters) {
				{
				setState(6);
				match(TypeParameters);
				}
			}

			setState(9);
			match(SuperclassSignature);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SuperinterfaceSignature) {
				{
				{
				setState(10);
				match(SuperinterfaceSignature);
				}
				}
				setState(15);
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

	public static class MethodSignatureContext extends ParserRuleContext {
		public TerminalNode Result() { return getToken(SignatureParser.Result, 0); }
		public TerminalNode TypeParameters() { return getToken(SignatureParser.TypeParameters, 0); }
		public List<TerminalNode> JavaTypeSignature() { return getTokens(SignatureParser.JavaTypeSignature); }
		public TerminalNode JavaTypeSignature(int i) {
			return getToken(SignatureParser.JavaTypeSignature, i);
		}
		public List<TerminalNode> ThrowsSignature() { return getTokens(SignatureParser.ThrowsSignature); }
		public TerminalNode ThrowsSignature(int i) {
			return getToken(SignatureParser.ThrowsSignature, i);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).exitMethodSignature(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeParameters) {
				{
				setState(16);
				match(TypeParameters);
				}
			}

			setState(19);
			match(T__0);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JavaTypeSignature) {
				{
				{
				setState(20);
				match(JavaTypeSignature);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(T__1);
			setState(27);
			match(Result);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ThrowsSignature) {
				{
				{
				setState(28);
				match(ThrowsSignature);
				}
				}
				setState(33);
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

	public static class FieldSignatureContext extends ParserRuleContext {
		public TerminalNode ReferenceTypeSignature() { return getToken(SignatureParser.ReferenceTypeSignature, 0); }
		public FieldSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).enterFieldSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignatureListener ) ((SignatureListener)listener).exitFieldSignature(this);
		}
	}

	public final FieldSignatureContext fieldSignature() throws RecognitionException {
		FieldSignatureContext _localctx = new FieldSignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ReferenceTypeSignature);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\5\2\n\n\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\5\3"+
		"\24\n\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\7\3 \n\3\f\3\16"+
		"\3#\13\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2(\2\t\3\2\2\2\4\23\3\2\2\2\6$\3"+
		"\2\2\2\b\n\7\5\2\2\t\b\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\17\7\t\2\2"+
		"\f\16\7\n\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\3\3\2\2\2\21\17\3\2\2\2\22\24\7\5\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24"+
		"\25\3\2\2\2\25\31\7\3\2\2\26\30\7\16\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\4\2\2\35"+
		"!\7\13\2\2\36 \7\f\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"\5\3\2\2\2#!\3\2\2\2$%\7\17\2\2%\7\3\2\2\2\7\t\17\23\31!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}