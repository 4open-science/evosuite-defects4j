/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:38:42 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FunctionInjectorEvoSuite_branch_Test extends FunctionInjectorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = null;
      functionInjector0.setKnownConstants(set0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = null;
      Node node0 = null;
      JSModule jSModule0 = null;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertNotNull(functionInjector_Reference0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertTrue(boolean1 == boolean0);
      
      // Undeclared exception!
      try {
        boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = null;
      Node node0 = null;
      JSModule jSModule0 = null;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertNotNull(functionInjector_Reference0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean1);
      assertTrue(boolean2);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean0 == boolean2);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1 == boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = null;
      Node node0 = null;
      JSModule jSModule0 = null;
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      boolean boolean1 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean0);
      assertTrue(boolean1);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Set<String> set0 = null;
      Node node0 = null;
      JSModule jSModule0 = null;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertNotNull(functionInjector_Reference0);
      
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      
      boolean boolean1 = arrayList0.add(functionInjector_Reference0);
      assertTrue(boolean1);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertFalse(boolean1 == boolean0);
      
      // Undeclared exception!
      try {
        boolean boolean2 = functionInjector0.inliningLowersCost(jSModule0, node0, arrayList0, set0, boolean0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "d;A@.C^.";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node0);
      assertEquals(false, node0.isCase());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isHook());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isThrow());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isIn());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNew());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isGetProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isThis());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isArrayLit());
      assertEquals("d;A@.C^.", node0.getSourceFileName());
      assertEquals(false, node0.isTrue());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try {
        Node node1 = functionInjector0.inline(node0, string0, node0, functionInjector_InliningMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "FCrect_e<4C";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) compiler0);
      assertNotNull(node0);
      assertEquals(false, node0.isDo());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals("FCrect_e<4C", node0.getSourceFileName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isEmpty());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isSwitch());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isCase());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isIf());
      assertEquals(-1, node0.getLineno());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isFor());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCast());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try {
        Node node1 = functionInjector0.inline(node0, string0, node0, functionInjector_InliningMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      FunctionInjector functionInjector0 = new FunctionInjector((AbstractCompiler) compiler0, (Supplier<String>) functionToBlockMutator_LabelNameSupplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = null;
      JSModule jSModule0 = null;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      assertNotNull(functionInjector_Reference0);
      
      FunctionInjector functionInjector1 = new FunctionInjector((AbstractCompiler) compiler0, supplier0, boolean0, boolean0, boolean0);
      assertNotNull(functionInjector1);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(functionInjector1.equals((Object)functionInjector0));
      assertNotSame(functionInjector1, functionInjector0);
      
      String string0 = "";
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, string0);
      assertNotNull(node1);
      assertEquals(false, node1.isThis());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isThrow());
      assertEquals(true, node1.isScript());
      assertEquals(false, node1.isTrue());
      assertEquals(false, node1.isNew());
      assertEquals("[testcode]", node1.getSourceFileName());
      assertEquals(false, node1.isAssign());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isReturn());
      assertEquals(1, node1.getLineno());
      assertEquals(false, node1.isBreak());
      assertEquals(false, node1.isDefaultCase());
      assertEquals(false, node1.isIf());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isRegExp());
      assertEquals(0, node1.getCharno());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isEmpty());
      assertEquals(false, node1.isIn());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isVar());
      assertEquals(false, node1.isGetterDef());
      assertEquals(false, node1.isName());
      assertEquals(false, node1.isCall());
      assertEquals(false, node1.isBlock());
      assertEquals(false, node1.isObjectLit());
      assertEquals(false, node1.isGetElem());
      assertEquals(false, node1.isOnlyModifiesArgumentsCall());
      assertEquals(false, node1.isLabelName());
      assertEquals(true, node1.mayMutateArguments());
      assertEquals(0, node1.getChangeTime());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isAssignAdd());
      assertEquals(false, node1.isString());
      assertEquals(false, node1.isNull());
      assertEquals(false, node1.isNE());
      assertEquals(false, node1.isHook());
      assertEquals(true, node1.mayMutateGlobalStateOrThrow());
      assertEquals(false, node1.isGetProp());
      assertEquals(false, node1.isFalse());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isInc());
      assertEquals(false, node1.isSwitch());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isDelProp());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isVoid());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isWith());
      assertEquals(false, node1.isNumber());
      assertEquals(false, node1.isDo());
      assertEquals(false, node1.isTypeOf());
      assertEquals(false, node1.isComma());
      assertEquals(false, node1.isLabel());
      assertEquals(false, node1.isTry());
      assertEquals(false, node1.isCast());
      assertEquals(false, node1.isAdd());
      assertEquals(false, node1.isAnd());
      assertEquals(false, node1.isFor());
      assertEquals(false, node1.isInstanceOf());
      assertEquals(false, node1.isExprResult());
      assertEquals(false, node1.isDebugger());
      assertEquals(false, node1.isArrayLit());
      assertEquals(true, node1.isSyntheticBlock());
      assertEquals(false, node1.isStringKey());
      assertEquals(false, node1.isWhile());
      assertEquals(false, node1.isSetterDef());
      assertEquals(4096, node1.getSourcePosition());
      assertEquals(false, node1.isParamList());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isOr());
      assertEquals(false, node1.isContinue());
      assertEquals(false, node1.isCase());
      assertEquals(false, node1.isDec());
      assertEquals(false, node1.isFunction());
      assertEquals(false, node1.isCatch());
      assertEquals(false, node1.isNot());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      
      // Undeclared exception!
      try {
        functionInjector1.maybePrepareCall(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
