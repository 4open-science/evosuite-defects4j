/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:47:44 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NameAnalyzerEvoSuite_branch_Test extends NameAnalyzerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      
      String string0 = "window";
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(false, node0.isDo());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isArrayLit());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOr());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isVoid());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(node0);
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(false, node0.isDo());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isArrayLit());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOr());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isVoid());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(false, node0.isDo());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isArrayLit());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFalse());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOr());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isVoid());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      boolean boolean0 = true;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      
      String string0 = "window";
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isOr());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isSetterDef());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isWhile());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isParamList());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isDec());
      assertNotNull(node0);
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isOr());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isSetterDef());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isWhile());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isParamList());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isDec());
      
      String string1 = nameAnalyzer0.getHtmlReport();
      assertNotSame(string1, string0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string1);
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      boolean boolean0 = false;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(abstractCompiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      
      int int0 = (-2337);
      Node node0 = new Node(int0);
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isNull());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.hasChildren());
      assertEquals(-2337, node0.getType());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isParamList());
      assertNotNull(node0);
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isNull());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.hasChildren());
      assertEquals(-2337, node0.getType());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isParamList());
  }
}
