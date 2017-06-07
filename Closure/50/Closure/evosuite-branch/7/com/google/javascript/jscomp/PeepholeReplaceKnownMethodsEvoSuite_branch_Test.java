/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:15:52 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PeepholeReplaceKnownMethodsEvoSuite_branch_Test extends PeepholeReplaceKnownMethodsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      assertNotNull(minimizeExitPoints0);
      
      MemoizedScopeCreator memoizedScopeCreator0 = compiler0.getTypedScopeCreator();
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) minimizeExitPoints0, (ScopeCreator) memoizedScopeCreator0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 37;
      String string0 = "=&\\9=cq~";
      Node node0 = Node.newString(string0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0, node0, int0, int0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getLength());
      assertEquals(37, node1.getLineno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(37, node1.getCharno());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isFromExterns());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(151589, node1.getSourcePosition());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      Node node2 = peepholeReplaceKnownMethods0.optimizeSubtree(node1);
      assertSame(node2, node1);
      assertNotSame(node2, node0);
      assertNotSame(node1, node0);
      assertSame(node1, node2);
      assertNotSame(node0, node1);
      assertNotSame(node0, node2);
      assertEquals(false, node2.isUnscopedQualifiedName());
      assertEquals(1, node2.getChildCount());
      assertEquals(false, node2.isVarArgs());
      assertEquals(false, node2.hasMoreThanOneChild());
      assertEquals(false, node2.isOnlyModifiesThisCall());
      assertEquals(false, node2.isNoSideEffectsCall());
      assertEquals(true, node2.hasChildren());
      assertEquals(false, node2.isQuotedString());
      assertEquals(false, node2.wasEmptyNode());
      assertEquals(false, node2.isSyntheticBlock());
      assertEquals(0, node2.getLength());
      assertEquals(false, node2.isQualifiedName());
      assertEquals(37, node2.getCharno());
      assertEquals(true, node2.hasOneChild());
      assertEquals(false, node2.isLocalResultCall());
      assertEquals(37, node2.getType());
      assertEquals(false, node2.isOptionalArg());
      assertEquals(151589, node2.getSourcePosition());
      assertNull(node2.getSourceFileName());
      assertEquals(0, node2.getSideEffectFlags());
      assertEquals(false, node2.isFromExterns());
      assertEquals(37, node2.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getLength());
      assertEquals(37, node1.getLineno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(37, node1.getCharno());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isFromExterns());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(151589, node1.getSourcePosition());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertNotNull(node2);
      assertFalse(node2.equals((Object)node0));
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertFalse(node0.equals((Object)node2));
  }

  @Test
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertNotNull(node0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getLength());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isFromExterns());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getLineno());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.wasEmptyNode());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasChildren());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertNotNull(node1);
  }

  @Test
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 58;
      String string0 = "'J,>Z\":j*V";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(58, node0.getCharno());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(58, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(58, node0.getType());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(237626, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(58, node0.getCharno());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(58, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(58, node0.getType());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(237626, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(58, node1.getCharno());
      assertEquals(false, node1.isSyntheticBlock());
      assertNull(node1.getSourceFileName());
      assertEquals(58, node1.getType());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isQuotedString());
      assertEquals(58, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(237626, node1.getSourcePosition());
      assertEquals(false, node1.hasChildren());
      assertNotNull(node1);
  }
}
