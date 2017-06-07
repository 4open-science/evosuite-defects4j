/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:22:21 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.special.Beta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BetaEvoSuite_branch_Test extends BetaEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-655.99947736);
      double double1 = 3252.2178264;
      double double2 = Beta.logBeta(double1, double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 1473.4;
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = (-1);
      double double2 = Beta.logBeta((double) int0, double1, double1, int0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-985.0);
      int int0 = 14;
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0, int0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Beta.logBeta(double1, double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1799.7702155498155;
      double double1 = 0.9999999999999971;
      double double2 = Beta.regularizedBeta(double1, double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(0.9999999999948048, double2, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 1799.7702155498155;
      int int0 = 0;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals((-2497.4934266902965), double1, 0.01D);
      
      double double2 = 0.0;
      assertFalse(double2 == double1);
      
      double double3 = 1360.2;
      assertFalse(double3 == double1);
      
      double double4 = Beta.regularizedBeta(double2, double3, double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double4);
      assertFalse(double2 == double4);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double1 == double4);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertFalse(double4 == double3);
      assertFalse(double4 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertEquals(Double.NaN, double4, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 1799.7702155498155;
      int int0 = 0;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals((-2497.4934266902965), double1, 0.01D);
      
      double double2 = 0.0;
      assertFalse(double2 == double1);
      
      double double3 = Beta.regularizedBeta(double2, double1, double1, double1, int0);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertEquals(Double.NaN, double3, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 1473.4;
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = (-1);
      double double2 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals((-2044.9481786799006), double2, 0.01D);
      
      double double3 = Beta.regularizedBeta(double2, double0, double1, int0);
      //  // Unstable assertion: assertFalse(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertTrue(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 1473.4;
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Beta.regularizedBeta(double1, double1, double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = (-1.0);
      int int0 = 0;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Beta.regularizedBeta(double0, double1, (double) int0, int0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }
}
