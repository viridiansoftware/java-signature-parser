/*******************************************************************************
 * Copyright 2019 Viridian Software Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
