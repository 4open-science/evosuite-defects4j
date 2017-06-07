/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:52:24 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentSolverEvoSuite_branch_Test extends BrentSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      double double0 = (-1117.733);
      doubleArray0[1] = double0;
      double double1 = 1028.6803087626893;
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1117.733), 1028.6803087626893, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-1117.733), 1028.6803087626893, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double2 = 1.0;
      double double3 = brentSolver0.solve(double0, double1, double2);
      assertArrayEquals(new double[] {0.0, (-1117.733), 1028.6803087626893, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(6.482390581422609E-10, double3, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 1837.3873283296462;
      doubleArray0[0] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(brentSolver0);
      
      double double1 = (-4968.49184);
      double double2 = Double.POSITIVE_INFINITY;
      try {
        double double3 = brentSolver0.solve(double1, double2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 1839.9422945353883;
      doubleArray0[0] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = (-1661.3);
      double double2 = 0.0;
      double double3 = polynomialFunctionLagrangeForm0.value(double2);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertFalse(double3 == double0);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(0.0, double3, 0.01D);
      
      double double4 = brentSolver0.solve(double1, double3);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double4);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertTrue(double2 == double3);
      assertTrue(double2 == double4);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertTrue(double4 == double3);
      assertTrue(double4 == double2);
      assertTrue(double3 == double4);
      assertFalse(double3 == double1);
      assertTrue(double3 == double2);
      assertFalse(double3 == double0);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, double4, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = (-955.2);
      doubleArray0[9] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-955.2), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(21, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-955.2), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(21, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = 4402.743328660673;
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-955.2), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(21, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-0.009883531562550344), double2, 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(20, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double0 = Double.NaN;
      double double1 = 3588.455155062812;
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3588.455155062812, double2, 0.01D);
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(20, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      
      double double0 = Double.NaN;
      double double1 = brentSolver0.solve(doubleArray0[5], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      double double0 = (-1117.733);
      double double1 = 1028.6803087626893;
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 1028.6803087626893, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 1028.6803087626893, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      // Undeclared exception!
      try {
        double double2 = brentSolver0.solve(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-1117.733,1028.6803087626893]  Values: [1.285158145094991E9,1.0885321978981886E9]
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(20, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double0 = 3588.455155062812;
      double double1 = 3896.6091;
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3588.455155062812, double2, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 1839.9422945353883;
      doubleArray0[0] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = (-1661.3);
      double double2 = brentSolver0.solve(doubleArray0[0], double1, doubleArray0[0]);
      assertArrayEquals(new double[] {1839.9422945353883, 0.0}, doubleArray0, 0.01);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 1837.3873283296462;
      doubleArray0[0] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(brentSolver0);
      
      BrentSolver brentSolver1 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertNotSame(brentSolver1, brentSolver0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertFalse(brentSolver1.equals((Object)brentSolver0));
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-6, brentSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver1.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver1.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver1);
      
      brentSolver1.functionValueAccuracy = double0;
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-6, brentSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver1.getMaximalIterationCount());
      assertEquals(1837.3873283296462, brentSolver1.getFunctionValueAccuracy(), 0.01D);
      
      double double1 = 0.0;
      double double2 = brentSolver0.solve(brentSolver1.functionValueAccuracy, double1, brentSolver1.functionValueAccuracy);
      assertNotSame(brentSolver0, brentSolver1);
      assertNotSame(brentSolver1, brentSolver0);
      assertArrayEquals(new double[] {1837.3873283296462, 0.0}, doubleArray0, 0.01);
      assertFalse(brentSolver0.equals((Object)brentSolver1));
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(brentSolver1.equals((Object)brentSolver0));
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      assertEquals(1.0E-6, brentSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver1.getMaximalIterationCount());
      assertEquals(1837.3873283296462, brentSolver1.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double double0 = (-512.3583771382);
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-512.3583771382), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(14, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-512.3583771382), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(14, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double1 = brentSolver0.solve(doubleArray0[0], double0, double0);
      assertArrayEquals(new double[] {0.0, (-512.3583771382), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(14, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      double double0 = (-1117.733);
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1117.733), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, (-1117.733), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(12, polynomialFunction0.degree());
      assertNotNull(brentSolver0);
      
      double double1 = brentSolver0.solve(double0, double0, double0);
      assertArrayEquals(new double[] {0.0, (-1117.733), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals((-1117.733), double1, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1825.5126447568723;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(4, polynomialFunctionLagrangeForm0.degree());
      assertNotNull(brentSolver0);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(double0, brentSolver0.functionValueAccuracy, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 0.0  Endpoints: [1825.5126447568723,1.0E-15]
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      double double0 = (-1117.733);
      double double1 = 1028.6803087626893;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentSolver0);
      
      double double2 = brentSolver0.solve(double0, double1, doubleArray0[2]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
  }
}
