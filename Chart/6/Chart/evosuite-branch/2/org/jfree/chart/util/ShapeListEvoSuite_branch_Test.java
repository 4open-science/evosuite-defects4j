/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:58:01 GMT 2014
 */

package org.jfree.chart.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Polygon;
import java.awt.Shape;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.jfree.chart.util.ShapeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ShapeListEvoSuite_branch_Test extends ShapeListEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      int int0 = 2804;
      Polygon polygon0 = new Polygon();
      assertNotNull(polygon0);
      assertEquals(0, polygon0.npoints);
      
      shapeList0.set(int0, polygon0);
      assertEquals(2805, shapeList0.size());
      assertEquals(0, polygon0.npoints);
      
      ShapeList shapeList1 = new ShapeList();
      assertNotSame(shapeList1, shapeList0);
      assertNotNull(shapeList1);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList1.size());
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertFalse(boolean0);
      assertFalse(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(2805, shapeList0.size());
      assertEquals(0, shapeList1.size());
  }

  @Test
  public void test1()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      ShapeList shapeList1 = new ShapeList();
      assertNotSame(shapeList1, shapeList0);
      assertNotNull(shapeList1);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList1.size());
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertNotSame(shapeList0, shapeList1);
      assertTrue(boolean0);
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertEquals(0, shapeList1.size());
      assertEquals(0, shapeList0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      int int0 = 2804;
      Object object0 = shapeList0.get(int0);
      assertNull(object0);
      assertEquals(0, shapeList0.size());
      
      boolean boolean0 = shapeList0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0, shapeList0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      Polygon polygon0 = new Polygon();
      assertNotNull(polygon0);
      assertEquals(0, polygon0.npoints);
      
      Shape shape0 = shapeList0.getShape(polygon0.npoints);
      assertNull(shape0);
      assertEquals(0, shapeList0.size());
      assertEquals(0, polygon0.npoints);
  }

  @Test
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      ShapeList shapeList1 = (ShapeList)shapeList0.clone();
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertNotNull(shapeList1);
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertEquals(0, shapeList0.size());
      assertEquals(0, shapeList1.size());
  }

  @Test
  public void test5()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      int int0 = shapeList0.hashCode();
      assertEquals(4699, int0);
      assertEquals(0, shapeList0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      Polygon polygon0 = new Polygon();
      assertNotNull(polygon0);
      assertEquals(0, polygon0.npoints);
      
      shapeList0.setShape(polygon0.npoints, (Shape) polygon0);
      assertEquals(1, shapeList0.size());
      assertEquals(0, polygon0.npoints);
  }
}
