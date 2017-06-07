/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:51:38 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LevenbergMarquardtOptimizerEvoSuite_branch_Test extends LevenbergMarquardtOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-0.262);
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0);
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = levenbergMarquardtOptimizer0.getConvergenceChecker();
      assertNull(convergenceChecker0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer1 = new LevenbergMarquardtOptimizer(convergenceChecker0);
      assertNotNull(levenbergMarquardtOptimizer1);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer1.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer1.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer1.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer1.getChiSquare(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer1.getMaxIterations());
      assertNotSame(levenbergMarquardtOptimizer0, levenbergMarquardtOptimizer1);
      assertNotSame(levenbergMarquardtOptimizer1, levenbergMarquardtOptimizer0);
      assertFalse(levenbergMarquardtOptimizer0.equals((Object)levenbergMarquardtOptimizer1));
      assertFalse(levenbergMarquardtOptimizer1.equals((Object)levenbergMarquardtOptimizer0));
  }
}
