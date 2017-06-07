/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:52:38 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypeInferenceEvoSuite_branch_Test extends TypeInferenceEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      boolean boolean0 = false;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, boolean0);
      assertEquals("TRUE", booleanLiteralSet1.toString());
      assertEquals(1, booleanLiteralSet1.ordinal());
      assertEquals("TRUE", booleanLiteralSet1.name());
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet1);
      assertSame(booleanLiteralSet0, booleanLiteralSet1);
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
  }

  @Test
  public void test1()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      boolean boolean0 = true;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, boolean0);
      assertEquals("TRUE", booleanLiteralSet1.name());
      assertEquals("TRUE", booleanLiteralSet1.toString());
      assertEquals(1, booleanLiteralSet1.ordinal());
      assertEquals(BooleanLiteralSet.TRUE, booleanLiteralSet1);
      assertSame(booleanLiteralSet0, booleanLiteralSet1);
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
  }
}
