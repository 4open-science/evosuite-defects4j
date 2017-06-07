/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:34:55 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SourceFileEvoSuite_branch_Test extends SourceFileEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "q0qxo]';)^xv}JJ";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("q0qxo]';)^xv}JJ", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("q0qxo]';)^xv}JJ", sourceFile_OnDisk0.getName());
      
      try {
        Reader reader0 = sourceFile_OnDisk0.getCodeReader();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "Failed to delete ";
      Charset charset0 = null;
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, charset0);
      assertNotNull(jSSourceFile0);
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      assertEquals("Failed to delete ", jSSourceFile0.getName());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "Failed to delete ";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("Failed to delete ", jSSourceFile0.getName());
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      
      int int0 = 4707;
      Region region0 = jSSourceFile0.getRegion(int0);
      assertNull(region0);
      assertEquals("Failed to delete ", jSSourceFile0.getName());
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "Failed to delete ";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      assertEquals("Failed to delete ", jSSourceFile0.getName());
      
      int int0 = 0;
      SimpleRegion simpleRegion0 = (SimpleRegion)jSSourceFile0.getRegion(int0);
      assertNotNull(simpleRegion0);
      assertEquals("Failed to delete ", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      assertEquals("Failed to delete ", jSSourceFile0.getName());
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "z>_";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("z>_", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("z>_", sourceFile_OnDisk0.getName());
      
      int int0 = (-2528);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/z>_");
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      String string1 = sourceFile_OnDisk0.getLine(int0);
      assertNull(string1);
      assertEquals("z>_", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("z>_", sourceFile_OnDisk0.getName());
      
      StringReader stringReader0 = (StringReader)sourceFile_OnDisk0.getCodeReader();
      assertNotNull(stringReader0);
      assertEquals(true, stringReader0.markSupported());
      assertEquals(true, stringReader0.ready());
      assertEquals("z>_", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("z>_", sourceFile_OnDisk0.getName());
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "Invalid size: %s";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
      
      String string1 = sourceFile_Preloaded0.getOriginalPath();
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("Invalid size: %s", string1);
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      
      String string0 = "ISOh8S59-1";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, charset0);
      assertNotNull(jSSourceFile0);
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getName());
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getOriginalPath());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      
      String string1 = jSSourceFile0.getOriginalPath();
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("ISOh8S59-1/ISOh8S59-1", string1);
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getName());
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getOriginalPath());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "Invalid size: %s";
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream(string0);
      assertNotNull(stringBufferInputStream0);
      assertEquals(16, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromInputStream(string0, (InputStream) stringBufferInputStream0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals(0, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = ";eo-B(GzV)G])s,d";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(string0);
      assertNotNull(jSSourceFile0);
      assertEquals(";eo-B(GzV)G])s,d", jSSourceFile0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d", jSSourceFile0.getName());
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "Invalid size: %s";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
      
      int int0 = 1454;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertNull(string1);
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
      
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream(string0);
      assertNotNull(stringBufferInputStream0);
      assertEquals(false, stringBufferInputStream0.markSupported());
      assertEquals(16, stringBufferInputStream0.available());
      
      SourceFile.Preloaded sourceFile_Preloaded1 = (SourceFile.Preloaded)SourceFile.fromInputStream(string0, string1, (InputStream) stringBufferInputStream0);
      assertFalse(sourceFile_Preloaded1.equals((Object)sourceFile_Preloaded0));
      assertFalse(sourceFile_Preloaded0.equals((Object)sourceFile_Preloaded1));
      assertNotNull(sourceFile_Preloaded1);
      assertNotSame(sourceFile_Preloaded1, sourceFile_Preloaded0);
      assertNotSame(sourceFile_Preloaded0, sourceFile_Preloaded1);
      assertEquals("Invalid size: %s", sourceFile_Preloaded1.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded1.getOriginalPath());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getName());
      assertEquals("Invalid size: %s", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, stringBufferInputStream0.markSupported());
      assertEquals(0, stringBufferInputStream0.available());
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "Failed to delete ";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      assertEquals("Failed to delete ", jSSourceFile0.getName());
      
      jSSourceFile0.clearCachedSource();
      assertEquals("Failed to delete ", jSSourceFile0.getOriginalPath());
      assertEquals("Failed to delete ", jSSourceFile0.getName());
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "N1V9QYb j2]T*Z";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("N1V9QYb j2]T*Z", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("N1V9QYb j2]T*Z", sourceFile_Preloaded0.getName());
      
      String string1 = sourceFile_Preloaded0.getCodeNoCache();
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("N1V9QYb j2]T*Z", string1);
      assertEquals("N1V9QYb j2]T*Z", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("N1V9QYb j2]T*Z", sourceFile_Preloaded0.getName());
  }

  @Test
  public void test12()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      
      String string0 = "ISOh8S59-1";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, charset0);
      assertNotNull(jSSourceFile0);
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getName());
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getOriginalPath());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      
      jSSourceFile0.clearCachedSource();
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getName());
      assertEquals("ISOh8S59-1/ISOh8S59-1", jSSourceFile0.getOriginalPath());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = ";eo-B(GzV)G])s,d";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      MockFile mockFile1 = (MockFile)MockFile.createTempFile(string0, string0, (File) mockFile0);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(mockFile1);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertNotNull(sourceFile_OnDisk0);
      assertNotSame(mockFile0, mockFile1);
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getName());
      
      Charset charset0 = sourceFile_OnDisk0.getCharset();
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertNotNull(charset0);
      assertNotSame(mockFile0, mockFile1);
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getName());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile1, charset0);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(jSSourceFile0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getOriginalPath());
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getName());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getName());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      
      StringReader stringReader0 = (StringReader)jSSourceFile0.getCodeReader();
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(stringReader0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getOriginalPath());
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getName());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getName());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromReader(string0, (Reader) stringReader0);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(sourceFile_Preloaded0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, mockFile0);
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getOriginalPath());
      assertEquals("/scratch/ac1gf/Closure/100/1/run_evosuite.pl_106661_1418336745/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d0;eo-B(GzV)G])s,d", jSSourceFile0.getName());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(";eo-B(GzV)G])s,d/;eo-B(GzV)G])s,d", sourceFile_OnDisk0.getName());
      assertEquals(";eo-B(GzV)G])s,d", sourceFile_Preloaded0.getName());
      assertEquals(";eo-B(GzV)G])s,d", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
  }
}
