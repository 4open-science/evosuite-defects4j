/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:10:15 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CheckGlobalThisEvoSuite_branch_Test extends CheckGlobalThisEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      String string0 = "Lpw5eu+x";
      int int0 = 105;
      Node node0 = Node.newString(string0, int0, int0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(105, node0.getLineno());
      assertNotNull(node0);
      
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(105, node0.getLineno());
  }

  @Test
  public void test1()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      String string0 = "";
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(node0);
      
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(nodeTraversal0);
      
      byte byte0 = (byte)86;
      Node node1 = new Node((int) byte0, node0, node0, node0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(86, node1.getType());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(86, node1.getType());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertTrue(boolean0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
  }

  @Test
  public void test2()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      String string0 = "";
      Node node0 = compiler0.parseTestCode(string0);
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(node0);
      
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(nodeTraversal0);
      
      byte byte0 = (byte)86;
      Node node1 = new Node((int) byte0, node0, node0, node0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQuotedString());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasChildren());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isQuotedString());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(true, node1.hasChildren());
      assertEquals(86, node1.getType());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertTrue(boolean0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      String string0 = "Lpw5eu+x";
      int int0 = 105;
      Node node0 = Node.newString(string0, int0, int0);
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getLineno());
      assertEquals(105, node0.getCharno());
      assertNotNull(node0);
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(abstractCompiler0);
      assertNotNull(syntacticScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0, (ScopeCreator) syntacticScopeCreator0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertNotNull(nodeTraversal0);
      
      Node node1 = ControlFlowAnalysis.getCatchHandlerForBlock(node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getLineno());
      assertEquals(105, node0.getCharno());
      assertNull(node1);
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(105, node0.getLineno());
      assertEquals(105, node0.getCharno());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      String string0 = "com.google.javascript.jscomp.CheckGlobalThis";
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(node0);
      
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(nodeTraversal0);
      
      byte byte0 = (byte)105;
      Node node1 = new Node((int) byte0, node0, node0, node0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(105, node1.getType());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      // Undeclared exception!
      try {
        boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      String string0 = "Lpw5eu+x";
      int int0 = 105;
      Node node0 = Node.newString(string0, int0, int0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(105, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertNotNull(node0);
      
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(105, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertTrue(boolean0);
  }
}