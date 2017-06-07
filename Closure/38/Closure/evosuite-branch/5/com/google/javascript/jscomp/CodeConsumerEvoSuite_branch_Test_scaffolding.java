/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 21:44:15 GMT 2014
 */

package com.google.javascript.jscomp;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class CodeConsumerEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/build/classes:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/lib/args4j.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/lib/guava.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/lib/json.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/lib/jsr305.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/lib/protobuf-java.jar:/scratch/ac1gf/Closure/38/5/run_evosuite.pl_3265_1418333625/build/lib/rhino.jar"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(CodeConsumerEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.base.Predicates$1",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.jscomp.CodeConsumer",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.common.base.CharMatcher$Or",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.base.CharMatcher$11",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$14",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.base.Predicates$NotPredicate"
    );
  } 

  private static void resetClasses() {
  }
}
