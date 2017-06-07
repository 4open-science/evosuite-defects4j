/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:02:43 GMT 2014
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
      String string0 = "f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "e";
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
      String string0 = "--0Xa0?F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "+UsOp,/7?JYEAN4u-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "E'E&mDWr{kU}G`";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "eV?s}YE)3_gR&B_,]t)";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "8*A1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "-0x}f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "0xa0F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "0xA blank string is not a valid number";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "9";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)115;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)115, byte2);
  }

  @Test
  public void test19()  throws Throwable  {
      byte byte0 = (byte) (-107);
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-107), byte1);
  }

  @Test
  public void test20()  throws Throwable  {
      byte byte0 = (byte)0;
      short short0 = (short)3;
      short short1 = NumberUtils.max((short) byte0, (short) byte0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short)3, short1);
  }

  @Test
  public void test21()  throws Throwable  {
      short short0 = (short) (-1512);
      short short1 = (short)0;
      short short2 = NumberUtils.max(short0, short1, short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short)0, short2);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "org.apache.commons.lang3.StringUtils";
      byte byte0 = (byte)72;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)72, byte1);
      
      int int0 = 790;
      int int1 = NumberUtils.max((int) byte1, (int) byte1, int0);
      assertTrue(int0 == int1);
      assertTrue(byte1 == byte0);
      assertTrue(int1 == int0);
      assertTrue(byte0 == byte1);
      assertEquals(790, int1);
  }

  @Test
  public void test23()  throws Throwable  {
      byte byte0 = (byte)27;
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte0);
      assertEquals((short)27, short0);
      
      int int0 = (-2811);
      int int1 = NumberUtils.max(int0, (int) byte0, (int) short0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(27, int1);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = 76;
      short[] shortArray0 = new short[3];
      short short0 = (short)1796;
      shortArray0[2] = short0;
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) shortArray0[2]);
      assertEquals(1796L, long0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)1796}, shortArray0);
  }

  @Test
  public void test25()  throws Throwable  {
      short[] shortArray0 = new short[3];
      long long0 = (-2870L);
      long long1 = NumberUtils.max(long0, (long) shortArray0[0], (long) shortArray0[2]);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(0L, long1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0}, shortArray0);
  }

  @Test
  public void test26()  throws Throwable  {
      byte byte0 = (byte)73;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte)0, byte2);
  }

  @Test
  public void test27()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = (byte) (-111);
      byte byte2 = NumberUtils.min(byte0, byte1, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte) (-111), byte2);
  }

  @Test
  public void test28()  throws Throwable  {
      byte byte0 = (byte)27;
      short short0 = (short)1141;
      short short1 = (short)718;
      short short2 = NumberUtils.min(short0, short1, (short) byte0);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertFalse(short2 == short1);
      assertFalse(short2 == short0);
      assertEquals((short)27, short2);
  }

  @Test
  public void test29()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short short0 = (short)1312;
      shortArray0[0] = short0;
      short short1 = (short)7;
      int int0 = NumberUtils.min((int) short0, (int) shortArray0[0], (int) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals(7, int0);
      assertArrayEquals(new short[] {(short)1312}, shortArray0);
  }

  @Test
  public void test30()  throws Throwable  {
      int int0 = 0;
      byte byte0 = (byte) (-93);
      int int1 = NumberUtils.min(int0, (int) byte0, (int) byte0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-93), int1);
  }

  @Test
  public void test31()  throws Throwable  {
      long long0 = 275L;
      long long1 = 0L;
      long long2 = NumberUtils.min(long0, long0, long1);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertEquals(0L, long2);
  }

  @Test
  public void test32()  throws Throwable  {
      int int0 = 1848;
      long[] longArray0 = new long[6];
      longArray0[0] = (long) int0;
      long long0 = NumberUtils.min(longArray0[0], longArray0[5], longArray0[1]);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {1848L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test33()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)76;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertEquals((byte)76, byte2);
      
      float[] floatArray0 = new float[4];
      floatArray0[3] = (float) byte2;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(76.0F, float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 76.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test34()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = doubleArray0[1];
      double double0 = 1733.819363075345;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertTrue(double1 == double0);
      assertEquals(1733.819363075345, double1, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1733.819363075345, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.NaN;
      doubleArray0[7] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte)43;
      byteArray0[6] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)43, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)43, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test
  public void test39()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short short0 = (short)1796;
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)1796, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)1796}, shortArray0);
  }

  @Test
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      int int0 = 1281;
      int[] intArray0 = new int[10];
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertTrue(int1 == int0);
      assertEquals(1281, int1);
      assertArrayEquals(new int[] {0, 1281, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test
  public void test42()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = 1L;
      longArray0[5] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertTrue(long1 == long0);
      assertEquals(1L, long1);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 1L}, longArray0);
  }

  @Test
  public void test43()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = (-2512.5F);
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertTrue(float1 == float0);
      assertEquals((-2512.5F), float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, (-2512.5F), 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test44()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-633.2021);
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertTrue(double1 == double0);
      assertEquals((-633.2021), double1, 0.01D);
      assertArrayEquals(new double[] {0.0, (-633.2021), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.NaN;
      doubleArray0[7] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-81);
      byteArray0[6] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-81), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-81)}, byteArray0);
  }

  @Test
  public void test49()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short short0 = (short) (-1);
      shortArray0[2] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-1), short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short) (-1)}, shortArray0);
  }

  @Test
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = (-447);
      intArray0[3] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertTrue(int1 == int0);
      assertEquals((-447), int1);
      assertArrayEquals(new int[] {0, 0, 0, (-447)}, intArray0);
  }

  @Test
  public void test52()  throws Throwable  {
      int int0 = 1848;
      long[] longArray0 = new long[6];
      longArray0[0] = (long) int0;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {1848L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test56()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test57()  throws Throwable  {
      String string0 = ">1ir~W";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">1ir~W\"
         //
      }
  }

  @Test
  public void test58()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test59()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test60()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test61()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test62()  throws Throwable  {
      String string0 = "0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test63()  throws Throwable  {
      String string0 = "]zZr95(Q+\\0e-6";
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
  public void test64()  throws Throwable  {
      String string0 = "Te Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Te Array must not be null is not a valid number.
         //
      }
  }

  @Test
  public void test65()  throws Throwable  {
      String string0 = "HNtt6;FB0Sv<nf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // HNtt6;FB0Sv<nf is not a valid number.
         //
      }
  }

  @Test
  public void test66()  throws Throwable  {
      String string0 = "IllegalArgumentException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalArgumentException occurred is not a valid number.
         //
      }
  }

  @Test
  public void test67()  throws Throwable  {
      String string0 = "&,Y9uDCg^L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // &,Y9uDCg^L is not a valid number.
         //
      }
  }

  @Test
  public void test68()  throws Throwable  {
      String string0 = "a0?F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // a0?F is not a valid number.
         //
      }
  }

  @Test
  public void test69()  throws Throwable  {
      String string0 = ". blank string is not aalid numbe";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // . blank string is not aalid numbe is not a valid number.
         //
      }
  }

  @Test
  public void test70()  throws Throwable  {
      String string0 = "`Mp\"DNn<`:`.1p_64";
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
  public void test71()  throws Throwable  {
      String string0 = "}EOP5GK[iN9e";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // }EOP5GK[iN9e is not a valid number.
         //
      }
  }

  @Test
  public void test72()  throws Throwable  {
      String string0 = "2l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(2L, (long)long0);
  }

  @Test
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
      String string0 = ".";
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
  public void test75()  throws Throwable  {
      String string0 = "-0X-";
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
  public void test76()  throws Throwable  {
      String string0 = "0Xa0?F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"a0?F\"
         //
      }
  }

  @Test
  public void test77()  throws Throwable  {
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
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      String string0 = "--";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test80()  throws Throwable  {
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
  public void test81()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test82()  throws Throwable  {
      short short0 = (short) (-1512);
      String string0 = null;
      short short1 = NumberUtils.toShort(string0, short0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertEquals((short) (-1512), short1);
  }

  @Test
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      String string0 = null;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test
  public void test84()  throws Throwable  {
      String string0 = null;
      short[] shortArray0 = new short[1];
      double double0 = NumberUtils.toDouble(string0, (double) shortArray0[0]);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
  }

  @Test
  public void test85()  throws Throwable  {
      String string0 = "*";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test86()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      String string0 = null;
      long long0 = NumberUtils.toLong(string0, (long) byte0);
      assertEquals(0L, long0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test
  public void test87()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test
  public void test88()  throws Throwable  {
      String string0 = "e";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test89()  throws Throwable  {
      String string0 = "9";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(9, int0);
      
      float float0 = NumberUtils.max((float) int0, (float) int0, (float) int0);
      assertEquals(9.0F, float0, 0.01F);
  }

  @Test
  public void test90()  throws Throwable  {
      String string0 = "-0x";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test91()  throws Throwable  {
      String string0 = "E'E&mDWr{kU}G`";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test92()  throws Throwable  {
      short[] shortArray0 = new short[1];
      float float0 = NumberUtils.min((float) shortArray0[0], (float) shortArray0[0], (float) shortArray0[0]);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new short[] {(short)0}, shortArray0);
  }

  @Test
  public void test93()  throws Throwable  {
      short short0 = (short)1312;
      double double0 = NumberUtils.min((double) short0, (double) short0, (double) short0);
      assertEquals(1312.0, double0, 0.01D);
  }

  @Test
  public void test94()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test95()  throws Throwable  {
      String string0 = "KkfwIKxdz96#%";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test96()  throws Throwable  {
      int int0 = 0;
      double double0 = NumberUtils.max((double) int0, (double) int0, (double) int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test97()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}