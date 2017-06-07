/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:03:15 GMT 2014
 */

package org.apache.commons.lang.enums;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.enums.Enum;
import org.apache.commons.lang.enums.ValuedEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ValuedEnumEvoSuite_branch_Test extends ValuedEnumEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 0;
      Class<Object> class0 = null;
      // Undeclared exception!
      try {
        Enum enum0 = ValuedEnum.getEnum(class0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Enum Class must not be null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      int int0 = 52;
      // Undeclared exception!
      try {
        Enum enum0 = ValuedEnum.getEnum(class0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Class must be a subclass of Enum
         //
      }
  }
}
