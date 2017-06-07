/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:04:41 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NumberUtilsEvoSuite_branch_Test extends NumberUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test000()  throws Throwable  {
      String string0 = "7l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test001()  throws Throwable  {
      String string0 = "l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test002()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test003()  throws Throwable  {
      String string0 = "-6.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test004()  throws Throwable  {
      String string0 = "--0XThe Array must not be null";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test005()  throws Throwable  {
      String string0 = "+TRe.ImXA8}TD";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test006()  throws Throwable  {
      String string0 = "-Eqw;;";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test007()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test008()  throws Throwable  {
      String string0 = ".7l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test009()  throws Throwable  {
      String string0 = "1eB";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test010()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test011()  throws Throwable  {
      String string0 = "0xfQTS.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test012()  throws Throwable  {
      String string0 = "0x!dQCT&'q6s|Ut";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test013()  throws Throwable  {
      String string0 = "0x0D1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test014()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test015()  throws Throwable  {
      String string0 = "0D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test016()  throws Throwable  {
      String string0 = "-0xorg.apache.commons.lang3.math.NumberUtils";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test017()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test018()  throws Throwable  {
      String string0 = "fp=<f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test019()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test020()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test021()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)13;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte)13, byte2);
  }

  @Test
  public void test022()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)18;
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)18, byte2);
  }

  @Test
  public void test023()  throws Throwable  {
      short short0 = (short)0;
      short[] shortArray0 = new short[5];
      short short1 = (short)1371;
      shortArray0[1] = short1;
      short short2 = NumberUtils.max(short0, short0, shortArray0[1]);
      assertArrayEquals(new short[] {(short)0, (short)1371, (short)0, (short)0, (short)0}, shortArray0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertEquals((short)1371, short2);
  }

  @Test
  public void test024()  throws Throwable  {
      short short0 = (short)1657;
      short short1 = (short)86;
      short short2 = NumberUtils.max(short1, short0, short0);
      assertTrue(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short1);
      assertTrue(short2 == short0);
      assertEquals((short)1657, short2);
  }

  @Test
  public void test025()  throws Throwable  {
      int int0 = (-1869);
      short short0 = (short) (-438);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short) (-438), short1);
      
      byte byte0 = (byte) (-80);
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte) (-80), byte1);
      
      int int1 = NumberUtils.max(int0, (int) short1, (int) byte1);
      assertTrue(short1 == short0);
      assertTrue(byte1 == byte0);
      assertTrue(short0 == short1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(byte0 == byte1);
      assertEquals((-80), int1);
  }

  @Test
  public void test026()  throws Throwable  {
      byte byte0 = (byte) (-20);
      int int0 = NumberUtils.max((int) byte0, (int) byte0, (int) byte0);
      assertEquals((-20), int0);
  }

  @Test
  public void test027()  throws Throwable  {
      int int0 = (-866);
      short short0 = (short)1657;
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) short0);
      assertEquals(1657L, long0);
  }

  @Test
  public void test028()  throws Throwable  {
      long long0 = (-1L);
      long long1 = NumberUtils.min(long0, long0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals((-1L), long1);
      
      long long2 = (-2633L);
      assertFalse(long2 == long1);
      
      long long3 = NumberUtils.max(long2, long1, long1);
      assertTrue(long1 == long0);
      assertFalse(long1 == long2);
      assertTrue(long1 == long3);
      assertFalse(long0 == long2);
      assertTrue(long0 == long1);
      assertTrue(long0 == long3);
      assertTrue(long3 == long0);
      assertFalse(long3 == long2);
      assertTrue(long3 == long1);
      assertFalse(long2 == long0);
      assertFalse(long2 == long3);
      assertFalse(long2 == long1);
      assertEquals((-1L), long3);
  }

  @Test
  public void test029()  throws Throwable  {
      byte byte0 = (byte)113;
      byte byte1 = (byte) (-120);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte) (-120), byte2);
  }

  @Test
  public void test030()  throws Throwable  {
      byte byte0 = (byte)71;
      byte byte1 = (byte) (-39);
      byte byte2 = NumberUtils.min(byte0, byte1, byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte) (-39), byte2);
  }

  @Test
  public void test031()  throws Throwable  {
      short short0 = (short) (-16);
      short short1 = (short) (-1714);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short) (-1714), short2);
  }

  @Test
  public void test032()  throws Throwable  {
      short short0 = (short) (-438);
      short short1 = (short) (-1337);
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals((short) (-1337), short2);
  }

  @Test
  public void test033()  throws Throwable  {
      short short0 = (short) (-1764);
      short short1 = (short)100;
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals((short) (-1764), short2);
      
      byte byte0 = (byte)113;
      int int0 = NumberUtils.min((int) byte0, (int) short1, (int) short2);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals((-1764), int0);
  }

  @Test
  public void test034()  throws Throwable  {
      short short0 = (short) (-1764);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short) (-1764), short1);
      
      byte byte0 = (byte)113;
      int int0 = NumberUtils.min((int) byte0, (int) short1, (int) short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((-1764), int0);
  }

  @Test
  public void test035()  throws Throwable  {
      short[] shortArray0 = new short[4];
      short short0 = (short)68;
      int int0 = NumberUtils.min((int) shortArray0[0], (int) shortArray0[3], (int) short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test036()  throws Throwable  {
      long long0 = (-1772L);
      long long1 = (-2322L);
      long long2 = NumberUtils.min(long0, long0, long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertEquals((-2322L), long2);
  }

  @Test
  public void test037()  throws Throwable  {
      long long0 = (-1L);
      long long1 = (-1786L);
      long long2 = NumberUtils.min(long0, long1, long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertEquals((-1786L), long2);
  }

  @Test
  public void test038()  throws Throwable  {
      short short0 = (short) (-438);
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short) (-438), short1);
      
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) short1;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {(-438.0F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[25];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test
  public void test040()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test041()  throws Throwable  {
      short short0 = (short) (-1855);
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) short0;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {(-1855.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[4] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)27;
      byteArray0[3] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)27}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)27, byte1);
  }

  @Test
  public void test044()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test045()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short)1371;
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)1371, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)1371, short1);
  }

  @Test
  public void test046()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = 68;
      intArray0[2] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 0, 68, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(int1 == int0);
      assertEquals(68, int1);
  }

  @Test
  public void test047()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test048()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = 212L;
      longArray0[3] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 212L, 0L, 0L, 0L, 0L}, longArray0);
      assertTrue(long1 == long0);
      assertEquals(212L, long1);
  }

  @Test
  public void test049()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test050()  throws Throwable  {
      short short0 = (short)2519;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {2519.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test
  public void test052()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[25];
      double double0 = (-752.5469700378283);
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-752.5469700378283), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertEquals((-752.5469700378283), double1, 0.01D);
  }

  @Test
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = Double.NaN;
      doubleArray0[4] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test055()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)1;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
  }

  @Test
  public void test057()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[4];
      short short0 = (short)68;
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)68, (short)0, (short)0, (short)0}, shortArray0);
      assertFalse(short1 == short0);
      assertEquals((short)0, short1);
  }

  @Test
  public void test059()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 100;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {100, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test
  public void test060()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test061()  throws Throwable  {
      long[] longArray0 = new long[5];
      long long0 = (-294L);
      longArray0[3] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, (-294L), 0L}, longArray0);
      assertTrue(long1 == long0);
      assertEquals((-294L), long1);
  }

  @Test
  public void test062()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test063()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test
  public void test064()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test065()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test066()  throws Throwable  {
      String string0 = "-0";
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNotNull(bigInteger0);
      assertEquals(0, bigInteger0.shortValue());
      assertEquals(0, bigInteger0.byteValue());
  }

  @Test
  public void test067()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test068()  throws Throwable  {
      String string0 = "Tm:\"/sIh!9";
      // Undeclared exception!
      try {
        Long long0 = NumberUtils.createLong(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Tm:\"/sIh!9\"
         //
      }
  }

  @Test
  public void test069()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test070()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test071()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test072()  throws Throwable  {
      String string0 = "E!\"cw08#\\o!LEOH'F>k";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // E!\"cw08#\\o!LEOH'F>k is not a valid number.
         //
      }
  }

  @Test
  public void test073()  throws Throwable  {
      String string0 = "Minimum abbVeviation width is 4";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test074()  throws Throwable  {
      String string0 = "IlleglAccessExcetion occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IlleglAccessExcetion occurred is not a valid number.
         //
      }
  }

  @Test
  public void test075()  throws Throwable  {
      String string0 = "~dHZ+}APL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ~dHZ+}APL is not a valid number.
         //
      }
  }

  @Test
  public void test076()  throws Throwable  {
      String string0 = "x{B_$d#u7aU0;F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // x{B_$d#u7aU0;F is not a valid number.
         //
      }
  }

  @Test
  public void test077()  throws Throwable  {
      String string0 = "0D";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test
  public void test078()  throws Throwable  {
      String string0 = "-0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test079()  throws Throwable  {
      String string0 = "FD7EscLe\"";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // FD7EscLe\" is not a valid number.
         //
      }
  }

  @Test
  public void test080()  throws Throwable  {
      String string0 = "The Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
      }
  }

  @Test
  public void test081()  throws Throwable  {
      String string0 = "T`)TC{'.pI`e";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // T`)TC{'.pI`e is not a valid number.
         //
      }
  }

  @Test
  public void test082()  throws Throwable  {
      String string0 = "5N`Tw-eu`s.]Zvf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 5N`Tw-eu`s.]Zvf is not a valid number.
         //
      }
  }

  @Test
  public void test083()  throws Throwable  {
      String string0 = "-6.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals((-6.0F), (float)float0, 0.01F);
  }

  @Test
  public void test084()  throws Throwable  {
      String string0 = "-0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
      }
  }

  @Test
  public void test085()  throws Throwable  {
      String string0 = "0XThe Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"The Array must not be null\"
         //
      }
  }

  @Test
  public void test086()  throws Throwable  {
      String string0 = "-0x0XThe Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-0XThe Array must not be null\"
         //
      }
  }

  @Test
  public void test087()  throws Throwable  {
      String string0 = "0x!dQCT&'q6s|Ut";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"!dQCT&'q6s|Ut\"
         //
      }
  }

  @Test
  public void test088() {}
//   @Test
//   public void test088()  throws Throwable  {
//       String string0 = "--fQTS.";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test
  public void test089()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test
  public void test090()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test091()  throws Throwable  {
      String string0 = "fp=<f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // fp=<f is not a valid number.
         //
      }
  }

  @Test
  public void test092()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      short short0 = NumberUtils.toShort(string0, (short) byte0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test093()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test094()  throws Throwable  {
      byte byte0 = (byte)1;
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0, (float) byte0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test
  public void test095()  throws Throwable  {
      String string0 = null;
      long long0 = 3029L;
      long long1 = NumberUtils.toLong(string0, long0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(3029L, long1);
  }

  @Test
  public void test096()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test
  public void test097()  throws Throwable  {
      String string0 = "Strings must not be null";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test098()  throws Throwable  {
      long long0 = (-1316L);
      float float0 = NumberUtils.max((float) long0, (float) long0, (float) long0);
      assertEquals((-1316.0F), float0, 0.01F);
  }

  @Test
  public void test099()  throws Throwable  {
      String string0 = "-";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test100()  throws Throwable  {
      String string0 = "0x!dQCT&'q6s|Ut";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test101()  throws Throwable  {
      int[] intArray0 = new int[4];
      float float0 = (-231.0F);
      float float1 = NumberUtils.min(float0, float0, (float) intArray0[2]);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertEquals((-231.0F), float1, 0.01F);
  }

  @Test
  public void test102()  throws Throwable  {
      double double0 = 357.97539062749365;
      double double1 = NumberUtils.min(double0, double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(357.97539062749365, double1, 0.01D);
  }

  @Test
  public void test103()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test104()  throws Throwable  {
      String string0 = "-0xorg.apache.commons.lang3.math.NumberUtils";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test105()  throws Throwable  {
      byte byte0 = (byte)0;
      double double0 = NumberUtils.max((double) byte0, (double) byte0, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test106()  throws Throwable  {
      String string0 = "-0xorg.apache.commons.lang3.math.NumberUtils";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test107()  throws Throwable  {
      String string0 = "fp=<f";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
