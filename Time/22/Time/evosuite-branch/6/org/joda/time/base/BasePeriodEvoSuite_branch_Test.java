/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:52:52 GMT 2014
 */

package org.joda.time.base;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasePeriodEvoSuite_branch_Test extends BasePeriodEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = 3284;
      int int1 = (-208);
      MutableDateTime mutableDateTime0 = new MutableDateTime((long) int1);
      assertFalse(int1 == int0);
      assertNotNull(mutableDateTime0);
      assertEquals((-208L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      
      Period period0 = new Period((long) int0, (long) int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      Duration duration0 = period0.toDurationFrom((ReadableInstant) mutableDateTime0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(duration0);
      assertEquals(8, period0.size());
      assertEquals((-208L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-3492L), duration0.getMillis());
      
      PeriodType periodType0 = PeriodType.months();
      assertNotNull(periodType0);
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) mutableDateTime0, (ReadableDuration) duration0, periodType0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, period0.size());
      assertEquals((-208L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals((-3492L), duration0.getMillis());
      assertEquals(1, mutablePeriod0.size());
      
      // Undeclared exception!
      try {
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'seconds'
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      Object object0 = null;
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      assertEquals(1, periodType0.size());
      assertEquals("Millis", periodType0.getName());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(object0, periodType0, (Chronology) gJChronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Millis", periodType0.getName());
      
      ReadablePeriod readablePeriod0 = null;
      mutablePeriod0.add(readablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Millis", periodType0.getName());
  }

  @Test
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      Hours hours0 = Hours.ONE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      mutablePeriod0.mergePeriod((ReadablePeriod) hours0);
      assertEquals(1, hours0.size());
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test03()  throws Throwable  {
      long long0 = (-6L);
      TimeOfDay timeOfDay0 = new TimeOfDay(long0);
      assertNotNull(timeOfDay0);
      assertEquals(4, timeOfDay0.size());
      
      Months months0 = Months.monthsBetween((ReadablePartial) timeOfDay0, (ReadablePartial) timeOfDay0);
      assertNotNull(months0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(1, months0.size());
      
      MutablePeriod mutablePeriod0 = months0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, months0.size());
      
      ReadablePeriod readablePeriod0 = null;
      mutablePeriod0.mergePeriod(readablePeriod0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, months0.size());
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 0;
      PeriodType periodType0 = PeriodType.weeks();
      assertNotNull(periodType0);
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, (long) int0, periodType0, (Chronology) gJChronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      mutablePeriod0.addMinutes(int0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
  }

  @Test
  public void test05()  throws Throwable  {
      long long0 = (-6L);
      Months months0 = Months.SEVEN;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      PeriodType periodType0 = months0.getPeriodType();
      assertNotNull(periodType0);
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals(1, months0.size());
      
      int int0 = (-85);
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, months0.size());
      
      // Undeclared exception!
      try {
        mutablePeriod0.addDays(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = null;
      // Undeclared exception!
      try {
        mutablePeriod0.add(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Object object0 = null;
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      assertEquals("Millis", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      assertNotNull(gJChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(object0, periodType0, (Chronology) gJChronology0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Millis", periodType0.getName());
      assertEquals(1, periodType0.size());
      
      int int0 = 0;
      mutablePeriod0.setYears(int0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Millis", periodType0.getName());
      assertEquals(1, periodType0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      int int0 = 57;
      Period period0 = new Period((Object) readableInstant0);
      assertNotNull(period0);
      assertEquals(8, period0.size());
      
      PeriodType periodType0 = PeriodType.hours();
      assertNotNull(periodType0);
      assertEquals(1, periodType0.size());
      assertEquals("Hours", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) period0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, periodType0.size());
      assertEquals("Hours", periodType0.getName());
      assertEquals(1, mutablePeriod0.size());
      assertEquals(8, period0.size());
      
      // Undeclared exception!
      try {
        mutablePeriod0.setMillis(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      
      int int0 = 57;
      Hours hours0 = Hours.ONE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(1, hours0.size());
      
      Period period1 = period0.withField(durationFieldType0, int0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(8, period0.size());
      assertEquals(1, weeks0.size());
      assertEquals(1, hours0.size());
      assertEquals(8, period1.size());
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
  }

  @Test
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Period period0 = weeks0.toPeriod();
      assertNotNull(period0);
      assertEquals(1, weeks0.size());
      assertEquals(8, period0.size());
      
      PeriodType periodType0 = PeriodType.hours();
      assertNotNull(periodType0);
      assertEquals(1, periodType0.size());
      assertEquals("Hours", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod((Object) period0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      long long0 = 2245L;
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      int int0 = 365;
      LocalTime localTime0 = new LocalTime(long0, (Chronology) copticChronology0);
      assertNotNull(localTime0);
      assertEquals(4, localTime0.size());
      
      MockDate mockDate0 = new MockDate(int0, int0, int0, int0, int0, int0);
      assertNotNull(mockDate0);
      assertEquals("Sun Jun 14 11:11:05 GMT 2296", mockDate0.toString());
      
      LocalDate localDate0 = LocalDate.fromDateFields((Date) mockDate0);
      assertNotNull(localDate0);
      assertEquals("Sun Jun 14 11:11:05 GMT 2296", mockDate0.toString());
      assertEquals(3, localDate0.size());
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) localTime0, (ReadablePartial) localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test12() {}
//   @Test
//   public void test12()  throws Throwable  {
//       TimeOfDay timeOfDay0 = new TimeOfDay();
//       assertNotNull(timeOfDay0);
//       assertEquals(4, timeOfDay0.size());
//       
//       LocalTime localTime0 = timeOfDay0.toLocalTime();
//       assertNotNull(localTime0);
//       assertEquals(4, timeOfDay0.size());
//       assertEquals(4, localTime0.size());
//       
//       PeriodType periodType0 = null;
//       Period period0 = new Period((ReadablePartial) localTime0, (ReadablePartial) timeOfDay0, periodType0);
//       assertNotNull(period0);
//       assertEquals(4, timeOfDay0.size());
//       assertEquals(8, period0.size());
//       assertEquals(4, localTime0.size());
//   }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "";
      MonthDay monthDay0 = MonthDay.parse(string0);
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertNotNull(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      
      YearMonth yearMonth0 = YearMonth.fromCalendarFields((Calendar) mockGregorianCalendar0);
      assertNotNull(yearMonth0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals(2, yearMonth0.size());
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) monthDay0, (ReadablePartial) yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      LocalDate localDate0 = new LocalDate((DateTimeZone) cachedDateTimeZone0);
      assertNotNull(localDate0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals(3, localDate0.size());
      
      ReadablePartial readablePartial0 = null;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      assertNotNull(periodType0);
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) localDate0, readablePartial0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      LocalDate localDate0 = new LocalDate((DateTimeZone) cachedDateTimeZone0);
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      PeriodType periodType0 = PeriodType.yearWeekDay();
      assertNotNull(periodType0);
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      
      Period period0 = new Period((ReadablePartial) localDate0, (ReadablePartial) localDate0, periodType0);
      assertNotNull(period0);
      assertEquals(3, localDate0.size());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(3, period0.size());
      assertEquals("YearWeekDay", periodType0.getName());
      assertEquals(3, periodType0.size());
  }

  @Test
  public void test16()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      PeriodType periodType0 = null;
      Period period0 = null;
      try {
        period0 = new Period(readablePartial0, readablePartial0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, readableInstant0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      DateTimeZone dateTimeZone0 = null;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      assertNotNull(copticChronology0);
      
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology0);
      assertNotNull(mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, (ReadableInstant) mutableDateTime0);
      assertNotNull(mutablePeriod0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test19()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      assertNotNull(dateMidnight0);
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      
      DateTime dateTime0 = dateMidnight0.toDateTime();
      assertNotNull(dateTime0);
      assertEquals(1392336000000L, dateTime0.getMillis());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableInstant) dateMidnight0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1392336000000L, dateTime0.getMillis());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
  }

  @Test
  public void test20()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      DurationFieldType durationFieldType0 = null;
      int int0 = 0;
      // Undeclared exception!
      try {
        mutablePeriod0.set(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      MutablePeriod mutablePeriod0 = years0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
      
      int int0 = 0;
      mutablePeriod0.addMinutes(int0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, years0.size());
  }

  @Test
  public void test22()  throws Throwable  {
      long long0 = 1L;
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)iSOChronology0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) cachedDateTimeZone0);
      assertNotNull(dateMidnight0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      
      MutableDateTime mutableDateTime0 = dateMidnight0.toMutableDateTime();
      assertNotNull(mutableDateTime0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      
      Duration duration0 = Duration.millis(long0);
      assertNotNull(duration0);
      assertEquals(1L, duration0.getMillis());
      
      PeriodType periodType0 = PeriodType.yearDayTime();
      assertNotNull(periodType0);
      assertEquals(6, periodType0.size());
      assertEquals("YearDayTime", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) mutableDateTime0, (ReadableDuration) duration0, periodType0);
      assertNotNull(mutablePeriod0);
      assertEquals(1L, duration0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(6, periodType0.size());
      assertEquals("YearDayTime", periodType0.getName());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(6, mutablePeriod0.size());
      
      Duration duration1 = mutablePeriod0.toDurationTo((ReadableInstant) dateMidnight0);
      assertTrue(duration0.equals((Object)duration1));
      assertTrue(duration1.equals((Object)duration0));
      assertNotNull(duration1);
      assertEquals(1L, duration0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(6, periodType0.size());
      assertEquals("YearDayTime", periodType0.getName());
      assertEquals(1L, duration1.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(6, mutablePeriod0.size());
      assertNotSame(duration0, duration1);
      assertNotSame(duration1, duration0);
  }

  @Test
  public void test23()  throws Throwable  {
      long long0 = (-6L);
      TimeOfDay timeOfDay0 = new TimeOfDay(long0);
      assertNotNull(timeOfDay0);
      assertEquals(4, timeOfDay0.size());
      
      Months months0 = Months.monthsBetween((ReadablePartial) timeOfDay0, (ReadablePartial) timeOfDay0);
      assertNotNull(months0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(1, months0.size());
      
      MutablePeriod mutablePeriod0 = months0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(1, months0.size());
      assertEquals(8, mutablePeriod0.size());
      
      int int0 = 0;
      mutablePeriod0.setPeriod(int0, int0, int0, int0, int0, int0, int0, int0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(1, months0.size());
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = 3814;
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0);
      assertNotNull(mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
      
      // Undeclared exception!
      try {
        mutablePeriod0.setValue(int0, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3814
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      int int0 = 719536;
      PeriodType periodType0 = PeriodType.weeks();
      assertNotNull(periodType0);
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0, int0, int0, int0, int0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
      }
  }

  @Test
  public void test26()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) buddhistChronology0);
      assertNotNull(mutableDateTime0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
      
      Duration duration0 = weeks0.toStandardDuration();
      assertNotNull(duration0);
      assertEquals(1, weeks0.size());
      assertEquals(1298798109705600000L, duration0.getMillis());
      
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod((ReadableDuration) duration0, (ReadableInstant) mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The subtrahend instant is below the supported minimum of 0001-01-01T00:00:00.000-00:01:15 (BuddhistChronology[Europe/London])
         //
      }
  }
}
