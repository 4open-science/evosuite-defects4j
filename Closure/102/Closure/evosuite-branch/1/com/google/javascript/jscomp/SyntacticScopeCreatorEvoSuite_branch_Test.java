/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:32:47 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SyntacticScopeCreatorEvoSuite_branch_Test extends SyntacticScopeCreatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      String string0 = "argumen*t";
      MockPrintStream mockPrintStream0 = new MockPrintStream(string0);
      assertNotNull(mockPrintStream0);
      
      Compiler compiler0 = new Compiler((PrintStream) mockPrintStream0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(compiler0);
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(syntacticScopeCreator0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(tightenTypes0);
      
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(jSTypeRegistry0);
      
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseSyntheticCode(string0, string0);
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(scriptOrFnNode0);
      
      Scope scope0 = null;
      Scope scope1 = syntacticScopeCreator0.createScope((Node) scriptOrFnNode0, scope0);
      assertEquals(true, scope1.isGlobal());
      assertEquals(false, scope1.isLocal());
      assertEquals(0, scope1.getVarCount());
      assertEquals(0, scriptOrFnNode0.getCharno());
      assertEquals(false, scriptOrFnNode0.isUnscopedQualifiedName());
      assertEquals(true, scriptOrFnNode0.hasChildren());
      assertEquals(false, scriptOrFnNode0.isNoSideEffectsCall());
      assertEquals(1, scriptOrFnNode0.getLineno());
      assertEquals(0, scriptOrFnNode0.getRegexpCount());
      assertEquals(false, scriptOrFnNode0.isVarArgs());
      assertEquals(0, scriptOrFnNode0.getParamCount());
      assertNull(scriptOrFnNode0.getSourceName());
      assertEquals(1, scriptOrFnNode0.getChildCount());
      assertEquals(true, scriptOrFnNode0.hasOneChild());
      assertEquals(false, scriptOrFnNode0.wasEmptyNode());
      assertEquals(false, scriptOrFnNode0.hasMoreThanOneChild());
      assertEquals(0, scriptOrFnNode0.getFunctionCount());
      assertEquals(-1, scriptOrFnNode0.getBaseLineno());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceStart());
      assertEquals(-1, scriptOrFnNode0.getEndLineno());
      assertEquals(132, scriptOrFnNode0.getType());
      assertEquals(false, scriptOrFnNode0.isQualifiedName());
      assertEquals(0, scriptOrFnNode0.getEncodedSourceEnd());
      assertEquals(false, scriptOrFnNode0.isOptionalArg());
      assertEquals(false, scriptOrFnNode0.isQuotedString());
      assertEquals(0, scriptOrFnNode0.getParamAndVarCount());
      assertEquals(true, scriptOrFnNode0.isSyntheticBlock());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(scope1);
      
      Stack<JSType> stack0 = new Stack<JSType>();
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(true, stack0.isEmpty());
      assertEquals(0, stack0.size());
      assertEquals(10, stack0.capacity());
      assertNotNull(stack0);
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(true, stack0.isEmpty());
      assertEquals(0, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(83, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        Scope scope2 = syntacticScopeCreator0.createScope(node0, scope1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}