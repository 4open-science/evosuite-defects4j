/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:17:09 GMT 2014
 */

package org.apache.commons.math3.random;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BitsStreamGeneratorEvoSuite_branch_Test extends BitsStreamGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      long long0 = 0L;
      Well512a well512a0 = new Well512a(long0);
      assertNotNull(well512a0);
      
      int int0 = 1;
      int int1 = well512a0.nextInt(int0);
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test1()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      assertNotNull(well1024a0);
      
      int int0 = well1024a0.nextInt();
      assertEquals(1307152932, int0);
      
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      int int1 = mersenneTwister0.nextInt(int0);
      assertEquals(486348792, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well19937a well19937a0 = new Well19937a(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(well19937a0);
      
      int int0 = (-2455);
      try {
        int int1 = well19937a0.nextInt(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,455 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      double double0 = well19937c0.nextGaussian();
      assertEquals(0.7889109535650662, double0, 0.01D);
      
      double double1 = well19937c0.nextGaussian();
      assertEquals((-0.5534954938959259), double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 0;
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      byte[] byteArray0 = new byte[10];
      well44497b0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte)112, (byte) (-48), (byte) (-17), (byte) (-109), (byte) (-99), (byte)102, (byte)58, (byte)105, (byte) (-121), (byte)102}, byteArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      boolean boolean0 = well44497b0.nextBoolean();
      assertTrue(boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      boolean boolean0 = well512a0.nextBoolean();
      assertFalse(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      assertNotNull(well1024a0);
      
      long long0 = well1024a0.nextLong();
      assertEquals(5614179097095692510L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      float float0 = well19937a0.nextFloat();
      assertEquals(0.59291184F, float0, 0.01F);
  }
}
