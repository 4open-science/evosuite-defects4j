/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:39:28 GMT 2014
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
      String string0 = "\u001B>";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\"\\u001b>\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertEquals("\"\\u001b>\"", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotNull(string2);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "\t\n;\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180E\u202F";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertEquals("\\u0009\\u000a;\\u000b\\u000c\\u000d \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000\\u00a0\\u180e\\u202f", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "J'->00xzE9";
      char char0 = 'o';
      String string1 = "|</scripts(}pz]Mi9";
      assertNotSame(string1, string0);
      
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      
      String string2 = CodeGenerator.strEscape(string1, char0, string1, string0, string0, charsetEncoder0);
      assertEquals("o|<\\/scripts(}pz]Mi9o", string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotNull(string2);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "ef<F^]>";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/ef<F^]>/", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "J'->00xzE9";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\"J'->00xzE9\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "msg.dup.obN.lit.prop.strict";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "\"e->";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
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
      String string0 = "<\\!--\\><!-->\"";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertEquals("\"<\\\\!--\\\\><\\!--\\>\\\"\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "\t\n;\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180E\u202F";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertEquals("/\\t\\n;\\u000b\\u000c\\r \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000\\u00a0\\u180e\\u202f/", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
  }
}
