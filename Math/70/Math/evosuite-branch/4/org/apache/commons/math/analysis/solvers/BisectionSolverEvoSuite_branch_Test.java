/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:55:19 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BisectionSolverEvoSuite_branch_Test extends BisectionSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = (-854.08706);
      doubleArray0[0] = double0;
      double double1 = (-3759.41889);
      doubleArray0[1] = double1;
      double double2 = 1.0E-14;
      doubleArray0[2] = double2;
      double double3 = (-1196.0823);
      doubleArray0[4] = double3;
      double double4 = 2655.0;
      doubleArray0[5] = double4;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertEquals(5, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {(-854.08706), (-3759.41889), 1.0E-14, 0.0, (-1196.0823), 2655.0}, doubleArray0, 0.01);
      
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertEquals(5, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(bisectionSolver0);
      assertArrayEquals(new double[] {(-854.08706), (-3759.41889), 1.0E-14, 0.0, (-1196.0823), 2655.0}, doubleArray0, 0.01);
      
      double double5 = bisectionSolver0.solve(double0, double4, double3);
      assertFalse(double5 == double4);
      assertFalse(double5 == double0);
      assertFalse(double5 == double2);
      assertFalse(double5 == double3);
      assertFalse(double5 == double1);
      assertFalse(double0 == double4);
      assertFalse(double0 == double2);
      assertFalse(double0 == double5);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double4);
      assertFalse(double3 == double1);
      assertFalse(double3 == double5);
      assertFalse(double4 == double5);
      assertFalse(double4 == double3);
      assertFalse(double4 == double2);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertEquals(5, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(31, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-3.4816790356105174E-7), double5, 0.01D);
      assertArrayEquals(new double[] {(-854.08706), (-3759.41889), 1.0E-14, 0.0, (-1196.0823), 2655.0}, doubleArray0, 0.01);
  }

  @Test
  public void test1()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertNotNull(bisectionSolver0);
      
      int int0 = bisectionSolver0.getIterationCount();
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, int0);
      
      double[] doubleArray0 = new double[7];
      double double0 = (-1.0);
      doubleArray0[0] = double0;
      bisectionSolver0.setMaximalIterationCount(int0);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getMaximalIterationCount());
      
      doubleArray0[4] = doubleArray0[0];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(4, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, 0.0, (-1.0), 0.0, 0.0}, doubleArray0, 0.01);
      
      try {
        double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[5]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertNotNull(bisectionSolver0);
      
      double double0 = 0.0;
      // Undeclared exception!
      try {
        double double1 = bisectionSolver0.solve(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(bisectionSolver0);
      
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try {
        double double0 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[1], doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }
}
