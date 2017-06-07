/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:47:56 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MaybeReachingVariableUseEvoSuite_branch_Test extends MaybeReachingVariableUseEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals((Object) maybeReachingVariableUse_ReachingUses0);
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      CompilerOptions.LanguageMode compilerOptions_LanguageMode0 = CompilerOptions.LanguageMode.ECMASCRIPT3;
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions_LanguageMode0);
      assertEquals("ECMASCRIPT3", compilerOptions_LanguageMode0.toString());
      assertEquals("ECMASCRIPT3", compilerOptions_LanguageMode0.name());
      assertEquals(0, compilerOptions_LanguageMode0.ordinal());
      
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals((Object) compilerOptions_LanguageMode0);
      assertFalse(boolean0);
      assertEquals("ECMASCRIPT3", compilerOptions_LanguageMode0.toString());
      assertEquals("ECMASCRIPT3", compilerOptions_LanguageMode0.name());
      assertEquals(0, compilerOptions_LanguageMode0.ordinal());
  }

  @Test
  public void test2()  throws Throwable  {
      ControlFlowGraph<Node> controlFlowGraph0 = null;
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(defaultPassConfig0);
      
      Scope scope0 = defaultPassConfig0.getTopScope();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(scope0);
      
      MaybeReachingVariableUse maybeReachingVariableUse0 = null;
      try {
        maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      boolean boolean0 = false;
      ControlFlowGraph<Object> controlFlowGraph0 = new ControlFlowGraph<Object>(maybeReachingVariableUse_ReachingUses0, boolean0, boolean0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertNotNull(controlFlowGraph0);
  }

  @Test
  public void test4()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
      
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = new MaybeReachingVariableUse.ReachingUses(maybeReachingVariableUse_ReachingUses0);
      assertTrue(maybeReachingVariableUse_ReachingUses0.equals((Object)maybeReachingVariableUse_ReachingUses1));
      assertTrue(maybeReachingVariableUse_ReachingUses1.equals((Object)maybeReachingVariableUse_ReachingUses0));
      assertNotSame(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses1);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
      assertNotNull(maybeReachingVariableUse_ReachingUses1);
  }
}
