/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:59:03 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.RemoveTryCatch;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RemoveTryCatchEvoSuite_branch_Test extends RemoveTryCatchEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "pZ";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(removeTryCatch0);
      
      int int0 = (-69);
      int int1 = 77;
      Node node0 = Node.newString(int1, string0, int0, int1);
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isLabel());
      assertEquals(true, node0.isTry());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNE());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isVar());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetElem());
      assertEquals(77, node0.getType());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetProp());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isStringKey());
      assertNotNull(node0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
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
  public void test1()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      assertNull(logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNull(logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNotNull(compiler0);
      
      RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNotNull(removeTryCatch0);
      
      int int0 = 302;
      int int1 = 4;
      Node node0 = new Node(int1, int0, int0);
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVar());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isThrow());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isAnd());
      assertEquals(302, node0.getCharno());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.isReturn());
      assertEquals(false, node0.isParamList());
      assertEquals(1237294, node0.getSourcePosition());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isEmpty());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isVoid());
      assertEquals(302, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetElem());
      assertNotNull(node0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      removeTryCatch0.process(node0, node0);
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVar());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isThrow());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isAnd());
      assertEquals(302, node0.getCharno());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.isReturn());
      assertEquals(false, node0.isParamList());
      assertEquals(1237294, node0.getSourcePosition());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isEmpty());
      assertEquals(4, node0.getType());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isVoid());
      assertEquals(302, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getName());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getName());
      assertNotNull(compiler0);
      
      RemoveTryCatch removeTryCatch0 = new RemoveTryCatch(compiler0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getName());
      assertNotNull(removeTryCatch0);
      
      int int0 = 302;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isReturn());
      assertEquals(302, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNE());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isAdd());
      assertEquals(302, node0.getLineno());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isFunction());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isDec());
      assertEquals(302, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTypeOf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isDebugger());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(1237294, node0.getSourcePosition());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertNotNull(node0);
      
      removeTryCatch0.process(node0, node0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isReturn());
      assertEquals(302, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNE());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isAdd());
      assertEquals(302, node0.getLineno());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isFunction());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isDec());
      assertEquals(302, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTypeOf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isDebugger());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(1237294, node0.getSourcePosition());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNull(logger0.getResourceBundleName());
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getName());
  }
}
