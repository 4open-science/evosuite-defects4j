/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:51:54 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineObjectLiteralsEvoSuite_branch_Test extends InlineObjectLiteralsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Supplier<String> supplier0 = null;
      Compiler compiler0 = null;
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, supplier0);
      assertNotNull(inlineObjectLiterals0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}