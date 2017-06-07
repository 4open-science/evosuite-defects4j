/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:30:38 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AdamsBashforthIntegratorEvoSuite_branch_Test extends AdamsBashforthIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 1;
      double[] doubleArray0 = new double[8];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(int0, (double) int0, (double) int0, doubleArray0, doubleArray0);
      assertEquals("Adams-Bashforth", adamsBashforthIntegrator0.getName());
      assertEquals(1.0, adamsBashforthIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(1.0, adamsBashforthIntegrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, adamsBashforthIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, adamsBashforthIntegrator0.getEvaluations());
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01D);
      assertEquals(2147483647, adamsBashforthIntegrator0.getMaxEvaluations());
      assertEquals(1.0, adamsBashforthIntegrator0.getMinStep(), 0.01D);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(adamsBashforthIntegrator0);
  }
}
