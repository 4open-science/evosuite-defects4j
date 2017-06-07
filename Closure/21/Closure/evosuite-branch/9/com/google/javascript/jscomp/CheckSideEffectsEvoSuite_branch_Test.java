/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:45:44 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CheckSideEffectsEvoSuite_branch_Test extends CheckSideEffectsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(abstractCompiler0, checkLevel0, boolean0);
      assertNotNull(checkSideEffects0);
      
      String string0 = "tCTu$";
      Node node0 = Node.newString(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isLabel());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isScript());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isGetProp());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDelProp());
      
      checkSideEffects0.process(node0, node0);
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isLabel());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isScript());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isAnd());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.hasOneChild());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isGetProp());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDelProp());
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = false;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(abstractCompiler0, checkLevel0, boolean0);
      assertNotNull(checkSideEffects0);
      
      String string0 = "";
      Node node0 = Node.newString(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDelProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOr());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      checkSideEffects0.process(node0, node0);
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDelProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOr());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getLength());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.hasMoreThanOneChild());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      String string0 = "jN,3+Cq";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, node0.isAssign());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isCatch());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isOr());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNumber());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isIf());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isReturn());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNot());
      assertEquals(true, node0.isSyntheticBlock());
      
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(compiler0);
      assertNotNull(checkSideEffects_StripProtection0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      checkSideEffects_StripProtection0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, node0.isAssign());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isCatch());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isOr());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNumber());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isIf());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isReturn());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFromExterns());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getLineno());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isNot());
      assertEquals(true, node0.isSyntheticBlock());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      String string0 = "jN,3+Cq";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isParamList());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isDelProp());
      assertEquals(0, node0.getCharno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLabelName());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isBreak());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isWhile());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDefaultCase());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, boolean0);
      assertNotNull(checkSideEffects0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      
      checkSideEffects0.hotSwapScript(node0, node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(2, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isParamList());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isDelProp());
      assertEquals(0, node0.getCharno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLabelName());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isBreak());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isWhile());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDefaultCase());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      String string0 = "jN,3+Cq";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCatch());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isThis());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDebugger());
      assertEquals(true, node0.hasChildren());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isVoid());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAnd());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isNull());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNew());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isNE());
      assertEquals(132, node0.getType());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckSideEffects checkSideEffects0 = new CheckSideEffects(compiler0, checkLevel0, boolean0);
      assertNotNull(checkSideEffects0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      
      // Undeclared exception!
      try {
        checkSideEffects0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
