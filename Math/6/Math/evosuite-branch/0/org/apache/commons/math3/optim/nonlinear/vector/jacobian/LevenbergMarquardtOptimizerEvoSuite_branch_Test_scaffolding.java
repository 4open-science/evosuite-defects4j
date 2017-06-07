/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 20:05:30 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class LevenbergMarquardtOptimizerEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/6/0/run_evosuite.pl_102740_1418324039"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/6/0/run_evosuite.pl_102740_1418324039/target/classes"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(LevenbergMarquardtOptimizerEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.optim.nonlinear.vector.Target",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.optim.nonlinear.vector.ModelFunction",
      "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.optim.BaseOptimizer$1",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.analysis.MultivariateVectorFunction",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.optim.OptimizationData",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.optim.nonlinear.vector.Weight",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.exception.TooManyIterationsException",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.optim.ConvergenceChecker",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.util.ExceptionContext"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(LevenbergMarquardtOptimizerEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.NumberIsTooLargeException"
    );
  }
}
