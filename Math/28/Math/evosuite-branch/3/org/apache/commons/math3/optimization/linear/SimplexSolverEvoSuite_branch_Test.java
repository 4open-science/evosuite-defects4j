/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:58:30 GMT 2014
 */

package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.UnboundedSolutionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SimplexSolverEvoSuite_branch_Test extends SimplexSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      
      double[] doubleArray0 = new double[19];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[4]);
      assertNotNull(linearObjectiveFunction0);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = false;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
      assertNotNull(pointValuePair0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      
      double[] doubleArray0 = new double[10];
      double double0 = 1591.7285775569064;
      doubleArray0[3] = double0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, double0);
      assertNotNull(linearObjectiveFunction0);
      assertEquals(1591.7285775569064, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 1591.7285775569064, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = false;
      GoalType goalType0 = GoalType.MINIMIZE;
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
      }
  }
}