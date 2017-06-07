/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:38:11 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.graph.DiGraph;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ControlFlowGraphEvoSuite_branch_Test extends ControlFlowGraphEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_FALSE;
      assertEquals(1, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.name());
      assertEquals(ControlFlowGraph.Branch.ON_FALSE, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals(1, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.name());
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_TRUE;
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertEquals(ControlFlowGraph.Branch.ON_TRUE, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "lB{dCco{?y0";
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(ControlFlowGraph.Branch.ON_EX, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertFalse(boolean0);
      
      ControlFlowGraph<Object> controlFlowGraph0 = new ControlFlowGraph<Object>(string0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      DiGraph.DiGraphNode<Object, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = controlFlowGraph0.getImplicitReturn();
      assertNotNull(diGraph_DiGraphNode0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      boolean boolean1 = controlFlowGraph0.isImplicitReturn(diGraph_DiGraphNode0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertTrue(boolean1);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = true;
      ControlFlowGraph<Object> controlFlowGraph0 = new ControlFlowGraph<Object>(string0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      DiGraph.DiGraphNode<Object, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = null;
      boolean boolean1 = controlFlowGraph0.isImplicitReturn(diGraph_DiGraphNode0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertFalse(boolean1);
  }

  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = true;
      int int0 = 1249;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1249, (int)integer0);
      
      ControlFlowGraph<Integer> controlFlowGraph0 = new ControlFlowGraph<Integer>(integer0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_TRUE;
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertEquals(ControlFlowGraph.Branch.ON_TRUE, controlFlowGraph_Branch0);
      
      controlFlowGraph0.connectToImplicitReturn(integer0, (ControlFlowGraph.Branch) controlFlowGraph_Branch0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
  }

  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = true;
      int int0 = 1249;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1249, (int)integer0);
      
      ControlFlowGraph<Integer> controlFlowGraph0 = new ControlFlowGraph<Integer>(integer0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      
      DiGraph.DiGraphNode<Integer, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = controlFlowGraph0.getEntry();
      assertNotNull(diGraph_DiGraphNode0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = true;
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(ControlFlowGraph.Branch.ON_EX, controlFlowGraph_Branch0);
      
      boolean boolean1 = controlFlowGraph_Branch0.isConditional();
      assertFalse(boolean1 == boolean0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertFalse(boolean1);
      
      Integer integer0 = null;
      ControlFlowGraph<Integer> controlFlowGraph0 = new ControlFlowGraph<Integer>(integer0, boolean0, boolean1);
      assertNotNull(controlFlowGraph0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      Comparator<DiGraph.DiGraphNode<Integer, ControlFlowGraph.Branch>> comparator0 = controlFlowGraph0.getOptionalNodeComparator(boolean1);
      assertNull(comparator0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals("ON_EX", controlFlowGraph_Branch0.toString());
      assertEquals(3, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_EX", controlFlowGraph_Branch0.name());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
  }
}
