/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:32:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
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
      
      String string0 = "com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getOriginalPath());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getName());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.toString());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getOriginalPath());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getName());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.toString());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getOriginalPath());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.getName());
      assertEquals("com.google.prtouf.Descriptors$FieldDesc=iptor$Javaype", jSSourceFile0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "PJsztf4";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("PJsztf4", jSSourceFile0.getOriginalPath());
      assertEquals("PJsztf4", jSSourceFile0.getName());
      assertEquals("PJsztf4", jSSourceFile0.toString());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getLineno());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals("PJsztf4", jSSourceFile0.getOriginalPath());
      assertEquals("PJsztf4", jSSourceFile0.getName());
      assertEquals("PJsztf4", jSSourceFile0.toString());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(1, node0.getLineno());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals("PJsztf4", jSSourceFile0.getOriginalPath());
      assertEquals("PJsztf4", jSSourceFile0.getName());
      assertEquals("PJsztf4", jSSourceFile0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[8];
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(abstractCompiler0, abstractPeepholeOptimizationArray0);
      assertNotNull(peepholeOptimizationsPass0);
      
      AbstractCompiler abstractCompiler1 = peepholeOptimizationsPass0.getCompiler();
      assertNull(abstractCompiler1);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(abstractCompiler1, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler1, (NodeTraversal.Callback) peepholeOptimizationsPass0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      String string0 = "Removing ";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      unreachableCodeElimination0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = false;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      
      String string0 = "Pj;Jstf4";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("Pj;Jstf4", jSSourceFile0.toString());
      assertEquals("Pj;Jstf4", jSSourceFile0.getOriginalPath());
      assertEquals("Pj;Jstf4", jSSourceFile0.getName());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals("Pj;Jstf4", jSSourceFile0.toString());
      assertEquals("Pj;Jstf4", jSSourceFile0.getOriginalPath());
      assertEquals("Pj;Jstf4", jSSourceFile0.getName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(2, node0.getChildCount());
      
      unreachableCodeElimination0.process(node0, node0);
      assertEquals("Pj;Jstf4", jSSourceFile0.toString());
      assertEquals("Pj;Jstf4", jSSourceFile0.getOriginalPath());
      assertEquals("Pj;Jstf4", jSSourceFile0.getName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(2, node0.getChildCount());
  }
}