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

public class MethodSignature extends SignatureBaseListener {
	private final String signature;
	private SignatureParser.MethodSignatureContext signatureContext;

	public MethodSignature(String signature) {
		this.signature = signature;
		if(signature == null || signature.isEmpty()) {
			return;
		}
		final SignatureLexer lexer = new SignatureLexer(CharStreams.fromString(signature));
		final SignatureParser parser = new SignatureParser(new BufferedTokenStream(lexer));

		final SignatureParser.MethodSignatureContext context = parser.methodSignature();
		final ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

		parseTreeWalker.walk(this, context);
	}

	public boolean isVoidMethod() {
		return signatureContext.result().javaTypeSignature() == null;
	}

	public SignatureParser.JavaTypeSignatureContext getReturnType() {
		return signatureContext.result().javaTypeSignature();
	}

	public int getTotalThrowsSignatures() {
		if(signatureContext == null) {
			return 0;
		}
		if(signatureContext.throwsSignature() == null) {
			return 0;
		}
		return signatureContext.throwsSignature().size();
	}

	public SignatureParser.ThrowsSignatureContext getThrowsSignature(int i) {
		if(signatureContext == null) {
			return null;
		}
		if(signatureContext.throwsSignature() == null) {
			return null;
		}
		return signatureContext.throwsSignature().get(i);
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
		if(signatureContext == null) {
			return null;
		}
		if(signatureContext.typeParameters() == null) {
			return null;
		}
		if(signatureContext.typeParameters().typeParameter() == null) {
			return null;
		}
		return signatureContext.typeParameters().typeParameter(i);
	}

	public int getTotalMethodArguments() {
		if(signatureContext == null) {
			return 0;
		}
		if(signatureContext.javaTypeSignature() == null) {
			return 0;
		}
		return signatureContext.javaTypeSignature().size();
	}

	public SignatureParser.JavaTypeSignatureContext getMethodArgument(int i) {
		if(signatureContext == null) {
			return null;
		}
		if(signatureContext.javaTypeSignature() == null) {
			return null;
		}
		return signatureContext.javaTypeSignature().get(i);
	}

	@Override
	public void exitMethodSignature(SignatureParser.MethodSignatureContext ctx) {
		signatureContext = ctx;
	}

	public SignatureParser.MethodSignatureContext getSignatureContext() {
		return signatureContext;
	}

	public String getSignatureString() {
		return signature;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MethodSignature)) return false;
		MethodSignature that = (MethodSignature) o;
		return Objects.equals(signature, that.signature);
	}

	@Override
	public int hashCode() {
		return Objects.hash(signature);
	}
}