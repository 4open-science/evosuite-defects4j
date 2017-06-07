/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:20:20 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Beta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BetaEvoSuite_branch_Test extends BetaEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double double0 = (-2728.57967400131);
      double double1 = 1924.5449686;
      int int0 = (-1);
      double double2 = Beta.regularizedBeta(double0, double0, double1, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double3 = Beta.logBeta(double1, double0, double2, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertTrue(double3 == double2);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertTrue(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = (-2.6190838401581408E-5);
      double double1 = 2.0;
      int int0 = Integer.MAX_VALUE;
      double double2 = Beta.logBeta(double1, double1, double0, int0);
      //  // Unstable assertion: assertEquals((-1.7917594692280543), double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double3 = Beta.regularizedBeta(double0, double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      
      double double4 = Beta.logBeta(double2, double3, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double4, 0.01D);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertTrue(double3 == double4);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double4);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double4);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertTrue(double4 == double3);
      //  // Unstable assertion: assertFalse(double4 == double2);
      //  // Unstable assertion: assertFalse(double4 == double1);
      //  // Unstable assertion: assertFalse(double4 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double4);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Beta.regularizedBeta(double0, double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = (-67);
      double double2 = Beta.logBeta(double1, double1, (double) int0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = 1.0E-14;
      double double1 = 2214.0;
      double double2 = Beta.regularizedBeta(double0, double1, double1);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 6.283185307179586;
      int int0 = 1;
      try {
        double double1 = Beta.regularizedBeta((double) int0, double0, (double) int0, (double) int0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Continued fraction convergents failed to converge for value 0
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = (-2728.57967400131);
      double double1 = 397.465422;
      double double2 = 0.0;
      double double3 = Beta.regularizedBeta(double2, double1, double2, double0);
      assertEquals(Double.NaN, double3, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = (-2.6190838401581408E-5);
      int int0 = Integer.MAX_VALUE;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = (-2128.726009599523);
      //  // Unstable assertion: assertFalse(double2 == double1);
      
      double double3 = 0.0;
      //  // Unstable assertion: assertFalse(double3 == double1);
      
      double double4 = Beta.regularizedBeta(double3, double2, double0, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double4, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double4);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertTrue(double1 == double4);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double4);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double4);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double4 == double1);
      //  // Unstable assertion: assertFalse(double4 == double0);
      //  // Unstable assertion: assertFalse(double4 == double3);
      //  // Unstable assertion: assertFalse(double4 == double2);
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 1924.5449686;
      int int0 = (-1);
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0, int0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = (-2.6190838401581408E-5);
      int int0 = Integer.MAX_VALUE;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Beta.regularizedBeta(double0, double1, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }

  @Test
  public void test09()  throws Throwable  {
      double double0 = (-2.6190838401581408E-5);
      int int0 = Integer.MAX_VALUE;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = Beta.regularizedBeta(double0, (double) int0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = (-2.6190838401581408E-5);
      int int0 = Integer.MAX_VALUE;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Beta.regularizedBeta(double1, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
  }

  @Test
  public void test11()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Beta.logBeta(double0, double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }
}
