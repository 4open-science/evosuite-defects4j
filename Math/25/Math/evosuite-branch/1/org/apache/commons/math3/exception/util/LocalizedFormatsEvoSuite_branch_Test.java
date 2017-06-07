/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:38:01 GMT 2014
 */

package org.apache.commons.math3.exception.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LocalizedFormatsEvoSuite_branch_Test extends LocalizedFormatsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE;
      assertEquals("window size must be positive ({0})", localizedFormats0.getSourceString());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.toString());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.name());
      assertEquals(181, localizedFormats0.ordinal());
      assertEquals(LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE, localizedFormats0);
      
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals("window size must be positive ({0})", localizedFormats0.getSourceString());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.toString());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.name());
      assertEquals(181, localizedFormats0.ordinal());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("la taille de la fen\u00EAtre doit \u00EAtre positive ({0})", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO;
      assertEquals(299, localizedFormats0.ordinal());
      assertEquals("WEIGHT_AT_LEAST_ONE_NON_ZERO", localizedFormats0.toString());
      assertEquals("WEIGHT_AT_LEAST_ONE_NON_ZERO", localizedFormats0.name());
      assertEquals("weigth array must contain at least one non-zero value", localizedFormats0.getSourceString());
      assertEquals(LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO, localizedFormats0);
      
      Locale locale0 = Locale.TAIWAN;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals(299, localizedFormats0.ordinal());
      assertEquals("WEIGHT_AT_LEAST_ONE_NON_ZERO", localizedFormats0.toString());
      assertEquals("WEIGHT_AT_LEAST_ONE_NON_ZERO", localizedFormats0.name());
      assertEquals("weigth array must contain at least one non-zero value", localizedFormats0.getSourceString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("weigth array must contain at least one non-zero value", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE;
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.toString());
      assertEquals(181, localizedFormats0.ordinal());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.name());
      assertEquals("window size must be positive ({0})", localizedFormats0.getSourceString());
      assertEquals(LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE, localizedFormats0);
      
      String string0 = localizedFormats0.getSourceString();
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.toString());
      assertEquals(181, localizedFormats0.ordinal());
      assertEquals("NOT_POSITIVE_WINDOW_SIZE", localizedFormats0.name());
      assertEquals("window size must be positive ({0})", localizedFormats0.getSourceString());
      assertEquals("window size must be positive ({0})", string0);
      assertNotNull(string0);
  }
}
