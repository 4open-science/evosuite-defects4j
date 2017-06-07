/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:17:39 GMT 2014
 */

package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.apache.commons.math.optimization.linear.UnboundedSolutionException;
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
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[0]);
      assertNotNull(linearObjectiveFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = true;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
      assertNotNull(realPointValuePair0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01D);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-192.6329115486348);
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[0]);
      assertNotNull(linearObjectiveFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = true;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, boolean0, double0);
      assertNotNull(simplexTableau0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      int int0 = 522;
      simplexTableau0.numArtificialVariables = int0;
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      boolean boolean1 = simplexSolver0.isOptimal(simplexTableau0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-192.6329115486348);
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertNotNull(simplexSolver0);
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[0]);
      assertNotNull(linearObjectiveFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = true;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, boolean0, double0);
      assertNotNull(simplexTableau0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      int int0 = 522;
      simplexTableau0.numArtificialVariables = int0;
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      doubleArray0[0] = (double) simplexTableau0.numArtificialVariables;
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      doubleArray0[2] = double0;
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) doubleArray0[0];
      doubleArray1[1] = doubleArray1[0];
      doubleArray1[2] = (Double) doubleArray0[0];
      doubleArray1[3] = (Double) double0;
      doubleArray1[4] = (Double) doubleArray0[1];
      doubleArray1[5] = doubleArray1[3];
      doubleArray1[6] = (Double) doubleArray0[0];
      doubleArray1[7] = (Double) doubleArray0[2];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1);
      assertNotNull(arrayRealVector0);
      assertEquals(66816.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(8, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(2665.8987346459044, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1096.0193044992923, arrayRealVector0.getNorm(), 0.01D);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct(doubleArray0);
      assertNotNull(array2DRowRealMatrix0);
      assertArrayEquals(new double[] {522.0, 0.0, (-192.6329115486348), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(66816.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(8, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(2665.8987346459044, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1096.0193044992923, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      simplexTableau0.tableau = (RealMatrix) array2DRowRealMatrix0;
      assertNotNull(simplexTableau0.tableau);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals(66816.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(8, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(2665.8987346459044, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1096.0193044992923, arrayRealVector0.getNorm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(8, simplexTableau0.tableau.getColumnDimension());
      assertEquals(8, simplexTableau0.tableau.getRowDimension());
      assertEquals(true, simplexTableau0.tableau.isSquare());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      simplexSolver0.solvePhase1(simplexTableau0);
      assertArrayEquals(new double[] {522.0, 0.0, (-192.6329115486348), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(1, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = (-1.124005056521139);
      SimplexSolver simplexSolver0 = new SimplexSolver(double0);
      assertNotNull(simplexSolver0);
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = double0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, double0);
      assertNotNull(linearObjectiveFunction0);
      assertArrayEquals(new double[] {(-1.124005056521139), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1.124005056521139), linearObjectiveFunction0.getConstantTerm(), 0.01D);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      boolean boolean0 = false;
      try {
        RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
      }
  }
}
