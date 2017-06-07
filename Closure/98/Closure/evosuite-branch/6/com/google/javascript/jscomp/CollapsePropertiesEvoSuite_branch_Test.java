/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 02:15:17 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CollapsePropertiesEvoSuite_branch_Test extends CollapsePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      assertFalse(boolean0);
      
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean1 = true;
      assertFalse(boolean1 == boolean0);
      
      CollapseProperties collapseProperties0 = new CollapseProperties(abstractCompiler0, boolean0, boolean1);
      assertNotNull(collapseProperties0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      
      int int0 = 732;
      String string0 = "]9p";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(732, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      
      collapseProperties0.process(node0, node0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals(732, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, boolean0, boolean0);
      assertNotNull(collapseProperties0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        collapseProperties0.process(node0, node0);
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
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      assertFalse(boolean0);
      
      AbstractCompiler abstractCompiler0 = null;
      CollapseProperties collapseProperties0 = new CollapseProperties(abstractCompiler0, boolean0, boolean0);
      assertNotNull(collapseProperties0);
      
      int int0 = 732;
      String string0 = "]9p";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(732, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      
      collapseProperties0.process(node0, node0);
      assertEquals(732, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
  }
}
