/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:03:45 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineObjectLiteralsEvoSuite_branch_Test extends InlineObjectLiteralsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Logger logger0 = Tracer.logger;
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNotNull(supplier0);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, supplier0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("com.google.javascript.jscomp.Tracer", logger0.getName());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertNotNull(inlineObjectLiterals0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertNotNull(jSTypeRegistry0);
      
      Vector<JSType> vector0 = new Vector<JSType>();
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertEquals(true, vector0.isEmpty());
      assertNotNull(vector0);
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertEquals(true, vector0.isEmpty());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(83, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
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
