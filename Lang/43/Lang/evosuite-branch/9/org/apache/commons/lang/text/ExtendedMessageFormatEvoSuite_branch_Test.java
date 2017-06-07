/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:35:53 GMT 2014
 */

package org.apache.commons.lang.text;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ExtendedMessageFormatEvoSuite_branch_Test extends ExtendedMessageFormatEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "WX\\{4,E'L~r*{/#3";
      HashMap<MessageFormat, DateFormat> hashMap0 = new HashMap<MessageFormat, DateFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 6
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "I^`Ch.0np:m,{,zpsB%";
      HashMap<MessageFormat, SimpleDateFormat> hashMap0 = new HashMap<MessageFormat, SimpleDateFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 13: ,
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "._{ ";
      HashMap<Object, MessageFormat> hashMap0 = new HashMap<Object, MessageFormat>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 3
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "+IO)f9yCI{0 1K";
      HashMap<Object, SimpleDateFormat> hashMap0 = new HashMap<Object, SimpleDateFormat>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 10: 0 1
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "fWN{4,E}1LN4/#3m";
      HashMap<MessageFormat, DateFormat> hashMap0 = new HashMap<MessageFormat, DateFormat>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown format type: E
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "cI~WmyG{0 }K";
      HashMap<Object, SimpleDateFormat> hashMap0 = new HashMap<Object, SimpleDateFormat>();
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertEquals(0, hashMap0.size());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals("cI~WmyG{0}K", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "d";
      HashMap<Object, DateFormat> hashMap0 = new HashMap<Object, DateFormat>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertEquals("d", extendedMessageFormat0.toPattern());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals("{}", hashMap0.toString());
      assertEquals(0, hashMap0.size());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[3];
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
  public void test07()  throws Throwable  {
      String string0 = "K?u\"utN?5?J";
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance();
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertNotNull(decimalFormat0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("K?u\"utN?5?J", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = (-22);
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormat(int0, (Format) decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "The validated array contains null element at index: ";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0);
      assertEquals("The validated array contains null element at index: ", extendedMessageFormat0.toPattern());
      assertNotNull(extendedMessageFormat0);
      
      String string1 = extendedMessageFormat0.toPattern();
      assertEquals("The validated array contains null element at index: ", extendedMessageFormat0.toPattern());
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("The validated array contains null element at index: ", string1);
  }

  @Test
  public void test09()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      String string0 = "~)Oj} &:es=%ts";
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, (Map) hashMap0);
      assertEquals("~)Oj} &:es=%ts", extendedMessageFormat0.toPattern());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(extendedMessageFormat0);
      
      int int0 = 0;
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getPercentInstance(locale0);
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(" %", decimalFormat0.getPositiveSuffix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(" %", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0 %", decimalFormat0.toPattern());
      assertEquals(100, decimalFormat0.getMultiplier());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("#\u00A0##0 %", decimalFormat0.toLocalizedPattern());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(decimalFormat0);
      
      // Undeclared exception!
      try {
        extendedMessageFormat0.setFormatByArgumentIndex(int0, (Format) decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "z[''";
      Locale locale0 = Locale.ITALIAN;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNotNull(locale0);
      
      HashMap<Integer, SimpleDateFormat> hashMap0 = new HashMap<Integer, SimpleDateFormat>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(string0, locale0, (Map) hashMap0);
      assertEquals("z[''", extendedMessageFormat0.toPattern());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(extendedMessageFormat0);
      
      Format[] formatArray0 = new Format[1];
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
}
