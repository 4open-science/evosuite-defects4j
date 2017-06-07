/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 01:26:39 GMT 2014
 */

package com.google.javascript.jscomp.deps;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.deps.DependencyInfo;
import com.google.javascript.jscomp.deps.DepsFileParser;
import com.google.javascript.jscomp.deps.JsFileLineParser;
import com.google.javascript.jscomp.deps.JsFileParser;
import com.google.javascript.jscomp.deps.SimpleDependencyInfo;
import java.util.List;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class JsFileLineParserEvoSuite_branch_Test extends JsFileLineParserEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertNotNull(jsFileParser0);
      
      String string0 = "\\s*(?:'Y(?:\\\\X|[^'])=?)'|\"((?:\\\\\"|l^\"[)*?)\")\\s*";
      try {
        List<String> list0 = jsFileParser0.parseJsStringArray(string0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Syntax error in JS String literal
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ErrorManager errorManager0 = null;
      DepsFileParser depsFileParser0 = new DepsFileParser(errorManager0);
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      String string0 = "k[FTA/@2Ot!d";
      try {
        List<String> list0 = depsFileParser0.parseJsStringArray(string0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Syntax error when parsing JS array
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertNotNull(jsFileParser0);
      
      String string0 = "|VBmPr~'&USoU-4'.[";
      try {
        String string1 = jsFileParser0.parseJsString(string0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Syntax error in JS String literal
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = ". ";
      ErrorManager errorManager0 = null;
      JsFileParser jsFileParser0 = new JsFileParser(errorManager0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertNotNull(jsFileParser0);
      
      boolean boolean0 = true;
      jsFileParser0.setShortcutMode(boolean0);
      assertEquals(false, jsFileParser0.didParseSucceed());
      
      SimpleDependencyInfo simpleDependencyInfo0 = (SimpleDependencyInfo)jsFileParser0.parseFile(string0, string0, string0);
      assertEquals(true, jsFileParser0.didParseSucceed());
      assertEquals(". ", simpleDependencyInfo0.getName());
      assertEquals(". ", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertNotNull(simpleDependencyInfo0);
  }

  @Test
  public void test4()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      assertNull(logger0.getResourceBundleName());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertNull(logger0.getResourceBundleName());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(loggerErrorManager0);
      
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) loggerErrorManager0);
      assertNull(logger0.getResourceBundleName());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertNotNull(jsFileParser0);
      
      String string0 = "Syntax error when parsing JS array";
      String string1 = "/*";
      assertNotSame(string1, string0);
      
      SimpleDependencyInfo simpleDependencyInfo0 = (SimpleDependencyInfo)jsFileParser0.parseFile(string0, string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNull(logger0.getResourceBundleName());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(true, jsFileParser0.didParseSucceed());
      assertEquals("Syntax error when parsing JS array", simpleDependencyInfo0.getName());
      assertEquals("Syntax error when parsing JS array", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertNotNull(simpleDependencyInfo0);
  }

  @Test
  public void test5()  throws Throwable  {
      ErrorManager errorManager0 = null;
      DepsFileParser depsFileParser0 = new DepsFileParser(errorManager0);
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      String string0 = "7Y|hW";
      String string1 = "//";
      assertNotSame(string1, string0);
      
      List<DependencyInfo> list0 = depsFileParser0.parseFile(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(true, depsFileParser0.didParseSucceed());
      assertNotNull(list0);
  }

  @Test
  public void test6()  throws Throwable  {
      ErrorManager errorManager0 = null;
      DepsFileParser depsFileParser0 = new DepsFileParser(errorManager0);
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      String string0 = "7Y|hW";
      List<DependencyInfo> list0 = depsFileParser0.parseFile(string0, string0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(true, depsFileParser0.didParseSucceed());
      assertNotNull(list0);
  }

  @Test
  public void test7()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(loggerErrorManager0);
      
      JsFileParser jsFileParser0 = new JsFileParser((ErrorManager) loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(jsFileParser0);
      
      boolean boolean0 = jsFileParser0.didParseSucceed();
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, jsFileParser0.didParseSucceed());
      assertEquals(false, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertFalse(boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = "{ULTILINE";
      boolean boolean0 = false;
      JsFileLineParser.ParseException jsFileLineParser_ParseException0 = new JsFileLineParser.ParseException(string0, boolean0);
      assertNotNull(jsFileLineParser_ParseException0);
      
      boolean boolean1 = jsFileLineParser_ParseException0.isFatal();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test9()  throws Throwable  {
      ErrorManager errorManager0 = null;
      DepsFileParser depsFileParser0 = new DepsFileParser(errorManager0);
      assertEquals(false, depsFileParser0.didParseSucceed());
      assertNotNull(depsFileParser0);
      
      String string0 = "7Y|hW";
      try {
        List<String> list0 = depsFileParser0.parseJsStringArray(string0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Syntax error when parsing JS array
         //
      }
  }
}
