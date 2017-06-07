/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:26:50 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Cbrt;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentOptimizerEvoSuite_branch_Test extends BrentOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 0.8868709204906693;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNotNull(brentOptimizer0);
      
      double double1 = brentOptimizer0.getMin();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
      
      int int0 = 1356;
      Log log0 = new Log();
      assertNotNull(log0);
      
      UnivariateFunction univariateFunction0 = log0.derivative();
      assertNotNull(univariateFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double2 = (-2339.610995965837);
      assertFalse(double2 == double1);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, double1, double2, double1);
      assertEquals((-0.3603158025895261), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-2.775343165115647), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(1356, brentOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals((-2339.610995965837), brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(9, brentOptimizer0.getEvaluations());
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 0.7937005259840998;
      double double1 = 0.125;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double1);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNotNull(brentOptimizer0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      int int0 = 17;
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.7937005259840998, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) polynomialFunction0, goalType0, doubleArray0[5], doubleArray0[1], doubleArray0[6]);
      assertEquals(3, brentOptimizer0.getEvaluations());
      assertEquals(17, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(0.7937005259840998, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(0.09921256574801247, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.125, univariatePointValuePair0.getPoint(), 0.01D);
      assertNotNull(univariatePointValuePair0);
      assertArrayEquals(new double[] {0.0, 0.7937005259840998, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 5.430534345126379;
      double double1 = 3751.844551140478;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double1, double0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNotNull(brentOptimizer0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = brentOptimizer0.getConvergenceChecker();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNull(convergenceChecker0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      BrentOptimizer brentOptimizer1 = new BrentOptimizer(double0, double0, convergenceChecker0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer1.getStartValue(), 0.01D);
      assertNull(brentOptimizer1.getGoalType());
      assertEquals(0, brentOptimizer1.getEvaluations());
      assertEquals(0, brentOptimizer1.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer1.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer1.getMin(), 0.01D);
      assertNotNull(brentOptimizer1);
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertFalse(double1 == double0);
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertFalse(double0 == double1);
      
      int int0 = 986;
      Cbrt cbrt0 = new Cbrt();
      assertNotNull(cbrt0);
      
      UnivariateFunction univariateFunction0 = cbrt0.derivative();
      assertNotNull(univariateFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double2 = (-936.058660864267);
      double double3 = 0.10099709941012236;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer1.optimize(int0, univariateFunction0, goalType0, double1, double2, double3);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(11, brentOptimizer1.getEvaluations());
      assertEquals(986, brentOptimizer1.getMaxEvaluations());
      assertEquals((-936.058660864267), brentOptimizer1.getMax(), 0.01D);
      assertEquals(3751.844551140478, brentOptimizer1.getMin(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer1.getGoalType());
      assertEquals(0.10099709941012236, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals((-5.878005462821069), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0.1023431441406435, univariatePointValuePair0.getValue(), 0.01D);
      assertNotNull(univariatePointValuePair0);
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 5.430534345126379;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = 986;
      Cbrt cbrt0 = new Cbrt();
      assertNotNull(cbrt0);
      
      UnivariateFunction univariateFunction0 = cbrt0.derivative();
      assertNotNull(univariateFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, double0, (double) int0, double0);
      assertEquals(0.021730966757529956, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(60.075797779217936, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(4, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(5.430534345126379, brentOptimizer0.getMin(), 0.01D);
      assertEquals(986.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(5.430534345126379, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(986, brentOptimizer0.getMaxEvaluations());
      assertNotNull(univariatePointValuePair0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = (-1552.9297435431986);
      double double1 = 0.7937005259840998;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double1, double1);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertNotNull(brentOptimizer0);
      assertFalse(double1 == double0);
      
      int int0 = 17;
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(double0, (double) int0, double0);
      assertNotNull(harmonicOscillator0);
      assertFalse(double0 == double1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) harmonicOscillator0, goalType0, (double) int0, double0, (double) int0);
      assertEquals((-1166.3461018591197), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-212.0496627090896), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(4, brentOptimizer0.getEvaluations());
      assertEquals(17.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals((-1552.9297435431986), brentOptimizer0.getMax(), 0.01D);
      assertEquals(17.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(17, brentOptimizer0.getMaxEvaluations());
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = (-1552.9297435431986);
      double double1 = 0.7937005259840998;
      double double2 = 0.125;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double1, double2);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      
      int int0 = 17;
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(double0, (double) int0, double0);
      assertNotNull(harmonicOscillator0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) harmonicOscillator0, goalType0, double1, double0, double2);
      assertEquals((-1552.9297435431986), brentOptimizer0.getMax(), 0.01D);
      assertEquals(3, brentOptimizer0.getEvaluations());
      assertEquals(0.7937005259840998, brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(17, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.125, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals((-593.0891256442504), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals((-820.2675162309351), univariatePointValuePair0.getValue(), 0.01D);
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = (-1552.9297435431986);
      double double1 = 0.7937005259840998;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double1, double1);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNotNull(brentOptimizer0);
      assertFalse(double1 == double0);
      
      int int0 = 17;
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(double0, (double) int0, double0);
      assertNotNull(harmonicOscillator0);
      assertFalse(double0 == double1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) harmonicOscillator0, goalType0, double0, double1);
      assertEquals(17, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.7937005259840998, brentOptimizer0.getMax(), 0.01D);
      assertEquals((-1552.9297435431986), brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals((-776.0680215086072), brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals((-1324.0675141405086), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-776.0680215086072), univariatePointValuePair0.getPoint(), 0.01D);
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 0.8868709204906693;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      double double1 = brentOptimizer0.getMin();
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
      
      int int0 = 1356;
      Log log0 = new Log();
      assertNotNull(log0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) log0, goalType0, double1, (double) int0, double1);
      assertEquals(517.9459112551425, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(6.249870818381134, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(1356, brentOptimizer0.getMaxEvaluations());
      assertEquals(1356.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(2, brentOptimizer0.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertNotNull(univariatePointValuePair0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = 0.8868709204906693;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertNotNull(brentOptimizer0);
      
      int int0 = 1356;
      double double1 = (-2339.610995965837);
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = brentOptimizer0.getConvergenceChecker();
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertNull(convergenceChecker0);
      assertFalse(double0 == double1);
      
      BrentOptimizer brentOptimizer1 = null;
      try {
        brentOptimizer1 = new BrentOptimizer((double) int0, double1, convergenceChecker0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,339.611 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      double double0 = (-936.058660864267);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -936.059 is smaller than the minimum (0)
         //
      }
  }
}
