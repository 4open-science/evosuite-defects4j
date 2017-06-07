/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:46:24 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeGeneratorEvoSuite_branch_Test extends CodeGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "{DJh~CCH]->@";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/{DJh~CCH]->@/", string1);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string2);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertSame(string1, string2);
      assertEquals("/{DJh~CCH]->@/", string2);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "\n google/proobM/descriptor.p-oto\u0012\u000Fgoogle.protobuf\"G\n\u0011FilDescriptorSet\u00122\n\u0004file\u0018\u0001\u0003(\u000B2$.gog-e.protobuf.FileDescriptor;roto\"\u00DC\u0002\n\u0013FileDescriporProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000F\n\u0007packae\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u00126\n\fmessage_tye\u0018\u0004 \u0003(\u000B2 .google.potobuf.DescriptorProto\u00127\n\teoum_type\u0018\u0005 \u0003(\u000B2$.google.protobuf.EnumDescriptorProto\u0012\n\u0007service\u0018\u0006 \u0003(\u000B2'.google.protobuf.ServiceDescriptorProto\u00128\n\textension\u0018\u0007 (\u000B2%.google.p";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\\u000a google/pro\\u007fobM/descriptor.p-oto\\u0012\\u000fgoogle.protobuf\"G\\u000a\\u0011FilDescriptorSet\\u00122\\u000a\\u0004file\\u0018\\u0001\\u0003(\\u000b2$.gog-e.protobuf.FileDescriptor;roto\"\\u00dc\\u0002\\u000a\\u0013FileDescriporProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u0012\\u000f\\u000a\\u0007packae\\u0018\\u0002 \\u0001(\\u0009\\u0012\\u0012\\u000a\\u000adependency\\u0018\\u0003 \\u0003(\\u0009\\u00126\\u000a\\u000cmessage_tye\\u0018\\u0004 \\u0003(\\u000b2 .google.potobuf.DescriptorProto\\u00127\\u000a\\u0009eoum_type\\u0018\\u0005 \\u0003(\\u000b2$.google.protobuf.EnumDescriptorProto\\u0012\\u000a\\u0007service\\u0018\\u0006 \\u0003(\\u000b2'.google.protobuf.ServiceDescriptorProto\\u00128\\u000a\\u0009extension\\u0018\\u0007 (\\u000b2%.google.p", string1);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "h`^ug2X </script#8c";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"h`^ug2X <\\/script#8c\"", string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "N0LMCT-->tuF!x}}A--n";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/N0LMCT--\\>tuF!x}}A--n/", string1);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "%>is:y`UXQUn\\\\#n -[";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/%>is:y`UXQUn\\\\#n -[/", string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "k9g <!--rit2#:c";
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charset0);
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charsetEncoder0);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/k9g <\\!--rit2#:c/", string1);
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertNotNull(string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals("//k9g <\\!--rit2#:c//", string2);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "\t\n\u000B4r\r\u00857\u1680X\u205F+";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"\\t\\n\\u000b4r\\r\\u00857\\u1680X\\u205f+\"", string1);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "finally";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "k9g <!--rit2#:c";
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charset0);
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charsetEncoder0);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/k9g <\\!--rit2#:c/", string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "1";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "HoDu1nRvy]>@";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/HoDu1nRvy]>@/", string1);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "\n google/protobuf/descriptor.proto\u0012\u000Fgoogl0.protobuf\"G\n\u0011FileDescriptorSet\u00122\u0004file\u0018\u0001 \u0003(\u000B2$.google.protobuf.FileDescriptorProto\"\u00DC\u0002\n\u0013FileDescriptorPrxto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000F\n\u0007package\u0018 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000B2 .google.protobuf.Descrip;orProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000B2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000B2'.google.protobuf.ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000B2%.google.p";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"\\n google/protobuf/descriptor.proto\\u0012\\u000fgoogl0.protobuf\\\"G\\n\\u0011FileDescriptorSet\\u00122\\u0004file\\u0018\\u0001 \\u0003(\\u000b2$.google.protobuf.FileDescriptorProto\\\"\\u00dc\\u0002\\n\\u0013FileDescriptorPrxto\\u0012\\u000c\\n\\u0004name\\u0018\\u0001 \\u0001(\\t\\u0012\\u000f\\n\\u0007package\\u0018 \\u0001(\\t\\u0012\\u0012\\n\\ndependency\\u0018\\u0003 \\u0003(\\t\\u00126\\n\\u000cmessage_type\\u0018\\u0004 \\u0003(\\u000b2 .google.protobuf.Descrip;orProto\\u00127\\n\\tenum_type\\u0018\\u0005 \\u0003(\\u000b2$.google.protobuf.EnumDescriptorProto\\u00128\\n\\u0007service\\u0018\\u0006 \\u0003(\\u000b2'.google.protobuf.ServiceDescriptorProto\\u00128\\n\\textension\\u0018\\u0007 \\u0003(\\u000b2%.google.p\"", string1);
  }
}
