/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:42:43 GMT 2014
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
      char[] charArray0 = new char[10];
      String string0 = "Minmum abbreiat6oe widt, with+offset i ";
      String string1 = WordUtils.initials(string0);
      assertNotNull(string1);
      assertEquals("Mawwi", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = WordUtils.capitalizeFully(string0, charArray0);
      assertNotNull(string2);
      assertEquals("Minmum abbreiat6oe widt, with+offset i ", string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertFalse(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      
      int int0 = (-2848);
      int int1 = 36;
      String string3 = WordUtils.abbreviate(string2, int0, int1, string1);
      assertNotNull(string3);
      assertEquals("MinmumMawwi", string3);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotSame(string0, string3);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string3);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string3);
      assertNotSame(string3, string1);
      assertNotSame(string3, string0);
      assertNotSame(string3, string2);
      assertFalse(string0.equals((Object)string3));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertFalse(int0 == int1);
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string3));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string3));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertFalse(int1 == int0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "!U ";
      int int0 = (-317);
      // Undeclared exception!
      try {
        String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -317
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "w$lOs){Rq";
      int int0 = (-1350);
      int int1 = 0;
      String string1 = WordUtils.abbreviate(string0, int1, int0, string0);
      assertNotNull(string1);
      assertEquals("w$lOs){Rq", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test03()  throws Throwable  {
      char char0 = '4';
      String string0 = "!U ";
      String string1 = WordUtils.wrap(string0, (int) char0);
      assertNotNull(string1);
      assertEquals("!U ", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      String string2 = WordUtils.abbreviate(string1, (int) char0, (int) char0, string1);
      assertNotNull(string2);
      assertEquals("!U ", string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
  }

  @Test
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[10];
      String string0 = "Minmum abbreiat6oe widt, with+offset i ";
      String string1 = WordUtils.initials(string0);
      assertNotNull(string1);
      assertEquals("Mawwi", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = "";
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertFalse(string2.equals((Object)string1));
      
      int int0 = (-2848);
      String string3 = WordUtils.abbreviate(string2, int0, (int) charArray0[1], string1);
      assertNotNull(string3);
      assertEquals("", string3);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotSame(string0, string3);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertSame(string2, string3);
      assertNotSame(string2, string0);
      assertNotSame(string3, string1);
      assertSame(string3, string2);
      assertNotSame(string3, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string3);
      assertFalse(string0.equals((Object)string3));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string3));
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
      
      int int0 = (-1350);
      String string2 = WordUtils.abbreviate(string1, int0, int0, string1);
      assertNull(string2);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "w$lOs){Rq";
      char[] charArray0 = new char[1];
      String string1 = WordUtils.initials(string0, charArray0);
      assertNotNull(string1);
      assertEquals("w", string1);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[10];
      String string0 = null;
      String string1 = WordUtils.capitalizeFully(string0, charArray0);
      assertNull(string1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      String string2 = WordUtils.initials(string1, charArray0);
      assertNull(string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "w$lOs){Rq";
      String string1 = WordUtils.swapCase(string0);
      assertNotNull(string1);
      assertEquals("W$LoS){rQ", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "!U ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotNull(string1);
      assertEquals("!U ", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.swapCase(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      
      char[] charArray0 = new char[11];
      String string2 = WordUtils.uncapitalize(string1, charArray0);
      assertNotNull(string2);
      assertEquals("", string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertSame(string0, string2);
      assertSame(string0, string1);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string2);
      assertSame(string1, string0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "";
      int int0 = (-1);
      String string1 = "VH";
      assertNotSame(string1, string0);
      
      String string2 = WordUtils.abbreviate(string1, int0, int0, string0);
      assertNotNull(string2);
      assertEquals("VH", string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      
      String string3 = WordUtils.capitalizeFully(string2);
      assertNotNull(string3);
      assertEquals("Vh", string3);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string3);
      assertNotSame(string3, string2);
      assertNotSame(string3, string0);
      assertNotSame(string3, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string3);
      assertNotSame(string2, string3);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string3));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string3));
      assertFalse(string2.equals((Object)string3));
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      
      char[] charArray0 = new char[3];
      String string2 = WordUtils.capitalizeFully(string1, charArray0);
      assertNotNull(string2);
      assertEquals("", string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string0);
      assertSame(string1, string2);
      assertSame(string0, string2);
      assertSame(string0, string1);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "_;E_2Hs<W\\o{cT_FkzCA";
      char[] charArray0 = new char[3];
      char char0 = 'c';
      charArray0[0] = char0;
      String string1 = WordUtils.capitalize(string0, charArray0);
      assertNotNull(string1);
      assertEquals("_;E_2Hs<W\\o{cT_FkzCA", string1);
      assertArrayEquals(new char[] {'c', '\u0000', '\u0000'}, charArray0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "q0$A8%?vSph^}";
      String string1 = " vs ";
      assertNotSame(string1, string0);
      
      int int0 = (-30);
      boolean boolean0 = true;
      String string2 = WordUtils.wrap(string1, int0, string0, boolean0);
      assertNotNull(string2);
      assertEquals("vq0$A8%?vSph^}sq0$A8%?vSph^}", string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "q0$A8%?vSph^}";
      String string1 = " vs ";
      assertNotSame(string1, string0);
      
      int int0 = (-30);
      boolean boolean0 = false;
      String string2 = WordUtils.wrap(string1, int0, string0, boolean0);
      assertNotNull(string2);
      assertEquals("vsq0$A8%?vSph^}", string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "q0$A8%?vSph^}";
      int int0 = (-30);
      boolean boolean0 = false;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNotNull(string1);
      assertEquals("q0$A8%?vSph^}", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
      
      String string2 = WordUtils.uncapitalize(string1);
      assertNull(string2);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.initials(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test20()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      assertNotNull(wordUtils0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.capitalize(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
      
      int int0 = (-1350);
      String string2 = WordUtils.wrap(string1, int0);
      assertNull(string2);
  }
}
