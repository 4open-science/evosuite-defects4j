/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:23:54 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class WeightEvoSuite_branch_Test extends WeightEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[4][9];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(4, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (9x4) matrix
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[4][9];
      Weight weight0 = new Weight(doubleArray0[1]);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertEquals(9, diagonalMatrix0.getRowDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(9, diagonalMatrix0.getColumnDimension());
      assertNotNull(diagonalMatrix0);
      
      Weight weight1 = new Weight((RealMatrix) diagonalMatrix0);
      assertFalse(weight0.equals((Object)weight1));
      assertFalse(weight1.equals((Object)weight0));
      assertEquals(9, diagonalMatrix0.getRowDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(9, diagonalMatrix0.getColumnDimension());
      assertNotSame(weight0, weight1);
      assertNotSame(weight1, weight0);
      assertNotNull(weight1);
  }
}
