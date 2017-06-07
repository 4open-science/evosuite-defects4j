/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:26:36 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.jscomp.Result;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MakeDeclaredNamesUniqueEvoSuite_branch_Test extends MakeDeclaredNamesUniqueEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "a;\"4l$$9D<<=G";
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      boolean boolean0 = false;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName(string0);
  }

  @Test
  public void test01()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = "s^jzVwi]ulK}$:,/";
      String string1 = "";
      assertNotSame(string1, string0);
      
      boolean boolean0 = true;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test02()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = "Rq[jjQLE_#Tg";
      boolean boolean0 = false;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName(string0);
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName(string0);
  }

  @Test
  public void test03()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("a", string0);
      
      boolean boolean0 = true;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      
      String string1 = "arguments";
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      
      // Undeclared exception!
      try {
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName(string1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      assertNotNull(makeDeclaredNamesUnique_ContextualRenamer0);
      
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer1 = (MakeDeclaredNamesUnique.ContextualRenamer)makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      assertNotNull(makeDeclaredNamesUnique_ContextualRenamer1);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer1.equals((Object)makeDeclaredNamesUnique_ContextualRenamer0));
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
      
      String string0 = "visibility";
      makeDeclaredNamesUnique_ContextualRenamer1.addDeclaredName(string0);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer1.equals((Object)makeDeclaredNamesUnique_ContextualRenamer0));
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
      
      makeDeclaredNamesUnique_ContextualRenamer1.addDeclaredName(string0);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer1.equals((Object)makeDeclaredNamesUnique_ContextualRenamer0));
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
  }

  @Test
  public void test05()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = "arguments";
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, string0);
      assertNotNull(makeDeclaredNamesUnique_BoilerplateRenamer0);
      
      makeDeclaredNamesUnique_BoilerplateRenamer0.addDeclaredName(string0);
  }

  @Test
  public void test06()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      assertNotNull(makeDeclaredNamesUnique_ContextualRenamer0);
      
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotNull(makeDeclaredNamesUnique0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
      assertNotNull(nodeTraversal0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
      assertNotNull(node0);
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(83, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      
      makeDeclaredNamesUnique0.visit(nodeTraversal0, node0, node0);
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertNull(node0.getSourceFileName());
      assertEquals(83, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
  }

  @Test
  public void test07()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      assertNotNull(makeDeclaredNamesUnique0);
      
      AbstractCompiler abstractCompiler0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
      assertNotNull(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      Stack<JSType> stack0 = new Stack<JSType>();
      assertNotNull(stack0);
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) stack0);
      assertNotNull(node0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertNull(node0.getSourceFileName());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      
      // Undeclared exception!
      try {
        nodeTraversal0.traverse(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "com.google.javascr=pt.jscomp.CheckGlobalNames";
      String string1 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(string0);
      assertNotNull(string1);
      assertEquals("com.google.javascr=pt.jscomp.CheckGlobalNames", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string1, string1);
      assertNotNull(node0);
      assertEquals(0, node0.getCharno());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(" [testcode] ", node0.getSourceFileName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test09()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      assertNotNull(makeDeclaredNamesUnique_ContextualRenamer0);
      
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer1 = (MakeDeclaredNamesUnique.ContextualRenamer)makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      assertNotNull(makeDeclaredNamesUnique_ContextualRenamer1);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer1.equals((Object)makeDeclaredNamesUnique_ContextualRenamer0));
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
      
      String string0 = "visibility";
      makeDeclaredNamesUnique_ContextualRenamer0.addDeclaredName(string0);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
      
      makeDeclaredNamesUnique_ContextualRenamer1.addDeclaredName(string0);
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer1.equals((Object)makeDeclaredNamesUnique_ContextualRenamer0));
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_ContextualRenamer1));
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
      assertNotSame(makeDeclaredNamesUnique_ContextualRenamer0, makeDeclaredNamesUnique_ContextualRenamer1);
  }

  @Test
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "/iY`Gkd/U!/f@C%Y";
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(supplier0, string0);
      assertNotNull(makeDeclaredNamesUnique_BoilerplateRenamer0);
      
      boolean boolean0 = makeDeclaredNamesUnique_BoilerplateRenamer0.stripConstIfReplaced();
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      compiler0.disableThreads();
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      assertNotNull(stack0);
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.isEmpty());
      assertEquals(true, stack0.empty());
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      assertNotNull(compilerOptions0);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.assumeClosuresOnlyCaptureReferences);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.collapseObjectLiterals);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      
      Result result0 = compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      assertNotNull(result0);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.assumeClosuresOnlyCaptureReferences);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.collapseObjectLiterals);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.isEmpty());
      assertEquals(true, stack0.empty());
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "a;\"4l$$9D<<=G";
      String string1 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(string0);
      assertNotNull(string1);
      assertEquals("a;\"4l", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test13()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = "Rq[jjQLE_#Tg";
      boolean boolean0 = false;
      String string1 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string1);
      assertEquals("a", string1);
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      
      String string2 = makeDeclaredNamesUnique_InlineRenamer0.getReplacementName(string1);
      assertNull(string2);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test14()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = "Rq[jjQLE_#Tg";
      boolean boolean0 = false;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      
      boolean boolean1 = makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced();
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
  }

  @Test
  public void test15()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      String string0 = renameLabels_DefaultNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("a", string0);
      
      boolean boolean0 = true;
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, string0, boolean0);
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer0);
      
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer1 = (MakeDeclaredNamesUnique.InlineRenamer)makeDeclaredNamesUnique_InlineRenamer0.forChildScope();
      assertNotNull(makeDeclaredNamesUnique_InlineRenamer1);
      assertFalse(makeDeclaredNamesUnique_InlineRenamer1.equals((Object)makeDeclaredNamesUnique_InlineRenamer0));
      assertFalse(makeDeclaredNamesUnique_InlineRenamer0.equals((Object)makeDeclaredNamesUnique_InlineRenamer1));
      assertNotSame(makeDeclaredNamesUnique_InlineRenamer1, makeDeclaredNamesUnique_InlineRenamer0);
      assertNotSame(makeDeclaredNamesUnique_InlineRenamer0, makeDeclaredNamesUnique_InlineRenamer1);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "";
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(functionToBlockMutator_LabelNameSupplier0, string0);
      assertNotNull(makeDeclaredNamesUnique_BoilerplateRenamer0);
      
      // Undeclared exception!
      try {
        MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}