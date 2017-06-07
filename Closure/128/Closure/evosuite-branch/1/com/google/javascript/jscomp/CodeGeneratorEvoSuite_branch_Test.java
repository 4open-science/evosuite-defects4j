/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:39:03 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeGeneratorEvoSuite_branch_Test extends CodeGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "\u0000\u00ADT\u06DDY\u070F\u1680j\u2028\u206A\uD800cZ\uFFF9\uFFFA";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u0000\\u007f\\u00adT\\u06ddY\\u070f\\u1680j\\u2028\\u206a\\ud800cZ\\ufff9\\ufffa", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertNotSame(string1, string0);
      assertSame(string1, string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertEquals("\\u0000\\u007f\\u00adT\\u06ddY\\u070f\\u1680j\\u2028\\u206a\\ud800cZ\\ufff9\\ufffa", string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotNull(string2);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "89";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(89.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "3";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(3.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "\u0000\u00ADT\u06DDY\u070F\u1680j\u2028\u206A\uD800cZ\uFFF9\uFFFA";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u0000\\u007f\\u00adT\\u06ddY\\u070f\\u1680j\\u2028\\u206a\\ud800cZ\\ufff9\\ufffa", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(Double.NaN, double0, 0.01D);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "\u0000\u00ADT\u06DDY\u070F\u1680j\u2028\u206A\uD800cZ\uFFF9\uFFFA";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "01";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }
}
