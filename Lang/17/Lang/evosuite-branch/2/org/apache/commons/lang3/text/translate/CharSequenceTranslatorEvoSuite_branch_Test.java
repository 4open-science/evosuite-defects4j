/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:28:09 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CharSequenceTranslatorEvoSuite_branch_Test extends CharSequenceTranslatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      char char0 = 'N';
      String string0 = CharSequenceTranslator.hex((int) char0);
      assertNotNull(string0);
      assertEquals("4E", string0);
      
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      assertNotNull(unicodeEscaper0);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      assertNotNull(charArrayWriter0);
      
      unicodeEscaper0.translate((CharSequence) string0, (Writer) charArrayWriter0);
      assertEquals("\\u0034\\u0045", charArrayWriter0.toString());
      assertEquals(12, charArrayWriter0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      assertNotNull(octalUnescaper0);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      char char0 = 'N';
      StringWriter stringWriter1 = stringWriter0.append(char0);
      assertEquals("N", stringWriter0.toString());
      assertEquals("N", stringWriter1.toString());
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertNotNull(stringWriter1);
      
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      assertEquals("N", stringWriter0.toString());
      assertEquals("N", stringWriter1.toString());
      assertEquals("N", stringBuffer0.toString());
      assertEquals(16, stringBuffer0.capacity());
      assertEquals(1, stringBuffer0.length());
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertNotNull(stringBuffer0);
      
      String string0 = octalUnescaper0.translate((CharSequence) stringBuffer0);
      assertEquals("N", stringWriter0.toString());
      assertEquals("N", stringWriter1.toString());
      assertEquals("N", stringBuffer0.toString());
      assertEquals(16, stringBuffer0.capacity());
      assertEquals(1, stringBuffer0.length());
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertNotNull(string0);
      assertEquals("N", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-329);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(int0, int0);
      assertNotNull(unicodeEscaper0);
      
      CharSequence charSequence0 = null;
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      unicodeEscaper0.translate(charSequence0, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 273;
      String string0 = CharSequenceTranslator.hex(int0);
      assertNotNull(string0);
      assertEquals("111", string0);
      
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      assertNotNull(unicodeEscaper0);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        unicodeEscaper0.translate((CharSequence) string0, writer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[6];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[0].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[1].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].name());
      
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[2].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].name());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].toString());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[3].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTIONArray0[1];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[4].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].name());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].toString());
      
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTIONArray0[4];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].name());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].toString());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[5].ordinal());
      
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      assertNotNull(numericEntityUnescaper0);
      
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      String string1 = mockFile0.getParent();
      assertNull(string1);
      
      String string2 = numericEntityUnescaper0.translate((CharSequence) string1);
      assertNull(string2);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(int0, int0);
      assertNotNull(unicodeEscaper0);
      
      AggregateTranslator aggregateTranslator0 = (AggregateTranslator)unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
  }
}
