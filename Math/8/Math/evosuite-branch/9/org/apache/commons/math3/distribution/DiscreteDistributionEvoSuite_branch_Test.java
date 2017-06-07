/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:40:39 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DiscreteDistributionEvoSuite_branch_Test extends DiscreteDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      short short0 = (short)994;
      Short short1 = new Short(short0);
      assertEquals((short)994, (short)short1);
      assertTrue(short1.equals((Object)short0));
      
      Double double0 = new Double((double) short1);
      assertEquals(994.0, (double)double0, 0.01D);
      assertTrue(short1.equals((Object)short0));
      
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short1, double0);
      assertNotNull(pair0);
      assertTrue(short1.equals((Object)short0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(short1.equals((Object)short0));
      
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((List<Pair<Short, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      int int0 = (-2126);
      try {
        Object[] objectArray0 = discreteDistribution0.sample(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,126)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      short short0 = (short)994;
      Short short1 = new Short(short0);
      assertEquals((short)994, (short)short1);
      assertTrue(short1.equals((Object)short0));
      
      Double double0 = new Double((double) short1);
      assertEquals(994.0, (double)double0, 0.01D);
      assertTrue(short1.equals((Object)short0));
      
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short1, double0);
      assertNotNull(pair0);
      assertTrue(short1.equals((Object)short0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(short1.equals((Object)short0));
      
      boolean boolean1 = linkedList0.offer(pair0);
      assertEquals(2, linkedList0.size());
      assertTrue(boolean1);
      assertTrue(short1.equals((Object)short0));
      assertTrue(boolean1 == boolean0);
      
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((List<Pair<Short, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(2, linkedList0.size());
      
      Object[] objectArray0 = discreteDistribution0.sample((int) short1);
      assertNotNull(objectArray0);
      assertEquals(2, linkedList0.size());
      assertTrue(short1.equals((Object)short0));
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      short short0 = (short)994;
      Short short1 = new Short(short0);
      assertEquals((short)994, (short)short1);
      assertTrue(short1.equals((Object)short0));
      
      Double double0 = new Double((double) short1);
      assertEquals(994.0, (double)double0, 0.01D);
      assertTrue(short1.equals((Object)short0));
      
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short1, double0);
      assertNotNull(pair0);
      assertTrue(short1.equals((Object)short0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(short1.equals((Object)short0));
      
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((List<Pair<Short, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      List<Pair<Short, Double>> list0 = discreteDistribution0.getSamples();
      assertNotNull(list0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, linkedList0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      byte byte0 = (byte)51;
      Byte byte1 = new Byte(byte0);
      assertEquals((byte)51, (byte)byte1);
      assertTrue(byte1.equals((Object)byte0));
      
      Double double0 = new Double((double) byte0);
      assertEquals(51.0, (double)double0, 0.01D);
      
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte1, double0);
      assertNotNull(pair0);
      assertTrue(byte1.equals((Object)byte0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(byte1.equals((Object)byte0));
      
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      byte byte2 = (byte)78;
      Byte byte3 = new Byte(byte2);
      assertNotSame(byte3, byte1);
      assertEquals((byte)78, (byte)byte3);
      assertFalse(byte2 == byte0);
      assertTrue(byte3.equals((Object)byte2));
      assertFalse(byte3.equals((Object)byte1));
      assertFalse(byte3.equals((Object)byte0));
      
      double double1 = discreteDistribution0.probability(byte3);
      assertNotSame(byte3, byte1);
      assertEquals(1, linkedList0.size());
      assertEquals(0.0, double1, 0.01D);
      assertFalse(byte2 == byte0);
      assertTrue(byte3.equals((Object)byte2));
      assertFalse(byte3.equals((Object)byte1));
      assertFalse(byte3.equals((Object)byte0));
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Pair<Pair<Object, Integer>, Double>> linkedList0 = new LinkedList<Pair<Pair<Object, Integer>, Double>>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      long long0 = 4499201580859392L;
      Long long1 = new Long(long0);
      assertEquals(4499201580859392L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      int int0 = 709;
      Pair<Long, Integer> pair0 = new Pair<Long, Integer>(long1, (Integer) int0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Object, Integer> pair1 = new Pair<Object, Integer>(pair0);
      assertNotNull(pair1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(4.499201580859392E15, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Pair<Object, Integer>, Double> pair2 = new Pair<Pair<Object, Integer>, Double>(pair1, double0);
      assertNotNull(pair2);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.add(pair2);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Pair<Object, Integer>> discreteDistribution0 = new DiscreteDistribution<Pair<Object, Integer>>((List<Pair<Pair<Object, Integer>, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      Pair<Object, Integer> pair3 = null;
      double double1 = discreteDistribution0.probability(pair3);
      assertEquals(1, linkedList0.size());
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      byte byte0 = (byte)51;
      Byte byte1 = new Byte(byte0);
      assertEquals((byte)51, (byte)byte1);
      assertTrue(byte1.equals((Object)byte0));
      
      Double double0 = new Double((double) byte0);
      assertEquals(51.0, (double)double0, 0.01D);
      
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte1, double0);
      assertNotNull(pair0);
      assertTrue(byte1.equals((Object)byte0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(byte1.equals((Object)byte0));
      
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      double double1 = discreteDistribution0.probability((Byte) byte0);
      assertEquals(1, linkedList0.size());
      assertEquals(1.0, double1, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 36;
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      Double double0 = new Double((double) int0);
      assertEquals(36.0, (double)double0, 0.01D);
      
      String string0 = null;
      Pair<String, Double> pair0 = new Pair<String, Double>(string0, double0);
      assertNotNull(pair0);
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      double double1 = discreteDistribution0.probability(string0);
      assertEquals(1, linkedList0.size());
      assertEquals(1.0, double1, 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      double double0 = (-0.606209);
      Float float0 = new Float(double0);
      assertEquals((-0.606209F), (float)float0, 0.01F);
      
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) float0, (Double) double0);
      assertNotNull(pair0);
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0.606 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 36;
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      Double double0 = new Double((double) int0);
      assertEquals(36.0, (double)double0, 0.01D);
      
      String string0 = null;
      Pair<String, Double> pair0 = new Pair<String, Double>(string0, double0);
      assertNotNull(pair0);
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertNotNull(discreteDistribution0);
      assertEquals(1, linkedList0.size());
      
      discreteDistribution0.reseedRandomGenerator((long) int0);
      assertEquals(1, linkedList0.size());
  }
}
