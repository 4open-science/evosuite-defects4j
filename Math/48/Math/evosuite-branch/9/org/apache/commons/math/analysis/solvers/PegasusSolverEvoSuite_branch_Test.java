/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:09:30 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PegasusSolverEvoSuite_branch_Test extends PegasusSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 105.928031;
      PegasusSolver pegasusSolver0 = new PegasusSolver(double0, double0, double0);
      assertNotNull(pegasusSolver0);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(105.928031, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(105.928031, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(105.928031, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-617.92588868418);
      PegasusSolver pegasusSolver0 = new PegasusSolver(double0);
      assertNotNull(pegasusSolver0);
      assertEquals((-617.92588868418), pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1.0;
      PegasusSolver pegasusSolver0 = new PegasusSolver(double0, double0);
      assertNotNull(pegasusSolver0);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertNotNull(pegasusSolver0);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
  }
}
