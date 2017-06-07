/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:36:39 GMT 2014
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
      
      Locale locale0 = Locale.ITALY;
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertNotNull(locale0);
      
      String string0 = "WET";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("WET", string1);
      
      String string2 = "Zulu";
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertFalse(string2.equals((Object)string1));
      
      String string3 = defaultNameProvider0.getShortName(locale0, string2, string1);
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNull(string3);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertNotNull(locale0);
      
      String string0 = "WET";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("WET", string1);
      
      String string2 = defaultNameProvider0.getName(locale0, string1, string1);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNotNull(string2);
      assertEquals("Ora dell'Europa occidentale", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      
      String string3 = defaultNameProvider0.getShortName(locale0, string2, string2);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNull(string3);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      
      String string4 = defaultNameProvider0.getShortName(locale0, string1, string3);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertSame(string1, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNull(string4);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = "WET";
      String string1 = defaultNameProvider0.getShortName(locale0, string0, string0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("WET", string1);
      
      String string2 = defaultNameProvider0.getName(locale0, string0, string0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNotNull(string2);
      assertEquals("Ora dell'Europa occidentale", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      
      String string3 = defaultNameProvider0.getName(locale0, string2, string1);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNull(string3);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      
      String string4 = defaultNameProvider0.getShortName(locale0, string3, string3);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertNull(string4);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      Locale locale0 = null;
      String string0 = null;
      String string1 = defaultNameProvider0.getName(locale0, string0, string0);
      assertNull(string1);
  }
}
