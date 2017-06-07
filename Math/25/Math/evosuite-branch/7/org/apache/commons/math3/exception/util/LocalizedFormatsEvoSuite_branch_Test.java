/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:43:43 GMT 2014
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
      LocalizedFormats localizedFormats0 = LocalizedFormats.STANDARD_DEVIATION;
      assertEquals(LocalizedFormats.STANDARD_DEVIATION, localizedFormats0);
      assertEquals(179, localizedFormats0.ordinal());
      assertEquals("STANDARD_DEVIATION", localizedFormats0.toString());
      assertEquals("STANDARD_DEVIATION", localizedFormats0.name());
      assertEquals("standard deviation ({0})", localizedFormats0.getSourceString());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals("\u00E9cart type ({0})", string0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals(179, localizedFormats0.ordinal());
      assertEquals("STANDARD_DEVIATION", localizedFormats0.toString());
      assertEquals("STANDARD_DEVIATION", localizedFormats0.name());
      assertEquals("standard deviation ({0})", localizedFormats0.getSourceString());
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INFINITE_VALUE_CONVERSION;
      assertEquals(LocalizedFormats.INFINITE_VALUE_CONVERSION, localizedFormats0);
      assertEquals(81, localizedFormats0.ordinal());
      assertEquals("cannot convert infinite value", localizedFormats0.getSourceString());
      assertEquals("INFINITE_VALUE_CONVERSION", localizedFormats0.toString());
      assertEquals("INFINITE_VALUE_CONVERSION", localizedFormats0.name());
      
      Locale locale0 = Locale.PRC;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertNotNull(locale0);
      
      String string0 = localizedFormats0.getLocalizedString(locale0);
      assertEquals("cannot convert infinite value", string0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals(81, localizedFormats0.ordinal());
      assertEquals("cannot convert infinite value", localizedFormats0.getSourceString());
      assertEquals("INFINITE_VALUE_CONVERSION", localizedFormats0.toString());
      assertEquals("INFINITE_VALUE_CONVERSION", localizedFormats0.name());
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS;
      assertEquals(LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS, localizedFormats0);
      assertEquals("{0} method needs at least two previous points", localizedFormats0.getSourceString());
      assertEquals("INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS", localizedFormats0.toString());
      assertEquals(92, localizedFormats0.ordinal());
      assertEquals("INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS", localizedFormats0.name());
      
      String string0 = localizedFormats0.getSourceString();
      assertEquals("{0} method needs at least two previous points", string0);
      assertEquals("{0} method needs at least two previous points", localizedFormats0.getSourceString());
      assertEquals("INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS", localizedFormats0.toString());
      assertEquals(92, localizedFormats0.ordinal());
      assertEquals("INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS", localizedFormats0.name());
      assertNotNull(string0);
  }
}
