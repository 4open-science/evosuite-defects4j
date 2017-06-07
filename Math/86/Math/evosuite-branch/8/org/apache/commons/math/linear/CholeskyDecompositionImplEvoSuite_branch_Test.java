/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:29:13 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.linear.CholeskyDecompositionImpl;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.DenseRealMatrix;
import org.apache.commons.math.linear.NonSquareMatrixException;
import org.apache.commons.math.linear.NotPositiveDefiniteMatrixException;
import org.apache.commons.math.linear.NotSymmetricMatrixException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CholeskyDecompositionImplEvoSuite_branch_Test extends CholeskyDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-2568.8024726013664);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertEquals(18, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0E-12, openMapRealVector0.getEpsilon(), 0.01D);
      assertNotNull(openMapRealVector0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct(doubleArray0);
      assertEquals(18, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0E-12, openMapRealVector0.getEpsilon(), 0.01D);
      assertEquals(18, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(18, openMapRealMatrix0.getRowDimension());
      assertNotNull(openMapRealMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) openMapRealMatrix0, double0, doubleArray0[0]);
      assertEquals(18, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0E-12, openMapRealVector0.getEpsilon(), 0.01D);
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(18, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(18, openMapRealMatrix0.getRowDimension());
      assertNotNull(choleskyDecompositionImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = choleskyDecompositionImpl0.getDeterminant();
      assertEquals(18, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0E-12, openMapRealVector0.getEpsilon(), 0.01D);
      assertEquals(Double.NaN, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(18, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(18, openMapRealMatrix0.getRowDimension());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-1886.743671592);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, double0, double0);
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(choleskyDecompositionImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DenseRealMatrix denseRealMatrix0 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertEquals(1, denseRealMatrix0.getColumnDimension());
      assertEquals(true, denseRealMatrix0.isSquare());
      assertEquals(0.0, denseRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(1, denseRealMatrix0.getRowDimension());
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(denseRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DenseRealMatrix denseRealMatrix1 = (DenseRealMatrix)choleskyDecompositionImpl0.getLT();
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, denseRealMatrix1.getColumnDimension());
      assertEquals(1, denseRealMatrix1.getRowDimension());
      assertEquals(0.0, denseRealMatrix1.getFrobeniusNorm(), 0.01D);
      assertEquals(true, denseRealMatrix1.isSquare());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(denseRealMatrix1);
      assertNotSame(denseRealMatrix1, denseRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(denseRealMatrix1.equals((Object)denseRealMatrix0));
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-1886.743671592);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, double0, double0);
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(choleskyDecompositionImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DenseRealMatrix denseRealMatrix0 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(true, denseRealMatrix0.isSquare());
      assertEquals(1, denseRealMatrix0.getColumnDimension());
      assertEquals(0.0, denseRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(1, denseRealMatrix0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(denseRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DenseRealMatrix denseRealMatrix1 = (DenseRealMatrix)choleskyDecompositionImpl0.getL();
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(0.0, denseRealMatrix1.getFrobeniusNorm(), 0.01D);
      assertEquals(1, denseRealMatrix1.getRowDimension());
      assertEquals(true, denseRealMatrix1.isSquare());
      assertEquals(1, denseRealMatrix1.getColumnDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(denseRealMatrix1);
      assertSame(denseRealMatrix1, denseRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 7;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(7, openMapRealMatrix0.getColumnDimension());
      assertEquals(7, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertNotNull(openMapRealMatrix0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) openMapRealMatrix0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // not positive definite matrix
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Double[] doubleArray0 = new Double[8];
      double double0 = Double.POSITIVE_INFINITY;
      Double double1 = new Double(double0);
      //  // Unstable assertion: assertTrue(double1.equals((Object)double0));
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, (double)double1, 0.01D);
      
      doubleArray0[0] = double1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = (Double) double0;
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray0[2];
      doubleArray0[6] = double1;
      doubleArray0[7] = (Double) double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) double1);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, openMapRealVector0.getEpsilon(), 0.01D);
      //  // Unstable assertion: assertEquals(8, openMapRealVector0.getDimension());
      //  // Unstable assertion: assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01D);
      //  // Unstable assertion: assertNotNull(openMapRealVector0);
      //  // Unstable assertion: assertTrue(double1.equals((Object)double0));
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) openMapRealVector0);
      //  // Unstable assertion: assertEquals(8, openMapRealMatrix0.getRowDimension());
      //  // Unstable assertion: assertEquals(8, openMapRealMatrix0.getColumnDimension());
      //  // Unstable assertion: assertEquals(true, openMapRealMatrix0.isSquare());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, openMapRealVector0.getEpsilon(), 0.01D);
      //  // Unstable assertion: assertEquals(8, openMapRealVector0.getDimension());
      //  // Unstable assertion: assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01D);
      //  // Unstable assertion: assertNotNull(openMapRealMatrix0);
      //  // Unstable assertion: assertTrue(double1.equals((Object)double0));
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) openMapRealMatrix0, (double) double1, (double) doubleArray0[6]);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // not symmetric matrix
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[18][8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(18, realMatrixImpl0.getRowDimension());
      assertEquals(8, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = null;
      try {
        choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // a 18x8 matrix was provided instead of a square matrix
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-1886.743671592);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      CholeskyDecompositionImpl choleskyDecompositionImpl0 = new CholeskyDecompositionImpl((RealMatrix) realMatrixImpl0, double0, double0);
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertNotNull(choleskyDecompositionImpl0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DecompositionSolver decompositionSolver0 = choleskyDecompositionImpl0.getSolver();
      assertEquals(0.0, choleskyDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertNotNull(decompositionSolver0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }
}
