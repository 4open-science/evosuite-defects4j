/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:24:10 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckAccessControls;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CheckAccessControlsEvoSuite_branch_Test extends CheckAccessControlsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(checkAccessControls0);
      
      String string0 = "msf.nsef=Urop.write";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasChildren());
      assertEquals(132, node0.getType());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertNotNull(node0);
      
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasChildren());
      assertEquals(132, node0.getType());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(checkAccessControls0);
      
      String string0 = "ms.unuyef.Ur.tpj5De";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(node0);
      
      checkAccessControls0.hotSwapScript(node0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      compiler0.initCompilerOptionsIfTesting();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      
      CheckAccessControls checkAccessControls0 = new CheckAccessControls(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(checkAccessControls0);
      
      String string0 = "BZTN";
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertNotNull(node0);
      
      checkAccessControls0.process(node0, node0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
  }
}
