/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:03:37 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FlowSensitiveInlineVariablesEvoSuite_branch_Test extends FlowSensitiveInlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(defaultPassConfig0);
      
      PassConfig.PassConfigDelegate passConfig_PassConfigDelegate0 = new PassConfig.PassConfigDelegate(defaultPassConfig0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(passConfig_PassConfigDelegate0);
      
      MemoizedScopeCreator memoizedScopeCreator0 = passConfig_PassConfigDelegate0.getTypedScopeCreator();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, (ScopeCreator) memoizedScopeCreator0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(printStream0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertNotNull(printStreamErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertNotNull(flowSensitiveInlineVariables0);
      
      ScopeCreator scopeCreator0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, scopeCreator0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertNotNull(nodeTraversal0);
      
      Node node0 = null;
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
  }

  @Test
  public void test2()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(defaultPassConfig0);
      
      PassConfig.PassConfigDelegate passConfig_PassConfigDelegate0 = new PassConfig.PassConfigDelegate(defaultPassConfig0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(passConfig_PassConfigDelegate0);
      
      MemoizedScopeCreator memoizedScopeCreator0 = passConfig_PassConfigDelegate0.getTypedScopeCreator();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0, (ScopeCreator) memoizedScopeCreator0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      double double0 = 4.140049569830446;
      Node node0 = Node.newNumber(double0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isCatch());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        flowSensitiveInlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
