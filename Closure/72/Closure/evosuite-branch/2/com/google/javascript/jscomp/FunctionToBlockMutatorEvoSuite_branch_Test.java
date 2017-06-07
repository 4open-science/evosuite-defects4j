/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:07:26 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionToBlockMutator;
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
      String string0 = "anon";
      boolean boolean0 = false;
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      String string1 = functionToBlockMutator_LabelNameSupplier0.get();
      assertNotNull(string1);
      assertEquals("JSCompiler_inline_label_0", string1);
      assertNotSame(string1, string0);
      assertFalse(string1.equals((Object)string0));
      
      FunctionToBlockMutator functionToBlockMutator0 = new FunctionToBlockMutator(compiler0, functionToBlockMutator_LabelNameSupplier0);
      assertNotNull(functionToBlockMutator0);
      
      Node node0 = compiler0.parseSyntheticCode(string1, string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(132, node0.getType());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.hasOneChild());
      assertEquals(1, node0.getLineno());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(1, node0.getChildCount());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      // Undeclared exception!
      try {
        Node node1 = functionToBlockMutator0.mutate(string0, node0, node0, string1, boolean0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
