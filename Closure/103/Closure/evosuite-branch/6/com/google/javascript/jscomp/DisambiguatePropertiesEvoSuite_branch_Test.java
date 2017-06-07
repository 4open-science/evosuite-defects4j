/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:20:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DefinitionsRemover;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.ArrayList;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DisambiguatePropertiesEvoSuite_branch_Test extends DisambiguatePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertNotNull(tightenTypes0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      String string0 = "Stuck in loop e/p8nding ypes to skip.";
      ArrayList<ConcreteType> arrayList0 = new ArrayList<ConcreteType>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      ConcreteType concreteType0 = ConcreteType.createForTypes(arrayList0);
      assertNotNull(concreteType0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertNotNull(concreteType_ConcreteUniqueType0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      ConcreteType[] concreteTypeArray0 = new ConcreteType[5];
      concreteTypeArray0[0] = concreteType0;
      assertNotNull(concreteTypeArray0[0]);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      concreteTypeArray0[1] = concreteType0;
      assertNotNull(concreteTypeArray0[1]);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      concreteTypeArray0[2] = (ConcreteType) concreteType_ConcreteUniqueType0;
      assertNotNull(concreteTypeArray0[2]);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      concreteTypeArray0[3] = (ConcreteType) concreteType_ConcreteUniqueType0;
      assertNotNull(concreteTypeArray0[3]);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      concreteTypeArray0[4] = concreteType0;
      assertNotNull(concreteTypeArray0[4]);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      ConcreteType.ConcreteUnionType concreteType_ConcreteUnionType0 = new ConcreteType.ConcreteUnionType(concreteTypeArray0);
      assertNotNull(concreteType_ConcreteUnionType0);
      
      ConcreteType.ConcreteUnionType concreteType_ConcreteUnionType1 = (ConcreteType.ConcreteUnionType)concreteType_ConcreteUnionType0.unionWith(concreteType_ConcreteUniqueType0);
      assertNotNull(concreteType_ConcreteUnionType1);
      assertSame(concreteType_ConcreteUnionType1, concreteType_ConcreteUnionType0);
      assertSame(concreteType_ConcreteUnionType0, concreteType_ConcreteUnionType1);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType1 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType_ConcreteUnionType1);
      assertNotNull(concreteType_ConcreteUniqueType1);
      assertFalse(concreteType_ConcreteUniqueType0.equals((Object)concreteType_ConcreteUniqueType1));
      assertFalse(concreteType_ConcreteUniqueType1.equals((Object)concreteType_ConcreteUniqueType0));
      assertNotSame(concreteType_ConcreteUniqueType0, concreteType_ConcreteUniqueType1);
      assertNotSame(concreteType_ConcreteUniqueType1, concreteType_ConcreteUniqueType0);
      assertSame(concreteType_ConcreteUnionType1, concreteType_ConcreteUnionType0);
      assertSame(concreteType_ConcreteUnionType0, concreteType_ConcreteUnionType1);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      String string0 = "m)m2o&%";
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      int int0 = 6;
      ErrorReporter errorReporter0 = null;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      NamedType namedType0 = new NamedType(jSTypeRegistry0, string0, string0, int0, int0);
      assertNotNull(namedType0);
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(true, namedType0.isNamedType());
      assertEquals("m)m2o&%", namedType0.toString());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals("m)m2o&%", namedType0.getReferenceName());
      
      NamedType namedType1 = (NamedType)disambiguateProperties0.getTypeWithProperty(string0, namedType0);
      assertNotNull(namedType1);
      assertSame(namedType1, namedType0);
      assertSame(namedType0, namedType1);
      assertEquals(false, namedType1.isUnionType());
      assertEquals(false, namedType1.isFunctionType());
      assertEquals(false, namedType1.isNumberValueType());
      assertEquals(false, namedType1.isBooleanValueType());
      assertEquals(false, namedType1.isNativeObjectType());
      assertEquals("m)m2o&%", namedType1.toString());
      assertEquals(false, namedType1.isNoObjectType());
      assertEquals(false, namedType1.isTemplateType());
      assertEquals("m)m2o&%", namedType1.getReferenceName());
      assertEquals(true, namedType1.isNominalType());
      assertEquals(false, namedType1.isEmptyType());
      assertEquals(false, namedType1.isRecordType());
      assertEquals(false, namedType1.isNoType());
      assertEquals(false, namedType1.isAllType());
      assertEquals(false, namedType1.isResolved());
      assertEquals(false, namedType1.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType1.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType1.hasCachedValues());
      assertEquals(true, namedType1.isNamedType());
      assertEquals(false, namedType1.isVoidType());
      assertEquals(true, namedType1.hasReferenceName());
      assertEquals(false, namedType1.isNullType());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(true, namedType0.isNamedType());
      assertEquals("m)m2o&%", namedType0.toString());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals("m)m2o&%", namedType0.getReferenceName());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      String string0 = "]+e(";
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      ErrorReporter errorReporter0 = null;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      assertNotNull(objectType0);
      assertEquals(false, objectType0.isResolved());
      assertEquals(BooleanLiteralSet.TRUE, objectType0.getPossibleToBooleanOutcomes());
      assertEquals(false, objectType0.isStringValueType());
      assertEquals(false, objectType0.isNoType());
      assertEquals(false, objectType0.isRecordType());
      assertEquals(false, objectType0.hasReferenceName());
      assertEquals(false, objectType0.isVoidType());
      assertEquals(false, objectType0.isNoObjectType());
      assertEquals(false, objectType0.isUnionType());
      assertEquals(false, objectType0.hasCachedValues());
      assertEquals(false, objectType0.isNamedType());
      assertEquals(false, objectType0.isNativeObjectType());
      assertEquals(false, objectType0.isEmptyType());
      assertEquals(false, objectType0.isBooleanValueType());
      assertEquals(false, objectType0.isAllType());
      assertEquals(false, objectType0.isTemplateType());
      assertEquals(false, objectType0.isNullType());
      assertEquals(false, objectType0.isFunctionType());
      assertEquals(false, objectType0.isNumberValueType());
      
      JSType jSType0 = disambiguateProperties0.getTypeWithProperty(string0, objectType0);
      assertNull(jSType0);
      assertEquals(false, objectType0.isResolved());
      assertEquals(BooleanLiteralSet.TRUE, objectType0.getPossibleToBooleanOutcomes());
      assertEquals(false, objectType0.isStringValueType());
      assertEquals(false, objectType0.isNoType());
      assertEquals(false, objectType0.isRecordType());
      assertEquals(false, objectType0.hasReferenceName());
      assertEquals(false, objectType0.isVoidType());
      assertEquals(false, objectType0.isNoObjectType());
      assertEquals(false, objectType0.isUnionType());
      assertEquals(false, objectType0.hasCachedValues());
      assertEquals(false, objectType0.isNamedType());
      assertEquals(false, objectType0.isNativeObjectType());
      assertEquals(false, objectType0.isEmptyType());
      assertEquals(false, objectType0.isBooleanValueType());
      assertEquals(false, objectType0.isAllType());
      assertEquals(false, objectType0.isTemplateType());
      assertEquals(false, objectType0.isNullType());
      assertEquals(false, objectType0.isFunctionType());
      assertEquals(false, objectType0.isNumberValueType());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      // Undeclared exception!
      try {
        JSType jSType1 = disambiguateProperties0.getTypeWithProperty(string0, jSType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertNotNull(tightenTypes0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      String string0 = "D";
      int int0 = 2985;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      
      DefinitionsRemover.ObjectLiteralPropertyDefinition definitionsRemover_ObjectLiteralPropertyDefinition0 = new DefinitionsRemover.ObjectLiteralPropertyDefinition(node0, node0, node0);
      assertNotNull(definitionsRemover_ObjectLiteralPropertyDefinition0);
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      
      Node node1 = definitionsRemover_ObjectLiteralPropertyDefinition0.getLValue();
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(33, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasChildren());
      assertEquals(-1, node1.getCharno());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      
      disambiguateProperties0.process(node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(33, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasChildren());
      assertEquals(-1, node1.getCharno());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      Multimap<String, Collection<ConcreteType>> multimap0 = disambiguateProperties0.getRenamedTypesForTesting();
      assertNotNull(multimap0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertNotNull(tightenTypes0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      String string0 = "D";
      int int0 = 2985;
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      
      DefinitionsRemover.ObjectLiteralPropertyDefinition definitionsRemover_ObjectLiteralPropertyDefinition0 = new DefinitionsRemover.ObjectLiteralPropertyDefinition(node0, node0, node0);
      assertNotNull(definitionsRemover_ObjectLiteralPropertyDefinition0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      
      Node node1 = definitionsRemover_ObjectLiteralPropertyDefinition0.getLValue();
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(33, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      
      disambiguateProperties0.process(node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(33, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      
      disambiguateProperties0.process(node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getCharno());
      assertEquals(true, node1.hasChildren());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(33, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(2985, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
  }

  @Test
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      
      Node node0 = null;
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      
      // Undeclared exception!
      try {
        disambiguateProperties0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}
