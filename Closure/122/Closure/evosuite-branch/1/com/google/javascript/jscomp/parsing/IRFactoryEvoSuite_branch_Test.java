/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:35:38 GMT 2014
 */

package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Node;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.File;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class IRFactoryEvoSuite_branch_Test extends IRFactoryEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 1433;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(1, astRoot0.getLength());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(1433, astRoot0.getPosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(1433, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.isInStrictMode());
      assertNull(astRoot0.getSourceName());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertNotNull(astRoot0);
      
      String string0 = "!6::?aL(";
      BreakStatement breakStatement0 = new BreakStatement(int0, int0);
      assertEquals(1433, breakStatement0.getAbsolutePosition());
      assertEquals(1433, breakStatement0.getLength());
      assertEquals(120, breakStatement0.getType());
      assertEquals(-1, breakStatement0.getLineno());
      assertEquals("120", breakStatement0.toString());
      assertEquals(1433, breakStatement0.getPosition());
      assertNull(breakStatement0.getJsDoc());
      assertEquals(0, breakStatement0.depth());
      assertEquals(false, breakStatement0.hasChildren());
      assertNotNull(breakStatement0);
      
      boolean boolean0 = false;
      astRoot0.addChildrenToBack((Node) breakStatement0);
      assertEquals(1, astRoot0.getLength());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(1433, astRoot0.getPosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(1433, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.isInStrictMode());
      assertNull(astRoot0.getSourceName());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(1433, breakStatement0.getAbsolutePosition());
      assertEquals(1433, breakStatement0.getLength());
      assertEquals(120, breakStatement0.getType());
      assertEquals(-1, breakStatement0.getLineno());
      assertEquals("120", breakStatement0.toString());
      assertEquals(1433, breakStatement0.getPosition());
      assertNull(breakStatement0.getJsDoc());
      assertEquals(0, breakStatement0.depth());
      assertEquals(false, breakStatement0.hasChildren());
      
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile(string0, boolean0);
      assertEquals("!6::?aL(", simpleSourceFile0.toString());
      assertEquals("!6::?aL(", simpleSourceFile0.getName());
      assertEquals(false, simpleSourceFile0.isExtern());
      assertNotNull(simpleSourceFile0);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(set0);
      
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, boolean0, config_LanguageMode0, boolean0);
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(config0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(boolean0, (PrintStream) mockPrintStream0);
      assertEquals(false, toolErrorReporter0.hasReportedError());
      assertEquals(false, toolErrorReporter0.isReportingWarnings());
      assertNotNull(toolErrorReporter0);
      
      com.google.javascript.rhino.Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) simpleSourceFile0, string0, config0, (ErrorReporter) toolErrorReporter0);
      assertEquals("!6::?aL(", simpleSourceFile0.toString());
      assertEquals("!6::?aL(", simpleSourceFile0.getName());
      assertEquals(false, simpleSourceFile0.isExtern());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals(1, astRoot0.getLength());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(1433, astRoot0.getPosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(1433, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.isInStrictMode());
      assertNull(astRoot0.getSourceName());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isIn());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isWhile());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isFor());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isLabelName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAssign());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isTypeOf());
      assertEquals(132, node0.getType());
      assertEquals("!6::?aL(", node0.getSourceFileName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isDec());
      assertEquals(true, node0.isScript());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isComma());
      assertEquals(false, toolErrorReporter0.hasReportedError());
      assertEquals(false, toolErrorReporter0.isReportingWarnings());
      assertNotNull(node0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 1433;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertNull(astRoot0.getJsDoc());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(1433, astRoot0.getPosition());
      assertEquals(1433, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertNotNull(astRoot0);
      
      String string0 = "!6::?aL(";
      boolean boolean0 = false;
      Locale locale0 = Locale.GERMANY;
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(set0);
      
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(set0, set0, boolean0, config_LanguageMode0, boolean0);
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(config0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      assertNotNull(mockPrintStream0);
      
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(boolean0, (PrintStream) mockPrintStream0);
      assertEquals(false, toolErrorReporter0.isReportingWarnings());
      assertEquals(false, toolErrorReporter0.hasReportedError());
      assertNotNull(toolErrorReporter0);
      
      SimpleSourceFile simpleSourceFile0 = null;
      com.google.javascript.rhino.Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) simpleSourceFile0, string0, config0, (ErrorReporter) toolErrorReporter0);
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertNull(astRoot0.getJsDoc());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(1433, astRoot0.getPosition());
      assertEquals(1433, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(false, toolErrorReporter0.isReportingWarnings());
      assertEquals(false, toolErrorReporter0.hasReportedError());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNumber());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isHook());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isAssign());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCast());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isDec());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isContinue());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.hasChildren());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(node0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 2126;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(136, astRoot0.getType());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals("136", astRoot0.toString());
      assertEquals(1, astRoot0.getLength());
      assertEquals(2126, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(2126, astRoot0.getPosition());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNull(astRoot0.getEncodedSource());
      assertNotNull(astRoot0);
      
      String string0 = "AC*guments";
      AstRoot astRoot1 = (AstRoot)astRoot0.setType(int0);
      assertSame(astRoot0, astRoot1);
      assertSame(astRoot1, astRoot0);
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals("2126", astRoot0.toString());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(2126, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(1, astRoot0.getLength());
      assertEquals(2126, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(2126, astRoot0.getPosition());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(-1, astRoot1.getEncodedSourceStart());
      assertEquals(-1, astRoot1.getBaseLineno());
      assertEquals(false, astRoot1.isInStrictMode());
      assertEquals(2126, astRoot1.getAbsolutePosition());
      assertEquals(0, astRoot1.getFunctionCount());
      assertEquals(-1, astRoot1.getEncodedSourceEnd());
      assertEquals(-1, astRoot1.getEndLineno());
      assertEquals(2126, astRoot1.getPosition());
      assertEquals(false, astRoot1.hasChildren());
      assertEquals(0, astRoot1.getRegexpCount());
      assertEquals(1, astRoot1.getLength());
      assertEquals(0, astRoot1.getParamCount());
      assertNull(astRoot1.getSourceName());
      assertEquals(0, astRoot1.depth());
      assertEquals("2126", astRoot1.toString());
      assertEquals(-1, astRoot1.getLineno());
      assertEquals(2126, astRoot1.getType());
      assertNull(astRoot1.getEncodedSource());
      assertNull(astRoot1.getJsDoc());
      assertNotNull(astRoot1);
      
      boolean boolean0 = false;
      SimpleSourceFile simpleSourceFile0 = new SimpleSourceFile(string0, boolean0);
      assertEquals("AC*guments", simpleSourceFile0.getName());
      assertEquals(false, simpleSourceFile0.isExtern());
      assertEquals("AC*guments", simpleSourceFile0.toString());
      assertNotNull(simpleSourceFile0);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
      
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, boolean0, config_LanguageMode0, boolean0);
      assertEquals("DE", locale0.getCountry());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals("de", locale0.getLanguage());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(config0);
      
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      // Undeclared exception!
      try {
        com.google.javascript.rhino.Node node0 = IRFactory.transformTree(astRoot0, (StaticSourceFile) simpleSourceFile0, string0, config0, (ErrorReporter) errorCollector0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2126
         //
      }
  }
}
