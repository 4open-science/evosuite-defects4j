/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 04:35:43 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PowellOptimizerEvoSuite_branch_Test extends PowellOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 2.0;
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0);
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[28];
      double[] doubleArray0 = new double[8];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[26] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[26]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 6.426;
      int int0 = 4729;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0, int0);
      assertEquals(6.426, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(6.426, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      PowellOptimizer powellOptimizer0 = new PowellOptimizer((double) int0, double0, double0, double0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(6.426, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(6.426, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[39];
      double[] doubleArray0 = new double[2];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(initialGuess0);
      
      optimizationDataArray0[6] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[6]);
      
      try {
        PointValuePair pointValuePair0 = powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 2809.1882426;
      double double1 = (-1917.6725900133263);
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,917.673 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = (-403.7211293905183);
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -403.721 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 1031.2393530005675;
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0);
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertNotNull(powellOptimizer0);
  }
}
