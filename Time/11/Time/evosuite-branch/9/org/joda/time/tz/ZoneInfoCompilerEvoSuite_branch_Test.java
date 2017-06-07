/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:11:45 GMT 2014
 */

package org.joda.time.tz;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ZoneInfoCompilerEvoSuite_branch_Test extends ZoneInfoCompilerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "1dw";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      assertEquals(3, stringTokenizer0.countTokens());
      assertNotNull(stringTokenizer0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // d
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      assertEquals(0, stringTokenizer0.countTokens());
      assertNotNull(stringTokenizer0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      assertEquals(0, stringTokenizer0.countTokens());
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test
  public void test02()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "rule";
      StringReader stringReader0 = new StringReader(string0);
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertNotNull(stringReader0);
      
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0);
      assertEquals(0, lineNumberReader0.getLineNumber());
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertNotNull(lineNumberReader0);
      
      // Undeclared exception!
      try {
        zoneInfoCompiler0.parseDataFile((BufferedReader) lineNumberReader0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[2];
      char char0 = ' ';
      charArray0[0] = char0;
      char char1 = '[';
      charArray0[1] = char1;
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertArrayEquals(new char[] {' ', '['}, charArray0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertNotNull(charArrayReader0);
      
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0, (int) charArray0[1]);
      assertArrayEquals(new char[] {' ', '['}, charArray0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertNotNull(bufferedReader0);
      
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
      assertArrayEquals(new char[] {' ', '['}, charArray0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(false, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
  }

  @Test
  public void test04()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[8];
      char char0 = '$';
      charArray0[0] = char0;
      char char1 = '#';
      charArray0[5] = char1;
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertArrayEquals(new char[] {'$', '\u0000', '\u0000', '\u0000', '\u0000', '#', '\u0000', '\u0000'}, charArray0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertNotNull(charArrayReader0);
      
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      assertArrayEquals(new char[] {'$', '\u0000', '\u0000', '\u0000', '\u0000', '#', '\u0000', '\u0000'}, charArray0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(true, bufferedReader0.markSupported());
      assertNotNull(bufferedReader0);
      
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) bufferedReader0);
      assertArrayEquals(new char[] {'$', '\u0000', '\u0000', '\u0000', '\u0000', '#', '\u0000', '\u0000'}, charArray0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(0, lineNumberReader0.getLineNumber());
      assertEquals(true, lineNumberReader0.markSupported());
      assertNotNull(lineNumberReader0);
      
      zoneInfoCompiler0.parseDataFile((BufferedReader) lineNumberReader0);
      assertArrayEquals(new char[] {'$', '\u0000', '\u0000', '\u0000', '\u0000', '#', '\u0000', '\u0000'}, charArray0);
      assertEquals(false, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(true, lineNumberReader0.markSupported());
      assertEquals(1, lineNumberReader0.getLineNumber());
  }

  @Test
  public void test05()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      char[] charArray0 = new char[2];
      char char0 = ' ';
      charArray0[0] = char0;
      charArray0[1] = charArray0[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertArrayEquals(new char[] {' ', ' '}, charArray0);
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertNotNull(charArrayReader0);
      
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0, (int) charArray0[1]);
      assertArrayEquals(new char[] {' ', ' '}, charArray0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(true, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
      assertNotNull(bufferedReader0);
      
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
      assertArrayEquals(new char[] {' ', ' '}, charArray0);
      assertEquals(true, bufferedReader0.markSupported());
      assertEquals(false, charArrayReader0.ready());
      assertEquals(true, charArrayReader0.markSupported());
  }

  @Test
  public void test06()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "I)p?wt";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      File file0 = mockFile0.getParentFile();
      assertNull(file0);
      
      File[] fileArray0 = null;
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(file0, fileArray0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      assertNotNull(map0);
  }

  @Test
  public void test07()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
      
      String string0 = "I)p?wt";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      File[] fileArray0 = null;
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) mockFile0, fileArray0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
      assertNotNull(map0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "1dw";
      boolean boolean0 = true;
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone(string0, boolean0);
      assertEquals("1dw", fixedDateTimeZone0.getID());
      assertEquals("1dw", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      boolean boolean1 = ZoneInfoCompiler.test(string0, fixedDateTimeZone0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1);
      assertEquals("1dw", fixedDateTimeZone0.getID());
      assertEquals("1dw", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "";
      DateTimeZone dateTimeZone0 = null;
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      assertNotNull(iSOChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)iSOChronology0.getZone();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(cachedDateTimeZone0);
      
      boolean boolean0 = ZoneInfoCompiler.test(string0, cachedDateTimeZone0);
      assertTrue(boolean0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
  }

  @Test
  public void test10()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      String string0 = cachedDateTimeZone0.getID();
      assertEquals("Europe/London", string0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(string0);
      
      boolean boolean0 = ZoneInfoCompiler.test(string0, cachedDateTimeZone0);
      assertTrue(boolean0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      char char0 = 'z';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
      assertEquals('u', char1);
  }

  @Test
  public void test12()  throws Throwable  {
      char char0 = 'w';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertTrue(char1 == char0);
      assertTrue(char0 == char1);
      assertEquals('w', char1);
  }

  @Test
  public void test13()  throws Throwable  {
      char char0 = 'u';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertTrue(char0 == char1);
      assertTrue(char1 == char0);
      assertEquals('u', char1);
  }

  @Test
  public void test14()  throws Throwable  {
      char char0 = 's';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertTrue(char1 == char0);
      assertTrue(char0 == char1);
      assertEquals('s', char1);
  }

  @Test
  public void test15()  throws Throwable  {
      char char0 = 'g';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
      assertEquals('u', char1);
  }

  @Test
  public void test16()  throws Throwable  {
      char char0 = 'Z';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
      assertEquals('u', char1);
  }

  @Test
  public void test17()  throws Throwable  {
      char char0 = 'W';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
      assertEquals('w', char1);
  }

  @Test
  public void test18()  throws Throwable  {
      char char0 = 'U';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char0 == char1);
      assertFalse(char1 == char0);
      assertEquals('u', char1);
  }

  @Test
  public void test19()  throws Throwable  {
      char char0 = 'S';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
      assertEquals('s', char1);
  }

  @Test
  public void test20()  throws Throwable  {
      char char0 = 'G';
      char char1 = ZoneInfoCompiler.parseZoneChar(char0);
      assertFalse(char1 == char0);
      assertFalse(char0 == char1);
      assertEquals('u', char1);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "5rU<A`L";
      int int0 = ZoneInfoCompiler.parseTime(string0);
      assertEquals(18000000, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "15dw";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      assertEquals(4, stringTokenizer0.countTokens());
      assertNotNull(stringTokenizer0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // d
         //
      }
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "-";
      String string1 = ZoneInfoCompiler.parseOptional(string0);
      assertNull(string1);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = "minimum";
      String string1 = ZoneInfoCompiler.parseOptional(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("minimum", string1);
      assertNotNull(string1);
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = "only";
      int int0 = (-100);
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals((-100), int1);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = "max";
      int int0 = 1366;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(Integer.MAX_VALUE, int1);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = "maximum";
      int int0 = 118;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(Integer.MAX_VALUE, int1);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = "min";
      int int0 = (-29);
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(Integer.MIN_VALUE, int1);
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = "R3les: ";
      int int0 = (-100);
      // Undeclared exception!
      try {
        int int1 = ZoneInfoCompiler.parseYear(string0, int0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"r3les: \"
         //
      }
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = "minimum";
      int int0 = 2681;
      int int1 = ZoneInfoCompiler.parseYear(string0, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(Integer.MIN_VALUE, int1);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = "1=\"aut-6-";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(string0);
      assertNotNull(mockFileOutputStream0);
      
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      assertEquals(0, dataOutputStream0.size());
      assertNotNull(dataOutputStream0);
      
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(cachedDateTimeZone0);
      
      String string1 = "--5uU`(AV`L";
      assertNotSame(string1, string0);
      
      DateTimeZone dateTimeZone0 = hashMap0.put(string1, (DateTimeZone) cachedDateTimeZone0);
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string1, string0);
      assertEquals("{--5uU`(AV`L=Europe/London}", hashMap0.toString());
      assertEquals(1, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNull(dateTimeZone0);
      
      DateTimeZone dateTimeZone1 = hashMap0.put(string0, (DateTimeZone) cachedDateTimeZone0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      assertEquals(2, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      assertEquals("{--5uU`(AV`L=Europe/London, 1=\"aut-6-=Europe/London}", hashMap0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNull(dateTimeZone1);
      
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string0, string1);
      assertEquals(2, hashMap0.size());
      assertEquals(false, hashMap0.isEmpty());
      assertEquals("{--5uU`(AV`L=Europe/London, 1=\"aut-6-=Europe/London}", hashMap0.toString());
      assertEquals(52, dataOutputStream0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = "-6;`Y,N\\VKk>5+m!(";
      int int0 = ZoneInfoCompiler.parseTime(string0);
      assertEquals((-21600000), int0);
      
      int int1 = ZoneInfoCompiler.parseTime(string0);
      assertTrue(int1 == int0);
      assertEquals((-21600000), int1);
  }

  @Test
  public void test33()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
      assertNotNull(zoneInfoCompiler_DateTimeOfYear1);
  }

  @Test
  public void test34()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      
      ZoneInfoCompiler.cStartOfYear = zoneInfoCompiler_DateTimeOfYear0;
      assertNotNull(ZoneInfoCompiler.cStartOfYear);
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      int int0 = (-2960);
      ZoneInfoCompiler.cStartOfYear.addCutover(dateTimeZoneBuilder0, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
      
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
      assertNotNull(string0);
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      assertNotNull(dateTimeZoneBuilder0);
      
      int int0 = (-1631);
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, string0, int0, int0, int0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "qM]9Y";
      // Undeclared exception!
      try {
        int int0 = ZoneInfoCompiler.parseDayOfWeek(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"qM]9Y\" for dayOfWeek is not supported
         //
      }
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "3";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      assertEquals(1, stringTokenizer0.countTokens());
      assertNotNull(stringTokenizer0);
      
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      assertEquals(0, stringTokenizer0.countTokens());
      assertNotNull(zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "qM]9Y";
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
      
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      assertNotNull(zoneInfoCompiler0);
  }
}
