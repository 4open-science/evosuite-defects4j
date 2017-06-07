/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:21:33 GMT 2014
 */

package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LocaleUtilsEvoSuite_branch_Test extends LocaleUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = null;
      List<Locale> list0 = LocaleUtils.countriesByLanguage(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      
      String string0 = locale0.getDisplayName(locale0);
      assertNotNull(string0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertEquals("\u65E5\u672C\u8A9E (\u65E5\u672C)", string0);
      
      List<Locale> list0 = LocaleUtils.countriesByLanguage(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = null;
      List<Locale> list0 = LocaleUtils.languagesByCountry(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      
      String string0 = locale0.getDisplayName(locale0);
      assertNotNull(string0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("\u65E5\u672C\u8A9E (\u65E5\u672C)", string0);
      
      List<Locale> list0 = LocaleUtils.languagesByCountry(string0);
      assertNotNull(list0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      Locale locale0 = null;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = null;
      Locale locale0 = Locale.ROOT;
      assertNotNull(locale0);
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertNull(locale1);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertNotNull(list0);
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "ep__$yS;vYO{H>";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("ep__$yS;vYO{H>", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("$yS;vYO{H>", locale0.getVariant());
      assertEquals("ep", locale0.getLanguage());
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("ep__$yS;vYO{H>", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("$yS;vYO{H>", locale0.getVariant());
      assertEquals("ep", locale0.getLanguage());
  }

  @Test
  public void test08()  throws Throwable  {
      Locale locale0 = null;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertNotNull(list0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "if_SJ=<?";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_SJ=<?
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "if_Jq";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_Jq
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "if_J!";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: if_J!
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "it_`!";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: it_`!
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "ta_+)O6:E&\\5B l[1;Sj";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ta_+)O6:E&\\5B l[1;Sj
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "zoGr$qj>6b/%~b";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zoGr$qj>6b/%~b
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "sl";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("slv", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("sl", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("sl", locale0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "t~$Y2Gk;~WD";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: t~$Y2Gk;~WD
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "|Dt/TarV";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: |Dt/TarV
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "{`>";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: {`>
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "c:RK2z[";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: c:RK2z[
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "if_ND";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("if", locale0.getLanguage());
      assertEquals("ND", locale0.getCountry());
      assertEquals("if_ND", locale0.toString());
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "RS";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: RS
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertNotNull(set0);
      assertEquals(false, set0.isEmpty());
      assertEquals(156, set0.size());
  }

  @Test
  public void test23()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }

  @Test
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("JPN", locale0.getISO3Country());
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
  }

  @Test
  public void test25()  throws Throwable  {
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
      assertNotNull(localeUtils_SyncAvoid0);
  }
}
