/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 21:31:30 GMT 2014
 */

package com.google.debugging.sourcemap;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class SourceMapConsumerV3EvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/build/classes:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/lib/args4j.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/lib/guava.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/lib/json.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/lib/jsr305.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/lib/protobuf-java.jar:/scratch/ac1gf/Closure/47/1/run_evosuite.pl_79910_1418332233/build/lib/rhino.jar"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(SourceMapConsumerV3EvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.protobuf.Descriptors$ServiceDescriptor",
      "com.google.protobuf.UnknownFieldSet$1",
      "com.google.protobuf.GeneratedMessage$Builder$BuilderParentImpl",
      "com.google.protobuf.GeneratedMessageLite$GeneratedExtension",
      "com.google.protobuf.AbstractMessage$1",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.common.collect.Lists",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$StringCharIterator",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.protobuf.GeneratedMessage$BuilderParent",
      "com.google.protobuf.Descriptors$EnumDescriptor",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping$Builder",
      "com.google.protobuf.GeneratedMessage$1",
      "com.google.protobuf.GeneratedMessage$2",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularMessageFieldAccessor",
      "com.google.protobuf.DescriptorProtos$EnumOptions$Builder",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "com.google.protobuf.LazyStringArrayList",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type",
      "com.google.protobuf.GeneratedMessage$ExtendableMessage$ExtensionWriter",
      "com.google.protobuf.DescriptorProtos$DescriptorProto",
      "com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder",
      "com.google.debugging.sourcemap.proto.Mapping$LineMapping$Builder",
      "com.google.protobuf.GeneratedMessageLite$SerializedForm",
      "com.google.protobuf.SmallSortedMap$1",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSet$Builder",
      "com.google.protobuf.DescriptorProtos$MethodOptions",
      "com.google.protobuf.DescriptorProtos$ServiceDescriptorProto",
      "com.google.protobuf.Descriptors$DescriptorPool",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularEnumFieldAccessor",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSet",
      "com.google.protobuf.GeneratedMessage$ExtensionDescriptorRetriever",
      "org.json.JSONTokener",
      "com.google.protobuf.Descriptors$FieldDescriptor$JavaType",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder",
      "com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart",
      "com.google.protobuf.TextFormat$1",
      "com.google.protobuf.ExtensionRegistry$1",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Builder",
      "com.google.protobuf.AbstractMessage$Builder",
      "com.google.protobuf.GeneratedMessageLite$Builder",
      "com.google.protobuf.Descriptors$FileDescriptor$InternalDescriptorAssigner",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$MappingBuilder",
      "com.google.protobuf.DynamicMessage$1",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$1",
      "com.google.protobuf.LazyStringList",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$1",
      "com.google.debugging.sourcemap.Base64VLQ$CharIterator",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$RepeatedMessageFieldAccessor",
      "com.google.protobuf.ByteString$1",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor",
      "com.google.protobuf.WireFormat$JavaType",
      "com.google.protobuf.WireFormat",
      "com.google.protobuf.Descriptors$FieldDescriptor",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$Builder",
      "com.google.protobuf.Descriptors$FieldDescriptor$Type",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.protobuf.DescriptorProtos$MessageOptions",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingVisitor",
      "com.google.protobuf.UnknownFieldSet$Field",
      "com.google.protobuf.WireFormat$FieldType",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder",
      "com.google.debugging.sourcemap.proto.Mapping$LineMappingOrBuilder",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$FieldAccessor",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$Builder",
      "com.google.protobuf.DescriptorProtos$MessageOptions$Builder",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder",
      "com.google.protobuf.Internal$EnumLiteMap",
      "com.google.protobuf.ExtensionRegistry",
      "com.google.protobuf.SmallSortedMap",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry",
      "com.google.protobuf.GeneratedMessage$ExtendableMessage",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularFieldAccessor",
      "com.google.protobuf.GeneratedMessageLite$ExtendableMessage",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry",
      "com.google.protobuf.DescriptorProtos$MethodOptions$Builder",
      "com.google.protobuf.Descriptors",
      "com.google.protobuf.ByteString$CodedBuilder",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$1",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.protobuf.Descriptors$DescriptorValidationException",
      "com.google.protobuf.DescriptorProtos$FieldOptions",
      "com.google.protobuf.RepeatedFieldBuilder",
      "com.google.protobuf.DescriptorProtos$ServiceOptions$Builder",
      "com.google.protobuf.DynamicMessage$Builder",
      "com.google.protobuf.AbstractMessageLite",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$DefaultSourceMapSupplier",
      "com.google.protobuf.Descriptors$DescriptorPool$PackageDescriptor",
      "com.google.protobuf.SmallSortedMap$Entry",
      "com.google.debugging.sourcemap.proto.Mapping$1",
      "com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder",
      "com.google.protobuf.Descriptors$EnumValueDescriptor",
      "com.google.protobuf.ExtensionRegistry$DescriptorIntPair",
      "com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder",
      "com.google.debugging.sourcemap.SourceMapSupplier",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMappingOrBuilder",
      "com.google.common.collect.Maps",
      "com.google.protobuf.TextFormat$TextGenerator",
      "org.json.JSONObject$Null",
      "com.google.protobuf.MessageLiteOrBuilder",
      "com.google.protobuf.GeneratedMessageLite",
      "com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream",
      "com.google.protobuf.Descriptors$DescriptorPool$DescriptorIntPair",
      "com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder",
      "com.google.protobuf.TextFormat$Printer",
      "com.google.protobuf.CodedOutputStream$OutOfSpaceException",
      "com.google.protobuf.Descriptors$1",
      "com.google.protobuf.UnknownFieldSet$Builder",
      "com.google.protobuf.GeneratedMessageLite$ExtendableBuilder",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder",
      "com.google.common.base.Joiner$2",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto",
      "com.google.common.base.Joiner$1",
      "com.google.protobuf.Internal",
      "com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor",
      "com.google.protobuf.ByteString$Output",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.DescriptorProtos$FileOptions$Builder",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType$1",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto",
      "com.google.protobuf.ByteString",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange",
      "com.google.debugging.sourcemap.proto.Mapping",
      "com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder",
      "com.google.protobuf.DescriptorProtos$1",
      "com.google.protobuf.ExtensionRegistryLite$ObjectIntPair",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.protobuf.TextFormat$ParseException",
      "com.google.debugging.sourcemap.SourceMapping",
      "com.google.protobuf.CodedOutputStream",
      "com.google.protobuf.MessageOrBuilder",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.common.collect.BiMap",
      "com.google.protobuf.Message",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder",
      "com.google.protobuf.GeneratedMessageLite$1",
      "com.google.protobuf.DescriptorProtos$EnumValueOptions",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto",
      "com.google.protobuf.DescriptorProtos$MethodDescriptorProto$Builder",
      "com.google.protobuf.Descriptors$Descriptor",
      "com.google.protobuf.FieldSet$FieldDescriptorLite",
      "com.google.protobuf.DescriptorProtos$MethodDescriptorProto",
      "com.google.protobuf.InvalidProtocolBufferException",
      "com.google.protobuf.TextFormat$InvalidEscapeSequenceException",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$RepeatedEnumFieldAccessor",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$1",
      "com.google.debugging.sourcemap.SourceMapConsumer",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.protobuf.CodedInputStream",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableCollection",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor",
      "com.google.debugging.sourcemap.SourceMapGenerator",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.protobuf.SingleFieldBuilder",
      "org.json.JSONException",
      "com.google.protobuf.GeneratedMessage$GeneratedExtension",
      "com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder",
      "com.google.debugging.sourcemap.SourceMappingReversable",
      "com.google.protobuf.AbstractMessageLite$Builder",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.protobuf.WireFormat$1",
      "com.google.protobuf.UninitializedMessageException",
      "com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder",
      "com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.base.Function",
      "com.google.protobuf.RepeatedFieldBuilder$BuilderExternalList",
      "com.google.protobuf.DescriptorProtos$EnumOptions",
      "com.google.protobuf.DescriptorProtos$EnumValueOptions$Builder",
      "com.google.common.collect.Collections2",
      "com.google.protobuf.Internal$EnumLite",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.SmallSortedMap$EmptySet$2",
      "com.google.protobuf.FieldSet$1",
      "com.google.protobuf.SmallSortedMap$EmptySet$1",
      "com.google.protobuf.TextFormat",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$Builder",
      "com.google.protobuf.ProtocolMessageEnum",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder",
      "com.google.common.base.Joiner",
      "com.google.protobuf.GeneratedMessage$GeneratedExtension$1",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$RepeatedFieldAccessor",
      "com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption",
      "com.google.protobuf.SmallSortedMap$EntrySet",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.base.Preconditions",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto",
      "org.json.JSONArray",
      "com.google.common.collect.MapDifference",
      "com.google.protobuf.FieldSet",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$Entry",
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.protobuf.DescriptorProtos$FileOptions",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder",
      "com.google.protobuf.MessageLite$Builder",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$Builder",
      "com.google.protobuf.DynamicMessage",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry",
      "com.google.protobuf.GeneratedMessage$ExtendableMessageOrBuilder",
      "com.google.protobuf.Descriptors$FileDescriptor",
      "com.google.protobuf.UnmodifiableLazyStringList",
      "com.google.protobuf.Message$Builder",
      "com.google.protobuf.SmallSortedMap$EntryIterator",
      "com.google.common.collect.Lists$1",
      "com.google.protobuf.DescriptorProtos$FieldOptions$Builder",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable",
      "com.google.protobuf.GeneratedMessage$ExtendableBuilder",
      "com.google.common.collect.Lists$2",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder",
      "com.google.protobuf.ExtensionRegistry$ExtensionInfo",
      "com.google.protobuf.AbstractMessage",
      "com.google.protobuf.Descriptors$GenericDescriptor",
      "com.google.protobuf.DescriptorProtos",
      "com.google.protobuf.SmallSortedMap$EmptySet",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto$Builder",
      "com.google.debugging.sourcemap.proto.Mapping$LineMapping",
      "com.google.protobuf.WireFormat$FieldType$4",
      "com.google.protobuf.WireFormat$FieldType$3",
      "com.google.protobuf.Descriptors$MethodDescriptor",
      "com.google.protobuf.WireFormat$FieldType$2",
      "com.google.protobuf.WireFormat$FieldType$1",
      "com.google.protobuf.UnmodifiableLazyStringList$2",
      "org.json.JSONObject",
      "com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$Builder",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.protobuf.DescriptorProtos$ServiceOptions",
      "com.google.protobuf.MessageLite",
      "com.google.protobuf.GeneratedMessage$Builder",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.protobuf.UnknownFieldSet$Field$Builder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(SourceMapConsumerV3EvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.debugging.sourcemap.SourceMapConsumerV3$MappingBuilder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.protobuf.ByteString",
      "com.google.protobuf.Descriptors$FieldDescriptor$JavaType",
      "com.google.protobuf.WireFormat$JavaType",
      "com.google.protobuf.WireFormat$FieldType",
      "com.google.protobuf.Descriptors$FieldDescriptor$Type",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping",
      "com.google.protobuf.DescriptorProtos$FileDescriptorSet",
      "com.google.protobuf.CodedInputStream",
      "com.google.protobuf.WireFormat",
      "com.google.protobuf.InvalidProtocolBufferException",
      "com.google.protobuf.LazyStringArrayList",
      "com.google.protobuf.SmallSortedMap$EmptySet",
      "com.google.protobuf.FieldSet",
      "com.google.protobuf.DescriptorProtos$FileOptions",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto",
      "com.google.debugging.sourcemap.proto.Mapping$LineMapping",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.ExtensionRegistry",
      "com.google.protobuf.DescriptorProtos$EnumOptions",
      "com.google.protobuf.DescriptorProtos$MethodOptions",
      "com.google.protobuf.DescriptorProtos$MethodDescriptorProto",
      "com.google.protobuf.DescriptorProtos$MessageOptions",
      "com.google.protobuf.DescriptorProtos$DescriptorProto",
      "com.google.protobuf.DescriptorProtos$FieldOptions",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumValueOptions",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange",
      "com.google.protobuf.Descriptors$DescriptorPool",
      "com.google.protobuf.Descriptors$FieldDescriptor",
      "com.google.protobuf.Descriptors$1",
      "com.google.protobuf.DescriptorProtos",
      "com.google.protobuf.UnknownFieldSet$Field",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption",
      "com.google.debugging.sourcemap.proto.Mapping",
      "com.google.protobuf.TextFormat",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart",
      "com.google.protobuf.DescriptorProtos$ServiceOptions",
      "com.google.protobuf.CodedOutputStream",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location",
      "com.google.protobuf.UninitializedMessageException",
      "com.google.protobuf.DescriptorProtos$ServiceDescriptorProto",
      "org.json.JSONObject",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.protobuf.FieldSet$1",
      "com.google.protobuf.CodedOutputStream$OutOfSpaceException",
      "com.google.protobuf.TextFormat$1"
    );
  }
}
