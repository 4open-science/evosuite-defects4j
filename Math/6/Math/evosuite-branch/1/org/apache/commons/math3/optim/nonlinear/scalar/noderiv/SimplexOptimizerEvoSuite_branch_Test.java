/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:36:18 GMT 2014
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
      double double0 = 0.0;
      int int0 = 122;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0, int0);
      assertNotNull(simpleValueChecker0);
      assertEquals(0.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(0.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(0.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      double[] doubleArray0 = new double[1];
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(int0);
      assertNotNull(multiDirectionalSimplex0);
      assertEquals(122, multiDirectionalSimplex0.getDimension());
      
      optimizationDataArray0[3] = (OptimizationData) multiDirectionalSimplex0;
      assertNotNull(optimizationDataArray0[3]);
      assertEquals(122, multiDirectionalSimplex0.getDimension());
      
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      assertNotNull(simpleBounds0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[4] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[4]);
      
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
      double double0 = (-1164.7787557853605);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertNotNull(simplePointChecker0);
      assertEquals((-1164.7787557853605), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-1164.7787557853605), simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals((-1164.7787557853605), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-1164.7787557853605), simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      int int0 = 1669;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = double0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = double0;
      NelderMeadSimplex nelderMeadSimplex0 = new NelderMeadSimplex(doubleArray0, (double) int0, doubleArray0[1], doubleArray0[3], doubleArray0[1]);
      assertNotNull(nelderMeadSimplex0);
      assertArrayEquals(new double[] {1669.0, (-1164.7787557853605), 1669.0, (-1164.7787557853605)}, doubleArray0, 0.01);
      assertEquals(4, nelderMeadSimplex0.getDimension());
      
      optimizationDataArray0[3] = (OptimizationData) nelderMeadSimplex0;
      assertNotNull(optimizationDataArray0[3]);
      assertEquals(4, nelderMeadSimplex0.getDimension());
      
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {1669.0, (-1164.7787557853605), 1669.0, (-1164.7787557853605)}, doubleArray0, 0.01);
      
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
      double double0 = 0.0;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNotNull(simplexOptimizer0);
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = (-1164.7787557853605);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertNotNull(simplePointChecker0);
      assertEquals((-1164.7787557853605), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals((-1164.7787557853605), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer((ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals((-1164.7787557853605), simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals((-1164.7787557853605), simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      
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