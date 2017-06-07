/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:06:29 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test extends UnivariateRealSolverUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertEquals(2, polynomialFunction0.degree());
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      
      int int0 = 1804;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[4], doubleArray0[3], doubleArray0[2], int0);
       //  fail("Expecting exception: Exception");
       // Unstable assertion
      } catch(Exception e) {
         //
         // number of iterations=1,804, maximum iterations=1,804, initial=0, lower bound=0, upper bound=\u221E, final a value=0, final b value=1,804, f(a)=\uFFFD, f(b)=\u221E
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 1804;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[5], doubleArray0[1], int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,804, maximum iterations=1,804, initial=\u221E, lower bound=0, upper bound=\u221E, final a value=\u221E, final b value=\u221E, f(a)=\u221E, f(b)=\u221E
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 2927.81508;
      doubleArray0[0] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {2927.81508, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 4365;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[3], double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=2,928, maximum iterations=4,365, initial=2,927.815, lower bound=0, upper bound=2,927.815, final a value=0, final b value=2,927.815, f(a)=2,927.815, f(b)=2,927.815
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 1.0;
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertEquals(1.0, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 1;
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[0], double1, int0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertEquals(0, polynomialFunction0.degree());
      assertTrue(double0 == double1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 1.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(doubleArray1);
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-533.516631181248);
      double double1 = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double1, double0, doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-533.517,  initial=0.5, upper bound=0
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 0.5;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.5, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = 482;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[1], doubleArray0[1], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0.5,  initial=0, upper bound=0.5
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      int int0 = (-1326);
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1,326
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 1261.65297212716;
      int int0 = 0;
      // Undeclared exception!
      try {
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 0.0;
      // Undeclared exception!
      try {
        double double1 = UnivariateRealSolverUtils.solve(univariateRealFunction0, double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[4], doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
      }
  }
}
