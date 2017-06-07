/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:09:47 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class IllinoisSolverEvoSuite_branch_Test extends IllinoisSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 1.0E-6;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0, double0, double0);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertNotNull(illinoisSolver0);
  }

  @Test
  public void test1()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertNotNull(illinoisSolver0);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1.0E-9;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-9, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1.0E-6;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0, double0);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertNotNull(illinoisSolver0);
  }
}
