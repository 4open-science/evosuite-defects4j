/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:21:17 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnreachableCodeEliminationEvoSuite_branch_Test extends UnreachableCodeEliminationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, boolean0);
      assertNotNull(unreachableCodeElimination0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      String string0 = "Hy2";
      int int0 = 20;
      Node node0 = Node.newString(string0, int0, int0);
      assertNotNull(node0);
      assertEquals(81940, node0.getSourcePosition());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isString());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isIn());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isExprResult());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isFor());
      assertEquals(20, node0.getCharno());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDo());
      assertEquals(20, node0.getLineno());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVoid());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.hasChildren());
      
      // Undeclared exception!
      try {
        unreachableCodeElimination0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
