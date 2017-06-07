/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:38:00 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentSolverEvoSuite_branch_Test extends BrentSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double double0 = brentSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(2, polynomialFunction1.degree());
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.add(polynomialFunction0);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotNull(polynomialFunction2);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertEquals(3, polynomialFunction2.degree());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(2, polynomialFunction1.degree());
      
      double double1 = (-2353.224392939578);
      assertFalse(double1 == double0);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction2, double1, double0);
      assertEquals((-3.278779489835647), double2, 0.01D);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(3, polynomialFunction2.degree());
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(24, brentSolver0.getIterationCount());
      assertEquals(2, polynomialFunction1.degree());
  }

  @Test
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double[] doubleArray0 = new double[6];
      double double0 = 0.6180304861889443;
      int int0 = (-951);
      brentSolver0.setMaximalIterationCount(int0);
      assertEquals(-951, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      
      doubleArray0[2] = double0;
      double double1 = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.6180304861889443, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertArrayEquals(new double[] {0.0, 0.0, 0.6180304861889443, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(1, polynomialFunction1.degree());
      assertEquals(2, polynomialFunction0.degree());
      
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, (double) int0, double1, doubleArray0[2]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-951) exceeded
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-549.0380042989011);
      doubleArray0[6] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-549.0380042989011)}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(6, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-549.0380042989011)}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[4]);
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-549.0380042989011)}, doubleArray0, 0.01);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(6, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-6039.595504885);
      doubleArray0[1] = double0;
      double double1 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-6039.595504885), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-6039.595504885), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, doubleArray0[0]);
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, (-6039.595504885), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = brentSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.add(polynomialFunction0);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotNull(polynomialFunction2);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(3, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction3 = polynomialFunction1.subtract(polynomialFunction2);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction3, polynomialFunction2);
      assertNotSame(polynomialFunction3, polynomialFunction0);
      assertNotSame(polynomialFunction3, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction3);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction3);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction3);
      assertNotNull(polynomialFunction3);
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction3));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction3));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction3));
      assertEquals(3, polynomialFunction3.degree());
      assertEquals(3, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
      
      double double1 = (-1.0);
      assertFalse(double1 == double0);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction3, double1, doubleArray0[1]);
      assertEquals((-1.0), double2, 0.01D);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 1.0E-14, 1.0E-14}, doubleArray0, 0.01);
      assertNotSame(polynomialFunction3, polynomialFunction2);
      assertNotSame(polynomialFunction3, polynomialFunction0);
      assertNotSame(polynomialFunction3, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction3);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction3);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction3);
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction3.equals((Object)polynomialFunction1));
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction3));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction3));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction3));
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, polynomialFunction3.degree());
      assertEquals(3, polynomialFunction2.degree());
      assertEquals(2, polynomialFunction1.degree());
      assertEquals(3, polynomialFunction0.degree());
  }

  @Test
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = brentSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      doubleArray0[1] = doubleArray0[0];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1.0E-14, 1.0E-14, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[3], doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 0], Values: [0, 0]
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0, polynomialFunction0.degree());
      
      double double0 = 2.5714;
      double double1 = 98.90865906018898;
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals(2.5714, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0, polynomialFunction0.degree());
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = (-2.5);
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double1 = (-312.95093013011206);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      brentSolver0.setFunctionValueAccuracy(double0);
      assertFalse(double0 == double1);
      assertEquals((-2.5), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double2, double0);
      assertEquals((-0.8333332306976319), double3, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals((-2.5), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(22, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      double double0 = (-4788.5696911);
      doubleArray0[0] = double0;
      doubleArray0[9] = doubleArray0[0];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {(-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {(-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double1 = (-1697.133617339912);
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[4], double1);
      assertEquals((-1.000000002862514), double2, 0.01D);
      assertArrayEquals(new double[] {(-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-4788.5696911), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(31, brentSolver0.getIterationCount());
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-4842.56748668745);
      doubleArray0[3] = double0;
      double double1 = (-490.924732532);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-4842.56748668745), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-4842.56748668745), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[4], double1);
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-4842.56748668745), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[6];
      double double0 = 0.6180304861889443;
      int int0 = (-951);
      doubleArray0[2] = double0;
      double double1 = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.6180304861889443, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (double) int0, double1, doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-951, 1], Values: [558,947.39, 0.618]
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      
      double[] doubleArray0 = new double[10];
      double double0 = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      double double1 = (-2472.8440668785424);
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double0, doubleArray0[2]);
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double0 = 826.0;
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 826.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(2, polynomialFunction0.degree());
      
      double double1 = 0.0;
      double double2 = 2161.1435522778806;
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, double2, doubleArray0[2]);
      assertEquals(0.0, double3, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 826.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertTrue(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      
      double double0 = 2.5714;
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=2.571, initial=2.571, upper=2.571
         //
      }
  }
}
