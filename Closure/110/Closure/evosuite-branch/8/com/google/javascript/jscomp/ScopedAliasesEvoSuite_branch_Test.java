/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:43:45 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ScopedAliasesEvoSuite_branch_Test extends ScopedAliasesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((MessageFormatter) lightweightMessageFormatter0, printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      
      int int0 = 2253;
      String string0 = "JSC_Gf`G_SCOPE_USED_IMPROPERLY";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChangeTime());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSetterDef());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIf());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNot());
      assertEquals(2253, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isDefaultCase());
      
      PreprocessorSymbolTable preprocessorSymbolTable0 = null;
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      assertNotNull(compilerOptions_AliasTransformationHandler0);
      
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      assertNotNull(scopedAliases0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      
      Node node1 = new Node(int0, node0);
      assertNotNull(node1);
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isBlock());
      assertEquals(false, node1.isTypeOf());
      assertEquals(false, node1.isAnd());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isLabelName());
      assertEquals(false, node1.isExprResult());
      assertEquals(false, node1.isInc());
      assertEquals(false, node1.isSwitch());
      assertEquals(false, node1.isInstanceOf());
      assertEquals(false, node1.isStringKey());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isReturn());
      assertEquals(false, node1.isArrayLit());
      assertEquals(false, node1.isNot());
      assertEquals(false, node1.isScript());
      assertEquals(false, node1.isDo());
      assertEquals(false, node1.isAssignAdd());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isTry());
      assertEquals(false, node1.isTrue());
      assertEquals(false, node1.isCast());
      assertEquals(false, node1.isOnlyModifiesArgumentsCall());
      assertEquals(false, node1.isNE());
      assertEquals(2253, node1.getType());
      assertEquals(false, node1.isNumber());
      assertEquals(false, node1.isDec());
      assertEquals(false, node1.isNew());
      assertEquals(false, node1.isContinue());
      assertEquals(false, node1.isCall());
      assertEquals(false, node1.isComma());
      assertEquals(false, node1.isFunction());
      assertEquals(false, node1.isWith());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.mayMutateGlobalStateOrThrow());
      assertEquals(false, node1.isSetterDef());
      assertEquals(false, node1.isName());
      assertEquals(false, node1.isGetElem());
      assertEquals(false, node1.isIn());
      assertEquals(false, node1.isBreak());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isFalse());
      assertEquals(false, node1.isDebugger());
      assertEquals(false, node1.isAdd());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isThrow());
      assertEquals(false, node1.isCatch());
      assertEquals(false, node1.isGetProp());
      assertEquals(false, node1.isGetterDef());
      assertEquals(false, node1.isThis());
      assertEquals(false, node1.isRegExp());
      assertEquals(false, node1.isOr());
      assertEquals(false, node1.isEmpty());
      assertEquals(false, node1.isNull());
      assertEquals(false, node1.isVar());
      assertEquals(true, node1.mayMutateArguments());
      assertEquals(false, node1.isObjectLit());
      assertEquals(false, node1.isIf());
      assertEquals(false, node1.isParamList());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isVoid());
      assertEquals(false, node1.isString());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(0, node1.getChangeTime());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isDelProp());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isDefaultCase());
      assertEquals(false, node1.isCase());
      assertEquals(false, node1.isFor());
      assertEquals(false, node1.isLabel());
      assertEquals(false, node1.isWhile());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isAssign());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isHook());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChangeTime());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSetterDef());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIf());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNot());
      assertEquals(2253, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isDefaultCase());
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      scopedAliases0.process(node0, node0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChangeTime());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSetterDef());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThrow());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isIf());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNot());
      assertEquals(2253, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isDefaultCase());
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node0, node1);
  }

  @Test
  public void test1()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((MessageFormatter) lightweightMessageFormatter0, printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      int int0 = 2253;
      String string0 = "JSC_Gf`G_SCOPE_USED_IMPROPERLY";
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(2253, node0.getType());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isNE());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isLabelName());
      
      PreprocessorSymbolTable preprocessorSymbolTable0 = null;
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      assertNotNull(compilerOptions_AliasTransformationHandler0);
      
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      assertNotNull(scopedAliases0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      scopedAliases0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(2253, node0.getType());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isNE());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isContinue());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isLabelName());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
  }
}
