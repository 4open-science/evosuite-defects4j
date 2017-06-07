/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:38:51 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.EmptyMessageBundle;
import com.google.javascript.jscomp.GoogleJsMessageIdGenerator;
import com.google.javascript.jscomp.JsMessage;
import com.google.javascript.jscomp.JsMessageVisitor;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReplaceMessages;
import com.google.javascript.jscomp.ReplaceMessagesForChrome;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class JsMessageVisitorEvoSuite_branch_Test extends JsMessageVisitorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      String string0 = "goog.tweak.getBoolean";
      GoogleJsMessageIdGenerator googleJsMessageIdGenerator0 = new GoogleJsMessageIdGenerator(string0);
      assertNotNull(googleJsMessageIdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, googleJsMessageIdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      ScopeCreator scopeCreator0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) replaceMessagesForChrome0, scopeCreator0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      AbstractCompiler abstractCompiler1 = nodeTraversal0.getCompiler();
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNull(abstractCompiler1);
      
      int int0 = 30;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      ReplaceMessages replaceMessages0 = new ReplaceMessages(abstractCompiler1, emptyMessageBundle0, boolean0, jsMessage_Style0, boolean0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(replaceMessages0);
      
      int int1 = 3;
      Node node0 = new Node(int1);
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isCase());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getLength());
      assertEquals(3, node0.getType());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isInc());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isHook());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAnd());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isWhile());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isWith());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isSetterDef());
      assertFalse(int1 == int0);
      assertNotNull(node0);
      
      try {
        replaceMessages0.checkNode(node0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected node type 30; found: 3
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      String string0 = "goog.tweak.getBoolean";
      GoogleJsMessageIdGenerator googleJsMessageIdGenerator0 = new GoogleJsMessageIdGenerator(string0);
      assertNotNull(googleJsMessageIdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, googleJsMessageIdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      ScopeCreator scopeCreator0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) replaceMessagesForChrome0, scopeCreator0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      AbstractCompiler abstractCompiler1 = nodeTraversal0.getCompiler();
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNull(abstractCompiler1);
      
      int int0 = 30;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      ReplaceMessages replaceMessages0 = new ReplaceMessages(abstractCompiler1, emptyMessageBundle0, boolean0, jsMessage_Style0, boolean0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(replaceMessages0);
      
      Node node0 = new Node(int0);
      assertEquals(false, node0.isInstanceOf());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNull());
      assertEquals(-1, node0.getLineno());
      assertEquals(30, node0.getType());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(true, node0.isNew());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isLabelName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCase());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isNumber());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isArrayLit());
      assertEquals(0, node0.getChangeTime());
      assertNotNull(node0);
      
      replaceMessages0.checkNode(node0, int0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isNull());
      assertEquals(-1, node0.getLineno());
      assertEquals(30, node0.getType());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isGetElem());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(true, node0.isNew());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isLabelName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCase());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isWith());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isNumber());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isArrayLit());
      assertEquals(0, node0.getChangeTime());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "0:rT0";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertEquals("0:rt0", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "goog.tweak.getBoolean";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertEquals("goog.tweak.getboolean", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "8";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertEquals("8", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "_00";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertEquals("_00", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test
  public void test06()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      ReplaceMessages replaceMessages0 = new ReplaceMessages(abstractCompiler0, emptyMessageBundle0, boolean0, jsMessage_Style0, boolean0);
      assertNotNull(replaceMessages0);
      
      String string0 = "MSG_JSC__HELP";
      boolean boolean1 = replaceMessages0.isMessageName(string0, boolean0);
      assertFalse(boolean1);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      String string0 = "MSG_JSC__HELP";
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = true;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      boolean boolean1 = replaceMessagesForChrome0.isMessageName(string0, boolean0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
  }

  @Test
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessages replaceMessages0 = new ReplaceMessages(compiler0, emptyMessageBundle0, boolean0, jsMessage_Style0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(replaceMessages0);
      
      String string0 = "MSG_";
      boolean boolean1 = replaceMessages0.isMessageName(string0, boolean0);
      assertTrue(boolean1);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
  }

  @Test
  public void test09()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      Node node0 = null;
      int int0 = 5590;
      try {
        replaceMessagesForChrome0.checkNode(node0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected node type 5590; found: null
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "t6ynprYtote;";
      boolean boolean0 = JsMessageVisitor.isLowerCamelCaseWithNumericSuffixes(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      JsMessage.Builder jsMessage_Builder0 = new JsMessage.Builder();
      assertNotNull(jsMessage_Builder0);
      
      AbstractCompiler abstractCompiler0 = null;
      String string0 = "goog.tweak.getBoolean";
      GoogleJsMessageIdGenerator googleJsMessageIdGenerator0 = new GoogleJsMessageIdGenerator(string0);
      assertNotNull(googleJsMessageIdGenerator0);
      
      boolean boolean0 = true;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, googleJsMessageIdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      int int0 = 3;
      Node node0 = new Node(int0);
      assertEquals(false, node0.isEmpty());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNot());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(-1, node0.getLineno());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTrue());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAnd());
      assertEquals(3, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isVar());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLocalResultCall());
      assertNotNull(node0);
      
      JsMessage jsMessage0 = jsMessage_Builder0.build();
      assertEquals("MSG_12MI20AMYO9T6", jsMessage0.getId());
      assertEquals("MSG_12MI20AMYO9T6", jsMessage0.getKey());
      assertEquals(false, jsMessage0.isExternal());
      assertEquals(false, jsMessage0.isHidden());
      assertNull(jsMessage0.getSourceName());
      assertEquals(true, jsMessage0.isAnonymous());
      assertNull(jsMessage0.getDesc());
      assertNotNull(jsMessage0);
      
      replaceMessagesForChrome0.processMessageFallback(node0, jsMessage0, jsMessage0);
      assertEquals("MSG_12MI20AMYO9T6", jsMessage0.getId());
      assertEquals("MSG_12MI20AMYO9T6", jsMessage0.getKey());
      assertEquals(false, jsMessage0.isExternal());
      assertEquals(false, jsMessage0.isHidden());
      assertNull(jsMessage0.getSourceName());
      assertEquals(true, jsMessage0.isAnonymous());
      assertNull(jsMessage0.getDesc());
      assertEquals(false, node0.isEmpty());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isNot());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(-1, node0.getLineno());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isTrue());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAnd());
      assertEquals(3, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isVar());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isLocalResultCall());
  }
}
