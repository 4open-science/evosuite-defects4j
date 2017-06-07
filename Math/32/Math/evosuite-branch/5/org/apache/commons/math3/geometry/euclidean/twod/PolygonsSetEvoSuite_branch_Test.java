/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:21:26 GMT 2014
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PolygonsSetEvoSuite_branch_Test extends PolygonsSetEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = Double.NEGATIVE_INFINITY;
      double double1 = 77.79832231;
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      
      // Undeclared exception!
      try {
        Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-1941.0);
      double double1 = 0.0;
      double double2 = (-38.86543068738707);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double0, double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      
      Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotNull(vector0);
      assertEquals(1386.3033690025204, vector0.getNorm(), 0.01D);
      assertEquals(false, vector0.isInfinite());
      assertEquals(1921837.0309077385, vector0.getNormSq(), 0.01D);
      assertEquals(false, vector0.isNaN());
      assertEquals(1960.4327153436936, vector0.getNorm1(), 0.01D);
      assertEquals(989.9327153436934, vector0.getNormInf(), 0.01D);
      assertEquals(false, polygonsSet0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 3.4028234663852886E38;
      double double1 = 4.19;
      double double2 = 59.34959155459395;
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double2, double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      
      polygonsSet0.computeGeometricalProperties();
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(false, polygonsSet0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1.7976931348623157E308;
      double double1 = (-0.045);
      PolygonsSet polygonsSet0 = new PolygonsSet(double0, double1, double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      
      // Undeclared exception!
      try {
        double double2 = polygonsSet0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      PolygonsSet polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) linkedList0);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      double double0 = polygonsSet0.getSize();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "i";
      Boolean boolean0 = Boolean.valueOf(string0);
      assertFalse(boolean0);
      
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>((Object) boolean0);
      assertNotNull(bSPTree0);
      
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      assertNotNull(polygonsSet0);
      assertEquals(true, polygonsSet0.isEmpty());
      
      Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
      assertNotNull(vector0);
      assertEquals(0.0, vector0.getNormSq(), 0.01D);
      assertEquals(0.0, vector0.getNorm1(), 0.01D);
      assertEquals(false, vector0.isInfinite());
      assertEquals(false, vector0.isNaN());
      assertEquals(0.0, vector0.getNorm(), 0.01D);
      assertEquals(0.0, vector0.getNormInf(), 0.01D);
      assertEquals(true, polygonsSet0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 1.8307188599677033E-8;
      double double1 = 3.4028234663852886E38;
      PolygonsSet polygonsSet0 = new PolygonsSet(double1, double0, double1, double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      
      Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(vector0);
      assertEquals(0.0, vector0.getNormSq(), 0.01D);
      assertEquals(0.0, vector0.getNorm(), 0.01D);
      assertEquals(0.0, vector0.getNorm1(), 0.01D);
      assertEquals(false, vector0.isInfinite());
      assertEquals(0.0, vector0.getNormInf(), 0.01D);
      assertEquals(false, vector0.isNaN());
      assertEquals(false, polygonsSet0.isEmpty());
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<SubLine> linkedList0 = new LinkedList<SubLine>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      assertNotNull(vector2D0);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormInf(), 0.01D);
      assertEquals(false, vector2D0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getY(), 0.01D);
      assertEquals(true, vector2D0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm1(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormSq(), 0.01D);
      
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      assertNotNull(subLine0);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormInf(), 0.01D);
      assertEquals(false, vector2D0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getY(), 0.01D);
      assertEquals(true, vector2D0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm1(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormSq(), 0.01D);
      assertEquals(false, subLine0.isEmpty());
      
      boolean boolean0 = linkedList0.add(subLine0);
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormInf(), 0.01D);
      assertEquals(false, vector2D0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getY(), 0.01D);
      assertEquals(true, vector2D0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm1(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNorm(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getX(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, vector2D0.getNormSq(), 0.01D);
      assertEquals(1, linkedList0.size());
      assertEquals(false, subLine0.isEmpty());
      
      LinkedList<SubHyperplane<Euclidean2D>> linkedList1 = new LinkedList<SubHyperplane<Euclidean2D>>((Collection<? extends SubHyperplane<Euclidean2D>>) linkedList0);
      assertNotNull(linkedList1);
      assertEquals(1, linkedList0.size());
      assertEquals(1, linkedList1.size());
      
      PolygonsSet polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) linkedList1);
      assertNotNull(polygonsSet0);
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertEquals(1, linkedList1.size());
      
      polygonsSet0.computeGeometricalProperties();
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertEquals(1, linkedList1.size());
  }

  @Test
  public void test8()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      PolygonsSet polygonsSet0 = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) linkedList0);
      assertNotNull(polygonsSet0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(false, polygonsSet0.isEmpty());
      
      AbstractRegion<Euclidean2D, Euclidean1D> abstractRegion0 = polygonsSet0.copySelf();
      assertNotSame(polygonsSet0, abstractRegion0);
      assertFalse(polygonsSet0.equals((Object)abstractRegion0));
      assertNotNull(abstractRegion0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(false, polygonsSet0.isEmpty());
      assertEquals(false, abstractRegion0.isEmpty());
  }
}
