/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:57:43 GMT 2014
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
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(0, multiDirectional0.getEvaluations());
      assertNotNull(multiDirectional0);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 1.786523021334051;
      MultiDirectional multiDirectional0 = new MultiDirectional(double0, double0);
      assertEquals(0, multiDirectional0.getIterations());
      assertEquals(2147483647, multiDirectional0.getMaxEvaluations());
      assertEquals(2147483647, multiDirectional0.getMaxIterations());
      assertEquals(0, multiDirectional0.getEvaluations());
      assertNotNull(multiDirectional0);
  }
}
