/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 02:33:39 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
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
      double double0 = (-38.466699585285106);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[3];
      int int0 = 2053;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(int0, (double) int0, double0, double0);
      assertEquals(2053, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      
      optimizationDataArray0[0] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(2053, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[0]);
      
      double[] doubleArray0 = new double[3];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertNotNull(simpleBounds0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[1]);
      
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
      double double0 = 0.0;
      double double1 = 1.4001142488240446;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double1, double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = double1;
      doubleArray0[1] = doubleArray0[0];
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(doubleArray0, double0, double0);
      assertFalse(double0 == double1);
      assertEquals(2, multiDirectionalSimplex0.getDimension());
      assertNotNull(multiDirectionalSimplex0);
      assertArrayEquals(new double[] {1.4001142488240446, 1.4001142488240446}, doubleArray0, 0.01);
      
      optimizationDataArray0[0] = (OptimizationData) multiDirectionalSimplex0;
      assertEquals(2, multiDirectionalSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[0]);
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {1.4001142488240446, 1.4001142488240446}, doubleArray0, 0.01);
      
      optimizationDataArray0[2] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[2]);
      
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
      double double0 = (-1.0);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      int int0 = 1030;
      int int1 = simplexOptimizer0.getMaxIterations();
      assertFalse(int1 == int0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(Integer.MAX_VALUE, int1);
      
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(int0, (double) int0, (double) int0, (double) int1, (double) int0, double0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(1030, nelderMeadSimplex0.getDimension());
      assertNotNull(nelderMeadSimplex0);
      
      optimizationDataArray0[1] = (OptimizationData) nelderMeadSimplex0;
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(1030, nelderMeadSimplex0.getDimension());
      assertNotNull(optimizationDataArray0[1]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = (-1.0);
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertNotNull(simplexOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
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
