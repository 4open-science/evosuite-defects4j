/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:32:35 GMT 2014
 */

package org.jfree.chart.renderer;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class GrayPaintScaleEvoSuite_branch_Test extends GrayPaintScaleEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      
      double double0 = 0.0;
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotNull(grayPaintScale1);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      
      double double1 = 1146.565241619644;
      GrayPaintScale grayPaintScale2 = new GrayPaintScale(double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertNotNull(grayPaintScale2);
      assertEquals(0.0, grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(1146.565241619644, grayPaintScale2.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      
      boolean boolean0 = grayPaintScale2.equals((Object) grayPaintScale1);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale2));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(1146.565241619644, grayPaintScale2.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale0, grayPaintScale2);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale1, grayPaintScale2);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertNotNull(grayPaintScale1);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      
      boolean boolean0 = grayPaintScale1.equals((Object) grayPaintScale0);
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertTrue(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, double0, 0.01D);
      
      boolean boolean0 = grayPaintScale0.equals((Object) double0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertFalse(boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      
      double double0 = 0.0;
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertNotNull(grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      
      double double1 = (-1.0);
      GrayPaintScale grayPaintScale2 = new GrayPaintScale(double1, double0);
      assertFalse(double1 == double0);
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(double0 == double1);
      assertNotNull(grayPaintScale2);
      assertEquals((-1.0), grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      
      boolean boolean0 = grayPaintScale2.equals((Object) grayPaintScale1);
      assertFalse(double1 == double0);
      assertTrue(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale2));
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale2));
      assertTrue(grayPaintScale0.equals((Object)grayPaintScale1));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale0));
      assertFalse(grayPaintScale2.equals((Object)grayPaintScale1));
      assertFalse(double0 == double1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01D);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals((-1.0), grayPaintScale2.getLowerBound(), 0.01D);
      assertEquals(0.0, grayPaintScale2.getUpperBound(), 0.01D);
      assertNotSame(grayPaintScale1, grayPaintScale2);
      assertNotSame(grayPaintScale1, grayPaintScale0);
      assertNotSame(grayPaintScale0, grayPaintScale1);
      assertNotSame(grayPaintScale0, grayPaintScale2);
      assertNotSame(grayPaintScale2, grayPaintScale0);
      assertNotSame(grayPaintScale2, grayPaintScale1);
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.0;
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      
      double double0 = 0.0;
      Color color0 = (Color)grayPaintScale0.getPaint(double0);
      assertNotNull(color0);
      assertEquals(0, color0.getBlue());
      assertEquals(1, color0.getTransparency());
      assertEquals("java.awt.Color[r=0,g=0,b=0]", color0.toString());
      assertEquals(-16777216, color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(0, color0.getGreen());
      assertEquals(0, color0.getRed());
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      assertNotNull(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01D);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01D);
      assertEquals(1.0, double0, 0.01D);
  }
}
