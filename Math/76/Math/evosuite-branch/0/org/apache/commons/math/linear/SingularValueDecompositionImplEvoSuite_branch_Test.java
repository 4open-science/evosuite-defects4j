/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:05:10 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SingularValueDecompositionImplEvoSuite_branch_Test extends SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[17];
      double double0 = Double.NEGATIVE_INFINITY;
      doubleArray1[4] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      assertEquals(Double.POSITIVE_INFINITY, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(false, blockRealMatrix0.isSquare());
      assertEquals(17, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertNotNull(blockRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) blockRealMatrix0);
      assertEquals(Double.POSITIVE_INFINITY, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(false, blockRealMatrix0.isSquare());
      assertEquals(17, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      int int0 = singularValueDecompositionImpl0.getRank();
      assertEquals(0, int0);
      assertEquals(Double.POSITIVE_INFINITY, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(false, blockRealMatrix0.isSquare());
      assertEquals(17, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
  }

  @Test
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[11][5];
      double[] doubleArray1 = new double[5];
      double double0 = (-1513.32);
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      double double1 = 2673.007997632411;
      boolean boolean0 = true;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1513.32, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = singularValueDecompositionImpl0.getCovariance(double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cutoff singular value is 2,673.008, should be at most 1,513.32
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[3][5];
      double[] doubleArray1 = new double[5];
      double double0 = 640.9679;
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      boolean boolean0 = false;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(640.9679, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(double0);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(640.9679, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(double0);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix2.isSquare());
      assertEquals(1, array2DRowRealMatrix2.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getRowDimension());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(640.9679, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(array2DRowRealMatrix2);
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
      assertTrue(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[3];
      double double0 = 1.0E-11;
      doubleArray1[1] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      boolean boolean0 = false;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(double0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getV();
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix2.getRowDimension());
      assertEquals(false, array2DRowRealMatrix2.isSquare());
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(array2DRowRealMatrix2);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix1));
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[11];
      double double0 = 0.45812870843181397;
      doubleArray0[8] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45812870843181397, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      int int0 = 932;
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0, int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45812870843181397, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(0.45812870843181397, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getS();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45812870843181397, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(0.45812870843181397, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getS();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.45812870843181397, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(11, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix2.isSquare());
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix2.getRowDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(0.45812870843181397, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertNotNull(array2DRowRealMatrix2);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 602;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) int0;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertArrayEquals(new double[] {602.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(602.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(602.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertNotNull(arrayRealVector0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct(doubleArray0);
      assertArrayEquals(new double[] {602.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(602.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(602.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {602.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(362404.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(602.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getUT();
      assertArrayEquals(new double[] {602.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(362404.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(602.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(false, array2DRowRealMatrix1.isSquare());
      assertEquals(5, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {602.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(362404.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(602.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(602.0, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(602.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertNotNull(decompositionSolver0);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[3];
      double double0 = 1.0E-11;
      doubleArray1[1] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      boolean boolean0 = false;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      double[] doubleArray2 = singularValueDecompositionImpl0.getSingularValues();
      assertArrayEquals(new double[] {1.0E-11}, doubleArray2, 0.01);
      assertNotSame(doubleArray2, doubleArray1);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(doubleArray2);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray0[0] = doubleArray2;
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1.0E-11, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(doubleArray0[0]);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl1 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertNotSame(singularValueDecompositionImpl1, singularValueDecompositionImpl0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1.0, singularValueDecompositionImpl1.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl1.getRank());
      assertEquals(1.0E-11, singularValueDecompositionImpl1.getNorm(), 0.01D);
      assertNotNull(singularValueDecompositionImpl1);
      assertFalse(singularValueDecompositionImpl1.equals((Object)singularValueDecompositionImpl0));
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl1.getSolver();
      assertNotSame(singularValueDecompositionImpl1, singularValueDecompositionImpl0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertEquals(1.0, singularValueDecompositionImpl1.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl1.getRank());
      assertEquals(1.0E-11, singularValueDecompositionImpl1.getNorm(), 0.01D);
      assertNotNull(decompositionSolver0);
      assertFalse(singularValueDecompositionImpl1.equals((Object)singularValueDecompositionImpl0));
  }

  @Test
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[3];
      double double0 = (-1.0);
      doubleArray1[1] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      boolean boolean0 = true;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(decompositionSolver0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getU();
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
  }

  @Test
  public void test8()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      boolean boolean0 = false;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0, boolean0);
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        double double0 = singularValueDecompositionImpl0.getConditionNumber();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertNotNull(arrayRealVector0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(0.0, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(0.0, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(5, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(0.0, arrayRealVector0.getNorm(), 0.01D);
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        double double0 = singularValueDecompositionImpl0.getNorm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }
}
