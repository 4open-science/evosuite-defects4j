/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:32:17 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckEventfulObjectDisposal;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.SourceFile;
import java.io.PrintStream;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockNullPointerException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CommandLineRunnerEvoSuite_branch_Test extends CommandLineRunnerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      // Undeclared exception!
      try {
        List<SourceFile> list0 = commandLineRunner0.createExterns();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[1];
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = stringArray0[0];
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[1];
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = string0;
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = stringArray0[0];
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = stringArray0[6];
      assertNotNull(stringArray0[7]);
      
      stringArray0[8] = stringArray0[1];
      assertNotNull(stringArray0[8]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertTrue(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.collapseProperties);
      assertTrue(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertTrue(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.optimizeParameters);
      assertTrue(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertTrue(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.generateExports);
      assertTrue(compilerOptions0.coalesceVariableNames);
      assertTrue(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertTrue(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertTrue(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertTrue(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertTrue(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.checkTypes);
      assertTrue(compilerOptions0.optimizeArgumentsArray);
      assertTrue(compilerOptions0.inlineLocalFunctions);
      assertTrue(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.preserveGoogRequires);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.jqueryPass);
      assertNotNull(compilerOptions0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      //  // Unstable assertion: assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      //  // Unstable assertion: assertEquals(true, commandLineRunner0.shouldRunCompiler());
      //  // Unstable assertion: assertNotNull(commandLineRunner0);
      
      String string1 = "--A=";
      //  // Unstable assertion: assertNotSame(string1, string0);
      
      stringArray0[0] = string1;
      //  // Unstable assertion: assertNotNull(stringArray0[0]);
      
      PrintStream printStream0 = commandLineRunner0.getErrorPrintStream();
      //  // Unstable assertion: assertEquals(true, commandLineRunner0.shouldRunCompiler());
      //  // Unstable assertion: assertNotNull(printStream0);
      
      CommandLineRunner commandLineRunner1 = null;
      try {
        commandLineRunner1 = new CommandLineRunner(stringArray0, printStream0, printStream0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = "JlzW)7u";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      String string1 = "- |-[/jxQ'Qs?^K4C";
      assertNotSame(string1, string0);
      
      stringArray0[1] = string1;
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[1];
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = stringArray0[2];
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = stringArray0[3];
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = stringArray0[3];
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = stringArray0[2];
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = stringArray0[6];
      assertNotNull(stringArray0[7]);
      
      stringArray0[8] = string0;
      assertNotNull(stringArray0[8]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(false, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "{h?X9)iL=+h";
      String[] stringArray0 = new String[9];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = stringArray0[0];
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = string0;
      assertNotNull(stringArray0[2]);
      
      stringArray0[3] = stringArray0[0];
      assertNotNull(stringArray0[3]);
      
      stringArray0[4] = string0;
      assertNotNull(stringArray0[4]);
      
      stringArray0[5] = string0;
      assertNotNull(stringArray0[5]);
      
      stringArray0[6] = string0;
      assertNotNull(stringArray0[6]);
      
      stringArray0[7] = stringArray0[6];
      assertNotNull(stringArray0[7]);
      
      stringArray0[8] = stringArray0[3];
      assertNotNull(stringArray0[8]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "z?Z;[)t-[mY?P";
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
      assertNotNull(commandLineRunner0);
      
      boolean boolean0 = commandLineRunner0.shouldRunCompiler();
      assertTrue(boolean0);
      assertEquals(true, commandLineRunner0.shouldRunCompiler());
  }
}
