/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:34:20 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PoissonDistributionImplEvoSuite_branch_Test extends PoissonDistributionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 2106.3722;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(2106.3722, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = 0;
      int int1 = Integer.MAX_VALUE;
      double double1 = poissonDistributionImpl0.cumulativeProbability(int0, int1);
      assertEquals(1.0, double1, 0.01D);
      assertEquals(2106.3722, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(int0 == int1);
      assertFalse(double1 == double0);
      assertFalse(int1 == int0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 711.07386944;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = 0;
      double double1 = poissonDistributionImpl0.cumulativeProbability(int0, int0);
      assertEquals(1.5294746266488E-309, double1, 0.01D);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 711.07386944;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = 0;
      double double1 = poissonDistributionImpl0.probability((double) int0);
      assertEquals(1.52947462664874E-309, double1, 0.01D);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.875;
      int int0 = 106;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0, int0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(0.875, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int1 = poissonDistributionImpl0.getDomainUpperBound(double0);
      assertEquals(Integer.MAX_VALUE, int1);
      assertEquals(0.875, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      double double1 = poissonDistributionImpl0.probability(int1);
      assertEquals(0.0, double1, 0.01D);
      assertEquals(0.875, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(double0 == double1);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 711.07386944;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(716, int0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      double double1 = poissonDistributionImpl0.probability(int0);
      assertEquals(0.014655798832342377, double1, 0.01D);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 1.997844754509471E-9;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0, double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(1.997844754509471E-9, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = (-1680);
      double double1 = poissonDistributionImpl0.probability(int0);
      assertEquals(0.0, double1, 0.01D);
      assertEquals(1.997844754509471E-9, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 1.997844754509471E-9;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0, double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(1.997844754509471E-9, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0, int0);
      assertEquals(1.997844754509471E-9, poissonDistributionImpl0.getMean(), 0.01D);
      
      PoissonDistributionImpl poissonDistributionImpl1 = null;
      try {
        poissonDistributionImpl1 = new PoissonDistributionImpl((double) int0, (double) int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0): mean (0)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 711.07386944;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      double double1 = 1.0E-12;
      int int0 = poissonDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(531, int0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = 711.07386944;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      
      double double1 = poissonDistributionImpl0.getMean();
      assertEquals(711.07386944, double1, 0.01D);
      assertEquals(711.07386944, poissonDistributionImpl0.getMean(), 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test
  public void test9()  throws Throwable  {
      double double0 = 2106.3722;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(double0);
      assertNotNull(poissonDistributionImpl0);
      assertEquals(2106.3722, poissonDistributionImpl0.getMean(), 0.01D);
      
      int int0 = 0;
      double double1 = poissonDistributionImpl0.normalApproximateProbability(int0);
      assertEquals(0.0, double1, 0.01D);
      assertEquals(2106.3722, poissonDistributionImpl0.getMean(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }
}
