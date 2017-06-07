/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:55:03 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BisectionSolverEvoSuite_branch_Test extends BisectionSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 0.0;
      double double1 = (-2623.0);
      doubleArray0[0] = double1;
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertNotNull(bisectionSolver0);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {(-2623.0), 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      BisectionSolver bisectionSolver1 = new BisectionSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(bisectionSolver1);
      assertArrayEquals(new double[] {(-2623.0), 0.0}, doubleArray0, 0.01);
      assertNotSame(bisectionSolver1, bisectionSolver0);
      assertEquals(100, bisectionSolver1.getMaximalIterationCount());
      assertEquals(1.0E-6, bisectionSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bisectionSolver1.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver1.getIterationCount());
      assertEquals(1.0E-14, bisectionSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertFalse(bisectionSolver1.equals((Object)bisectionSolver0));
      
      int int0 = bisectionSolver0.getMaximalIterationCount();
      assertEquals(100, int0);
      assertNotSame(bisectionSolver0, bisectionSolver1);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertFalse(bisectionSolver0.equals((Object)bisectionSolver1));
      
      double double2 = bisectionSolver1.solve(doubleArray0[1], (double) int0, double0);
      assertEquals(99.99999962747097, double2, 0.01D);
      assertArrayEquals(new double[] {(-2623.0), 0.0}, doubleArray0, 0.01);
      assertNotSame(bisectionSolver1, bisectionSolver0);
      assertNotSame(bisectionSolver0, bisectionSolver1);
      assertEquals(100, bisectionSolver1.getMaximalIterationCount());
      assertEquals(26, bisectionSolver1.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bisectionSolver1.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(bisectionSolver1.equals((Object)bisectionSolver0));
      assertFalse(bisectionSolver0.equals((Object)bisectionSolver1));
  }

  @Test
  public void test1()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertNotNull(bisectionSolver0);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      
      double[] doubleArray0 = new double[10];
      double double0 = (-428.6065843267948);
      int int0 = 0;
      bisectionSolver0.setMaximalIterationCount(int0);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      try {
        double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, (double) int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertNotNull(bisectionSolver0);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      
      // Undeclared exception!
      try {
        double double0 = bisectionSolver0.solve(doubleArray0[0], doubleArray0[1]);
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
      assertNotNull(bisectionSolver0);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double0 = (-437.2);
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[8], doubleArray0[9]);
      assertEquals((-437.19999959282575), double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(28, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }
}