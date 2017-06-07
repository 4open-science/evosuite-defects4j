/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:21:36 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProcessClosurePrimitivesEvoSuite_branch_Test extends ProcessClosurePrimitivesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0, boolean0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
      assertNotNull(node0);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      int int0 = 30;
      Node node1 = new Node(int0, node0, node0, int0, int0);
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(30, node1.getType());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(30, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(true, node1.hasOneChild());
      assertEquals(30, node1.getLineno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      processClosurePrimitives0.process(node0, node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(30, node1.getType());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(30, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(true, node1.hasOneChild());
      assertEquals(30, node1.getLineno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "-*,@ay!I1aa";
      String string1 = "Zom.google,javascripu.jGcomp.SzurceFile";
      assertNotSame(string1, string0);
      
      MockFile mockFile0 = new MockFile(string0, string1);
      assertNotNull(mockFile0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      Node node0 = compiler0.parseTestCode(string1);
      assertNotNull(node0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      processClosurePrimitives0.process(node0, node0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      int int0 = 30;
      String string0 = "";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(30, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(30, node0.getType());
      assertEquals(30, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(30, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(30, node0.getType());
      assertEquals(30, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "";
      String string1 = "goog.base";
      assertNotSame(string1, string0);
      
      MockFile mockFile0 = new MockFile(string0, string1);
      assertNotNull(mockFile0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      Node node0 = compiler0.parseTestCode(string1);
      assertNotNull(node0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      processClosurePrimitives0.process(node0, node0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertNotNull(set0);
      assertEquals(0, set0.size());
      assertEquals(true, set0.isEmpty());
  }
}
