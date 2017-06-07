/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:54:42 GMT 2014
 */

package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CMAESOptimizerEvoSuite_branch_Test extends CMAESOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[4];
      double double0 = 49.89781839;
      doubleArray0[0] = double0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {49.89781839, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      
      int int1 = 2591;
      double[][] doubleArray1 = new double[4][7];
      int[] intArray0 = new int[1];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      Well19937a well19937a0 = new Well19937a(intArray0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(well19937a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well19937a0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, int0, int0, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertArrayEquals(new double[] {49.89781839, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[3]);
      //  // Unstable assertion: assertArrayEquals(new double[] {49.89781839, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertEquals(2592, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(2591, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[7];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      int int1 = 859;
      double[][] doubleArray1 = new double[4][7];
      double[] doubleArray2 = new double[4];
      //  // Unstable assertion: assertNotSame(doubleArray2, doubleArray0);
      //  // Unstable assertion: assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      int[] intArray0 = new int[1];
      Well19937a well19937a0 = new Well19937a(intArray0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(well19937a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well19937a0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray2, int0, int0, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertNotSame(doubleArray2, doubleArray0);
      //  // Unstable assertion: assertFalse(doubleArray2.equals((Object)doubleArray0));
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[3]);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
      //  // Unstable assertion: assertArrayEquals(new int[] {0}, intArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertEquals(859, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(860, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNotSame(doubleArray2, doubleArray0);
      //  // Unstable assertion: assertFalse(doubleArray2.equals((Object)doubleArray0));
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 1692;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      int int1 = cMAESOptimizer0.getMaxEvaluations();
      assertEquals(0, int1);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertFalse(int1 == int0);
      
      boolean boolean0 = false;
      double[][] doubleArray0 = new double[4][7];
      double[] doubleArray1 = new double[4];
      int[] intArray0 = new int[1];
      Well19937a well19937a0 = new Well19937a(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(well19937a0);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>();
      assertNotNull(simplePointChecker0);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(int0, doubleArray1, int0, (double) int0, boolean0, intArray0[0], int0, (RandomGenerator) well19937a0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(cMAESOptimizer1);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, cMAESOptimizer1.getEvaluations());
      assertEquals(0, cMAESOptimizer1.getMaxEvaluations());
      assertNull(cMAESOptimizer1.getGoalType());
      assertNotSame(cMAESOptimizer1, cMAESOptimizer0);
      assertFalse(cMAESOptimizer1.equals((Object)cMAESOptimizer0));
      assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well19937a0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, int0, int1, unitSphereRandomVectorGenerator0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new int[] {0}, intArray0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer1.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 4
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-3822);
      double[] doubleArray0 = new double[6];
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int0);
      assertNotNull(well19937c0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, doubleArray0[5], boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
  }

  @Test
  public void test4()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertNotNull(list0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertNotNull(list0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = (-3822);
      double[] doubleArray0 = new double[6];
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int0);
      assertNotNull(well19937c0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, doubleArray0[5], boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-3822);
      int int1 = 10;
      double[] doubleArray0 = new double[7];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertFalse(int0 == int1);
      
      double[][] doubleArray1 = new double[7][5];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray1[0];
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray1[0];
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray1[0];
      assertNotNull(doubleArray1[6]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[6], int1, int2, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[4]);
      assertNotNull(pointValuePair0);
      assertEquals(11, cMAESOptimizer0.getEvaluations());
      assertEquals(10, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
  }
}
