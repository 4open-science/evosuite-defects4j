/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 12:17:30 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FlowSensitiveInlineVariablesEvoSuite_branch_Test extends FlowSensitiveInlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      int int0 = (-4027);
      String string0 = "Ef";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isAdd());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isStringKey());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDec());
      assertEquals(-1, node0.getCharno());
      assertEquals(-4027, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
      
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isAdd());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isStringKey());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDec());
      assertEquals(-1, node0.getCharno());
      assertEquals(-4027, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getSourcePosition());
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      int int0 = (-4027);
      String string0 = "Ef";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isGetElem());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(-4027, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isAdd());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNumber());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDefaultCase());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getChildCount());
      
      // Undeclared exception!
      try {
        flowSensitiveInlineVariables0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}