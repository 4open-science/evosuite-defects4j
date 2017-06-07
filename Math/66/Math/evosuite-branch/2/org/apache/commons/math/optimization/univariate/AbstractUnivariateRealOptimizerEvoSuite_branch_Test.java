/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:17:17 GMT 2014
 */

package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.exception.NoDataException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractUnivariateRealOptimizerEvoSuite_branch_Test extends AbstractUnivariateRealOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = (-1195);
      brentOptimizer0.setMaxEvaluations(int0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(-1195, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      try {
        double double0 = brentOptimizer0.computeObjectiveValue(int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of evaluations (-1,195) exceeded
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getMaxEvaluations();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1000, int0);
      
      int int1 = (-3555);
      assertFalse(int1 == int0);
      
      brentOptimizer0.setMaxEvaluations(int1);
      assertFalse(int1 == int0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(-3555, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      
      double[] doubleArray0 = new double[24];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      try {
        double double0 = brentOptimizer0.computeObjectiveValue(polynomialFunction0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of evaluations (-3,555) exceeded
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertNotNull(brentOptimizer0);
      
      double double0 = brentOptimizer0.getFunctionValue();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, double0, 0.01D);
      
      double[] doubleArray0 = new double[55];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      double double1 = brentOptimizer0.computeObjectiveValue(polynomialFunction0, double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertNotNull(brentOptimizer0);
      
      // Undeclared exception!
      try {
        double double0 = brentOptimizer0.getResult();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      //  // Unstable assertion: assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertNull(brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      //  // Unstable assertion: assertNotNull(brentOptimizer0);
      
      int int0 = (-3691);
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-3691.0), 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double0 = Double.NaN;
      double double1 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, doubleArray0[1], double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-3691.0), 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertEquals(4, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(Double.NaN, brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(Double.NaN, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = brentOptimizer0.getFunctionValue();
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertTrue(double2 == double0);
      //  // Unstable assertion: assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(Double.NaN, brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getIterationCount());
      //  // Unstable assertion: assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(Double.NaN, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNotNull(brentOptimizer0);
      
      // Undeclared exception!
      try {
        brentOptimizer0.checkResultComputed();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertNull(brentOptimizer0.getGoalType());
      assertNotNull(brentOptimizer0);
      
      int int0 = (-42);
      brentOptimizer0.setResult(int0, int0, int0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(-42, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertNull(brentOptimizer0.getGoalType());
      
      brentOptimizer0.checkResultComputed();
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(-42, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertNull(brentOptimizer0.getGoalType());
  }

  @Test
  public void test7()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      brentOptimizer0.clearResult();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getEvaluations();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, int0);
  }
}
