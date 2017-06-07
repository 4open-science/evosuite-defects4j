/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:04:16 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class GJChronologyEvoSuite_branch_Test extends GJChronologyEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = (-7L);
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertNotNull(gJChronology0);
      
      int int0 = dateMidnight0.getMinuteOfHour();
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertEquals(0, int0);
      
      YearMonth yearMonth0 = new YearMonth(long0, (Chronology) gJChronology0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals((-86400000L), dateMidnight0.getMillis());
      assertNotNull(yearMonth0);
      
      // Undeclared exception!
      try {
        YearMonth yearMonth1 = yearMonth0.withYear(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year is not supported
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      int int0 = (-609);
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      DateMidnight dateMidnight1 = dateMidnight0.plusYears(int0);
      assertNotSame(dateMidnight1, dateMidnight0);
      assertNotSame(dateMidnight0, dateMidnight1);
      assertEquals((-17825097600000L), dateMidnight1.getMillis());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(dateMidnight1);
      assertFalse(dateMidnight1.equals((Object)dateMidnight0));
      assertFalse(dateMidnight0.equals((Object)dateMidnight1));
      
      Years years0 = Years.yearsBetween((ReadableInstant) dateMidnight1, (ReadableInstant) dateMidnight1);
      assertNotSame(dateMidnight1, dateMidnight0);
      assertNotSame(dateMidnight0, dateMidnight1);
      assertEquals(1, years0.size());
      assertEquals((-17825097600000L), dateMidnight1.getMillis());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(years0);
      assertFalse(dateMidnight1.equals((Object)dateMidnight0));
      assertFalse(dateMidnight0.equals((Object)dateMidnight1));
  }

  @Test
  public void test02()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(gJChronology0);
      
      Months months0 = Months.TWO;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      int int0 = 52;
      long long1 = (-12219292800000L);
      long long2 = gJChronology0.add((ReadablePeriod) months0, long1, int0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(1, months0.size());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals((-11945836800000L), long2);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
  }

  @Test
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Years years0 = Years.ZERO;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      int int0 = (-609);
      Years years1 = years0.plus(int0);
      assertNotSame(years1, years0);
      assertNotSame(years0, years1);
      assertEquals(1, years1.size());
      assertEquals(1, years0.size());
      assertNotNull(years1);
      assertFalse(years1.equals((Object)years0));
      assertFalse(years0.equals((Object)years1));
      
      int int1 = 3786;
      long long0 = gJChronology0.add((ReadablePeriod) years1, (long) int0, int1);
      assertNotSame(years1, years0);
      assertNotSame(years0, years1);
      assertEquals(1, years1.size());
      assertEquals(1, years0.size());
      assertEquals((-72761505120000609L), long0);
      assertFalse(int1 == int0);
      assertFalse(years1.equals((Object)years0));
      assertFalse(int0 == int1);
      assertFalse(years0.equals((Object)years1));
  }

  @Test
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forTimeZone(timeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = 0L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(gJChronology0);
      
      Months months0 = Months.TWO;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      int int0 = 4122;
      long long1 = (-12219292799996L);
      long long2 = gJChronology0.add((ReadablePeriod) months0, long1, int0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(1, months0.size());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(9459500325004L, long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
  }

  @Test
  public void test05()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(gJChronology0);
      
      Months months0 = Months.TWO;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      long long1 = (-4294967296L);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) months0, long1, long0);
      assertEquals(1, months0.size());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertArrayEquals(new int[] {2}, intArray0);
      assertNotNull(intArray0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test06()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      int int0 = 3;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, long0, int0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(gJChronology0);
      
      YearMonth yearMonth0 = new YearMonth(long0, (Chronology) gJChronology0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth0.size());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(yearMonth0);
      
      Months months0 = Months.TWO;
      assertEquals(1, months0.size());
      assertNotNull(months0);
      
      YearMonth yearMonth1 = yearMonth0.minus((ReadablePeriod) months0);
      assertNotSame(yearMonth1, yearMonth0);
      assertNotSame(yearMonth0, yearMonth1);
      assertEquals(2, yearMonth1.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth0.size());
      assertEquals(1, months0.size());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(yearMonth1);
      assertFalse(yearMonth1.equals((Object)yearMonth0));
      assertFalse(yearMonth0.equals((Object)yearMonth1));
      
      YearMonth yearMonth2 = yearMonth1.minusMonths(int0);
      assertNotSame(yearMonth1, yearMonth2);
      assertNotSame(yearMonth1, yearMonth0);
      assertNotSame(yearMonth2, yearMonth1);
      assertNotSame(yearMonth2, yearMonth0);
      assertNotSame(yearMonth0, yearMonth2);
      assertNotSame(yearMonth0, yearMonth1);
      assertEquals(2, yearMonth1.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth2.size());
      assertEquals(2, yearMonth0.size());
      assertEquals(1, months0.size());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(yearMonth2);
      assertFalse(yearMonth1.equals((Object)yearMonth2));
      assertFalse(yearMonth1.equals((Object)yearMonth0));
      assertFalse(yearMonth2.equals((Object)yearMonth1));
      assertFalse(yearMonth2.equals((Object)yearMonth0));
      assertFalse(yearMonth0.equals((Object)yearMonth2));
      assertFalse(yearMonth0.equals((Object)yearMonth1));
  }

  @Test
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      Period period0 = Period.ZERO;
      assertNotNull(period0);
      
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      assertEquals(2, monthDay0.size());
      assertNotNull(monthDay0);
      
      int int0 = (-3780);
      MonthDay monthDay1 = monthDay0.withPeriodAdded((ReadablePeriod) period0, int0);
      assertNotSame(monthDay0, monthDay1);
      assertNotSame(monthDay1, monthDay0);
      assertEquals(2, monthDay0.size());
      assertEquals(2, monthDay1.size());
      assertNotNull(monthDay1);
      assertTrue(monthDay0.equals((Object)monthDay1));
      assertTrue(monthDay1.equals((Object)monthDay0));
  }

  @Test
  public void test08()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = (-1235L);
      int int0 = 3;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, long0, int0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("GJChronology[UTC,cutover=1969-12-31T23:59:58.765Z,mdfw=3]", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(string0);
      assertEquals("GJChronology[UTC,cutover=1970-01-01]", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(gJChronology0);
      
      String string0 = gJChronology0.toString();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(string0);
      assertEquals("GJChronology[Europe/London]", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(0L, dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      int int0 = dateMidnight0.getMinuteOfHour();
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals(0, int0);
      
      int int1 = 2;
      assertFalse(int1 == int0);
      
      long long1 = gJChronology0.getDateTimeMillis(int1, int1, int1, int1, int0, int0, int1);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals((-62101461599998L), long1);
      assertFalse(long0 == long1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(long1 == long0);
  }

  @Test
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      int int0 = 3724;
      int int1 = 2;
      long long0 = gJChronology0.getDateTimeMillis(int0, int1, int1, int1, int1, int1, int1);
      assertEquals(55353636122002L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 11;
      int int1 = 2;
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      int int2 = 29;
      try {
        long long0 = gJChronology0.getDateTimeMillis(int2, int1, int2, int1, int0, int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      int int0 = 3724;
      int int1 = 2;
      try {
        long long0 = gJChronology0.getDateTimeMillis(int0, int1, int1, int0, int0, int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3724 for hourOfDay must be in the range [0,23]
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      int int0 = 3724;
      try {
        long long0 = gJChronology0.getDateTimeMillis(int0, int0, int0, int0, int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3724 for hourOfDay must be in the range [0,23]
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 2551440384L;
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(2505600000L, dateMidnight0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(dateMidnight0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0);
      assertEquals(2505600000L, dateMidnight0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(gJChronology0);
      
      YearMonth yearMonth0 = new YearMonth(long0, (Chronology) gJChronology0);
      assertEquals(2505600000L, dateMidnight0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth0.size());
      assertNotNull(yearMonth0);
      
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(2505600000L, dateMidnight0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(2, yearMonth0.size());
      assertEquals(2674800000L, interval0.getEndMillis());
      assertEquals(1119600000L, interval0.getStartMillis());
      assertNotNull(interval0);
  }

  @Test
  public void test17()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = (-506L);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(long0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(3600000, int0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(gJChronology0);
      
      try {
        long long1 = gJChronology0.getDateTimeMillis(int0, int0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3600000 for monthOfYear must be in the range [1,12]
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      DateTimeZone dateTimeZone0 = null;
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone(dateTimeZone0);
      assertSame(gJChronology1, gJChronology0);
      assertSame(gJChronology0, gJChronology1);
      assertNotNull(gJChronology1);
  }

  @Test
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      int int0 = (-609);
      long long0 = (-12219292800000L);
      // Undeclared exception!
      try {
        GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, long0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -609
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      Years years0 = Years.ZERO;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      int int0 = (-609);
      Years years1 = years0.plus(int0);
      assertNotSame(years0, years1);
      assertNotSame(years1, years0);
      assertEquals(1, years0.size());
      assertEquals(1, years1.size());
      assertNotNull(years1);
      assertFalse(years0.equals((Object)years1));
      assertFalse(years1.equals((Object)years0));
      
      long long0 = gJChronology0.add((ReadablePeriod) years1, (long) int0, int0);
      assertNotSame(years0, years1);
      assertNotSame(years1, years0);
      assertEquals(1, years0.size());
      assertEquals(1, years1.size());
      assertEquals(11703873945599391L, long0);
      assertFalse(years0.equals((Object)years1));
      assertFalse(years1.equals((Object)years0));
  }

  @Test
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      int int0 = gJChronology0.getMinimumDaysInFirstWeek();
      assertEquals(4, int0);
      
      Period period0 = new Period((long) int0);
      assertNotNull(period0);
      
      long long0 = (-11L);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, (long) int0, long0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, (-15)}, intArray0);
      assertNotNull(intArray0);
  }

  @Test
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      boolean boolean0 = gJChronology0.equals((Object) gJChronology0);
      assertTrue(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      assertEquals(3, localDate0.size());
      assertNotNull(localDate0);
      
      int int0 = (-405);
      LocalDate localDate1 = localDate0.withWeekyear(int0);
      assertNotSame(localDate1, localDate0);
      assertNotSame(localDate0, localDate1);
      assertEquals(3, localDate1.size());
      assertEquals(3, localDate0.size());
      assertNotNull(localDate1);
      assertFalse(localDate1.equals((Object)localDate0));
      assertFalse(localDate0.equals((Object)localDate1));
  }

  @Test
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      long long0 = 0L;
      long long1 = gJChronology0.julianToGregorianByWeekyear(long0);
      assertEquals((-1209600000L), long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      //  // Unstable assertion: assertNotNull(gJChronology0);
      
      int int0 = gJChronology0.hashCode();
      //  // Unstable assertion: assertEquals(302621044, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = (-506L);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(long0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(3600000, int0);
      
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(gJChronology0);
      
      LenientChronology lenientChronology0 = LenientChronology.getInstance((Chronology) gJChronology0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(lenientChronology0);
      
      DateMidnight dateMidnight0 = new DateMidnight(int0, int0, int0, (Chronology) lenientChronology0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(123320982812400000L, dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
  }

  @Test
  public void test27()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = 0L;
      int int0 = 3;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, long0, int0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(gJChronology0);
      
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      assertNotNull(assembledChronology_Fields0);
      
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("GMT", zoneInfo0.getID());
  }

  @Test
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertNotNull(gJChronology0);
      
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      assertEquals(2, monthDay0.size());
      assertNotNull(monthDay0);
      
      int int0 = (-3780);
      MonthDay monthDay1 = monthDay0.minusDays(int0);
      assertNotSame(monthDay1, monthDay0);
      assertNotSame(monthDay0, monthDay1);
      assertEquals(2, monthDay1.size());
      assertEquals(2, monthDay0.size());
      assertNotNull(monthDay1);
      assertFalse(monthDay1.equals((Object)monthDay0));
      assertFalse(monthDay0.equals((Object)monthDay1));
  }

  @Test
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      assertEquals("era", dateTimeFieldType0.getName());
      assertEquals("era", dateTimeFieldType0.toString());
      assertNotNull(dateTimeFieldType0);
      
      int int0 = 0;
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldType0, int0, (Chronology) gJChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }
}
