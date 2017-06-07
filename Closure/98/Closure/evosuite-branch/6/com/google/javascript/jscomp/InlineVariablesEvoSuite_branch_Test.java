/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 02:04:45 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineVariablesEvoSuite_branch_Test extends InlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      boolean boolean0 = false;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      int int0 = 40;
      Node node0 = Node.newNumber((double) int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(40, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(40, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(abstractCompiler0, inlineVariables_Mode0, boolean0);
      assertNotNull(inlineVariables0);
      
      int int0 = 2;
      Node node0 = Node.newNumber((double) int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(39, node0.getType());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(2, node0.getLineno());
      assertEquals(2, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
