/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:23:12 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LocaleUtilsEvoSuite_branch_Test extends LocaleUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "NO";
      List list0 = LocaleUtils.countriesByLanguage(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "NO";
      List list0 = LocaleUtils.languagesByCountry(string0);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "pp_XO_Q5ZXwx/][I";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("pp", locale0.getLanguage());
      assertEquals("Q5ZXwx/][I", locale0.getVariant());
      assertEquals("XO", locale0.getCountry());
      assertEquals("pp_XO_Q5ZXwx/][I", locale0.toString());
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("pp", locale0.getLanguage());
      assertEquals("Q5ZXwx/][I", locale0.getVariant());
      assertEquals("XO", locale0.getCountry());
      assertEquals("pp_XO_Q5ZXwx/][I", locale0.toString());
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      assertNotNull(set0);
      assertEquals(false, set0.isEmpty());
      assertEquals(156, set0.size());
      
      Set set1 = LocaleUtils.availableLocaleSet();
      assertNotNull(set1);
      assertEquals(156, set1.size());
      assertEquals(false, set1.isEmpty());
      assertSame(set1, set0);
  }

  @Test
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      assertNotNull(locale0);
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      
      Locale locale1 = null;
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(3, list0.size());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
  }

  @Test
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      assertNotNull(locale0);
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "&?Z8O8cQ-OwdpXGc~I";
      Locale locale0 = new Locale(string0, string0, string0);
      assertNotNull(locale0);
      assertEquals("&?z8o8cq-owdpxgc~i_&?Z8O8CQ-OWDPXGC~I_&?Z8O8cQ-OwdpXGc~I", locale0.toString());
      assertEquals("&?Z8O8CQ-OWDPXGC~I", locale0.getCountry());
      assertEquals("&?Z8O8cQ-OwdpXGc~I", locale0.getVariant());
      assertEquals("&?z8o8cq-owdpxgc~i", locale0.getLanguage());
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(3, list0.size());
      assertEquals("&?z8o8cq-owdpxgc~i_&?Z8O8CQ-OWDPXGC~I_&?Z8O8cQ-OwdpXGc~I", locale0.toString());
      assertEquals("&?Z8O8CQ-OWDPXGC~I", locale0.getCountry());
      assertEquals("&?Z8O8cQ-OwdpXGc~I", locale0.getVariant());
      assertEquals("&?z8o8cq-owdpxgc~i", locale0.getLanguage());
  }

  @Test
  public void test07()  throws Throwable  {
      Locale locale0 = null;
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "bp_XOT5wx][";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: bp_XOT5wx][
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "bp_X\"p5]?X,1ox\"][I";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: bp_X\"p5]?X,1ox\"][I
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "bp_p\"$XOfZJx]RI";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: bp_p\"$XOfZJx]RI
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "by_&5Zwb6]I";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: by_&5Zwb6]I
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "org.apache.cmmons.lang.LocaleRtils";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.cmmons.lang.LocaleRtils
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "sl";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("sl", locale0.toString());
      assertEquals("slv", locale0.getISO3Language());
      assertEquals("sl", locale0.getLanguage());
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "b}u!i=kE,";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: b}u!i=kE,
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "n,sy_GQ.^%.";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: n,sy_GQ.^%.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "~-01n?y";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ~-01n?y
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "bp_O`so5Z1x]I";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: bp_O`so5Z1x]I
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "%";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: %
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      
      String string0 = locale0.toString();
      assertNotNull(string0);
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", string0);
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertNotNull(locale1);
      assertEquals("DEU", locale1.getISO3Country());
      assertEquals("de", locale1.getLanguage());
      assertEquals("", locale1.getVariant());
      assertEquals("deu", locale1.getISO3Language());
      assertEquals("de_DE", locale1.toString());
      assertEquals("DE", locale1.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertTrue(locale1.equals((Object)locale0));
      assertTrue(locale0.equals((Object)locale1));
      assertNotSame(locale1, locale0);
      assertNotSame(locale0, locale1);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "NO";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: NO
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "NO";
      Locale locale0 = Locale.forLanguageTag(string0);
      assertNotNull(locale0);
      assertEquals("nor", locale0.getISO3Language());
      assertEquals("no", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("no", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("nor", locale0.getISO3Language());
      assertEquals("no", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("no", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertTrue(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }
}
