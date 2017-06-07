/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:14:17 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DefinitionsRemover;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProcessClosurePrimitivesEvoSuite_branch_Test extends ProcessClosurePrimitivesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      EvoSuiteFile evoSuiteFile0 = null;
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      String string0 = null;
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      byte[] byteArray0 = new byte[10];
      int int0 = 86;
      Node node0 = new Node(int0, int0, (int) byteArray0[0]);
      assertNotNull(node0);
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(86, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(86, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      DefinitionsRemover.ObjectLiteralPropertyDefinition definitionsRemover_ObjectLiteralPropertyDefinition0 = new DefinitionsRemover.ObjectLiteralPropertyDefinition(node0, node0, node0, boolean0);
      assertNotNull(definitionsRemover_ObjectLiteralPropertyDefinition0);
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(86, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(86, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      Node node1 = definitionsRemover_ObjectLiteralPropertyDefinition0.getLValue();
      assertNotNull(node1);
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(2, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(33, node1.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(86, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(86, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      processClosurePrimitives0.process(node0, node1);
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(2, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(33, node1.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(86, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(86, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "goog.setCssNameMapping only takes an object literal with string values";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) processClosurePrimitives0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = 105;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(105, node0.getType());
      
      // Undeclared exception!
      try {
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "UuAg7NY@e;E7h%W";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) processClosurePrimitives0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = 37;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      
      // Undeclared exception!
      try {
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "UuAg7NY@e;E7h%W";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) processClosurePrimitives0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = 30;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(30, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(30, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      String string0 = "mW,co.Moole";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getLineno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      String string0 = "goog.base";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      EvoSuiteFile evoSuiteFile0 = null;
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      String string0 = null;
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertNotNull(set0);
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
  }
}
