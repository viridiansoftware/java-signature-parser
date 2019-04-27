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
	}

	@Test
	public void testReturnObjectMethodWithGenerics() {

	}

	@Test
	public void testReturnObjectMethodWithTypeParameters() {

	}
}
