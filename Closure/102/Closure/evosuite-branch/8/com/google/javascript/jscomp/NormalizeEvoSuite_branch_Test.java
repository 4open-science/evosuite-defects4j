/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:10:17 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.SymbolTable;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NormalizeEvoSuite_branch_Test extends NormalizeEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      
      boolean boolean0 = false;
      Normalize normalize0 = new Normalize(compiler0, boolean0);
      assertNotNull(normalize0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      
      String string0 = "DEfyaH:vR2I";
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(scriptOrFnNode0);
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      
      int int0 = 21;
      Node node0 = new Node(int0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertNotNull(node0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(21, node0.getType());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      
      normalize0.process((Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      
      normalize0.process((Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
  }

  @Test
  public void test1()  throws Throwable  {
      SourceExcerptProvider sourceExcerptProvider0 = null;
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.LINE;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(sourceExcerptProvider0, sourceExcerptProvider_SourceExcerpt0);
      assertNotNull(lightweightMessageFormatter0);
      
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((MessageFormatter) lightweightMessageFormatter0, printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      boolean boolean0 = true;
      Normalize normalize0 = new Normalize(compiler0, boolean0);
      assertNotNull(normalize0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) normalize0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      int int0 = 105;
      Node node0 = Node.newNumber((double) int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(105, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      
      Node node1 = new Node(int0, node0, node0, node0, int0, int0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotNull(node1);
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(105, node1.getType());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(105, node1.getLineno());
      assertEquals(105, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(105, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      
      boolean boolean1 = normalize0.shouldTraverse(nodeTraversal0, node1, node0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertTrue(boolean1 == boolean0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(105, node1.getType());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(105, node1.getLineno());
      assertEquals(105, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(105, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      
      Normalize normalize0 = new Normalize(compiler0, boolean0);
      assertNotNull(normalize0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      
      SymbolTable symbolTable0 = new SymbolTable(compiler0);
      assertNotNull(symbolTable0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) normalize0, (ScopeCreator) symbolTable0);
      assertNotNull(nodeTraversal0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      int int0 = 113;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(113, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(113, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(113, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      
      // Undeclared exception!
      try {
        normalize0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      boolean boolean0 = true;
      String string0 = "J+G2";
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(scriptOrFnNode0);
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      int int0 = (-10);
      Node node0 = new Node(int0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertNotNull(node0);
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-10, node0.getType());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, boolean0);
      assertNotNull(normalize_VerifyConstants0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      normalize_VerifyConstants0.process((Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      
      boolean boolean0 = false;
      String string0 = "DEfyaH:vR2I";
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(scriptOrFnNode0);
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      
      int int0 = 21;
      Node node0 = new Node(int0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertNotNull(node0);
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(21, node0.getType());
      assertEquals(true, node0.hasChildren());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, boolean0);
      assertNotNull(normalize_VerifyConstants0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      
      normalize_VerifyConstants0.process((Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
  }

  @Test
  public void test5()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean0 = false;
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(abstractCompiler0, boolean0);
      assertNotNull(normalize_VerifyConstants0);
      
      int int0 = 2512;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(2512, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      
      // Undeclared exception!
      try {
        normalize_VerifyConstants0.process(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      boolean boolean0 = true;
      Normalize normalize0 = new Normalize(compiler0, boolean0);
      assertNotNull(normalize0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      String string0 = "D:fya:vjA";
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(scriptOrFnNode0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      
      // Undeclared exception!
      try {
        normalize0.process((Node) scriptOrFnNode0, (Node) scriptOrFnNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}