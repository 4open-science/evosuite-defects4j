/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:11:04 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnreachableCodeEliminationEvoSuite_branch_Test extends UnreachableCodeEliminationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "T!to";
      String string1 = "com.google.javascript.jscomp.Defa=ltCodingConve2tion";
      assertNotSame(string1, string0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(node0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      
      unreachableCodeElimination0.process(node0, node0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "OT";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
  }

  @Test
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean0 = FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      assertFalse(boolean0);
      
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(abstractCompiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) unreachableCodeElimination0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      String string0 = "IS_NULL";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("IS_NULL", jSSourceFile0.toString());
      assertEquals("IS_NULL", jSSourceFile0.getOriginalPath());
      assertEquals("IS_NULL", jSSourceFile0.getName());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals("IS_NULL", jSSourceFile0.toString());
      assertEquals("IS_NULL", jSSourceFile0.getOriginalPath());
      assertEquals("IS_NULL", jSSourceFile0.getName());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      
      unreachableCodeElimination0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals("IS_NULL", jSSourceFile0.toString());
      assertEquals("IS_NULL", jSSourceFile0.getOriginalPath());
      assertEquals("IS_NULL", jSSourceFile0.getName());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = false;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "T!";
      String string1 = "com.googlejavascript.jscomp.DefaulCodigConvention";
      assertNotSame(string1, string0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(node0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      
      unreachableCodeElimination0.process(node0, node0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
  }
}
