/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:52:46 GMT 2014
 */

package org.apache.commons.math.ode;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.nonstiff.GillIntegrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractIntegratorEvoSuite_branch_Test extends AbstractIntegratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(double0, double0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(graggBulirschStoerIntegrator0);
      assertEquals(2147483647, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01D);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      
      int int0 = 1156;
      graggBulirschStoerIntegrator0.setMaxEvaluations(int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01D);
      assertEquals(1156, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 551636.0;
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(double0);
      assertNotNull(classicalRungeKuttaIntegrator0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
      assertEquals(0, classicalRungeKuttaIntegrator0.getEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      
      Collection<EventHandler> collection0 = classicalRungeKuttaIntegrator0.getEventHandlers();
      assertNotNull(collection0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("classical Runge-Kutta", classicalRungeKuttaIntegrator0.getName());
      assertEquals(0, classicalRungeKuttaIntegrator0.getEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-2724);
      GillIntegrator gillIntegrator0 = new GillIntegrator((double) int0);
      assertNotNull(gillIntegrator0);
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals("Gill", gillIntegrator0.getName());
      
      double double0 = gillIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, double0, 0.01D);
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals("Gill", gillIntegrator0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = Double.NaN;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, double0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      
      int int0 = dormandPrince853Integrator0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.0;
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(double0, double0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      
      int int0 = dormandPrince54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01D);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01D);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01D);
      assertEquals(2147483647, dormandPrince54Integrator0.getMaxEvaluations());
      
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(double0, double0, double0, double0);
      assertNotNull(graggBulirschStoerIntegrator0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01D);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01D);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(2147483647, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
      
      boolean boolean0 = false;
      // Undeclared exception!
      try {
        double double1 = graggBulirschStoerIntegrator0.initializeStep(boolean0, int0, doubleArray0, doubleArray0[3], doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = (-2070.521435241152);
      GillIntegrator gillIntegrator0 = new GillIntegrator(double0);
      assertNotNull(gillIntegrator0);
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Gill", gillIntegrator0.getName());
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
      
      gillIntegrator0.clearEventHandlers();
      assertEquals(0, gillIntegrator0.getEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals("Gill", gillIntegrator0.getName());
      assertEquals(2147483647, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = Double.NaN;
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(double0);
      assertNotNull(eulerIntegrator0);
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Euler", eulerIntegrator0.getName());
      
      String string0 = eulerIntegrator0.getName();
      assertEquals("Euler", string0);
      assertNotNull(string0);
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals("Euler", eulerIntegrator0.getName());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 0;
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((double) int0);
      assertNotNull(eulerIntegrator0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals("Euler", eulerIntegrator0.getName());
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
      
      EventHandler eventHandler0 = null;
      MullerSolver mullerSolver0 = new MullerSolver((double) int0);
      assertNotNull(mullerSolver0);
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      
      eulerIntegrator0.addEventHandler(eventHandler0, (double) int0, (double) int0, int0, (UnivariateRealSolver) mullerSolver0);
      assertEquals(0.0, mullerSolver0.getMax(), 0.01D);
      assertEquals(0.0, mullerSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, mullerSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getMaxEvaluations());
      assertEquals(0, mullerSolver0.getEvaluations());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals("Euler", eulerIntegrator0.getName());
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 1156;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(double0, double0, (double) int0, double0);
      assertNotNull(dormandPrince853Integrator0);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
      
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertNotNull(collection0);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01D);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01D);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01D);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01D);
      assertEquals(2147483647, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01D);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      double double0 = (-2070.521435241152);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(double0);
      assertNotNull(eulerIntegrator0);
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals("Euler", eulerIntegrator0.getName());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
      
      eulerIntegrator0.clearStepHandlers();
      assertEquals(2147483647, eulerIntegrator0.getMaxEvaluations());
      assertEquals("Euler", eulerIntegrator0.getName());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01D);
      assertEquals(0, eulerIntegrator0.getEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01D);
  }
}
