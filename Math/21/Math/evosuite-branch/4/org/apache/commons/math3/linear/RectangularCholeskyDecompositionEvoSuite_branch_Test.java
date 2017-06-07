/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:34:23 GMT 2014
 */

package org.apache.commons.math3.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
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
      int int0 = 696;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(696, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(696, openMapRealMatrix0.getColumnDimension());
      assertNotNull(openMapRealMatrix0);
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = null;
      try {
        rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (696): not positive definite matrix: value 0 at index 0
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 2.0;
      doubleArray0[1] = double0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, doubleArray0);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(2.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(4.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(2.8284271247461903, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(12, arrayRealVector0.getDimension());
      assertNotNull(arrayRealVector0);
      assertArrayEquals(new double[] {0.0, 2.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(2.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(4.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(2.8284271247461903, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(12, arrayRealVector0.getDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(12, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(12, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      assertArrayEquals(new double[] {0.0, 2.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) array2DRowRealMatrix0, doubleArray0[0]);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(2.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(4.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(2.8284271247461903, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(12, arrayRealVector0.getDimension());
      assertEquals(12, rectangularCholeskyDecomposition0.getRank());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(12, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(12, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(rectangularCholeskyDecomposition0);
      assertArrayEquals(new double[] {0.0, 2.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 628;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertNotNull(openMapRealMatrix0);
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.scalarAdd((double) int0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertNotNull(openMapRealMatrix1);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix1, (double) int0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertNotNull(rectangularCholeskyDecomposition0);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)rectangularCholeskyDecomposition0.getRootMatrix();
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(628, array2DRowRealMatrix0.getRowDimension());
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 628;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertNotNull(openMapRealMatrix0);
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.scalarAdd((double) int0);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertNotNull(openMapRealMatrix1);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) openMapRealMatrix1, (double) int0);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertNotNull(rectangularCholeskyDecomposition0);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      
      int int1 = rectangularCholeskyDecomposition0.getRank();
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(false, openMapRealMatrix1.isTransposable());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(628, openMapRealMatrix1.getRowDimension());
      assertEquals(628, openMapRealMatrix1.getColumnDimension());
      assertEquals(628, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(628, openMapRealMatrix0.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      assertEquals(2, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
  }
}
