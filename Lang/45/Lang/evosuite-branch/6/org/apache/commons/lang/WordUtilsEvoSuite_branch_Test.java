/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:22:07 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class WordUtilsEvoSuite_branch_Test extends WordUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.initials(string0);
      assertNull(string1);
      
      String string2 = "B VH\\i+";
      int int0 = 0;
      String string3 = WordUtils.abbreviate(string2, int0, int0, string1);
      assertNotSame(string3, string2);
      assertNotSame(string2, string3);
      assertNotNull(string3);
      assertEquals("", string3);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string2.equals((Object)string3));
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "0]2'zlZ7h-f";
      int int0 = 4513;
      int int1 = 0;
      String string1 = WordUtils.abbreviate(string0, int0, int1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("0]2'zlZ7h-f", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "Gt!|:Yh p8>t,l{J[i@";
      int int0 = (-1);
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("Gt!|:YhGt!|:Yh p8>t,l{J[i@", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "0]2'zlZ7h-f";
      int int0 = 4513;
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("0]2'zlZ7h-f", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "";
      int int0 = 4513;
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = (-62);
      String string0 = null;
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNull(string1);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = " Y\r";
      int int0 = 0;
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("Y\r", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = WordUtils.abbreviate(string1, int0, int0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotNull(string2);
      assertEquals("Y\r", string2);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "0]2'zlZ7h-f";
      char[] charArray0 = new char[1];
      char char0 = '-';
      charArray0[0] = char0;
      String string1 = WordUtils.initials(string0, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("0f", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertArrayEquals(new char[] {'-'}, charArray0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "B VH\\i+";
      String string1 = WordUtils.initials(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("BV", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.swapCase(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "java.endorVed.dirs";
      int int0 = (-12);
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("java.endorVed.dirs", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      String string2 = WordUtils.swapCase(string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotNull(string2);
      assertEquals("JAVA.ENDORvED.DIRS", string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = " ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals(" ", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
      
      String string2 = WordUtils.uncapitalize(string1);
      assertNull(string2);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "]: {!Aa?'8r_tA<i:{";
      char[] charArray0 = new char[3];
      String string1 = WordUtils.uncapitalize(string0, charArray0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("]: {!Aa?'8r_tA<i:{", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalizeFully(string0);
      assertNull(string1);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "]: {!Aa?'8r_tA<i:{";
      String string1 = WordUtils.capitalizeFully(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("]: {!aa?'8r_ta<i:{", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      char[] charArray0 = new char[3];
      String string2 = WordUtils.capitalizeFully(string1, charArray0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotNull(string2);
      assertEquals("]: {!aa?'8r_ta<i:{", string2);
      assertFalse(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "java.endorVed.dirs";
      int int0 = (-12);
      boolean boolean0 = false;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("java.endorVed.dirs", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      String string2 = "@U<v>7=wfz \\\"<:MpJ";
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertFalse(string2.equals((Object)string1));
      
      String string3 = WordUtils.wrap(string2, int0, string1, boolean0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string3);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string3);
      assertNotSame(string0, string1);
      assertNotSame(string3, string2);
      assertNotSame(string3, string1);
      assertNotSame(string3, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string3);
      assertNotNull(string3);
      assertEquals("@U<v>7=wfzjava.endorVed.dirs\\\"<:MpJ", string3);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string3));
      assertTrue(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string3));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string3));
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "]: {!Aa?'8r_tA<i:{";
      String string1 = WordUtils.capitalizeFully(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("]: {!aa?'8r_ta<i:{", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      int int0 = 3;
      boolean boolean0 = true;
      String string2 = WordUtils.wrap(string1, int0, string1, boolean0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotNull(string2);
      assertEquals("]:]: {!aa?'8r_ta<i:{{!a]: {!aa?'8r_ta<i:{a?']: {!aa?'8r_ta<i:{8r_]: {!aa?'8r_ta<i:{ta<]: {!aa?'8r_ta<i:{i:{", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = null;
      int int0 = (-12);
      boolean boolean0 = false;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNull(string1);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = WordUtils.initials(string1);
      assertSame(string1, string2);
      assertSame(string1, string0);
      assertSame(string2, string1);
      assertSame(string2, string0);
      assertSame(string0, string1);
      assertSame(string0, string2);
      assertNotNull(string2);
      assertEquals("", string2);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.capitalizeFully(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test22()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      assertNotNull(wordUtils0);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = WordUtils.capitalize(string1);
      assertSame(string1, string2);
      assertSame(string1, string0);
      assertSame(string2, string1);
      assertSame(string2, string0);
      assertSame(string0, string2);
      assertSame(string0, string1);
      assertNotNull(string2);
      assertEquals("", string2);
  }
}
