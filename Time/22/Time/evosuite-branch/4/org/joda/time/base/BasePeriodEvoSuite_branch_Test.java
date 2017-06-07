/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:07:46 GMT 2014
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.Weeks;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasePeriodEvoSuite_branch_Test extends BasePeriodEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = 0;
      int int1 = 4;
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0, int1, int1, int0, int0);
      assertEquals(8, mutablePeriod0.size());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.add((long) int1);
      assertEquals(8, mutablePeriod0.size());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test01()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertNotNull(dateTime0);
      
      long long0 = (-1481L);
      Duration duration0 = Duration.millis(long0);
      assertEquals((-1481L), duration0.getMillis());
      assertNotNull(duration0);
      
      PeriodType periodType0 = PeriodType.hours();
      assertEquals("Hours", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) dateTime0, (ReadableDuration) duration0, periodType0);
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals("Hours", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals((-1481L), duration0.getMillis());
      assertEquals(1, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      Years years0 = Years.ONE;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      // Undeclared exception!
      try {
        mutablePeriod0.add((ReadablePeriod) years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      ReadablePeriod readablePeriod0 = null;
      mutablePeriod0.add(readablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test03()  throws Throwable  {
      long long0 = 7L;
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      assertNotNull(iSOChronology0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, (Chronology) iSOChronology0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      MutablePeriod mutablePeriod1 = null;
      mutablePeriod0.mergePeriod((ReadablePeriod) mutablePeriod1);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNull(durationFieldType1);
      
      // Undeclared exception!
      try {
        mutablePeriod0.add(durationFieldType1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals(1, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = (-157);
      // Undeclared exception!
      try {
        mutablePeriod0.addMonths(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 0;
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.addMonths(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test07()  throws Throwable  {
      int int0 = 431;
      Period period0 = Period.months(int0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      // Undeclared exception!
      try {
        Period period1 = period0.withField(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = 0;
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0, int0, int0, int0, int0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.setMinutes(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.setPeriod((ReadablePeriod) mutablePeriod0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 1030;
      Period period0 = new Period(int0, int0, int0, int0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      PeriodType periodType0 = PeriodType.yearDay();
      assertEquals("YearDay", periodType0.getName());
      assertEquals(2, periodType0.size());
      assertNotNull(periodType0);
      
      // Undeclared exception!
      try {
        Period period1 = period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
      }
  }

  @Test
  public void test11() {}
//   @Test
//   public void test11()  throws Throwable  {
//       long long0 = 3535L;
//       int int0 = (-1967);
//       ISOChronology iSOChronology0 = ISOChronology.getInstance();
//       assertNotNull(iSOChronology0);
//       
//       LocalTime localTime0 = new LocalTime(long0, (Chronology) iSOChronology0);
//       assertEquals(4, localTime0.size());
//       assertNotNull(localTime0);
//       
//       MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(int0, int0, int0);
//       assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=-1967,MONTH=-1967,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1967,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
//       assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertNotNull(mockGregorianCalendar0);
//       
//       TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields((Calendar) mockGregorianCalendar0);
//       assertEquals(4, timeOfDay0.size());
//       assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-129583929600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2138,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=256,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
//       assertNotNull(timeOfDay0);
//       
//       PeriodType periodType0 = PeriodType.months();
//       assertEquals("Months", periodType0.getName());
//       assertEquals(1, periodType0.size());
//       assertNotNull(periodType0);
//       
//       Period period0 = new Period((ReadablePartial) localTime0, (ReadablePartial) timeOfDay0, periodType0);
//       assertEquals("Months", periodType0.getName());
//       assertEquals(1, periodType0.size());
//       assertEquals(4, localTime0.size());
//       assertEquals(4, timeOfDay0.size());
//       assertEquals(1, period0.size());
//       assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
//       assertEquals(true, mockGregorianCalendar0.isLenient());
//       assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
//       assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-129583929600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2138,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=256,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
//       assertNotNull(period0);
//   }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 1666;
      MockDate mockDate0 = new MockDate(int0, int0, int0, int0, int0, int0);
      assertEquals("Fri Aug 02 14:13:46 GMT 3709", mockDate0.toString());
      assertNotNull(mockDate0);
      
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields((Date) mockDate0);
      assertEquals("Fri Aug 02 14:13:46 GMT 3709", mockDate0.toString());
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDateTime0);
      
      LocalTime localTime0 = localDateTime0.toLocalTime();
      assertEquals("Fri Aug 02 14:13:46 GMT 3709", mockDate0.toString());
      assertEquals(4, localDateTime0.size());
      assertEquals(4, localTime0.size());
      assertNotNull(localTime0);
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) localTime0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      long long0 = 0L;
      Period period0 = new Period(long0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      String string0 = period0.toString();
      assertEquals(8, period0.size());
      assertNotNull(string0);
      assertEquals("PT0S", string0);
      
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertEquals(8, period0.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(8, period0.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      LocalTime localTime0 = new LocalTime(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(8, period0.size());
      assertEquals(4, localTime0.size());
      assertEquals("GMT", zoneInfo0.getID());
      assertNotNull(localTime0);
      
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      YearMonthDay yearMonthDay0 = new YearMonthDay(long0, (Chronology) buddhistChronology0);
      assertEquals(3, yearMonthDay0.size());
      assertNotNull(yearMonthDay0);
      
      Period period1 = null;
      try {
        period1 = new Period((ReadablePartial) localTime0, (ReadablePartial) yearMonthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      assertNotNull(partial0);
      
      PeriodType periodType0 = PeriodType.standard();
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertNotNull(periodType0);
      
      Period period0 = new Period((ReadablePartial) partial0, (ReadablePartial) partial0, periodType0);
      assertEquals(8, period0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertEquals(0, partial0.size());
      assertNotNull(period0);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-1594);
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) int0);
      assertEquals(4, localTime0.size());
      assertNotNull(localTime0);
      
      ReadablePartial readablePartial0 = null;
      Weeks weeks0 = Weeks.ZERO;
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      PeriodType periodType0 = weeks0.getPeriodType();
      assertEquals(1, weeks0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) localTime0, readablePartial0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      Period period0 = null;
      try {
        period0 = new Period(readablePartial0, readablePartial0);
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
      int int0 = 0;
      LocalTime localTime0 = new LocalTime(int0, int0, int0);
      assertEquals(4, localTime0.size());
      assertNotNull(localTime0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      assertNotNull(iSOChronology0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)iSOChronology0.getZone();
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      DateTime dateTime0 = localTime0.toDateTimeToday((DateTimeZone) fixedDateTimeZone0);
      assertEquals(1392336000000L, dateTime0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(4, localTime0.size());
      assertNotNull(dateTime0);
      
      PeriodType periodType0 = PeriodType.time();
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType0.getName());
      assertNotNull(periodType0);
      
      Period period0 = new Period(readableInstant0, (ReadableInstant) dateTime0, periodType0);
      assertEquals(1392336000000L, dateTime0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(4, localTime0.size());
      assertEquals(4, period0.size());
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType0.getName());
      assertNotNull(period0);
  }

  @Test
  public void test18()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      Period period0 = new Period(readableInstant0, readableInstant0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = 0;
      String string0 = "4";
      Instant instant0 = Instant.parse(string0);
      assertEquals((-62040988725000L), instant0.getMillis());
      assertNotNull(instant0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)instant0.getZone();
      assertEquals((-62040988725000L), instant0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) int0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals((-62040988725000L), instant0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(dateMidnight0);
      
      Period period0 = new Period((ReadableInstant) dateMidnight0, (ReadableInstant) instant0);
      assertEquals(8, period0.size());
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals((-62040988725000L), instant0.getMillis());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(period0);
  }

  @Test
  public void test20()  throws Throwable  {
      long long0 = 858L;
      int int0 = 746;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals("+00:00:00.746", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      LocalDate localDate0 = new LocalDate(long0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(3, localDate0.size());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.getID());
      assertNotNull(localDate0);
      
      Weeks weeks0 = Weeks.ONE;
      assertEquals(1, weeks0.size());
      assertNotNull(weeks0);
      
      PeriodType periodType0 = weeks0.getPeriodType();
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, weeks0.size());
      assertNotNull(periodType0);
      
      Period period0 = new Period((ReadablePartial) localDate0, (ReadablePartial) localDate0, periodType0);
      assertEquals(3, localDate0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, period0.size());
      assertEquals(1, weeks0.size());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.getID());
      assertNotNull(period0);
      
      DateMidnight dateMidnight0 = new DateMidnight((long) int0);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      Duration duration0 = period0.toDurationFrom((ReadableInstant) dateMidnight0);
      assertEquals(3, localDate0.size());
      assertEquals(0L, duration0.getMillis());
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      assertEquals(1, period0.size());
      assertEquals(1, weeks0.size());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.746", fixedDateTimeZone0.getID());
      assertNotNull(duration0);
  }

  @Test
  public void test21()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      int int0 = 0;
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      assertNotNull(iSOChronology0);
      
      PeriodType periodType0 = PeriodType.time();
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) readableInstant0, periodType0, (Chronology) iSOChronology0);
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType0.getName());
      assertEquals(4, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.setMonths(int0);
      assertEquals(4, periodType0.size());
      assertEquals("Time", periodType0.getName());
      assertEquals(4, mutablePeriod0.size());
  }

  @Test
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
      assertNotNull(mutablePeriod0);
      
      int int0 = 0;
      mutablePeriod0.addMonths(int0);
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1, periodType0.size());
      assertEquals("Weeks", periodType0.getName());
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = 431;
      Period period0 = Period.months(int0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      ReadableInstant readableInstant0 = null;
      Duration duration0 = period0.toDurationTo(readableInstant0);
      assertEquals(8, period0.size());
      assertEquals(1133654400000L, duration0.getMillis());
      assertNotNull(duration0);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = 746;
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.add(int0, int0, int0, int0, int0, int0, int0, int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test25()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) readableInstant0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.mergePeriod((ReadablePeriod) mutablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = 431;
      Period period0 = new Period((long) int0, (long) int0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = 0;
      MutablePeriod mutablePeriod0 = new MutablePeriod(int0, int0, int0, int0, int0, int0, int0, int0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.setValue(int0, int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test28()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      ReadableDuration readableDuration0 = null;
      Period period0 = new Period(readableDuration0, readableInstant0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }
}
