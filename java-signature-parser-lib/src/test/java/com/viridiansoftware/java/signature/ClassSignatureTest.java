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

public class ClassSignatureTest {

	@Test
	public void testNoClass() {
		final ClassSignature classSignature = new ClassSignature("");
		Assert.assertEquals(0, classSignature.getTotalTypeParameters());
		Assert.assertNull(classSignature.getSuperclass());
		Assert.assertEquals(0, classSignature.getTotalSuperinterfaces());
	}

	@Test
	public void testClassWithGenerics() {
		final ClassSignature classSignature = new ClassSignature("<K:Ljava/lang/String;V:Ljava/lang/Integer;>Ljava/lang/Object;");

		Assert.assertEquals(2, classSignature.getTotalTypeParameters());
		Assert.assertEquals("Ljava/lang/Object;", classSignature.getSuperclass().getText());
		Assert.assertEquals(0, classSignature.getTotalSuperinterfaces());

		Assert.assertEquals("K", classSignature.getTypeParameter(0).identifier().getText());
		Assert.assertEquals("Ljava/lang/String;", classSignature.getTypeParameter(0).classBound().referenceTypeSignature().getText());

		Assert.assertEquals("V", classSignature.getTypeParameter(1).identifier().getText());
		Assert.assertEquals("Ljava/lang/Integer;", classSignature.getTypeParameter(1).classBound().referenceTypeSignature().getText());
	}

	@Test
	public void testClassWithSuperclass() {
		final ClassSignature classSignature = new ClassSignature("Ljava/lang/Object;");
		Assert.assertEquals(0, classSignature.getTotalTypeParameters());
		Assert.assertEquals("Ljava/lang/Object;", classSignature.getSuperclass().getText());
		Assert.assertEquals(0, classSignature.getTotalSuperinterfaces());
	}

	@Test
	public void testClassWithSuperinterfaces() {
		final ClassSignature classSignature = new ClassSignature("Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Comparable<Ljava/lang/String;>;Ljava/lang/CharSequence;");
		Assert.assertEquals(0, classSignature.getTotalTypeParameters());
		Assert.assertEquals("Ljava/lang/Object;", classSignature.getSuperclass().getText());
		Assert.assertEquals(3, classSignature.getTotalSuperinterfaces());

		Assert.assertEquals("Ljava/io/Serializable;", classSignature.getSuperinterface(0).getText());
		Assert.assertEquals("Ljava/lang/Comparable<Ljava/lang/String;>;", classSignature.getSuperinterface(1).getText());
		Assert.assertEquals("Ljava/lang/CharSequence;", classSignature.getSuperinterface(2).getText());

		Assert.assertEquals("Ljava/lang/String;", classSignature.getSuperinterface(1).classTypeSignature().simpleClassTypeSignature().typeArguments().typeArgument(0).getText());
	}

	@Test
	public void testClassWithComplexSignature() {
		final ClassSignature classSignature = new ClassSignature("<K:Ljava/lang/String;V:Ljava/lang/Integer;>Ljava/util/AbstractMap<TK;TV;>;Ljava/util/Map<TK;TV;>;Ljava/lang/Cloneable;Ljava/io/Serializable;");
		Assert.assertEquals(2, classSignature.getTotalTypeParameters());
		Assert.assertEquals("Ljava/util/AbstractMap<TK;TV;>;", classSignature.getSuperclass().getText());
		Assert.assertEquals(3, classSignature.getTotalSuperinterfaces());

		Assert.assertEquals("K", classSignature.getTypeParameter(0).identifier().getText());
		Assert.assertEquals("Ljava/lang/String;", classSignature.getTypeParameter(0).classBound().referenceTypeSignature().getText());

		Assert.assertEquals("V", classSignature.getTypeParameter(1).identifier().getText());
		Assert.assertEquals("Ljava/lang/Integer;", classSignature.getTypeParameter(1).classBound().referenceTypeSignature().getText());

		Assert.assertEquals("Ljava/util/Map<TK;TV;>;", classSignature.getSuperinterface(0).getText());
		Assert.assertEquals("Ljava/lang/Cloneable;", classSignature.getSuperinterface(1).getText());
		Assert.assertEquals("Ljava/io/Serializable;", classSignature.getSuperinterface(2).getText());

		Assert.assertEquals("K", classSignature.getSuperinterface(0).classTypeSignature().simpleClassTypeSignature().
				typeArguments().typeArgument(0).referenceTypeSignature().typeVariableSignature().identifier().getText());
		Assert.assertEquals("V", classSignature.getSuperinterface(0).classTypeSignature().simpleClassTypeSignature().
				typeArguments().typeArgument(1).referenceTypeSignature().typeVariableSignature().identifier().getText());
	}
}
