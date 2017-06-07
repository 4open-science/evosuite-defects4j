/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:34:36 GMT 2014
 */

package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Years;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnsupportedDurationFieldEvoSuite_branch_Test extends UnsupportedDurationFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) durationFieldType0);
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals("hours", unsupportedDurationField1.getName());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField1);
      assertSame(unsupportedDurationField1, unsupportedDurationField0);
  }

  @Test
  public void test03()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = (-319);
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(1, hours0.size());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(1, hours0.size());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.isSupported();
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(1, hours0.size());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("months", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.isPrecise();
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("months", unsupportedDurationField0.getName());
      assertTrue(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 20L;
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getDifference(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("minutes", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("minutes", durationFieldType0.toString());
      assertEquals("minutes", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = (-3115);
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // minutes field is unsupported
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(1, hours0.size());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals(1, hours0.size());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 37L;
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getMillis(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      assertEquals(1, hours0.size());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(1, hours0.size());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = (-1084L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getValueAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 741L;
      int int0 = (-645);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.add(long0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // null field is unsupported
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = unsupportedDurationField0.getUnitMillis();
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, long0);
  }

  @Test
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = 964;
      int int1 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", durationFieldType0.getName());
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      // Undeclared exception!
      try {
        int int2 = unsupportedDurationField0.getValue((long) int1, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = null;
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertNotNull(unsupportedDurationField0);
      
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
  public void test14()  throws Throwable  {
      int int0 = (-52);
      Years years0 = Years.MIN_VALUE;
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      DurationFieldType durationFieldType0 = years0.getFieldType();
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(1, years0.size());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(1, years0.size());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("years", unsupportedDurationField0.getName());
      assertNotNull(unsupportedDurationField0);
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.subtract((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // years field is unsupported
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 4364;
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("centuries", durationFieldType0.toString());
      assertEquals("centuries", durationFieldType0.getName());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertNotNull(unsupportedDurationField0);
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getValueAsLong((long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // centuries field is unsupported
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals("eras", unsupportedDurationField0.getName());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = 2629746032L;
      // Undeclared exception!
      try {
        int int0 = unsupportedDurationField0.getValue(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
      }
  }

  @Test
  public void test17() {}
//   @Test
//   public void test17()  throws Throwable  {
//       DurationFieldType durationFieldType0 = DurationFieldType.eras();
//       assertEquals("eras", durationFieldType0.toString());
//       assertEquals("eras", durationFieldType0.getName());
//       assertNotNull(durationFieldType0);
//       
//       UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals("eras", unsupportedDurationField0.getName());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("eras", durationFieldType0.toString());
//       assertEquals("eras", durationFieldType0.getName());
//       assertNotNull(unsupportedDurationField0);
//       
//       DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
//       assertEquals(false, unsupportedDurationField0.isSupported());
//       assertEquals("eras", unsupportedDurationField0.getName());
//       assertEquals(true, unsupportedDurationField0.isPrecise());
//       assertEquals(0L, unsupportedDurationField0.getUnitMillis());
//       assertEquals("eras", durationFieldType1.toString());
//       assertEquals("eras", durationFieldType1.getName());
//       assertEquals("eras", durationFieldType0.toString());
//       assertEquals("eras", durationFieldType0.getName());
//       assertNotNull(durationFieldType1);
//       assertSame(durationFieldType1, durationFieldType0);
//       assertSame(durationFieldType0, durationFieldType1);
//   }

  @Test
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertNotNull(unsupportedDurationField0);
      
      int int0 = unsupportedDurationField0.hashCode();
      assertEquals("hours", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("hours", durationFieldType0.toString());
      assertEquals("hours", durationFieldType0.getName());
      assertEquals(99469071, int0);
      
      // Undeclared exception!
      try {
        long long0 = unsupportedDurationField0.getMillis((long) int0, (long) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hours field is unsupported
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      DurationFieldType durationFieldType1 = DurationFieldType.centuries();
      assertEquals("centuries", durationFieldType1.getName());
      assertEquals("centuries", durationFieldType1.toString());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertNotNull(durationFieldType1);
      assertNotSame(durationFieldType1, durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType1);
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("centuries", durationFieldType1.getName());
      assertEquals("centuries", durationFieldType1.toString());
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertNotNull(unsupportedDurationField0);
      assertNotSame(durationFieldType1, durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      assertEquals("eras", unsupportedDurationField1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertNotNull(unsupportedDurationField1);
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      
      boolean boolean0 = unsupportedDurationField0.equals((Object) unsupportedDurationField1);
      assertEquals("eras", durationFieldType0.getName());
      assertEquals("eras", durationFieldType0.toString());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals("centuries", unsupportedDurationField0.getName());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertEquals("centuries", durationFieldType1.getName());
      assertEquals("centuries", durationFieldType1.toString());
      assertEquals("eras", unsupportedDurationField1.getName());
      assertEquals(true, unsupportedDurationField1.isPrecise());
      assertEquals(0L, unsupportedDurationField1.getUnitMillis());
      assertEquals(false, unsupportedDurationField1.isSupported());
      assertFalse(durationFieldType0.equals((Object)durationFieldType1));
      assertFalse(unsupportedDurationField0.equals((Object)unsupportedDurationField1));
      assertFalse(durationFieldType1.equals((Object)durationFieldType0));
      assertFalse(unsupportedDurationField1.equals((Object)unsupportedDurationField0));
      assertNotSame(durationFieldType0, durationFieldType1);
      assertNotSame(unsupportedDurationField0, unsupportedDurationField1);
      assertNotSame(durationFieldType1, durationFieldType0);
      assertNotSame(unsupportedDurationField1, unsupportedDurationField0);
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      assertEquals("months", durationFieldType0.getName());
      assertEquals("months", durationFieldType0.toString());
      assertEquals("months", unsupportedDurationField0.getName());
      assertEquals(true, unsupportedDurationField0.isPrecise());
      assertEquals(false, unsupportedDurationField0.isSupported());
      assertEquals(0L, unsupportedDurationField0.getUnitMillis());
      assertNotNull(unsupportedDurationField0);
      
      long long0 = (-14L);
      // Undeclared exception!
      try {
        long long1 = unsupportedDurationField0.getDifferenceAsLong(long0, long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // months field is unsupported
         //
      }
  }
}