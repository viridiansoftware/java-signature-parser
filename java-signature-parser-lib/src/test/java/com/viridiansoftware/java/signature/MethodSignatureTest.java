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

public class MethodSignatureTest {

	@Test
	public void testVoidMethodWithNoArguments() {
		final MethodSignature methodSignature = new MethodSignature("()V");
		Assert.assertEquals(true, methodSignature.isVoidMethod());
		Assert.assertEquals(0, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(0, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());
	}

	@Test
	public void testVoidMethodWithArguments() {
		final MethodSignature methodSignature = new MethodSignature("(IBLjava/lang/Object;)V");
		Assert.assertEquals(true, methodSignature.isVoidMethod());
		Assert.assertEquals(0, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(3, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());
	}

	@Test
	public void testReturnObjectMethodNoArguments() {
		final MethodSignature methodSignature = new MethodSignature("()Ljava/lang/String;");
		Assert.assertEquals(false, methodSignature.isVoidMethod());
		Assert.assertEquals(0, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(0, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());

		Assert.assertEquals("java/lang/String", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getReturnType().referenceTypeSignature().classTypeSignature()));
	}

	@Test
	public void testReturnObjectMethodWithArguments() {
		final MethodSignature methodSignature = new MethodSignature("(IZ)Ljava/lang/String;");
		Assert.assertEquals(false, methodSignature.isVoidMethod());
		Assert.assertEquals(0, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(2, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());

		Assert.assertEquals("java/lang/String", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getReturnType().referenceTypeSignature().classTypeSignature()));

		Assert.assertEquals("I", methodSignature.getMethodArgument(0).BaseType().getText());
		Assert.assertEquals("Z", methodSignature.getMethodArgument(1).BaseType().getText());
	}

	@Test
	public void testReturnObjectMethodWithGenerics() {
		final MethodSignature methodSignature = new MethodSignature("(Ljava/lang/Object;TV;)Ljava/lang/List<TK;>;");
		Assert.assertEquals(false, methodSignature.isVoidMethod());
		Assert.assertEquals(0, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(2, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());

		Assert.assertEquals("java/lang/List", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getReturnType().referenceTypeSignature().classTypeSignature()));

		Assert.assertEquals("java/lang/Object", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getMethodArgument(0).referenceTypeSignature().classTypeSignature()));
		Assert.assertEquals("V", methodSignature.getMethodArgument(1).referenceTypeSignature().
				typeVariableSignature().identifier().getText());
	}

	@Test
	public void testReturnObjectMethodWithTypeParameters() {
		final MethodSignature methodSignature = new MethodSignature("<E:Ljava/lang/Object;>([TE;)Ljava/lang/List<TE;>;");
		Assert.assertEquals(false, methodSignature.isVoidMethod());
		Assert.assertEquals(1, methodSignature.getTotalTypeParameters());
		Assert.assertEquals(1, methodSignature.getTotalMethodArguments());
		Assert.assertEquals(0, methodSignature.getTotalThrowsSignatures());

		Assert.assertEquals("java/lang/List", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getReturnType().referenceTypeSignature().classTypeSignature()));

		Assert.assertEquals("E", methodSignature.getMethodArgument(0).referenceTypeSignature().
				arrayTypeSignature().javaTypeSignature().referenceTypeSignature().typeVariableSignature().identifier().getText());

		Assert.assertEquals("E", methodSignature.getTypeParameter(0).identifier().getText());
		Assert.assertEquals("java/lang/Object", SignatureUtils.toQualifiedSimpleName(
				methodSignature.getTypeParameter(0).classBound().referenceTypeSignature().classTypeSignature()));
	}
}
