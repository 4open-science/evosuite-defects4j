/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:31:07 GMT 2014
 */

package org.jfree.chart.imagemap;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class OverLIBToolTipTagFragmentGeneratorEvoSuite_branch_Test extends OverLIBToolTipTagFragmentGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      OverLIBToolTipTagFragmentGenerator overLIBToolTipTagFragmentGenerator0 = new OverLIBToolTipTagFragmentGenerator();
      assertNotNull(overLIBToolTipTagFragmentGenerator0);
      
      String string0 = "";
      String string1 = overLIBToolTipTagFragmentGenerator0.generateToolTipFragment(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(" onMouseOver=\"return overlib('');\" onMouseOut=\"return nd();\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }
}
