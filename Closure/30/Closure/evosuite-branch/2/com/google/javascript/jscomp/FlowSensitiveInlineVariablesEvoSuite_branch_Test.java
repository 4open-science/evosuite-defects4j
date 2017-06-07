/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:42:33 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FlowSensitiveInlineVariablesEvoSuite_branch_Test extends FlowSensitiveInlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node0 = null;
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      // Undeclared exception!
      try {
        compiler0.process(flowSensitiveInlineVariables0);
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
