/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:39:30 GMT 2014
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
      String string0 = "0";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("0", string1);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "</script7<!--> 4\\a";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/<\\/script7<\\!--\\> 4\\a/", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "S.->Qo9&cV?}V";
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertEquals("/S.->Qo9&cV?}V/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "u>";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/u>/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "^e]]>H0!R\"f";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/^e]]\\>H0!R\"f/", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertEquals("//^e]]\\>H0!R\"f//", string2);
      assertNotNull(string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "<p[7ERbO^]>Xm>+3";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/<p[7ERbO^]>Xm>+3/", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "*\t\n\u000B\f \r5\u0085\u2028\u2029a)3";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/*\\t\\n\\x0B\\u000c \\r5\\u0085\\u2028\\u2029a)3/", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "2";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(2.0, double0, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "p[g7erb";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "!\"J8*R|>3f";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "I'Lwc6,.>Bc+L";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\"I'Lwc6,.>Bc+L\"", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "*\t7\u000B\f\r bPs\u180E\u202F";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("*\\u00097\\u000b\\u000c\\u000d bPs\\u180e\\u202f", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }
}
