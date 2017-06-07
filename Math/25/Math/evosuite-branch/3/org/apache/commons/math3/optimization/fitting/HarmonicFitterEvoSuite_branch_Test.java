/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:59:28 GMT 2014
 */

package org.apache.commons.math3.optimization.fitting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class HarmonicFitterEvoSuite_branch_Test extends HarmonicFitterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      long long0 = (-32L);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
      double double0 = 2.7641662602473095E71;
      double double1 = 2968.065905956848;
      double double2 = (-439.07252732);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double1, double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(2968.065905956848, weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(2968.065905956848, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(2968.065905956848, weightedObservedPoint0.getX(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint0.getY(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double2, double2, (double) long0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals((-439.07252732), weightedObservedPoint1.getX(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint1.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertEquals((-439.07252732), weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals((-32.0), weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint1.getX(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint1.getY(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint1.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double0, (double) long0, (double) long0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertEquals(2.7641662602473095E71, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint2.getX(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint2.getY(), 0.01D);
      assertNotNull(weightedObservedPoint2);
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertEquals(2.7641662602473095E71, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-32.0), weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals((-32.0), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPoint2.getWeight(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint2.getX(), 0.01D);
      assertEquals((-32.0), weightedObservedPoint2.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      double double3 = (-3074.53101);
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double1, double0, double3);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertEquals(2.7641662602473095E71, weightedObservedPoint3.getX(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint3.getY(), 0.01D);
      assertEquals(2968.065905956848, weightedObservedPoint3.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint3);
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertEquals(2968.065905956848, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(2.7641662602473095E71, weightedObservedPoint3.getX(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint3.getY(), 0.01D);
      assertEquals(2968.065905956848, weightedObservedPoint3.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(double3, double3, double2);
      assertFalse(weightedObservedPoint4.equals((Object)weightedObservedPoint3));
      assertFalse(weightedObservedPoint4.equals((Object)weightedObservedPoint2));
      assertFalse(weightedObservedPoint4.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint4.equals((Object)weightedObservedPoint0));
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertNotSame(weightedObservedPoint4, weightedObservedPoint3);
      assertNotSame(weightedObservedPoint4, weightedObservedPoint2);
      assertNotSame(weightedObservedPoint4, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint4, weightedObservedPoint0);
      assertEquals((-439.07252732), weightedObservedPoint4.getY(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint4.getX(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint4.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint4);
      
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      assertEquals((-439.07252732), weightedObservedPointArray0[4].getY(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPointArray0[4].getWeight(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPointArray0[4].getX(), 0.01D);
      assertEquals((-439.07252732), weightedObservedPoint4.getY(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint4.getX(), 0.01D);
      assertEquals((-3074.53101), weightedObservedPoint4.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[4]);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // denominator must be different from 0
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 0.0;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(0.0, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      double double1 = 1.3069802481237792E-8;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertFalse(double0 == double1);
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1.3069802481237792E-8, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertEquals(1.3069802481237792E-8, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertEquals(1.3069802481237792E-8, weightedObservedPoint1.getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      double double2 = (-1.0E-8);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double0, double2, double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertEquals((-1.0E-8), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(1.3069802481237792E-8, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint2);
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertEquals((-1.0E-8), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(1.3069802481237792E-8, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals((-1.0E-8), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(1.3069802481237792E-8, weightedObservedPoint2.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      double double3 = 4.908843759498681E-306;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double0, double3, double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertEquals(4.908843759498681E-306, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint3.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint3);
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertEquals(4.908843759498681E-306, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(4.908843759498681E-306, weightedObservedPointArray0[3].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.0, 2.7235540106117404E8, 1.5707963267948966}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 995.869;
      double double1 = 0.0;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(0.0, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[0].getY(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(double0, double0, double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(weightedObservedPoint1.equals((Object)weightedObservedPoint0));
      assertNotSame(weightedObservedPoint1, weightedObservedPoint0);
      assertEquals(995.869, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertNotNull(weightedObservedPoint1);
      
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      assertEquals(0.0, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint1.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint1.getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPoint1.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      double double2 = (-323.574165942);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(double1, double2, double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint2.equals((Object)weightedObservedPoint1));
      assertNotSame(weightedObservedPoint2, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint2, weightedObservedPoint1);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertEquals((-323.574165942), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint2);
      
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      assertEquals(0.0, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(0.0, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals((-323.574165942), weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getY(), 0.01D);
      assertEquals((-323.574165942), weightedObservedPoint2.getX(), 0.01D);
      assertEquals(0.0, weightedObservedPoint2.getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      double double3 = 2591.8;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(double0, double3, double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint2));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint0));
      assertFalse(weightedObservedPoint3.equals((Object)weightedObservedPoint1));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint2);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint0);
      assertNotSame(weightedObservedPoint3, weightedObservedPoint1);
      assertEquals(2591.8, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(995.869, weightedObservedPoint3.getWeight(), 0.01D);
      assertNotNull(weightedObservedPoint3);
      
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      assertEquals(2591.8, weightedObservedPoint3.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint3.getY(), 0.01D);
      assertEquals(995.869, weightedObservedPoint3.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[3].getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(2591.8, weightedObservedPointArray0[3].getX(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {497.9345, 0.00215519002006022, (-0.49592017217819173)}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      double double0 = 995.869;
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(double0, double0, double0);
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPoint0);
      
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[0].getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[0].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[0].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[0]);
      
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[1].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[1].getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[1].getWeight(), 0.01D);
      assertNotNull(weightedObservedPointArray0[1]);
      
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      assertEquals(995.869, weightedObservedPointArray0[2].getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[2].getY(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[2].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getX(), 0.01D);
      assertEquals(995.869, weightedObservedPoint0.getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[2]);
      
      weightedObservedPointArray0[3] = weightedObservedPointArray0[1];
      assertEquals(995.869, weightedObservedPointArray0[3].getWeight(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[3].getX(), 0.01D);
      assertEquals(995.869, weightedObservedPointArray0[3].getY(), 0.01D);
      assertNotNull(weightedObservedPointArray0[3]);
      
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      assertNotNull(harmonicFitter_ParameterGuesser0);
      
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorOptimizer0);
      assertNotNull(harmonicFitter0);
      
      double[] doubleArray0 = new double[11];
      // Undeclared exception!
      try {
        double[] doubleArray1 = harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(differentiableMultivariateVectorOptimizer0);
      assertNotNull(harmonicFitter0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
      }
  }
}
