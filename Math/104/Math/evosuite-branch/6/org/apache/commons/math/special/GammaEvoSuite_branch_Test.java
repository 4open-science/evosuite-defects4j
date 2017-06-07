/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:30:15 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class GammaEvoSuite_branch_Test extends GammaEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = 1831;
      double double0 = Gamma.regularizedGammaQ((double) int0, (double) int0);
      assertEquals(0.4968922508592006, double0, 0.01D);
      
      double double1 = 0.0;
      assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 1.580887032249125E-4;
      double double1 = (-626.198458627);
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = (-741.1985422242);
      int int0 = Integer.MAX_VALUE;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaQ((double) int0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      int int0 = 0;
      double double2 = Gamma.regularizedGammaQ(double1, double1, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 8.441822398385275E-5;
      int int0 = 0;
      try {
        double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = 984.21;
      double double1 = 57.15623566586292;
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 1831;
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP((double) int0, double0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 0.9999999999999971;
      double double1 = (-345.02576);
      int int0 = 0;
      double double2 = Gamma.regularizedGammaP(double0, double1, double0, int0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = (-1337.07);
      //  // Unstable assertion: assertFalse(double2 == double1);
      
      double double3 = Gamma.regularizedGammaP(double2, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertTrue(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double3 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double3);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double2);
  }

  @Test
  public void test09()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.logGamma(double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      
      double double2 = Gamma.logGamma(double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 3;
      double double0 = 2482.546;
      double double1 = Gamma.regularizedGammaP((double) int0, double0);
      assertEquals(1.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = (-411.17582);
      int int0 = 1831;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Gamma.regularizedGammaP(double1, (double) int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }
}