/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:15:03 GMT 2014
 */

package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ClosureReverseAbstractInterpreterEvoSuite_branch_Test extends ClosureReverseAbstractInterpreterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      assertNotNull(jqueryCodingConvention0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      
      JSTypeRegistry jSTypeRegistry0 = null;
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) jqueryCodingConvention0, jSTypeRegistry0);
      assertNotNull(closureReverseAbstractInterpreter0);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      
      int int0 = 37;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getChangeTime());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(37, node0.getCharno());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSetterDef());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.isCall());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isTypeOf());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      FlowScope flowScope0 = null;
      boolean boolean0 = false;
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
      assertNull(flowScope1);
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getChangeTime());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(37, node0.getCharno());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSetterDef());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.isCall());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isTypeOf());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNoSideEffectsCall());
  }

  @Test
  public void test1()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertNotNull(googleCodingConvention0);
      
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention((CodingConvention) googleCodingConvention0);
      assertNotNull(closureCodingConvention0);
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      int int0 = (-2542);
      boolean boolean0 = true;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0, boolean0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) closureCodingConvention0, jSTypeRegistry0);
      assertNotNull(closureReverseAbstractInterpreter0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      
      Node node0 = Node.newNumber((double) int0);
      assertNotNull(node0);
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isArrayLit());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNE());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isEmpty());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isWhile());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isObjectLit());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSetterDef());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDec());
      
      FlowScope flowScope0 = null;
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.firstPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
      assertNull(flowScope1);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isArrayLit());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNE());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isEmpty());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isWhile());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isObjectLit());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSetterDef());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDec());
  }
}
