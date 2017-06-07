/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:11:17 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test extends UnivariateRealSolverUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-226.5993239830159);
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertEquals((-226.5993239830159), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      
      double double2 = 524.0;
      assertFalse(double2 == double1);
      
      doubleArray0[4] = double2;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 524.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 1204;
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double2, double1, doubleArray0[4], int0);
      assertEquals(4, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 524.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 524.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertTrue(double0 == double1);
      assertFalse(double1 == double2);
      assertTrue(double1 == double0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 703.75;
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {703.75}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      double double1 = 1.0;
      int int0 = 3;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double1, double1, double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=3, maximum iterations=3, initial=1, lower bound=1, upper bound=703.75, final a value=1, final b value=4, f(a)=703.75, f(b)=703.75
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[2], double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.5;
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertEquals(0.5, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.5, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[5], doubleArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0.5, lower bound=0, upper bound=0.5, final a value=0, final b value=0.5, f(a)=0.5, f(b)=0.5
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-226.5993239830159);
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertEquals((-226.5993239830159), double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      
      double double2 = 1151.1048336877;
      assertFalse(double2 == double1);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double1, double2, doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,151.105,  initial=-226.599, upper bound=0
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 438.32581;
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = (-1184);
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1,184
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      UnivariateRealFunction univariateRealFunction0 = null;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, doubleArray0[2], doubleArray0[2], doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertEquals(9, polynomialFunctionLagrangeForm0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, doubleArray0[1], doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = (-444.6277);
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[2];
      // Undeclared exception!
      try {
        double double1 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunctionArray0[0], double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      double double0 = 0.5;
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[5], doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0.5, upper bound=0
         //
      }
  }
}
