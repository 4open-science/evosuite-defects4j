/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:43:54 GMT 2014
 */

package org.apache.commons.math3.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RectangularCholeskyDecompositionEvoSuite_branch_Test extends RectangularCholeskyDecompositionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      double double0 = (-1727.2809212188);
      Double double1 = new Double(double0);
      assertEquals((-1727.2809212188), (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      doubleArray0[0] = double1;
      doubleArray0[1] = double1;
      double double2 = 0.25;
      Double double3 = new Double(double2);
      assertNotSame(double3, double1);
      assertEquals(0.25, (double)double3, 0.01D);
      assertFalse(double2 == double0);
      assertTrue(double3.equals((Object)double2));
      assertFalse(double3.equals((Object)double1));
      assertFalse(double3.equals((Object)double0));
      
      doubleArray0[2] = double3;
      doubleArray0[3] = double1;
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertNotNull(openMapRealVector0);
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix0, (double) doubleArray0[4]);
      assertNotNull(rectangularCholeskyDecomposition0);
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 1051;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(1051, openMapRealMatrix0.getColumnDimension());
      assertEquals(1051, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (1,051): not positive definite matrix: value 0 at index 0
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      double double0 = (-1727.2809212188);
      Double double1 = new Double(double0);
      assertEquals((-1727.2809212188), (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      doubleArray0[0] = double1;
      doubleArray0[1] = double1;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertNotNull(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix0, (double) doubleArray0[4]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -\u221E is smaller than, or equal to, the minimum (-1,727.281): not positive definite matrix: value -\u221E at index 2
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      double double0 = (-1727.2809212188);
      Double double1 = new Double(double0);
      assertEquals((-1727.2809212188), (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      doubleArray0[0] = double1;
      double double2 = (-4657.35765340032);
      Double double3 = new Double(double2);
      assertNotSame(double3, double1);
      assertEquals((-4657.35765340032), (double)double3, 0.01D);
      assertFalse(double3.equals((Object)double0));
      assertTrue(double3.equals((Object)double2));
      assertFalse(double3.equals((Object)double1));
      assertFalse(double2 == double0);
      
      doubleArray0[1] = double3;
      doubleArray0[2] = double3;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = double3;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertNotNull(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix0, (double) doubleArray0[4]);
      assertNotNull(rectangularCholeskyDecomposition0);
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(6, rectangularCholeskyDecomposition0.getRank());
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)rectangularCholeskyDecomposition0.getRootMatrix();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(6, openMapRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(6, rectangularCholeskyDecomposition0.getRank());
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 1;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) array2DRowRealMatrix0, (double) int0);
      assertNotNull(rectangularCholeskyDecomposition0);
      assertEquals(1, rectangularCholeskyDecomposition0.getRank());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
      
      int int1 = rectangularCholeskyDecomposition0.getRank();
      assertEquals(1, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(1, rectangularCholeskyDecomposition0.getRank());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {1.0}, doubleArray0, 0.01);
  }
}