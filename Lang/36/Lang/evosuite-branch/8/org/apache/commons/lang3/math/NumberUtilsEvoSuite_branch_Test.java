/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:01:47 GMT 2014
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
      String string0 = "3L";
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
      String string0 = "7D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test003()  throws Throwable  {
      String string0 = "d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test004()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test005()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test006()  throws Throwable  {
      String string0 = "--(Ek";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test007()  throws Throwable  {
      String string0 = "EM";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test008()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test009()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test010()  throws Throwable  {
      String string0 = "5e'u=ARf]j";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test011()  throws Throwable  {
      String string0 = "g";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test012()  throws Throwable  {
      String string0 = "0x0if?{VFM";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test013()  throws Throwable  {
      String string0 = "0x p0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test014()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test015()  throws Throwable  {
      String string0 = "07 2-p0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test016()  throws Throwable  {
      String string0 = "+ku6}L?FE<oL";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test017()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test018()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test019()  throws Throwable  {
      String string0 = "0xB";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test020()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test021()  throws Throwable  {
      byte byte0 = (byte)5;
      byte byte1 = (byte)81;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)81, byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test
  public void test022()  throws Throwable  {
      byte byte0 = (byte)5;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertEquals((byte)5, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test
  public void test023()  throws Throwable  {
      short short0 = (short)13;
      short short1 = (short)498;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)498, short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test
  public void test024()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)529;
      short short2 = NumberUtils.max(short0, short1, short1);
      assertEquals((short)529, short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
  }

  @Test
  public void test025()  throws Throwable  {
      byte byte0 = (byte) (-124);
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte) (-124), byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = 69;
      int int1 = NumberUtils.max((int) byte1, (int) byte1, int0);
      assertEquals(69, int1);
      assertTrue(byte1 == byte0);
      assertTrue(int0 == int1);
      assertTrue(byte0 == byte1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test026()  throws Throwable  {
      int int0 = 0;
      int int1 = 3;
      int int2 = NumberUtils.max(int0, int1, int1);
      assertEquals(3, int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test
  public void test027()  throws Throwable  {
      long long0 = 3347L;
      long long1 = (-3098L);
      long long2 = NumberUtils.max(long1, long1, long0);
      assertEquals(3347L, long2);
      assertTrue(long2 == long0);
      assertFalse(long2 == long1);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
      assertFalse(long0 == long1);
      assertTrue(long0 == long2);
  }

  @Test
  public void test028()  throws Throwable  {
      byte byte0 = (byte) (-44);
      byte byte1 = (byte)84;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertEquals((byte)84, byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      
      long long0 = NumberUtils.max((long) byte0, (long) byte2, (long) byte2);
      assertEquals(84L, long0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test
  public void test029()  throws Throwable  {
      byte byte0 = (byte)73;
      byte byte1 = (byte) (-111);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertEquals((byte) (-111), byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
  }

  @Test
  public void test030()  throws Throwable  {
      byte byte0 = (byte) (-44);
      byte byte1 = (byte)84;
      byte byte2 = NumberUtils.min(byte1, byte0, byte1);
      assertEquals((byte) (-44), byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte0 == byte2);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertFalse(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test
  public void test031()  throws Throwable  {
      short short0 = (short)65;
      short short1 = (short) (-515);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertEquals((short) (-515), short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
  }

  @Test
  public void test032()  throws Throwable  {
      short short0 = (short)65;
      short short1 = (short)0;
      short short2 = NumberUtils.min(short0, short1, short0);
      assertEquals((short)0, short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
  }

  @Test
  public void test033()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      int int2 = NumberUtils.min(int0, int0, int1);
      assertEquals((-1), int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test
  public void test034()  throws Throwable  {
      byte byte0 = (byte) (-44);
      byte byte1 = (byte)84;
      int int0 = NumberUtils.min((int) byte1, (int) byte0, (int) byte0);
      assertEquals((-44), int0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test
  public void test035()  throws Throwable  {
      long long0 = (-11L);
      long long1 = (-859L);
      long long2 = NumberUtils.min(long0, long0, long1);
      assertEquals((-859L), long2);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
  }

  @Test
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = 2813;
      long long0 = NumberUtils.min((long) int0, (long) byteArray0[0], (long) int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test037()  throws Throwable  {
      short short0 = (short)45;
      float[] floatArray0 = new float[2];
      floatArray0[1] = (float) short0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 45.0F}, floatArray0, 0.01F);
      assertEquals(45.0F, float0, 0.01F);
  }

  @Test
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test
  public void test039()  throws Throwable  {
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
  public void test040()  throws Throwable  {
      short short0 = (short)45;
      short short1 = NumberUtils.min(short0, short0, short0);
      assertEquals((short)45, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      
      double[] doubleArray0 = new double[15];
      doubleArray0[1] = (double) short1;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 45.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(45.0, double0, 0.01D);
  }

  @Test
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)54;
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)54, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)54, byte1);
      assertTrue(byte1 == byte0);
  }

  @Test
  public void test043()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short) (-788);
      shortArray0[0] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short) (-788), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short1);
      assertFalse(short1 == short0);
  }

  @Test
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = (-940);
      intArray0[0] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {(-940), 0, 0, 0}, intArray0);
      assertEquals(0, int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      int int0 = (-940);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) int0;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {(-940L), 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
      assertEquals(0L, long0);
  }

  @Test
  public void test050()  throws Throwable  {
      short short0 = (short)45;
      float[] floatArray0 = new float[16];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[5] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
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
      double[] doubleArray0 = new double[8];
      double double0 = (-595.4);
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, (-595.4), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-595.4), double1, 0.01D);
      assertTrue(double1 == double0);
  }

  @Test
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = Double.NaN;
      doubleArray0[5] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
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
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-1);
      byteArray0[8] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertEquals((byte) (-1), byte1);
      assertTrue(byte1 == byte0);
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
      byte byte0 = (byte)4;
      short[] shortArray0 = new short[10];
      shortArray0[0] = (short) byte0;
      short short0 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)4, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[14];
      int int0 = (-394);
      intArray0[2] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0, 0, (-394), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals((-394), int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      long long0 = (-11L);
      long[] longArray0 = new long[5];
      longArray0[3] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, (-11L), 0L}, longArray0);
      assertEquals((-11L), long1);
      assertTrue(long1 == long0);
  }

  @Test
  public void test063()  throws Throwable  {
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
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test067()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test068()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test069()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test070()  throws Throwable  {
      String string0 = "07 2-p0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
      }
  }

  @Test
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
      String string0 = "-^0x2@a~:l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -^0x2@a~:l is not a valid number.
         //
      }
  }

  @Test
  public void test073()  throws Throwable  {
      String string0 = "VZucT'f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // VZucT'f is not a valid number.
         //
      }
  }

  @Test
  public void test074()  throws Throwable  {
      String string0 = "d";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d is not a valid number.
         //
      }
  }

  @Test
  public void test075()  throws Throwable  {
      String string0 = "3L";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(3L, (long)long0);
  }

  @Test
  public void test076()  throws Throwable  {
      String string0 = "7D";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(7.0, (double)double0, 0.01D);
  }

  @Test
  public void test077()  throws Throwable  {
      String string0 = "0.x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.x is not a valid number.
         //
      }
  }

  @Test
  public void test078()  throws Throwable  {
      String string0 = "jhH|P2B;\\TxE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // jhH|P2B;\\TxE is not a valid number.
         //
      }
  }

  @Test
  public void test079()  throws Throwable  {
      String string0 = "Minimum abbreviation width is 4";
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
  public void test080() {}
//   @Test
//   public void test080()  throws Throwable  {
//       String string0 = "3L@}3to+U`EdW}2bez";
//       try {
//         Number number0 = NumberUtils.createNumber(string0);
//         fail("Expecting exception: NumberFormatException");
//       
//       } catch(NumberFormatException e) {
//          //
//          // 3L@}3to+U`EdW}2bez is not a valid number.
//          //
//       }
//   }

  @Test
  public void test081()  throws Throwable  {
      String string0 = "o*0kn m<E:^1JVF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // o*0kn m<E:^1JVF is not a valid number.
         //
      }
  }

  @Test
  public void test082() {}
//   @Test
//   public void test082()  throws Throwable  {
//       String string0 = "$ .0vW'  etEwE|X";
//       try {
//         Number number0 = NumberUtils.createNumber(string0);
//         fail("Expecting exception: NumberFormatException");
//       
//       } catch(NumberFormatException e) {
//          //
//          // $ .0vW'  etEwE|X is not a valid number.
//          //
//       }
//   }

  @Test
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
      String string0 = "0.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test
  public void test085()  throws Throwable  {
      String string0 = ".E.";
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
  public void test088()  throws Throwable  {
      String string0 = "0x";
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
  public void test089()  throws Throwable  {
      String string0 = "--_hj.C9e$/vq9";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test090()  throws Throwable  {
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
  public void test091()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
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
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte)0, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test
  public void test094()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test095()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test096()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
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
      String string0 = "H[B_k\\";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test099()  throws Throwable  {
      byte byte0 = (byte) (-44);
      float float0 = NumberUtils.max((float) byte0, (float) byte0, (float) byte0);
      assertEquals((-44.0F), float0, 0.01F);
  }

  @Test
  public void test100()  throws Throwable  {
      String string0 = "-0x";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test101()  throws Throwable  {
      String string0 = "The Array must not be null";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test102()  throws Throwable  {
      float float0 = (-751.9651F);
      byte byte0 = (byte)0;
      float float1 = NumberUtils.min((float) byte0, (float) byte0, float0);
      assertEquals((-751.9651F), float1, 0.01F);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
  }

  @Test
  public void test103()  throws Throwable  {
      byte byte0 = (byte)0;
      double double0 = NumberUtils.min((double) byte0, (double) byte0, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test104()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test105()  throws Throwable  {
      String string0 = "0x0if?{VFM";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test106()  throws Throwable  {
      double double0 = (-1849.9761420130667);
      byte byte0 = (byte)54;
      double double1 = NumberUtils.max(double0, double0, (double) byte0);
      assertEquals(54.0, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test107()  throws Throwable  {
      String string0 = "!`X";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test108()  throws Throwable  {
      String string0 = "0xB";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
