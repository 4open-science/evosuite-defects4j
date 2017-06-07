/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:49:23 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractContinuousDistributionEvoSuite_branch_Test extends AbstractContinuousDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 2817.4676872796013;
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(double0, double0);
      assertNotNull(betaDistributionImpl0);
      assertEquals(2817.4676872796013, betaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(2817.4676872796013, betaDistributionImpl0.getBeta(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = betaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,817.468 out of [0, 1] range
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-3031.3435347789323);
      double double1 = 1674.9900317081058;
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(double1, double1);
      assertFalse(double1 == double0);
      assertNotNull(normalDistributionImpl0);
      assertEquals(1674.9900317081058, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(1674.9900317081058, normalDistributionImpl0.getMean(), 0.01D);
      
      // Undeclared exception!
      try {
        double double2 = normalDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,031.344 out of [0, 1] range
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 0.00303623;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double0, double0);
      assertNotNull(gammaDistributionImpl0);
      assertEquals(0.00303623, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(0.00303623, gammaDistributionImpl0.getBeta(), 0.01D);
      
      try {
        double double1 = gammaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=0, final a value=0, final b value=0, f(a)=0.103, f(b)=0.981
         //
      }
  }
}
