/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:48 GMT 2014
 */

package org.jfree.chart.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.text.AttributedString;
import javax.swing.DebugGraphics;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.chart.util.SerialUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SerialUtilitiesEvoSuite_branch_Test extends SerialUtilitiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) pipedOutputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(4, pipedInputStream0.available());
      assertNotNull(objectOutputStream0);
      
      AttributedString attributedString0 = null;
      SerialUtilities.writeAttributedString(attributedString0, objectOutputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(4, pipedInputStream0.available());
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "ka]`,wyA4qU\\^";
      AttributedString attributedString0 = new AttributedString(string0);
      assertNotNull(attributedString0);
      
      int int0 = 166;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeAttributedString(attributedString0, objectOutputStream0);
      assertEquals(110, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000t\u0000\u000Eka]`,wyA4qU\\^w\u0006\u0000k\u0000\u0000\u0000\u000Esr\u0000\u0011java.util.HashMap\u0005\u0007\uFFFD\uFFFD\uFFFD\u0016`\uFFFD\u0003\u0000\u0002F\u0000\nloadFactorI\u0000\tthresholdxp?@\u0000\u0000\u0000\u0000\u0000\fw\b\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0000x", byteArrayOutputStream0.toString());
  }

  @Test
  public void test02()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      // Undeclared exception!
      try {
        AttributedString attributedString0 = SerialUtilities.readAttributedString(objectInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      JRadioButton jRadioButton0 = new JRadioButton();
      assertEquals(false, jRadioButton0.isPreferredSizeSet());
      assertEquals(true, jRadioButton0.isForegroundSet());
      assertEquals(false, jRadioButton0.isMaximumSizeSet());
      assertEquals(false, jRadioButton0.isFocusTraversalPolicyProvider());
      assertEquals(false, jRadioButton0.isLightweight());
      assertEquals(false, jRadioButton0.isCursorSet());
      assertEquals(0, jRadioButton0.getComponentCount());
      assertEquals(false, jRadioButton0.isValid());
      assertEquals(false, jRadioButton0.isFocusTraversalPolicySet());
      assertEquals(true, jRadioButton0.isVisible());
      assertEquals(false, jRadioButton0.getIgnoreRepaint());
      assertEquals(false, jRadioButton0.isMinimumSizeSet());
      assertEquals(false, jRadioButton0.isDisplayable());
      assertEquals(false, jRadioButton0.isFocusCycleRoot());
      assertEquals(true, jRadioButton0.isEnabled());
      assertEquals(false, jRadioButton0.isShowing());
      assertEquals(true, jRadioButton0.isFontSet());
      assertEquals(true, jRadioButton0.getFocusTraversalKeysEnabled());
      assertEquals(true, jRadioButton0.isBackgroundSet());
      assertEquals(0, jRadioButton0.countComponents());
      assertNotNull(jRadioButton0);
      
      Point point0 = jRadioButton0.location();
      assertEquals(0.0, point0.getX(), 0.01D);
      assertEquals(0.0, point0.getY(), 0.01D);
      assertEquals("java.awt.Point[x=0,y=0]", point0.toString());
      assertEquals(false, jRadioButton0.isPreferredSizeSet());
      assertEquals(true, jRadioButton0.isForegroundSet());
      assertEquals(false, jRadioButton0.isMaximumSizeSet());
      assertEquals(false, jRadioButton0.isFocusTraversalPolicyProvider());
      assertEquals(false, jRadioButton0.isLightweight());
      assertEquals(false, jRadioButton0.isCursorSet());
      assertEquals(0, jRadioButton0.getComponentCount());
      assertEquals(false, jRadioButton0.isValid());
      assertEquals(false, jRadioButton0.isFocusTraversalPolicySet());
      assertEquals(true, jRadioButton0.isVisible());
      assertEquals(false, jRadioButton0.getIgnoreRepaint());
      assertEquals(false, jRadioButton0.isMinimumSizeSet());
      assertEquals(false, jRadioButton0.isDisplayable());
      assertEquals(false, jRadioButton0.isFocusCycleRoot());
      assertEquals(true, jRadioButton0.isEnabled());
      assertEquals(false, jRadioButton0.isShowing());
      assertEquals(true, jRadioButton0.isFontSet());
      assertEquals(true, jRadioButton0.getFocusTraversalKeysEnabled());
      assertEquals(true, jRadioButton0.isBackgroundSet());
      assertEquals(0, jRadioButton0.countComponents());
      assertNotNull(point0);
      assertEquals(0, point0.y);
      assertEquals(0, point0.x);
      
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writePoint2D((Point2D) point0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      JSeparator jSeparator0 = new JSeparator();
      assertEquals(false, jSeparator0.isCursorSet());
      assertEquals(false, jSeparator0.isMaximumSizeSet());
      assertEquals(false, jSeparator0.isShowing());
      assertEquals(false, jSeparator0.isValid());
      assertEquals(false, jSeparator0.getIgnoreRepaint());
      assertEquals(true, jSeparator0.isEnabled());
      assertEquals(true, jSeparator0.isBackgroundSet());
      assertEquals(false, jSeparator0.isFocusTraversalPolicyProvider());
      assertEquals(false, jSeparator0.isDisplayable());
      assertEquals(false, jSeparator0.isFocusTraversalPolicySet());
      assertEquals(false, jSeparator0.isLightweight());
      assertEquals(false, jSeparator0.isFontSet());
      assertEquals(true, jSeparator0.isForegroundSet());
      assertEquals(false, jSeparator0.isFocusCycleRoot());
      assertEquals(false, jSeparator0.isPreferredSizeSet());
      assertEquals(true, jSeparator0.getFocusTraversalKeysEnabled());
      assertEquals(0, jSeparator0.countComponents());
      assertEquals(0, jSeparator0.getComponentCount());
      assertEquals(true, jSeparator0.isVisible());
      assertEquals(false, jSeparator0.isMinimumSizeSet());
      assertNotNull(jSeparator0);
      
      Point point0 = jSeparator0.getLocation();
      assertEquals(false, jSeparator0.isCursorSet());
      assertEquals(false, jSeparator0.isMaximumSizeSet());
      assertEquals(false, jSeparator0.isShowing());
      assertEquals(false, jSeparator0.isValid());
      assertEquals(false, jSeparator0.getIgnoreRepaint());
      assertEquals(true, jSeparator0.isEnabled());
      assertEquals(true, jSeparator0.isBackgroundSet());
      assertEquals(false, jSeparator0.isFocusTraversalPolicyProvider());
      assertEquals(false, jSeparator0.isDisplayable());
      assertEquals(false, jSeparator0.isFocusTraversalPolicySet());
      assertEquals(false, jSeparator0.isLightweight());
      assertEquals(false, jSeparator0.isFontSet());
      assertEquals(true, jSeparator0.isForegroundSet());
      assertEquals(false, jSeparator0.isFocusCycleRoot());
      assertEquals(false, jSeparator0.isPreferredSizeSet());
      assertEquals(true, jSeparator0.getFocusTraversalKeysEnabled());
      assertEquals(0, jSeparator0.countComponents());
      assertEquals(0, jSeparator0.getComponentCount());
      assertEquals(true, jSeparator0.isVisible());
      assertEquals(false, jSeparator0.isMinimumSizeSet());
      assertEquals(0.0, point0.getY(), 0.01D);
      assertEquals(0.0, point0.getX(), 0.01D);
      assertEquals("java.awt.Point[x=0,y=0]", point0.toString());
      assertNotNull(point0);
      assertEquals(0, point0.y);
      assertEquals(0, point0.x);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writePoint2D((Point2D) point0, objectOutputStream0);
      assertEquals(false, jSeparator0.isCursorSet());
      assertEquals(false, jSeparator0.isMaximumSizeSet());
      assertEquals(false, jSeparator0.isShowing());
      assertEquals(false, jSeparator0.isValid());
      assertEquals(false, jSeparator0.getIgnoreRepaint());
      assertEquals(true, jSeparator0.isEnabled());
      assertEquals(true, jSeparator0.isBackgroundSet());
      assertEquals(false, jSeparator0.isFocusTraversalPolicyProvider());
      assertEquals(false, jSeparator0.isDisplayable());
      assertEquals(false, jSeparator0.isFocusTraversalPolicySet());
      assertEquals(false, jSeparator0.isLightweight());
      assertEquals(false, jSeparator0.isFontSet());
      assertEquals(true, jSeparator0.isForegroundSet());
      assertEquals(false, jSeparator0.isFocusCycleRoot());
      assertEquals(false, jSeparator0.isPreferredSizeSet());
      assertEquals(true, jSeparator0.getFocusTraversalKeysEnabled());
      assertEquals(0, jSeparator0.countComponents());
      assertEquals(0, jSeparator0.getComponentCount());
      assertEquals(true, jSeparator0.isVisible());
      assertEquals(false, jSeparator0.isMinimumSizeSet());
      assertEquals(0.0, point0.getY(), 0.01D);
      assertEquals(0.0, point0.getX(), 0.01D);
      assertEquals("java.awt.Point[x=0,y=0]", point0.toString());
      assertEquals(0, point0.y);
      assertEquals(0, point0.x);
  }

  @Test
  public void test05()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      // Undeclared exception!
      try {
        Point2D point2D0 = SerialUtilities.readPoint2D(objectInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = (-1466.71);
      Point2D.Double point2D_Double0 = new Point2D.Double(double0, double0);
      assertNotNull(point2D_Double0);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
      
      String string0 = point2D_Double0.toString();
      assertNotNull(string0);
      assertEquals("Point2D.Double[-1466.71, -1466.71]", string0);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
      
      Polygon polygon0 = new Polygon();
      assertNotNull(polygon0);
      assertEquals(0, polygon0.npoints);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
      
      SerialUtilities.writeShape((Shape) polygon0, objectOutputStream0);
      assertEquals(0, polygon0.npoints);
      assertEquals((-1466.71), point2D_Double0.x, 0.01D);
      assertEquals((-1466.71), point2D_Double0.y, 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertNotNull(ellipse2D_Double0);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
      
      int int0 = 1741;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) ellipse2D_Double0, objectOutputStream0);
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertEquals(47, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0017java.awt.geom.Ellipse2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xp", byteArrayOutputStream0.toString());
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
      
      SerialUtilities.writeShape((Shape) ellipse2D_Double0, objectOutputStream0);
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertEquals(87, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0017java.awt.geom.Ellipse2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xpw!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0001", byteArrayOutputStream0.toString());
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = 0;
      GeneralPath generalPath0 = new GeneralPath(int0);
      assertEquals(0, generalPath0.getWindingRule());
      assertNotNull(generalPath0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      boolean boolean0 = true;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) printStream0, boolean0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) generalPath0, objectOutputStream0);
      assertEquals(0, generalPath0.getWindingRule());
  }

  @Test
  public void test09()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertNotNull(rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      
      int int0 = 2805;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      DefaultCaret defaultCaret0 = new DefaultCaret();
      assertEquals(0.0, defaultCaret0.getMaxX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getCenterY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getHeight(), 0.01D);
      assertEquals(0.0, defaultCaret0.getMaxY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getCenterX(), 0.01D);
      assertEquals(true, defaultCaret0.isEmpty());
      assertEquals(0.0, defaultCaret0.getMinX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getMinY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getWidth(), 0.01D);
      assertNotNull(defaultCaret0);
      assertEquals(0, defaultCaret0.height);
      assertEquals(0, defaultCaret0.width);
      assertEquals(0, defaultCaret0.y);
      assertEquals(0, defaultCaret0.x);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) defaultCaret0, objectOutputStream0);
      assertEquals(0.0, defaultCaret0.getMaxX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getCenterY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getHeight(), 0.01D);
      assertEquals(0.0, defaultCaret0.getMaxY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getCenterX(), 0.01D);
      assertEquals(true, defaultCaret0.isEmpty());
      assertEquals(0.0, defaultCaret0.getMinX(), 0.01D);
      assertEquals(0.0, defaultCaret0.getMinY(), 0.01D);
      assertEquals(0.0, defaultCaret0.getWidth(), 0.01D);
      assertEquals(49, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0019java.awt.geom.Rectangle2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xp", byteArrayOutputStream0.toString());
      assertEquals(0, defaultCaret0.height);
      assertEquals(0, defaultCaret0.width);
      assertEquals(0, defaultCaret0.y);
      assertEquals(0, defaultCaret0.x);
      
      SerialUtilities.writeShape((Shape) rectangle2D_Double0, objectOutputStream0);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0019java.awt.geom.Rectangle2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xpw!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0001", byteArrayOutputStream0.toString());
      assertEquals(89, byteArrayOutputStream0.size());
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      assertNotNull(objectOutputStream0);
      
      Line2D.Double line2D_Double0 = new Line2D.Double();
      assertNotNull(line2D_Double0);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      
      SerialUtilities.writeShape((Shape) line2D_Double0, objectOutputStream0);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      JList<String> jList0 = new JList<String>();
      assertEquals(false, jList0.getIgnoreRepaint());
      assertEquals(false, jList0.isDisplayable());
      assertEquals(false, jList0.isFocusTraversalPolicySet());
      assertEquals(1, jList0.countComponents());
      assertEquals(false, jList0.isMinimumSizeSet());
      assertEquals(false, jList0.isPreferredSizeSet());
      assertEquals(true, jList0.isFontSet());
      assertEquals(false, jList0.isLightweight());
      assertEquals(false, jList0.isCursorSet());
      assertEquals(false, jList0.isFocusCycleRoot());
      assertEquals(true, jList0.isForegroundSet());
      assertEquals(true, jList0.isEnabled());
      assertEquals(false, jList0.isFocusTraversalPolicyProvider());
      assertEquals(false, jList0.isShowing());
      assertEquals(true, jList0.isBackgroundSet());
      assertEquals(false, jList0.isValid());
      assertEquals(1, jList0.getComponentCount());
      assertEquals(false, jList0.isMaximumSizeSet());
      assertEquals(true, jList0.isVisible());
      assertEquals(true, jList0.getFocusTraversalKeysEnabled());
      assertNotNull(jList0);
      
      int int0 = 3;
      Rectangle rectangle0 = jList0.getCellBounds(int0, int0);
      assertEquals(false, jList0.getIgnoreRepaint());
      assertEquals(false, jList0.isDisplayable());
      assertEquals(false, jList0.isFocusTraversalPolicySet());
      assertEquals(1, jList0.countComponents());
      assertEquals(false, jList0.isMinimumSizeSet());
      assertEquals(false, jList0.isPreferredSizeSet());
      assertEquals(true, jList0.isFontSet());
      assertEquals(false, jList0.isLightweight());
      assertEquals(false, jList0.isCursorSet());
      assertEquals(false, jList0.isFocusCycleRoot());
      assertEquals(true, jList0.isForegroundSet());
      assertEquals(true, jList0.isEnabled());
      assertEquals(false, jList0.isFocusTraversalPolicyProvider());
      assertEquals(false, jList0.isShowing());
      assertEquals(true, jList0.isBackgroundSet());
      assertEquals(false, jList0.isValid());
      assertEquals(1, jList0.getComponentCount());
      assertEquals(false, jList0.isMaximumSizeSet());
      assertEquals(true, jList0.isVisible());
      assertEquals(true, jList0.getFocusTraversalKeysEnabled());
      assertNull(rectangle0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      boolean boolean0 = true;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) printStream0, boolean0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) rectangle0, objectOutputStream0);
      assertEquals(false, jList0.getIgnoreRepaint());
      assertEquals(false, jList0.isDisplayable());
      assertEquals(false, jList0.isFocusTraversalPolicySet());
      assertEquals(1, jList0.countComponents());
      assertEquals(false, jList0.isMinimumSizeSet());
      assertEquals(false, jList0.isPreferredSizeSet());
      assertEquals(true, jList0.isFontSet());
      assertEquals(false, jList0.isLightweight());
      assertEquals(false, jList0.isCursorSet());
      assertEquals(false, jList0.isFocusCycleRoot());
      assertEquals(true, jList0.isForegroundSet());
      assertEquals(true, jList0.isEnabled());
      assertEquals(false, jList0.isFocusTraversalPolicyProvider());
      assertEquals(false, jList0.isShowing());
      assertEquals(true, jList0.isBackgroundSet());
      assertEquals(false, jList0.isValid());
      assertEquals(1, jList0.getComponentCount());
      assertEquals(false, jList0.isMaximumSizeSet());
      assertEquals(true, jList0.isVisible());
      assertEquals(true, jList0.getFocusTraversalKeysEnabled());
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = 0.0;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(double0, double0, double0, double0);
      assertEquals(0.0, rectangle2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle2D_Double0.getCenterY(), 0.01D);
      assertNotNull(rectangle2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.x, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.height, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.y, 0.01D);
      assertEquals(0.0, rectangle2D_Double0.width, 0.01D);
      
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writeShape((Shape) rectangle2D_Double0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      // Undeclared exception!
      try {
        Shape shape0 = SerialUtilities.readShape(objectInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BasicStroke basicStroke0 = new BasicStroke();
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertNotNull(basicStroke0);
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) pipedOutputStream0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeStroke((Stroke) basicStroke0, objectOutputStream0);
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      
      SerialUtilities.writeStroke((Stroke) basicStroke0, objectOutputStream0);
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
  }

  @Test
  public void test15()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      assertNotNull(objectOutputStream0);
      
      Stroke stroke0 = null;
      SerialUtilities.writeStroke(stroke0, objectOutputStream0);
  }

  @Test
  public void test16()  throws Throwable  {
      Stroke stroke0 = null;
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writeStroke(stroke0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      // Undeclared exception!
      try {
        Stroke stroke0 = SerialUtilities.readStroke(objectInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 1741;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
      assertNotNull(objectOutputStream0);
      
      Paint paint0 = null;
      SerialUtilities.writePaint(paint0, objectOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
  }

  @Test
  public void test19()  throws Throwable  {
      float float0 = 0.0F;
      Color color0 = Color.ORANGE;
      assertEquals(-14336, color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(200, color0.getGreen());
      assertEquals(0, color0.getBlue());
      assertEquals(255, color0.getRed());
      assertEquals("java.awt.Color[r=255,g=200,b=0]", color0.toString());
      assertNotNull(color0);
      
      boolean boolean0 = false;
      GradientPaint gradientPaint0 = new GradientPaint(float0, float0, color0, float0, float0, color0, boolean0);
      assertEquals(false, gradientPaint0.isCyclic());
      assertEquals(1, gradientPaint0.getTransparency());
      assertEquals(-14336, color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(200, color0.getGreen());
      assertEquals(0, color0.getBlue());
      assertEquals(255, color0.getRed());
      assertEquals("java.awt.Color[r=255,g=200,b=0]", color0.toString());
      assertNotNull(gradientPaint0);
      
      String string0 = "%0&?d5}m:C==.Dq) h";
      File file0 = null;
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0, file0);
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writePaint((Paint) gradientPaint0, objectOutputStream0);
      assertEquals(false, gradientPaint0.isCyclic());
      assertEquals(1, gradientPaint0.getTransparency());
      assertEquals(-14336, color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(200, color0.getGreen());
      assertEquals(0, color0.getBlue());
      assertEquals(255, color0.getRed());
      assertEquals("java.awt.Color[r=255,g=200,b=0]", color0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      // Undeclared exception!
      try {
        Paint paint0 = SerialUtilities.readPaint(objectInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      boolean boolean0 = SerialUtilities.isSerializable(class0);
      assertFalse(boolean0);
      
      Class<Line2D.Float> class1 = Line2D.Float.class;
      boolean boolean1 = SerialUtilities.isSerializable(class1);
      assertTrue(boolean1);
      assertFalse(boolean1 == boolean0);
  }
}