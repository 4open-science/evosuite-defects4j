/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:51:22 GMT 2014
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
      String string0 = "4l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test001()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test002()  throws Throwable  {
      String string0 = "f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test003()  throws Throwable  {
      String string0 = "J";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test004()  throws Throwable  {
      String string0 = "0d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test005()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test006()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test007()  throws Throwable  {
      String string0 = "--sun";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test008()  throws Throwable  {
      String string0 = "+zO";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test009()  throws Throwable  {
      String string0 = "EVH}0)@";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test010()  throws Throwable  {
      String string0 = "68e=c:@E;7;:k";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test011()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test012()  throws Throwable  {
      String string0 = "0xArr";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test013()  throws Throwable  {
      String string0 = "-0xaS|O4?gb[Z[yeo1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test014()  throws Throwable  {
      String string0 = "-0x-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test015()  throws Throwable  {
      String string0 = "0x2";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test016()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test017()  throws Throwable  {
      String string0 = "0eS";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test018()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test019()  throws Throwable  {
      String string0 = ".";
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
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test022()  throws Throwable  {
      byte byte0 = (byte) (-50);
      byte byte1 = (byte)9;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)9, byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      
      byte byte3 = NumberUtils.max(byte0, byte2, byte2);
      assertEquals((byte)9, byte3);
      assertTrue(byte2 == byte3);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertTrue(byte1 == byte3);
      assertFalse(byte1 == byte0);
      assertTrue(byte3 == byte2);
      assertFalse(byte3 == byte0);
      assertTrue(byte3 == byte1);
      assertFalse(byte0 == byte3);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test
  public void test023()  throws Throwable  {
      short short0 = (short) (-3752);
      short short1 = (short) (-973);
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short) (-973), short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
  }

  @Test
  public void test024()  throws Throwable  {
      short short0 = (short) (-834);
      short short1 = (short) (-502);
      short short2 = NumberUtils.max(short0, short1, short1);
      assertEquals((short) (-502), short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
  }

  @Test
  public void test025()  throws Throwable  {
      int int0 = (-1924);
      int int1 = 774;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertEquals(774, int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test
  public void test026()  throws Throwable  {
      int int0 = (-1924);
      int int1 = 0;
      int int2 = NumberUtils.max(int0, int1, int0);
      assertEquals(0, int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
  }

  @Test
  public void test027()  throws Throwable  {
      long long0 = (-1265L);
      short[] shortArray0 = new short[1];
      short short0 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
      assertEquals((short)0, short0);
      
      long long1 = NumberUtils.max(long0, long0, (long) short0);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
      assertEquals(0L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test028()  throws Throwable  {
      int int0 = 0;
      int int1 = (-29);
      long long0 = NumberUtils.max((long) int1, (long) int0, (long) int0);
      assertEquals(0L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test029()  throws Throwable  {
      byte byte0 = (byte) (-50);
      byte byte1 = (byte)9;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)9, byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      
      byte byte3 = NumberUtils.min(byte2, byte2, byte0);
      assertEquals((byte) (-50), byte3);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte2 == byte3);
      assertFalse(byte1 == byte3);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte0 == byte3);
      assertTrue(byte3 == byte0);
      assertFalse(byte3 == byte1);
      assertFalse(byte3 == byte2);
  }

  @Test
  public void test030()  throws Throwable  {
      byte byte0 = (byte)76;
      byte byte1 = (byte)43;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertEquals((byte)43, byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)103;
      byteArray0[0] = byte0;
      byteArray0[2] = byteArray0[0];
      short short0 = (short)0;
      short short1 = NumberUtils.min((short) byteArray0[0], (short) byteArray0[2], short0);
      assertArrayEquals(new byte[] {(byte)103, (byte)0, (byte)103, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)0, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test
  public void test032()  throws Throwable  {
      byte byte0 = (byte)9;
      short short0 = (short)0;
      short short1 = NumberUtils.min((short) byte0, short0, (short) byte0);
      assertEquals((short)0, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test
  public void test033()  throws Throwable  {
      int int0 = 20;
      int int1 = 18;
      int int2 = NumberUtils.min(int0, int0, int1);
      assertEquals(18, int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
  }

  @Test
  public void test034()  throws Throwable  {
      int int0 = 20;
      int int1 = 508;
      int int2 = NumberUtils.min(int1, int0, int0);
      assertEquals(20, int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertTrue(int0 == int2);
      assertTrue(int2 == int0);
      assertFalse(int2 == int1);
  }

  @Test
  public void test035()  throws Throwable  {
      byte byte0 = (byte) (-115);
      long long0 = (-1556L);
      long long1 = NumberUtils.min((long) byte0, (long) byte0, long0);
      assertEquals((-1556L), long1);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
  }

  @Test
  public void test036()  throws Throwable  {
      short short0 = (short) (-3752);
      byte byte0 = (byte) (-61);
      short short1 = NumberUtils.max(short0, short0, short0);
      assertEquals((short) (-3752), short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      long long0 = NumberUtils.min((long) byte0, (long) short1, (long) byte0);
      assertEquals((-3752L), long0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
  }

  @Test
  public void test037()  throws Throwable  {
      String string0 = "?'";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
      
      long long0 = NumberUtils.min((long) short0, (long) short0, (long) short0);
      assertEquals(0L, long0);
  }

  @Test
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[6];
      byte byte0 = (byte)45;
      floatArray0[2] = (float) byte0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 45.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(45.0F, float0, 0.01F);
  }

  @Test
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[7] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
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
      int int0 = 120;
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) int0;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 120.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(120.0, double0, 0.01D);
  }

  @Test
  public void test042()  throws Throwable  {
      float float0 = Float.NaN;
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (double) float0;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)45;
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)45}, byteArray0);
      assertEquals((byte)45, byte1);
      assertTrue(byte1 == byte0);
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
      byte[] byteArray0 = new byte[2];
      byte byte0 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test046()  throws Throwable  {
      short[] shortArray0 = new short[4];
      short short0 = (short)450;
      shortArray0[3] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)450}, shortArray0);
      assertEquals((short)450, short1);
      assertTrue(short1 == short0);
  }

  @Test
  public void test047()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1234;
      intArray0[2] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 0, 1234, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1234, int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      short short0 = (short) (-3752);
      short short1 = NumberUtils.max(short0, short0, short0);
      assertEquals((short) (-3752), short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      
      long[] longArray0 = new long[20];
      longArray0[0] = (long) short1;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {(-3752L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test050()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float float0 = Float.NaN;
      floatArray0[0] = float0;
      floatArray0[2] = floatArray0[0];
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {Float.NaN, 0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 3706.881507630331;
      doubleArray0[0] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {3706.881507630331, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test
  public void test053()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float float0 = Float.NaN;
      floatArray0[0] = float0;
      floatArray0[2] = floatArray0[0];
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) floatArray0[2];
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte byte0 = (byte) (-9);
      byteArray0[2] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-9), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte) (-9), byte1);
      assertTrue(byte1 == byte0);
  }

  @Test
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short short0 = (short)797;
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)797, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short1);
      assertFalse(short1 == short0);
  }

  @Test
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
      int[] intArray0 = new int[7];
      short short0 = (short) (-162);
      intArray0[6] = (int) short0;
      int int0 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, (-162)}, intArray0);
      assertEquals((-162), int0);
  }

  @Test
  public void test059()  throws Throwable  {
      long[] longArray0 = new long[5];
      long long0 = (-2065L);
      longArray0[3] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, (-2065L), 0L}, longArray0);
      assertEquals((-2065L), long1);
      assertTrue(long1 == long0);
  }

  @Test
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test063()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test064()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length BigInteger
         //
      }
  }

  @Test
  public void test065()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test066()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test067()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test068()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test069()  throws Throwable  {
      String string0 = "-0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      String string0 = "EbbrrY\\\"-m!`\\>?f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // EbbrrY\\\"-m!`\\>?f is not a valid number.
         //
      }
  }

  @Test
  public void test072()  throws Throwable  {
      String string0 = "0d";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.byteValue());
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test
  public void test073()  throws Throwable  {
      String string0 = "90L";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(90L, (long)long0);
  }

  @Test
  public void test074()  throws Throwable  {
      String string0 = "N/vF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // N/vF is not a valid number.
         //
      }
  }

  @Test
  public void test075()  throws Throwable  {
      String string0 = "|2(;*^zOE5{pD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // |2(;*^zOE5{pD is not a valid number.
         //
      }
  }

  @Test
  public void test076()  throws Throwable  {
      String string0 = "0eSNYmhw";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eSNYmhw is not a valid number.
         //
      }
  }

  @Test
  public void test077()  throws Throwable  {
      String string0 = "..E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ..E is not a valid number.
         //
      }
  }

  @Test
  public void test078()  throws Throwable  {
      String string0 = "d'ze6";
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
  public void test079()  throws Throwable  {
      String string0 = "*x:\"yyoW(S}=+Te`E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // *x:\"yyoW(S}=+Te`E is not a valid number.
         //
      }
  }

  @Test
  public void test080()  throws Throwable  {
      String string0 = "~8=X`l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ~8=X`l is not a valid number.
         //
      }
  }

  @Test
  public void test081()  throws Throwable  {
      String string0 = "P~(O9|e]Eu.#9Q.";
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
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      String string0 = "Pc~~O9|e]Eu.#9Q.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Pc~~O9|e]Eu.#9Q. is not a valid number.
         //
      }
  }

  @Test
  public void test084()  throws Throwable  {
      String string0 = "..k!.";
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
  public void test085()  throws Throwable  {
      String string0 = "0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test
  public void test086()  throws Throwable  {
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
  public void test087()  throws Throwable  {
      String string0 = "0xArr";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Arr\"
         //
      }
  }

  @Test
  public void test088()  throws Throwable  {
      String string0 = "--The Array must not be null";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

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
      String string0 = "-0x";
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
  public void test092()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test093()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test094()  throws Throwable  {
      String string0 = null;
      double double0 = 0.0;
      double double1 = NumberUtils.toDouble(string0, double0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test
  public void test095()  throws Throwable  {
      int int0 = 20;
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0, (float) int0);
      assertEquals(20.0F, float0, 0.01F);
  }

  @Test
  public void test096()  throws Throwable  {
      String string0 = null;
      int[] intArray0 = new int[3];
      long long0 = NumberUtils.toLong(string0, (long) intArray0[0]);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test097()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test
  public void test098()  throws Throwable  {
      String string0 = "-0x";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test099()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1783;
      float float0 = NumberUtils.max((float) intArray0[0], (float) int0, (float) intArray0[0]);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(1783.0F, float0, 0.01F);
  }

  @Test
  public void test100()  throws Throwable  {
      String string0 = "--sun";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test101()  throws Throwable  {
      String string0 = "-0x";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test102()  throws Throwable  {
      int int0 = 256;
      float float0 = NumberUtils.min((float) int0, (float) int0, (float) int0);
      assertEquals(256.0F, float0, 0.01F);
  }

  @Test
  public void test103()  throws Throwable  {
      short[] shortArray0 = new short[3];
      double double0 = NumberUtils.min((double) shortArray0[0], (double) shortArray0[0], (double) shortArray0[0]);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0}, shortArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test104()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test105()  throws Throwable  {
      byte byte0 = (byte)46;
      float[] floatArray0 = new float[1];
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      
      double double0 = NumberUtils.max((double) float0, (double) byte0, (double) float0);
      assertArrayEquals(new float[] {0.0F}, floatArray0, 0.01F);
      assertEquals(46.0, double0, 0.01D);
  }

  @Test
  public void test106()  throws Throwable  {
      String string0 = ".";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test107()  throws Throwable  {
      String string0 = "-0x";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}