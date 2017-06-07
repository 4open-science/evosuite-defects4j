/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:57:24 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test extends BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = 55;
      long long0 = ethiopicChronology0.getYearMillis(int0);
      assertEquals((-60190041600000L), long0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = 100000000000000041L;
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = (-8L);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-3419);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      long long0 = 2629746009L;
      long long1 = basicMonthOfYearDateTimeField0.add((long) int0, long0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(6915564048124796581L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      // Undeclared exception!
      try {
        int int1 = basicMonthOfYearDateTimeField0.getDifference((long) int0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 2629746009
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-242);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      int int1 = basicMonthOfYearDateTimeField0.getDifference((long) int0, (long) int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-3981);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = gJMonthOfYearDateTimeField0.remainder((long) int0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(1900796019L, long0);
      
      int int1 = gJMonthOfYearDateTimeField0.getDifference((long) int0, long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test06() {}
//   @Test
//   public void test06()  throws Throwable  {
//       int int0 = (-1288);
//       MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
//       assertNotNull(mockGregorianCalendar0);
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
//       assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
//       
//       MonthDay monthDay0 = MonthDay.fromCalendarFields((Calendar) mockGregorianCalendar0);
//       assertNotNull(monthDay0);
//       assertEquals(2, monthDay0.size());
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
//       assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
//       
//       MonthDay monthDay1 = monthDay0.minusDays(int0);
//       assertNotNull(monthDay1);
//       assertEquals(2, monthDay0.size());
//       assertEquals(2, monthDay1.size());
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
//       assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
//       assertFalse(monthDay0.equals((Object)monthDay1));
//       assertFalse(monthDay1.equals((Object)monthDay0));
//       assertNotSame(monthDay0, monthDay1);
//       assertNotSame(monthDay1, monthDay0);
//   }

  @Test
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) ethiopicChronology0);
      assertNotNull(dateMidnight0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)dateMidnight0.toCalendar(locale0);
      assertNotNull(gregorianCalendar0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertEquals("java.util.GregorianCalendar[time=1392336000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(4, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(true, gregorianCalendar0.isLenient());
      assertEquals(2, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      MonthDay monthDay0 = MonthDay.fromCalendarFields((Calendar) gregorianCalendar0);
      assertNotNull(monthDay0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertEquals("java.util.GregorianCalendar[time=1392336000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals(4, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(true, gregorianCalendar0.isLenient());
      assertEquals(2, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals(2, monthDay0.size());
      
      int int0 = (-23);
      int[] intArray0 = new int[5];
      intArray0[1] = int0;
      // Undeclared exception!
      try {
        int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, int0, intArray0, intArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,13]
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      int int0 = (-6);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      Partial partial0 = new Partial((Chronology) islamicChronology0);
      assertNotNull(partial0);
      assertEquals(0, partial0.size());
      
      int[] intArray0 = new int[3];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, int0, intArray0, int0);
      assertNotNull(intArray1);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(0, partial0.size());
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      int int0 = (-6);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      Partial partial0 = new Partial((Chronology) islamicChronology0);
      assertNotNull(partial0);
      assertEquals(0, partial0.size());
      
      int[] intArray0 = new int[3];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, int0, intArray0, intArray0[1]);
      assertNotNull(intArray1);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals(0, partial0.size());
      assertArrayEquals(new int[] {0, 0, 0}, intArray1);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertSame(intArray1, intArray0);
      assertSame(intArray0, intArray1);
  }

  @Test
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-3426);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      long long0 = 2629746017L;
      long long1 = basicMonthOfYearDateTimeField0.add((long) int0, long0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals(6915564069119996574L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      int int0 = 50;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      long long0 = 62035200009L;
      // Undeclared exception!
      try {
        long long1 = basicMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 62035200009
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      int int0 = (-9);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      long long0 = basicMonthOfYearDateTimeField0.addWrapField((long) int0, int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals((-22982400009L), long0);
      
      // Undeclared exception!
      try {
        long long1 = basicMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -22982400009
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      int int0 = (-6);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      long long0 = basicMonthOfYearDateTimeField0.add((long) int0, int0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals((-15292800006L), long0);
      
      // Undeclared exception!
      try {
        long long1 = basicMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -15292800006
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-3426);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      long long0 = basicMonthOfYearDateTimeField0.add((long) int0, (long) int0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals((-9009532803426L), long0);
  }

  @Test
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-3981);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = gJMonthOfYearDateTimeField0.add((long) int0, (long) int0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals((-9664358403981L), long0);
  }

  @Test
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-242);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      long long0 = 0L;
      long long1 = basicMonthOfYearDateTimeField0.add(long0, long0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(0L, long1);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
  }

  @Test
  public void test17()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-174);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      long long0 = basicMonthOfYearDateTimeField0.addWrapField((long) int0, int0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals((-15897600174L), long0);
  }

  @Test
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-242);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-3981);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(ethiopicChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)basicMonthOfYearDateTimeField0.getLeapDurationField();
      assertNotNull(zonedChronology_ZonedDurationField0);
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals("days", zonedChronology_ZonedDurationField0.getName());
      assertEquals(true, zonedChronology_ZonedDurationField0.isSupported());
  }

  @Test
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-242);
      YearMonth yearMonth0 = new YearMonth((Chronology) gregorianChronology0);
      assertNotNull(yearMonth0);
      assertEquals(2, yearMonth0.size());
      
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      assertNotNull(yearMonth1);
      assertEquals(2, yearMonth1.size());
      assertEquals(2, yearMonth0.size());
      assertFalse(yearMonth1.equals((Object)yearMonth0));
      assertFalse(yearMonth0.equals((Object)yearMonth1));
      assertNotSame(yearMonth1, yearMonth0);
      assertNotSame(yearMonth0, yearMonth1);
  }
}
