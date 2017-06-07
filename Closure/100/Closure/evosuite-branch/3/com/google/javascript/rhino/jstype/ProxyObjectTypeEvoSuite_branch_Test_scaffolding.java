/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Dec 12 07:23:39 GMT 2014
 */

package com.google.javascript.rhino.jstype;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class ProxyObjectTypeEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/build/classes:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/ant_deploy.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/args4j_deploy.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/google_common_deploy.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/hamcrest-core-1.1.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/junit.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/libtrunk_rhino_parser_jarjared.jar:/scratch/ac1gf/Closure/100/3/run_evosuite.pl_51066_1418362000/lib/protobuf_deploy.jar"); 
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
    java.lang.System.setProperty("user.timezone", "Europe/Belfast"); 
              }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(ProxyObjectTypeEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.common.collect.Iterators$5",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.common.collect.Iterators$3",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.common.collect.Iterators$2",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Iterators$8",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.Lists",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.ListMultimap",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.collect.Iterables$10",
      "com.google.common.collect.Iterables$4",
      "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterables",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.Node$1",
      "com.google.common.collect.Lists$ImmutableListWithNullElementsException",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.common.collect.HashMultimap",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.Token",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.collect.AbstractMultimap",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.Predicate",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.Iterators$15",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Lists$Partition",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.collect.AbstractMultimap$ValueIterator",
      "com.google.common.collect.SetMultimap",
      "com.google.common.base.Function",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.common.collect.AbstractMultimap$EntryIterator",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.Multimap",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.AbstractMultimap$Values",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType$Property",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.collect.Iterables$IterableWithToString",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.rhino.testing.EmptyScope",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.AbstractMultimap$WrappedSet",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.javascript.rhino.ScriptOrFnNode",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.collect.Lists$RandomAccessPartition"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(ProxyObjectTypeEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.HashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor",
      "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.rhino.jstype.PrototypeObjectType$Property",
      "com.google.javascript.rhino.JSDocInfo$Visibility"
    );
  }
}
