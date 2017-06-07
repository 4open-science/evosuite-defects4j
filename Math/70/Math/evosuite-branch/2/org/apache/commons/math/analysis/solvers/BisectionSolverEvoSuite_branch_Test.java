/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:54:47 GMT 2014
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
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(bisectionSolver0);
      
      double double0 = bisectionSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, double0, 0.01D);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = double0;
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {1.0E-14, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, bisectionSolver0.result, doubleArray0[0], double0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertArrayEquals(new double[] {1.0E-14, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(7.5E-15, double1, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertNotNull(bisectionSolver0);
      
      double double0 = bisectionSolver0.functionValue;
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0.0, double0, 0.01D);
      
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double1 = Double.POSITIVE_INFINITY;
      assertFalse(double1 == double0);
      
      try {
        double double2 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], double1, double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-1297.0);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(bisectionSolver0);
      
      // Undeclared exception!
      try {
        double double1 = bisectionSolver0.solve(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,297, -1,297]
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(bisectionSolver0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test4()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertNotNull(bisectionSolver0);
      
      double double0 = 1.0;
      // Undeclared exception!
      try {
        double double1 = bisectionSolver0.solve(double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, 1]
         //
      }
  }
}
