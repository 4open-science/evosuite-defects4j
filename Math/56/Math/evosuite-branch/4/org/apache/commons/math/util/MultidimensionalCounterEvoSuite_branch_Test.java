/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:18:38 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultidimensionalCounterEvoSuite_branch_Test extends MultidimensionalCounterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[1] = int0;
      intArray0[0] = intArray0[1];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 out of [0, 0] range
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = (-329);
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(108241, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-329), (-329)}, intArray0);
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -329 out of [0, -330] range
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-101);
      intArray0[0] = int0;
      int int1 = 75;
      intArray0[1] = int1;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      int int2 = 982;
      intArray0[5] = int2;
      intArray0[6] = int2;
      intArray0[7] = intArray0[3];
      intArray0[8] = intArray0[1];
      intArray0[9] = intArray0[5];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(10, multidimensionalCounter0.getDimension());
      assertEquals(889867720, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-101), 75, 75, (-101), (-101), 982, 982, (-101), 75, 982}, intArray0);
      
      // Undeclared exception!
      try {
        String string0 = multidimensionalCounter0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 10
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = 1;
      int[] intArray0 = new int[1];
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      
      String string0 = multidimensionalCounter0.toString();
      assertNotNull(string0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals("[0]", string0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      int[] intArray1 = multidimensionalCounter0.getCounts(intArray0[1]);
      assertNotNull(intArray1);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      assertArrayEquals(new int[] {0, 1, 0}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      // Undeclared exception!
      try {
        int[] intArray1 = multidimensionalCounter0.getCounts(intArray0[0]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 out of [0, 1] range
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 1388;
      int int1 = (-1382);
      int[] intArray0 = new int[7];
      intArray0[0] = int1;
      intArray0[1] = int0;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      intArray0[6] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(119943168, multidimensionalCounter0.getSize());
      assertEquals(7, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-1382), 1388, (-1382), 1388, 1388, 1388, 1388}, intArray0);
      
      // Undeclared exception!
      try {
        int[] intArray1 = multidimensionalCounter0.getCounts(int1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1,382 out of [0, 119,943,168] range
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[8];
      MultidimensionalCounter multidimensionalCounter0 = null;
      try {
        multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      Integer integer1 = multidimensionalCounter_Iterator0.next();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertFalse(integer1.equals((Object)integer0));
      assertEquals(1, (int)integer1);
      assertArrayEquals(new int[] {1, 1}, intArray0);
      assertNotSame(integer1, integer0);
  }

  @Test
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertTrue(boolean0);
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
  }

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertFalse(boolean0);
      assertArrayEquals(new int[] {1, 1}, intArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      int int1 = multidimensionalCounter_Iterator0.getCount();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      assertArrayEquals(new int[] {1, 1}, intArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertNotNull(intArray1);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      assertArrayEquals(new int[] {0, 0, (-1)}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      // Undeclared exception!
      try {
        multidimensionalCounter_Iterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      int int1 = multidimensionalCounter_Iterator0.getCount(int0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      assertArrayEquals(new int[] {1, 1}, intArray0);
  }

  @Test
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      int[] intArray1 = multidimensionalCounter0.getSizes();
      assertNotNull(intArray1);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray1);
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
  }

  @Test
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 1063;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
      
      int int1 = multidimensionalCounter0.getDimension();
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(1201157047, multidimensionalCounter0.getSize());
      assertFalse(int1 == int0);
      assertEquals(3, int1);
      assertArrayEquals(new int[] {1063, 1063, 1063}, intArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1}, intArray0);
      
      int int1 = multidimensionalCounter0.getSize();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      assertArrayEquals(new int[] {1, 1}, intArray0);
  }
}
