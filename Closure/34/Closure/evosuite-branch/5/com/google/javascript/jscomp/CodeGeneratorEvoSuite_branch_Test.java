/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:35:57 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeGeneratorEvoSuite_branch_Test extends CodeGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "com.google.javascript.rhino.jstype.NullType";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertEquals("com.google.javascript.rhino.jstype.NullType", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "\t\n\u000B\fh\rL(\u0085\u1680\"\u205Fz\u3000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertEquals("\\u0009\\u000a\\u000b\\u000ch\\u000dL(\\u0085\\u1680\"\\u205fz\\u3000", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "<!-->`uay7_m\\K/G";
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertEquals("/<\\!--\\>`uay7_m\\K/G/", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = CodeGenerator.regexpEscape(string1, charsetEncoder0);
      assertNotNull(string2);
      assertEquals("//<\\!--\\>`uay7_m\\K/G//", string2);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "</scriptyk_\\5o/rg/";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertEquals("\"<\\/scriptyk_\\\\5o/rg/\"", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "]]>sw";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertEquals("/]]\\>sw/", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = ">$nZgjj\"]>B>2J{@q'";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertEquals("\">$nZgjj\\\"]>B>2J{@q'\"", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "6";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(6.0, double0, 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "wC<s4C?i&";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "<!-->`uay7_m\\K/G";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertEquals("/<\\!--\\>`uay7_m\\K/G/", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertEquals(Double.NaN, double0, 0.01D);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "7rf->mKD@#|eg?>@";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertEquals("\"7rf->mKD@#|eg?>@\"", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "\t\n\u000B\fh\rL(\u0085\u1680\"\u205Fz\u3000";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertEquals("/\\t\\n\\x0B\\u000ch\\rL(\\u0085\\u1680\"\\u205fz\\u3000/", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }
}
