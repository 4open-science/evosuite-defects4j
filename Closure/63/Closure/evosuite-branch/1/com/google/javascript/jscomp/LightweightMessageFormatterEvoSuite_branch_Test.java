/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:21:44 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.ExternExportsPass;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LightweightMessageFormatterEvoSuite_branch_Test extends LightweightMessageFormatterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-40);
      String string0 = "C1.570Qib# _c";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertNotNull(simpleRegion0);
      assertEquals("C1.570Qib# _c", simpleRegion0.getSourceExcerpt());
      assertEquals(-40, simpleRegion0.getBeginningLineNumber());
      assertEquals(-40, simpleRegion0.getEndingLineNumber());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("  -40| C1.570Qib# _c", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("C1.570Qib# _c", simpleRegion0.getSourceExcerpt());
      assertEquals(-40, simpleRegion0.getBeginningLineNumber());
      assertEquals(-40, simpleRegion0.getEndingLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-1985);
      String string0 = "";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertNotNull(simpleRegion0);
      assertEquals(-1985, simpleRegion0.getBeginningLineNumber());
      assertEquals(-1985, simpleRegion0.getEndingLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNull(string1);
      assertEquals(-1985, simpleRegion0.getBeginningLineNumber());
      assertEquals(-1985, simpleRegion0.getEndingLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
  }

  @Test
  public void test2()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      String string0 = "\\bKnIl ?uMt:f^UEw";
      int int0 = (-1829);
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.toString());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getName());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getOriginalPath());
      
      Region region0 = sourceFile_OnDisk0.getRegion(int0);
      assertNull(region0);
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.toString());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getName());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getOriginalPath());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(region0);
      assertNull(string1);
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.toString());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getName());
      assertEquals("\\bKnIl ?uMt:f^UEw", sourceFile_OnDisk0.getOriginalPath());
  }

  @Test
  public void test3()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = "\\bKnIl ?uMt:f^UEw";
      int int0 = (-1829);
      DiagnosticType diagnosticType0 = ExternExportsPass.EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[6];
      JSError jSError0 = JSError.make(string0, int0, int0, diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(-1829, jSError0.getCharno());
      
      String string1 = lightweightMessageFormatter0.formatError(jSError0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("\\bKnIl ?uMt:f^UEw: ERROR - Unable to determine type of parameter null for exported function null\n", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(-1829, jSError0.getCharno());
      
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(simpleRegion0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(-1829, jSError0.getCharno());
      assertEquals(-1829, simpleRegion0.getBeginningLineNumber());
      assertEquals(-1829, simpleRegion0.getEndingLineNumber());
      assertEquals("\\bKnIl ?uMt:f^UEw: ERROR - Unable to determine type of parameter null for exported function null\n", simpleRegion0.getSourceExcerpt());
      
      String string2 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotNull(string2);
      assertEquals("  -1829| \\bKnIl ?uMt:f^UEw: ERROR - Unable to determine type of parameter null for exported function null", string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals(-1829, jSError0.getCharno());
      assertEquals(-1829, simpleRegion0.getBeginningLineNumber());
      assertEquals(-1829, simpleRegion0.getEndingLineNumber());
      assertEquals("\\bKnIl ?uMt:f^UEw: ERROR - Unable to determine type of parameter null for exported function null\n", simpleRegion0.getSourceExcerpt());
  }

  @Test
  public void test4()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = "";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      
      DiagnosticType diagnosticType0 = ExternExportsPass.EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[6];
      JSError jSError0 = JSError.make(string0, node0, diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(0, jSError0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals(":1: WARNING - Unable to determine return type for exported function null\n", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(0, jSError0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
  }

  @Test
  public void test5()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertNotNull(compiler0);
      
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.LINE;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) compiler0, sourceExcerptProvider_SourceExcerpt0);
      assertNotNull(lightweightMessageFormatter0);
      
      DiagnosticType diagnosticType0 = TypeCheck.MULTIPLE_VAR_DEF;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[13];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(-1, jSError0.getCharno());
      
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotNull(string0);
      assertEquals("WARNING - declaration of multiple variables with shared type information\n", string0);
      assertEquals(-1, jSError0.getCharno());
  }
}
