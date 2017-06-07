/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:58:12 GMT 2014
 */

package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PearsonsCorrelationEvoSuite_branch_Test extends PearsonsCorrelationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 2 rows and 1 columns.
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 7 columns.
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[] doubleArray0 = new double[1];
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertNotNull(realMatrixImpl0);
      assertEquals(8, realMatrixImpl0.getColumnDimension());
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(8, realMatrixImpl0.getColumnDimension());
      assertEquals(2, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      
      double[] doubleArray2 = new double[5];
      assertNotSame(doubleArray2, doubleArray1);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 7; yArray has 5 elements
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 269;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
      
      Covariance covariance0 = new Covariance((RealMatrix) array2DRowRealMatrix0);
      assertNotNull(covariance0);
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(269, covariance0.getN());
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(269, covariance0.getN());
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertNotNull(blockRealMatrix0);
      assertEquals(269, blockRealMatrix0.getColumnDimension());
      assertEquals(269, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(269, covariance0.getN());
  }

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertNotNull(blockRealMatrix0);
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(8, blockRealMatrix0.getColumnDimension());
      assertEquals(8, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
  }

  @Test
  public void test6()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      assertNotNull(covariance0);
      assertEquals(0, covariance0.getN());
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix is null
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 269;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) array2DRowRealMatrix0, int0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(269, array2DRowRealMatrix0.getRowDimension());
      assertEquals(269, array2DRowRealMatrix0.getColumnDimension());
  }

  @Test
  public void test8()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
      assertNotNull(blockRealMatrix0);
      assertEquals(8, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(8, blockRealMatrix0.getColumnDimension());
  }

  @Test
  public void test9()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }
}
