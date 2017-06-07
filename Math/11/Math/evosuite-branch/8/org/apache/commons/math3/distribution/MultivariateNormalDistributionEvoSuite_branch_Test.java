/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:22:49 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultivariateNormalDistributionEvoSuite_branch_Test extends MultivariateNormalDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      double[] doubleArray1 = new double[1];
      double double0 = 499.8267757766;
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937a0, doubleArray0[0], doubleArray0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double[] doubleArray2 = multivariateNormalDistribution0.sample();
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {512.5751704561364}, doubleArray2, 0.01);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray2, doubleArray1);
  }

  @Test
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      double[] doubleArray1 = new double[1];
      double double0 = 499.8267757766;
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937a0, doubleArray0[0], doubleArray0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double[] doubleArray2 = multivariateNormalDistribution0.getStandardDeviations();
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {22.35680602806671}, doubleArray2, 0.01);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray2, doubleArray1);
  }

  @Test
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[1][10];
      double[][] doubleArray1 = new double[1][4];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      double[] doubleArray2 = new double[1];
      double double0 = 499.8267757766;
      doubleArray2[0] = double0;
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937a0, doubleArray2, doubleArray1);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {499.8267757766}, doubleArray2, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotNull(multivariateNormalDistribution0);
      assertNotSame(doubleArray1, doubleArray0);
      
      try {
        double double1 = multivariateNormalDistribution0.density(doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 10 != 1
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      long long0 = (-2541L);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) long0;
      double[][] doubleArray1 = new double[1][10];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,541 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -2,541 at index 0
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well44497b well44497b0 = new Well44497b(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(well44497b0);
      
      double[] doubleArray0 = new double[5];
      double[][] doubleArray1 = new double[5][5];
      double[] doubleArray2 = new double[6];
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertNotSame(doubleArray2, doubleArray0);
      
      doubleArray1[4] = doubleArray2;
      assertNotNull(doubleArray1[4]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well44497b0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 5
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[12][8];
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937c0, doubleArray0[0], doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 12 != 8
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      double[] doubleArray1 = new double[1];
      double double0 = 499.8267757766;
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937a0, doubleArray0[0], doubleArray0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double double1 = multivariateNormalDistribution0.density(doubleArray0[0]);
      assertEquals(0.017844332499937648, double1, 0.01D);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertFalse(double1 == double0);
  }

  @Test
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      double[] doubleArray1 = new double[1];
      double double0 = 499.8267757766;
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937a0, doubleArray0[0], doubleArray0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)multivariateNormalDistribution0.getCovariances();
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertNotNull(array2DRowRealMatrix0);
  }
}
