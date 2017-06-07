/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:49:13 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test extends BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = 100000000000000065L;
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(long0);
      assertEquals(1, int0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = 21859200022L;
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(long0);
      assertFalse(boolean0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      int int0 = 0;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      int int1 = basicMonthOfYearDateTimeField0.getLeapAmount((long) int0);
      assertEquals(0, int1);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = (-80L);
      long long1 = 2147483655L;
      int int0 = gJMonthOfYearDateTimeField0.getDifference(long0, long1);
      assertEquals(0, int0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      long long0 = 1507L;
      int int0 = ethiopicChronology0.getMonthOfYear(long0);
      assertEquals(4, int0);
      
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, int0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      MonthDay monthDay0 = new MonthDay(long0, (Chronology) ethiopicChronology0);
      assertEquals(2, monthDay0.size());
      assertNotNull(monthDay0);
      
      int[] intArray0 = new int[3];
      intArray0[2] = int0;
      // Undeclared exception!
      try {
        int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, int0, intArray0, intArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,13]
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      assertNotNull(islamicChronology0);
      
      int int0 = 1646;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      YearMonth yearMonth0 = new YearMonth((long) int0);
      assertEquals(2, yearMonth0.size());
      assertNotNull(yearMonth0);
      
      int[] intArray0 = new int[20];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) yearMonth0, int0, intArray0, intArray0[1]);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals(2, yearMonth0.size());
      assertSame(intArray0, intArray1);
      assertSame(intArray1, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray1);
      assertNotNull(intArray1);
  }

  @Test
  public void test06()  throws Throwable  {
      long long0 = 1525L;
      System.setCurrentTimeMillis(long0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long1 = (-2L);
      YearMonth yearMonth0 = YearMonth.now((Chronology) gregorianChronology0);
      assertEquals(2, yearMonth0.size());
      assertNotNull(yearMonth0);
      
      long long2 = gregorianChronology0.set((ReadablePartial) yearMonth0, long1);
      assertEquals(2678399998L, long2);
      assertEquals(2, yearMonth0.size());
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long0);
      assertFalse(long2 == long1);
      
      long long3 = gJMonthOfYearDateTimeField0.add(long2, long2);
      assertEquals(7043511683721599998L, long3);
      assertEquals(2, yearMonth0.size());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long1 == long3);
      assertFalse(long2 == long3);
      assertFalse(long2 == long0);
      assertFalse(long2 == long1);
      assertFalse(long3 == long2);
      assertFalse(long3 == long0);
      assertFalse(long3 == long1);
  }

  @Test
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = 1903L;
      long long1 = (-42521587199964L);
      // Undeclared exception!
      try {
        long long2 = gJMonthOfYearDateTimeField0.add(long0, long1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -42521587199964
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = (-27L);
      long long1 = gJMonthOfYearDateTimeField0.getDifferenceAsLong(long0, long0);
      assertEquals(0L, long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      YearMonth yearMonth0 = YearMonth.now((Chronology) gregorianChronology0);
      assertEquals(2, yearMonth0.size());
      assertNotNull(yearMonth0);
      
      long long2 = gregorianChronology0.set((ReadablePartial) yearMonth0, long0);
      assertEquals(1393631999973L, long2);
      assertEquals(2, yearMonth0.size());
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      
      // Undeclared exception!
      try {
        long long3 = gJMonthOfYearDateTimeField0.add(long1, long2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 1393631999973
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) gJChronology0);
      assertNotNull(lenientChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)lenientChronology0.getZone();
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = (-1L);
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertEquals((-2678400001L), long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      
      int int0 = 1173;
      long long2 = gJMonthOfYearDateTimeField0.add((long) int0, long1);
      assertEquals((-7043511689078398827L), long2);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long0);
      assertFalse(long2 == long1);
  }

  @Test
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-29);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      Partial partial0 = new Partial((Chronology) ethiopicChronology0);
      assertEquals(0, partial0.size());
      assertNotNull(partial0);
      
      int[] intArray0 = new int[6];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, int0, intArray0, int0);
      assertEquals(0, partial0.size());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
      assertArrayEquals(new int[] {}, intArray1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
  }

  @Test
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      int int0 = 0;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, int0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      long long0 = basicMonthOfYearDateTimeField0.add((long) int0, int0);
      assertEquals(0L, long0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) gJChronology0);
      assertNotNull(lenientChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)lenientChronology0.getZone();
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = (-1L);
      int int0 = 1173;
      long long1 = gJMonthOfYearDateTimeField0.addWrapField(long0, int0);
      assertEquals((-7948800001L), long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test
  public void test13()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      StrictChronology strictChronology0 = StrictChronology.getInstance((Chronology) julianChronology0);
      assertNotNull(strictChronology0);
  }

  @Test
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      int int0 = 0;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertNotNull(basicMonthOfYearDateTimeField0);
      
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)basicMonthOfYearDateTimeField0.getLeapDurationField();
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals("days", zonedChronology_ZonedDurationField0.getName());
      assertEquals(true, zonedChronology_ZonedDurationField0.isSupported());
      assertNotNull(zonedChronology_ZonedDurationField0);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 1646;
      YearMonth yearMonth0 = new YearMonth((long) int0);
      assertEquals(2, yearMonth0.size());
      assertNotNull(yearMonth0);
      
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      assertEquals(2, yearMonth1.size());
      assertEquals(2, yearMonth0.size());
      assertNotSame(yearMonth1, yearMonth0);
      assertNotSame(yearMonth0, yearMonth1);
      assertNotNull(yearMonth1);
      assertFalse(yearMonth1.equals((Object)yearMonth0));
      assertFalse(yearMonth0.equals((Object)yearMonth1));
  }

  @Test
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertNotNull(gJMonthOfYearDateTimeField0);
      
      long long0 = (-80L);
      long long1 = gJMonthOfYearDateTimeField0.remainder(long0);
      assertEquals(1900799920L, long1);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test17()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      MonthDay monthDay0 = new MonthDay((DateTimeZone) cachedDateTimeZone0);
      assertEquals(2, monthDay0.size());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(monthDay0);
      
      int int0 = (-286);
      MonthDay monthDay1 = monthDay0.plusDays(int0);
      assertEquals(2, monthDay1.size());
      assertEquals(2, monthDay0.size());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotSame(monthDay1, monthDay0);
      assertNotSame(monthDay0, monthDay1);
      assertNotNull(monthDay1);
      assertFalse(monthDay1.equals((Object)monthDay0));
      assertFalse(monthDay0.equals((Object)monthDay1));
  }
}
