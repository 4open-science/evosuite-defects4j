/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:25:21 GMT 2014
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
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertNotNull(brentSolver0);
      
      double double0 = (-1084.0);
      double double1 = 1643.1208123950319;
      double[] doubleArray0 = new double[10];
      doubleArray0[5] = double1;
      int int0 = 32;
      brentSolver0.setMaximalIterationCount(int0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(32, brentSolver0.getMaximalIterationCount());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1643.1208123950319, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, (double) int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (32) exceeded
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-699.8909773);
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-699.8909773), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-699.8909773), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[2]);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-699.8909773), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = (-1827.065885243911);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      doubleArray0[0] = double0;
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(3, polynomialFunction1.degree());
      assertArrayEquals(new double[] {(-1827.065885243911), 0.0, 0.0, (-1827.065885243911), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      
      double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, double0, doubleArray0[2]);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(28, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(3, polynomialFunction1.degree());
      assertEquals((-0.999999999617793), double1, 0.01D);
      assertArrayEquals(new double[] {(-1827.065885243911), 0.0, 0.0, (-1827.065885243911), 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = 2.2;
      doubleArray0[2] = double0;
      double double1 = 1.0E-14;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 2.2, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 2.2, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      doubleArray0[2] = double1;
      double double2 = (-1236.2057842250995);
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double2, doubleArray0[2]);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double3 == double0);
      assertTrue(double3 == double1);
      assertFalse(double3 == double2);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(2, polynomialFunction0.degree());
      assertEquals(1.0E-14, double3, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 1.0E-14, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[10];
      double double0 = 48.4268;
      double double1 = 1.0E-14;
      doubleArray0[1] = double1;
      doubleArray0[5] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 1.0E-14, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(5, polynomialFunction0.degree());
      assertEquals(4, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 1.0E-14, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      
      PolynomialFunction polynomialFunction2 = polynomialFunction1.multiply(polynomialFunction1);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(5, polynomialFunction0.degree());
      assertEquals(8, polynomialFunction2.degree());
      assertEquals(4, polynomialFunction1.degree());
      assertArrayEquals(new double[] {0.0, 1.0E-14, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction2);
      
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction2, doubleArray0[2], doubleArray0[5]);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction2.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction2));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertNotSame(polynomialFunction0, polynomialFunction2);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction1);
      assertNotSame(polynomialFunction2, polynomialFunction0);
      assertNotSame(polynomialFunction1, polynomialFunction2);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertEquals(5, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction2.degree());
      assertEquals(4, polynomialFunction1.degree());
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 1.0E-14, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[10];
      double double0 = 48.4268;
      doubleArray0[1] = double0;
      doubleArray0[5] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 48.4268, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertEquals(4, polynomialFunction1.degree());
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 48.4268, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction1, doubleArray0[2], doubleArray0[5]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 48.427], Values: [48.427, 1,331,676,945.479]
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 2004.7088447449892;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = (-2372.766749322002);
      brentSolver0.setFunctionValueAccuracy(double1);
      assertFalse(double1 == double0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-2372.766749322002), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double2 = 0.0;
      double double3 = brentSolver0.solve(double1, double0, double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-2372.766749322002), brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(31, brentSolver0.getIterationCount());
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1336.4725632856694, double3, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double[] doubleArray0 = new double[10];
      double double0 = 48.4268;
      double double1 = (-1677.00436251329);
      doubleArray0[5] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(5, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double[] doubleArray1 = new double[24];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      
      doubleArray1[7] = doubleArray0[5];
      double double2 = (-624.6);
      double double3 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double1, doubleArray1[7], double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(52, brentSolver0.getIterationCount());
      assertEquals(5, polynomialFunction0.degree());
      assertEquals((-4.3618597904360493E-4), double3, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 48.4268, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      double double0 = (-2815.841083);
      doubleArray0[13] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(13, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-2815.841083)}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(13, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-2815.841083)}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = (-2379.5210531696084);
      double double2 = brentSolver0.solve(doubleArray0[13], doubleArray0[6], double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(13, polynomialFunction0.degree());
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-2815.841083)}, doubleArray0, 0.01);
  }

  @Test
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertNotNull(brentSolver0);
      
      double double0 = 1656.5533770994143;
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(3, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1656.5533770994143, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 1344.613743947317;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1656.5533770994143, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test10()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double0 = 1630.0066062412725;
      double[] doubleArray0 = new double[12];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 1.0E-6;
      double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, double2, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double0 = (-1084.0);
      double double1 = 1643.1208123950319;
      double[] doubleArray0 = new double[10];
      doubleArray0[2] = double0;
      int int0 = 32;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(2, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, (-1084.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, double0, double1, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1,084, 1,643.121], Values: [-1,273,760,704, -2,926,633,068.472]
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[42];
      double double0 = (-3.0515414731478616);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[7]);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals((-3.0515414731478616), double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
