/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:36:52 GMT 2014
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
  public void test00()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 2.0;
      double double2 = Beta.logBeta(double1, double0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 2534.5166902387;
      double double1 = Beta.logBeta(double0, double0);
      //  // Unstable assertion: assertEquals((-3516.2395135211627), double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = Beta.logBeta(double1, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double3 = Beta.logBeta(double1, double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertTrue(double3 == double2);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = 1.0;
      double double1 = 1.0E-14;
      double double2 = 0.0;
      double double3 = Beta.regularizedBeta(double1, double0, double0, double2);
      assertEquals(1.0000000000000016E-14, double3, 0.01D);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = 1.0;
      double double1 = 0.0;
      double double2 = Beta.regularizedBeta(double0, double0, double1, double0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 1887;
      double double1 = Beta.regularizedBeta((double) int0, double0, (double) int0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = 2534.5166902387;
      double double1 = Beta.logBeta(double0, double0);
      //  // Unstable assertion: assertEquals((-3516.2395135211627), double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Beta.logBeta(double1, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      
      int int0 = 8;
      double double3 = Beta.regularizedBeta((double) int0, double0, double2, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertTrue(double3 == double2);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double3);
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = (-4331.0);
      double double1 = Beta.logBeta(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      int int0 = 8;
      double double2 = Beta.regularizedBeta(double0, double1, double1, (double) int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 1.0;
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      assertEquals(1.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Beta.regularizedBeta(double0, double0, double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test09()  throws Throwable  {
      double double0 = 2534.5166902387;
      double double1 = Beta.logBeta(double0, double0);
      assertEquals((-3516.2395135211627), double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      int int0 = 8;
      double double2 = Beta.regularizedBeta(double1, double1, double1, int0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 0;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = Beta.logBeta(double1, (double) int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
  }

  @Test
  public void test11()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 0;
      double double1 = Beta.logBeta(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = Beta.regularizedBeta(double1, (double) int0, double1, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
  }
}
