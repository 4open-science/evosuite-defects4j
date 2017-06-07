/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:08:53 GMT 2014
 */

package org.jfree.chart.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.chart.util.SerialUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SerialUtilitiesEvoSuite_branch_Test extends SerialUtilitiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "@KkJ";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      AttributedString attributedString0 = null;
      SerialUtilities.writeAttributedString(attributedString0, objectOutputStream0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "!";
      Hashtable<AttributedCharacterIterator.Attribute, Line2D.Double> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Line2D.Double>();
      assertEquals(true, hashtable0.isEmpty());
      assertEquals(0, hashtable0.size());
      assertEquals("{}", hashtable0.toString());
      assertNotNull(hashtable0);
      
      AttributedString attributedString0 = new AttributedString(string0, (Map<? extends AttributedCharacterIterator.Attribute, ?>) hashtable0);
      assertEquals(true, hashtable0.isEmpty());
      assertEquals(0, hashtable0.size());
      assertEquals("{}", hashtable0.toString());
      assertNotNull(attributedString0);
      
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writeAttributedString(attributedString0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "Null 'stream' argument.";
      boolean boolean0 = false;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(string0, boolean0);
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) mockFileOutputStream0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      HashMap<AttributedCharacterIterator.Attribute, RadialGradientPaint> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, RadialGradientPaint>();
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(hashMap0);
      
      AttributedString attributedString0 = new AttributedString(string0, (Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
      assertNotNull(attributedString0);
      
      SerialUtilities.writeAttributedString(attributedString0, objectOutputStream0);
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals("{}", hashMap0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      String string0 = "^DRqCh\" V\\$/%(;i";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Point2D point2D0 = null;
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writePoint2D(point2D0, objectOutputStream0);
  }

  @Test
  public void test05()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertNotNull(line2D_Double0);
      
      Point2D.Double point2D_Double0 = new Point2D.Double(line2D_Double0.x2, line2D_Double0.x2);
      assertEquals(0.0, point2D_Double0.x, 0.01D);
      assertEquals(0.0, point2D_Double0.y, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertNotNull(point2D_Double0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals(0, dataOutputStream0.size());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(dataOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) dataOutputStream0);
      assertEquals(4, dataOutputStream0.size());
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writePoint2D((Point2D) point2D_Double0, objectOutputStream0);
      assertEquals(0.0, point2D_Double0.x, 0.01D);
      assertEquals(0.0, point2D_Double0.y, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(4, dataOutputStream0.size());
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
  }

  @Test
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      assertEquals(0.0, arc2D_Double0.start, 0.01D);
      assertEquals(0.0, arc2D_Double0.extent, 0.01D);
      assertEquals(0.0, arc2D_Double0.height, 0.01D);
      assertEquals(0.0, arc2D_Double0.x, 0.01D);
      assertEquals(0.0, arc2D_Double0.width, 0.01D);
      assertEquals(0.0, arc2D_Double0.y, 0.01D);
      assertEquals(0.0, arc2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMinY(), 0.01D);
      assertEquals(0, arc2D_Double0.getArcType());
      assertEquals(0.0, arc2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterY(), 0.01D);
      assertNotNull(arc2D_Double0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertNotNull(byteArrayOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) arc2D_Double0, objectOutputStream0);
      assertEquals(0.0, arc2D_Double0.start, 0.01D);
      assertEquals(0.0, arc2D_Double0.extent, 0.01D);
      assertEquals(0.0, arc2D_Double0.height, 0.01D);
      assertEquals(0.0, arc2D_Double0.x, 0.01D);
      assertEquals(0.0, arc2D_Double0.width, 0.01D);
      assertEquals(0.0, arc2D_Double0.y, 0.01D);
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0013java.awt.geom.Arc2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xp", byteArrayOutputStream0.toString());
      assertEquals(43, byteArrayOutputStream0.size());
      assertEquals(0.0, arc2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMinY(), 0.01D);
      assertEquals(0, arc2D_Double0.getArcType());
      assertEquals(0.0, arc2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterY(), 0.01D);
      
      SerialUtilities.writeShape((Shape) arc2D_Double0, objectOutputStream0);
      assertEquals(0.0, arc2D_Double0.start, 0.01D);
      assertEquals(0.0, arc2D_Double0.extent, 0.01D);
      assertEquals(0.0, arc2D_Double0.height, 0.01D);
      assertEquals(0.0, arc2D_Double0.x, 0.01D);
      assertEquals(0.0, arc2D_Double0.width, 0.01D);
      assertEquals(0.0, arc2D_Double0.y, 0.01D);
      assertEquals(103, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0013java.awt.geom.Arc2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xpw5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0001", byteArrayOutputStream0.toString());
      assertEquals(0.0, arc2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getMinY(), 0.01D);
      assertEquals(0, arc2D_Double0.getArcType());
      assertEquals(0.0, arc2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, arc2D_Double0.getCenterY(), 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
      assertNotNull(ellipse2D_Double0);
      
      String string0 = "~0U/:@qUy~&c'{aXg8";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      assertNotNull(mockFileOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) ellipse2D_Double0, objectOutputStream0);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
      
      SerialUtilities.writeShape((Shape) ellipse2D_Double0, objectOutputStream0);
      assertEquals(0.0, ellipse2D_Double0.height, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.width, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.y, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.x, 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMinX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxX(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getMaxY(), 0.01D);
      assertEquals(0.0, ellipse2D_Double0.getCenterY(), 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      assertNotNull(defaultTableColumnModel0);
      
      JTableHeader jTableHeader0 = new JTableHeader((TableColumnModel) defaultTableColumnModel0);
      assertEquals(false, jTableHeader0.isLightweight());
      assertEquals(true, jTableHeader0.isVisible());
      assertEquals(true, jTableHeader0.isForegroundSet());
      assertEquals(true, jTableHeader0.isEnabled());
      assertEquals(true, jTableHeader0.isFontSet());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicySet());
      assertEquals(false, jTableHeader0.getIgnoreRepaint());
      assertEquals(false, jTableHeader0.isValid());
      assertEquals(false, jTableHeader0.isPreferredSizeSet());
      assertEquals(false, jTableHeader0.isDisplayable());
      assertEquals(false, jTableHeader0.isCursorSet());
      assertEquals(true, jTableHeader0.getFocusTraversalKeysEnabled());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicyProvider());
      assertEquals(true, jTableHeader0.isBackgroundSet());
      assertEquals(false, jTableHeader0.isMinimumSizeSet());
      assertEquals(1, jTableHeader0.countComponents());
      assertEquals(false, jTableHeader0.isShowing());
      assertEquals(false, jTableHeader0.isMaximumSizeSet());
      assertEquals(1, jTableHeader0.getComponentCount());
      assertEquals(false, jTableHeader0.isFocusCycleRoot());
      assertNotNull(jTableHeader0);
      
      Rectangle rectangle0 = jTableHeader0.bounds();
      assertEquals(0, rectangle0.width);
      assertEquals(0, rectangle0.height);
      assertEquals(0, rectangle0.x);
      assertEquals(0, rectangle0.y);
      assertEquals(false, jTableHeader0.isLightweight());
      assertEquals(true, jTableHeader0.isVisible());
      assertEquals(true, jTableHeader0.isForegroundSet());
      assertEquals(true, jTableHeader0.isEnabled());
      assertEquals(true, jTableHeader0.isFontSet());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicySet());
      assertEquals(false, jTableHeader0.getIgnoreRepaint());
      assertEquals(false, jTableHeader0.isValid());
      assertEquals(false, jTableHeader0.isPreferredSizeSet());
      assertEquals(false, jTableHeader0.isDisplayable());
      assertEquals(false, jTableHeader0.isCursorSet());
      assertEquals(true, jTableHeader0.getFocusTraversalKeysEnabled());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicyProvider());
      assertEquals(true, jTableHeader0.isBackgroundSet());
      assertEquals(false, jTableHeader0.isMinimumSizeSet());
      assertEquals(1, jTableHeader0.countComponents());
      assertEquals(false, jTableHeader0.isShowing());
      assertEquals(false, jTableHeader0.isMaximumSizeSet());
      assertEquals(1, jTableHeader0.getComponentCount());
      assertEquals(false, jTableHeader0.isFocusCycleRoot());
      assertEquals(0.0, rectangle0.getX(), 0.01D);
      assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0]", rectangle0.toString());
      assertEquals(0.0, rectangle0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle0.getHeight(), 0.01D);
      assertEquals(0.0, rectangle0.getY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxX(), 0.01D);
      assertEquals(true, rectangle0.isEmpty());
      assertEquals(0.0, rectangle0.getWidth(), 0.01D);
      assertNotNull(rectangle0);
      
      String string0 = "Null 'stream' argument.";
      boolean boolean0 = true;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(string0, boolean0);
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) mockFileOutputStream0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) rectangle0, objectOutputStream0);
      assertEquals(0, rectangle0.width);
      assertEquals(0, rectangle0.height);
      assertEquals(0, rectangle0.x);
      assertEquals(0, rectangle0.y);
      assertEquals(false, jTableHeader0.isLightweight());
      assertEquals(true, jTableHeader0.isVisible());
      assertEquals(true, jTableHeader0.isForegroundSet());
      assertEquals(true, jTableHeader0.isEnabled());
      assertEquals(true, jTableHeader0.isFontSet());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicySet());
      assertEquals(false, jTableHeader0.getIgnoreRepaint());
      assertEquals(false, jTableHeader0.isValid());
      assertEquals(false, jTableHeader0.isPreferredSizeSet());
      assertEquals(false, jTableHeader0.isDisplayable());
      assertEquals(false, jTableHeader0.isCursorSet());
      assertEquals(true, jTableHeader0.getFocusTraversalKeysEnabled());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicyProvider());
      assertEquals(true, jTableHeader0.isBackgroundSet());
      assertEquals(false, jTableHeader0.isMinimumSizeSet());
      assertEquals(1, jTableHeader0.countComponents());
      assertEquals(false, jTableHeader0.isShowing());
      assertEquals(false, jTableHeader0.isMaximumSizeSet());
      assertEquals(1, jTableHeader0.getComponentCount());
      assertEquals(false, jTableHeader0.isFocusCycleRoot());
      assertEquals(0.0, rectangle0.getX(), 0.01D);
      assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0]", rectangle0.toString());
      assertEquals(0.0, rectangle0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle0.getHeight(), 0.01D);
      assertEquals(0.0, rectangle0.getY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxX(), 0.01D);
      assertEquals(true, rectangle0.isEmpty());
      assertEquals(0.0, rectangle0.getWidth(), 0.01D);
      
      SerialUtilities.writeShape((Shape) rectangle0, objectOutputStream0);
      assertEquals(0, rectangle0.width);
      assertEquals(0, rectangle0.height);
      assertEquals(0, rectangle0.x);
      assertEquals(0, rectangle0.y);
      assertEquals(false, jTableHeader0.isLightweight());
      assertEquals(true, jTableHeader0.isVisible());
      assertEquals(true, jTableHeader0.isForegroundSet());
      assertEquals(true, jTableHeader0.isEnabled());
      assertEquals(true, jTableHeader0.isFontSet());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicySet());
      assertEquals(false, jTableHeader0.getIgnoreRepaint());
      assertEquals(false, jTableHeader0.isValid());
      assertEquals(false, jTableHeader0.isPreferredSizeSet());
      assertEquals(false, jTableHeader0.isDisplayable());
      assertEquals(false, jTableHeader0.isCursorSet());
      assertEquals(true, jTableHeader0.getFocusTraversalKeysEnabled());
      assertEquals(false, jTableHeader0.isFocusTraversalPolicyProvider());
      assertEquals(true, jTableHeader0.isBackgroundSet());
      assertEquals(false, jTableHeader0.isMinimumSizeSet());
      assertEquals(1, jTableHeader0.countComponents());
      assertEquals(false, jTableHeader0.isShowing());
      assertEquals(false, jTableHeader0.isMaximumSizeSet());
      assertEquals(1, jTableHeader0.getComponentCount());
      assertEquals(false, jTableHeader0.isFocusCycleRoot());
      assertEquals(0.0, rectangle0.getX(), 0.01D);
      assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0]", rectangle0.toString());
      assertEquals(0.0, rectangle0.getCenterY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinX(), 0.01D);
      assertEquals(0.0, rectangle0.getHeight(), 0.01D);
      assertEquals(0.0, rectangle0.getY(), 0.01D);
      assertEquals(0.0, rectangle0.getMinY(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxY(), 0.01D);
      assertEquals(0.0, rectangle0.getCenterX(), 0.01D);
      assertEquals(0.0, rectangle0.getMaxX(), 0.01D);
      assertEquals(true, rectangle0.isEmpty());
      assertEquals(0.0, rectangle0.getWidth(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertNotNull(line2D_Double0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertNotNull(byteArrayOutputStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      assertEquals(4, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape((Shape) line2D_Double0, objectOutputStream0);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(44, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0014java.awt.geom.Line2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xp", byteArrayOutputStream0.toString());
      
      SerialUtilities.writeShape((Shape) line2D_Double0, objectOutputStream0);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertEquals(84, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000vr\u0000\u0014java.awt.geom.Line2D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000xpw!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      assertEquals(0.0, line2D_Double0.y2, 0.01D);
      assertEquals(0.0, line2D_Double0.y1, 0.01D);
      assertEquals(0.0, line2D_Double0.x1, 0.01D);
      assertEquals(0.0, line2D_Double0.x2, 0.01D);
      assertNotNull(line2D_Double0);
      
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writeShape((Shape) line2D_Double0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Shape shape0 = null;
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeShape(shape0, objectOutputStream0);
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
      float float0 = 0.0F;
      int int0 = 2;
      BasicStroke basicStroke0 = new BasicStroke(float0, int0, int0, float0);
      assertEquals(0.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getLineJoin());
      assertEquals(0.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertNotNull(basicStroke0);
      
      String string0 = "@KkJ";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writeStroke((Stroke) basicStroke0, objectOutputStream0);
      assertEquals(0.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getLineJoin());
      assertEquals(0.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      
      SerialUtilities.writeStroke((Stroke) basicStroke0, objectOutputStream0);
      assertEquals(0.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(2, basicStroke0.getLineJoin());
      assertEquals(0.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
  }

  @Test
  public void test15()  throws Throwable  {
      BasicStroke basicStroke0 = new BasicStroke();
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertNotNull(basicStroke0);
      
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writeStroke((Stroke) basicStroke0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "Null 'stream' argument.";
      boolean boolean0 = false;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(string0, boolean0);
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) mockFileOutputStream0);
      assertNotNull(mockPrintStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      assertNotNull(objectOutputStream0);
      
      Stroke stroke0 = null;
      SerialUtilities.writeStroke(stroke0, objectOutputStream0);
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
      Paint paint0 = null;
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      assertNotNull(objectOutputStream0);
      
      SerialUtilities.writePaint(paint0, objectOutputStream0);
  }

  @Test
  public void test19()  throws Throwable  {
      Paint paint0 = null;
      ObjectOutputStream objectOutputStream0 = null;
      // Undeclared exception!
      try {
        SerialUtilities.writePaint(paint0, objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stream' argument.
         //
      }
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
      Class<Line2D.Double> class0 = Line2D.Double.class;
      boolean boolean0 = SerialUtilities.isSerializable(class0);
      assertTrue(boolean0);
      
      boolean boolean1 = SerialUtilities.isSerializable(class0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }
}
