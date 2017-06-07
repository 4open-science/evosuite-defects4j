/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:10:49 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MustBeReachingVariableDef;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MustBeReachingVariableDefEvoSuite_branch_Test extends MustBeReachingVariableDefEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      assertNotNull(mustBeReachingVariableDef_MustDef0);
      
      boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals((Object) mustBeReachingVariableDef_MustDef0);
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      assertNotNull(mustBeReachingVariableDef_MustDef0);
      
      CompilerOptions compilerOptions0 = null;
      boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals((Object) compilerOptions0);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      assertNotNull(mustBeReachingVariableDef_MustDef0);
      
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = new MustBeReachingVariableDef.MustDef(mustBeReachingVariableDef_MustDef0);
      assertNotNull(mustBeReachingVariableDef_MustDef1);
      assertTrue(mustBeReachingVariableDef_MustDef1.equals((Object)mustBeReachingVariableDef_MustDef0));
      assertTrue(mustBeReachingVariableDef_MustDef0.equals((Object)mustBeReachingVariableDef_MustDef1));
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef1);
  }

  @Test
  public void test3()  throws Throwable  {
      Node node0 = null;
      Node node1 = AbstractPeepholeOptimization.validateResult(node0);
      assertNull(node1);
      
      boolean boolean0 = false;
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Scope scope0 = compiler0.getTopScope();
      assertNull(scope0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      MustBeReachingVariableDef mustBeReachingVariableDef0 = null;
      try {
        mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
