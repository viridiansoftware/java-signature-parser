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

import java.util.Objects;

public class ClassSignature extends SignatureBaseListener {
	private final String signature;
	private SignatureParser.ClassSignatureContext signatureContext;

	public ClassSignature(String signature) {
		this.signature = signature;
		if(signature == null || signature.isEmpty()) {
			return;
		}
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

	public int getTotalTypeParameters() {
		if(signatureContext == null) {
			return 0;
		}
		if(signatureContext.typeParameters() == null) {
			return 0;
		}
		if(signatureContext.typeParameters().typeParameter() == null) {
			return 0;
		}
		return signatureContext.typeParameters().typeParameter().size();
	}

	public SignatureParser.TypeParameterContext getTypeParameter(int i) {
		return signatureContext.typeParameters().typeParameter(i);
	}

	public SignatureParser.SuperclassSignatureContext getSuperclass() {
		if(signatureContext == null) {
			return null;
		}
		return signatureContext.superclassSignature();
	}

	public int getTotalSuperinterfaces() {
		if(signatureContext == null) {
			return 0;
		}
		if(signatureContext.superinterfaceSignature() == null) {
			return 0;
		}
		return signatureContext.superinterfaceSignature().size();
	}

	public SignatureParser.SuperinterfaceSignatureContext getSuperinterface(int i) {
		return signatureContext.superinterfaceSignature(i);
	}

	public SignatureParser.ClassSignatureContext getSignatureContext() {
		return signatureContext;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ClassSignature)) return false;
		ClassSignature that = (ClassSignature) o;
		return Objects.equals(signature, that.signature);
	}

	@Override
	public int hashCode() {
		return Objects.hash(signature);
	}
}
