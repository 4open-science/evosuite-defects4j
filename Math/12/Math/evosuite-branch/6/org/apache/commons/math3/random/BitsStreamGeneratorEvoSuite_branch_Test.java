/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:18:02 GMT 2014
 */

package org.apache.commons.math3.random;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BitsStreamGeneratorEvoSuite_branch_Test extends BitsStreamGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int[] intArray0 = new int[3];
      int int0 = (-1747);
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertNotNull(iSAACRandom0);
      
      int int1 = well44497a0.next(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(7219, int1);
      
      long long0 = well44497a0.nextLong();
      assertEquals((-6728617895355890190L), long0);
      
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      int int2 = well44497a0.nextInt();
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(1255509492, int2);
      
      long long1 = well19937a0.nextLong();
      assertFalse(long1 == long0);
      assertEquals(3412805406979191315L, long1);
      
      int int3 = well19937a0.nextInt(int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int3);
      assertEquals(562717326, int3);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      int int1 = 1;
      int int2 = well19937a0.nextInt(int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertTrue(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, int2);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      try {
        int int1 = well19937a0.nextInt(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      double double0 = well19937a0.nextGaussian();
      assertEquals((-1.323166334019188), double0, 0.01D);
      
      double double1 = well19937a0.nextGaussian();
      assertFalse(double1 == double0);
      assertEquals((-0.8740676169373817), double1, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-14);
      Well19937c well19937c0 = new Well19937c(int0);
      assertNotNull(well19937c0);
      
      byte[] byteArray0 = new byte[5];
      well19937c0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-94), (byte)50, (byte)24, (byte)23, (byte)99}, byteArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      boolean boolean0 = well19937a0.nextBoolean();
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int int0 = (-1747);
      int int1 = well44497a0.next(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(7219, int1);
      
      long long0 = well44497a0.nextLong();
      assertEquals((-6728617895355890190L), long0);
      
      boolean boolean0 = well44497a0.nextBoolean();
      assertFalse(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[3];
      Well1024a well1024a0 = new Well1024a(intArray0[0]);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertNotNull(well1024a0);
      
      float float0 = well1024a0.nextFloat();
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals(0.9119307F, float0, 0.01F);
  }
}