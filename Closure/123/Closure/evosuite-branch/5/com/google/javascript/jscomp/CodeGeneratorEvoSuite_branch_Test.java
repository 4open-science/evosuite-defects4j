/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:20:20 GMT 2014
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
      String string0 = "BJ";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("BJ", string1);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "53";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(53.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "3";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(3.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "BJ";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "083";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = ".28$GGX3kxk!j_`4";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = "\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2029\u0000\u0000\u0000\u0000)\u0000\u0000\u0000\u0000\u0000\u0000\u0000 M\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000c\u0000\u0000\u0000\u0000t\u2000}\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u0000\u0000\u0000\u0000\u205F=\u0000\u0000\u180E\u0000\u0000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("\\u0001\\u0000\\u00a0\\u0000\\u0000\\u0000\\u0000\\u0000\\u0009\\u000a\\u000b\\u000c\\u000d\\u0000\\u0000\\u2029\\u0000\\u0000\\u0000\\u0000)\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000 M\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000c\\u0000\\u0000\\u0000\\u0000t\\u2000\\u007f}\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u0000\\u0000\\u0000\\u0000\\u205f=\\u0000\\u0000\\u180e\\u0000\\u0000", string1);
  }
}