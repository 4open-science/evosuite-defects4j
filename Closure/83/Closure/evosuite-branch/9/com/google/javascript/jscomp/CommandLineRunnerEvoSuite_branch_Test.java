/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:46:08 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CommandLineRunnerEvoSuite_branch_Test extends CommandLineRunnerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "Arx9c|?DD&wD47";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      // Undeclared exception!
      try {
        List<JSSourceFile> list0 = commandLineRunner0.createExterns();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "4.!$nQL";
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkSymbols);
      assertTrue(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.reserveRawExports);
      assertTrue(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertTrue(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertTrue(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertTrue(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertTrue(compilerOptions0.inlineLocalVariables);
      assertTrue(compilerOptions0.checkSuspiciousCode);
      assertTrue(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertTrue(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.collapseProperties);
      assertTrue(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertTrue(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.inlineVariables);
      assertTrue(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertTrue(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertTrue(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertTrue(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.optimizeReturns);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertNotNull(compilerOptions0);
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = "(--[a-$zA-Z_]+)=(.*)";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[2] = stringArray0[0];
      assertNotNull(stringArray0[2]);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(stringArray0[2]);
      assertNotNull(mockPrintStream0);
      
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "O/Q/";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(compiler0);
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      String string0 = "function";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = string0;
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = string0;
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = string0;
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = stringArray0[1];
      assertNotNull(stringArray0[6]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      boolean boolean0 = commandLineRunner0.shouldRunCompiler();
      assertFalse(boolean0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
  }
}