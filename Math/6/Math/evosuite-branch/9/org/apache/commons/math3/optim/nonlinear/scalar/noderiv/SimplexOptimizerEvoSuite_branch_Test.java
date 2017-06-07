/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 06:07:28 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SimplexOptimizerEvoSuite_branch_Test extends SimplexOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 6.6323345;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNotNull(simplexOptimizer0);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      int int0 = 429;
      int int1 = simplexOptimizer0.getMaxIterations();
      assertFalse(int1 == int0);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(Integer.MAX_VALUE, int1);
      
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(int0, double0, (double) int0, double0, (double) int1, double0);
      assertNotNull(nelderMeadSimplex0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(429, nelderMeadSimplex0.getDimension());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      
      optimizationDataArray0[0] = (OptimizationData) nelderMeadSimplex0;
      assertNotNull(optimizationDataArray0[0]);
      assertEquals(429, nelderMeadSimplex0.getDimension());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      assertFalse(int0 == int1);
      
      optimizationDataArray0[2] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[2]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 3975.204638418636;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0);
      assertNotNull(simpleValueChecker0);
      assertEquals(3975.204638418636, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3975.204638418636, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNotNull(simplexOptimizer0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(3975.204638418636, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(3975.204638418636, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[15];
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = double0;
      doubleArray0[3] = double0;
      doubleArray0[4] = double0;
      doubleArray0[5] = doubleArray0[2];
      doubleArray0[6] = double0;
      doubleArray0[7] = doubleArray0[1];
      doubleArray0[8] = double0;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, double0, doubleArray0[1], double0, doubleArray0[6]);
      assertNotNull(nelderMeadSimplex0);
      assertArrayEquals(new double[] {3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636}, doubleArray0, 0.01);
      assertEquals(9, nelderMeadSimplex0.getDimension());
      
      optimizationDataArray0[14] = (OptimizationData) nelderMeadSimplex0;
      assertNotNull(optimizationDataArray0[14]);
      assertEquals(9, nelderMeadSimplex0.getDimension());
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636, 3975.204638418636}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[1]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-959.873434551478);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertNotNull(simplePointChecker0);
      assertEquals((-959.873434551478), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-959.873434551478), simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals((-959.873434551478), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-959.873434551478), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
      }
  }
}
