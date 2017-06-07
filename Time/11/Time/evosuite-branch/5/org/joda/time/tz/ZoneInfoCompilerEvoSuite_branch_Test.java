/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:29:34 GMT 2014
 */

package org.joda.time.tz;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ZoneInfoCompilerEvoSuite_branch_Test extends ZoneInfoCompilerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "  -dst <directory>    specify here to write geneated files";
      StringReader stringReader0 = new StringReader(string0);
      assertNotNull(stringReader0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0);
      assertNotNull(lineNumberReader0);
      assertEquals(0, lineNumberReader0.getLineNumber());
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      
      zoneInfoCompiler0.parseDataFile((BufferedReader) lineNumberReader0);
      assertEquals(1, lineNumberReader0.getLineNumber());
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
  }

  @Test
  public void test01()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "jZX5GWoinC#*\\";
      StringReader stringReader0 = new StringReader(string0);
      assertNotNull(stringReader0);
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0);
      assertNotNull(lineNumberReader0);
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(0, lineNumberReader0.getLineNumber());
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      
      zoneInfoCompiler0.parseDataFile((BufferedReader) lineNumberReader0);
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(1, lineNumberReader0.getLineNumber());
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, stringReader0.ready());
  }

  @Test
  public void test02()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[2];
      char char0 = '#';
      charArray0[0] = char0;
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertNotNull(charArrayReader0);
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(true, charArrayReader0.ready());
      assertArrayEquals(new char[] {'#', '\u0000'}, charArray0);
      
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      assertNotNull(bufferedReader0);
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, bufferedReader0.markSupported());
      assertArrayEquals(new char[] {'#', '\u0000'}, charArray0);
      
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(false, charArrayReader0.ready());
      assertEquals(true, bufferedReader0.markSupported());
      assertArrayEquals(new char[] {'#', '\u0000'}, charArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertNotNull(charArrayReader0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      assertNotNull(bufferedReader0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(false, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "Zone must not be null";
      StringReader stringReader0 = new StringReader(string0);
      assertNotNull(stringReader0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0);
      assertNotNull(lineNumberReader0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(0, lineNumberReader0.getLineNumber());
      
      // Undeclared exception!
      try {
        zoneInfoCompiler0.parseDataFile((BufferedReader) lineNumberReader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "max";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      File[] fileArray0 = new File[1];
      MockFile mockFile1 = null;
      MockFile mockFile2 = (MockFile)MockFile.createTempFile(string0, string0, (File) mockFile1);
      assertFalse(mockFile2.equals((Object)mockFile0));
      assertNotSame(mockFile2, mockFile0);
      assertNotNull(mockFile2);
      
      fileArray0[0] = (File) mockFile2;
      assertNotNull(fileArray0[0]);
      assertEquals("max0max", fileArray0[0].getName());
      assertEquals(true, fileArray0[0].createNewFile());
      assertEquals(true, fileArray0[0].isAbsolute());
      assertEquals(0L, fileArray0[0].length());
      assertEquals("/tmp", fileArray0[0].getParent());
      assertEquals(1392409281320L, fileArray0[0].lastModified());
      assertEquals(true, fileArray0[0].isFile());
      assertEquals(0L, fileArray0[0].getFreeSpace());
      assertEquals(true, fileArray0[0].canRead());
      assertEquals(true, fileArray0[0].setReadOnly());
      assertEquals(false, fileArray0[0].isHidden());
      assertEquals(0L, fileArray0[0].getTotalSpace());
      assertEquals(false, fileArray0[0].canExecute());
      assertEquals("/tmp/max0max", fileArray0[0].toString());
      assertEquals(0L, fileArray0[0].getUsableSpace());
      assertEquals(false, fileArray0[0].isDirectory());
      assertEquals(true, fileArray0[0].exists());
      assertEquals(false, fileArray0[0].mkdir());
      assertEquals(false, fileArray0[0].canWrite());
      
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) mockFile0, fileArray0);
      assertFalse(mockFile0.equals((Object)mockFile2));
      assertNotSame(mockFile0, mockFile2);
      assertNotNull(map0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
  }

  @Test
  public void test06()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      String string0 = cachedDateTimeZone0.toString();
      assertEquals("Europe/London", string0);
      assertNotNull(string0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      boolean boolean0 = ZoneInfoCompiler.test(string0, cachedDateTimeZone0);
      assertTrue(boolean0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "Partial cannot be null";
      LocalDate localDate0 = LocalDate.now();
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      
      DateTime dateTime0 = localDate0.toDateTimeAtMidnight();
      assertNotNull(dateTime0);
      assertEquals(3, localDate0.size());
      assertEquals(1392336000000L, dateTime0.getMillis());
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)dateTime0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(3, localDate0.size());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(1392336000000L, dateTime0.getMillis());
      
      boolean boolean0 = ZoneInfoCompiler.test(string0, cachedDateTimeZone0);
      assertTrue(boolean0);
      assertEquals(3, localDate0.size());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(1392336000000L, dateTime0.getMillis());
  }

  @Test
  public void test08()  throws Throwable  {
      ThreadLocal<Boolean> threadLocal0 = ZoneInfoCompiler.cVerbose;
      assertNotNull(threadLocal0);
      
      Boolean boolean0 = threadLocal0.get();
      assertFalse(boolean0);
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      String string0 = "y";
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone(string0, (boolean) boolean0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("y", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("y", fixedDateTimeZone0.toString());
      
      boolean boolean1 = ZoneInfoCompiler.test(string0, fixedDateTimeZone0);
      assertTrue(boolean1);
      assertFalse(boolean0.equals((Object)boolean1));
      assertEquals("y", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("y", fixedDateTimeZone0.toString());
  }

  @Test
  public void test09()  throws Throwable  {
      char char0 = 'z';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
  }

  @Test
  public void test10()  throws Throwable  {
      char char0 = 'W';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('w', char1);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
      
      char char2 = ZoneInfoCompiler.parseZoneChar(char1);
      assertEquals('w', char2);
      assertFalse(char2 == char0);
      assertTrue(char2 == char1);
      assertFalse(char1 == char0);
      assertTrue(char1 == char2);
      assertFalse(char0 == char2);
      assertFalse(char0 == char1);
  }

  @Test
  public void test11()  throws Throwable  {
      char char0 = 'u';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertTrue(char1 == char0);
      assertTrue(char0 == char1);
  }

  @Test
  public void test12()  throws Throwable  {
      char char0 = 's';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('s', char1);
      assertTrue(char1 == char0);
      assertTrue(char0 == char1);
  }

  @Test
  public void test13()  throws Throwable  {
      char char0 = 'g';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
  }

  @Test
  public void test14()  throws Throwable  {
      char char0 = 'Z';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
  }

  @Test
  public void test15()  throws Throwable  {
      char char0 = 'U';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
  }

  @Test
  public void test16()  throws Throwable  {
      char char0 = 'S';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('s', char1);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
  }

  @Test
  public void test17()  throws Throwable  {
      char char0 = 'G';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('u', char1);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "4fCq%UZz";
      int int0 = ZoneInfoCompiler.parseTime(string0);
      assertEquals(14400000, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "-4fCq%UZz";
      int int0 = ZoneInfoCompiler.parseTime(string0);
      assertEquals((-14400000), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "-";
      String string1 = ZoneInfoCompiler.parseOptional(string0);
      assertNull(string1);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "t'Jp7ZB g\\||[I}";
      String string1 = ZoneInfoCompiler.parseOptional(string0);
      assertEquals("t'Jp7ZB g\\||[I}", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
  }

  @Test
  public void test22()  throws Throwable  {
      char char0 = 'W';
      String string0 = "Partial cannot be null";
      // Undeclared exception!
      try {
        int int0 = ZoneInfoCompiler.parseYear(string0, char0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"partial cannot be null\"
         //
      }
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "only";
      int int0 = 1;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertEquals(1, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = "maximum";
      int int0 = 5062513;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertEquals(Integer.MAX_VALUE, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = "max";
      int int0 = 0;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertEquals(Integer.MAX_VALUE, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = "minimum";
      int int0 = 0;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertEquals(Integer.MIN_VALUE, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = "  -src <directory>    Specify where to read source files";
      LenientChronology lenientChronology0 = (LenientChronology)ZoneInfoCompiler.getLenientISOChronology();
      assertNotNull(lenientChronology0);
      
      // Undeclared exception!
      try {
        int int0 = ZoneInfoCompiler.parseTime(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //   -src <directory>    Specify where to read source files
         //
      }
  }

  @Test
  public void test28()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
      assertNotNull(zoneInfoCompiler_DateTimeOfYear1);
  }

  @Test
  public void test29()  throws Throwable  {
      char char0 = '&';
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertEquals('w', char1);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
      
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, (int) char1);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = "  -src <directory>    Specify where to read source files";
      boolean boolean0 = false;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      assertNotNull(stringTokenizer0);
      assertEquals(0, stringTokenizer0.countTokens());
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      assertEquals(0, stringTokenizer0.countTokens());
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      int int0 = 103;
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, string0, int0, int0, int0);
      assertEquals(0, stringTokenizer0.countTokens());
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = " 2";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0);
      assertNotNull(stringTokenizer0);
      assertEquals(1, stringTokenizer0.countTokens());
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      assertEquals(0, stringTokenizer0.countTokens());
      
      String string1 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 2\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals(0, stringTokenizer0.countTokens());
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = "4fCq%UZz";
      // Undeclared exception!
      try {
        int int0 = ZoneInfoCompiler.parseDayOfWeek(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"4fCq%UZz\" for dayOfWeek is not supported
         //
      }
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = "4 2";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0);
      assertNotNull(stringTokenizer0);
      assertEquals(2, stringTokenizer0.countTokens());
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      assertEquals(0, stringTokenizer0.countTokens());
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = "t'Jp7ZB g\\||[I}";
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[2];
      char char0 = '&';
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
  }
}
