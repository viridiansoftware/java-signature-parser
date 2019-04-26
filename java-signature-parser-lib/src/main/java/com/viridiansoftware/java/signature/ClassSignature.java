package com.viridiansoftware.java.signature;

import com.viridiansoftware.java.signature.antlr.SignatureBaseListener;
import com.viridiansoftware.java.signature.antlr.SignatureLexer;
import com.viridiansoftware.java.signature.antlr.SignatureParser;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ClassSignature extends SignatureBaseListener {
	private SignatureParser.ClassSignatureContext signatureContext;

	public ClassSignature(String signature) {
		final SignatureLexer lexer = new SignatureLexer(CharStreams.fromString(signature));
		final SignatureParser parser = new SignatureParser(new BufferedTokenStream(lexer));

		final SignatureParser.ClassSignatureContext context = parser.classSignature();
		final ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

		parseTreeWalker.walk(this, context);
	}

	@Override
	public void exitClassSignature(SignatureParser.ClassSignatureContext ctx) {
		signatureContext = ctx;
	}

	public SignatureParser.ClassSignatureContext getSignatureContext() {
		return signatureContext;
	}
}
