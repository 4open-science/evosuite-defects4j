/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:55:11 GMT 2014
 */

package org.apache.commons.math3.optimization.general;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test extends AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = null;
      int int0 = (-15);
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(convergenceChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      gaussNewtonOptimizer0.cols = int0;
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-144.4);
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = levenbergMarquardtOptimizer0.computeSigma(doubleArray0, double0);
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
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = levenbergMarquardtOptimizer0.getWeightSquareRoot();
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
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
      assertEquals(0, int0);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
  }

  @Test
  public void test05()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try {
        double double0 = gaussNewtonOptimizer0.computeCost(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = 5.229110255637691;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        levenbergMarquardtOptimizer0.updateJacobian();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>();
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      double double0 = simplePointChecker0.getRelativeThreshold();
      assertEquals(1.1102230246251565E-14, double0, 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, (ConvergenceChecker<PointVectorValuePair>) simplePointChecker0, double0, double0, double0, double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      levenbergMarquardtOptimizer0.setCost(double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.POSITIVE_INFINITY, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1.232595164407831E-28, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        double[][] doubleArray0 = levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>();
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      double double0 = simplePointChecker0.getRelativeThreshold();
      assertEquals(1.1102230246251565E-14, double0, 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, (ConvergenceChecker<PointVectorValuePair>) simplePointChecker0, double0, double0, double0, double0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      double double1 = levenbergMarquardtOptimizer0.getRMS();
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, double1, 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer();
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        gaussNewtonOptimizer0.setUp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
