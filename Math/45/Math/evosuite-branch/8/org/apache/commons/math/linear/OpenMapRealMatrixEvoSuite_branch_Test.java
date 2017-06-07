/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:16:41 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class OpenMapRealMatrixEvoSuite_branch_Test extends OpenMapRealMatrixEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 1678;
      int int1 = 0;
      int int2 = 657;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int2);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1678, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(657, openMapRealMatrix0.getColumnDimension());
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      
      openMapRealMatrix0.addToEntry(int2, int1, (double) int1);
      assertEquals(1678, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(657, openMapRealMatrix0.getColumnDimension());
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      int int1 = 1497;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int1, int1);
      assertNotNull(openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1497, openMapRealMatrix0.getRowDimension());
      assertEquals(1497, openMapRealMatrix0.getColumnDimension());
      assertFalse(int1 == int0);
      
      openMapRealMatrix0.addToEntry(int0, int0, (double) int1);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(1497, openMapRealMatrix0.getRowDimension());
      assertEquals(1497, openMapRealMatrix0.getColumnDimension());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 691;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(691, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(691, openMapRealMatrix0.getRowDimension());
      
      int int1 = 185;
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.getRowMatrix(int1);
      assertNotNull(openMapRealMatrix1);
      assertEquals(691, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(691, openMapRealMatrix0.getRowDimension());
      assertEquals(691, openMapRealMatrix1.getColumnDimension());
      assertEquals(false, openMapRealMatrix1.isSquare());
      assertEquals(1, openMapRealMatrix1.getRowDimension());
      assertFalse(int1 == int0);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(int0 == int1);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 58;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(58, openMapRealMatrix0.getColumnDimension());
      assertEquals(58, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.multiply(openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertEquals(58, openMapRealMatrix0.getColumnDimension());
      assertEquals(58, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(58, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(58, openMapRealMatrix1.getColumnDimension());
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 1678;
      int int1 = 657;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int1);
      assertNotNull(openMapRealMatrix0);
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(657, openMapRealMatrix0.getColumnDimension());
      assertEquals(1678, openMapRealMatrix0.getRowDimension());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = 522;
      openMapRealMatrix0.setEntry(int1, int2, (double) int0);
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(657, openMapRealMatrix0.getColumnDimension());
      assertEquals(1678, openMapRealMatrix0.getRowDimension());
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertEquals(false, openMapRealMatrix1.isSquare());
      assertEquals(1678, openMapRealMatrix1.getRowDimension());
      assertEquals(657, openMapRealMatrix1.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(657, openMapRealMatrix0.getColumnDimension());
      assertEquals(1678, openMapRealMatrix0.getRowDimension());
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 2147483625;
      OpenMapRealMatrix openMapRealMatrix0 = null;
      try {
        openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4,611,685,919,643,140,625 is larger than, or equal to, the maximum (2,147,483,647)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 691;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(691, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(691, openMapRealMatrix0.getRowDimension());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.copy();
      assertNotNull(openMapRealMatrix1);
      assertEquals(691, openMapRealMatrix1.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(691, openMapRealMatrix1.getColumnDimension());
      assertEquals(691, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(691, openMapRealMatrix0.getRowDimension());
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 58;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(58, openMapRealMatrix0.getColumnDimension());
      assertEquals(58, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      
      OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertEquals(58, openMapRealMatrix0.getColumnDimension());
      assertEquals(58, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(58, openMapRealMatrix1.getColumnDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(58, openMapRealMatrix1.getRowDimension());
      assertTrue(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertTrue(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
  }
}
