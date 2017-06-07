/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:33:48 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SingularValueDecompositionImplEvoSuite_branch_Test extends SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 66;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {66.0}, doubleArray0, 0.01);
      assertNotNull(realMatrixImpl0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0);
      assertArrayEquals(new double[] {66.0}, doubleArray0, 0.01);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(66.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {66.0}, doubleArray0, 0.01);
      assertNotNull(decompositionSolver0);
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(true, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(66.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 118;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = singularValueDecompositionImpl0.getCovariance((double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cutoff singular value is 118, should be at most 0
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(realMatrixImpl0);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(doubleArray0[3]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(doubleArray0[0]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertNotNull(array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 118;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)singularValueDecompositionImpl0.getS();
      assertNotNull(blockRealMatrix0);
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(118, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(118, blockRealMatrix0.getColumnDimension());
      
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)singularValueDecompositionImpl0.getS();
      assertNotNull(blockRealMatrix1);
      assertSame(blockRealMatrix1, blockRealMatrix0);
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(118, blockRealMatrix1.getColumnDimension());
      assertEquals(118, blockRealMatrix1.getRowDimension());
      assertEquals(true, blockRealMatrix1.isSquare());
      assertEquals(0.0, blockRealMatrix1.getFrobeniusNorm(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 118;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)singularValueDecompositionImpl0.getUT();
      assertNotNull(blockRealMatrix0);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(10.862780491200215, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(118, blockRealMatrix0.getRowDimension());
      assertEquals(118, blockRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertNotNull(decompositionSolver0);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(118, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(118, array2DRowRealMatrix0.getRowDimension());
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-832.11749216351);
      doubleArray0[3] = double0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-832.11749216351), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(realMatrixImpl0);
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-832.11749216351), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(832.11749216351, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(8, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
  }

  @Test
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      boolean boolean0 = true;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, boolean0);
      assertNotNull(realMatrixImpl0);
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(8, realMatrixImpl0.getColumnDimension());
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0);
      assertNotNull(singularValueDecompositionImpl0);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(8, realMatrixImpl0.getColumnDimension());
  }
}
