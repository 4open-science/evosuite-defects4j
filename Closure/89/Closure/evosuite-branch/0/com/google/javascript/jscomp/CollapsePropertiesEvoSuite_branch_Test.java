/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:46:52 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CollapsePropertiesEvoSuite_branch_Test extends CollapsePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean0 = false;
      boolean boolean1 = true;
      CollapseProperties collapseProperties0 = new CollapseProperties(abstractCompiler0, boolean0, boolean1);
      assertNotNull(collapseProperties0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      
      int int0 = (-1076);
      Node node0 = Node.newNumber((double) int0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(39, node0.getType());
      
      collapseProperties0.process(node0, node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(39, node0.getType());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean0 = true;
      CollapseProperties collapseProperties0 = new CollapseProperties(abstractCompiler0, boolean0, boolean0);
      assertNotNull(collapseProperties0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        collapseProperties0.process(node0, node0);
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
      boolean boolean0 = false;
      CollapseProperties collapseProperties0 = new CollapseProperties(abstractCompiler0, boolean0, boolean0);
      assertNotNull(collapseProperties0);
      
      int int0 = (-1076);
      Node node0 = Node.newNumber((double) int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      
      collapseProperties0.process(node0, node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
  }
}