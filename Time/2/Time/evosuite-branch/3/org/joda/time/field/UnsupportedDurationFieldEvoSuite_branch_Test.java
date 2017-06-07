/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:49:49 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Months;
import org.joda.time.Seconds;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnsupportedDurationFieldEvoSuite_branch_Test extends UnsupportedDurationFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(0, int0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) int0);
      assertFalse(boolean0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
  }

  @Test
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField0);
      assertTrue(boolean0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
  }

  @Test
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType1 = DurationFieldType.minutes();
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotNull(durationFieldType1);
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotNull(unsupportedDurationField0);
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals(1, seconds0.size());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotNull(unsupportedDurationField1);
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("minutes", unsupportedDurationField1.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField1);
      assertFalse(boolean0);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotSame(unsupportedDurationField0, unsupportedDurationField1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertFalse(unsupportedDurationField0.equals((Object)unsupportedDurationField1));
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals(1, seconds0.size());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", durationFieldType1.getName());
      assertEquals("minutes", durationFieldType1.toString());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("minutes", unsupportedDurationField1.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(true, unsupportedDurationField1.isPrecise());
  }

  @Test
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      DurationField durationField0 = copticChronology0.weekyears();
      assertNotNull(durationField0);
      assertEquals("weekyears", durationField0.getName());
      assertEquals(false, durationField0.isPrecise());
      assertEquals(true, durationField0.isSupported());
      
      int int0 = unsupportedDurationField0.compareTo(durationField0);
      assertEquals(1, int0);
      assertEquals("weekyears", durationField0.getName());
      assertEquals(false, durationField0.isPrecise());
      assertEquals(true, durationField0.isSupported());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
  }

  @Test
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertSame(unsupportedDurationField1, unsupportedDurationField0);
      assertNotNull(unsupportedDurationField1);
      assertEquals("seconds", unsupportedDurationField1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
  }

  @Test
  public void test05()  throws Throwable  {
      Months months0 = Months.TEN;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      DurationFieldType durationFieldType0 = months0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, months0.size());
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, months0.size());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("months", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      
      int int0 = 1058;
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertTrue(boolean0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
  }

  @Test
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = (-34L);
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getDifference(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(1, seconds0.size());
      
      DelegatedDurationField delegatedDurationField0 = new DelegatedDurationField(unsupportedDurationField0);
      assertNotNull(delegatedDurationField0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, delegatedDurationField0.isPrecise());
      assertEquals(false, delegatedDurationField0.isSupported());
      assertEquals("seconds", delegatedDurationField0.getName());
      assertEquals(1, seconds0.size());
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) delegatedDurationField0);
      assertEquals(0, int0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, delegatedDurationField0.isPrecise());
      assertEquals(false, delegatedDurationField0.isSupported());
      assertEquals("seconds", delegatedDurationField0.getName());
      assertEquals(1, seconds0.size());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      
      long long0 = 0L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      assertNotNull(dateTimeFieldType0);
      assertEquals("minuteOfDay", dateTimeFieldType0.getName());
      assertEquals("minuteOfDay", dateTimeFieldType0.toString());
      
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNotNull(durationFieldType0);
      assertEquals("minuteOfDay", dateTimeFieldType0.getName());
      assertEquals("minuteOfDay", dateTimeFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("minuteOfDay", dateTimeFieldType0.getName());
      assertEquals("minuteOfDay", dateTimeFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      
      long long0 = 6046L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertNotNull(durationFieldType0);
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      
      long long0 = 714L;
      int int0 = 1067;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.subtract(long0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals(0L, long0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
  }

  @Test
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      assertNotNull(durationFieldType0);
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("halfdays", durationFieldType0.getName());
      assertEquals("halfdays", durationFieldType0.toString());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("halfdays", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      
      long long0 = 697L;
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // halfdays field is unsupported
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      assertNotNull(durationFieldType0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("years", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      
      long long0 = (-668L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.add(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertNotNull(durationFieldType0);
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      
      int int0 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(0, int0);
      assertEquals("days", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("days", durationFieldType0.toString());
      assertEquals("days", durationFieldType0.getName());
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getValueAsLong((long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // days field is unsupported
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      
      int int0 = unsupportedDurationField0.hashCode();
      assertEquals(1970096767, int0);
      assertEquals(1, seconds0.size());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals("seconds", durationFieldType0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      assertNotNull(seconds0);
      assertEquals(1, seconds0.size());
      
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      assertNotNull(durationFieldType0);
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("seconds", unsupportedDurationField0.getName());
      assertEquals("seconds", durationFieldType0.toString());
      assertEquals("seconds", durationFieldType0.getName());
      assertEquals(1, seconds0.size());
      
      long long0 = 999999993L;
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // seconds field is unsupported
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertNotNull(durationFieldType0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      
      long long0 = (-1951L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      
      // Undeclared exception!
      try {
        String string0 = unsupportedDurationField0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertNotNull(durationFieldType0);
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertNotNull(unsupportedDurationField0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      
      long long0 = (-166L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getDifferenceAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }
}
