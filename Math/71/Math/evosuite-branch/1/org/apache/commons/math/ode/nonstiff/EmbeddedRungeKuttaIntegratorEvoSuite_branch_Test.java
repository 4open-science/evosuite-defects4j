/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:05:54 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EmbeddedRungeKuttaIntegratorEvoSuite_branch_Test extends EmbeddedRungeKuttaIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-71.87615796051767);
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, doubleArray0[0], doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-71.87615796051767), dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertNotNull(dormandPrince54Integrator0);
      
      double double1 = dormandPrince54Integrator0.getMaxGrowth();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-71.87615796051767), dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(10.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 156.9;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, double0, double0, double0);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(156.9, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(156.9, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(156.9, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertNotNull(dormandPrince54Integrator0);
      
      double double1 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(156.9, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(156.9, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(156.9, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.2, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-71.87615796051767);
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, doubleArray0[0], doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals((-71.87615796051767), dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertNotNull(dormandPrince54Integrator0);
      
      double double1 = dormandPrince54Integrator0.getSafety();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(-0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals((-71.87615796051767), dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(0.9, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }
}
