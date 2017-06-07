/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:12:46 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class StringEscapeUtilsEvoSuite_branch_Test extends StringEscapeUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNull(string1);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "G";
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNotNull(string1);
      assertEquals("G", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "Go l\\i?$";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeXml((Writer) mockPrintWriter0, string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "c\\no";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotNull(string1);
      assertEquals("c\no", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeXml(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "Go l\\i?$";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.unescapeXml((Writer) mockPrintWriter0, string0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeXml(string0);
      assertNull(string1);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "G";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("G", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.escapeXml(string1);
      assertNotNull(string2);
      assertEquals("G", string2);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
  }

  @Test
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      char char0 = '&';
      BufferedWriter bufferedWriter0 = new BufferedWriter((Writer) stringWriter0, (int) char0);
      assertNotNull(bufferedWriter0);
      assertEquals("", stringWriter0.toString());
      
      String string0 = null;
      StringEscapeUtils.escapeXml((Writer) bufferedWriter0, string0);
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "Tq~Q['";
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "8aFusmEV1MQu/";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotNull(string1);
      assertEquals("8aFusmEV1MQu/", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      StringEscapeUtils.escapeXml((Writer) charArrayWriter0, string1);
      assertEquals(14, charArrayWriter0.size());
      assertEquals("8aFusmEV1MQu/", charArrayWriter0.toString());
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "The Writer must not be null.";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeHtml((Writer) mockPrintWriter0, string1);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "Lt>e|a6A$5kZ";
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeHtml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNull(string1);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "The Writer must not be null.";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.escapeHtml((Writer) mockPrintWriter0, string1);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "/{3/9\\m{RL";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNotNull(string1);
      assertEquals("/{3/9\\m{RL", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeHtml(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.escapeHtml(string1);
      assertNull(string2);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "\"Q`3fl\\a}iAi";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNotNull(string1);
      assertEquals("&quot;Q`3fl\\a}iAi", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "[9e5|A iX~vd&[`\\";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("[9e5|A iX~vd&[`\\", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.unescapeJavaScript(string1);
      assertNotNull(string2);
      assertEquals("[9e5|A iX~vd&[`\\", string2);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "AYB\\qNd0i";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotNull(string1);
      assertEquals("AYBqNd0i", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "^~\\fR^{";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertNotNull(string1);
      assertEquals("^~\fR^{", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "G";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = "0G\\bs";
      assertNotSame(string1, string0);
      
      StringEscapeUtils.unescapeJavaScript((Writer) mockPrintWriter0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "E'";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotNull(string1);
      assertEquals("E\\'", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      
      StringEscapeUtils.unescapeJava((Writer) charArrayWriter0, string1);
      assertEquals(2, charArrayWriter0.size());
      assertEquals("E'", charArrayWriter0.toString());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "\"Q`3fl\\a}iAi";
      String string1 = StringEscapeUtils.escapeJavaScript(string0);
      assertNotNull(string1);
      assertEquals("\\\"Q`3fl\\\\a}iAi", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.unescapeJava(string1);
      assertNotNull(string2);
      assertEquals("\"Q`3fl\\a}iAi", string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "\\uif66";
      // Undeclared exception!
      try {
        String string1 = StringEscapeUtils.unescapeJava(string0);
        fail("Expecting exception: VerifyError");
      
      } catch(VerifyError e) {
         //
         // (class: org/apache/commons/lang/exception/NestableRuntimeException, method: getMessage signature: (I)Ljava/lang/String;) Illegal use of nonvirtual function call
         //
      }
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = "The Writer must not be null.";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeJava((Writer) mockPrintWriter0, string1);
  }

  @Test
  public void test25() {}
//   @Test
//   public void test25()  throws Throwable  {
//       Locale locale0 = Locale.ITALY;
//       assertNotNull(locale0);
//       assertEquals("IT", locale0.getCountry());
//       assertEquals("", locale0.getVariant());
//       assertEquals("it", locale0.getLanguage());
//       assertEquals("ITA", locale0.getISO3Country());
//       assertEquals("it_IT", locale0.toString());
//       assertEquals("ita", locale0.getISO3Language());
//       
//       String string0 = locale0.getDisplayLanguage();
//       assertNotNull(string0);
//       assertEquals("\u610F\u5927\u5229\u6587", string0);
//       assertEquals("IT", locale0.getCountry());
//       assertEquals("", locale0.getVariant());
//       assertEquals("it", locale0.getLanguage());
//       assertEquals("ITA", locale0.getISO3Country());
//       assertEquals("it_IT", locale0.toString());
//       assertEquals("ita", locale0.getISO3Language());
//       
//       Writer writer0 = null;
//       // Undeclared exception!
//       try {
//         StringEscapeUtils.unescapeJava(writer0, string0);
//         fail("Expecting exception: IllegalArgumentException");
//       
//       } catch(IllegalArgumentException e) {
//          //
//          // The Writer must not be null
//          //
//       }
//   }

  @Test
  public void test26()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.unescapeJavaScript(string1);
      assertNull(string2);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = "/{3/9\\m{RL";
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNotNull(string1);
      assertEquals("/{3/9\\m{RL", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      
      String string2 = StringEscapeUtils.escapeJavaScript(string1);
      assertNotNull(string2);
      assertEquals("\\/{3\\/9\\\\m{RL", string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = "E'";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNotNull(string1);
      assertEquals("E'", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = " \t\r\n\b";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.escapeJava((Writer) mockFileWriter0, string0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = "The Writer must not be null.";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(string0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      String string2 = StringEscapeUtils.unescapeXml(string1);
      assertNull(string2);
      
      StringEscapeUtils.escapeJavaScript((Writer) mockPrintWriter0, string2);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = "G";
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNotNull(string1);
      assertEquals("G", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeJava(writer0, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNull(string1);
  }

  @Test
  public void test33()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
      assertNotNull(stringEscapeUtils0);
  }

  @Test
  public void test34() {}
//   @Test
//   public void test34()  throws Throwable  {
//       Locale locale0 = Locale.ITALY;
//       assertNotNull(locale0);
//       assertEquals("it", locale0.getLanguage());
//       assertEquals("ita", locale0.getISO3Language());
//       assertEquals("ITA", locale0.getISO3Country());
//       assertEquals("", locale0.getVariant());
//       assertEquals("IT", locale0.getCountry());
//       assertEquals("it_IT", locale0.toString());
//       
//       String string0 = locale0.getDisplayLanguage();
//       assertNotNull(string0);
//       assertEquals("\u610F\u5927\u5229\u6587", string0);
//       assertEquals("it", locale0.getLanguage());
//       assertEquals("ita", locale0.getISO3Language());
//       assertEquals("ITA", locale0.getISO3Country());
//       assertEquals("", locale0.getVariant());
//       assertEquals("IT", locale0.getCountry());
//       assertEquals("it_IT", locale0.toString());
//       
//       String string1 = StringEscapeUtils.escapeJavaScript(string0);
//       assertNotNull(string1);
//       assertEquals("\\u610F\\u5927\\u5229\\u6587", string1);
//       assertEquals("it", locale0.getLanguage());
//       assertEquals("ita", locale0.getISO3Language());
//       assertEquals("ITA", locale0.getISO3Country());
//       assertEquals("", locale0.getVariant());
//       assertEquals("IT", locale0.getCountry());
//       assertEquals("it_IT", locale0.toString());
//       assertFalse(string1.equals((Object)string0));
//       assertFalse(string0.equals((Object)string1));
//       assertNotSame(string1, string0);
//       assertNotSame(string0, string1);
//   }
}
