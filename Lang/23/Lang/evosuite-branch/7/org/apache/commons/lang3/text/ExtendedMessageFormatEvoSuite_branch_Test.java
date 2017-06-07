/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:49:44 GMT 2014
 */

package org.apache.commons.lang3.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.text.Format;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.apache.commons.lang3.text.FormatFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ExtendedMessageFormatEvoSuite_branch_Test extends ExtendedMessageFormatEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "~Yo{6 {5dOySN=h";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 4: 6 {
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "evv={ ";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 5
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      String string0 = "Qi-ZZz@{,1'uI4M?";
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 8: ,
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "z4";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("z4", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("z4", extendedMessageFormat1.toPattern());
      assertNotNull(extendedMessageFormat1);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertTrue(boolean0);
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertTrue(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("z4", extendedMessageFormat1.toPattern());
      assertEquals("z4", extendedMessageFormat0.toPattern());
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "";
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertNotNull(locale0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertNotNull(extendedMessageFormat0);
      
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat(string0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertEquals("", extendedMessageFormat1.toPattern());
      assertNotNull(extendedMessageFormat1);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertFalse(boolean0);
      assertFalse(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", extendedMessageFormat1.toPattern());
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "vZ@4]p";
      Locale locale0 = Locale.CHINA;
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      Map<String, FormatFactory> map0 = null;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) map0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(extendedMessageFormat0);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) map0);
      assertFalse(boolean0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(extendedMessageFormat0);
      
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat(string0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertEquals("", extendedMessageFormat1.toPattern());
      assertNotNull(extendedMessageFormat1);
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertFalse(boolean0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertFalse(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertEquals("", extendedMessageFormat1.toPattern());
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "gl{8}!H";
      Locale locale0 = Locale.TAIWAN;
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("gl{8}!H", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "oj^^Xt8jb*}";
      Locale locale0 = Locale.CANADA;
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertEquals("oj^^Xt8jb*}", extendedMessageFormat0.toPattern());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = (-2644);
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormat(int0, (Format) extendedMessageFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test09() {}
//   @Test
//   public void test09()  throws Throwable  {
//       String string0 = "\"/";
//       Locale locale0 = null;
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
//       assertEquals("\"/", extendedMessageFormat0.toPattern());
//       assertNotNull(extendedMessageFormat0);
//       
//       int int0 = extendedMessageFormat0.hashCode();
//       assertEquals(1058063, int0);
//       assertEquals("\"/", extendedMessageFormat0.toPattern());
//   }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "''";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals("''", extendedMessageFormat0.toPattern());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = (-4938);
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) extendedMessageFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "vZ@4]p";
      Locale locale0 = Locale.CHINA;
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      Map<String, FormatFactory> map0 = null;
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) map0);
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[4];
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "z4";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertEquals("z4", extendedMessageFormat0.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[28];
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormats(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "";
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertNotNull(locale0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertNotNull(extendedMessageFormat0);
      
      String string1 = extendedMessageFormat0.toPattern();
      assertEquals("", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertNotNull(string1);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "o{6 , F{|)'D5wOySE";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 5
         //
      }
  }
}
