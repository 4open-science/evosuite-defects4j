/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:08:40 GMT 2014
 */

package org.apache.commons.math.dfp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.dfp.Dfp;
import org.apache.commons.math.dfp.DfpField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DfpEvoSuite_branch_Test extends DfpEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      DfpField dfpField0 = null;
      byte byte0 = (byte) (-36);
      Dfp dfp0 = null;
      try {
        dfp0 = new Dfp(dfpField0, byte0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
