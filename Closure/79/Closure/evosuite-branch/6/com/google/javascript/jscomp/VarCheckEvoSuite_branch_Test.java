/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:41:45 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.VarCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class VarCheckEvoSuite_branch_Test extends VarCheckEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "msg.va^args.fun";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("msg.va^args.fun", jSSourceFile0.getOriginalPath());
      assertEquals("msg.va^args.fun", jSSourceFile0.toString());
      assertEquals("msg.va^args.fun", jSSourceFile0.getName());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals("msg.va^args.fun", jSSourceFile0.getOriginalPath());
      assertEquals("msg.va^args.fun", jSSourceFile0.toString());
      assertEquals("msg.va^args.fun", jSSourceFile0.getName());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getChildCount());
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
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
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "y";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(node0);
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      boolean boolean0 = true;
      VarCheck varCheck0 = new VarCheck(compiler0, boolean0);
      assertNotNull(varCheck0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      int int0 = 181;
      Node node1 = new Node(int0, node0, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertNotNull(node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(181, node1.getType());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = ";tX-p$^Mu<4";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.getName());
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.toString());
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.getOriginalPath());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.getName());
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.toString());
      assertEquals(";tX-p$^Mu<4", jSSourceFile0.getOriginalPath());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      // Undeclared exception!
      try {
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) varCheck0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "dug,pliae";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("dug,pliae", jSSourceFile0.getName());
      assertEquals("dug,pliae", jSSourceFile0.toString());
      assertEquals("dug,pliae", jSSourceFile0.getOriginalPath());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals("dug,pliae", jSSourceFile0.getName());
      assertEquals("dug,pliae", jSSourceFile0.toString());
      assertEquals("dug,pliae", jSSourceFile0.getOriginalPath());
      
      VarCheck varCheck0 = new VarCheck(compiler0);
      assertNotNull(varCheck0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      // Undeclared exception!
      try {
        varCheck0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
