/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:15:53 GMT 2014
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
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PowellOptimizerEvoSuite_branch_Test extends PowellOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 3189.7158803656057;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertEquals(3189.7158803656057, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3189.7158803656057, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(3189.7158803656057, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3189.7158803656057, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[20];
      double[] doubleArray0 = new double[1];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[17] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[17]);
      
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
      double double0 = 2354.3621174727;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0);
      assertEquals(2354.3621174727, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2354.3621174727, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleValueChecker0);
      
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(2354.3621174727, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2354.3621174727, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(powellOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[12];
      double[] doubleArray0 = new double[11];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(initialGuess0);
      
      optimizationDataArray0[11] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[11]);
      
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
      double double0 = 1.0;
      double double1 = 0.0;
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.0;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertEquals(0.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(double0, double0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 3397.601243412148;
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(double0, double0, double0, double0);
      assertNull(powellOptimizer0.getGoalType());
      assertEquals(0, powellOptimizer0.getIterations());
      assertEquals(2147483647, powellOptimizer0.getMaxIterations());
      assertEquals(0, powellOptimizer0.getEvaluations());
      assertEquals(0, powellOptimizer0.getMaxEvaluations());
      assertNotNull(powellOptimizer0);
  }
}
