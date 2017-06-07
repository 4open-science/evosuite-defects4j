/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:17:20 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test extends AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = false;
      double double0 = 1328.564;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0, double0, double0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = levenbergMarquardtOptimizer0.getConvergenceChecker();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertNull(convergenceChecker0);
      
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, convergenceChecker0);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[13];
      int int0 = 53;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(int0, int0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(53, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(53, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      Weight weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(53, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(53, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(weight0);
      
      optimizationDataArray0[7] = (OptimizationData) weight0;
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(53, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(53, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(optimizationDataArray0[7]);
      
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = gaussNewtonOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = false;
      double double0 = (-111.691465431);
      int int0 = 20;
      SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(double0, double0, int0);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simpleVectorValueChecker0);
      
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, (ConvergenceChecker<PointVectorValuePair>) simpleVectorValueChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals((-111.691465431), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      double[] doubleArray0 = new double[18];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      optimizationDataArray0[6] = (OptimizationData) weight0;
      assertNotNull(optimizationDataArray0[6]);
      
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = gaussNewtonOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 0.0;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.0;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      levenbergMarquardtOptimizer0.setCost(double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = (-1.0);
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0, double0, double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try {
        double double1 = levenbergMarquardtOptimizer0.computeCost(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = (-21.958768658934215);
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, double0, double0, double0, double0);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxIterations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = levenbergMarquardtOptimizer0.getWeightSquareRoot();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = null;
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, convergenceChecker0);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      double[] doubleArray0 = new double[1];
      double double0 = 592.5833877;
      // Undeclared exception!
      try {
        double[] doubleArray1 = gaussNewtonOptimizer0.computeSigma(doubleArray0, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = false;
      double double0 = (-111.691465431);
      int int0 = 20;
      SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(double0, double0, int0);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleVectorValueChecker0);
      
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, (ConvergenceChecker<PointVectorValuePair>) simpleVectorValueChecker0);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals((-111.691465431), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-111.691465431), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[8];
      // Undeclared exception!
      try {
        PointVectorValuePair pointVectorValuePair0 = gaussNewtonOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
