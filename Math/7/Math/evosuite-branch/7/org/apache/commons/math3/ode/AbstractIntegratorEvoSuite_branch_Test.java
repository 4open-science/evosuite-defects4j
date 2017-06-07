/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 07:16:54 GMT 2014
 */

package org.apache.commons.math3.ode;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractIntegratorEvoSuite_branch_Test extends AbstractIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-2958.66403);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(double0);
      assertNotNull(threeEighthesIntegrator0);
      assertEquals(0, threeEighthesIntegrator0.getEvaluations());
      assertEquals(2147483647, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals("3/8", threeEighthesIntegrator0.getName());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01D);
      
      int int0 = 0;
      threeEighthesIntegrator0.setMaxEvaluations(int0);
      assertEquals(0, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(0, threeEighthesIntegrator0.getEvaluations());
      assertEquals("3/8", threeEighthesIntegrator0.getName());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 0.0;
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(double0);
      assertNotNull(threeEighthesIntegrator0);
      assertEquals(0, threeEighthesIntegrator0.getEvaluations());
      assertEquals("3/8", threeEighthesIntegrator0.getName());
      assertEquals(2147483647, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01D);
      
      Collection<EventHandler> collection0 = threeEighthesIntegrator0.getEventHandlers();
      assertNotNull(collection0);
      assertEquals(0, threeEighthesIntegrator0.getEvaluations());
      assertEquals("3/8", threeEighthesIntegrator0.getName());
      assertEquals(2147483647, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 0.3076923076923077;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      
      int int0 = dormandPrince853Integrator0.getEvaluations();
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0, int0);
      
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((double) int0, double0, doubleArray0, doubleArray0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(0.3076923076923077, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.3076923076923077, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try {
        dormandPrince54Integrator0.computeDerivatives((double) int0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1916.624763264718;
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(double0);
      assertNotNull(midpointIntegrator0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("midpoint", midpointIntegrator0.getName());
      assertEquals(0, midpointIntegrator0.getEvaluations());
      assertEquals(2147483647, midpointIntegrator0.getMaxEvaluations());
      
      midpointIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("midpoint", midpointIntegrator0.getName());
      assertEquals(0, midpointIntegrator0.getEvaluations());
      assertEquals(2147483647, midpointIntegrator0.getMaxEvaluations());
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.0;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      
      int int0 = dormandPrince54Integrator0.getMaxEvaluations();
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 0.0;
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(double0);
      assertNotNull(classicalRungeKuttaIntegrator0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, classicalRungeKuttaIntegrator0.getEvaluations());
      assertEquals(2147483647, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01D);
      
      classicalRungeKuttaIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, classicalRungeKuttaIntegrator0.getEvaluations());
      assertEquals(2147483647, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = 1916.624763264718;
      GillIntegrator gillIntegrator0 = new GillIntegrator(double0);
      assertNotNull(gillIntegrator0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Gill", gillIntegrator0.getName());
      
      double double1 = gillIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Gill", gillIntegrator0.getName());
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = 0.0;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      
      String string0 = dormandPrince54Integrator0.getName();
      assertNotNull(string0);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", string0);
  }
}