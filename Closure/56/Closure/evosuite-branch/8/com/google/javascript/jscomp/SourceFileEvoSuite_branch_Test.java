/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:30:51 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceFile;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SourceFileEvoSuite_branch_Test extends SourceFileEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "c~9</c_tYuz.Mnlo";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0, charset0);
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getName());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertNotNull(sourceFile_OnDisk0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "\n";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      String string1 = mockFile0.getName();
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertEquals("\n", string1);
      assertNotNull(string1);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string1, string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = (-2050);
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(2, simpleRegion0.getEndingLineNumber());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(simpleRegion0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "\nActual: ";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 3392;
      Region region0 = sourceFile_Preloaded0.getRegion(int0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertNull(region0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "TJ#^)<%#='$'";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.toString());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("TJ#^)<%#='$'", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.toString());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getName());
      assertNotNull(simpleRegion0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "c~9</c_tYuz.Mnlo";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertNotNull(charset0);
      
      MockFile mockFile1 = (MockFile)MockFile.createTempFile(string0, string0, (File) mockFile0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(mockFile1);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile1, charset0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getName());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = (-1115);
      String string1 = sourceFile_OnDisk0.getLine(int0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getName());
      assertEquals("/scratch/ac1gf/Closure/56/8/run_evosuite.pl_16308_1418336409/c~9</c_tYuz.Mnlo/c~9</c_tYuz.Mnlo0c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNull(string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$OnDisk";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", string1);
      assertNotNull(string1);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "c~9</c_tYuz.Mnlo";
      String string1 = "\nActual: ";
      assertNotSame(string1, string0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getName());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getOriginalPath());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 3;
      String string2 = sourceFile_Preloaded0.getLine(int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getName());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getOriginalPath());
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNull(string2);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "\nActual: ";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = (-1596);
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$OnDisk";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getOriginalPath();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_Preloaded0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", string1);
      assertNotNull(string1);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$OnDisk";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.toString());
      assertNotNull(sourceFile_OnDisk0);
      
      String string1 = sourceFile_OnDisk0.getOriginalPath();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", string1);
      assertNotNull(string1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "\nActual: ";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = sourceFile_Preloaded0.getNumLines();
      assertEquals("\nActual: ", sourceFile_Preloaded0.toString());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\nActual: ", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals(2, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "vFk+c/<soNeJ#";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = sourceFile_OnDisk0.getNumLines();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(1, int0);
      
      int int1 = sourceFile_OnDisk0.getNumLines();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "[>X{k";
      int int0 = 10000;
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("[>X{k", sourceFile_Preloaded0.toString());
      assertEquals("[>X{k", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[>X{k", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      // Undeclared exception!
      try {
        int int1 = sourceFile_Preloaded0.getLineOffset(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected line number between 1 and 1
         // Actual: 10000
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "2NzN6Ty*dXVP\"";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.toString());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = sourceFile_OnDisk0.getNumLines();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.toString());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getName());
      assertEquals(1, int0);
      
      int int1 = sourceFile_OnDisk0.getLineOffset(int0);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.toString());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("2NzN6Ty*dXVP\"", sourceFile_OnDisk0.getName());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "\nAc<ual: ";
      String string1 = "";
      assertNotSame(string1, string0);
      
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream(string0);
      assertNotSame(string0, string1);
      assertEquals(9, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
      assertFalse(string0.equals((Object)string1));
      assertNotNull(stringBufferInputStream0);
      
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) stringBufferInputStream0, (InputStream) stringBufferInputStream0);
      assertNotSame(string0, string1);
      assertEquals(9, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
      assertEquals(false, sequenceInputStream0.markSupported());
      assertFalse(string0.equals((Object)string1));
      assertNotNull(sequenceInputStream0);
      
      // Undeclared exception!
      try {
        SourceFile sourceFile0 = SourceFile.fromInputStream(string1, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // a source must have a name
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = null;
      SourceFile sourceFile0 = null;
      try {
        sourceFile0 = new SourceFile(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // a source must have a name
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "vFk+c/<soNeJ#";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      MockFileReader mockFileReader0 = (MockFileReader)sourceFile_OnDisk0.getCodeReader();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(false, mockFileReader0.markSupported());
      assertNotNull(mockFileReader0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromReader(string0, (Reader) mockFileReader0);
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(false, mockFileReader0.markSupported());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("vFk+c/<soNeJ#", sourceFile_Preloaded0.toString());
      assertEquals("vFk+c/<soNeJ#", sourceFile_Preloaded0.getName());
      assertEquals("vFk+c/<soNeJ#", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "\n";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(sourceFile_OnDisk0);
      
      String string1 = sourceFile_OnDisk0.getName();
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("\n/\n", string1);
      assertNotNull(string1);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "c~9</c_tYuz.Mnlo";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getName());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.toString();
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getName());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_Preloaded0.toString());
      assertEquals("c~9</c_tYuz.Mnlo", string1);
      assertNotNull(string1);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "q5([a";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("q5([a", sourceFile_Preloaded0.toString());
      assertEquals("q5([a", sourceFile_Preloaded0.getName());
      assertEquals("q5([a", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      sourceFile_Preloaded0.clearCachedSource();
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("q5([a", sourceFile_Preloaded0.toString());
      assertEquals("q5([a", sourceFile_Preloaded0.getName());
      assertEquals("q5([a", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$OnDisk";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.toString());
      assertNotNull(sourceFile_OnDisk0);
      
      String string1 = sourceFile_OnDisk0.getCodeNoCache();
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$OnDisk", sourceFile_OnDisk0.toString());
      assertNull(string1);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "c~9</c_tYuz.Mnlo";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0, charset0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.toString());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      boolean boolean0 = sourceFile_OnDisk0.isExtern();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.toString());
      assertEquals("c~9</c_tYuz.Mnlo", sourceFile_OnDisk0.getName());
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "TJ#^)<%#='$'";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      boolean boolean0 = false;
      sourceFile_Preloaded0.setIsExtern(boolean0);
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getName());
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "vFk+c/<soNeJ#";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = sourceFile_OnDisk0.getNumLines();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(1, int0);
      
      StringReader stringReader0 = (StringReader)sourceFile_OnDisk0.getCodeReader();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      assertNotNull(stringReader0);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = "vFk+c/<soNeJ#";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertNotNull(sourceFile_OnDisk0);
      
      sourceFile_OnDisk0.clearCachedSource();
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/vFk+c/<soNeJ#0vFk+c/<soNeJ#", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = "\n";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      String string1 = mockFile0.getName();
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertEquals("\n", string1);
      assertNotNull(string1);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertNotSame(string0, string1);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertTrue(string0.equals((Object)string1));
      assertNotNull(sourceFile_OnDisk0);
      
      Charset charset0 = sourceFile_OnDisk0.getCharset();
      assertNotSame(string0, string1);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertTrue(string0.equals((Object)string1));
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk1 = (SourceFile.OnDisk)SourceFile.fromFile(string1, charset0);
      assertNotSame(sourceFile_OnDisk0, sourceFile_OnDisk1);
      assertNotSame(sourceFile_OnDisk1, sourceFile_OnDisk0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertEquals("\n", sourceFile_OnDisk1.toString());
      assertEquals("\n", sourceFile_OnDisk1.getName());
      assertEquals(false, sourceFile_OnDisk1.isExtern());
      assertEquals("\n", sourceFile_OnDisk1.getOriginalPath());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertFalse(sourceFile_OnDisk0.equals((Object)sourceFile_OnDisk1));
      assertFalse(sourceFile_OnDisk1.equals((Object)sourceFile_OnDisk0));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(sourceFile_OnDisk1);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = "\n";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("\n/\n", sourceFile_OnDisk0.toString());
      assertEquals("\n/\n", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("\n/\n", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = (-2050);
      // Undeclared exception!
      try {
        int int1 = sourceFile_OnDisk0.getLineOffset(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected line number between 1 and 1
         // Actual: -2050
         //
      }
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = "TJ#^)<%#='$'";
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)55;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) byte0, (int) byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(true, byteArrayInputStream0.markSupported());
      assertEquals(-53, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(true, byteArrayInputStream0.markSupported());
      assertEquals(-53, byteArrayInputStream0.available());
      assertEquals(true, bufferedInputStream0.markSupported());
      assertNotNull(bufferedInputStream0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromInputStream(string0, string0, (InputStream) bufferedInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(true, byteArrayInputStream0.markSupported());
      assertEquals(-53, byteArrayInputStream0.available());
      assertEquals(true, bufferedInputStream0.markSupported());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.getName());
      assertEquals("TJ#^)<%#='$'", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
  }
}