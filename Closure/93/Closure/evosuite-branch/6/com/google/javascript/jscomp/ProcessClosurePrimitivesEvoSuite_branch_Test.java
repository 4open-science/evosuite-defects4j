/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:42:43 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProcessClosurePrimitivesEvoSuite_branch_Test extends ProcessClosurePrimitivesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0() {}
//   @Test
//   public void test0()  throws Throwable  {
//       String string0 = "wI";
//       Logger logger0 = Logger.global;
//       assertNotNull(logger0);
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertNull(logger0.getResourceBundleName());
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertNotNull(loggerErrorManager0);
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
//       assertNotNull(compiler0);
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       CheckLevel checkLevel0 = CheckLevel.OFF;
//       boolean boolean0 = true;
//       ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
//       assertNotNull(processClosurePrimitives0);
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       
//       int int0 = 30;
//       Node node0 = Node.newString(int0, string0, int0, int0);
//       assertNotNull(node0);
//       assertEquals(false, node0.isQualifiedName());
//       assertEquals(false, node0.isUnscopedQualifiedName());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(30, node0.getLineno());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(30, node0.getType());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(30, node0.getCharno());
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(false, node0.isVarArgs());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(false, node0.hasChildren());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(0, node0.getSideEffectFlags());
//       
//       NodeTraversal nodeTraversal0 = null;
//       // Undeclared exception!
//       try {
//         processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
//         fail("Expecting exception: NullPointerException");
//       
//       } catch(NullPointerException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String string0 = "function JSCompiler_returnArg(JS2ompiler_returnArg_value) {  return function() {return JSCompiler_rturnArg_value}}";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String string0 = "goog.ba=e";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
  }

  @Test
  public void test3() {}
//   @Test
//   public void test3()  throws Throwable  {
//       EvoSuiteFile evoSuiteFile0 = null;
//       String string0 = "{j0";
//       boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
//       assertFalse(boolean0);
//       
//       Logger logger0 = Logger.global;
//       assertNotNull(logger0);
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertNotNull(loggerErrorManager0);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
//       assertNotNull(compiler0);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       
//       CheckLevel checkLevel0 = CheckLevel.ERROR;
//       ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
//       assertNotNull(processClosurePrimitives0);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//       
//       int int0 = 30;
//       Node node0 = Node.newString(int0, string0, int0, int0);
//       assertNotNull(node0);
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(30, node0.getLineno());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(false, node0.isQualifiedName());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(false, node0.hasChildren());
//       assertEquals(30, node0.getCharno());
//       assertEquals(30, node0.getType());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.isVarArgs());
//       assertEquals(false, node0.isUnscopedQualifiedName());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(0, node0.getSideEffectFlags());
//       
//       processClosurePrimitives0.process(node0, node0);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(30, node0.getLineno());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(false, node0.isQualifiedName());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(false, node0.hasChildren());
//       assertEquals(30, node0.getCharno());
//       assertEquals(30, node0.getType());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.isVarArgs());
//       assertEquals(false, node0.isUnscopedQualifiedName());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(0, node0.getSideEffectFlags());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals("global", logger0.getName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0, compiler0.getWarningCount());
//   }

  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String string0 = "g.DnexpecwedAhl.eof";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String string0 = "goog.base";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      String string0 = "goog.base";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertNotNull(set0);
      assertEquals(0, set0.size());
      assertEquals(true, set0.isEmpty());
  }
}
