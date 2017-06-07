/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 21:44:55 GMT 2014
 */

package com.google.javascript.jscomp.parsing;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class JsDocInfoParserEvoSuite_branch_Test_scaffolding {

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
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/build/classes:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/lib/args4j.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/lib/guava.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/lib/json.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/lib/jsr305.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/lib/protobuf-java.jar:/scratch/ac1gf/Closure/32/5/run_evosuite.pl_4184_1418333647/build/lib/rhino.jar"); 
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
    org.evosuite.runtime.ClassStateSupport.initializeClasses(JsDocInfoParserEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.javascript.rhino.head.ast.CatchClause",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.head.PolicySecurityController$SecureCaller",
      "com.google.javascript.rhino.head.ast.EmptyExpression",
      "com.google.javascript.rhino.head.ClassShutter",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.NativeArray$1",
      "com.google.javascript.rhino.head.NativeArray$2",
      "com.google.javascript.rhino.head.NativeArray$3",
      "com.google.javascript.rhino.head.ast.ArrayComprehension",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption",
      "com.google.javascript.rhino.head.WrapFactory",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.head.ast.RegExpLiteral",
      "com.google.javascript.rhino.head.ast.FunctionNode$Form",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.rhino.head.TopLevel$Builtins",
      "com.google.javascript.rhino.head.ast.InfixExpression",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.Wrapper",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.rhino.head.ast.ObjectProperty",
      "com.google.javascript.rhino.head.Node$NodeIterator",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.head.ast.ExpressionStatement",
      "com.google.javascript.rhino.head.ast.ErrorNode",
      "com.google.javascript.rhino.head.CompilerEnvirons",
      "com.google.javascript.rhino.head.ast.Label",
      "com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues",
      "com.google.javascript.rhino.head.NativeJavaTopPackage",
      "com.google.javascript.rhino.head.ast.ParseProblem$Type",
      "com.google.javascript.rhino.head.regexp.RENode",
      "com.google.javascript.rhino.head.ast.XmlRef",
      "com.google.javascript.rhino.head.JavaMembers",
      "com.google.javascript.rhino.head.MemberBox",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.jscomp.parsing.JsDocTokenStream",
      "com.google.javascript.rhino.head.ast.Yield",
      "com.google.javascript.rhino.head.ast.Scope",
      "com.google.javascript.rhino.head.ast.AstRoot",
      "com.google.javascript.rhino.head.ast.AstNode$DebugPrintVisitor",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.rhino.head.IdFunctionObject",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.javascript.rhino.head.ast.Symbol",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.rhino.head.ast.DestructuringForm",
      "com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.javascript.rhino.head.JavaAdapter",
      "com.google.javascript.rhino.head.tools.shell.Runner",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.head.ast.GeneratorExpressionLoop",
      "com.google.common.base.Predicates$AssignableFromPredicate",
      "com.google.javascript.rhino.head.LazilyLoadedCtor$1",
      "com.google.javascript.rhino.head.ast.LabeledStatement",
      "com.google.javascript.rhino.head.ast.XmlExpression",
      "com.google.javascript.rhino.head.NativeJavaObject",
      "com.google.javascript.rhino.head.ast.XmlString",
      "com.google.javascript.rhino.head.ast.ParseProblem",
      "com.google.common.collect.Maps",
      "com.google.javascript.rhino.head.Token",
      "com.google.javascript.rhino.head.InterpretedFunction",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.rhino.head.ast.LetNode",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.javascript.rhino.head.TokenStream",
      "com.google.javascript.rhino.head.ast.ConditionalExpression",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.common.base.CharMatcher$11",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$14",
      "com.google.javascript.rhino.head.ast.XmlMemberGet",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.rhino.head.ast.UnaryExpression",
      "com.google.common.base.Joiner$1",
      "com.google.javascript.rhino.head.Delegator",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.rhino.head.regexp.REBackTrackData",
      "com.google.javascript.rhino.head.ast.ElementGet",
      "com.google.javascript.rhino.head.NativeFunction",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.javascript.rhino.head.NativeGenerator",
      "com.google.javascript.rhino.head.ast.ForLoop",
      "com.google.javascript.rhino.head.ConstProperties",
      "com.google.javascript.rhino.head.Node",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.head.ast.Comment",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.head.ContinuationPending",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.head.tools.ToolErrorReporter",
      "com.google.javascript.rhino.head.NativeObject",
      "com.google.javascript.rhino.head.BeanProperty",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$State",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.javascript.rhino.head.GeneratedClassLoader",
      "com.google.javascript.rhino.head.ast.WhileLoop",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtendedTypeInfo",
      "com.google.javascript.rhino.head.Node$PropListItem",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.javascript.rhino.head.NativeDate",
      "com.google.javascript.rhino.head.FieldAndMethods",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.rhino.head.NativeIterator$StopIteration",
      "com.google.javascript.rhino.head.Arguments",
      "com.google.javascript.rhino.head.NativeJSON",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.javascript.rhino.head.ScriptStackElement",
      "com.google.javascript.rhino.head.ClassCache",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.head.ast.ArrayComprehensionLoop",
      "com.google.javascript.rhino.head.ScriptRuntime$1",
      "com.google.javascript.rhino.head.BoundFunction",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.common.base.CharMatcher$Or",
      "com.google.javascript.rhino.head.ast.IdeErrorReporter",
      "com.google.javascript.rhino.head.WrappedException",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.common.collect.Lists$Partition",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "org.mozilla.classfile.ClassFileWriter",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.base.Function",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.head.RegExpProxy",
      "com.google.javascript.rhino.head.Parser",
      "com.google.javascript.rhino.head.Function",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.javascript.rhino.head.ContextFactory$Listener",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.head.ast.XmlPropRef",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.head.ContextListener",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.common.collect.MapDifference",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.head.NativeJavaArray",
      "com.google.javascript.rhino.head.NativeJavaConstructor",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.head.ast.XmlDotQuery",
      "com.google.javascript.rhino.head.NativeIterator",
      "com.google.javascript.rhino.head.NativeMath",
      "com.google.javascript.rhino.head.RefCallable",
      "com.google.javascript.rhino.head.ast.IfStatement",
      "com.google.javascript.rhino.head.ast.ObjectLiteral",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.head.ResolvedOverload",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.rhino.head.ast.Name",
      "com.google.javascript.rhino.head.ast.NodeVisitor",
      "com.google.javascript.rhino.head.ObjToIntMap$Iterator",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.rhino.head.Parser$ParserException",
      "com.google.javascript.rhino.head.debug.DebuggableScript",
      "com.google.common.collect.Iterators$1",
      "com.google.javascript.rhino.head.Token$CommentType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.head.debug.Debugger",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$2",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.Iterators$6",
      "com.google.javascript.rhino.head.IdScriptableObject",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.javascript.rhino.head.NativeJavaClass",
      "com.google.javascript.rhino.head.xml.XMLObject",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.javascript.rhino.head.debug.DebugFrame",
      "com.google.javascript.rhino.head.ContextFactory$GlobalSetter",
      "com.google.common.base.Predicates$1",
      "com.google.javascript.rhino.head.ContextAction",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.rhino.head.SecurityUtilities$1",
      "com.google.javascript.rhino.head.NativeWith",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.head.ast.StringLiteral",
      "com.google.javascript.rhino.head.ast.BreakStatement",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.common.collect.ImmutableAsList",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.javascript.rhino.head.Callable",
      "com.google.javascript.rhino.head.Undefined",
      "com.google.javascript.rhino.head.ast.SwitchStatement",
      "com.google.javascript.rhino.head.NativeJavaPackage",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.head.ast.GeneratorExpression",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.JSDocInfoBuilder",
      "com.google.javascript.rhino.head.NativeIterator$WrappedJavaIterator",
      "com.google.javascript.rhino.head.ast.PropertyGet",
      "com.google.javascript.rhino.head.ContextFactory$1GlobalSetterImpl",
      "com.google.javascript.rhino.head.regexp.RECompiled",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.head.ast.KeywordLiteral",
      "com.google.javascript.rhino.head.regexp.REGlobalData",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$1",
      "com.google.javascript.rhino.head.ast.ThrowStatement",
      "com.google.javascript.rhino.head.ast.ErrorCollector",
      "com.google.javascript.rhino.head.Synchronizer",
      "com.google.javascript.rhino.head.LazilyLoadedCtor",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.ast.ContinueStatement",
      "com.google.javascript.rhino.head.ast.ParenthesizedExpression",
      "com.google.javascript.rhino.head.ast.WithStatement",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "com.google.javascript.rhino.head.Context$ClassShutterSetter",
      "com.google.javascript.rhino.head.ast.ScriptNode",
      "com.google.javascript.rhino.head.ast.XmlFragment",
      "com.google.javascript.rhino.head.ScriptRuntime$MessageProvider",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.javascript.rhino.head.ast.NumberLiteral",
      "com.google.javascript.rhino.head.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.head.ast.XmlElemRef",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter",
      "com.google.javascript.rhino.head.xml.XMLLib",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.javascript.rhino.head.ScriptableObject$RelinkedSlot",
      "com.google.javascript.rhino.head.PolicySecurityController",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.NativeError",
      "com.google.javascript.rhino.head.ast.FunctionCall",
      "com.google.javascript.rhino.head.NativeScript",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.base.Predicates",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.NativeJavaMethod",
      "com.google.javascript.rhino.head.regexp.NativeRegExp",
      "com.google.javascript.rhino.head.jdk13.VMBridge_jdk13",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.head.ast.ReturnStatement",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.collect.Sets$SetView",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.rhino.head.ast.ForInLoop",
      "com.google.javascript.rhino.head.regexp.RECharSet",
      "com.google.javascript.rhino.head.regexp.REProgState",
      "com.google.javascript.rhino.head.Evaluator",
      "com.google.common.collect.BiMap",
      "com.google.javascript.rhino.head.ast.Block",
      "com.google.javascript.rhino.head.ast.NewExpression",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser",
      "com.google.common.collect.Hashing",
      "com.google.javascript.jscomp.parsing.NullErrorReporter",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.ast.TryStatement",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.head.json.JsonParser$ParseException",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.head.debug.DebuggableObject",
      "com.google.javascript.rhino.head.ast.VariableInitializer",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$ExtractionInfo",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Iterators$14",
      "com.google.javascript.rhino.head.ScriptRuntime$NoSuchMethodShim",
      "com.google.javascript.rhino.head.Script",
      "com.google.javascript.rhino.head.ScriptRuntime$IdEnumeration",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.javascript.rhino.head.ast.DoLoop",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.collect.Collections2",
      "com.google.common.base.CharMatcher$7",
      "com.google.common.base.CharMatcher$6",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.javascript.jscomp.parsing.JsDocToken",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.head.regexp.CompilerState",
      "com.google.common.collect.ImmutableMap",
      "com.google.javascript.rhino.head.JavaScriptException",
      "com.google.javascript.rhino.head.regexp.SubString",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "com.google.javascript.rhino.head.regexp.RegExpImpl",
      "com.google.javascript.rhino.head.regexp.NativeRegExpCtor",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.head.UniqueTag",
      "com.google.javascript.rhino.head.SecurityUtilities",
      "com.google.javascript.rhino.head.ErrorReporter",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.IR",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory$1",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.javascript.rhino.head.ast.ArrayLiteral",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.head.ast.SwitchCase",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.javascript.rhino.head.ObjArray",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.head.ast.VariableDeclaration",
      "com.google.javascript.rhino.head.Context$1",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.rhino.head.Context$2",
      "com.google.javascript.rhino.head.ast.Jump",
      "com.google.javascript.rhino.head.ast.EmptyStatement",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.head.NativeGlobal",
      "com.google.javascript.rhino.head.NativeGenerator$GeneratorClosedException",
      "com.google.javascript.rhino.head.ast.FunctionNode",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.head.ast.Assignment",
      "com.google.javascript.rhino.head.ast.Loop",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.head.IdFunctionCall",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.head.ast.XmlLiteral",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.Predicates$NotPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(JsDocInfoParserEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.javascript.jscomp.parsing.Config$LanguageMode",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$State",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption",
      "com.google.javascript.jscomp.parsing.JsDocToken",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser$1",
      "com.google.javascript.rhino.head.Token$CommentType",
      "com.google.javascript.jscomp.parsing.JsDocTokenStream",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.head.tools.ToolErrorReporter",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.head.ast.ArrayLiteral",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.ScriptRuntime",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.javascript.rhino.head.ast.TryStatement",
      "com.google.javascript.rhino.head.ast.SwitchStatement",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.head.ast.FunctionCall",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.head.NativeObject",
      "com.google.javascript.rhino.head.ClassCache",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.javascript.rhino.head.TopLevel$Builtins",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.javascript.rhino.head.UniqueTag",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues",
      "com.google.javascript.rhino.head.IdFunctionObject",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "com.google.javascript.rhino.head.NativeError",
      "com.google.javascript.rhino.head.NativeGlobal",
      "com.google.javascript.rhino.head.Undefined",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.javascript.rhino.head.NativeDate",
      "com.google.javascript.rhino.head.NativeMath",
      "com.google.javascript.rhino.head.NativeJSON",
      "com.google.javascript.rhino.head.NativeWith",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.rhino.head.NativeScript",
      "com.google.javascript.rhino.head.NativeIterator",
      "com.google.javascript.rhino.head.NativeGenerator",
      "com.google.javascript.rhino.head.NativeIterator$StopIteration",
      "com.google.javascript.rhino.head.LazilyLoadedCtor",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.head.ast.ObjectLiteral",
      "com.google.javascript.rhino.head.ast.ParseProblem$Type",
      "com.google.javascript.rhino.head.ast.AstNode$DebugPrintVisitor",
      "com.google.javascript.rhino.head.Token",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.javascript.rhino.head.Parser",
      "com.google.javascript.rhino.head.TokenStream",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.head.ast.FunctionNode",
      "com.google.javascript.rhino.head.ast.FunctionNode$Form",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.head.ObjArray",
      "com.google.javascript.rhino.head.regexp.NativeRegExp",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.javascript.rhino.head.regexp.RECompiled",
      "com.google.javascript.rhino.head.regexp.NativeRegExpCtor",
      "com.google.javascript.rhino.head.JavaAdapter",
      "com.google.javascript.rhino.head.NativeJavaObject",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.head.NativeJavaArray"
    );
  }
}
