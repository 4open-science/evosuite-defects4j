/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:28:13 GMT 2014
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
      
      String string0 = "WET";
      Locale locale0 = new Locale(string0, string0);
      assertNotNull(locale0);
      assertEquals("WET", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("wet", locale0.getLanguage());
      
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("WET", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("wet", locale0.getLanguage());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Western European Time", string1);
      
      String string2 = defaultNameProvider0.getName(locale0, string0, string0);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertNotNull(string2);
      assertEquals("WET", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("wet", locale0.getLanguage());
      assertSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertEquals("Western European Time", string2);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      
      String string0 = locale0.getDisplayCountry(locale0);
      assertNotNull(string0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("Canada", string0);
      
      String string1 = null;
      String string2 = defaultNameProvider0.getName(locale0, string0, string1);
      assertNull(string2);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      
      String string0 = null;
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      String string0 = "WET";
      Locale locale0 = new Locale(string0, string0);
      assertNotNull(locale0);
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("WET", locale0.getCountry());
      assertEquals("wet", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("WET", locale0.getCountry());
      assertEquals("wet", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Western European Time", string1);
      
      Locale locale1 = null;
      String string2 = defaultNameProvider0.getName(locale1, string1, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNull(string2);
      assertEquals("wet_WET", locale0.toString());
      assertEquals("wet", locale0.getISO3Language());
      assertEquals("WET", locale0.getCountry());
      assertEquals("wet", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      
      String string0 = locale0.getDisplayCountry(locale0);
      assertNotNull(string0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("Canada", string0);
      
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      
      String string0 = "UTC";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertNotNull(string1);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("UTC", string1);
  }
}
