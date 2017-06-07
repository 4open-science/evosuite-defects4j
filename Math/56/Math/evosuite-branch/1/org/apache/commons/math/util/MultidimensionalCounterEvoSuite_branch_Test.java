/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:03:55 GMT 2014
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
      int[] intArray0 = new int[1];
      int int0 = 214;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {214}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(214, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 214 out of [0, 213] range
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 1713;
      intArray0[0] = int0;
      int int1 = (-1585);
      int[] intArray1 = new int[3];
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray1.equals((Object)intArray0));
      
      intArray1[2] = int1;
      intArray1[0] = int1;
      intArray1[1] = intArray0[0];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {(-1585), 1713, (-1585)}, intArray1);
      assertNotNull(multidimensionalCounter0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertEquals(8474129, multidimensionalCounter0.getSize());
      
      try {
        int int2 = multidimensionalCounter0.getCount(intArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1,585 out of [0, -1,586] range
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = (-3);
      int[] intArray0 = new int[6];
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {(-3), (-3), (-3), (-3), (-3), (-3)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(729, multidimensionalCounter0.getSize());
      
      int[] intArray1 = new int[8];
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray1.equals((Object)intArray0));
      
      // Undeclared exception!
      try {
        int int1 = multidimensionalCounter0.getCount(intArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 8 != 6
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      String string0 = multidimensionalCounter0.toString();
      assertEquals("[0]", string0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(string0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
  }

  @Test
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 4828;
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {4828, 4828}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(23309584, multidimensionalCounter0.getSize());
      
      int[] intArray1 = multidimensionalCounter0.getCounts(intArray0[0]);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {4828, 4828}, intArray0);
      assertArrayEquals(new int[] {1, 0}, intArray1);
      assertNotNull(intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(23309584, multidimensionalCounter0.getSize());
  }

  @Test
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
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
      int[] intArray0 = new int[1];
      int int0 = 22;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
      
      int int1 = (-1357);
      // Undeclared exception!
      try {
        int[] intArray1 = multidimensionalCounter0.getCounts(int1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1,357 out of [0, 22] range
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
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
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(0, (int)integer0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      Integer integer1 = multidimensionalCounter_Iterator0.next();
      assertEquals(1, (int)integer1);
      assertNotSame(integer1, integer0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer1.equals((Object)integer0));
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
  }

  @Test
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 22;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(22, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(22, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertTrue(boolean0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertEquals(22, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
  }

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(0, (int)integer0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertFalse(boolean0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 22;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
      
      int int1 = multidimensionalCounter_Iterator0.getCount();
      assertEquals((-1), int1);
      assertArrayEquals(new int[] {22}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
  }

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
      assertArrayEquals(new int[] {(-1)}, intArray1);
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotNull(intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 1152;
      int[] intArray0 = new int[4];
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1152, 1152, 1152, 1152}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(4, multidimensionalCounter0.getDimension());
      assertEquals(268435456, multidimensionalCounter0.getSize());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertArrayEquals(new int[] {1152, 1152, 1152, 1152}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(4, multidimensionalCounter0.getDimension());
      assertEquals(268435456, multidimensionalCounter0.getSize());
      
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
      int[] intArray0 = new int[6];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      intArray0[2] = intArray0[0];
      intArray0[3] = intArray0[0];
      intArray0[4] = intArray0[2];
      intArray0[5] = intArray0[3];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      
      int int1 = multidimensionalCounter_Iterator0.getCount(intArray0[0]);
      assertEquals(0, int1);
      assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
  }

  @Test
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 22;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
      
      int[] intArray1 = multidimensionalCounter0.getSizes();
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {22}, intArray0);
      assertArrayEquals(new int[] {22}, intArray1);
      assertNotNull(intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(22, multidimensionalCounter0.getSize());
  }

  @Test
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 1713;
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1713, 1713, 1713, 1713, 1713, 1713}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(1690681121, multidimensionalCounter0.getSize());
      assertEquals(6, multidimensionalCounter0.getDimension());
      
      int int1 = multidimensionalCounter0.getDimension();
      assertEquals(6, int1);
      assertArrayEquals(new int[] {1713, 1713, 1713, 1713, 1713, 1713}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(1690681121, multidimensionalCounter0.getSize());
      assertEquals(6, multidimensionalCounter0.getDimension());
  }

  @Test
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 1713;
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertArrayEquals(new int[] {1713, 1713, 1713, 1713, 1713, 1713}, intArray0);
      assertNotNull(multidimensionalCounter0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(1690681121, multidimensionalCounter0.getSize());
      
      int int1 = multidimensionalCounter0.getSize();
      assertEquals(1690681121, int1);
      assertArrayEquals(new int[] {1713, 1713, 1713, 1713, 1713, 1713}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(6, multidimensionalCounter0.getDimension());
      assertEquals(1690681121, multidimensionalCounter0.getSize());
  }
}
