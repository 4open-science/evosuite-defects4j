/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:16:51 GMT 2014
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
import org.evosuite.runtime.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ControlFlowGraphEvoSuite_branch_Test extends ControlFlowGraphEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_FALSE;
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.name());
      assertEquals(1, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.toString());
      assertEquals(ControlFlowGraph.Branch.ON_FALSE, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.name());
      assertEquals(1, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_FALSE", controlFlowGraph_Branch0.toString());
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.SYN_BLOCK;
      assertEquals("SYN_BLOCK", controlFlowGraph_Branch0.toString());
      assertEquals("SYN_BLOCK", controlFlowGraph_Branch0.name());
      assertEquals(4, controlFlowGraph_Branch0.ordinal());
      assertEquals(ControlFlowGraph.Branch.SYN_BLOCK, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals("SYN_BLOCK", controlFlowGraph_Branch0.toString());
      assertEquals("SYN_BLOCK", controlFlowGraph_Branch0.name());
      assertEquals(4, controlFlowGraph_Branch0.ordinal());
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_TRUE;
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertEquals(ControlFlowGraph.Branch.ON_TRUE, controlFlowGraph_Branch0);
      
      boolean boolean0 = controlFlowGraph_Branch0.isConditional();
      assertEquals(0, controlFlowGraph_Branch0.ordinal());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.toString());
      assertEquals("ON_TRUE", controlFlowGraph_Branch0.name());
      assertTrue(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      byte byte0 = (byte)0;
      Integer integer0 = new Integer((int) byte0);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = true;
      ControlFlowGraph<Integer> controlFlowGraph0 = new ControlFlowGraph<Integer>(integer0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      ControlFlowGraph<Object> controlFlowGraph1 = new ControlFlowGraph<Object>(controlFlowGraph0, boolean0, boolean0);
      assertNotNull(controlFlowGraph1);
      assertEquals(true, controlFlowGraph1.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph1.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      DiGraph.DiGraphNode<Object, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = controlFlowGraph1.getImplicitReturn();
      assertNotNull(diGraph_DiGraphNode0);
      assertEquals(true, controlFlowGraph1.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph1.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      boolean boolean1 = controlFlowGraph1.isImplicitReturn(diGraph_DiGraphNode0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertEquals(true, controlFlowGraph1.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph1.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertTrue(boolean1);
  }

  @Test
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "\\.prSotype \\.";
      byte byte0 = (byte)36;
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      Integer integer0 = new Integer((int) byte0);
      assertEquals(36, (int)integer0);
      
      ControlFlowGraph<Integer> controlFlowGraph0 = new ControlFlowGraph<Integer>(integer0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      
      ControlFlowGraph<Object> controlFlowGraph1 = new ControlFlowGraph<Object>(controlFlowGraph0, boolean0, boolean0);
      assertNotNull(controlFlowGraph1);
      assertEquals(true, controlFlowGraph1.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph1.getName());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      
      DiGraph.DiGraphNode<Object, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = null;
      boolean boolean1 = controlFlowGraph1.isImplicitReturn(diGraph_DiGraphNode0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(true, controlFlowGraph1.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph1.getName());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      assertFalse(boolean1);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "/D/p<V`&f$";
      boolean boolean0 = true;
      ControlFlowGraph<String> controlFlowGraph0 = new ControlFlowGraph<String>(string0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.UNCOND;
      controlFlowGraph0.connectToImplicitReturn(string0, (ControlFlowGraph.Branch) controlFlowGraph_Branch0);
      assertEquals(true, controlFlowGraph0.isDirected());
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "/D/p<V`&f$";
      boolean boolean0 = true;
      ControlFlowGraph<String> controlFlowGraph0 = new ControlFlowGraph<String>(string0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      
      DiGraph.DiGraphNode<String, ControlFlowGraph.Branch> diGraph_DiGraphNode0 = controlFlowGraph0.getEntry();
      assertNotNull(diGraph_DiGraphNode0);
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = "/D/p<V`&f$";
      boolean boolean0 = true;
      ControlFlowGraph<String> controlFlowGraph0 = new ControlFlowGraph<String>(string0, boolean0, boolean0);
      assertNotNull(controlFlowGraph0);
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
      
      Comparator<DiGraph.DiGraphNode<String, ControlFlowGraph.Branch>> comparator0 = controlFlowGraph0.getOptionalNodeComparator(boolean0);
      assertNull(comparator0);
      assertEquals("LinkedGraph", controlFlowGraph0.getName());
      assertEquals(true, controlFlowGraph0.isDirected());
  }
}
