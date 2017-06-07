/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:35:15 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockNullPointerException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ClassUtilsEvoSuite_branch_Test extends ClassUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "[d\"q@mxbh6N7\"";
      // Undeclared exception!
      try {
        String string1 = ClassUtils.getPackageCanonicalName(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "[L";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertEquals("", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Integer> class0 = null;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "[";
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string1 = ClassUtils.getPackageCanonicalName((Object) class1, string0);
      assertEquals("[", string1);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "|5";
      double double0 = (-1437.45328234);
      Double double1 = new Double(double0);
      assertEquals((-1437.45328234), (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      String string1 = ClassUtils.getPackageCanonicalName((Object) double1, string0);
      assertEquals("java.lang", string1);
      assertFalse(string0.equals((Object)string1));
      assertTrue(double1.equals((Object)double0));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test05()  throws Throwable  {
      Class<Object> class0 = null;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test06()  throws Throwable  {
      Object object0 = null;
      String string0 = "#1";
      String string1 = ClassUtils.getShortCanonicalName(object0, string0);
      assertEquals("#1", string1);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "boolean";
      Class<Boolean> class0 = Boolean.TYPE;
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertNotNull(class0);
      
      String string1 = ClassUtils.getShortCanonicalName((Object) class0, string0);
      assertEquals("Class", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      assertEquals(false, classArray0[0].isPrimitive());
      assertEquals(false, classArray0[0].isInterface());
      assertEquals(false, classArray0[0].isArray());
      assertEquals(false, classArray0[0].isSynthetic());
      assertEquals(17, classArray0[0].getModifiers());
      assertEquals("class java.lang.Double", classArray0[0].toString());
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals(false, classArray0[0].isEnum());
      assertNotNull(classArray0[0]);
      
      Class<?>[] classArray1 = ClassUtils.toClass((Object[]) classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test09()  throws Throwable  {
      Class<Double>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.toClass((Object[]) classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "long[]";
      boolean boolean0 = true;
      Class<?> class0 = ClassUtils.getClass(string0, boolean0);
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(1041, class0.getModifiers());
      assertEquals("class [J", class0.toString());
      assertEquals(false, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isArray());
      assertEquals(false, class0.isEnum());
      assertNotNull(class0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try {
        Class<?> class0 = ClassUtils.getClass(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<Double> class0 = null;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Class<Short>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test14()  throws Throwable  {
      Class<Float>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test15()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<Double> class0 = Double.class;
      classArray0[0] = class0;
      assertEquals(false, classArray0[0].isEnum());
      assertEquals(false, classArray0[0].isArray());
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals(false, classArray0[0].isSynthetic());
      assertEquals(17, classArray0[0].getModifiers());
      assertEquals(false, classArray0[0].isInterface());
      assertEquals("class java.lang.Double", classArray0[0].toString());
      assertEquals(false, classArray0[0].isPrimitive());
      assertNotNull(classArray0[0]);
      
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test16()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test17()  throws Throwable  {
      boolean boolean0 = true;
      String string0 = "boolean";
      Class<?> class0 = ClassUtils.getClass(string0);
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
      assertNotNull(class0);
      
      Class<Long> class1 = Long.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
  }

  @Test
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
      
      Class<Double> class1 = Double.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      String string0 = "double";
      Class<?> class2 = ClassUtils.getClass(classLoader0, string0, boolean0);
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isInterface());
      assertEquals(1041, class2.getModifiers());
      assertEquals(true, class2.isPrimitive());
      assertEquals("double", class2.toString());
      assertEquals(false, class2.isArray());
      assertNotNull(class2);
      
      boolean boolean1 = ClassUtils.isAssignable(class2, class1);
      assertFalse(boolean1);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isInterface());
      assertEquals(1041, class2.getModifiers());
      assertEquals(true, class2.isPrimitive());
      assertEquals("double", class2.toString());
      assertEquals(false, class2.isArray());
  }

  @Test
  public void test19()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isSynthetic());
      assertEquals("int", class0.toString());
      assertEquals(false, class0.isArray());
      assertNotNull(class0);
      
      boolean boolean0 = true;
      Class<Object> class1 = Object.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isSynthetic());
      assertEquals("int", class0.toString());
      assertEquals(false, class0.isArray());
  }

  @Test
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertEquals("int", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertNotNull(class0);
      
      Class<Short> class1 = Short.class;
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class0, class1, boolean0);
      assertFalse(boolean1);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertEquals("int", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
  }

  @Test
  public void test21()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 7);
      Class<Float> class0 = Float.class;
      classArray0[0] = class0;
      assertEquals(false, classArray0[0].isSynthetic());
      assertEquals("class java.lang.Float", classArray0[0].toString());
      assertEquals(false, classArray0[0].isArray());
      assertEquals(false, classArray0[0].isEnum());
      assertEquals(17, classArray0[0].getModifiers());
      assertEquals(false, classArray0[0].isPrimitive());
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals(false, classArray0[0].isInterface());
      assertNotNull(classArray0[0]);
      
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class1);
      assertTrue(boolean0);
      
      boolean boolean1 = ClassUtils.isAssignable(classArray1, classArray1, boolean0);
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
  }

  @Test
  public void test22()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals(false, classArray0[0].isArray());
      assertEquals("class java.lang.String", classArray0[0].toString());
      assertEquals(false, classArray0[0].isEnum());
      assertEquals(false, classArray0[0].isInterface());
      assertEquals(17, classArray0[0].getModifiers());
      assertEquals(false, classArray0[0].isPrimitive());
      assertEquals(false, classArray0[0].isSynthetic());
      assertNotNull(classArray0[0]);
      
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      Class<Short>[] classArray0 = null;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertTrue(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 8);
      Class<Byte>[] classArray1 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = false;
      boolean boolean1 = ClassUtils.isAssignable(classArray0, classArray1, boolean0);
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
  }

  @Test
  public void test25()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = "";
      linkedList0.addFirst(string0);
      assertEquals(1, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) linkedList0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals(1, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(list0);
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals(1, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertEquals(false, list1.isEmpty());
      assertEquals(1, list1.size());
      assertNotNull(list1);
  }

  @Test
  public void test26()  throws Throwable  {
      List<String> list0 = null;
      List<Class<?>> list1 = ClassUtils.convertClassNamesToClasses(list0);
      assertNull(list1);
      
      List<String> list2 = ClassUtils.convertClassesToClassNames(list1);
      assertNull(list2);
  }

  @Test
  public void test27()  throws Throwable  {
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertNotNull(list0);
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertEquals(false, list1.isEmpty());
      assertEquals(2, list1.size());
      assertNotNull(list1);
  }

  @Test
  public void test28()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 9);
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(classArray0[1]);
      assertNull(list0);
  }

  @Test
  public void test29()  throws Throwable  {
      Class<Double> class0 = null;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNull(list0);
  }

  @Test
  public void test30()  throws Throwable  {
      Class<Short> class0 = Short.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = "[L";
      String string1 = ClassUtils.getShortClassName(string0);
      assertEquals("L[]", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = ClassUtils.getPackageName(string1);
      assertEquals("", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertNotNull(string2);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = "L@5[4bZqV!b;";
      String string1 = ClassUtils.getPackageName(string0);
      assertEquals("", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = "[";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertEquals("", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getPackageName(string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test35()  throws Throwable  {
      Class<Integer> class0 = null;
      String string0 = ClassUtils.getPackageName(class0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test36()  throws Throwable  {
      Object object0 = null;
      String string0 = "-MH'-bFt=rI";
      String string1 = ClassUtils.getPackageName(object0, string0);
      assertEquals("-MH'-bFt=rI", string1);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "";
      Object object0 = new Object();
      assertNotNull(object0);
      
      String string1 = ClassUtils.getPackageName(object0, string0);
      assertEquals("java.lang", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "org.a|ache.commons.lang.builder.ToStrinnStyle$NoFieldNameToStingStyle";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertEquals("ToStrinnStyle.NoFieldNameToStingStyle", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = "J";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertEquals("long", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = "[L;";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertEquals("][]", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test41()  throws Throwable  {
      String string0 = "[L;";
      String string1 = ClassUtils.getShortClassName(string0);
      assertEquals("[]", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = "";
      String string1 = ClassUtils.getPackageName(string0);
      assertEquals("", string1);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      
      String string2 = ClassUtils.getShortCanonicalName(string1);
      assertEquals("", string2);
      assertNotNull(string2);
      assertSame(string1, string0);
      assertSame(string1, string2);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string0, string2);
      assertSame(string0, string1);
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test44()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string0 = ClassUtils.getShortClassName(class1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test45()  throws Throwable  {
      Object object0 = null;
      String string0 = "-MH'-bFt=rI";
      String string1 = ClassUtils.getShortClassName(object0, string0);
      assertEquals("-MH'-bFt=rI", string1);
      assertNotNull(string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test46()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      String string0 = "]#p?[]";
      String string1 = ClassUtils.getShortClassName(object0, string0);
      assertEquals("Object", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test47()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
      assertNotNull(string0);
  }

  @Test
  public void test48()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      String string0 = "Minimum abbreviation width is 4";
      String string1 = ClassUtils.getPackageName(string0);
      assertEquals("", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      try {
        Class<?> class0 = ClassUtils.getClass(classLoader0, string1);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // 
         //
      }
  }

  @Test
  public void test49()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertNotNull(classUtils0);
  }

  @Test
  public void test50()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      assertEquals(1041, class0.getModifiers());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertNotNull(class0);
      
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("boolean", string0);
      assertEquals(1041, class0.getModifiers());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertNotNull(string0);
  }

  @Test
  public void test51()  throws Throwable  {
      String string0 = "|5[]";
      try {
        Class<?> class0 = ClassUtils.getClass(string0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // Class '|5.class' should be in target project, but could not be found!
         //
      }
  }

  @Test
  public void test52()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isArray());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isSynthetic());
      assertNotNull(class0);
      
      Class<Double> class1 = Double.class;
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertFalse(boolean1);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isArray());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isSynthetic());
  }
}
