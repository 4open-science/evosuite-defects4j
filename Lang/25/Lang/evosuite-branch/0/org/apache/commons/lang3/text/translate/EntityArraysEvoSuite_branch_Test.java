/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:27:17 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EntityArraysEvoSuite_branch_Test extends EntityArraysEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_ESCAPE();
      assertNotNull(stringArray0);
      
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray0, stringArray1);
      assertNotSame(stringArray1, stringArray0);
      assertNotNull(stringArray1);
      assertFalse(stringArray0.equals((Object)stringArray1));
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test
  public void test01()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test02()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_ESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test03()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_ESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test04()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test05()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_UNESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test06()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_UNESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test07()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test08()  throws Throwable  {
      EntityArrays entityArrays0 = new EntityArrays();
      assertNotNull(entityArrays0);
  }

  @Test
  public void test09()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_UNESCAPE();
      assertNotNull(stringArray0);
  }

  @Test
  public void test10()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_UNESCAPE();
      assertNotNull(stringArray0);
  }
}
