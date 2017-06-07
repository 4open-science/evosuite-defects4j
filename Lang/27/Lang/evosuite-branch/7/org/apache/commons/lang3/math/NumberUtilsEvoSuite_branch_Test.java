/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:51:53 GMT 2014
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
  public void test00()  throws Throwable  {
      String string0 = "l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "+3.bG,buCRdO'U!H";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "eT8";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "0ee+0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "0.0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "1E9";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "-0xgz=hL";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "-0x10e9";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "0x1E9/G?(H9l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "--s7Rh+7";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "-0Xfw;.F8%Sa$";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "E";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      byte byte1 = (byte)82;
      assertFalse(byte1 == byte0);
      
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)82, byte2);
  }

  @Test
  public void test21()  throws Throwable  {
      byte byte0 = (byte)57;
      byte byte1 = (byte)70;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte)70, byte2);
  }

  @Test
  public void test22()  throws Throwable  {
      byte byte0 = (byte)57;
      byte byte1 = (byte)70;
      short short0 = NumberUtils.max((short) byte0, (short) byte0, (short) byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((short)70, short0);
  }

  @Test
  public void test23()  throws Throwable  {
      short short0 = (short) (-1);
      short short1 = (short)64;
      short short2 = NumberUtils.max(short0, short1, short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertEquals((short)64, short2);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)0;
      short short0 = NumberUtils.toShort(string0, (short) byte0);
      assertEquals((short)0, short0);
      
      short short1 = NumberUtils.max(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)0, short1);
  }

  @Test
  public void test25()  throws Throwable  {
      int int0 = 0;
      int int1 = 1714;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertEquals(1714, int2);
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = 0;
      int int1 = 10;
      int int2 = NumberUtils.max(int0, int1, int1);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(10, int2);
  }

  @Test
  public void test27()  throws Throwable  {
      byte byte0 = (byte) (-10);
      long long0 = 2119L;
      long long1 = NumberUtils.max((long) byte0, (long) byte0, long0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(2119L, long1);
  }

  @Test
  public void test28()  throws Throwable  {
      long[] longArray0 = new long[5];
      int int0 = (-1084);
      long long0 = NumberUtils.max((long) int0, longArray0[2], longArray0[0]);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test29()  throws Throwable  {
      byte byte0 = (byte)57;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)57, byte1);
      
      byte byte2 = (byte) (-75);
      assertFalse(byte2 == byte1);
      
      byte byte3 = NumberUtils.min(byte0, byte1, byte2);
      assertFalse(byte0 == byte2);
      assertTrue(byte0 == byte1);
      assertFalse(byte0 == byte3);
      assertFalse(byte1 == byte3);
      assertFalse(byte1 == byte2);
      assertTrue(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertTrue(byte2 == byte3);
      assertFalse(byte3 == byte0);
      assertTrue(byte3 == byte2);
      assertFalse(byte3 == byte1);
      assertEquals((byte) (-75), byte3);
  }

  @Test
  public void test30()  throws Throwable  {
      byte byte0 = (byte)57;
      byte byte1 = (byte)70;
      byte byte2 = NumberUtils.min(byte1, byte0, byte1);
      assertFalse(byte0 == byte1);
      assertTrue(byte0 == byte2);
      assertFalse(byte2 == byte1);
      assertTrue(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte1 == byte2);
      assertEquals((byte)57, byte2);
  }

  @Test
  public void test31()  throws Throwable  {
      short short0 = (short) (-111);
      short short1 = (short) (-1632);
      short short2 = NumberUtils.min(short0, short1, short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertEquals((short) (-1632), short2);
  }

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)90;
      byte byte1 = (byte)26;
      int int0 = NumberUtils.min((int) byte0, (int) byte1, (int) byteArray0[0]);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test33()  throws Throwable  {
      short short0 = (short)64;
      int int0 = NumberUtils.min((int) short0, (int) short0, (int) short0);
      assertEquals(64, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      short short0 = (short)1412;
      short short1 = (short)0;
      short short2 = NumberUtils.min(short0, short0, short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short)0, short2);
      
      long long0 = NumberUtils.min((long) short0, (long) short0, (long) short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals(0L, long0);
  }

  @Test
  public void test35()  throws Throwable  {
      short short0 = (short)1412;
      short short1 = (short)0;
      short short2 = NumberUtils.min(short0, short0, short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertEquals((short)0, short2);
      
      long long0 = NumberUtils.min((long) short0, (long) short1, (long) short2);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertEquals(0L, long0);
  }

  @Test
  public void test36()  throws Throwable  {
      short short0 = (short) (-1);
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {(-1.0F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test37()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[6] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      short short0 = (short)5;
      doubleArray0[2] = (double) short0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(5.0, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 5.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test41()  throws Throwable  {
      byte byte0 = (byte)57;
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)57, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)57, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test42()  throws Throwable  {
      short short0 = (short)108;
      short[] shortArray0 = new short[4];
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)108, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)108, (short)0}, shortArray0);
  }

  @Test
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 68;
      intArray0[4] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertTrue(int1 == int0);
      assertEquals(68, int1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 68, 0, 0, 0}, intArray0);
  }

  @Test
  public void test44()  throws Throwable  {
      long[] longArray0 = new long[5];
      long long0 = (-1L);
      longArray0[0] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {(-1L), 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      short short0 = (short)3010;
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) short0;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {3010.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test47()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)126;
      byteArray0[1] = byte0;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) byteArray0[1];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {126.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byte byte0 = (byte) (-18);
      byteArray0[7] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-18), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-18), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test52()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short)3010;
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertFalse(short1 == short0);
      assertEquals((short)0, short1);
      assertArrayEquals(new short[] {(short)3010, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test
  public void test53()  throws Throwable  {
      byte byte0 = (byte) (-89);
      int[] intArray0 = new int[10];
      intArray0[1] = (int) byte0;
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-89), int0);
      assertArrayEquals(new int[] {0, (-89), 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)90;
      byteArray0[0] = byte0;
      byteArray0[3] = byteArray0[0];
      long[] longArray0 = new long[11];
      longArray0[0] = (long) byteArray0[3];
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {90L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test58()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test59()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test60()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test61()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test62()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test63()  throws Throwable  {
      String string0 = ".0";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test
  public void test64()  throws Throwable  {
      String string0 = "g],^2[mTZ^/ws3";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"g],^2\"
         //
      }
  }

  @Test
  public void test65()  throws Throwable  {
      String string0 = "1E9V/G1(H9l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 1E9V/G1(H9l is not a valid number.
         //
      }
  }

  @Test
  public void test66()  throws Throwable  {
      String string0 = "IllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalAccessException occurred is not a valid number.
         //
      }
  }

  @Test
  public void test67()  throws Throwable  {
      String string0 = "gz=hL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // gz=hL is not a valid number.
         //
      }
  }

  @Test
  public void test68()  throws Throwable  {
      String string0 = "W^YBu>A\"8vXrawF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // W^YBu>A\"8vXrawF is not a valid number.
         //
      }
  }

  @Test
  public void test69()  throws Throwable  {
      String string0 = "d6 b6%nd H<ksmI uqD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d6 b6%nd H<ksmI uqD is not a valid number.
         //
      }
  }

  @Test
  public void test70()  throws Throwable  {
      String string0 = "0ee+0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0ee+0 is not a valid number.
         //
      }
  }

  @Test
  public void test71()  throws Throwable  {
      String string0 = "0e";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
      }
  }

  @Test
  public void test72()  throws Throwable  {
      String string0 = "K<BIE^eS6";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // K<BIE^eS6 is not a valid number.
         //
      }
  }

  @Test
  public void test73()  throws Throwable  {
      String string0 = "0f";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test
  public void test74()  throws Throwable  {
      String string0 = " is not a valid number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
      }
  }

  @Test
  public void test75()  throws Throwable  {
      String string0 = " d{ZrL.";
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
  public void test76()  throws Throwable  {
      String string0 = ".l^._\\;+nT6ew";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .l^._\\;+nT6ew is not a valid number.
         //
      }
  }

  @Test
  public void test77()  throws Throwable  {
      String string0 = "-0X.l^._\\;+nT6ewB&";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-.l^._\\;+nT6ewB&\"
         //
      }
  }

  @Test
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      String string0 = "-0xIllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-IllegalAccessException occurred\"
         //
      }
  }

  @Test
  public void test80()  throws Throwable  {
      String string0 = "0x d{ZrL.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \" d{ZrL.\"
         //
      }
  }

  @Test
  public void test81()  throws Throwable  {
      String string0 = "--";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test82()  throws Throwable  {
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
  public void test83()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test84()  throws Throwable  {
      String string0 = "1E9";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(1.0E9F, (float)float0, 0.01F);
  }

  @Test
  public void test85()  throws Throwable  {
      String string0 = "E";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.toDouble(string0, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test86()  throws Throwable  {
      String string0 = null;
      short short0 = (short)108;
      float float0 = NumberUtils.toFloat(string0, (float) short0);
      assertEquals(108.0F, float0, 0.01F);
  }

  @Test
  public void test87()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test88()  throws Throwable  {
      String string0 = null;
      short short0 = (short)14;
      int int0 = NumberUtils.toInt(string0, (int) short0);
      assertEquals(14, int0);
  }

  @Test
  public void test89()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test90()  throws Throwable  {
      long long0 = 3386L;
      int int0 = 651;
      float float0 = NumberUtils.max((float) int0, (float) long0, (float) long0);
      assertEquals(3386.0F, float0, 0.01F);
  }

  @Test
  public void test91()  throws Throwable  {
      String string0 = "E";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test92()  throws Throwable  {
      float[] floatArray0 = new float[9];
      short short0 = (short)64;
      float float0 = NumberUtils.min((float) short0, floatArray0[2], (float) short0);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test93()  throws Throwable  {
      String string0 = "E";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.min((double) byte0, (double) byte0, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test94()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test95()  throws Throwable  {
      String string0 = "29";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)29, short0);
  }

  @Test
  public void test96()  throws Throwable  {
      String string0 = null;
      long long0 = 3386L;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.max((double) byte0, (double) long0, (double) byte0);
      assertEquals(3386.0, double0, 0.01D);
  }

  @Test
  public void test97()  throws Throwable  {
      String string0 = "E";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test98()  throws Throwable  {
      String string0 = "1E9";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
