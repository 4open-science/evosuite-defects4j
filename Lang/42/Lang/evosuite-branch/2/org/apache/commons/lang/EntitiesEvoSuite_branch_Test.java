/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:08:42 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.Writer;
import org.apache.commons.lang.Entities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EntitiesEvoSuite_branch_Test extends EntitiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      String string0 = "%&#vJD{;&rX";
      String string1 = entities0.unescape(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("%&#vJD{;&rX", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test01()  throws Throwable  {
      Entities entities0 = Entities.XML;
      assertNotNull(entities0);
      
      String string0 = ">Yd!DMM)Kp<i)ok4";
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      
      entities0.unescape((Writer) charArrayWriter0, string0);
      assertEquals(">Yd!DMM)Kp<i)ok4", charArrayWriter0.toString());
      assertEquals(16, charArrayWriter0.size());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "lquo";
      Entities entities0 = Entities.HTML32;
      assertNotNull(entities0);
      
      String string1 = entities0.unescape(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("lquo", string1);
  }

  @Test
  public void test03()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      assertNotNull(entities_BinaryEntityMap0);
      
      String string0 = "";
      int int0 = 1736;
      entities_BinaryEntityMap0.add(string0, int0);
      String string1 = entities_BinaryEntityMap0.name(int0);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test04()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      //  // Unstable assertion: assertNotNull(entities0);
      
      String string0 = "ni";
      int int0 = entities0.entityValue(string0);
      //  // Unstable assertion: assertEquals(8715, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      assertNotNull(entities0);
      
      String string0 = ":+tfB2>+2mz+ja";
      String string1 = entities0.escape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals(":+tfB2&gt;+2mz+ja", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test06()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      assertNotNull(entities_BinaryEntityMap0);
      
      int int0 = 1736;
      entities_BinaryEntityMap0.ensureCapacity(int0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "`i8243";
      Entities entities0 = new Entities();
      assertNotNull(entities0);
      
      String string1 = entities0.escape(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("`i8243", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test08()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      String string0 = "b@t&9IfvOR4&;/<V>|cH";
      String string1 = entities0.unescape(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("b@t&9IfvOR4&;/<V>|cH", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      assertNotNull(entities_TreeEntityMap0);
      
      int int0 = entities_TreeEntityMap0.value(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals((-1), int0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = 89;
      Entities entities0 = new Entities();
      assertNotNull(entities0);
      
      String string0 = "`%&B;L#FJ9k";
      boolean boolean0 = true;
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0, boolean0);
      assertNotNull(mockFileWriter0);
      
      BufferedWriter bufferedWriter0 = new BufferedWriter((Writer) mockFileWriter0, int0);
      assertNotNull(bufferedWriter0);
      
      entities0.unescape((Writer) bufferedWriter0, string0);
  }

  @Test
  public void test10()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      assertNotNull(entities_ArrayEntityMap0);
      
      int int0 = 0;
      String string0 = entities_ArrayEntityMap0.name(int0);
      assertNull(string0);
      
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      assertNotNull(entities_LookupEntityMap0);
      
      entities_LookupEntityMap0.add(string0, int0);
      int int1 = entities_LookupEntityMap0.value(string0);
      assertEquals(0, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      assertNotNull(entities_HashEntityMap0);
  }

  @Test
  public void test12()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      assertNotNull(entities_LookupEntityMap0);
      
      int int0 = 2365;
      String string0 = entities_LookupEntityMap0.name(int0);
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 1215;
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(int0);
      assertNotNull(entities_BinaryEntityMap0);
  }

  @Test
  public void test14()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      assertNotNull(entities0);
      
      String string0 = "O]E'uU_P&qDO52K|O";
      int int0 = entities0.entityValue(string0);
      assertEquals((-1), int0);
  }

  @Test
  public void test15()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      assertNotNull(entities0);
      
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test
  public void test16()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      assertNotNull(entities_BinaryEntityMap0);
      
      Entities entities0 = Entities.XML;
      assertNotNull(entities0);
      
      int int0 = 2365;
      String string0 = entities_BinaryEntityMap0.name(int0);
      assertNull(string0);
      
      // Undeclared exception!
      try {
        String string1 = entities0.escape(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
