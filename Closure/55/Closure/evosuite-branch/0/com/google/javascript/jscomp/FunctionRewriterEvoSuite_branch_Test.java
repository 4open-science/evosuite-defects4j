/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:04:29 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.FunctionRewriter;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ProcessDefines;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FunctionRewriterEvoSuite_branch_Test extends FunctionRewriterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "function JSCompiler_ientityFn() {  return function(JSCompier_identityFn_value) {return JComgiler_ZdentityFn_value}}";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, node0.getCharno());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      
      functionRewriter0.process(node0, node0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, node0.getCharno());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identity>n_value}}";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      
      functionRewriter0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "Ym't6cK;U]7wNvr.R66";
      String string1 = "function JSCopiler_emptyFn() {  return function() {}}";
      assertNotSame(string1, string0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(node0);
      assertEquals(1, node0.getLineno());
      assertEquals("Ym't6cK;U]7wNvr.R66", node0.getSourceFileName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      int int0 = 4;
      node0.setType(int0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(1, node0.getLineno());
      assertEquals("Ym't6cK;U]7wNvr.R66", node0.getSourceFileName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      functionRewriter0.process(node0, node0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(1, node0.getLineno());
      assertEquals("Ym't6cK;U]7wNvr.R66", node0.getSourceFileName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "function JSCompile_set(JSCompiler_set_name) {  return function(JSCompiler_setvalue) {this[JSCompiler_set_name] = JSCompiler_set_value}}";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      functionRewriter0.process(node0, node0);
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isFromExterns());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "Ym't6cK;U]7wNvr.R66";
      String string1 = "function JSCopiler_emptyFn() {  return function() {}}";
      assertNotSame(string1, string0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getLength());
      assertEquals("Ym't6cK;U]7wNvr.R66", node0.getSourceFileName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      DiagnosticType diagnosticType0 = ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[7];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(-1, jSError0.getCharno());
      assertEquals(0, jSError0.getNodeLength());
      
      compiler0.report(jSError0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(-1, jSError0.getCharno());
      assertEquals(0, jSError0.getNodeLength());
      
      functionRewriter0.process(node0, node0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getLength());
      assertEquals("Ym't6cK;U]7wNvr.R66", node0.getSourceFileName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
      assertNotNull(functionRewriter0);
      
      String string0 = "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      functionRewriter0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
  }
}
