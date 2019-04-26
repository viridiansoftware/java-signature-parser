// Generated from Signature.g4 by ANTLR 4.7.2
package com.viridiansoftware.java.signature.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SignatureParser}.
 */
public interface SignatureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SignatureParser#classSignature}.
	 * @param ctx the parse tree
	 */
	void enterClassSignature(SignatureParser.ClassSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#classSignature}.
	 * @param ctx the parse tree
	 */
	void exitClassSignature(SignatureParser.ClassSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(SignatureParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(SignatureParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#fieldSignature}.
	 * @param ctx the parse tree
	 */
	void enterFieldSignature(SignatureParser.FieldSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#fieldSignature}.
	 * @param ctx the parse tree
	 */
	void exitFieldSignature(SignatureParser.FieldSignatureContext ctx);
}