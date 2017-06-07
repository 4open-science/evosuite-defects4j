/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:04:44 GMT 2014
 */

package org.apache.commons.math.stat.clustering;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class KMeansPlusPlusClustererEvoSuite_branch_Test extends KMeansPlusPlusClustererEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      long long0 = 5522L;
      MockRandom mockRandom0 = new MockRandom(long0);
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      int[] intArray0 = new int[29];
      int int0 = Integer.MAX_VALUE;
      intArray0[0] = int0;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {Integer.MAX_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      assertArrayEquals(new int[] {Integer.MAX_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      assertEquals("[(2147483647,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      boolean boolean1 = linkedList0.add(euclideanIntegerPoint0);
      assertArrayEquals(new int[] {Integer.MAX_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals("[(2147483647,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0), (2147483647,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      
      // Undeclared exception!
      try {
        List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, intArray0[0], intArray0[0]);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      long long0 = (-2801L);
      MockRandom mockRandom0 = new MockRandom(long0);
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      int[] intArray0 = new int[10];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      assertEquals("[(0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      int int0 = (-1924);
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, int0, int0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals("[(0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertNotNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      long long0 = (-2801L);
      MockRandom mockRandom0 = new MockRandom(long0);
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      int int0 = 0;
      int[] intArray0 = new int[10];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.add(euclideanIntegerPoint0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      assertEquals("[(0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, int0, int0);
      assertEquals("[(0,0,0,0,0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }
}
