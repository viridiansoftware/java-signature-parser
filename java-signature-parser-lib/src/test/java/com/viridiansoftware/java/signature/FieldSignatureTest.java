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

import org.junit.Assert;
import org.junit.Test;

public class FieldSignatureTest {

	@Test
	public void testFieldObject() {
		final FieldSignature fieldSignature = new FieldSignature("Ljava/util/Set;");
		Assert.assertEquals("java/util/Set", SignatureUtils.toQualifiedSimpleName(fieldSignature.getSignatureContext().
				referenceTypeSignature().classTypeSignature()));
	}

	@Test
	public void testFieldObjectWithGenerics() {
		final FieldSignature fieldSignature = new FieldSignature("[Ljava/util/HashMap$Node<TK;TV;>;");
		Assert.assertEquals("java/util/HashMap$Node", SignatureUtils.toQualifiedSimpleName(fieldSignature.getSignatureContext().
				referenceTypeSignature().arrayTypeSignature().javaTypeSignature().referenceTypeSignature().classTypeSignature()));
		Assert.assertEquals("java/util/HashMap$Node<TK;TV;>", SignatureUtils.toQualifiedSimpleNameWithGenerics(fieldSignature.getSignatureContext().
				referenceTypeSignature().arrayTypeSignature().javaTypeSignature().referenceTypeSignature().classTypeSignature()));
	}
}
