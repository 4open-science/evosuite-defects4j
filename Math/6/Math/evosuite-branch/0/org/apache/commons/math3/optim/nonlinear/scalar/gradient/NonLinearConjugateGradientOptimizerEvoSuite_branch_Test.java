/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:14:33 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NonLinearConjugateGradientOptimizerEvoSuite_branch_Test extends NonLinearConjugateGradientOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      double double0 = 437.0;
      int int0 = 609;
      SimpleValueChecker simpleValueChecker0 = new SimpleValueChecker(double0, double0, int0);
      assertEquals(437.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(437.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simpleValueChecker0);
      
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simpleValueChecker0);
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(437.0, simpleValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(437.0, simpleValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[24];
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[12] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[12]);
      
      // Undeclared exception!
      try {
        nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      double double0 = 1.0;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertEquals(1.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      UnivariateSolver univariateSolver0 = null;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0, univariateSolver0);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(1.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[13];
      NonLinearConjugateGradientOptimizer.BracketingStep nonLinearConjugateGradientOptimizer_BracketingStep0 = new NonLinearConjugateGradientOptimizer.BracketingStep(double0);
      assertNotNull(nonLinearConjugateGradientOptimizer_BracketingStep0);
      
      optimizationDataArray0[6] = (OptimizationData) nonLinearConjugateGradientOptimizer_BracketingStep0;
      assertNotNull(optimizationDataArray0[6]);
      
      nonLinearConjugateGradientOptimizer0.parseOptimizationData(optimizationDataArray0);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(1.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(1.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.IdentityPreconditioner nonLinearConjugateGradientOptimizer_IdentityPreconditioner0 = new NonLinearConjugateGradientOptimizer.IdentityPreconditioner();
      assertNotNull(nonLinearConjugateGradientOptimizer_IdentityPreconditioner0);
      
      double[] doubleArray0 = new double[11];
      double[] doubleArray1 = nonLinearConjugateGradientOptimizer_IdentityPreconditioner0.precondition(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test3()  throws Throwable  {
      NonLinearConjugateGradientOptimizer.Formula nonLinearConjugateGradientOptimizer_Formula0 = NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES;
      double double0 = 1.0;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(double0, double0);
      assertEquals(1.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      UnivariateSolver univariateSolver0 = null;
      NonLinearConjugateGradientOptimizer nonLinearConjugateGradientOptimizer0 = new NonLinearConjugateGradientOptimizer(nonLinearConjugateGradientOptimizer_Formula0, (ConvergenceChecker<PointValuePair>) simplePointChecker0, univariateSolver0);
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getMaxEvaluations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getEvaluations());
      assertNull(nonLinearConjugateGradientOptimizer0.getGoalType());
      assertEquals(2147483647, nonLinearConjugateGradientOptimizer0.getMaxIterations());
      assertEquals(0, nonLinearConjugateGradientOptimizer0.getIterations());
      assertEquals(1.0, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.0, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(nonLinearConjugateGradientOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[13];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = nonLinearConjugateGradientOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
