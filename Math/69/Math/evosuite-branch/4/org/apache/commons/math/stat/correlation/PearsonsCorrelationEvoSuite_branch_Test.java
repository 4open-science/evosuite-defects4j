/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:03:16 GMT 2014
 */

package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
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
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray0[0];
      assertNotNull(doubleArray0[1]);
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 2 rows and 1 columns.
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 9 columns.
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[][] doubleArray0 = new double[1][8];
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      double[] doubleArray1 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(realMatrixImpl0);
      
      int int0 = (-961);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0, int0);
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(pearsonsCorrelation0);
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray0[0], doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 2; yArray has 4 elements
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      boolean boolean0 = false;
      Covariance covariance0 = new Covariance(doubleArray0, boolean0);
      assertEquals(3, covariance0.getN());
      assertNotNull(covariance0);
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      assertEquals(3, covariance0.getN());
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertEquals(3, covariance0.getN());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(7, blockRealMatrix0.getColumnDimension());
      assertEquals(7, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertNotNull(blockRealMatrix0);
  }

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      int int0 = (-961);
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0, int0);
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(2, realMatrixImpl0.getColumnDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(2, blockRealMatrix0.getColumnDimension());
      assertEquals(2, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertNotNull(blockRealMatrix0);
  }

  @Test
  public void test6()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      assertEquals(0, covariance0.getN());
      assertNotNull(covariance0);
      
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
      double[][] doubleArray0 = new double[3][7];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
  }

  @Test
  public void test8()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }
}
