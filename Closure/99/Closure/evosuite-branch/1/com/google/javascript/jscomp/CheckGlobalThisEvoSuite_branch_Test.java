/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:52:08 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CheckGlobalThisEvoSuite_branch_Test extends CheckGlobalThisEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = (-655);
      int int1 = 42;
      Node node0 = Node.newNumber((double) int0);
      assertFalse(int0 == int1);
      assertNotNull(node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      Node node1 = new Node(int1, node0, node0, node0, node0);
      assertFalse(node0.equals((Object)node1));
      assertFalse(int1 == int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(int0 == int1);
      assertNotNull(node1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(42, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.isQualifiedName());
      
      nodeTraversal0.traverse(node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(int1 == int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(int0 == int1);
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(42, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.isQualifiedName());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = (-655);
      int int1 = 42;
      Node node0 = Node.newNumber((double) int0);
      assertFalse(int0 == int1);
      assertNotNull(node0);
      assertEquals(39, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      
      Node node1 = new Node(int1, node0, node0, node0, node0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(42, node1.getType());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      
      checkGlobalThis0.visit(nodeTraversal0, node1, node0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(42, node1.getType());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      UnreachableCodeElimination unreachableCodeElimination0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) unreachableCodeElimination0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 86;
      String string0 = "d]ngerous useofthe glo'alH'thi'2bject";
      Node node0 = Node.newString(string0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(86, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      
      Node node1 = new Node(int0, node0, node0, node0, int0, int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(86, node1.getLineno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(86, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertTrue(boolean0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(86, node1.getLineno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(86, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) checkGlobalThis0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(86, node1.getLineno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(86, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      UnreachableCodeElimination unreachableCodeElimination0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) unreachableCodeElimination0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 86;
      String string0 = "d]ngerous useofthe glo'alH'thi'2bject";
      Node node0 = Node.newString(string0, int0, int0);
      assertNotNull(node0);
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(86, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      Node node1 = new Node(int0, node0, node0, node0, int0, int0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(86, node1.getLineno());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(86, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertTrue(boolean0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(86, node1.getLineno());
      assertEquals(86, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(86, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(86, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 105;
      String string0 = "@H85>";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(105, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      
      // Undeclared exception!
      try {
        boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
