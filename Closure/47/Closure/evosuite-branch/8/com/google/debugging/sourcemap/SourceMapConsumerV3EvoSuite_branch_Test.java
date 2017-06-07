/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:59:35 GMT 2014
 */

package com.google.debugging.sourcemap;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.debugging.sourcemap.SourceMapConsumerV3;
import com.google.debugging.sourcemap.SourceMapParseException;
import com.google.debugging.sourcemap.proto.Mapping;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.json.JSONObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SourceMapConsumerV3EvoSuite_branch_Test extends SourceMapConsumerV3EvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      String string0 = "7}vB~8yDE-";
      int int0 = (-4128);
      // Undeclared exception!
      try {
        Collection<Mapping.OriginalMapping> collection0 = sourceMapConsumerV3_0.getReverseMapping(string0, int0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      int int0 = 3;
      // Undeclared exception!
      try {
        Mapping.OriginalMapping mapping_OriginalMapping0 = sourceMapConsumerV3_0.getMappingForLine(int0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      int int0 = (-4128);
      Mapping.OriginalMapping mapping_OriginalMapping0 = sourceMapConsumerV3_0.getMappingForLine(int0, int0);
      assertNull(mapping_OriginalMapping0);
  }

  @Test
  public void test3()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      String string0 = null;
      // Undeclared exception!
      try {
        sourceMapConsumerV3_0.parse(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      boolean boolean0 = true;
      JSONObject jSONObject0 = new JSONObject((Object) byteArray0, boolean0);
      assertNotNull(jSONObject0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, jSONObject0.length());
      
      try {
        sourceMapConsumerV3_0.parse(jSONObject0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // JSON parse exception: org.evosuite.runtime.mock.java.lang.MockThrowable: JSONObject[\"version\"] not found.
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      assertNotNull(sourceMapConsumerV3_0);
      
      // Undeclared exception!
      try {
        Collection<String> collection0 = sourceMapConsumerV3_0.getOriginalSources();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SourceMapConsumerV3.DefaultSourceMapSupplier sourceMapConsumerV3_DefaultSourceMapSupplier0 = new SourceMapConsumerV3.DefaultSourceMapSupplier();
      assertNotNull(sourceMapConsumerV3_DefaultSourceMapSupplier0);
      
      String string0 = ",e ,2_RZ%";
      String string1 = sourceMapConsumerV3_DefaultSourceMapSupplier0.getSourceMap(string0);
      assertNull(string1);
  }
}
