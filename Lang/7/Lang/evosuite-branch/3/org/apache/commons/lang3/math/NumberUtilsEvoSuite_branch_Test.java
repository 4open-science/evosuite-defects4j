/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:54:08 GMT 2014
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
      String string0 = "-l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test001()  throws Throwable  {
      String string0 = "0l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test002()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test003()  throws Throwable  {
      String string0 = "9d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test004()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test005()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test006()  throws Throwable  {
      String string0 = "7E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test007()  throws Throwable  {
      String string0 = "e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test008()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test009()  throws Throwable  {
      String string0 = "---0X-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test010()  throws Throwable  {
      String string0 = "+wVs7>546~";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test011()  throws Throwable  {
      String string0 = "eG2v\"";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test012()  throws Throwable  {
      String string0 = "0EI";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test013()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test014()  throws Throwable  {
      String string0 = "0x0xMinium abbreviaton width is4";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test015()  throws Throwable  {
      String string0 = "0x...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test016()  throws Throwable  {
      String string0 = "0xC";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test017()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test018()  throws Throwable  {
      String string0 = "-0xev\"qL[$o2D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test019()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test020()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test021()  throws Throwable  {
      String string0 = "-0XY0EI'c4?sM";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test022()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test023()  throws Throwable  {
      byte byte0 = (byte) (-78);
      byte byte1 = (byte)84;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)84, byte2);
  }

  @Test
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-78);
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byte0, byteArray0[1], byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-78), (byte)0}, byteArray0);
      assertEquals((byte) (-78), byte1);
  }

  @Test
  public void test025()  throws Throwable  {
      short short0 = (short)29;
      byte byte0 = (byte) (-99);
      short short1 = NumberUtils.max((short) byte0, short0, (short) byte0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)29, short1);
  }

  @Test
  public void test026()  throws Throwable  {
      int int0 = 3585;
      int int1 = 0;
      byte byte0 = (byte) (-96);
      int int2 = NumberUtils.max((int) byte0, int1, int0);
      assertTrue(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int0 == int1);
      assertTrue(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertEquals(3585, int2);
  }

  @Test
  public void test027()  throws Throwable  {
      int int0 = 0;
      int int1 = 64;
      byte[] byteArray0 = new byte[3];
      int int2 = NumberUtils.max(int0, int1, (int) byteArray0[2]);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(64, int2);
  }

  @Test
  public void test028()  throws Throwable  {
      long long0 = 0L;
      long long1 = 3169L;
      long long2 = NumberUtils.max(long0, long0, long1);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertEquals(3169L, long2);
  }

  @Test
  public void test029()  throws Throwable  {
      long long0 = 0L;
      short short0 = (short)0;
      short short1 = (short)1928;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals((short)1928, short2);
      
      long long1 = NumberUtils.max(long0, (long) short2, long0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(long0 == long1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(long1 == long0);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals(1928L, long1);
  }

  @Test
  public void test030()  throws Throwable  {
      String string0 = "{A_aPA\">d-TDxh";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      byte byte1 = (byte)66;
      assertFalse(byte1 == byte0);
      
      byte byte2 = NumberUtils.toByte(string0, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)66, byte2);
      
      byte byte3 = NumberUtils.min(byte1, byte2, byte0);
      assertFalse(byte2 == byte0);
      assertFalse(byte2 == byte3);
      assertTrue(byte2 == byte1);
      assertFalse(byte3 == byte2);
      assertFalse(byte3 == byte1);
      assertTrue(byte3 == byte0);
      assertTrue(byte0 == byte3);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte3);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte3);
  }

  @Test
  public void test031()  throws Throwable  {
      String string0 = "{A_aPA\">d-TDxh";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      byte byte1 = (byte)66;
      assertFalse(byte1 == byte0);
      
      byte byte2 = NumberUtils.min(byte1, byte0, byte0);
      assertFalse(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertEquals((byte)0, byte2);
  }

  @Test
  public void test032()  throws Throwable  {
      short short0 = (short)29;
      short short1 = (short) (-140);
      short short2 = NumberUtils.min(short0, short1, short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short) (-140), short2);
  }

  @Test
  public void test033()  throws Throwable  {
      short short0 = (short)1524;
      byte byte0 = (byte)57;
      short short1 = NumberUtils.min(short0, short0, (short) byte0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short)57, short1);
  }

  @Test
  public void test034()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-78);
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.max(byte0, byteArray0[1], byteArray0[0]);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertArrayEquals(new byte[] {(byte) (-78), (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte1);
      
      int int0 = NumberUtils.min((int) byte1, (int) byte1, (int) byteArray0[0]);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertArrayEquals(new byte[] {(byte) (-78), (byte)0, (byte)0}, byteArray0);
      assertEquals((-78), int0);
  }

  @Test
  public void test035()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = (short) (-1);
      shortArray0[3] = short0;
      int int0 = 0;
      int int1 = NumberUtils.min(int0, (int) shortArray0[3], (int) shortArray0[3]);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short) (-1), (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((-1), int1);
  }

  @Test
  public void test036()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-17);
      int int1 = (-3561);
      long long0 = NumberUtils.min((long) intArray0[0], (long) int0, (long) int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals((-3561L), long0);
  }

  @Test
  public void test037()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-17);
      long long0 = NumberUtils.min((long) intArray0[0], (long) int0, (long) int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals((-17L), long0);
  }

  @Test
  public void test038()  throws Throwable  {
      long[] longArray0 = new long[1];
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(0L, long0);
      
      long long1 = NumberUtils.min(long0, long0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(0L, long1);
  }

  @Test
  public void test039()  throws Throwable  {
      int int0 = 741;
      float[] floatArray0 = new float[6];
      floatArray0[5] = (float) int0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 741.0F}, floatArray0, 0.01F);
      assertEquals(741.0F, float0, 0.01F);
  }

  @Test
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test
  public void test041()  throws Throwable  {
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
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      byte byte0 = (byte)56;
      doubleArray0[8] = (double) byte0;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 56.0}, doubleArray0, 0.01);
      assertEquals(56.0, double0, 0.01D);
  }

  @Test
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test044()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-78);
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertFalse(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte) (-78), (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte1);
  }

  @Test
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short)282;
      shortArray0[3] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)282, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)282, short1);
  }

  @Test
  public void test048()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte) (-28);
      byteArray0[0] = byte0;
      int[] intArray0 = new int[7];
      intArray0[0] = (int) byteArray0[0];
      int int0 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {(-28), 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test
  public void test050()  throws Throwable  {
      int int0 = (-17);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) int0;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {(-17L), 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test053()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = (-307.7F);
      floatArray0[2] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertTrue(float1 == float0);
      assertArrayEquals(new float[] {0.0F, 0.0F, (-307.7F), 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-307.7F), float1, 0.01F);
  }

  @Test
  public void test054()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      byte byte0 = (byte)92;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) byte0;
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {92.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test057()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test058()  throws Throwable  {
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
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte) (-28);
      byteArray0[5] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-28), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte) (-28), byte1);
  }

  @Test
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = (short) (-1);
      shortArray0[3] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short) (-1), (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short) (-1), short1);
  }

  @Test
  public void test062()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test063()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 2689;
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {2689, 0, 0}, intArray0);
      assertEquals(0, int1);
  }

  @Test
  public void test064()  throws Throwable  {
      String string0 = "{A_aPA\">d-TDxh";
      byte byte0 = (byte)66;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)66, byte1);
      
      long[] longArray0 = new long[4];
      longArray0[0] = (long) byte1;
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {66L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test065()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test066()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test067()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test068()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test069()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test070()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test071()  throws Throwable  {
      String string0 = "Minimum abbreviation widh is 4";
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
  public void test072()  throws Throwable  {
      String string0 = "-l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -l is not a valid number.
         //
      }
  }

  @Test
  public void test073()  throws Throwable  {
      String string0 = "org.apache.c(mons.angSrngl";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // org.apache.c(mons.angSrngl is not a valid number.
         //
      }
  }

  @Test
  public void test074()  throws Throwable  {
      String string0 = "Strings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
      }
  }

  @Test
  public void test075()  throws Throwable  {
      String string0 = ">f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // >f is not a valid number.
         //
      }
  }

  @Test
  public void test076()  throws Throwable  {
      String string0 = "9d";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(9.0, (double)double0, 0.01D);
  }

  @Test
  public void test077()  throws Throwable  {
      String string0 = "ruN\"b*iZv43a:Jg:2L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ruN\"b*iZv43a:Jg:2L is not a valid number.
         //
      }
  }

  @Test
  public void test078()  throws Throwable  {
      String string0 = "F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
      }
  }

  @Test
  public void test079()  throws Throwable  {
      String string0 = "ev\"qL$o2D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ev\"qL$o2D is not a valid number.
         //
      }
  }

  @Test
  public void test080()  throws Throwable  {
      String string0 = "0EI'c4?M";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EI'c4?M is not a valid number.
         //
      }
  }

  @Test
  public void test081()  throws Throwable  {
      String string0 = "qBYsRkb0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"qBYsRkb0\"
         //
      }
  }

  @Test
  public void test082()  throws Throwable  {
      String string0 = "7E~K&-Z~/{\"e";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 7E~K&-Z~/{\"e is not a valid number.
         //
      }
  }

  @Test
  public void test083()  throws Throwable  {
      String string0 = "0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
      }
  }

  @Test
  public void test084()  throws Throwable  {
      String string0 = "Array cannot be empty.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Array cannot be empty. is not a valid number.
         //
      }
  }

  @Test
  public void test085()  throws Throwable  {
      String string0 = "~>...";
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
  public void test086()  throws Throwable  {
      String string0 = "-0X-0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
      }
  }

  @Test
  public void test087()  throws Throwable  {
      String string0 = "0XStrings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Strings must not be null\"
         //
      }
  }

  @Test
  public void test088()  throws Throwable  {
      String string0 = "-0xev\"qL[$o2D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-ev\"qL[$o2D\"
         //
      }
  }

  @Test
  public void test089()  throws Throwable  {
      String string0 = "0xMinimum abbreviation width is 4";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Minimum abbreviation width is 4\"
         //
      }
  }

  @Test
  public void test090() {}
//   @Test
//   public void test090()  throws Throwable  {
//       String string0 = "--";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test
  public void test091()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test092()  throws Throwable  {
      String string0 = " ";
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
  public void test093()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test094()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte) (-99);
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-99), byte1);
  }

  @Test
  public void test095()  throws Throwable  {
      int int0 = 3616;
      int int1 = NumberUtils.max(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(3616, int1);
      
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0, (double) int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(3616.0, double0, 0.01D);
  }

  @Test
  public void test096()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test097()  throws Throwable  {
      short short0 = (short)1524;
      String string0 = null;
      long long0 = NumberUtils.toLong(string0, (long) short0);
      assertEquals(1524L, long0);
  }

  @Test
  public void test098()  throws Throwable  {
      int int0 = 3616;
      int int1 = NumberUtils.max(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(3616, int1);
      
      String string0 = null;
      int int2 = NumberUtils.toInt(string0, int1);
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertTrue(int1 == int0);
      assertTrue(int0 == int2);
      assertTrue(int0 == int1);
      assertEquals(3616, int2);
  }

  @Test
  public void test099()  throws Throwable  {
      String string0 = "E-?1";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test100()  throws Throwable  {
      float float0 = 788.7344F;
      float float1 = NumberUtils.max(float0, float0, float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals(788.7344F, float1, 0.01F);
  }

  @Test
  public void test101()  throws Throwable  {
      String string0 = "-0xev\"qL[$o2D";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test102()  throws Throwable  {
      int int0 = 2547;
      long[] longArray0 = new long[1];
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(0L, long0);
      
      float float0 = NumberUtils.min((float) long0, (float) long0, (float) int0);
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test103()  throws Throwable  {
      int int0 = 3616;
      double double0 = NumberUtils.min((double) int0, (double) int0, (double) int0);
      assertEquals(3616.0, double0, 0.01D);
  }

  @Test
  public void test104()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test105()  throws Throwable  {
      String string0 = "-0XY0EI'c4?sM";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test106()  throws Throwable  {
      double double0 = (-12.49850566);
      double double1 = NumberUtils.max(double0, double0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals((-12.49850566), double1, 0.01D);
  }

  @Test
  public void test107()  throws Throwable  {
      String string0 = "-0XY0EI'c4?sM";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test108()  throws Throwable  {
      String string0 = "-0XY0EI'c4?sM";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}