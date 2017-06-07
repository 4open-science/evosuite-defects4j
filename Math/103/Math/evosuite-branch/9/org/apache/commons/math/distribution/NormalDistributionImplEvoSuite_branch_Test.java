/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:33:49 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NormalDistributionImplEvoSuite_branch_Test extends NormalDistributionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      
      double double0 = 3.399464998481189E-5;
      double double1 = normalDistributionImpl0.getDomainLowerBound(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals((-1.7976931348623157E308), double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = normalDistributionImpl0.getInitialDomain(double1);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals((-1.0), double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  @Test
  public void test1()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double0 = 0.0;
      double double1 = normalDistributionImpl0.getDomainUpperBound(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 0.0;
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      
      double double1 = normalDistributionImpl0.cumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(0.5, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = normalDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.0;
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(Double.NEGATIVE_INFINITY, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test4()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double0 = 2636.26146;
      double double1 = normalDistributionImpl0.cumulativeProbability(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = normalDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  @Test
  public void test5()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      //  // Unstable assertion: assertNotNull(normalDistributionImpl0);
      //  // Unstable assertion: assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double0 = 1.7976931348623157E308;
      normalDistributionImpl0.setMean(double0);
      //  // Unstable assertion: assertEquals(1.7976931348623157E308, normalDistributionImpl0.getMean(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double1 = (-0.27402605241065714);
      double double2 = normalDistributionImpl0.getDomainLowerBound(double1);
      //  // Unstable assertion: assertEquals(1.7976931348623157E308, normalDistributionImpl0.getMean(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      //  // Unstable assertion: assertEquals((-1.7976931348623157E308), double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      
      try {
        double double3 = normalDistributionImpl0.cumulativeProbability(double2, double2);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // Maximal number of iterations (10,000) exceeded
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      
      double double0 = 3.399464998481189E-5;
      double double1 = normalDistributionImpl0.getDomainLowerBound(double0);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals((-1.7976931348623157E308), double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = normalDistributionImpl0.cumulativeProbability(double1, double1);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 0.0;
      NormalDistributionImpl normalDistributionImpl0 = null;
      try {
        normalDistributionImpl0 = new NormalDistributionImpl(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Standard deviation must be positive.
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      
      double double0 = 2636.26146;
      double double1 = normalDistributionImpl0.cumulativeProbability(double0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = normalDistributionImpl0.getInitialDomain(double1);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
  }
}
