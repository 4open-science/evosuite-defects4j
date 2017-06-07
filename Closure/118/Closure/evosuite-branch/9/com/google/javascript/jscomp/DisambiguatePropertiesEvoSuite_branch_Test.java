/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:56:03 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.jstype.JSType;
import java.util.HashMap;
import java.util.HashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DisambiguatePropertiesEvoSuite_branch_Test extends DisambiguatePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(loggerErrorManager0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      String string0 = "ObjectPropertyStringPostprocess";
      TightenTypes tightenTypes0 = null;
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(disambiguateProperties0);
      
      HashSet<ConcreteType> hashSet0 = null;
      ConcreteType concreteType0 = ConcreteType.createForTypes(hashSet0);
      assertNotNull(concreteType0);
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(concreteType_ConcreteUniqueType0);
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(loggerErrorManager0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      String string0 = "ObjectPropertyStringPostprocess";
      byte byte0 = (byte)0;
      TightenTypes tightenTypes0 = null;
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, hashMap0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(disambiguateProperties0);
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = new ConcreteType.ConcreteUniqueType(byte0);
      assertNotNull(concreteType_ConcreteUniqueType0);
      
      ConcreteType concreteType0 = disambiguateProperties0.getTypeWithProperty(string0, concreteType_ConcreteUniqueType0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNull(concreteType0);
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertNotNull(loggerErrorManager0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(disambiguateProperties0);
      
      // Undeclared exception!
      try {
        compiler0.process(disambiguateProperties0);
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
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertNotNull(loggerErrorManager0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, hashMap0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(disambiguateProperties0);
      
      // Undeclared exception!
      try {
        compiler0.process(disambiguateProperties0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(loggerErrorManager0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      String string0 = "74I;";
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckLevel checkLevel1 = hashMap0.put(string0, checkLevel0);
      assertEquals("{74I;=OFF}", hashMap0.toString());
      assertEquals(1, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, hashMap0);
      assertEquals("{74I;=OFF}", hashMap0.toString());
      assertEquals(1, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(disambiguateProperties0);
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertNotNull(loggerErrorManager0);
      
      HashMap<String, CheckLevel> hashMap0 = new HashMap<String, CheckLevel>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, hashMap0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "ObjectPropertyStringPostprocess";
      JSType jSType0 = null;
      JSType jSType1 = disambiguateProperties0.getTypeWithProperty(string0, jSType0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNull(jSType1);
  }

  @Test
  public void test6()  throws Throwable  {
      DisambiguateProperties.Warnings disambiguateProperties_Warnings0 = new DisambiguateProperties.Warnings();
      assertNotNull(disambiguateProperties_Warnings0);
  }
}
