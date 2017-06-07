/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:28:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
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
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(syntacticScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, (ScopeCreator) syntacticScopeCreator0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      Node node0 = null;
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(syntacticScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, (ScopeCreator) syntacticScopeCreator0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(syntacticScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, (ScopeCreator) syntacticScopeCreator0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        flowSensitiveInlineVariables0.process(node0, node0);
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
