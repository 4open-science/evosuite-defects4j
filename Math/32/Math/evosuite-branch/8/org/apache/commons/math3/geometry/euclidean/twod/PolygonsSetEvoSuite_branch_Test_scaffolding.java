/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 18:52:36 GMT 2014
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class PolygonsSetEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/32/8/run_evosuite.pl_98264_1418323335"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/32/8/run_evosuite.pl_98264_1418323335/target/classes"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(PolygonsSetEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.geometry.Space",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.geometry.partitioning.Region$Location",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D",
      "org.apache.commons.math3.geometry.partitioning.BoundaryAttribute",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.math3.geometry.euclidean.twod.Line",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.geometry.partitioning.RegionFactory$UnionMerger",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion$Sides",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint",
      "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment",
      "org.apache.commons.math3.geometry.euclidean.threed.CardanEulerSingularityException",
      "org.apache.commons.math3.geometry.partitioning.Hyperplane",
      "org.apache.commons.math3.geometry.partitioning.RegionFactory",
      "org.apache.commons.math3.geometry.partitioning.BSPTree",
      "org.apache.commons.math3.geometry.euclidean.threed.Plane",
      "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet",
      "org.apache.commons.math3.geometry.euclidean.threed.SubPlane",
      "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor",
      "org.apache.commons.math3.geometry.euclidean.twod.SubLine",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat",
      "org.apache.commons.math3.geometry.partitioning.BSPTree$LeafMerger",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node",
      "org.apache.commons.math3.geometry.partitioning.RegionFactory$DifferenceMerger",
      "org.apache.commons.math3.geometry.partitioning.SubHyperplane",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$1",
      "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet$FacetsContributionVisitor",
      "org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint",
      "org.apache.commons.math3.geometry.partitioning.Characterization",
      "org.apache.commons.math3.geometry.partitioning.Region",
      "org.apache.commons.math3.geometry.Vector",
      "org.apache.commons.math3.geometry.euclidean.twod.Line$1",
      "org.apache.commons.math3.geometry.partitioning.Embedding",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion$3",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion$2",
      "org.apache.commons.math3.geometry.VectorFormat",
      "org.apache.commons.math3.geometry.euclidean.twod.Segment",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion$1",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.geometry.partitioning.BSPTree$1",
      "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder",
      "org.apache.commons.math3.geometry.euclidean.threed.SubLine",
      "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet",
      "org.apache.commons.math3.geometry.euclidean.threed.Rotation",
      "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane",
      "org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D$LazyHolder",
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor$Order",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D",
      "org.apache.commons.math3.geometry.partitioning.SubHyperplane$SplitSubHyperplane",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D$1",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.geometry.euclidean.threed.Line",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.geometry.partitioning.Transform",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D$1",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D$LazyHolder",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree",
      "org.apache.commons.math3.geometry.partitioning.RegionFactory$NodesCleaner",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D$LazyHolder",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion",
      "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat",
      "org.apache.commons.math3.geometry.euclidean.twod.Line$LineTransform",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.geometry.euclidean.threed.NotARotationMatrixException",
      "org.apache.commons.math3.geometry.euclidean.oned.Interval",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.geometry.partitioning.Side",
      "org.apache.commons.math3.exception.util.ExceptionContext"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(PolygonsSetEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.geometry.euclidean.twod.Vector2D",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.geometry.euclidean.oned.Vector1D",
      "org.apache.commons.math3.geometry.partitioning.Region$Location",
      "org.apache.commons.math3.geometry.euclidean.threed.Vector3D",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D",
      "org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D$LazyHolder",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.geometry.partitioning.Side",
      "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor$Order",
      "org.apache.commons.math3.geometry.partitioning.BSPTree$1",
      "org.apache.commons.math3.geometry.VectorFormat",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.geometry.partitioning.AbstractRegion$3",
      "org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew",
      "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$1",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D",
      "org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D$LazyHolder",
      "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder",
      "org.apache.commons.math3.geometry.euclidean.threed.Rotation",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.geometry.euclidean.threed.NotARotationMatrixException",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D",
      "org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D$LazyHolder"
    );
  }
}
