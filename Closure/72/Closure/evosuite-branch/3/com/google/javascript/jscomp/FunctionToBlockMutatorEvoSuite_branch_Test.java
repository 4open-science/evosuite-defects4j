/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:28:32 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FunctionToBlockMutatorEvoSuite_branch_Test extends FunctionToBlockMutatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      int int0 = 2104;
      String string0 = functionToBlockMutator_LabelNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("JSCompiler_inline_label_a", string0);
      
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(2104, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      FunctionToBlockMutator functionToBlockMutator0 = new FunctionToBlockMutator(compiler0, functionToBlockMutator_LabelNameSupplier0);
      assertNotNull(functionToBlockMutator0);
      
      boolean boolean0 = false;
      // Undeclared exception!
      try {
        Node node1 = functionToBlockMutator0.mutate(string0, node0, node0, string0, boolean0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
