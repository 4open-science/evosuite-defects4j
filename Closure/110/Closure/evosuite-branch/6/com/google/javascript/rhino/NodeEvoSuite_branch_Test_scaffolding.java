/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 21:45:58 GMT 2014
 */

package com.google.javascript.rhino;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class NodeEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/build/classes:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/lib/args4j.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/lib/guava.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/lib/json.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/lib/jsr305.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/lib/protobuf-java.jar:/scratch/ac1gf/Closure/110/6/run_evosuite.pl_70358_1418333633/build/lib/rhino.jar"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(NodeEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators$1",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.Lists",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Predicates$1",
      "com.google.javascript.rhino.jstype.ModificationVisitor",
      "com.google.javascript.rhino.Node$AncestorIterable$1",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.Maps$1",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.jstype.FunctionType$PropAccess",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.jstype.Property",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.EquivalenceMethod",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.AbstractMultimap$Values",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.base.CharMatcher$NegatedMatcher",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.TemplateTypeMap$EquivalenceMatch",
      "com.google.common.collect.LinkedHashMultimap$ValueSetLink",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Maps",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$12",
      "com.google.javascript.rhino.jstype.TemplatizedType",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.AbstractMapBasedMultimap$Itr",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.Sets$SetView",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterables",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.Token",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.CanCastToVisitor",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.collect.AbstractMultimap",
      "com.google.javascript.rhino.jstype.RelationshipVisitor",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.NamespaceType",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.Lists$Partition",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.AbstractMapBasedMultimap$AsMap",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.CharMatcher$5",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.base.SmallCharMatcher",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.collect.Collections2",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.common.collect.ImmutableMap",
      "com.google.javascript.rhino.jstype.PropertyMap",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.PropertyMap$1",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.jstype.TemplateTypeMap",
      "com.google.common.base.CharMatcher",
      "com.google.javascript.rhino.jstype.TemplateTypeMapReplacer",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.common.collect.AbstractMapBasedMultimap$KeySet",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.common.collect.ImmutableList$SerializedForm",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.Maps$ImprovedAbstractMap",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet",
      "com.google.common.collect.AbstractMapBasedMultimap$2",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.AbstractMapBasedMultimap$1",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.collect.Maps$EntryTransformer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(NodeEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.javascript.rhino.jstype.PropertyMap",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.FunctionType$PropAccess",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.Property",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.EquivalenceMethod",
      "com.google.javascript.rhino.jstype.TemplateTypeMap$EquivalenceMatch",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.javascript.rhino.jstype.TemplatizedType",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet"
    );
  }
}
