/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 20:19:39 GMT 2014
 */

package org.apache.commons.math.linear;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/76/7/run_evosuite.pl_88843_1418328558"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/76/7/run_evosuite.pl_88843_1418328558/target/classes"); 
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
    java.lang.System.setProperty("user.timezone", "GB-Eire"); 
      }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.linear.SingularValueDecompositionImpl$1",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.linear.DecompositionSolver",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.linear.SingularMatrixException",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.linear.AbstractRealVector$1",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.linear.AbstractRealVector$EntryImpl",
      "org.apache.commons.math.linear.EigenDecompositionImpl",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.linear.SingularValueDecompositionImpl",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.analysis.BinaryFunction$1",
      "org.apache.commons.math.analysis.BinaryFunction$2",
      "org.apache.commons.math.linear.LUDecomposition",
      "org.apache.commons.math.analysis.BinaryFunction",
      "org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator",
      "org.apache.commons.math.linear.LUDecompositionImpl",
      "org.apache.commons.math.analysis.BinaryFunction$4",
      "org.apache.commons.math.analysis.BinaryFunction$3",
      "org.apache.commons.math.analysis.BinaryFunction$6",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.analysis.BinaryFunction$5",
      "org.apache.commons.math.analysis.BinaryFunction$8",
      "org.apache.commons.math.analysis.BinaryFunction$7",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.ArgumentOutsideDomainException",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.linear.SingularValueDecomposition",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.DuplicateSampleAbscissaException",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.analysis.ComposableFunction$2",
      "org.apache.commons.math.analysis.ComposableFunction$1",
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.analysis.ComposableFunction$6",
      "org.apache.commons.math.analysis.ComposableFunction$32",
      "org.apache.commons.math.analysis.ComposableFunction$5",
      "org.apache.commons.math.analysis.ComposableFunction$33",
      "org.apache.commons.math.analysis.ComposableFunction$4",
      "org.apache.commons.math.analysis.ComposableFunction$30",
      "org.apache.commons.math.analysis.ComposableFunction$3",
      "org.apache.commons.math.analysis.ComposableFunction$31",
      "org.apache.commons.math.analysis.ComposableFunction$36",
      "org.apache.commons.math.analysis.ComposableFunction$34",
      "org.apache.commons.math.linear.EigenDecomposition",
      "org.apache.commons.math.analysis.ComposableFunction$35",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.analysis.ComposableFunction",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.analysis.ComposableFunction$20",
      "org.apache.commons.math.analysis.ComposableFunction$21",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.analysis.ComposableFunction$22",
      "org.apache.commons.math.analysis.ComposableFunction$23",
      "org.apache.commons.math.analysis.ComposableFunction$24",
      "org.apache.commons.math.analysis.ComposableFunction$25",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.analysis.ComposableFunction$26",
      "org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math.analysis.ComposableFunction$27",
      "org.apache.commons.math.analysis.ComposableFunction$28",
      "org.apache.commons.math.linear.SingularValueDecompositionImpl$Solver",
      "org.apache.commons.math.analysis.ComposableFunction$29",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.AbstractRealMatrix$5",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.analysis.ComposableFunction$10",
      "org.apache.commons.math.analysis.ComposableFunction$11",
      "org.apache.commons.math.analysis.ComposableFunction$18",
      "org.apache.commons.math.linear.AbstractRealMatrix$1",
      "org.apache.commons.math.analysis.ComposableFunction$19",
      "org.apache.commons.math.linear.AbstractRealMatrix$2",
      "org.apache.commons.math.analysis.ComposableFunction$16",
      "org.apache.commons.math.linear.AbstractRealMatrix$3",
      "org.apache.commons.math.analysis.ComposableFunction$17",
      "org.apache.commons.math.analysis.ComposableFunction$14",
      "org.apache.commons.math.analysis.ComposableFunction$15",
      "org.apache.commons.math.analysis.ComposableFunction$12",
      "org.apache.commons.math.analysis.ComposableFunction$13",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.BiDiagonalTransformer",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.analysis.ComposableFunction$7",
      "org.apache.commons.math.analysis.ComposableFunction$8",
      "org.apache.commons.math.analysis.ComposableFunction$9",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.linear.LUDecompositionImpl$Solver",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.analysis.ComposableFunction",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.linear.EigenDecompositionImpl",
      "org.apache.commons.math.linear.LUDecompositionImpl",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.analysis.BinaryFunction",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.linear.SingularMatrixException",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.MathRuntimeException$6"
    );
  }
}
