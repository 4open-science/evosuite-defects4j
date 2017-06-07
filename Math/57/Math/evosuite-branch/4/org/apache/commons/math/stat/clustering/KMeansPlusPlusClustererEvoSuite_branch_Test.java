/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:49:48 GMT 2014
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
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      int int0 = 169;
      org.evosuite.runtime.Random.setNextRandom(int0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      int[] intArray0 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.offer(euclideanIntegerPoint0);
      assertEquals("[(0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      
      int[] intArray1 = new int[6];
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray1.equals((Object)intArray0));
      
      linkedList0.push(euclideanIntegerPoint0);
      assertNotSame(intArray0, intArray1);
      assertEquals("[(0,0,0,0,0,0), (0,0,0,0,0,0)]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      assertFalse(intArray0.equals((Object)intArray1));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      
      intArray1[5] = int0;
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      assertNotSame(euclideanIntegerPoint1, euclideanIntegerPoint0);
      assertNotSame(intArray1, intArray0);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 169}, intArray1);
      assertNotNull(euclideanIntegerPoint1);
      
      boolean boolean1 = linkedList0.offer(euclideanIntegerPoint1);
      assertNotSame(euclideanIntegerPoint1, euclideanIntegerPoint0);
      assertNotSame(intArray1, intArray0);
      assertEquals(3, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0), (0,0,0,0,0,0), (0,0,0,0,0,169)]", linkedList0.toString());
      assertTrue(boolean1 == boolean0);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 169}, intArray1);
      assertTrue(boolean1);
      
      // Undeclared exception!
      try {
        List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, intArray1[5], int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      int int0 = 169;
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      int int1 = 1;
      int[] intArray0 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.offer(euclideanIntegerPoint0);
      assertEquals(1, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0)]", linkedList0.toString());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      
      int[] intArray1 = new int[6];
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray1.equals((Object)intArray0));
      
      intArray1[5] = int0;
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      assertNotSame(euclideanIntegerPoint1, euclideanIntegerPoint0);
      assertNotSame(intArray1, intArray0);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 169}, intArray1);
      assertNotNull(euclideanIntegerPoint1);
      
      boolean boolean1 = linkedList0.offer(euclideanIntegerPoint1);
      assertNotSame(euclideanIntegerPoint1, euclideanIntegerPoint0);
      assertNotSame(intArray1, intArray0);
      assertEquals(2, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0), (0,0,0,0,0,169)]", linkedList0.toString());
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
      assertFalse(intArray1.equals((Object)intArray0));
      assertTrue(boolean1 == boolean0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 169}, intArray1);
      assertTrue(boolean1);
      
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, int1, intArray1[5]);
      assertNotSame(intArray1, intArray0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(2, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0), (0,0,0,0,0,169)]", linkedList0.toString());
      assertFalse(int1 == int0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 169}, intArray1);
      assertNotNull(list0);
  }

  @Test
  public void test2()  throws Throwable  {
      long long0 = (-588L);
      MockRandom mockRandom0 = new MockRandom(long0);
      assertNotNull(mockRandom0);
      
      int int0 = (-17);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0, (KMeansPlusPlusClusterer.EmptyClusterStrategy) kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      int[] intArray0 = new int[3];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      linkedList0.addFirst(euclideanIntegerPoint0);
      assertEquals(1, linkedList0.size());
      assertEquals("[(0,0,0)]", linkedList0.toString());
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, int0, int0);
      assertEquals(1, linkedList0.size());
      assertEquals("[(0,0,0)]", linkedList0.toString());
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>((Random) mockRandom0);
      assertNotNull(kMeansPlusPlusClusterer0);
      
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      int int0 = 1;
      int[] intArray0 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(euclideanIntegerPoint0);
      
      boolean boolean0 = linkedList0.offer(euclideanIntegerPoint0);
      assertEquals(1, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0)]", linkedList0.toString());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(boolean0);
      
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster((Collection<EuclideanIntegerPoint>) linkedList0, int0, intArray0[5]);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertEquals("[(0,0,0,0,0,0)]", linkedList0.toString());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(list0);
  }
}
