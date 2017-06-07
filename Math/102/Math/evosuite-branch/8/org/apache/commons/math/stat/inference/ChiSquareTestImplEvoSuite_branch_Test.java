/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:39:47 GMT 2014
 */

package org.apache.commons.math.stat.inference;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.distribution.ChiSquaredDistribution;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.DistributionFactoryImpl;
import org.apache.commons.math.distribution.GammaDistribution;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.stat.inference.ChiSquareTestImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ChiSquareTestImplEvoSuite_branch_Test extends ChiSquareTestImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[10];
      long long0 = (-2772L);
      longArray0[6] = long0;
      long[][] longArray1 = new long[4][10];
      longArray1[1] = longArray0;
      assertNotNull(longArray1[1]);
      
      try {
        double double0 = chiSquareTestImpl0.chiSquare(longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All entries in input 2-way table must be non-negative
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[8][6];
      long[] longArray1 = new long[9];
      longArray0[4] = longArray1;
      assertNotNull(longArray0[4]);
      
      try {
        double double0 = chiSquareTestImpl0.chiSquare(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must be rectangular
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = 2358.55;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double0, double0);
      assertEquals(2358.55, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(2358.55, gammaDistributionImpl0.getBeta(), 0.01D);
      assertNotNull(gammaDistributionImpl0);
      
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0, (GammaDistribution) gammaDistributionImpl0);
      assertEquals(2358.55, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertEquals(1179.275, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(2358.55, gammaDistributionImpl0.getBeta(), 0.01D);
      assertNotNull(chiSquaredDistributionImpl0);
      
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) chiSquaredDistributionImpl0);
      assertEquals(2358.55, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertEquals(1179.275, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(2358.55, gammaDistributionImpl0.getBeta(), 0.01D);
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[13][7];
      long[] longArray1 = new long[1];
      longArray0[0] = longArray1;
      assertNotNull(longArray0[0]);
      
      try {
        double double1 = chiSquareTestImpl0.chiSquareTest(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two columns
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[1][3];
      try {
        double double0 = chiSquareTestImpl0.chiSquareTest(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input table must have at least two rows
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[3];
      long long0 = 547L;
      longArray0[2] = long0;
      long[][] longArray1 = new long[4][7];
      longArray1[0] = longArray0;
      assertNotNull(longArray1[0]);
      
      longArray1[1] = longArray1[0];
      assertNotNull(longArray1[1]);
      
      longArray1[3] = longArray0;
      assertNotNull(longArray1[3]);
      
      longArray0[0] = longArray0[2];
      longArray0[1] = longArray0[2];
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray1[1], longArray1[3], double0);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[1];
      long long0 = 14L;
      long[] longArray1 = new long[2];
      assertNotSame(longArray1, longArray0);
      assertFalse(longArray1.equals((Object)longArray0));
      
      longArray1[1] = long0;
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray1, (double) longArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 14.0
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[2];
      double double0 = (-321.59);
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: -321.59
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[3];
      long long0 = 547L;
      longArray0[2] = long0;
      long[][] longArray1 = new long[4][7];
      longArray1[1] = longArray0;
      assertNotNull(longArray1[1]);
      
      longArray1[3] = longArray0;
      assertNotNull(longArray1[3]);
      
      longArray0[0] = longArray0[2];
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray1[1], longArray1[3], double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must not both be zero
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[3];
      long long0 = 9L;
      longArray0[2] = long0;
      long[] longArray1 = new long[3];
      assertNotSame(longArray1, longArray0);
      assertFalse(longArray1.equals((Object)longArray0));
      
      longArray1[0] = longArray0[2];
      longArray0[1] = long0;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray1, double0);
      assertNotSame(longArray0, longArray1);
      assertNotSame(longArray1, longArray0);
      assertArrayEquals(new long[] {0L, 9L, 9L}, longArray0);
      assertArrayEquals(new long[] {9L, 0L, 0L}, longArray1);
      assertFalse(longArray0.equals((Object)longArray1));
      assertFalse(longArray1.equals((Object)longArray0));
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[23];
      long long0 = (-1910L);
      longArray0[7] = long0;
      try {
        double double0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = 1.0;
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0);
      assertEquals(1.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquaredDistributionImpl0);
      
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) chiSquaredDistributionImpl0);
      assertEquals(1.0, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[4];
      long[] longArray1 = new long[60];
      assertNotSame(longArray1, longArray0);
      assertFalse(longArray1.equals((Object)longArray0));
      
      try {
        double double1 = chiSquareTestImpl0.chiSquareDataSetsComparison(longArray0, longArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oberved1, observed2 array lengths incorrect
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[1];
      try {
        double double0 = chiSquareTestImpl0.chiSquareDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oberved1, observed2 array lengths incorrect
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[3];
      long long0 = 547L;
      longArray0[2] = long0;
      long[][] longArray1 = new long[4][7];
      longArray1[0] = longArray0;
      assertNotNull(longArray1[0]);
      
      long[] longArray2 = new long[3];
      assertNotSame(longArray2, longArray0);
      assertFalse(longArray2.equals((Object)longArray0));
      
      longArray2[0] = long0;
      longArray2[1] = long0;
      longArray1[1] = longArray2;
      assertNotNull(longArray1[1]);
      
      longArray1[3] = longArray0;
      assertNotNull(longArray1[3]);
      
      longArray1[2] = longArray0;
      assertNotNull(longArray1[2]);
      
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray1, double0);
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      double double0 = 400.305446106859;
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0);
      assertEquals(400.305446106859, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquaredDistributionImpl0);
      
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) chiSquaredDistributionImpl0);
      assertEquals(400.305446106859, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[2][1];
      long long0 = 610L;
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray0, (double) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 610.0
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[16][1];
      long[] longArray1 = new long[11];
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray0, (double) longArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 0.0
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      long[] longArray0 = new long[3];
      long long0 = 547L;
      longArray0[2] = long0;
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, doubleArray0[0]);
      assertArrayEquals(new long[] {0L, 0L, 547L}, longArray0);
      assertArrayEquals(new double[] {1.0E-5, 1.0E-5, 1.0E-5}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[5][1];
      double[] doubleArray0 = new double[7];
      double double0 = 2937.2271005566563;
      doubleArray0[6] = double0;
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0[2], doubleArray0[6]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 2937.2271005566563
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      double[] doubleArray0 = new double[7];
      long[] longArray0 = new long[1];
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad significance level: 0.0
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[2];
      long long0 = 5L;
      longArray0[0] = long0;
      longArray0[1] = long0;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) longArray0[0];
      double double0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
      assertArrayEquals(new double[] {5.0, 5.0}, doubleArray0, 0.01);
      assertArrayEquals(new long[] {5L, 5L}, longArray0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test19()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      double double0 = 3314.663690605996;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = double0;
      doubleArray0[6] = double0;
      doubleArray0[7] = double0;
      doubleArray0[8] = double0;
      doubleArray0[9] = doubleArray0[4];
      long[] longArray0 = new long[10];
      long long0 = (-1L);
      longArray0[8] = long0;
      try {
        double double1 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative and expected counts must be postive
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      long[] longArray0 = new long[3];
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, doubleArray0[0]);
      assertArrayEquals(new double[] {1.0E-5, 1.0E-5, 1.0E-5}, doubleArray0, 0.01);
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray0);
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      double double0 = 612.9557621304992;
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0);
      assertEquals(612.9557621304992, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquaredDistributionImpl0);
      
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) chiSquaredDistributionImpl0);
      assertEquals(612.9557621304992, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquareTestImpl0);
      
      double[] doubleArray0 = new double[3];
      long[] longArray0 = new long[4];
      try {
        double double1 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed, expected array lengths incorrect
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      double double0 = 2304.638253826818;
      double[] doubleArray0 = new double[1];
      long[] longArray0 = new long[4];
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0);
      assertEquals(2304.638253826818, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquaredDistributionImpl0);
      
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl((ChiSquaredDistribution) chiSquaredDistributionImpl0);
      assertEquals(2304.638253826818, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertNotNull(chiSquareTestImpl0);
      
      try {
        double double1 = chiSquareTestImpl0.chiSquare(doubleArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed, expected array lengths incorrect
         //
      }
  }

  @Test
  public void test23()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = double0;
      long[] longArray0 = new long[3];
      try {
        boolean boolean0 = chiSquareTestImpl0.chiSquareTest(doubleArray0, longArray0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts must be non-negative and expected counts must be postive
         //
      }
  }

  @Test
  public void test24()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[][] longArray0 = new long[4][7];
      boolean boolean0 = chiSquareTestImpl0.chiSquareTest(longArray0, double0);
      assertFalse(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      DistributionFactoryImpl distributionFactoryImpl0 = (DistributionFactoryImpl)chiSquareTestImpl0.getDistributionFactory();
      assertNotNull(distributionFactoryImpl0);
  }

  @Test
  public void test26()  throws Throwable  {
      ChiSquareTestImpl chiSquareTestImpl0 = new ChiSquareTestImpl();
      assertNotNull(chiSquareTestImpl0);
      
      long[] longArray0 = new long[23];
      try {
        double double0 = chiSquareTestImpl0.chiSquareTestDataSetsComparison(longArray0, longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // observed counts cannot all be 0
         //
      }
  }
}
