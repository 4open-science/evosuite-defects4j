/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:37:56 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeConsumerEvoSuite_branch_Test extends CodeConsumerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      char char0 = 'l';
      boolean boolean0 = CodeConsumer.isWordChar(char0);
      assertTrue(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      char char0 = '$';
      boolean boolean0 = CodeConsumer.isWordChar(char0);
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      char char0 = '\\';
      boolean boolean0 = CodeConsumer.isWordChar(char0);
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      char char0 = '_';
      boolean boolean0 = CodeConsumer.isWordChar(char0);
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.0;
      boolean boolean0 = CodeConsumer.isNegativeZero(double0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      char char0 = '\\';
      boolean boolean0 = CodeConsumer.isNegativeZero(char0);
      assertFalse(boolean0);
  }
}
