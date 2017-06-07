/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:03:10 GMT 2014
 */

package org.apache.commons.math.ode.nonstiff;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RungeKuttaIntegratorEvoSuite_branch_Test extends RungeKuttaIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-1047.9378177262308);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(double0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Euler", eulerIntegrator0.getName());
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
      assertNotNull(eulerIntegrator0);
  }
}
