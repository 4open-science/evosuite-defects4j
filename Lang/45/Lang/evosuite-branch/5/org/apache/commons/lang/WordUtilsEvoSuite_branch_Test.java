/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:11:49 GMT 2014
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
      String string0 = "Mjm(& O X";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("mjm(& o x", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      int int0 = (-305);
      // Undeclared exception!
      try {
        String string2 = WordUtils.abbreviate(string1, int0, int0, string1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -305
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "F$YahR3M@<&0_vn";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("F$YahR3M@<&0_vn", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      int int0 = 1642;
      int int1 = (-1629);
      String string2 = WordUtils.abbreviate(string0, int0, int1, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotNull(string2);
      assertEquals("F$YahR3M@<&0_vn", string2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = null;
      int int0 = 2;
      String string1 = "j|\"av.vm.ifo";
      String string2 = WordUtils.capitalize(string0);
      assertNull(string2);
      
      String string3 = WordUtils.abbreviate(string1, int0, int0, string2);
      assertNotSame(string3, string1);
      assertNotSame(string1, string3);
      assertNotNull(string3);
      assertEquals("j|", string3);
      assertFalse(string3.equals((Object)string1));
      assertFalse(string1.equals((Object)string3));
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "Caught a SecurityEKeption readyngthe system pr(pert '";
      int int0 = 0;
      int int1 = (-1);
      String string1 = WordUtils.abbreviate(string0, int0, int1, string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("CaughtCaught a SecurityEKeption readyngthe system pr(pert '", string1);
      assertFalse(int0 == int1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(int1 == int0);
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "F$YahR3M@<&0_vn";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("F$YahR3M@<&0_vn", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      int int0 = 1642;
      String string2 = WordUtils.abbreviate(string0, int0, int0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotNull(string2);
      assertEquals("F$YahR3M@<&0_vn", string2);
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
      
      char[] charArray0 = new char[2];
      String string2 = WordUtils.abbreviate(string1, (int) charArray0[0], (int) charArray0[1], string1);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string0, string2);
      assertSame(string0, string1);
      assertSame(string1, string2);
      assertSame(string1, string0);
      assertNotNull(string2);
      assertEquals("", string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = null;
      char char0 = 'h';
      String string1 = WordUtils.wrap(string0, (int) char0);
      assertNull(string1);
      
      String string2 = WordUtils.abbreviate(string1, (int) char0, (int) char0, string0);
      assertNull(string2);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "F$YahR3M@<&0_vn";
      char[] charArray0 = new char[2];
      char char0 = '_';
      charArray0[0] = char0;
      String string1 = WordUtils.initials(string0, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("v", string1);
      assertArrayEquals(new char[] {'_', '\u0000'}, charArray0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.initials(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "j|\"av.vm.ifo";
      String string1 = WordUtils.initials(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("j", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "lih+)+$P";
      String string1 = WordUtils.swapCase(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("LIH+)+$p", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = null;
      char[] charArray0 = new char[8];
      String string1 = WordUtils.uncapitalize(string0, charArray0);
      assertNull(string1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.swapCase(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = WordUtils.capitalizeFully(string1);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string0);
      assertSame(string1, string2);
      assertSame(string0, string1);
      assertSame(string0, string2);
      assertNotNull(string2);
      assertEquals("", string2);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = null;
      char char0 = 'h';
      String string1 = WordUtils.wrap(string0, (int) char0);
      assertNull(string1);
      
      String string2 = WordUtils.capitalizeFully(string1);
      assertNull(string2);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = WordUtils.capitalize(string1);
      assertSame(string2, string1);
      assertSame(string2, string0);
      assertSame(string0, string1);
      assertSame(string0, string2);
      assertSame(string1, string0);
      assertSame(string1, string2);
      assertNotNull(string2);
      assertEquals("", string2);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "D2&u?*|U$@ ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("d2&u?*|U$@ ", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      char[] charArray0 = new char[8];
      String string2 = WordUtils.capitalizeFully(string1, charArray0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotNull(string2);
      assertEquals("D2&u?*|u$@ ", string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 2;
      String string0 = "j|\"av.vm.ifo";
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("j|\"av.vm.ifo", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "Caught a SecurityEKeption readyngthe system pr(pert '";
      int int0 = 0;
      boolean boolean0 = false;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("CaughtCaught a SecurityEKeption readyngthe system pr(pert 'aCaught a SecurityEKeption readyngthe system pr(pert 'SecurityEKeptionCaught a SecurityEKeption readyngthe system pr(pert 'readyngtheCaught a SecurityEKeption readyngthe system pr(pert 'systemCaught a SecurityEKeption readyngthe system pr(pert 'pr(pertCaught a SecurityEKeption readyngthe system pr(pert ''", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = " -9\\Et!tM+Lpw1";
      int int0 = 12;
      boolean boolean0 = true;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("-9\\Et!tM+Lpw -9\\Et!tM+Lpw11", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.initials(string0);
      assertNull(string1);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "D2&u?*|U$@ ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals("d2&u?*|U$@ ", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = WordUtils.capitalizeFully(string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotNull(string2);
      assertEquals("D2&u?*|u$@ ", string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
  }

  @Test
  public void test22()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      assertNotNull(wordUtils0);
  }
}
