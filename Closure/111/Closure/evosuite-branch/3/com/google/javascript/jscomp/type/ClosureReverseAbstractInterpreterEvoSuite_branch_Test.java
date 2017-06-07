/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:46:55 GMT 2014
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
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
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
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertNotNull(closureCodingConvention0);
      
      ErrorReporter errorReporter0 = null;
      boolean boolean0 = true;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, boolean0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(jSTypeRegistry0);
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) closureCodingConvention0, jSTypeRegistry0);
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(closureReverseAbstractInterpreter0);
      
      int int0 = 37;
      Node node0 = new Node(int0);
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals(true, node0.isCall());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isCatch());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isAssign());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTry());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNumber());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isComma());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertNotNull(node0);
      
      FlowScope flowScope0 = null;
      FlowScope flowScope1 = closureReverseAbstractInterpreter0.firstPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals(true, node0.isCall());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isCatch());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isAssign());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTry());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNumber());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isComma());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNull(flowScope1);
  }

  @Test
  public void test1()  throws Throwable  {
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention();
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(jqueryCodingConvention0);
      
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention((CodingConvention) jqueryCodingConvention0);
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(closureCodingConvention0);
      
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention((CodingConvention) closureCodingConvention0);
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(googleCodingConvention0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      boolean boolean0 = true;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0, boolean0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(jSTypeRegistry0);
      
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter((CodingConvention) jqueryCodingConvention0, jSTypeRegistry0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(semanticReverseAbstractInterpreter0);
      
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter((CodingConvention) googleCodingConvention0, jSTypeRegistry0);
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNotNull(closureReverseAbstractInterpreter0);
      
      int int0 = 1073741843;
      String string0 = "v:%$0q&wrrMe&C]";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(81919, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isThrow());
      assertEquals(19, node0.getLineno());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFalse());
      assertEquals(1073741843, node0.getType());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(4095, node0.getCharno());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isWhile());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isVoid());
      assertNotNull(node0);
      
      FlowScope flowScope0 = null;
      FlowScope flowScope1 = semanticReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node0, flowScope0, boolean0);
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(81919, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isThrow());
      assertEquals(19, node0.getLineno());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFalse());
      assertEquals(1073741843, node0.getType());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(4095, node0.getCharno());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isWhile());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isVoid());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNull(flowScope1);
      
      FlowScope flowScope2 = closureReverseAbstractInterpreter0.getPreciserScopeKnowingConditionOutcome(node0, flowScope1, boolean0);
      assertEquals("goog.global", closureCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", closureCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", closureCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", closureCodingConvention0.getAbstractMethodName());
      assertEquals(true, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(81919, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isThrow());
      assertEquals(19, node0.getLineno());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFalse());
      assertEquals(1073741843, node0.getType());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(4095, node0.getCharno());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isWhile());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isVoid());
      assertEquals("window", jqueryCodingConvention0.getGlobalObject());
      assertNull(flowScope2);
  }
}
