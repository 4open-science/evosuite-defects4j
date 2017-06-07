/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:59:29 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProcessClosurePrimitivesEvoSuite_branch_Test extends ProcessClosurePrimitivesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      int int0 = 38;
      String string0 = "C'dYIM";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(38, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      // Undeclared exception!
      try {
        processClosurePrimitives0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MessageFormatter messageFormatter0 = null;
      Logger logger0 = Logger.global;
      assertNotNull(logger0);
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(messageFormatter0, logger0);
      assertNotNull(loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      
      int int0 = 33;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(33, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      
      // Undeclared exception!
      try {
        processClosurePrimitives0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      int int0 = 16;
      String string0 = "C'dYIM";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(16, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(16, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      int int0 = 106;
      String string0 = "C'dYIM";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(106, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getLineno());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(106, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getLineno());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertNotNull(set0);
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
  }
}
