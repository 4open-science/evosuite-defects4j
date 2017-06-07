/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 18:37:33 GMT 2014
 */

package org.apache.commons.math.distribution;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class PoissonDistributionImplEvoSuite_branch_Test_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(6000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 5000);
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.7"); 
            java.lang.System.setProperty("java.home", "/usr/local/packages6/java/jdk1.7.0_55/jre"); 
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/61/7/run_evosuite.pl_42059_1418323007"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/61/7/run_evosuite.pl_42059_1418323007/target/classes"); 
    java.lang.System.setProperty("java.class.version", "51.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.7.0_55-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.7.0_55"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.7"); 
    java.lang.System.setProperty("java.vm.version", "24.55-b03"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "2.6.32-431.23.3.el6.x86_64"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.home", "/home/ac1gf"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ac1gf"); 
    java.lang.System.setProperty("user.timezone", "GB"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(PoissonDistributionImplEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.distribution.PoissonDistribution",
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.distribution.ZipfDistributionImpl",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.distribution.FDistribution",
      "org.apache.commons.math.distribution.PascalDistribution",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.distribution.ExponentialDistribution",
      "org.apache.commons.math.distribution.ChiSquaredDistribution",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.distribution.BinomialDistributionImpl",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.random.AbstractRandomGenerator",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.exception.NonMonotonousSequenceException",
      "org.apache.commons.math.distribution.WeibullDistribution",
      "org.apache.commons.math.distribution.PascalDistributionImpl",
      "org.apache.commons.math.distribution.CauchyDistributionImpl",
      "org.apache.commons.math.distribution.SaddlePointExpansion",
      "org.apache.commons.math.distribution.BetaDistribution",
      "org.apache.commons.math.MathRuntimeException$11",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.distribution.DiscreteDistribution",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.distribution.HypergeometricDistributionImpl",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.distribution.PoissonDistributionImpl",
      "org.apache.commons.math.distribution.CauchyDistribution",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.distribution.BetaDistributionImpl",
      "org.apache.commons.math.distribution.TDistribution",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.distribution.IntegerDistribution",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.exception.util.MessageFactory",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.distribution.ExponentialDistributionImpl",
      "org.apache.commons.math.special.Erf",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.distribution.HypergeometricDistribution",
      "org.apache.commons.math.distribution.NormalDistributionImpl",
      "org.apache.commons.math.distribution.BinomialDistribution",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.distribution.ChiSquaredDistributionImpl",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.distribution.WeibullDistributionImpl",
      "org.apache.commons.math.distribution.HasDensity",
      "org.apache.commons.math.distribution.GammaDistributionImpl",
      "org.apache.commons.math.distribution.NormalDistribution",
      "org.apache.commons.math.distribution.GammaDistribution",
      "org.apache.commons.math.random.RandomData",
      "org.apache.commons.math.distribution.ZipfDistribution",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.random.RandomDataImpl",
      "org.apache.commons.math.distribution.AbstractIntegerDistribution"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(PoissonDistributionImplEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math.distribution.PoissonDistributionImpl",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.distribution.SaddlePointExpansion",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.random.RandomDataImpl",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.NormalDistributionImpl",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.FunctionEvaluationException"
    );
  }
}