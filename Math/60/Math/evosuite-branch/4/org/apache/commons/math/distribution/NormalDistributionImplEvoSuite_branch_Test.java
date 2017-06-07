/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:26:41 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NormalDistributionImplEvoSuite_branch_Test extends NormalDistributionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 192.087544;
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(double0, double0);
      assertEquals(192.087544, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(192.087544, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double1 = normalDistributionImpl0.getInitialDomain(double0);
      assertEquals(192.087544, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(192.087544, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(384.175088, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test1()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = 0.5;
      double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test2()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = normalDistributionImpl0.getStandardDeviation();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, double0, 0.01D);
      
      double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test3()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      long long0 = 0L;
      double double0 = normalDistributionImpl0.inverseCumulativeProbability((double) long0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = normalDistributionImpl0.getSolverAbsoluteAccuracy();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0E-9, double0, 0.01D);
      
      double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals((-5.997807014826545), double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test5()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = (-632.0);
      double double1 = normalDistributionImpl0.cumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test6()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = 915.1262;
      double double1 = normalDistributionImpl0.cumulativeProbability(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test7()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = normalDistributionImpl0.sample();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, double0, 0.01D);
      
      NormalDistributionImpl normalDistributionImpl1 = null;
      try {
        normalDistributionImpl1 = new NormalDistributionImpl(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): standard deviation (0)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = normalDistributionImpl0.getSolverAbsoluteAccuracy();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(1.0E-9, double0, 0.01D);
      
      double double1 = normalDistributionImpl0.density(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.3989422804014327, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test9()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertNotNull(normalDistributionImpl0);
      
      double double0 = normalDistributionImpl0.getMean();
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, double0, 0.01D);
  }
}
