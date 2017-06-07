/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:18:37 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodingConventionEvoSuite_branch_Test extends CodingConventionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertNotNull(googleCodingConvention0);
      
      String string0 = googleCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertNotNull(string0);
      
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.MIXIN;
      int int0 = 2694;
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals(2694, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(2694, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(2694, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node0);
      
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = new CodingConvention.SubclassRelationship(codingConvention_SubclassType0, node0, node0);
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals(2694, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(2694, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(2694, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(codingConvention_SubclassRelationship0);
  }

  @Test
  public void test1()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertNotNull(googleCodingConvention0);
      
      String string0 = googleCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertNotNull(string0);
      
      CodingConvention.DelegateRelationship codingConvention_DelegateRelationship0 = new CodingConvention.DelegateRelationship(string0, string0);
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertNotNull(codingConvention_DelegateRelationship0);
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.CodingConvention$SubclassType";
      Node node0 = null;
      CodingConvention.ObjectLiteralCast codingConvention_ObjectLiteralCast0 = new CodingConvention.ObjectLiteralCast(string0, node0);
      assertNotNull(codingConvention_ObjectLiteralCast0);
  }
}
