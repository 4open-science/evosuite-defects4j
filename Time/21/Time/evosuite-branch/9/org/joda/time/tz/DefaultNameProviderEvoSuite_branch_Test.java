/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:09:28 GMT 2014
 */

package org.joda.time.tz;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.joda.time.tz.DefaultNameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DefaultNameProviderEvoSuite_branch_Test extends DefaultNameProviderEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      String string0 = "SystemV/HST10";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      
      String string0 = "zFYO4";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      
      String string2 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string2);
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FRA", locale0.getISO3Country());
      
      String string0 = "zFYO4";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FRA", locale0.getISO3Country());
      
      String string2 = defaultNameProvider0.getName(locale0, string0, string1);
      assertNull(string2);
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FRA", locale0.getISO3Country());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = null;
      String string0 = "8pmr";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string1);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("\u534F\u8C03\u4E16\u754C\u65F6\u95F4", string1);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      String string0 = "zFYO4";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      String string2 = defaultNameProvider0.getShortName(locale0, string1, string1);
      assertNull(string2);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("UTC", string1);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
  }
}
