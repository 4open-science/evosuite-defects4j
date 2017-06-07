/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:57:04 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckEventfulObjectDisposal;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ScopedAliasesEvoSuite_branch_Test extends ScopedAliasesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedOutputStream0);
      
      boolean boolean0 = false;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) pipedOutputStream0, boolean0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      double double0 = (-0.366466637548744);
      int int0 = 2343;
      Node node0 = Node.newNumber(double0, int0, int0);
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2343, node0.getLineno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAnd());
      assertEquals(2343, node0.getCharno());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNew());
      assertEquals(9599271, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFunction());
      assertNotNull(node0);
      
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2343, node0.getLineno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAnd());
      assertEquals(2343, node0.getCharno());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNew());
      assertEquals(9599271, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFunction());
      assertNotNull(preprocessorSymbolTable0);
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertNotNull(compilerOptions0);
      
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = compilerOptions0.getAliasTransformationHandler();
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertNotNull(compilerOptions_AliasTransformationHandler0);
      
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2343, node0.getLineno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAnd());
      assertEquals(2343, node0.getCharno());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNew());
      assertEquals(9599271, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFunction());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertNotNull(scopedAliases0);
      
      scopedAliases0.process(node0, node0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2343, node0.getLineno());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAnd());
      assertEquals(2343, node0.getCharno());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTry());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasChildren());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNew());
      assertEquals(9599271, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isIn());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isFunction());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
  }
}
