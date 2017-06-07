/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:22:32 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CommandLineRunner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;
import org.kohsuke.args4j.CmdLineException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CommandLineRunnerEvoSuite_branch_Test extends CommandLineRunnerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "TO_DOUBLE";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No argument is allowed: TO_DOUBLE
         //
      }
  }
}
