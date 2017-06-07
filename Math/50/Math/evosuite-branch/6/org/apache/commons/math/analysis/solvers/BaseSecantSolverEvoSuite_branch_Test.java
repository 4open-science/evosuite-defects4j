/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:46:42 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BaseSecantSolverEvoSuite_branch_Test extends BaseSecantSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 675;
      double double0 = (-2931.9);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, double0, double0);
      assertNotNull(harmonicOscillator0);
      
      double double1 = 1.5288829184540942;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, double1, (double) int0, allowedSolution0);
      assertEquals(256.0884453722459, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(338.26444145922704, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(675.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(22, illinoisSolver0.getEvaluations());
      assertEquals(1.5288829184540942, illinoisSolver0.getMin(), 0.01D);
      assertEquals(675, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = 0.816721593;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 114;
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      double double1 = (-703.6867823126731);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) asinh0, double1, double0, allowedSolution0);
      assertEquals(1.4359274032362392E-12, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(10, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(114, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-351.43503035983656), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-703.6867823126731), illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.816721593, illinoisSolver0.getMax(), 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = 394;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      double double0 = (-1976.06761);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = illinoisSolver0.solve(int0, (UnivariateRealFunction) sin0, double0, (double) int0, allowedSolution0);
      assertEquals((-1976.0617791079824), double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals((-791.033805), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(394, illinoisSolver0.getMaxEvaluations());
      assertEquals((-1976.06761), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(394.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(7, illinoisSolver0.getEvaluations());
  }

  @Test
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 44;
      double double0 = (-1.5707963267948966);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, double0, (double) int0);
      assertNotNull(harmonicOscillator0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = illinoisSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, double0, (double) int0, (double) int0, allowedSolution0);
      assertEquals(23.01126998417358, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1.5707963267948966), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(44, illinoisSolver0.getMaxEvaluations());
      assertEquals(11, illinoisSolver0.getEvaluations());
      assertEquals(44.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(44.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1.5707963267948966), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(44, illinoisSolver0.getMaxEvaluations());
      assertEquals(11, illinoisSolver0.getEvaluations());
      assertEquals(44.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(44.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(23.01126998417358, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      double double2 = 1654.0;
      assertFalse(double2 == double1);
      
      double double3 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, (double) int0, double2);
      assertEquals(863.004340284813, double3, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1.5707963267948966), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(44, illinoisSolver0.getMaxEvaluations());
      assertEquals(11, illinoisSolver0.getEvaluations());
      assertEquals(44.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(44.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(23.01126998417358, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(849.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(44.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(44, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1654.0, regulaFalsiSolver0.getMax(), 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 686.049974322;
      double double1 = (-7.337685407671969);
      int int0 = 253;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double2 = 0.38822;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) sinh0, double1, double2, double0, allowedSolution0);
      assertEquals(5.422159071835807E-17, double3, 0.01D);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertEquals((-7.337685407671969), pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(14, pegasusSolver0.getEvaluations());
      assertEquals(0.38822, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(253, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(686.049974322, pegasusSolver0.getStartValue(), 0.01D);
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = 439.7514669645767;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 1825;
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      double double1 = (-1353.74);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) asinh0, double1, double0, allowedSolution0);
      assertEquals((-1.0478827397398324E-21), double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(439.7514669645767, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1825, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(15, illinoisSolver0.getEvaluations());
      assertEquals((-456.9942665177116), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals((-1353.74), illinoisSolver0.getMin(), 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = (-1187.8222141703282);
      double double1 = (-7.7284839470582956);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      int int0 = 190;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double2 = 3.1075962331395486;
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) sinh0, double1, double2, double0, allowedSolution0);
      assertEquals(7.380422930204435E-16, double3, 0.01D);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(190, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(16, pegasusSolver0.getEvaluations());
      assertEquals(3.1075962331395486, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-7.7284839470582956), pegasusSolver0.getMin(), 0.01D);
      assertEquals((-1187.8222141703282), pegasusSolver0.getStartValue(), 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 1688.755464414897;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1688.755464414897, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1688.755464414897, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1688.755464414897, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertNotNull(regulaFalsiSolver0);
      
      int int0 = 2478;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      double double1 = (-3234.8454552629564);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) tanh0, double1, double0, (double) int0, allowedSolution0);
      assertEquals((-773.0449954240296), double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals((-3234.8454552629564), regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1688.755464414897, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(1688.755464414897, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(2478, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1688.755464414897, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2478.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1688.755464414897, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = 440.42532;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 1783;
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      double double1 = (-1352.3046036456344);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) asinh0, double1, double0, allowedSolution0);
      assertEquals(2.3068958222573246E-11, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-455.9396418228172), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(440.42532, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1783, illinoisSolver0.getMaxEvaluations());
      assertEquals(15, illinoisSolver0.getEvaluations());
      assertEquals((-1352.3046036456344), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertNotNull(illinoisSolver0);
      
      int int0 = 55;
      double double0 = (-1.8918322493076136);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, double0, (double) int0);
      assertNotNull(harmonicOscillator0);
      
      double double1 = 6.28319;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) harmonicOscillator0, double0, double1, (double) int0, allowedSolution0);
      assertEquals(4.993522615925762, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(55, illinoisSolver0.getMaxEvaluations());
      assertEquals(6.28319, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(11, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(55.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals((-1.8918322493076136), illinoisSolver0.getMin(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = 0.8167215933847081;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 1766;
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      double double1 = (-1322.3747158889635);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) asinh0, double1, double0, allowedSolution0);
      assertEquals((-7.812034397191095E-10), double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals((-1322.3747158889635), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(10, illinoisSolver0.getEvaluations());
      assertEquals(1766, illinoisSolver0.getMaxEvaluations());
      assertEquals((-660.7789971477894), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      
      IllinoisSolver illinoisSolver1 = new IllinoisSolver(double2, double0, double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(illinoisSolver1.equals((Object)illinoisSolver0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(illinoisSolver0.equals((Object)illinoisSolver1));
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(0, illinoisSolver1.getMaxEvaluations());
      assertEquals(0, illinoisSolver1.getEvaluations());
      assertEquals(0.0, illinoisSolver1.getMin(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver1.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-7.812034397191095E-10), illinoisSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver1.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver1.getMax(), 0.01D);
      assertEquals((-1322.3747158889635), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(10, illinoisSolver0.getEvaluations());
      assertEquals(1766, illinoisSolver0.getMaxEvaluations());
      assertEquals((-660.7789971477894), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(illinoisSolver1);
      assertNotSame(illinoisSolver1, illinoisSolver0);
      assertNotSame(illinoisSolver0, illinoisSolver1);
      
      Log log0 = new Log();
      assertNotNull(log0);
      
      double double3 = illinoisSolver1.solve(int0, (UnivariateRealFunction) log0, double0, (double) int0, (double) int0);
      assertEquals(0.9912100469687919, double3, 0.01D);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(illinoisSolver1.equals((Object)illinoisSolver0));
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(illinoisSolver0.equals((Object)illinoisSolver1));
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1766, illinoisSolver1.getMaxEvaluations());
      assertEquals(0.8167215933847081, illinoisSolver1.getMin(), 0.01D);
      assertEquals(1766.0, illinoisSolver1.getStartValue(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver1.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, illinoisSolver1.getEvaluations());
      assertEquals((-7.812034397191095E-10), illinoisSolver1.getRelativeAccuracy(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver1.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1766.0, illinoisSolver1.getMax(), 0.01D);
      assertEquals((-1322.3747158889635), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(10, illinoisSolver0.getEvaluations());
      assertEquals(1766, illinoisSolver0.getMaxEvaluations());
      assertEquals((-660.7789971477894), illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.8167215933847081, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertNotSame(illinoisSolver1, illinoisSolver0);
      assertNotSame(illinoisSolver0, illinoisSolver1);
  }

  @Test
  public void test11()  throws Throwable  {
      double double0 = 1866.241892002029;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1866.241892002029, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      int int0 = 3;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double1 = (-25.391181136238846);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) sinh0, double1, (double) int0, allowedSolution0);
      assertEquals(2.9999999946575655, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-11.195590568119423), regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1866.241892002029, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals((-25.391181136238846), regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(3.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = 1688.755464414897;
      double double1 = (-0.0013888888689);
      int int0 = 2478;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      double double2 = 9.140260083262505E-9;
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) sinh0, double1, double2, double0, allowedSolution0);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertEquals(1688.755464414897, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-0.0013888888689), pegasusSolver0.getMin(), 0.01D);
      assertEquals(9.140260083262505E-9, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2478, pegasusSolver0.getMaxEvaluations());
      assertEquals(5, pegasusSolver0.getEvaluations());
  }

  @Test
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      double double0 = pegasusSolver0.getMax();
      assertEquals(0.0, double0, 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      
      int int0 = 394;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = pegasusSolver0.solve(int0, (UnivariateRealFunction) sin0, double0, (double) int0, (double) int0, allowedSolution0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(394.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(394.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(394, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2, pegasusSolver0.getEvaluations());
  }

  @Test
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertNotNull(pegasusSolver0);
      
      double double0 = pegasusSolver0.getMax();
      assertEquals(0.0, double0, 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      
      int int0 = 394;
      Sin sin0 = new Sin();
      assertNotNull(sin0);
      
      double double1 = pegasusSolver0.solve(int0, (UnivariateRealFunction) sin0, (double) int0, double0, double0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(2, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(394.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(394, pegasusSolver0.getMaxEvaluations());
  }

  @Test
  public void test15()  throws Throwable  {
      double double0 = 686.049974322;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0, double0);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(686.049974322, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(686.049974322, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertNotNull(illinoisSolver0);
  }
}
