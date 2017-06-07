/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 21:54:45 GMT 2014
 */

package com.google.javascript.rhino.jstype;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class PrototypeObjectTypeEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/build/classes:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/lib/args4j.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/lib/guava.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/lib/json.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/lib/jsr305.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/lib/protobuf-java.jar:/scratch/ac1gf/Closure/35/1/run_evosuite.pl_53718_1418333610/build/lib/rhino.jar"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(PrototypeObjectTypeEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators$6",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.Lists",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.ListMultimap",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.Predicates$1",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterables$2",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.common.collect.SingletonImmutableList$1",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor",
      "com.google.common.collect.AbstractMultimap$4",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.common.collect.AbstractMultimap$2",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.common.collect.Multiset",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.common.collect.ForwardingSet",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.ForwardingCollection",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.common.collect.AbstractMultimap$EntryIterator",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.Multimap",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.common.collect.Maps$KeySet",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.collect.Maps",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.Iterables$IterableWithToString",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.AbstractMultimap$WrappedSet",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.common.collect.LinkedHashMultimap$SetDecorator",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterables",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.jstype.NamedType$PropertyContinuation",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Iterators$14",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.base.CharMatcher$Or",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.base.Function",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$5",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.collect.Collections2",
      "com.google.common.base.CharMatcher$7",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.Sets",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.Multimaps$Values",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.Multimaps$Values$1",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.collect.Maps$EntryTransformer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(PrototypeObjectTypeEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.primitives.Ints",
      "com.google.javascript.rhino.Token",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"
    );
  }
}
