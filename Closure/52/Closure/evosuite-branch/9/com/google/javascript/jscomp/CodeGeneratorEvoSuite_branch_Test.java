/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:38:41 GMT 2014
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
      String string0 = "hr->IqLE";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"hr->IqLE\"", string1);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "<!-->iN*0d";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"<\\!--\\>iN*0d\"", string1);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "d>o5>H`Hq gla";
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/d>o5>H`Hq gla/", string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "</script'l";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/<\\/script'l/", string1);
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertNotNull(string2);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals("//<\\/script'l//", string2);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "\t\nZ}\f\r \u0085\u1680\u20296\u3000";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/\\t\\nZ}\\u000c\\r \\u0085\\u1680\\u20296\\u3000/", string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "9";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(9.0, double0, 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "0[r!_]>";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("0[r!_]>", string1);
      
      boolean boolean0 = CodeGenerator.isSimpleNumber(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "0[r!_]>";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/0[r!_]>/", string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "\"aK$!A,B`0|&StE?";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"\\\"aK$\\u007f!A,B`0|&StE?\"", string1);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "4c!\r\u1680az";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("4c!\\u000d\\u1680az", string1);
  }
}
