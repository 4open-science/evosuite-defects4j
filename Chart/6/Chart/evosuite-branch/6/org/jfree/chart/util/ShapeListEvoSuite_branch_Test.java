/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:39:38 GMT 2014
 */

package org.jfree.chart.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
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
      
      int int0 = 1097;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      assertNotNull(rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      
      shapeList0.setShape(int0, (Shape) rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(1098, shapeList0.size());
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      
      ShapeList shapeList1 = new ShapeList();
      assertNotNull(shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertEquals(0, shapeList1.size());
      assertTrue(shapeList1.equals((Object)shapeList0));
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertFalse(boolean0);
      assertNotSame(shapeList1, shapeList0);
      assertNotSame(shapeList0, shapeList1);
      assertEquals(0, shapeList1.size());
      assertEquals(1098, shapeList0.size());
      assertTrue(shapeList1.equals((Object)shapeList0));
      assertFalse(shapeList0.equals((Object)shapeList1));
  }

  @Test
  public void test1()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      ShapeList shapeList1 = new ShapeList();
      assertNotNull(shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertEquals(0, shapeList1.size());
      assertTrue(shapeList1.equals((Object)shapeList0));
      
      boolean boolean0 = shapeList0.equals((Object) shapeList1);
      assertTrue(boolean0);
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertEquals(0, shapeList0.size());
      assertEquals(0, shapeList1.size());
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
  }

  @Test
  public void test2()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      int int0 = shapeList0.hashCode();
      assertEquals(4699, int0);
      assertEquals(0, shapeList0.size());
      
      boolean boolean0 = shapeList0.equals((Object) int0);
      assertFalse(boolean0);
      assertEquals(0, shapeList0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      int int0 = 1097;
      Shape shape0 = shapeList0.getShape(int0);
      assertNull(shape0);
      assertEquals(0, shapeList0.size());
  }

  @Test
  public void test4()  throws Throwable  {
      ShapeList shapeList0 = new ShapeList();
      assertNotNull(shapeList0);
      assertEquals(0, shapeList0.size());
      
      ShapeList shapeList1 = (ShapeList)shapeList0.clone();
      assertNotNull(shapeList1);
      assertNotSame(shapeList0, shapeList1);
      assertNotSame(shapeList1, shapeList0);
      assertEquals(0, shapeList0.size());
      assertEquals(0, shapeList1.size());
      assertTrue(shapeList0.equals((Object)shapeList1));
      assertTrue(shapeList1.equals((Object)shapeList0));
  }
}
