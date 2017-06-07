/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:05:52 GMT 2014
 */

package org.apache.commons.math3.optimization;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class WeightEvoSuite_branch_Test extends WeightEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[2][9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (9x2) matrix
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      boolean boolean0 = true;
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(7, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(7, diagonalMatrix0.getRowDimension());
      assertNotNull(diagonalMatrix0);
      
      Weight weight0 = new Weight((RealMatrix) diagonalMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(7, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(7, diagonalMatrix0.getRowDimension());
      assertNotNull(weight0);
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, diagonalMatrix0.getColumnDimension());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(3, diagonalMatrix0.getRowDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertNotNull(diagonalMatrix0);
  }
}
