/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:15:29 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EigenDecompositionImplEvoSuite_branch_Test extends EigenDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 3508.9072623;
      double[] doubleArray1 = new double[7];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotSame(doubleArray1, doubleArray0);
      
      doubleArray1[3] = double0;
      doubleArray1[4] = doubleArray1[3];
      doubleArray1[5] = double0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 3508.9072623, 3508.9072623, 3508.9072623, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 3508.9072623;
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = double0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, doubleArray0[3]);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 3508.9072623, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = Double.POSITIVE_INFINITY;
      double[] doubleArray0 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      double double1 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double1, 0.01D);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-770.5131134894816);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(9, array2DRowRealMatrix0.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(9, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(9, array2DRowRealMatrix1.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix1);
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(22, array2DRowRealMatrix0.getRowDimension());
      assertEquals(22, array2DRowRealMatrix0.getColumnDimension());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(22, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(22, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix1);
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(22, array2DRowRealMatrix0.getRowDimension());
      assertEquals(22, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getV();
      assertEquals(22, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(22, array2DRowRealMatrix1.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix1);
      assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-55.3377);
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[3][9];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray1[0];
      assertNotNull(doubleArray1[2]);
      
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      assertEquals(3, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(7, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) realMatrixImpl0, doubleArray0[1]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = Double.POSITIVE_INFINITY;
      double[] doubleArray0 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      int int0 = 1;
      double double1 = eigenDecompositionImpl0.getRealEigenvalue(int0);
      assertEquals(0.0, double1, 0.01D);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-770.5131134894816);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      int int0 = (-645);
      try {
        RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -645
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 3508.9072623;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      double[] doubleArray1 = eigenDecompositionImpl0.getRealEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = Double.POSITIVE_INFINITY;
      double[] doubleArray0 = new double[5];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      int int0 = 1;
      double double1 = eigenDecompositionImpl0.getImagEigenvalue(int0);
      assertEquals(0.0, double1, 0.01D);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      double[] doubleArray1 = eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(22, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(22, array2DRowRealMatrix0.getRowDimension());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, doubleArray0[2]);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertEquals(22, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(22, array2DRowRealMatrix0.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01D);
      assertFalse(eigenDecompositionImpl0.equals((Object)eigenDecompositionImpl1));
      assertFalse(eigenDecompositionImpl1.equals((Object)eigenDecompositionImpl0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl1);
      assertNotSame(eigenDecompositionImpl0, eigenDecompositionImpl1);
      assertNotSame(eigenDecompositionImpl1, eigenDecompositionImpl0);
  }

  @Test
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[22];
      double double0 = Double.NaN;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, double0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(eigenDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(decompositionSolver0);
  }
}
