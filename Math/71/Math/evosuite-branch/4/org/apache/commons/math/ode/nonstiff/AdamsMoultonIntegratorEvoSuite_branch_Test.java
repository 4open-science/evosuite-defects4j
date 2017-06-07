/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:20:11 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AdamsMoultonIntegratorEvoSuite_branch_Test extends AdamsMoultonIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 1;
      double[] doubleArray0 = new double[7];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(int0, (double) int0, (double) int0, doubleArray0, doubleArray0);
      assertNotNull(adamsMoultonIntegrator0);
      assertEquals("Adams-Moulton", adamsMoultonIntegrator0.getName());
      assertEquals(1.0, adamsMoultonIntegrator0.getMaxStep(), 0.01D);
      assertEquals(0, adamsMoultonIntegrator0.getEvaluations());
      assertEquals(Double.NaN, adamsMoultonIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(1.0, adamsMoultonIntegrator0.getMinStep(), 0.01D);
      assertEquals(1.4142135623730951, adamsMoultonIntegrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01D);
      assertEquals(1.0, adamsMoultonIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(2147483647, adamsMoultonIntegrator0.getMaxEvaluations());
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
