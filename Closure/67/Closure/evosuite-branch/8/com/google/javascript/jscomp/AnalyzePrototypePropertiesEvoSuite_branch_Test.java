/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:40:14 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AnalyzePrototypeProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Deque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AnalyzePrototypePropertiesEvoSuite_branch_Test extends AnalyzePrototypePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModule[] jSModuleArray0 = new JSModule[1];
      String string0 = "/$b";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("/$b", jSModule0.toString());
      assertEquals("/$b", jSModule0.getName());
      
      jSModuleArray0[0] = jSModule0;
      assertNotNull(jSModuleArray0[0]);
      assertEquals(-1, jSModule0.getDepth());
      assertEquals("/$b", jSModule0.toString());
      assertEquals("/$b", jSModule0.getName());
      assertEquals(-1, jSModuleArray0[0].getDepth());
      assertEquals("/$b", jSModuleArray0[0].getName());
      assertEquals("/$b", jSModuleArray0[0].toString());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      assertNotNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      boolean boolean1 = analyzePrototypeProperties_NameInfo0.markReference(jSModule0);
      assertEquals("/$b", jSModule0.toString());
      assertEquals("/$b", jSModule0.getName());
      assertEquals(0, jSModule0.getDepth());
      assertTrue(boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      
      boolean boolean2 = analyzePrototypeProperties_NameInfo0.markReference(jSModule0);
      assertEquals("/$b", jSModule0.toString());
      assertEquals("/$b", jSModule0.getName());
      assertEquals(0, jSModule0.getDepth());
      assertFalse(boolean2);
      assertFalse(boolean0 == boolean1);
      assertTrue(boolean0 == boolean2);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      JSModule jSModule0 = analyzePrototypeProperties_NameInfo0.getDeepestCommonModuleRef();
      assertNull(jSModule0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getChildCount());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      AnalyzePrototypeProperties.GlobalFunction analyzePrototypeProperties_GlobalFunction0 = null;
      try {
        analyzePrototypeProperties_GlobalFunction0 = analyzePrototypeProperties0.new GlobalFunction(node0, node0, node0, jSModule0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "[gl=baW]";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      analyzePrototypeProperties0.process(node0, node0);
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
  }

  @Test
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "msg.XM.bad.frm";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
      
      analyzePrototypeProperties0.process(node0, node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
  }

  @Test
  public void test04()  throws Throwable  {
      Node node0 = null;
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = null;
      boolean boolean0 = true;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      // Undeclared exception!
      try {
        analyzePrototypeProperties0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      Collection<AnalyzePrototypeProperties.NameInfo> collection0 = analyzePrototypeProperties0.getAllNameInfo();
      assertNotNull(collection0);
  }

  @Test
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      String string1 = analyzePrototypeProperties_NameInfo0.toString();
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("kF", string1);
  }

  @Test
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      boolean boolean1 = analyzePrototypeProperties_NameInfo0.readsClosureVariables();
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
  }

  @Test
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      Deque<AnalyzePrototypeProperties.Symbol> deque0 = analyzePrototypeProperties_NameInfo0.getDeclarations();
      assertNotNull(deque0);
      assertEquals(0, deque0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      JSModule jSModule0 = analyzePrototypeProperties_NameInfo0.getDeepestCommonModuleRef();
      assertNull(jSModule0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_AssignmentProperty0);
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      Node node1 = analyzePrototypeProperties_AssignmentProperty0.getValue();
      assertNotNull(node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(38, node1.getType());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(4096, node1.getSourcePosition());
      assertEquals(1, node1.getLineno());
      assertEquals(true, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(true, node1.isQualifiedName());
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
  }

  @Test
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      JSModule jSModule0 = analyzePrototypeProperties_NameInfo0.getDeepestCommonModuleRef();
      assertNull(jSModule0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_AssignmentProperty0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      
      Node node1 = analyzePrototypeProperties_AssignmentProperty0.getPrototype();
      assertNull(node1);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
  }

  @Test
  public void test11()  throws Throwable  {
      Node node0 = null;
      JSModule jSModule0 = null;
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_AssignmentProperty0);
      
      JSModule jSModule1 = analyzePrototypeProperties_AssignmentProperty0.getModule();
      assertNull(jSModule1);
  }

  @Test
  public void test12()  throws Throwable  {
      Node node0 = null;
      JSModule jSModule0 = null;
      AnalyzePrototypeProperties.AssignmentProperty analyzePrototypeProperties_AssignmentProperty0 = new AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_AssignmentProperty0);
      
      // Undeclared exception!
      try {
        analyzePrototypeProperties_AssignmentProperty0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Node node0 = null;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      assertNotNull(nameReferenceGraph_Reference0);
      
      JSModule jSModule0 = nameReferenceGraph_Reference0.getModule();
      assertNull(jSModule0);
      
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_LiteralProperty0);
      
      JSModule jSModule1 = analyzePrototypeProperties_LiteralProperty0.getModule();
      assertNull(jSModule1);
  }

  @Test
  public void test14()  throws Throwable  {
      Node node0 = null;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      assertNotNull(nameReferenceGraph_Reference0);
      
      JSModule jSModule0 = nameReferenceGraph_Reference0.getModule();
      assertNull(jSModule0);
      
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_LiteralProperty0);
      
      // Undeclared exception!
      try {
        Node node1 = analyzePrototypeProperties_LiteralProperty0.getPrototype();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Node node0 = null;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      assertNotNull(nameReferenceGraph_Reference0);
      
      JSModule jSModule0 = nameReferenceGraph_Reference0.getModule();
      assertNull(jSModule0);
      
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_LiteralProperty0);
      
      Node node1 = analyzePrototypeProperties_LiteralProperty0.getValue();
      assertNull(node1);
  }

  @Test
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      JSModuleGraph jSModuleGraph0 = compiler0.getModuleGraph();
      assertNull(jSModuleGraph0);
      
      boolean boolean0 = false;
      AnalyzePrototypeProperties analyzePrototypeProperties0 = new AnalyzePrototypeProperties(compiler0, jSModuleGraph0, boolean0, boolean0);
      assertNotNull(analyzePrototypeProperties0);
      
      String string0 = "kF";
      AnalyzePrototypeProperties.NameInfo analyzePrototypeProperties_NameInfo0 = analyzePrototypeProperties0.new NameInfo(string0);
      assertNotNull(analyzePrototypeProperties_NameInfo0);
      
      JSModule jSModule0 = analyzePrototypeProperties_NameInfo0.getDeepestCommonModuleRef();
      assertNull(jSModule0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      AnalyzePrototypeProperties.LiteralProperty analyzePrototypeProperties_LiteralProperty0 = new AnalyzePrototypeProperties.LiteralProperty(node0, node0, node0, node0, jSModule0);
      assertNotNull(analyzePrototypeProperties_LiteralProperty0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      // Undeclared exception!
      try {
        analyzePrototypeProperties_LiteralProperty0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
      }
  }
}
