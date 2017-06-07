/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:52:06 GMT 2014
 */

package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test extends AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      
      try {
        double[] doubleArray0 = levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      
      int int0 = 56;
      gaussNewtonOptimizer0.rows = int0;
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      
      int int0 = (-2127);
      levenbergMarquardtOptimizer0.setMaxEvaluations(int0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(-2127, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      
      // Undeclared exception!
      try {
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      
      // Undeclared exception!
      try {
        VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      
      int int0 = levenbergMarquardtOptimizer0.getIterations();
      assertEquals(0, int0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      
      levenbergMarquardtOptimizer0.setMaxIterations(int0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      
      try {
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test
  public void test06()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      
      SimpleVectorialValueChecker simpleVectorialValueChecker0 = (SimpleVectorialValueChecker)gaussNewtonOptimizer0.getConvergenceChecker();
      assertNotNull(simpleVectorialValueChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      
      int int0 = gaussNewtonOptimizer0.getMaxIterations();
      assertEquals(100, int0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
  }

  @Test
  public void test08()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      
      int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
      assertEquals(0, int0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
  }

  @Test
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      
      double double0 = levenbergMarquardtOptimizer0.getRMS();
      assertEquals(Double.NaN, double0, 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      
      int int0 = gaussNewtonOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      
      int int0 = gaussNewtonOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
  }
}
