/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:17:55 GMT 2014
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
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      String string0 = "SO";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      String string2 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string2);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      Locale locale0 = Locale.JAPANESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ja", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      String string1 = null;
      String string2 = defaultNameProvider0.getShortName(locale0, string0, string1);
      assertNull(string2);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ja", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "";
      Locale locale0 = Locale.JAPANESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      String string2 = defaultNameProvider0.getName(locale0, string1, string0);
      assertNull(string2);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      String string0 = "SO";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      Locale locale1 = null;
      String string2 = defaultNameProvider0.getShortName(locale1, string1, string1);
      assertNull(string2);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
  }

  @Test
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      assertNotNull(locale0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("\u5354\u5B9A\u4E16\u754C\u6642", string1);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      
      String string0 = "WET";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("WET", string1);
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
  }
}