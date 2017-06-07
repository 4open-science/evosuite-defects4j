/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:47:22 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.CoalesceVariableNames;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.Denormalize;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.EmptyMessageBundle;
import com.google.javascript.jscomp.FieldCleanupPass;
import com.google.javascript.jscomp.FindExportableNodes;
import com.google.javascript.jscomp.InferJSDocInfo;
import com.google.javascript.jscomp.InlineSimpleMethods;
import com.google.javascript.jscomp.JsMessage;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReplaceMessages;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SymbolTable;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NodeTraversalEvoSuite_branch_Test extends NodeTraversalEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      boolean boolean0 = true;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessages replaceMessages0 = new ReplaceMessages(compiler0, emptyMessageBundle0, boolean0, jsMessage_Style0, boolean0);
      assertNotNull(replaceMessages0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) replaceMessages0);
      assertNotNull(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      // Undeclared exception!
      try {
        ControlFlowGraph<Node> controlFlowGraph0 = nodeTraversal0.getControlFlowGraph();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(abstractCompiler0);
      assertNotNull(checkSideEffects_StripProtection0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkSideEffects_StripProtection0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = nodeTraversal0.hasScope();
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertFalse(boolean0);
      
      CoalesceVariableNames coalesceVariableNames0 = new CoalesceVariableNames(compiler0, boolean0);
      assertNotNull(coalesceVariableNames0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      // Undeclared exception!
      try {
        coalesceVariableNames0.enterScope(nodeTraversal0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      assertNotNull(inlineSimpleMethods0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal.Callback nodeTraversal_Callback0 = inlineSimpleMethods0.getActingCallback();
      assertNotNull(nodeTraversal_Callback0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, nodeTraversal_Callback0);
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
  public void test03()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      Denormalize denormalize0 = new Denormalize(abstractCompiler0);
      assertNotNull(denormalize0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) denormalize0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node0 = nodeTraversal0.getEnclosingFunction();
      assertNull(node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test04()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InferJSDocInfo inferJSDocInfo0 = new InferJSDocInfo(abstractCompiler0);
      assertNotNull(inferJSDocInfo0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) inferJSDocInfo0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Vector<Node> vector0 = new Vector<Node>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      
      nodeTraversal0.traverseRoots((List<Node>) vector0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
  }

  @Test
  public void test05()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(abstractCompiler0);
      assertNotNull(minimizeExitPoints0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) minimizeExitPoints0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      Node node0 = null;
      String[] stringArray0 = new String[6];
      JSTypeRegistry jSTypeRegistry0 = null;
      FieldCleanupPass.QualifiedNameSearchTraversal fieldCleanupPass_QualifiedNameSearchTraversal0 = new FieldCleanupPass.QualifiedNameSearchTraversal(jSTypeRegistry0, stringArray0[1]);
      assertNotNull(fieldCleanupPass_QualifiedNameSearchTraversal0);
      
      boolean boolean0 = fieldCleanupPass_QualifiedNameSearchTraversal0.shouldTraverse(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertNotNull(loggerErrorManager0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      
      // Undeclared exception!
      try {
        SymbolTable symbolTable0 = compiler0.buildKnownSymbolTable();
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
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FindExportableNodes findExportableNodes0 = new FindExportableNodes((AbstractCompiler) compiler0);
      assertNotNull(findExportableNodes0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) findExportableNodes0);
      assertNotNull(nodeTraversal0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      boolean boolean0 = nodeTraversal0.inGlobalScope();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(abstractCompiler0);
      assertNotNull(minimizeExitPoints0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) minimizeExitPoints0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node0 = null;
      DiagnosticType diagnosticType0 = null;
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try {
        nodeTraversal0.report(node0, diagnosticType0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection(abstractCompiler0);
      assertNotNull(checkSideEffects_StripProtection0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkSideEffects_StripProtection0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      InputId inputId0 = nodeTraversal0.getInputId();
      assertNull(inputId0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test10()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      InferJSDocInfo inferJSDocInfo0 = new InferJSDocInfo(abstractCompiler0);
      assertNotNull(inferJSDocInfo0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) inferJSDocInfo0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      Node node0 = nodeTraversal0.getCurrentNode();
      assertNull(node0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test
  public void test11()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(abstractCompiler0);
      assertNotNull(minimizeExitPoints0);
      
      Node[] nodeArray0 = new Node[4];
      // Undeclared exception!
      try {
        NodeTraversal.traverseRoots(abstractCompiler0, (NodeTraversal.Callback) minimizeExitPoints0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      assertNotNull(compilerOptions0);
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.generateExports);
      
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig(compilerOptions0);
      assertNotNull(defaultPassConfig0);
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.generateExports);
      
      MemoizedScopeCreator memoizedScopeCreator0 = defaultPassConfig0.getTypedScopeCreator();
      assertNull(memoizedScopeCreator0);
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.generateExports);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) unreachableCodeElimination0, (ScopeCreator) memoizedScopeCreator0);
      assertNotNull(nodeTraversal0);
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.generateExports);
      
      Compiler compiler1 = nodeTraversal0.getCompiler();
      assertNotNull(compiler1);
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(0.0, compiler1.getProgress(), 0.01D);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertSame(compiler1, compiler0);
      assertSame(compiler0, compiler1);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.generateExports);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "An(dZg8oQN";
      int int0 = 0;
      Node node0 = Node.newString(string0, int0, int0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isDec());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isWhile());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCatch());
      assertEquals(0, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getSourcePosition());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isScript());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isAnd());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      assertNotNull(inlineSimpleMethods0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      // Undeclared exception!
      try {
        inlineSimpleMethods0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
