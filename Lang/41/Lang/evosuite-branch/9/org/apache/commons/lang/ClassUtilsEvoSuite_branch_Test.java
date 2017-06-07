/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:16:38 GMT 2014
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
      String string0 = "[[LMsB";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string0 = ClassUtils.getPackageCanonicalName(class1);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Character> class0 = Character.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertNotNull(string0);
      assertEquals("java.lang", string0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "[javalang.Integer";
      String string1 = null;
      String string2 = ClassUtils.getPackageCanonicalName((Object) string1, string0);
      assertNotNull(string2);
      assertEquals("[javalang.Integer", string2);
      assertSame(string2, string0);
      assertSame(string0, string2);
  }

  @Test
  public void test04()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      
      String string0 = "[Vs-";
      String string1 = ClassUtils.getPackageCanonicalName((Object) class0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("java.lang", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
  }

  @Test
  public void test05()  throws Throwable  {
      Class<Integer> class0 = null;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isInterface());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isSynthetic());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
      
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertNotNull(string0);
      assertEquals("long", string0);
      assertEquals(false, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isInterface());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isSynthetic());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
  }

  @Test
  public void test07()  throws Throwable  {
      List<String> list0 = null;
      String string0 = "java.lang.Character";
      String string1 = ClassUtils.getShortCanonicalName((Object) list0, string0);
      assertNotNull(string1);
      assertEquals("java.lang.Character", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      assertNotNull(objectArray0[0]);
      
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNotNull(classArray0);
  }

  @Test
  public void test09()  throws Throwable  {
      Object[] objectArray0 = null;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNull(classArray0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = false;
      String string0 = "[]";
      try {
        Class<?> class0 = ClassUtils.getClass(string0, boolean0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // [L;
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "[S";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("short[]", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      ClassLoader classLoader0 = null;
      Class<?> class0 = ClassUtils.getClass(classLoader0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(class0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isPrimitive());
      assertEquals(true, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isSynthetic());
      assertEquals("class [S", class0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = null;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      // Undeclared exception!
      try {
        Class<?> class0 = ClassUtils.getClass(classLoader0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      String string0 = "double";
      boolean boolean0 = false;
      Class<?> class0 = ClassUtils.getClass(classLoader0, string0, boolean0);
      assertNotNull(class0);
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isEnum());
      assertEquals("double", class0.toString());
      assertEquals(false, class0.isArray());
  }

  @Test
  public void test14()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isInnerClass(classArray0[0]);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      Class<Integer>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test17()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test18()  throws Throwable  {
      Class<?>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test19()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
      Class<Double> class0 = Double.class;
      classArray0[1] = class0;
      assertNotNull(classArray0[1]);
      assertEquals(false, classArray0[1].isSynthetic());
      assertEquals("class java.lang.Double", classArray0[1].toString());
      assertEquals(false, classArray0[1].isInterface());
      assertEquals(false, classArray0[1].isArray());
      assertEquals(false, classArray0[1].isAnnotation());
      assertEquals(false, classArray0[1].isPrimitive());
      assertEquals(false, classArray0[1].isEnum());
      assertEquals(17, classArray0[1].getModifiers());
      
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test20()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
      Class<Double> class0 = Double.class;
      classArray0[1] = class0;
      assertNotNull(classArray0[1]);
      assertEquals(false, classArray0[1].isArray());
      assertEquals(17, classArray0[1].getModifiers());
      assertEquals(false, classArray0[1].isAnnotation());
      assertEquals("class java.lang.Double", classArray0[1].toString());
      assertEquals(false, classArray0[1].isPrimitive());
      assertEquals(false, classArray0[1].isEnum());
      assertEquals(false, classArray0[1].isInterface());
      assertEquals(false, classArray0[1].isSynthetic());
      
      Class<Byte> class1 = Byte.class;
      Class<?> class2 = ClassUtils.wrapperToPrimitive(class1);
      assertNotNull(class2);
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isArray());
      assertEquals("byte", class2.toString());
      assertEquals(1041, class2.getModifiers());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(true, class2.isPrimitive());
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(classArray0[1], class2, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isArray());
      assertEquals("byte", class2.toString());
      assertEquals(1041, class2.getModifiers());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(true, class2.isPrimitive());
  }

  @Test
  public void test21()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      
      Class<Short> class1 = Short.class;
      boolean boolean0 = false;
      boolean boolean1 = ClassUtils.isAssignable(class0, class1, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
  }

  @Test
  public void test22()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
      
      Class<String> class1 = String.class;
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
  }

  @Test
  public void test23()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      
      Class<Short> class1 = Short.class;
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class0, class1, boolean0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
  }

  @Test
  public void test24()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isSynthetic());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      
      boolean boolean0 = true;
      Class<Short> class1 = Short.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isSynthetic());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
  }

  @Test
  public void test25()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
      Class<Double> class0 = Double.class;
      classArray0[1] = class0;
      assertNotNull(classArray0[1]);
      assertEquals(false, classArray0[1].isInterface());
      assertEquals(false, classArray0[1].isArray());
      assertEquals(false, classArray0[1].isSynthetic());
      assertEquals("class java.lang.Double", classArray0[1].toString());
      assertEquals(17, classArray0[1].getModifiers());
      assertEquals(false, classArray0[1].isPrimitive());
      assertEquals(false, classArray0[1].isEnum());
      assertEquals(false, classArray0[1].isAnnotation());
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(classArray0[0], classArray0[1], boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1);
  }

  @Test
  public void test26()  throws Throwable  {
      Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 8);
      Class<Byte> class0 = Byte.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNotNull(class1);
      assertEquals(true, class1.isPrimitive());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isSynthetic());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isAnnotation());
      assertEquals("byte", class1.toString());
      assertEquals(1041, class1.getModifiers());
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(classArray0[1], class1, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals(true, class1.isPrimitive());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isSynthetic());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isAnnotation());
      assertEquals("byte", class1.toString());
      assertEquals(1041, class1.getModifiers());
  }

  @Test
  public void test27()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      assertNotNull(class0);
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 6);
      boolean boolean0 = true;
      classArray0[0] = class0;
      assertNotNull(classArray0[0]);
      assertEquals(false, classArray0[0].isSynthetic());
      assertEquals(1041, classArray0[0].getModifiers());
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals(true, classArray0[0].isPrimitive());
      assertEquals(false, classArray0[0].isInterface());
      assertEquals("long", classArray0[0].toString());
      assertEquals(false, classArray0[0].isEnum());
      assertEquals(false, classArray0[0].isArray());
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("long", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      
      boolean boolean1 = ClassUtils.isAssignable(classArray0, classArray0, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test28()  throws Throwable  {
      Class<Integer>[] classArray0 = null;
      boolean boolean0 = false;
      boolean boolean1 = ClassUtils.isAssignable(classArray0, classArray0, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test29()  throws Throwable  {
      List<Class<?>> list0 = null;
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertNull(list1);
  }

  @Test
  public void test30()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertNotNull(list1);
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(false, list1.isEmpty());
      assertEquals(2, list1.size());
  }

  @Test
  public void test31()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      
      String string0 = "V3L]-^|N0nF'Y\\$:";
      boolean boolean0 = linkedList0.add(string0);
      assertTrue(boolean0);
      assertEquals("[V3L]-^|N0nF'Y\\$:]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) linkedList0);
      assertNotNull(list0);
      assertEquals("[V3L]-^|N0nF'Y\\$:]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
  }

  @Test
  public void test32()  throws Throwable  {
      List<String> list0 = null;
      List<Class<?>> list1 = ClassUtils.convertClassNamesToClasses(list0);
      assertNull(list1);
  }

  @Test
  public void test33()  throws Throwable  {
      Class<Byte> class0 = null;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertNull(list0);
  }

  @Test
  public void test34()  throws Throwable  {
      Class<Double> class0 = null;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNull(list0);
  }

  @Test
  public void test35()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "LMsB;";
      String string1 = ClassUtils.getPackageName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "[cusler.`home";
      String string1 = ClassUtils.getPackageName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("cusler", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "";
      String string1 = ClassUtils.getPackageName(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getPackageName(string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test40()  throws Throwable  {
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 8);
      String string0 = ClassUtils.getPackageName(classArray0[2]);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test41()  throws Throwable  {
      Object object0 = null;
      String string0 = "[bYSYNFy6%Ni93DabR1";
      String string1 = ClassUtils.getPackageName(object0, string0);
      assertNotNull(string1);
      assertEquals("[bYSYNFy6%Ni93DabR1", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test42()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = "6";
      String string1 = ClassUtils.getPackageName((Object) class0, string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("java.lang", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = "Z";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("boolean", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test44()  throws Throwable  {
      String string0 = "[Ls;";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("s[]", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test45()  throws Throwable  {
      String string0 = "[";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("][]", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test46()  throws Throwable  {
      String string0 = "[L8Z>";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("L8Z>[]", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test47()  throws Throwable  {
      String string0 = "";
      String string1 = ClassUtils.getShortClassName(string0);
      assertNotNull(string1);
      assertEquals("", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test48()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test49()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string0 = ClassUtils.getShortClassName(class1);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test50()  throws Throwable  {
      String string0 = "c@,3";
      Object object0 = null;
      String string1 = ClassUtils.getShortClassName(object0, string0);
      assertNotNull(string1);
      assertEquals("c@,3", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
  }

  @Test
  public void test51()  throws Throwable  {
      Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 1);
      Class<Long>[] classArray1 = (Class<Long>[]) Array.newInstance(Class.class, 8);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
      assertFalse(boolean0);
  }

  @Test
  public void test52()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Double> class1 = Double.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test
  public void test53()  throws Throwable  {
      String string0 = "user.home";
      long long0 = (-1327L);
      Long long1 = new Long(long0);
      assertTrue(long1.equals((Object)long0));
      assertEquals((-1327L), (long)long1);
      
      String string1 = ClassUtils.getShortCanonicalName((Object) long1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertTrue(long1.equals((Object)long0));
      assertNotNull(string1);
      assertEquals("Long", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = ClassUtils.getPackageCanonicalName(string1);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertTrue(long1.equals((Object)long0));
      assertNotNull(string2);
      assertEquals("", string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
  }

  @Test
  public void test54()  throws Throwable  {
      String string0 = "V3L]-^|N0nF'Y\\$:";
      String string1 = ClassUtils.getShortClassName((Object) string0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("String", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      ClassLoader classLoader0 = null;
      try {
        Class<?> class0 = ClassUtils.getClass(classLoader0, string1);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // String
         //
      }
  }

  @Test
  public void test55()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertNotNull(classUtils0);
  }

  @Test
  public void test56()  throws Throwable  {
      String string0 = "V3L]-^|N0nF'Y\\$:";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("V3L]-^|N0nF'Y\\.:", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test57()  throws Throwable  {
      String string0 = "java.lang.Character";
      Class<?> class0 = ClassUtils.getClass(string0);
      assertNotNull(class0);
      assertEquals("class java.lang.Character", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isAnnotation());
      assertEquals(17, class0.getModifiers());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isPrimitive());
  }
}
