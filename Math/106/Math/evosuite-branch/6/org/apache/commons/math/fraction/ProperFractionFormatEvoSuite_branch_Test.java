/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:24:15 GMT 2014
 */

package org.apache.commons.math.fraction;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProperFractionFormatEvoSuite_branch_Test extends ProperFractionFormatEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      NumberFormat numberFormat0 = null;
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat(numberFormat0, numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "vSjxX'XH2absj";
      ChoiceFormat choiceFormat0 = new ChoiceFormat(string0);
      assertNotNull(choiceFormat0);
      assertEquals(false, choiceFormat0.isParseIntegerOnly());
      assertEquals(1, choiceFormat0.getMinimumIntegerDigits());
      assertEquals(40, choiceFormat0.getMaximumIntegerDigits());
      assertEquals(3, choiceFormat0.getMaximumFractionDigits());
      assertEquals(0, choiceFormat0.getMinimumFractionDigits());
      assertEquals("", choiceFormat0.toPattern());
      assertEquals(true, choiceFormat0.isGroupingUsed());
      
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat((NumberFormat) choiceFormat0, (NumberFormat) choiceFormat0, (NumberFormat) choiceFormat0);
      assertNotNull(properFractionFormat0);
      assertEquals(false, choiceFormat0.isParseIntegerOnly());
      assertEquals(1, choiceFormat0.getMinimumIntegerDigits());
      assertEquals(40, choiceFormat0.getMaximumIntegerDigits());
      assertEquals(3, choiceFormat0.getMaximumFractionDigits());
      assertEquals(0, choiceFormat0.getMinimumFractionDigits());
      assertEquals("", choiceFormat0.toPattern());
      assertEquals(true, choiceFormat0.isGroupingUsed());
      
      try {
        Object object0 = properFractionFormat0.parseObject(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getIntegerInstance();
      assertNotNull(decimalFormat0);
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat((NumberFormat) decimalFormat0);
      assertNotNull(properFractionFormat0);
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      
      int int0 = (-5693);
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals((-5693), (int)integer0);
      
      String string0 = properFractionFormat0.format((Object) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals("-5,693 0 / 1", string0);
      assertNotNull(string0);
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      
      int int1 = 4;
      ParsePosition parsePosition0 = new ParsePosition(int1);
      assertFalse(int1 == int0);
      assertNotNull(parsePosition0);
      assertEquals(-1, parsePosition0.getErrorIndex());
      assertEquals(4, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=4,errorIndex=-1]", parsePosition0.toString());
      
      Fraction fraction0 = properFractionFormat0.parse(string0, parsePosition0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertNotNull(fraction0);
      assertEquals(93, fraction0.intValue());
      assertEquals(93, fraction0.getNumerator());
      assertEquals(93.0F, fraction0.floatValue(), 0.01F);
      assertEquals(93L, fraction0.longValue());
      assertEquals(93, fraction0.byteValue());
      assertEquals(93.0, fraction0.doubleValue(), 0.01D);
      assertEquals(1, fraction0.getDenominator());
      assertEquals(93, fraction0.shortValue());
      assertEquals("java.text.ParsePosition[index=12,errorIndex=6]", parsePosition0.toString());
      assertEquals(12, parsePosition0.getIndex());
      assertEquals(6, parsePosition0.getErrorIndex());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
  }

  @Test
  public void test3()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      assertNotNull(properFractionFormat0);
      
      String string0 = "8 5H";
      Fraction fraction0 = properFractionFormat0.parse(string0);
      assertNotNull(fraction0);
      assertEquals(5L, fraction0.longValue());
      assertEquals(5.0F, fraction0.floatValue(), 0.01F);
      assertEquals(5.0, fraction0.doubleValue(), 0.01D);
      assertEquals(5, fraction0.shortValue());
      assertEquals(5, fraction0.getNumerator());
      assertEquals(5, fraction0.byteValue());
      assertEquals(1, fraction0.getDenominator());
      assertEquals(5, fraction0.intValue());
  }

  @Test
  public void test4()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance();
      assertNotNull(decimalFormat0);
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertNotNull(properFractionFormat0);
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      String string0 = "";
      ParsePosition parsePosition0 = new ParsePosition((int) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=-1]", parsePosition0.toString());
      assertEquals(-1, parsePosition0.getErrorIndex());
      assertEquals(0, parsePosition0.getIndex());
      
      Object object0 = properFractionFormat0.parseObject(string0, parsePosition0);
      assertTrue(integer0.equals((Object)int0));
      assertNull(object0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=-1]", parsePosition0.toString());
      assertEquals(-1, parsePosition0.getErrorIndex());
      assertEquals(0, parsePosition0.getIndex());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
  }

  @Test
  public void test5()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      assertNotNull(properFractionFormat0);
      
      String string0 = "2";
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject(string0);
      assertNotNull(fraction0);
      assertEquals(2.0F, fraction0.floatValue(), 0.01F);
      assertEquals(2, fraction0.byteValue());
      assertEquals(1, fraction0.getDenominator());
      assertEquals(2.0, fraction0.doubleValue(), 0.01D);
      assertEquals(2, fraction0.intValue());
      assertEquals(2, fraction0.shortValue());
      assertEquals(2L, fraction0.longValue());
      assertEquals(2, fraction0.getNumerator());
  }

  @Test
  public void test6()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance();
      assertNotNull(decimalFormat0);
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertNotNull(properFractionFormat0);
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator((Object) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(attributedCharacterIterator0);
      assertEquals(0, attributedCharacterIterator0.getIndex());
      assertEquals(5, attributedCharacterIterator0.getEndIndex());
      assertEquals(0, attributedCharacterIterator0.getBeginIndex());
      assertEquals(0, attributedCharacterIterator0.getRunStart());
      assertEquals(5, attributedCharacterIterator0.getRunLimit());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
  }

  @Test
  public void test7()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      assertNotNull(properFractionFormat0);
      
      String string0 = "3kq_V'PHZ[AhXno";
      int int0 = 0;
      ParsePosition parsePosition0 = new ParsePosition(int0);
      assertNotNull(parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=-1]", parsePosition0.toString());
      assertEquals(-1, parsePosition0.getErrorIndex());
      assertEquals(0, parsePosition0.getIndex());
      
      Object object0 = properFractionFormat0.parseObject(string0, parsePosition0);
      assertNull(object0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=1]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getIndex());
      assertEquals(1, parsePosition0.getErrorIndex());
  }
}
