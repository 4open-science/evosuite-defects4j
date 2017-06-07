/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:13:56 GMT 2014
 */

package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BOBYQAOptimizerEvoSuite_branch_Test extends BOBYQAOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 227;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[1][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (227)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      
      double[][] doubleArray0 = new double[1][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (0)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      
      double[][] doubleArray0 = new double[1][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      //  // Unstable assertion: assertNotNull(bOBYQAOptimizer0);
      //  // Unstable assertion: assertNull(bOBYQAOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[3][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      //  // Unstable assertion: assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray0[0];
      //  // Unstable assertion: assertNotNull(doubleArray0[1]);
      
      doubleArray0[2] = doubleArray1;
      //  // Unstable assertion: assertNotNull(doubleArray0[2]);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      int int2 = 1493;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int2, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[2]);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // trust region step has failed to reduce Q
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[3][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      double[] doubleArray1 = new double[3];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray1[1] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray1;
      assertNotNull(doubleArray0[1]);
      
      doubleArray0[2] = doubleArray0[0];
      assertNotNull(doubleArray0[2]);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[0]);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (8) exceeded: evaluations
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 7;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[3][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray1;
      assertNotNull(doubleArray0[1]);
      
      doubleArray0[2] = doubleArray0[0];
      assertNotNull(doubleArray0[2]);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[3];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertNotSame(doubleArray2, doubleArray1);
      
      doubleArray2[0] = (double) int0;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (7) exceeded: evaluations
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 7;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      //  // Unstable assertion: assertNotNull(bOBYQAOptimizer0);
      //  // Unstable assertion: assertNull(bOBYQAOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[3][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      //  // Unstable assertion: assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray1;
      //  // Unstable assertion: assertNotNull(doubleArray0[1]);
      
      doubleArray0[2] = doubleArray0[0];
      //  // Unstable assertion: assertNotNull(doubleArray0[2]);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      int int2 = 1493;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int2, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[2]);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // trust region step has failed to reduce Q
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 65;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertNotNull(bOBYQAOptimizer0);
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0, int0, int0);
      assertNotNull(bOBYQAOptimizer0);
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      
      int int1 = 0;
      double[][] doubleArray0 = new double[3][1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      doubleArray0[1] = doubleArray1;
      assertNotNull(doubleArray0[1]);
      
      doubleArray0[2] = doubleArray1;
      assertNotNull(doubleArray0[2]);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[2], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0[2], doubleArray0[1], doubleArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
      }
  }
}