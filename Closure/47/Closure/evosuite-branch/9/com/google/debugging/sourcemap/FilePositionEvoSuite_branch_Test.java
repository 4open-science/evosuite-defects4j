/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:47:30 GMT 2014
 */

package com.google.debugging.sourcemap;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.debugging.sourcemap.FilePosition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FilePositionEvoSuite_branch_Test extends FilePositionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = (-2921);
      FilePosition filePosition0 = new FilePosition(int0, int0);
      assertNotNull(filePosition0);
      assertEquals(-2921, filePosition0.getLine());
      assertEquals(-2921, filePosition0.getColumn());
      
      int int1 = filePosition0.getLine();
      assertEquals(-2921, filePosition0.getLine());
      assertEquals(-2921, filePosition0.getColumn());
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals((-2921), int1);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-2921);
      FilePosition filePosition0 = new FilePosition(int0, int0);
      assertNotNull(filePosition0);
      assertEquals(-2921, filePosition0.getColumn());
      assertEquals(-2921, filePosition0.getLine());
      
      int int1 = filePosition0.getColumn();
      assertEquals(-2921, filePosition0.getColumn());
      assertEquals(-2921, filePosition0.getLine());
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals((-2921), int1);
  }
}
