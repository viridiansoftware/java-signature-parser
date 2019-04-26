package com.viridiansoftware.java.signature;

import com.viridiansoftware.java.signature.antlr.SignatureBaseListener;
import com.viridiansoftware.java.signature.antlr.SignatureLexer;
import com.viridiansoftware.java.signature.antlr.SignatureParser;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class FieldSignature extends SignatureBaseListener {
	private SignatureParser.FieldSignatureContext signatureContext;

	public FieldSignature(String signature) {
		final SignatureLexer lexer = new SignatureLexer(CharStreams.fromString(signature));
		final SignatureParser parser = new SignatureParser(new BufferedTokenStream(lexer));

		final SignatureParser.FieldSignatureContext context = parser.fieldSignature();
		final ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

		parseTreeWalker.walk(this, context);
	}

	@Override
	public void exitFieldSignature(SignatureParser.FieldSignatureContext ctx) {
		signatureContext = ctx;
	}

	public SignatureParser.FieldSignatureContext getSignatureContext() {
		return signatureContext;
	}
}
