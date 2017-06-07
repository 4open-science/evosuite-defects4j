/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 17:56:10 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/14/3/run_evosuite.pl_2163_1418319951"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/14/3/run_evosuite.pl_2163_1418319951/target/classes"); 
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
    java.lang.System.setProperty("user.timezone", "Europe/Guernsey"); 
      }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.linear.RealVector$1",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.analysis.function.Atan",
      "org.apache.commons.math3.analysis.differentiation.DSCompiler",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.optim.nonlinear.vector.Target",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.function.Cbrt",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.linear.RealVector$Entry",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.analysis.function.Minus",
      "org.apache.commons.math3.analysis.function.Expm1",
      "org.apache.commons.math3.analysis.function.Divide",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer",
      "org.apache.commons.math3.analysis.function.Floor",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.analysis.function.Atanh",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.analysis.function.Acosh",
      "org.apache.commons.math3.analysis.function.Inverse",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "org.apache.commons.math3.analysis.function.Acos",
      "org.apache.commons.math3.linear.SingularMatrixException",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer",
      "org.apache.commons.math3.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math3.analysis.function.Tanh",
      "org.apache.commons.math3.analysis.FunctionUtils",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.analysis.function.Exp",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.linear.SparseRealVector",
      "org.apache.commons.math3.analysis.function.Logit",
      "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.optim.ConvergenceChecker",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math3.analysis.function.Signum",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.analysis.function.Asinh",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.analysis.differentiation.DerivativeStructure",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.analysis.function.Asin",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.analysis.function.Cos",
      "org.apache.commons.math3.linear.DecompositionSolver",
      "org.apache.commons.math3.analysis.function.StepFunction",
      "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.linear.RealVectorChangingVisitor",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.linear.RealVectorPreservingVisitor",
      "org.apache.commons.math3.analysis.function.Logistic",
      "org.apache.commons.math3.analysis.function.Tan",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.analysis.function.Sinc",
      "org.apache.commons.math3.FieldElement",
      "org.apache.commons.math3.analysis.function.Sin",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.analysis.function.Sinh",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.optim.nonlinear.vector.ModelFunction",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.analysis.function.Power",
      "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer",
      "org.apache.commons.math3.linear.RealVector$SparseEntryIterator",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.optim.BaseOptimizer$1",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.analysis.function.Constant",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.analysis.MultivariateVectorFunction",
      "org.apache.commons.math3.analysis.function.Sigmoid",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.analysis.MultivariateFunction",
      "org.apache.commons.math3.analysis.function.Sqrt",
      "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer",
      "org.apache.commons.math3.linear.OpenMapRealVector",
      "org.apache.commons.math3.linear.NonSymmetricMatrixException",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
      "org.apache.commons.math3.linear.TriDiagonalTransformer",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.optim.OptimizationData",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.Field",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.optim.nonlinear.vector.Weight",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math3.analysis.function.Log",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.exception.TooManyIterationsException",
      "org.apache.commons.math3.analysis.function.Identity",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "org.apache.commons.math3.analysis.function.Log10",
      "org.apache.commons.math3.linear.AbstractRealMatrix$1",
      "org.apache.commons.math3.linear.AbstractRealMatrix$2",
      "org.apache.commons.math3.linear.AbstractRealMatrix$3",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction",
      "org.apache.commons.math3.analysis.function.Gaussian",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.linear.EigenDecomposition",
      "org.apache.commons.math3.linear.FieldVector",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.analysis.function.Multiply",
      "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.analysis.FunctionUtils$13",
      "org.apache.commons.math3.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math3.analysis.function.Cosh",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction",
      "org.apache.commons.math3.analysis.function.Abs",
      "org.apache.commons.math3.analysis.function.Ulp",
      "org.apache.commons.math3.analysis.function.Log1p",
      "org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.util.ExceptionContext"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.linear.OpenMapRealVector",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.EigenDecomposition",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.exception.MathArithmeticException"
    );
  }
}
