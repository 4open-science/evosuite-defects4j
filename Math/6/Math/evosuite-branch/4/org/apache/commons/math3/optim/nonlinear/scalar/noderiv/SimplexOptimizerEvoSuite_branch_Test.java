/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:11:02 GMT 2014
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
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
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
      double double0 = 3324.45477;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[13];
      int int0 = 1;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(int0, int0);
      assertEquals(1, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      
      optimizationDataArray0[2] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(1, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[2]);
      
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[6] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[6]);
      
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
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNotNull(simplexOptimizer0);
      
      double double0 = 6.465622;
      int int0 = 1591;
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = (double) int0;
      doubleArray0[4] = (double) int0;
      doubleArray0[5] = double0;
      doubleArray0[6] = (double) int0;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0);
      assertArrayEquals(new double[] {1591.0, 1591.0, 1591.0, 1591.0, 1591.0, 6.465622, 1591.0}, doubleArray0, 0.01);
      assertEquals(7, nelderMeadSimplex0.getDimension());
      assertNotNull(nelderMeadSimplex0);
      
      optimizationDataArray0[0] = (OptimizationData) nelderMeadSimplex0;
      assertEquals(7, nelderMeadSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[0]);
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertArrayEquals(new double[] {1591.0, 1591.0, 1591.0, 1591.0, 1591.0, 6.465622, 1591.0}, doubleArray0, 0.01);
      assertNotNull(initialGuess0);
      
      optimizationDataArray0[4] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[4]);
      
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
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNotNull(simplexOptimizer0);
      
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
