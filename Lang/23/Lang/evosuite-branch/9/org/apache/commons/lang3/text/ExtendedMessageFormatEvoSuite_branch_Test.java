/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:10:23 GMT 2014
 */

package org.apache.commons.lang3.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
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
      String string0 = "E7p6@;G{0,sTx{=}n[";
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 11
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "{}bD.HbYwJi@=uF";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 1: }
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "R{ ";
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TW", locale0.getCountry());
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 2
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "R{2 %/~}";
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 2: 2 %
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "@Vf'.2g7}xBn";
      Locale locale0 = Locale.ROOT;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("@Vf.2g7}xBn", extendedMessageFormat0.toPattern());
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) string0);
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("@Vf.2g7}xBn", extendedMessageFormat0.toPattern());
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "[ `cnz";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals("[ `cnz", extendedMessageFormat0.toPattern());
      
      Object object0 = null;
      boolean boolean0 = extendedMessageFormat0.equals(object0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals("[ `cnz", extendedMessageFormat0.toPattern());
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "7H$k";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("7H$k", extendedMessageFormat0.toPattern());
      
      ExtendedMessageFormat extendedMessageFormat1 = (ExtendedMessageFormat)extendedMessageFormat0.clone();
      assertNotNull(extendedMessageFormat1);
      assertEquals("7H$k", extendedMessageFormat1.toPattern());
      assertEquals("7H$k", extendedMessageFormat0.toPattern());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertTrue(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertEquals("7H$k", extendedMessageFormat1.toPattern());
      assertEquals("7H$k", extendedMessageFormat0.toPattern());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertTrue(boolean0);
      assertTrue(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertTrue(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
  }

  @Test
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      
      String string0 = "9tl";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("9tl", extendedMessageFormat0.toPattern());
      
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      
      ExtendedMessageFormat extendedMessageFormat1 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertNotNull(extendedMessageFormat1);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("9tl", extendedMessageFormat1.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      
      boolean boolean0 = extendedMessageFormat0.equals((Object) extendedMessageFormat1);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("9tl", extendedMessageFormat1.toPattern());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("9tl", extendedMessageFormat0.toPattern());
      assertNotSame(extendedMessageFormat1, extendedMessageFormat0);
      assertNotSame(extendedMessageFormat0, extendedMessageFormat1);
      assertFalse(boolean0);
      assertFalse(extendedMessageFormat1.equals((Object)extendedMessageFormat0));
      assertFalse(extendedMessageFormat0.equals((Object)extendedMessageFormat1));
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "R{2 }";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertEquals("R{2}", extendedMessageFormat0.toPattern());
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "mbNNW,q1e#\"?";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("mbNNW,q1e#\"?", extendedMessageFormat0.toPattern());
      
      int int0 = 18;
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
  public void test10() {}
//   @Test
//   public void test10()  throws Throwable  {
//       String string0 = "K";
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
//       assertNotNull(extendedMessageFormat0);
//       assertEquals("K", extendedMessageFormat0.toPattern());
//       
//       int int0 = extendedMessageFormat0.hashCode();
//       assertEquals("K", extendedMessageFormat0.toPattern());
//       assertEquals(72077, int0);
//   }

  @Test
  public void test11() {}
//   @Test
//   public void test11()  throws Throwable  {
//       String string0 = "[ `cnz";
//       HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
//       assertNotNull(hashMap0);
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       
//       ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
//       assertNotNull(extendedMessageFormat0);
//       assertEquals(true, hashMap0.isEmpty());
//       assertEquals(0, hashMap0.size());
//       assertEquals("{}", hashMap0.toString());
//       assertEquals("[ `cnz", extendedMessageFormat0.toPattern());
//       
//       int int0 = 0;
//       SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getDateTimeInstance(int0, int0);
//       assertNotNull(simpleDateFormat0);
//       assertEquals(true, simpleDateFormat0.isLenient());
//       assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE ahh'\u65F6'mm'\u5206'ss'\u79D2' z", simpleDateFormat0.toLocalizedPattern());
//       assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE ahh'\u65F6'mm'\u5206'ss'\u79D2' z", simpleDateFormat0.toPattern());
//       
//       // Undeclared exception!
//       try {
//         extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) simpleDateFormat0);
//         fail("Expecting exception: UnsupportedOperationException");
//       
//       } catch(UnsupportedOperationException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
      String string0 = "9tl";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("9tl", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
      Format[] formatArray0 = extendedMessageFormat0.getFormatsByArgumentIndex();
      assertNotNull(formatArray0);
      assertEquals("9tl", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
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
  public void test13()  throws Throwable  {
      String string0 = "K";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertNotNull(extendedMessageFormat0);
      assertEquals("K", extendedMessageFormat0.toPattern());
      
      Format[] formatArray0 = new Format[2];
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
  public void test14()  throws Throwable  {
      String string0 = "R{2 ,}";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
      assertNotNull(extendedMessageFormat0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("R{2}", extendedMessageFormat0.toPattern());
      
      String string1 = extendedMessageFormat0.toPattern();
      assertNotNull(string1);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals("R{2}", extendedMessageFormat0.toPattern());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("R{2}", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "{0 ,~=Y'";
      HashMap<String, FormatFactory> hashMap0 = new HashMap<String, FormatFactory>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map<String, ? extends FormatFactory>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 4
         //
      }
  }
}