/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:34:47 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnsupportedDurationFieldEvoSuite_branch_Test extends UnsupportedDurationFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Days days0 = Days.THREE;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      Weeks weeks0 = days0.toStandardWeeks();
      assertNotNull(weeks0);
      assertEquals(1, days0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = weeks0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals(1, weeks0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals(1, weeks0.size());
      
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(unsupportedDurationField0, durationFieldType0);
      assertNotNull(delegatedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, delegatedDurationField0.isPrecise());
      assertEquals(false, delegatedDurationField0.isSupported());
      assertEquals("weeks", delegatedDurationField0.getName());
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals(1, weeks0.size());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) delegatedDurationField0);
      assertFalse(boolean0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, delegatedDurationField0.isPrecise());
      assertEquals(false, delegatedDurationField0.isSupported());
      assertEquals("weeks", delegatedDurationField0.getName());
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals(1, weeks0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField0);
      assertTrue(boolean0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
  }

  @Test
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, hours0.size());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, hours0.size());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      int int0 = (-1591);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-00:00:01.591", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.toString());
      
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertNotNull(islamicChronology0);
      assertEquals("-00:00:01.591", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.toString());
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) islamicChronology0);
      assertNotNull(lenientChronology0);
      assertEquals("-00:00:01.591", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.toString());
      
      DurationField durationField0 = lenientChronology0.centuries();
      assertNotNull(durationField0);
      assertEquals(false, durationField0.isPrecise());
      assertEquals("centuries", durationField0.getName());
      assertEquals(true, durationField0.isSupported());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.toString());
      
      int int1 = unsupportedDurationField0.compareTo(durationField0);
      assertEquals(1, int1);
      assertEquals(1, hours0.size());
      assertEquals(false, durationField0.isPrecise());
      assertEquals("centuries", durationField0.getName());
      assertEquals(true, durationField0.isSupported());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.591", fixedDateTimeZone0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      assertNotNull(durationFieldType0);
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      int int0 = unsupportedDurationField0.hashCode();
      assertEquals((-53584118), int0);
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // halfdays field is unsupported
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, hours0.size());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, hours0.size());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertTrue(boolean0);
      assertEquals(1, hours0.size());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
  }

  @Test
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertNotNull(periodType0);
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      
      int int0 = 6;
      DurationFieldType durationFieldType0 = periodType0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("millis", unsupportedDurationField0.getName());
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        int int1 = unsupportedDurationField0.getDifference((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertNotNull(durationFieldType0);
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals("weeks", durationFieldType0.toString());
      
      int int0 = 25734363;
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertNotNull(durationFieldType0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("weeks", unsupportedDurationField0.getName());
      
      long long0 = 1319L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(1, hours0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(1, hours0.size());
      
      int int0 = (-1591);
      int int1 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(0, int1);
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(1, hours0.size());
      assertFalse(int1 == int0);
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getValueAsLong((long) int0, (long) int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      long long0 = (-3382L);
      int int0 = 58;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.subtract(long0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      long long0 = (-14L);
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      assertNotNull(durationFieldType0);
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("millis", durationFieldType0.toString());
      assertEquals("millis", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("millis", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millis field is unsupported
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      String string0 = unsupportedDurationField0.toString();
      assertEquals("UnsupportedDurationField[centuries]", string0);
      assertNotNull(string0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
  }

  @Test
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertNotNull(durationFieldType0);
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("minutes", durationFieldType0.getName());
      assertEquals("minutes", durationFieldType0.toString());
      
      long long0 = (-32L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.subtract(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals(0L, long0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
      }
  }

  @Test
  public void test14() {}
//   @Test
//   public void test14()  throws Throwable  {
//       Hours hours0 = Hours.EIGHT;
//       assertNotNull(hours0);
//       assertEquals(1, hours0.size());
//       
//       DurationFieldType durationFieldType0 = hours0.getFieldType();
//       assertNotNull(durationFieldType0);
//       assertEquals(1, hours0.size());
//       assertEquals("hours", durationFieldType0.getName());
//       assertEquals("hours", durationFieldType0.toString());
//       
//       UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
//       assertNotNull(unsupportedDurationField0);
//       assertEquals(1, hours0.size());
//       assertEquals("hours", unsupportedDurationField0.getName());
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("hours", durationFieldType0.getName());
//       assertEquals("hours", durationFieldType0.toString());
//       
//       DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
//       assertSame(durationFieldType1, durationFieldType0);
//       assertSame(durationFieldType0, durationFieldType1);
//       assertNotNull(durationFieldType1);
//       assertEquals(1, hours0.size());
//       assertEquals("hours", durationFieldType1.getName());
//       assertEquals("hours", durationFieldType1.toString());
//       assertEquals("hours", unsupportedDurationField0.getName());
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("hours", durationFieldType0.getName());
//       assertEquals("hours", durationFieldType0.toString());
//   }

  @Test
  public void test15()  throws Throwable  {
      Days days0 = Days.THREE;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      Weeks weeks0 = days0.toStandardWeeks();
      assertNotNull(weeks0);
      assertEquals(1, days0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = weeks0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // weeks field is unsupported
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Days days0 = Days.THREE;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      Weeks weeks0 = days0.toStandardWeeks();
      assertNotNull(weeks0);
      assertEquals(1, days0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = weeks0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, days0.size());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      DurationFieldType durationFieldType1 = days0.getFieldType(int0);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotNull(durationFieldType1);
      assertEquals(1, days0.size());
      assertEquals("days", durationFieldType1.getName());
      assertEquals("days", durationFieldType1.toString());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotNull(unsupportedDurationField1);
      assertEquals(1, days0.size());
      assertEquals("days", durationFieldType1.getName());
      assertEquals("days", durationFieldType1.toString());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals("days", unsupportedDurationField1.getName());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField1);
      assertFalse(boolean0);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotSame(unsupportedDurationField0, unsupportedDurationField1);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertEquals(1, days0.size());
      assertEquals("days", durationFieldType1.getName());
      assertEquals("days", durationFieldType1.toString());
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertEquals(1, weeks0.size());
      assertEquals("weeks", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals("days", unsupportedDurationField1.getName());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertFalse(unsupportedDurationField0.equals((Object)unsupportedDurationField1));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
  }

  @Test
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(0, int0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getDifferenceAsLong((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }
}
