/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:05:15 GMT 2014
 */

package org.apache.commons.math.ode.events;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EventStateEvoSuite_branch_Test extends EventStateEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-1745.28501);
      int int0 = (-40);
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(-40, eventState0.getMaxIterationCount());
  }

  @Test
  public void test1()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 1581.452242023785;
      int int0 = 588;
      EventState eventState0 = new EventState(eventHandler0, double0, (double) int0, int0);
      assertEquals(588.0, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(1581.452242023785, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(588, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      assertEquals(true, nordsieckStepInterpolator0.isForward());
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getPreviousTime(), 0.01D);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getCurrentTime(), 0.01D);
      assertNotNull(nordsieckStepInterpolator0);
      
      // Undeclared exception!
      try {
        boolean boolean0 = eventState0.evaluateStep((StepInterpolator) nordsieckStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-1431.5);
      int int0 = 1688;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(false, eventState0.stop());
      assertEquals(1688, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(1688.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1431.5, eventState0.getConvergence(), 0.01D);
      assertNotNull(eventState0);
      
      double[] doubleArray0 = new double[8];
      boolean boolean0 = eventState0.reset((double) int0, doubleArray0);
      assertFalse(boolean0);
      assertEquals(false, eventState0.stop());
      assertEquals(1688, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(1688.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1431.5, eventState0.getConvergence(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, boolean0);
      assertEquals(false, eventState0.stop());
      assertEquals(1688, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(1688.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1431.5, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01D);
      assertEquals(false, dummyStepInterpolator0.isForward());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(dummyStepInterpolator0);
      
      // Undeclared exception!
      try {
        boolean boolean1 = eventState0.evaluateStep((StepInterpolator) dummyStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-1745.28501);
      int int0 = (-40);
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertNotNull(eventState0);
      
      double double1 = eventState0.getConvergence();
      assertEquals(1745.28501, double1, 0.01D);
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test4()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-1745.28501);
      int int0 = (-40);
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertNotNull(eventState0);
      
      double double1 = eventState0.getMaxCheckInterval();
      assertEquals((-40.0), double1, 0.01D);
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test5()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 13.589808374;
      int int0 = (-1404);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(-1404, eventState0.getMaxIterationCount());
      assertEquals(13.589808374, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(13.589808374, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertNotNull(eventState0);
      
      int int1 = eventState0.getMaxIterationCount();
      assertEquals((-1404), int1);
      assertEquals(-1404, eventState0.getMaxIterationCount());
      assertEquals(13.589808374, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(13.589808374, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test
  public void test6()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 13.589808374;
      int int0 = (-1404);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(13.589808374, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(-1404, eventState0.getMaxIterationCount());
      assertEquals(13.589808374, eventState0.getConvergence(), 0.01D);
      assertNotNull(eventState0);
      
      double double1 = eventState0.getEventTime();
      assertEquals(Double.NaN, double1, 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(13.589808374, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(-1404, eventState0.getMaxIterationCount());
      assertEquals(13.589808374, eventState0.getConvergence(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test7()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-1745.28501);
      int int0 = (-40);
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertNotNull(eventState0);
      
      EventHandler eventHandler1 = eventState0.getEventHandler();
      assertEquals(1745.28501, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-40.0), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(-40, eventState0.getMaxIterationCount());
      assertNull(eventHandler1);
  }
}
