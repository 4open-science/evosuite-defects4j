/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:40:26 GMT 2014
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
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
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
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = null;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(convergenceChecker0);
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 0.0;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0);
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
  }
}