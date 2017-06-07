/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:12:50 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CollapseVariableDeclarations;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CollapseVariableDeclarationsEvoSuite_branch_Test extends CollapseVariableDeclarationsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "CA=0";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      assertNotNull(collapseVariableDeclarations0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isArrayLit());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isEmpty());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetterDef());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isVoid());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isObjectLit());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFunction());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isFalse());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isBlock());
      
      collapseVariableDeclarations0.process(node0, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isArrayLit());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isEmpty());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetterDef());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isVoid());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isObjectLit());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFunction());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isFalse());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isBlock());
  }
}