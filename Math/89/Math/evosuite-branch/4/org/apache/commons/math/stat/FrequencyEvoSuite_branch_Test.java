/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:48:28 GMT 2014
 */

package org.apache.commons.math.stat;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FrequencyEvoSuite_branch_Test extends FrequencyEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-1046);
      frequency0.addValue(int0);
      int int1 = (-1683);
      long long0 = frequency0.getCumFreq(int1);
      assertEquals(0L, long0);
      assertFalse(int1 == int0);
  }

  @Test
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = (-1046);
      frequency0.addValue(int0);
      Integer integer0 = new Integer(int0);
      assertEquals((-1046), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      frequency0.addValue((Object) integer0);
      assertTrue(integer0.equals((Object)int0));
  }

  @Test
  public void test02()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      // Undeclared exception!
      try {
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must implement Comparable
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = '\u008F';
      frequency0.addValue(char0);
      String string0 = frequency0.toString();
      assertNotNull(string0);
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n\u008F\t1\t100%\t100%\n", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      frequency0.clear();
  }

  @Test
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      long long0 = frequency0.getCount(char0);
      assertEquals(0L, long0);
      
      int int0 = (-427);
      frequency0.addValue((long) char0);
      frequency0.addValue((Integer) int0);
      double double0 = frequency0.getCumPct(long0);
      assertEquals(0.5, double0, 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      long long0 = frequency0.getCumFreq(char0);
      assertEquals(0L, long0);
  }

  @Test
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      double double0 = frequency0.getCumPct((int) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      double double0 = frequency0.getPct((int) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      double double0 = frequency0.getPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = '\u008F';
      double double0 = frequency0.getCumPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 12;
      Integer integer0 = new Integer(int0);
      assertEquals(12, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      double double0 = frequency0.getPct((long) integer0);
      assertEquals(Double.NaN, double0, 0.01D);
      assertTrue(integer0.equals((Object)int0));
  }

  @Test
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 12;
      long long0 = frequency0.getCount((Object) int0);
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'Y';
      long long0 = frequency0.getCount((int) char0);
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 12;
      Integer integer0 = new Integer(int0);
      assertEquals(12, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      char char0 = '\u008F';
      frequency0.addValue(char0);
      long long0 = frequency0.getCumFreq((Object) integer0);
      assertEquals(0L, long0);
      assertTrue(integer0.equals((Object)int0));
  }
}
