/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:24:26 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.RemoveTryCatch;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RemoveTryCatchEvoSuite_branch_Test extends RemoveTryCatchEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0() {}
//   @Test
//   public void test0()  throws Throwable  {
//       Logger logger0 = Logger.global;
//       assertNotNull(logger0);
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
//       assertNotNull(loggerErrorManager0);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
//       assertNotNull(compiler0);
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0.0, compiler0.getProgress(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
//       assertNotNull(removeTryCatch0);
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0.0, compiler0.getProgress(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       
//       String string0 = "expectedValuesPerKey must be >= 0 but was %s";
//       Node node0 = Node.newString(string0);
//       assertNotNull(node0);
//       assertEquals(true, node0.isString());
//       assertEquals(false, node0.isCast());
//       assertEquals(false, node0.isDefaultCase());
//       assertEquals(false, node0.isSwitch());
//       assertEquals(0, node0.getChangeTime());
//       assertEquals(false, node0.isDebugger());
//       assertEquals(false, node0.isNE());
//       assertEquals(false, node0.isFunction());
//       assertEquals(false, node0.isCatch());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(40, node0.getType());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.isWith());
//       assertEquals(-1, node0.getSourcePosition());
//       assertEquals(false, node0.isObjectLit());
//       assertEquals(false, node0.isExprResult());
//       assertEquals(false, node0.isNumber());
//       assertEquals(false, node0.isCase());
//       assertEquals(false, node0.isArrayLit());
//       assertEquals(false, node0.isBlock());
//       assertEquals(false, node0.isTypeOf());
//       assertEquals(false, node0.isRegExp());
//       assertEquals(false, node0.isReturn());
//       assertEquals(false, node0.isFalse());
//       assertEquals(false, node0.isThis());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(false, node0.isInstanceOf());
//       assertEquals(-1, node0.getCharno());
//       assertEquals(false, node0.isTry());
//       assertEquals(false, node0.isParamList());
//       assertEquals(false, node0.isAssignAdd());
//       assertEquals(false, node0.isNull());
//       assertEquals(false, node0.isName());
//       assertEquals(false, node0.isNew());
//       assertEquals(false, node0.isContinue());
//       assertEquals(false, node0.isGetterDef());
//       assertEquals(false, node0.isTrue());
//       assertEquals(0, node0.getLength());
//       assertEquals(false, node0.isComma());
//       assertEquals(false, node0.isScript());
//       assertEquals(false, node0.isLabelName());
//       assertEquals(false, node0.isCall());
//       assertEquals(false, node0.isInc());
//       assertEquals(false, node0.isDo());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(false, node0.isOr());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(false, node0.isVarArgs());
//       assertEquals(false, node0.isBreak());
//       assertEquals(false, node0.isFromExterns());
//       assertEquals(false, node0.isSetterDef());
//       assertEquals(false, node0.isStringKey());
//       assertEquals(false, node0.isGetElem());
//       assertEquals(false, node0.isThrow());
//       assertEquals(false, node0.isFor());
//       assertEquals(false, node0.isHook());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(false, node0.isVoid());
//       assertEquals(false, node0.isEmpty());
//       assertEquals(false, node0.isIn());
//       assertNull(node0.getSourceFileName());
//       assertEquals(-1, node0.getLineno());
//       assertEquals(false, node0.isGetProp());
//       assertEquals(false, node0.isWhile());
//       assertEquals(false, node0.isIf());
//       assertEquals(false, node0.isAdd());
//       assertEquals(false, node0.hasChildren());
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(false, node0.isAnd());
//       assertEquals(false, node0.isAssign());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(false, node0.isDec());
//       assertEquals(false, node0.isNot());
//       assertEquals(false, node0.isDelProp());
//       assertEquals(false, node0.isLabel());
//       assertEquals(false, node0.isVar());
//       assertEquals(0, node0.getSideEffectFlags());
//       
//       removeTryCatch0.process(node0, node0);
//       assertEquals(0, compiler0.getWarningCount());
//       assertEquals(0, compiler0.getErrorCount());
//       assertEquals(0.0, compiler0.getProgress(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getWarningCount());
//       assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
//       assertEquals(0, loggerErrorManager0.getErrorCount());
//       assertEquals("global", logger0.getName());
//       assertNull(logger0.getResourceBundleName());
//       assertEquals(false, logger0.getUseParentHandlers());
//       assertEquals(true, node0.isString());
//       assertEquals(false, node0.isCast());
//       assertEquals(false, node0.isDefaultCase());
//       assertEquals(false, node0.isSwitch());
//       assertEquals(0, node0.getChangeTime());
//       assertEquals(false, node0.isDebugger());
//       assertEquals(false, node0.isNE());
//       assertEquals(false, node0.isFunction());
//       assertEquals(false, node0.isCatch());
//       assertEquals(false, node0.hasMoreThanOneChild());
//       assertEquals(40, node0.getType());
//       assertEquals(false, node0.isQuotedString());
//       assertEquals(false, node0.isWith());
//       assertEquals(-1, node0.getSourcePosition());
//       assertEquals(false, node0.isObjectLit());
//       assertEquals(false, node0.isExprResult());
//       assertEquals(false, node0.isNumber());
//       assertEquals(false, node0.isCase());
//       assertEquals(false, node0.isArrayLit());
//       assertEquals(false, node0.isBlock());
//       assertEquals(false, node0.isTypeOf());
//       assertEquals(false, node0.isRegExp());
//       assertEquals(false, node0.isReturn());
//       assertEquals(false, node0.isFalse());
//       assertEquals(false, node0.isThis());
//       assertEquals(false, node0.isSyntheticBlock());
//       assertEquals(false, node0.isInstanceOf());
//       assertEquals(-1, node0.getCharno());
//       assertEquals(false, node0.isTry());
//       assertEquals(false, node0.isParamList());
//       assertEquals(false, node0.isAssignAdd());
//       assertEquals(false, node0.isNull());
//       assertEquals(false, node0.isName());
//       assertEquals(false, node0.isNew());
//       assertEquals(false, node0.isContinue());
//       assertEquals(false, node0.isGetterDef());
//       assertEquals(false, node0.isTrue());
//       assertEquals(0, node0.getLength());
//       assertEquals(false, node0.isComma());
//       assertEquals(false, node0.isScript());
//       assertEquals(false, node0.isLabelName());
//       assertEquals(false, node0.isCall());
//       assertEquals(false, node0.isInc());
//       assertEquals(false, node0.isDo());
//       assertEquals(false, node0.isLocalResultCall());
//       assertEquals(false, node0.isOr());
//       assertEquals(0, node0.getChildCount());
//       assertEquals(false, node0.isVarArgs());
//       assertEquals(false, node0.isBreak());
//       assertEquals(false, node0.isFromExterns());
//       assertEquals(false, node0.isSetterDef());
//       assertEquals(false, node0.isStringKey());
//       assertEquals(false, node0.isGetElem());
//       assertEquals(false, node0.isThrow());
//       assertEquals(false, node0.isFor());
//       assertEquals(false, node0.isHook());
//       assertEquals(false, node0.isNoSideEffectsCall());
//       assertEquals(false, node0.isVoid());
//       assertEquals(false, node0.isEmpty());
//       assertEquals(false, node0.isIn());
//       assertNull(node0.getSourceFileName());
//       assertEquals(-1, node0.getLineno());
//       assertEquals(false, node0.isGetProp());
//       assertEquals(false, node0.isWhile());
//       assertEquals(false, node0.isIf());
//       assertEquals(false, node0.isAdd());
//       assertEquals(false, node0.hasChildren());
//       assertEquals(false, node0.isOnlyModifiesThisCall());
//       assertEquals(false, node0.wasEmptyNode());
//       assertEquals(false, node0.hasOneChild());
//       assertEquals(false, node0.isAnd());
//       assertEquals(false, node0.isAssign());
//       assertEquals(false, node0.isOptionalArg());
//       assertEquals(false, node0.isDec());
//       assertEquals(false, node0.isNot());
//       assertEquals(false, node0.isDelProp());
//       assertEquals(false, node0.isLabel());
//       assertEquals(false, node0.isVar());
//       assertEquals(0, node0.getSideEffectFlags());
//   }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
      assertNotNull(removeTryCatch0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      int int0 = 77;
      String string0 = "";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isThis());
      assertEquals(315469, node0.getSourcePosition());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCatch());
      assertEquals(true, node0.isTry());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDo());
      assertEquals(77, node0.getCharno());
      assertEquals(false, node0.isSwitch());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isTrue());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(77, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isVoid());
      assertEquals(77, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isName());
      
      // Undeclared exception!
      try {
        removeTryCatch0.process(node0, node0);
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
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
      assertNotNull(removeTryCatch0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      int int0 = 4;
      String string0 = "Cannot overwrite existing ClassShutter object";
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isGetterDef());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNumber());
      assertEquals(true, node0.isReturn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(4, node0.getLineno());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isThrow());
      assertEquals(4, node0.getCharno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isTypeOf());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isArrayLit());
      assertEquals(16388, node0.getSourcePosition());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isScript());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVar());
      
      removeTryCatch0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isGetterDef());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNumber());
      assertEquals(true, node0.isReturn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(4, node0.getLineno());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isThrow());
      assertEquals(4, node0.getCharno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isTypeOf());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isArrayLit());
      assertEquals(16388, node0.getSourcePosition());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isScript());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVar());
  }
}
