/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:02:52 GMT 2014
 */

package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.random.Well44497a;
import org.apache.commons.math.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultiStartUnivariateRealOptimizerEvoSuite_branch_Test extends MultiStartUnivariateRealOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 190;
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      PolynomialFunctionNewtonForm polynomialFunctionNewtonForm0 = null;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair univariateRealPointValuePair0 = multiStartUnivariateRealOptimizer0.optimize(polynomialFunctionNewtonForm0, goalType0, (double) int0, (double) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunction> baseUnivariateRealOptimizer0 = null;
      int int0 = 8;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunction> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunction>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well44497a0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair[] univariateRealPointValuePairArray0 = multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 204;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-1893);
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well44497a0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = multiStartUnivariateRealOptimizer0.getConvergenceChecker();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = (-1);
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well44497a0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setMaxEvaluations(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 54;
      Well44497b well44497b0 = new Well44497b((long) int0);
      assertNotNull(well44497b0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well44497b0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = null;
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setConvergenceChecker(convergenceChecker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 204;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      int int1 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test7()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 0;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well44497a0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertNotNull(multiStartUnivariateRealOptimizer0);
      
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = null;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair univariateRealPointValuePair0 = multiStartUnivariateRealOptimizer0.optimize(polynomialFunctionLagrangeForm0, goalType0, (double) int0, (double) int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }
}
