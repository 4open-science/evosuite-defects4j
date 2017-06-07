/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:58:00 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DefaultKeyedValuesEvoSuite_branch_Test extends DefaultKeyedValuesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 25;
      defaultKeyedValues0.addValue((Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues1.setValue((Comparable) int0, (double) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      int int1 = (-5648);
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues1.setValue((Comparable) int1, (double) int1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(int1 == int0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      double double0 = (-4425.09267);
      Double double1 = new Double(double0);
      assertTrue(double1.equals((Object)double0));
      assertEquals((-4425.09267), (double)double1, 0.01D);
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) double1);
      assertTrue(double1.equals((Object)double0));
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      assertEquals("SortOrder.ASCENDING", sortOrder0.toString());
      assertNotNull(sortOrder0);
      
      defaultKeyedValues0.sortByValues(sortOrder0);
      assertEquals("SortOrder.ASCENDING", sortOrder0.toString());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test05()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = (-1277);
      defaultKeyedValues0.addValue((Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertNotNull(sortOrder0);
      
      defaultKeyedValues0.sortByKeys(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test06()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(1, int0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.removeValue((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (1) is not recognised.
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      double double0 = (-4425.09267);
      defaultKeyedValues0.setValue((Comparable) double0, double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      int int0 = 0;
      defaultKeyedValues0.setValue((Comparable) int0, double0);
      assertEquals(2, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) double0);
      assertEquals(2, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test08()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(1, int0);
      
      int int1 = 0;
      assertFalse(int1 == int0);
      
      defaultKeyedValues0.insertValue(int1, (Comparable) int0, (double) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.insertValue(int1, (Comparable) int0, (double) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test09()  throws Throwable  {
      Comparable<String> comparable0 = null;
      int int0 = Integer.MAX_VALUE;
      assertEquals(Integer.MAX_VALUE, int0);
      
      int int1 = 0;
      assertFalse(int1 == int0);
      
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int1, (Comparable) comparable0, (Number) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = (-551);
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      defaultKeyedValues0.insertValue(int0, (Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.setValue((Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 0;
      Comparable<DefaultKeyedValues> comparable0 = null;
      // Undeclared exception!
      try {
        defaultKeyedValues0.addValue((Comparable) comparable0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      byte byte0 = Byte.MIN_VALUE;
      assertEquals((byte) (-128), byte0);
      
      // Undeclared exception!
      try {
        Number number0 = defaultKeyedValues0.getValue((Comparable) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: -128
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = 29;
      defaultKeyedValues0.addValue((Comparable) int0, (Number) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(29, (int)integer0);
      
      Integer integer1 = (Integer)defaultKeyedValues0.getValue((Comparable) integer0);
      assertNotSame(integer1, integer0);
      assertNotSame(integer0, integer1);
      assertTrue(integer1.equals((Object)integer0));
      assertTrue(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)integer1));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(29, (int)integer1);
  }

  @Test
  public void test15()  throws Throwable  {
      Comparable<Long> comparable0 = null;
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.removeValue(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      DefaultKeyedValues defaultKeyedValues1 = (DefaultKeyedValues)defaultKeyedValues0.clone();
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
  }

  @Test
  public void test17()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      List list0 = defaultKeyedValues0.getKeys();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test18()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      float float0 = Float.MIN_VALUE;
      assertEquals(1.4E-45F, float0, 0.01F);
      
      defaultKeyedValues0.addValue((Comparable) float0, (double) float0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      defaultKeyedValues0.removeValue((Comparable) float0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test
  public void test19()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = defaultKeyedValues0.hashCode();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertEquals(1, int0);
      
      // Undeclared exception!
      try {
        defaultKeyedValues0.insertValue(int0, (Comparable) int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      assertEquals(0, defaultKeyedValues0.getItemCount());
      assertNotNull(defaultKeyedValues0);
      
      int int0 = (-1277);
      defaultKeyedValues0.addValue((Comparable) int0, (double) int0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(0, defaultKeyedValues1.getItemCount());
      assertNotNull(defaultKeyedValues1);
      
      defaultKeyedValues1.setValue((Comparable) int0, (double) int0);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues1.getItemCount());
      
      boolean boolean0 = defaultKeyedValues0.equals((Object) defaultKeyedValues1);
      assertNotSame(defaultKeyedValues0, defaultKeyedValues1);
      assertNotSame(defaultKeyedValues1, defaultKeyedValues0);
      assertTrue(defaultKeyedValues0.equals((Object)defaultKeyedValues1));
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertEquals(1, defaultKeyedValues1.getItemCount());
      assertTrue(boolean0);
  }
}
