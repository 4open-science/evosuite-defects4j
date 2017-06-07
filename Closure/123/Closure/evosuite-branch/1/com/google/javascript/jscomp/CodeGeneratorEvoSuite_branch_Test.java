/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:36:17 GMT 2014
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
      String string0 = "28";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(28.0, double0, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "5";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(5.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000<\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u0001\\u0000\\u00a0\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0009\\u000a\\u000b\\u000c\\u000d\\u0000<\\u2028\\u2029\\u0000\\u0000\\u0000\\u0000\\u0000\\u202f\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000 \\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u3000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0085\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\u0000\\u0000\\u0000\\u0000\\u0000\\u205f\\u1680\\u0000\\u0000\\u180e\\u0000\\u0000\\u0000", string1);
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
  public void test3()  throws Throwable  {
      String string0 = "\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000<\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = "";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", string1);
      assertNotNull(string1);
      
      boolean boolean0 = CodeGenerator.isSimpleNumber(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "05";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }
}
