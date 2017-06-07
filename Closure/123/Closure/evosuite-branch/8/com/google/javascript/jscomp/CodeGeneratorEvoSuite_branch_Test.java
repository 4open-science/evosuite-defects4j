/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:53:16 GMT 2014
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
      String string0 = "Vzt_eOp?qh";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("Vzt_eOp?qh", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "77";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(77.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "07";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "Vzt_eOp?qh";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "\u0000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\"\uFB50\uFE70\uFF61";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "7";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(7.0, double0, 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = "\u0000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\"\uFB50\uFE70\uFF61";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("\\u0000\\u05be\\u05d0\\u05f3\\u0600\\u0750\\u0e00\\u1e00\\u2100\"\\ufb50\\ufe70\\uff61", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }
}
