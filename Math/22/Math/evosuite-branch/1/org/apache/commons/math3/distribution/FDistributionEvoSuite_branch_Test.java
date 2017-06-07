/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:17:28 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FDistributionEvoSuite_branch_Test extends FDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 211.176662369725;
      double double1 = 0.0;
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 555.8602142;
      RandomGenerator randomGenerator0 = null;
      double double1 = (-34.0);
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(randomGenerator0, double1, double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-34)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      double double0 = 1.0E-9;
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) mersenneTwister0, double0, double0, double0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0E-9, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertNotNull(fDistribution0);
      
      int int0 = 615;
      double double1 = fDistribution0.density((double) int0);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0E-9, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(4.065040637347808E-13, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test3()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      double double0 = 1057.86364;
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) well19937c0, double0, double0, double0);
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertNotNull(fDistribution0);
      
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertFalse(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 1057.86364;
      FDistribution fDistribution0 = new FDistribution(double0, double0);
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertNotNull(fDistribution0);
  }

  @Test
  public void test5()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      double double0 = 1057.86364;
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) well19937c0, double0, double0, double0);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistribution0);
      
      double double1 = fDistribution0.sample();
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.1897376074192316, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test6()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      double double0 = 1057.86364;
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) well19937c0, double0, double0, double0);
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertNotNull(fDistribution0);
      
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertEquals(1057.86364, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0018941839876216, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1057.86364, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertFalse(boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      double double0 = 1.0E-9;
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) mersenneTwister0, double0, double0, double0);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.0E-9, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertNotNull(fDistribution0);
      
      int int0 = 615;
      double[] doubleArray0 = fDistribution0.sample(int0);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(1.0E-9, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertArrayEquals(new double[] {1.9789850842991434E-9, 1.6777216000000078E16, 1.6777215999999908E16, 1.0152506688943491E-9, 1.3059031490214521E-9, 0.0, 0.0, 1.701279067812369E-9, 1.3005141871546996E-9, 1.6777216000000384E16, 1.6777216000000364E16, 1.677721600000001E16, 0.0, 1.6777216000000156E16, 1.6777215999999902E16, 1.677721600000022E16, 1.2773473921569383E-9, 0.0, 1.677721600000007E16, 0.0, 1.6777215999999616E16, 1.0137383332568856E-9, 1.6777215999999912E16, 1.4863297186705776E-9, 1.5892382265420465E-9, 1.6777215999999962E16, 1.6777215999999686E16, 1.6777215999999688E16, 1.6777216000000216E16, 1.677721600000024E16, 1.6777215999999556E16, 1.010912472213993E-9, 1.0602000884132251E-9, 0.0, 1.6777216000000076E16, 1.6777216000000498E16, 1.6777216000000238E16, 1.677721599999974E16, 0.0, 0.0, 0.0, 1.6777216000000082E16, 1.4936801338840432E-9, 0.0, 1.7815741211255863E-9, 1.6777216000000314E16, 1.6777216000000308E16, 1.873420576912363E-9, 1.6777215999999958E16, 1.6777215999999738E16, 0.0, 0.0, 1.6973601557453E-9, 0.0, 1.6777216000000168E16, 1.1766361595020565E-9, 1.821708154285146E-9, 1.6777216000000174E16, 1.677721599999957E16, 1.6777216000000364E16, 1.6777216000000042E16, 1.6777216000000196E16, 0.0, 0.0, 0.0, 1.3863220214979357E-9, 1.6777215999999904E16, 1.6777216000000088E16, 1.677721600000055E16, 1.6777215999999728E16, 1.2466941223811839E-9, 1.7177695845578964E-9, 1.1479718902373815E-9, 0.0, 1.677721599999964E16, 1.6777216000000048E16, 0.0, 1.74876678281009E-9, 1.6777215999999786E16, 1.677721600000028E16, 1.677721600000003E16, 0.0, 1.6777216000000324E16, 0.0, 1.6777215999999644E16, 1.6777216000000156E16, 1.6777215999999876E16, 1.6777215999999956E16, 0.0, 1.5349762007213605E-9, 1.1421757559301928E-9, 0.0, 1.6777215999999726E16, 1.677721600000004E16, 0.0, 0.0, 1.6777215999999704E16, 0.0, 1.6777215999999602E16, 1.6777216000000408E16, 0.0, 1.5119198410997135E-9, 1.6777216000000104E16, 0.0, 1.6777215999999842E16, 0.0, 0.0, 1.677721599999984E16, 0.0, 1.6777215999999948E16, 1.677721599999968E16, 1.6777216000000112E16, 1.6777215999999646E16, 0.0, 1.1514952233241963E-9, 1.677721600000006E16, 1.677721600000004E16, 1.6777216000000436E16, 1.6777216000000256E16, 1.6777215999999624E16, 1.6777215999999908E16, 1.6777215999999824E16, 1.6777215999999836E16, 1.6777215999999632E16, 0.0, 1.4678865189696481E-9, 1.0700003840585442E-9, 1.2224217792527993E-9, 1.7051868805275656E-9, 1.6777215999999736E16, 1.6777215999999674E16, 1.6777216000000134E16, 1.6777216000000264E16, 1.6777216000000056E16, 0.0, 1.6777215999999736E16, 0.0, 1.039025986406898E-9, 0.0, 1.6777216000000536E16, 1.2135572953018603E-9, 0.0, 1.6777216000000262E16, 1.0333303381146553E-9, 1.6777215999999612E16, 1.6777216000000168E16, 1.6777216000000238E16, 1.6777216000000118E16, 0.0, 1.4142497075939426E-9, 1.6777216000000016E16, 1.677721600000046E16, 1.3330141124728978E-9, 1.6777216000000278E16, 1.6777216000000536E16, 1.428501716414385E-9, 1.6777216000000316E16, 0.0, 1.6777216000000462E16, 1.261649516016562E-9, 0.0, 1.677721600000034E16, 0.0, 1.4607392677212962E-9, 1.6777215999999784E16, 0.0, 1.6777215999999936E16, 1.6777216000000188E16, 0.0, 1.6777216000000436E16, 0.0, 1.6777216000000572E16, 1.7302304107111502E-9, 1.7957998057410438E-9, 1.6777216000000184E16, 1.185496169053423E-9, 1.6777215999999888E16, 1.6777216000000228E16, 1.6777216000000202E16, 1.6777215999999972E16, 1.6777216000000048E16, 1.4691871443682505E-9, 0.0, 0.0, 0.0, 0.0, 1.782513245803573E-9, 0.0, 1.6777216000000064E16, 0.0, 1.678861870777946E-9, 1.677721600000028E16, 1.2047781544831137E-9, 0.0, 1.146796991694312E-9, 1.6777216000000096E16, 1.6777216000000536E16, 1.67772160000002E16, 1.6777216000000308E16, 1.677721600000022E16, 1.6777215999999914E16, 0.0, 0.0, 0.0, 1.6777216000000064E16, 1.6777215999999742E16, 1.6777216000000446E16, 1.5529078351572091E-9, 1.6777215999999704E16, 1.6826805232373083E-9, 1.677721599999996E16, 1.6777216000000116E16, 1.4235443740271719E-9, 1.1386500071437503E-9, 1.6777215999999672E16, 1.065558868297446E-9, 1.3925283340105423E-9, 0.0, 1.6777216000000234E16, 1.677721599999998E16, 0.0, 1.677721599999987E16, 0.0, 0.0, 1.6777215999999788E16, 1.6755268517750468E-9, 1.6777216000000152E16, 1.677721600000008E16, 0.0, 0.0, 1.3372255512139376E-9, 1.677721600000058E16, 0.0, 0.0, 1.6777216000000044E16, 1.9632879322119027E-9, 1.1392389913135406E-9, 1.677721599999996E16, 1.6777216000000214E16, 1.6777215999999714E16, 1.677721599999952E16, 0.0, 1.6777216000000012E16, 1.6777215999999988E16, 0.0, 0.0, 1.6951559137817924E-9, 1.6777215999999504E16, 0.0, 1.2394558374199667E-9, 0.0, 1.6777216000000464E16, 1.6777215999999724E16, 1.6777215999999896E16, 1.6777216000000112E16, 0.0, 0.0, 1.6777216000000178E16, 1.6777215999999604E16, 1.6777216000000146E16, 1.677721600000028E16, 0.0, 0.0, 1.3541956191031022E-9, 1.6777216000000174E16, 0.0, 1.5858838228664354E-9, 1.6777216000000084E16, 0.0, 1.6777215999999704E16, 1.1896018901966463E-9, 1.6777215999999586E16, 1.6777216000000304E16, 1.6777216000000064E16, 0.0, 0.0, 1.7699269646705223E-9, 1.6777216000000304E16, 0.0, 1.677721600000028E16, 1.677721599999971E16, 1.0627430027866227E-9, 1.6777215999999922E16, 0.0, 1.677721600000028E16, 0.0, 1.677721599999967E16, 0.0, 1.67772160000001E16, 1.6777215999999532E16, 1.677721600000007E16, 1.6777216000000338E16, 1.6777215999999682E16, 1.2217219435172387E-9, 0.0, 0.0, 1.677721599999966E16, 0.0, 1.6777216000000248E16, 0.0, 1.6777215999999988E16, 1.6777216000000492E16, 1.6777215999999588E16, 0.0, 1.6777215999999818E16, 1.677721599999967E16, 0.0, 1.6777215999999744E16, 1.338634009259691E-9, 0.0, 1.6777215999999804E16, 1.6777216000000066E16, 1.67772159999999E16, 1.6777216000000372E16, 1.6777215999999934E16, 1.6777216000000324E16, 1.0934654088061248E-9, 1.3358366192095463E-9, 1.1378463100385272E-9, 1.677721599999966E16, 1.6777216000000332E16, 1.6777215999999714E16, 1.6777215999999476E16, 0.0, 1.677721600000034E16, 0.0, 1.6777216000000444E16, 1.1998585090538404E-9, 1.7695587465258026E-9, 1.7558764324530198E-9, 1.6777215999999612E16, 1.6777216000000324E16, 1.6777215999999502E16, 1.6777216000000566E16, 1.7915480516046364E-9, 1.6777216000000184E16, 1.6777216000000404E16, 1.6777216000000116E16, 1.6777216000000064E16, 1.6777215999999972E16, 1.2430267425931868E-9, 0.0, 1.2120684747289348E-9, 1.6777215999999468E16, 1.186579358443085E-9, 1.6777215999999668E16, 1.6777216000000304E16, 1.6777216000000032E16, 1.6777216000000254E16, 0.0, 1.008531938823564E-9, 1.6777216000000302E16, 1.6777215999999772E16, 1.6777216000000124E16, 0.0, 1.6777216000000108E16, 1.6777216000000212E16, 1.6777215999999764E16, 1.677721599999978E16, 0.0, 1.0994313277416132E-9, 0.0, 1.677721600000007E16, 0.0, 1.6777215999999988E16, 1.5481083036240166E-9, 0.0, 1.6777215999999746E16, 1.6777216000000188E16, 0.0, 1.8573951102442858E-9, 1.6777216000000024E16, 1.677721599999988E16, 1.5828108786428578E-9, 1.6777215999999592E16, 0.0, 1.67772159999996E16, 1.6777215999999856E16, 0.0, 1.2959901811657963E-9, 0.0, 0.0, 0.0, 1.6777215999999664E16, 1.67772160000001E16, 1.6777216000000272E16, 1.1458636838589885E-9, 0.0, 0.0, 1.6777216000000134E16, 1.3160756538737252E-9, 1.677721599999983E16, 0.0, 1.463803215515593E-9, 1.677721599999975E16, 1.6777216000000192E16, 1.6777215999999676E16, 1.6777216000000228E16, 1.6777216000000332E16, 1.6777215999999588E16, 1.6777215999999954E16, 1.6777216000000092E16, 0.0, 1.6777215999999758E16, 1.0296145977606078E-9, 1.6040654516915046E-9, 1.6777216000000204E16, 1.6777216E16, 1.707368487547973E-9, 1.677721599999992E16, 0.0, 0.0, 1.3131096845014624E-9, 1.055109770518781E-9, 1.6777216000000002E16, 1.311014797541715E-9, 1.6777215999999696E16, 1.6777215999999718E16, 0.0, 1.6777215999999814E16, 1.0380482111668038E-9, 0.0, 1.4661840755009063E-9, 1.6777216000000368E16, 1.6777216000000124E16, 1.6777216000000348E16, 1.0430412594165717E-9, 1.6777216000000274E16, 1.5997036679627275E-9, 1.4816739373534601E-9, 1.6777215999999984E16, 1.677721599999982E16, 0.0, 1.6777215999999766E16, 0.0, 1.6777216000000448E16, 0.0, 1.1954902430284325E-9, 1.4937040750389763E-9, 1.4090801659552322E-9, 0.0, 1.7901256169995287E-9, 0.0, 1.7034840144846501E-9, 1.1686038695209288E-9, 1.6777216000000308E16, 1.4344028829352702E-9, 1.6777215999999728E16, 0.0, 0.0, 1.67772160000001E16, 0.0, 0.0, 1.6777215999999586E16, 1.6777216000000024E16, 1.6777215999999984E16, 1.6777215999999792E16, 0.0, 1.677721599999966E16, 1.6777216000000176E16, 1.5956836457150544E-9, 1.2100039201843097E-9, 0.0, 1.677721600000016E16, 1.67772159999999E16, 1.6777215999999688E16, 1.6777216000000036E16, 1.6777215999999958E16, 1.677721600000002E16, 1.6777215999999494E16, 1.6777215999999708E16, 0.0, 1.6777215999999952E16, 1.6777215999999972E16, 1.6777216000000036E16, 1.6777216000000412E16, 1.6777216000000028E16, 1.978772616675475E-9, 1.6777215999999374E16, 1.6777215999999808E16, 1.6777215999999812E16, 1.0140104326466487E-9, 0.0, 1.6777215999999924E16, 1.6777215999999944E16, 1.6777216000000168E16, 0.0, 1.67772159999999E16, 1.6777215999999992E16, 0.0, 0.0, 0.0, 0.0, 1.6777216000000164E16, 1.6777215999999664E16, 0.0, 0.0, 1.677721600000009E16, 1.1765895081211286E-9, 1.6777216000000416E16, 1.0005765799340509E-9, 0.0, 1.6777215999999724E16, 1.6777215999999816E16, 1.4738191230845391E-9, 1.4284305867668925E-9, 0.0, 0.0, 1.677721600000012E16, 0.0, 1.6777216000000338E16, 0.0, 0.0, 1.67772160000002E16, 1.6777216000000292E16, 1.281476435558206E-9, 1.608868890655867E-9, 1.6777216000000432E16, 1.6777215999999648E16, 1.6777215999999896E16, 1.5522657800494876E-9, 1.4160938254121405E-9, 1.6777215999999604E16, 1.677721599999992E16, 1.6777215999999774E16, 1.6777215999999714E16, 1.0725581095644205E-9, 1.677721599999946E16, 1.6777215999999648E16, 1.094276266328236E-9, 1.6777215999999852E16, 1.677721600000034E16, 1.7009096850754364E-9, 1.6777216000000406E16, 1.67772160000002E16, 1.677721600000031E16, 1.4603011540459165E-9, 1.6777216000000272E16, 1.6777216000000136E16, 0.0, 1.1137667610878666E-9, 1.6777215999999628E16, 1.677721600000003E16, 1.6777215999999864E16, 1.6777215999999962E16, 1.6777215999999932E16, 1.6777216000000356E16, 1.821337999484913E-9, 1.6777216000000274E16, 1.591912112894869E-9, 1.6777216000000312E16, 1.3478736446955457E-9, 1.6777216000000074E16, 0.0, 1.511012237892419E-9, 1.6777215999999908E16, 0.0, 1.9390307187227715E-9, 1.6777215999999656E16, 1.677721600000015E16, 0.0, 0.0, 1.6777216000000136E16, 1.6777215999999468E16, 1.6351952385260529E-9, 1.6777216000000512E16, 1.6777215999999754E16, 1.6777215999999888E16, 1.6777215999999888E16, 1.6777216000000372E16, 1.9295553225663278E-9, 1.677721599999987E16, 1.4401836390304854E-9, 1.67772160000003E16, 0.0, 1.6777215999999848E16, 0.0, 1.6777215999999764E16, 0.0, 1.6777216000000256E16, 1.677721600000044E16, 0.0, 0.0, 1.6777215999999976E16, 1.6777216000000074E16, 1.839590836503218E-9, 1.008386315251652E-9, 0.0, 1.6777215999999428E16, 1.6777216000000104E16, 0.0, 0.0, 1.8607868424962468E-9, 0.0, 1.6777215999999572E16, 1.6777216000000132E16, 0.0, 1.6777215999999576E16, 0.0, 1.3645042391729032E-9, 0.0, 1.6777215999999676E16, 1.677721599999956E16, 1.6777215999999692E16, 1.6777215999999672E16, 0.0, 1.6777215999999548E16, 1.2467755739331754E-9, 1.3812499426804623E-9, 1.6777216000000286E16, 1.677721600000008E16, 1.677721600000028E16, 1.6777216000000196E16, 1.7697532952170759E-9, 1.6777215999999608E16}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
  }
}
