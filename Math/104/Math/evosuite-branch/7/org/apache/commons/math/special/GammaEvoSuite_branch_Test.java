/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:34:27 GMT 2014
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
      double double0 = 0.0;
      int int0 = Integer.MAX_VALUE;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.logGamma((double) int0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(4.399670563389096E10, double2, 0.01D);
      
      double double3 = Gamma.regularizedGammaP((double) int0, (double) int0);
      double double4 = Gamma.regularizedGammaQ(double2, double3, double1, int0);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 513;
      double double1 = Gamma.regularizedGammaQ((double) int0, double0, double0, int0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0, double1, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = Integer.MAX_VALUE;
      double double0 = (-530.18964167);
      double double1 = Gamma.regularizedGammaP((double) int0, (double) int0);
      assertFalse(double1 == double0);
      assertEquals(0.5000018956370139, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaQ(double1, double0, double1, int0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = 0.0;
      int int0 = Integer.MAX_VALUE;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaQ(double0, double1, double1, int0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 0.0;
      int int0 = Integer.MAX_VALUE;
      double double1 = Gamma.regularizedGammaQ(double0, double0, double0, int0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaQ(double1, double1, double1, int0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = 3.6899182659531625E-6;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(0.9999559702915715, double1, 0.01D);
      
      int int0 = 0;
      try {
        double double2 = Gamma.regularizedGammaQ(double0, double1, double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = 354.12451826247235;
      double double1 = 224.1406;
      double double2 = Gamma.regularizedGammaP(double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(0.999999999999947, double2, 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 513;
      double double1 = Gamma.regularizedGammaP((double) int0, double0, double0, int0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = 513;
      double double0 = (-1587.4499696);
      double double1 = Gamma.logGamma((double) int0);
      assertFalse(double1 == double0);
      assertEquals(2686.0604716263488, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaP(double1, double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = 513;
      double double2 = Gamma.regularizedGammaP(double0, double1, double1, int0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = Double.NaN;
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.logGamma(double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = (-4704.8);
      double double1 = Gamma.regularizedGammaQ(double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.logGamma(double1);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }
}