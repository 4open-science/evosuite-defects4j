/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:08:34 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.linear.CholeskyDecompositionImpl;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DenseRealMatrix;
import org.apache.commons.math.linear.NonSquareMatrixException;
import org.apache.commons.math.linear.NotSymmetricMatrixException;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CholeskyDecompositionImplEvoSuite_branch_Test extends CholeskyDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 4;
      int int1 = (-12);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(int0, int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, (double) int1, (double) int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(choleskyDecompositionImpl0);
      
      double double0 = choleskyDecompositionImpl0.getDeterminant();
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(Double.NaN, double0, 0.01D);
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 4;
      int int1 = (-12);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(int0, int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, (double) int1, (double) int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(choleskyDecompositionImpl0);
      
      DenseRealMatrix denseRealMatrix0 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(true, denseRealMatrix0.isSquare());
      assertEquals(4, denseRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, denseRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(4, denseRealMatrix0.getRowDimension());
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(denseRealMatrix0);
      
      DenseRealMatrix denseRealMatrix1 = (DenseRealMatrix)choleskyDecompositionImpl0.getLT();
      assertFalse(int0 == int1);
      assertFalse(denseRealMatrix1.equals((Object)denseRealMatrix0));
      assertFalse(int1 == int0);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(Double.NaN, denseRealMatrix1.getFrobeniusNorm(), 0.01D);
      assertEquals(4, denseRealMatrix1.getRowDimension());
      assertEquals(true, denseRealMatrix1.isSquare());
      assertEquals(4, denseRealMatrix1.getColumnDimension());
      assertNotNull(denseRealMatrix1);
      assertNotSame(denseRealMatrix1, denseRealMatrix0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 4;
      int int1 = (-12);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(int0, int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, (double) int1, (double) int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(choleskyDecompositionImpl0);
      
      DenseRealMatrix denseRealMatrix0 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(true, denseRealMatrix0.isSquare());
      assertEquals(4, denseRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, denseRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(4, denseRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(denseRealMatrix0);
      
      DenseRealMatrix denseRealMatrix1 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(4, denseRealMatrix1.getColumnDimension());
      assertEquals(true, denseRealMatrix1.isSquare());
      assertEquals(4, denseRealMatrix1.getRowDimension());
      assertEquals(Double.NaN, denseRealMatrix1.getFrobeniusNorm(), 0.01D);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(denseRealMatrix1);
      assertSame(denseRealMatrix1, denseRealMatrix0);
  }

  @Test
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[2];
      double double0 = 12.220843628472602;
      doubleArray1[1] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray1;
      assertNotNull(doubleArray0[1]);
      
      boolean boolean0 = false;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, boolean0);
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // not symmetric matrix
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // a 9x1 matrix was provided instead of a square matrix
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 4;
      int int1 = (-12);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(int0, int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, (double) int1, (double) int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertNotNull(choleskyDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = choleskyDecompositionImpl0.getSolver();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(4, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertNotNull(decompositionSolver0);
  }
}
