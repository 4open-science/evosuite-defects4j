/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 16:40:14 GMT 2014
 */

package org.joda.time;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class DateTimeZoneEvoSuite_branch_Test_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(6000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 5000);
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.7"); 
            java.lang.System.setProperty("java.home", "/usr/local/packages6/java/jdk1.7.0_55/jre"); 
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Time/9/6/run_evosuite.pl_23956_1418315383"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
                        java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Time/9/6/run_evosuite.pl_23956_1418315383/target/classes:/data/ac1gf/defects4j/framework/projects/Time/lib/org/joda/joda-convert/1.2/joda-convert-1.2.jar"); 
    java.lang.System.setProperty("java.class.version", "51.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.7.0_55-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.7.0_55"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.7"); 
    java.lang.System.setProperty("java.vm.version", "24.55-b03"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "2.6.32-431.23.3.el6.x86_64"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.home", "/home/ac1gf"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ac1gf"); 
    java.lang.System.setProperty("user.timezone", "Europe/Isle_of_Man"); 
                                      }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(DateTimeZoneEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTime",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.ReadableInterval",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.convert.ToString",
      "org.joda.time.Partial$Property",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.DurationField",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName",
      "org.joda.time.convert.AbstractConverter",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.Chronology",
      "org.joda.time.MonthDay",
      "org.joda.time.DateMidnight$Property",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.MutableDateTime",
      "org.joda.time.LocalDate",
      "org.joda.time.Instant",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.MonthDay$Property",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.Period",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.DateMidnight",
      "org.joda.time.base.BasePartial",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeParserBucket$SavedField",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.DateTimeZone$Stub",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.Partial",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.convert.IntervalConverter",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.ReadableInstant",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.DateTimeZone",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.TimeOfDay$Property",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.Weeks",
      "org.joda.time.DurationFieldType",
      "org.joda.time.convert.Converter",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.YearMonthDay$Property",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "org.joda.time.DateTime$Property",
      "org.joda.convert.FromString",
      "org.joda.time.MutableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.DateTimeUtils$FixedMillisProvider",
      "org.joda.time.ReadWritableInterval",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.convert.ConverterSet$Entry",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatterBuilder$TextField",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.Minutes",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.YearMonthDay",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.Years",
      "org.joda.time.LocalTime",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.Months",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.format.DateTimeParserBucket$SavedState",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.convert.PartialConverter",
      "org.joda.time.YearMonth$Property",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.MutablePeriod",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.DateTimeField",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.format.DateTimeFormat$StyleFormatter",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.convert.DurationConverter",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.convert.PeriodConverter",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.Duration",
      "org.joda.time.Hours",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.Days",
      "org.joda.time.TimeOfDay",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.tz.Provider",
      "org.joda.time.Seconds",
      "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.DateTimeUtils$OffsetMillisProvider",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.ReadableDuration",
      "org.joda.time.convert.ConverterSet",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.field.DelegatedDurationField",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.LocalDateTime",
      "org.joda.time.YearMonth",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.convert.InstantConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.PeriodType",
      "org.joda.time.Interval"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(DateTimeZoneEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.DateTimeZone$Stub",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.Instant",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.DateMidnight",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDateTime",
      "org.joda.time.base.BasePartial",
      "org.joda.time.YearMonth",
      "org.joda.time.YearMonthDay",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.MutableInterval",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.LocalTime",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.MutableDateTime",
      "org.joda.time.Partial",
      "org.joda.time.LocalDate",
      "org.joda.time.Interval",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.MonthDay",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.PeriodType",
      "org.joda.time.Period",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.DateMidnight$Property",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.Seconds",
      "org.joda.time.Months",
      "org.joda.time.Days",
      "org.joda.time.MutablePeriod",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.Weeks",
      "org.joda.time.DateTime$Property",
      "org.joda.time.TimeOfDay",
      "org.joda.time.Hours",
      "org.joda.time.Minutes",
      "org.joda.time.Years",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.TimeOfDay$Property",
      "org.joda.time.format.DateTimeFormatterBuilder$TextField"
    );
  }
}
