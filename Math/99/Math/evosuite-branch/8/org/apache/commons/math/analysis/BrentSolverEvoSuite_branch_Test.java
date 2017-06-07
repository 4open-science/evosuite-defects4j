/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:33:26 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
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
      double[] doubleArray0 = new double[4];
      double double0 = (-3553.3912875155447);
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {(-3553.3912875155447), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      //  // Unstable assertion: assertEquals(3, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertArrayEquals(new double[] {(-3553.3912875155447), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(3, polynomialFunction0.degree());
      
      double double1 = Double.NaN;
      double[] doubleArray1 = new double[3];
      //  // Unstable assertion: assertNotSame(doubleArray1, doubleArray0);
      //  // Unstable assertion: assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[1] = double1;
      try {
        double double2 = brentSolver0.solve(double1, doubleArray1[2], doubleArray1[1]);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-1.0);
      doubleArray0[16] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(17, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double1 = brentSolver0.solve(double0, doubleArray0[1]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 1643.9875872987395;
      doubleArray0[3] = double0;
      double double1 = (-1365.37);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1643.9875872987395, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1643.9875872987395, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      doubleArray0[0] = double1;
      double double2 = brentSolver0.solve(doubleArray0[0], double0);
      assertArrayEquals(new double[] {(-1365.37), 0.0, 0.0, 1643.9875872987395, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-4.31635113591657E-7), double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(4, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(4, polynomialFunction0.degree());
      
      double double0 = Double.NaN;
      double double1 = (-14.782334193983573);
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-14.782334193983573), double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(4, polynomialFunction0.degree());
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      //  // Unstable assertion: assertEquals(14, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      //  // Unstable assertion: assertEquals(14, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[1], doubleArray0[2]);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,Infinity]  Values: [NaN,NaN]
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 1.0E-14;
      double double1 = 2392.621055886454;
      doubleArray0[2] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 2392.621055886454, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 2392.621055886454, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(9, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(double0, double1);
      assertArrayEquals(new double[] {0.0, 0.0, 2392.621055886454, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, double2, 0.01D);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertTrue(double0 == double2);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(9, polynomialFunction0.degree());
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 1643.9875872987395;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction0.degree());
      
      double double1 = brentSolver0.solve(doubleArray0[0], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(9, polynomialFunction0.degree());
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-1.0);
      double double1 = 3940.1699099916154;
      doubleArray0[16] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3940.1699099916154, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(17, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3940.1699099916154, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(16, polynomialFunction1.degree());
      assertEquals(17, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3940.1699099916154, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(16, polynomialFunction1.degree());
      assertEquals(17, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(double0, doubleArray0[16], double0);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3940.1699099916154, 0.0}, doubleArray0, 0.01);
      assertEquals((-0.04190340770230189), double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(16, polynomialFunction1.degree());
      assertEquals(17, polynomialFunction0.degree());
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      double double0 = (-1.0);
      doubleArray0[16] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(17, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      double double1 = brentSolver0.solve(double0, doubleArray0[16], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals((-1.0), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(17, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-785.603868051385);
      doubleArray0[3] = double0;
      double double1 = (-4.548183615090773);
      doubleArray0[8] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-785.603868051385), 0.0, 0.0, 0.0, 0.0, (-4.548183615090773), 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      double double2 = (-1.0);
      doubleArray0[0] = double2;
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, (-785.603868051385), 0.0, 0.0, 0.0, 0.0, (-4.548183615090773), 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double3 = brentSolver0.solve(doubleArray0[8], doubleArray0[2], doubleArray0[0]);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, (-785.603868051385), 0.0, 0.0, 0.0, 0.0, (-4.548183615090773), 0.0}, doubleArray0, 0.01);
      assertEquals((-2.802032171975752), double3, 0.01D);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(4, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      double double0 = Double.NaN;
      double double1 = (-14.782334193983573);
      double double2 = brentSolver0.solve(double1, double1, double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(4, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-785.603868051385);
      doubleArray0[8] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-785.603868051385), 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      doubleArray0[0] = double0;
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {(-785.603868051385), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-785.603868051385), 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double1 = brentSolver0.solve(doubleArray0[8], doubleArray0[2], doubleArray0[0]);
      assertArrayEquals(new double[] {(-785.603868051385), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-785.603868051385), 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = (-1119.1125800803263);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(3, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(3, polynomialFunction0.degree());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[1], doubleArray0[3], double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: -1119.1125800803263  Endpoints: [0.0,0.0]
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(9, polynomialFunction0.degree());
      
      double double0 = brentSolver0.solve(doubleArray0[8], doubleArray0[2], doubleArray0[0]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(9, polynomialFunction0.degree());
  }
}
