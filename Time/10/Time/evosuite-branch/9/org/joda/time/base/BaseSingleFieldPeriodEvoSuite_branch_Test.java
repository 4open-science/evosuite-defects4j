/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:11:04 GMT 2014
 */

package org.joda.time.base;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BaseSingleFieldPeriodEvoSuite_branch_Test extends BaseSingleFieldPeriodEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = (-30);
      Minutes minutes0 = Minutes.minutes(int0);
      assertNotNull(minutes0);
      assertEquals(1, minutes0.size());
      
      Minutes minutes1 = minutes0.multipliedBy(int0);
      assertNotNull(minutes1);
      assertEquals(1, minutes0.size());
      assertEquals(1, minutes1.size());
      assertNotSame(minutes0, minutes1);
      assertNotSame(minutes1, minutes0);
      assertFalse(minutes0.equals((Object)minutes1));
      assertFalse(minutes1.equals((Object)minutes0));
      
      int int1 = minutes0.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(1, minutes0.size());
      assertEquals(1, minutes1.size());
      assertNotSame(minutes0, minutes1);
      assertNotSame(minutes1, minutes0);
      assertEquals((-1), int1);
      assertFalse(minutes0.equals((Object)minutes1));
      assertFalse(minutes1.equals((Object)minutes0));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      int int0 = 1083;
      Hours hours1 = hours0.minus(int0);
      assertNotNull(hours1);
      assertEquals(1, hours1.size());
      assertEquals(1, hours0.size());
      assertNotSame(hours1, hours0);
      assertNotSame(hours0, hours1);
      assertFalse(hours1.equals((Object)hours0));
      assertFalse(hours0.equals((Object)hours1));
      
      int int1 = hours0.compareTo((BaseSingleFieldPeriod) hours1);
      assertEquals(1, hours1.size());
      assertEquals(1, hours0.size());
      assertNotSame(hours1, hours0);
      assertNotSame(hours0, hours1);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(hours1.equals((Object)hours0));
      assertFalse(int0 == int1);
      assertFalse(hours0.equals((Object)hours1));
  }

  @Test
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) hours0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, hours0.size());
      
      Minutes minutes0 = Minutes.MAX_VALUE;
      assertNotNull(minutes0);
      assertEquals(1, minutes0.size());
      
      Days days0 = Days.standardDaysIn((ReadablePeriod) mutablePeriod0);
      assertNotNull(days0);
      assertEquals(1, hours0.size());
      assertEquals(1, days0.size());
      
      // Undeclared exception!
      try {
        int int0 = days0.compareTo((BaseSingleFieldPeriod) minutes0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Days cannot be compared to class org.joda.time.Minutes
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      int int0 = hours0.compareTo((BaseSingleFieldPeriod) hours0);
      assertEquals(1, hours0.size());
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      Months months0 = Months.FOUR;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      Days days0 = Days.MIN_VALUE;
      assertNotNull(days0);
      assertEquals(1, days0.size());
      
      boolean boolean0 = days0.equals((Object) months0);
      assertEquals(1, months0.size());
      assertEquals(1, days0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = 838;
      Months months0 = Months.months(int0);
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      ReadableInterval readableInterval0 = null;
      Minutes minutes0 = Minutes.minutesIn(readableInterval0);
      assertNotNull(minutes0);
      assertEquals(1, minutes0.size());
      
      Duration duration0 = minutes0.toStandardDuration();
      assertNotNull(duration0);
      assertEquals(0L, duration0.getMillis());
      assertEquals(1, minutes0.size());
      
      boolean boolean0 = months0.equals((Object) duration0);
      assertEquals(0L, duration0.getMillis());
      assertEquals(1, minutes0.size());
      assertEquals(1, months0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) hours0);
      assertNotNull(mutablePeriod0);
      assertEquals(1, hours0.size());
      
      boolean boolean0 = hours0.equals((Object) mutablePeriod0);
      assertEquals(1, hours0.size());
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      assertNotNull(minutes0);
      assertEquals(1, minutes0.size());
      
      Minutes minutes1 = Minutes.THREE;
      assertNotNull(minutes1);
      assertEquals(1, minutes1.size());
      assertNotSame(minutes1, minutes0);
      assertFalse(minutes1.equals((Object)minutes0));
      
      boolean boolean0 = minutes0.equals((Object) minutes1);
      assertEquals(1, minutes1.size());
      assertEquals(1, minutes0.size());
      assertNotSame(minutes1, minutes0);
      assertNotSame(minutes0, minutes1);
      assertFalse(boolean0);
      assertFalse(minutes1.equals((Object)minutes0));
      assertFalse(minutes0.equals((Object)minutes1));
  }

  @Test
  public void test08()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      assertNotNull(dateTimeFieldType0);
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      
      Years years0 = Years.yearsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertNotNull(years0);
      assertEquals(3, localDate0.size());
      assertEquals(1, years0.size());
      
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertNotNull(durationFieldType0);
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      
      boolean boolean0 = years0.isSupported(durationFieldType0);
      assertEquals(3, localDate0.size());
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(1, years0.size());
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      
      Years years0 = Years.yearsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertNotNull(years0);
      assertEquals(3, localDate0.size());
      assertEquals(1, years0.size());
      
      DurationFieldType durationFieldType0 = null;
      boolean boolean0 = years0.isSupported(durationFieldType0);
      assertEquals(3, localDate0.size());
      assertEquals(1, years0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      assertNotNull(dateTimeFieldType0);
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      
      Years years0 = Years.yearsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertNotNull(years0);
      assertEquals(1, years0.size());
      assertEquals(3, localDate0.size());
      
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      
      int int0 = years0.get(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals(1, years0.size());
      assertEquals("yearOfEra", dateTimeFieldType0.getName());
      assertEquals("yearOfEra", dateTimeFieldType0.toString());
      assertEquals(3, localDate0.size());
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      assertNotNull(weeks0);
      assertEquals(1, weeks0.size());
      
      Hours hours0 = Hours.SIX;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = hours0.getFieldType(int0);
      assertNotNull(durationFieldType0);
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(1, hours0.size());
      
      int int1 = weeks0.get(durationFieldType0);
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(1, hours0.size());
      assertEquals(1, weeks0.size());
      assertEquals(0, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      int int0 = 1083;
      // Undeclared exception!
      try {
        int int1 = hours0.getValue(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1083
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      int int0 = 440;
      // Undeclared exception!
      try {
        DurationFieldType durationFieldType0 = years0.getFieldType(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 440
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 838;
      Period period0 = Period.minutes(int0);
      assertNotNull(period0);
      
      Hours hours0 = Hours.standardHoursIn((ReadablePeriod) period0);
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
  }

  @Test
  public void test15()  throws Throwable  {
      ReadablePeriod readablePeriod0 = null;
      Days days0 = Days.standardDaysIn(readablePeriod0);
      assertNotNull(days0);
      assertEquals(1, days0.size());
  }

  @Test
  public void test16()  throws Throwable  {
      Years years0 = Years.ONE;
      assertNotNull(years0);
      assertEquals(1, years0.size());
      
      // Undeclared exception!
      try {
        Hours hours0 = Hours.standardHoursIn((ReadablePeriod) years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as years is not precise in the period P1Y
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = (-23);
      YearMonth yearMonth0 = YearMonth.now();
      assertNotNull(yearMonth0);
      assertEquals(2, yearMonth0.size());
      
      ISOChronology iSOChronology0 = (ISOChronology)yearMonth0.getChronology();
      assertNotNull(iSOChronology0);
      assertEquals(2, yearMonth0.size());
      
      MonthDay monthDay0 = new MonthDay((long) int0, (Chronology) iSOChronology0);
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      assertEquals(2, yearMonth0.size());
      
      // Undeclared exception!
      try {
        Months months0 = Months.monthsBetween((ReadablePartial) yearMonth0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 3575;
      MockDate mockDate0 = new MockDate(int0, int0, int0);
      assertNotNull(mockDate0);
      assertEquals("Sat Sep 14 00:00:00 GMT 5782", mockDate0.toString());
      
      MonthDay monthDay0 = MonthDay.fromDateFields((Date) mockDate0);
      assertNotNull(monthDay0);
      assertEquals("Sat Sep 14 00:00:00 GMT 5782", mockDate0.toString());
      assertEquals(2, monthDay0.size());
      
      LocalDate localDate0 = monthDay0.toLocalDate(int0);
      assertNotNull(localDate0);
      assertEquals("Sat Sep 14 00:00:00 GMT 5782", mockDate0.toString());
      assertEquals(3, localDate0.size());
      assertEquals(2, monthDay0.size());
      
      // Undeclared exception!
      try {
        Months months0 = Months.monthsBetween((ReadablePartial) localDate0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "";
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertNotNull(zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0);
      assertNotNull(mockGregorianCalendar0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      
      LocalDate localDate0 = LocalDate.fromCalendarFields((Calendar) mockGregorianCalendar0);
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      
      ReadablePartial readablePartial0 = null;
      // Undeclared exception!
      try {
        Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)instant0.getZone();
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(1392409281320L, instant0.getMillis());
      
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) fixedDateTimeZone0);
      assertNotNull(timeOfDay0);
      assertEquals(4, timeOfDay0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(1392409281320L, instant0.getMillis());
      
      Years years0 = Years.yearsBetween((ReadablePartial) timeOfDay0, (ReadablePartial) timeOfDay0);
      assertNotNull(years0);
      assertEquals(4, timeOfDay0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(1, years0.size());
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test
  public void test21()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      // Undeclared exception!
      try {
        Weeks weeks0 = Weeks.weeksBetween(readablePartial0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      ReadableInstant readableInstant0 = null;
      // Undeclared exception!
      try {
        Years years0 = Years.yearsBetween((ReadableInstant) instant0, readableInstant0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Instant instant0 = new Instant();
      assertNotNull(instant0);
      assertEquals(1392409281320L, instant0.getMillis());
      
      Years years0 = Years.yearsBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertNotNull(years0);
      assertEquals(1392409281320L, instant0.getMillis());
      assertEquals(1, years0.size());
  }

  @Test
  public void test24()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      // Undeclared exception!
      try {
        Years years0 = Years.yearsBetween(readableInstant0, readableInstant0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      assertEquals(1, hours0.size());
  }

  @Test
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      assertNotNull(hours0);
      assertEquals(1, hours0.size());
      
      Period period0 = hours0.toPeriod();
      assertNotNull(period0);
      assertEquals(1, hours0.size());
  }

  @Test
  public void test27() {}
//   @Test
//   public void test27()  throws Throwable  {
//       Minutes minutes0 = Minutes.MAX_VALUE;
//       assertNotNull(minutes0);
//       assertEquals(1, minutes0.size());
//       
//       int int0 = minutes0.hashCode();
//       assertEquals(1, minutes0.size());
//       assertEquals((-2147471281), int0);
//   }
}
