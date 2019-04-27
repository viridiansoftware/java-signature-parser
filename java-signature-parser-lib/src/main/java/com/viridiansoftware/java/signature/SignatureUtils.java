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

import com.viridiansoftware.java.signature.antlr.SignatureParser;

public class SignatureUtils {

	private static void appendPackageSpecifier(StringBuilder result, SignatureParser.PackageSpecifierContext packageSpecifierContext) {
		if(packageSpecifierContext == null) {
			return;
		}
		result.append(packageSpecifierContext.identifier().getText());
		result.append('/');

		if(packageSpecifierContext.packageSpecifier() == null) {
			return;
		}
		for(int i = 0; i < packageSpecifierContext.packageSpecifier().size(); i++) {
			appendPackageSpecifier(result, packageSpecifierContext.packageSpecifier(i));
		}
	}

	public static String toQualifiedSimpleName(SignatureParser.ClassTypeSignatureContext classTypeSignatureContext) {
		final StringBuilder result = new StringBuilder();
		SignatureParser.PackageSpecifierContext packageSpecifierContext = classTypeSignatureContext.packageSpecifier();
		appendPackageSpecifier(result, packageSpecifierContext);
		result.append(classTypeSignatureContext.simpleClassTypeSignature().identifier().getText());
		return result.toString();
	}

	public static String toQualifiedSimpleNameWithGenerics(SignatureParser.ClassTypeSignatureContext classTypeSignatureContext) {
		final StringBuilder result = new StringBuilder();
		SignatureParser.PackageSpecifierContext packageSpecifierContext = classTypeSignatureContext.packageSpecifier();
		appendPackageSpecifier(result, packageSpecifierContext);
		result.append(classTypeSignatureContext.simpleClassTypeSignature().identifier().getText());

		if(classTypeSignatureContext.simpleClassTypeSignature().typeArguments() != null
			&& classTypeSignatureContext.simpleClassTypeSignature().typeArguments().typeArgument() != null) {
			result.append('<');
			for(int i = 0; i < classTypeSignatureContext.simpleClassTypeSignature().typeArguments().typeArgument().size(); i++) {
				result.append(classTypeSignatureContext.simpleClassTypeSignature().typeArguments().typeArgument(i).getText());
			}
			result.append('>');
		}

		return result.toString();
	}
}
