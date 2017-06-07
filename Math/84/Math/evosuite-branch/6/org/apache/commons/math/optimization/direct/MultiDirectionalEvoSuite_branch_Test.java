/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:08:02 GMT 2014
 */

package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultiDirectionalEvoSuite_branch_Test extends MultiDirectionalEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      assertNotNull(multiDirectional0);
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(0, multiDirectional0.getEvaluations());
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 21.0055055;
      MultiDirectional multiDirectional0 = new MultiDirectional(double0, double0);
      assertNotNull(multiDirectional0);
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertEquals(0, multiDirectional0.getEvaluations());
  }
}