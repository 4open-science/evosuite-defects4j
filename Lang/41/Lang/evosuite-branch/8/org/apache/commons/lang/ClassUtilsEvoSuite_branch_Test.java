/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:06:16 GMT 2014
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
      String string0 = "[Lj<v:va.lang.C!3-s";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("j<v:va.lang", string1);
      assertNotNull(string1);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
      String string0 = ClassUtils.getPackageCanonicalName(classArray0[0]);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getPackageCanonicalName((Object) string0, string0);
      assertNull(string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "KZD}[SI`";
      String string1 = ClassUtils.getPackageCanonicalName((Object) string0, string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("java.lang", string1);
      assertNotNull(string1);
  }

  @Test
  public void test04()  throws Throwable  {
      Class<Character> class0 = Character.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Character", string0);
      assertNotNull(string0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertEquals("", string1);
      assertNotNull(string1);
      
      String string2 = ClassUtils.getShortClassName((Object) string0, string0);
      assertNull(string2);
      
      String string3 = ClassUtils.getShortCanonicalName((Object) string2, string1);
      assertSame(string1, string3);
      assertSame(string3, string1);
      assertEquals("", string3);
      assertNotNull(string3);
  }

  @Test
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      assertNotNull(object0);
      
      objectArray0[0] = object0;
      assertNotNull(objectArray0[0]);
      
      objectArray0[1] = object0;
      assertNotNull(objectArray0[1]);
      
      objectArray0[2] = object0;
      assertNotNull(objectArray0[2]);
      
      objectArray0[3] = objectArray0[0];
      assertNotNull(objectArray0[3]);
      
      objectArray0[4] = objectArray0[3];
      assertNotNull(objectArray0[4]);
      
      objectArray0[5] = objectArray0[2];
      assertNotNull(objectArray0[5]);
      
      objectArray0[6] = objectArray0[4];
      assertNotNull(objectArray0[6]);
      
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNotNull(classArray0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "[]";
      boolean boolean0 = true;
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
  public void test08()  throws Throwable  {
      String string0 = "[CK\\R.63R";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("char[]", string1);
      assertNotNull(string1);
      
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      Class<?> class0 = ClassUtils.getClass(classLoader0, string1);
      assertEquals(true, class0.isArray());
      assertEquals(1041, class0.getModifiers());
      assertEquals("class [C", class0.toString());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isPrimitive());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(class0);
  }

  @Test
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = "Can't find a public method for ";
      boolean boolean0 = linkedList0.add(string0);
      assertEquals(1, linkedList0.size());
      assertEquals("[Can't find a public method for ]", linkedList0.toString());
      assertTrue(boolean0);
      
      try {
        Class<?> class0 = ClassUtils.getClass(string0, boolean0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
         //
         // Class 'Can'tfindapublicmethodfor.class' should be in target project, but could not be found!
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = true;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      String string0 = null;
      // Undeclared exception!
      try {
        Class<?> class0 = ClassUtils.getClass(classLoader0, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      boolean boolean0 = ClassUtils.isInnerClass(classArray0[3]);
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      Class<String>[] classArray0 = null;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNull(classArray1);
  }

  @Test
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertEquals(false, class1.isInterface());
      assertEquals("class java.lang.Integer", class1.toString());
      assertEquals(17, class1.getModifiers());
      assertEquals(false, class1.isSynthetic());
      assertEquals(false, class1.isPrimitive());
      assertEquals(false, class1.isAnnotation());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isArray());
      assertNotNull(class1);
  }

  @Test
  public void test14()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNotNull(classArray1);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "char";
      boolean boolean0 = true;
      Class<?> class0 = ClassUtils.getClass(string0, boolean0);
      assertEquals(false, class0.isEnum());
      assertEquals("char", class0.toString());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertNotNull(class0);
      
      Class<Short> class1 = Short.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertEquals(false, class0.isEnum());
      assertEquals("char", class0.toString());
      assertEquals(true, class0.isPrimitive());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test16()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = true;
      Class<?> class2 = ClassUtils.wrapperToPrimitive(class1);
      assertEquals(false, class2.isSynthetic());
      assertEquals("byte", class2.toString());
      assertEquals(true, class2.isPrimitive());
      assertEquals(false, class2.isArray());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(1041, class2.getModifiers());
      assertNotNull(class2);
      
      boolean boolean1 = ClassUtils.isAssignable(class0, class2, boolean0);
      assertEquals(false, class2.isSynthetic());
      assertEquals("byte", class2.toString());
      assertEquals(true, class2.isPrimitive());
      assertEquals(false, class2.isArray());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(1041, class2.getModifiers());
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test17()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Class<Boolean> class1 = Boolean.TYPE;
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isEnum());
      assertEquals(true, class1.isPrimitive());
      assertEquals("boolean", class1.toString());
      assertEquals(1041, class1.getModifiers());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isAnnotation());
      assertEquals(false, class1.isSynthetic());
      assertNotNull(class1);
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class0, class1, boolean0);
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isEnum());
      assertEquals(true, class1.isPrimitive());
      assertEquals("boolean", class1.toString());
      assertEquals(1041, class1.getModifiers());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isAnnotation());
      assertEquals(false, class1.isSynthetic());
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "char";
      boolean boolean0 = true;
      Class<?> class0 = ClassUtils.getClass(string0, boolean0);
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isSynthetic());
      assertEquals(1041, class0.getModifiers());
      assertEquals("char", class0.toString());
      assertNotNull(class0);
      
      Class<Integer> class1 = Integer.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isSynthetic());
      assertEquals(1041, class0.getModifiers());
      assertEquals("char", class0.toString());
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test19()  throws Throwable  {
      boolean boolean0 = true;
      Class<Character> class0 = Character.class;
      Class<Short> class1 = Short.class;
      boolean boolean1 = ClassUtils.isAssignable(class0, class1, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test20()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = true;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isSynthetic());
      assertEquals("byte", class1.toString());
      assertEquals(false, class1.isAnnotation());
      assertEquals(1041, class1.getModifiers());
      assertEquals(false, class1.isEnum());
      assertEquals(true, class1.isPrimitive());
      assertEquals(false, class1.isInterface());
      assertNotNull(class1);
      
      Class<ClassUtils> class2 = ClassUtils.class;
      boolean boolean1 = ClassUtils.isAssignable(class2, class1, boolean0);
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isSynthetic());
      assertEquals("byte", class1.toString());
      assertEquals(false, class1.isAnnotation());
      assertEquals(1041, class1.getModifiers());
      assertEquals(false, class1.isEnum());
      assertEquals(true, class1.isPrimitive());
      assertEquals(false, class1.isInterface());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      assertNotNull(classLoader0);
      
      String string0 = "char";
      Class<?> class0 = ClassUtils.getClass(classLoader0, string0);
      assertEquals(false, class0.isInterface());
      assertEquals(1041, class0.getModifiers());
      assertEquals("char", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertNotNull(class0);
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(class0, class0, boolean0);
      assertEquals(false, class0.isInterface());
      assertEquals(1041, class0.getModifiers());
      assertEquals("char", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1);
  }

  @Test
  public void test22()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      assertEquals(false, classArray0[0].isEnum());
      assertEquals(false, classArray0[0].isSynthetic());
      assertEquals(false, classArray0[0].isAnnotation());
      assertEquals("class java.lang.Integer", classArray0[0].toString());
      assertEquals(false, classArray0[0].isPrimitive());
      assertEquals(17, classArray0[0].getModifiers());
      assertEquals(false, classArray0[0].isInterface());
      assertEquals(false, classArray0[0].isArray());
      assertNotNull(classArray0[0]);
      
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = true;
      boolean boolean1 = ClassUtils.isAssignable(classArray1, classArray0, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = "long";
      Class<?> class0 = ClassUtils.getClass(string0);
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isAnnotation());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertNotNull(class0);
      
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isAnnotation());
      assertEquals("long", class0.toString());
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isEnum());
      assertEquals(false, class0.isInterface());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isSynthetic());
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
      
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test25()  throws Throwable  {
      Object[] objectArray0 = null;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNull(classArray0);
      
      boolean boolean0 = false;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNull(classArray1);
      
      Class<?>[] classArray2 = null;
      boolean boolean1 = ClassUtils.isAssignable(classArray2, classArray1, boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test26()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
      
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 9);
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 16);
      boolean boolean1 = ClassUtils.isAssignable(classArray0, classArray1, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test27()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertNotNull(list0);
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertEquals(2, list1.size());
      assertEquals(false, list1.isEmpty());
      assertNotNull(list1);
  }

  @Test
  public void test28()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = "Can't find a public method for ";
      boolean boolean0 = linkedList0.add(string0);
      assertEquals(1, linkedList0.size());
      assertEquals("[Can't find a public method for ]", linkedList0.toString());
      assertTrue(boolean0);
      
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) linkedList0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals(1, linkedList0.size());
      assertEquals("[Can't find a public method for ]", linkedList0.toString());
      assertNotNull(list0);
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals(1, list1.size());
      assertEquals(false, list1.isEmpty());
      assertEquals(1, linkedList0.size());
      assertEquals("[Can't find a public method for ]", linkedList0.toString());
      assertNotNull(list1);
  }

  @Test
  public void test29()  throws Throwable  {
      Class<ClassUtils> class0 = null;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertNull(list0);
      
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertNull(list1);
  }

  @Test
  public void test30()  throws Throwable  {
      List<String> list0 = null;
      List<Class<?>> list1 = ClassUtils.convertClassNamesToClasses(list0);
      assertNull(list1);
  }

  @Test
  public void test31()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test32()  throws Throwable  {
      Class<Character> class0 = null;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNull(list0);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = "Lj<vava.lang.Cl3_ass;";
      String string1 = ClassUtils.getPackageName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("j<vava.lang", string1);
      assertNotNull(string1);
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = "L";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = "[";
      String string1 = ClassUtils.getPackageCanonicalName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "";
      String string1 = ClassUtils.getPackageName(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = null;
      String string1 = ClassUtils.getPackageName(string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test38()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string0 = ClassUtils.getPackageName(class1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = "KZD}[SI`";
      Object object0 = null;
      String string1 = ClassUtils.getPackageName(object0, string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("KZD}[SI`", string1);
      assertNotNull(string1);
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = "char";
      String string1 = ClassUtils.getPackageName((Object) string0, string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("java.lang", string1);
      assertNotNull(string1);
  }

  @Test
  public void test41()  throws Throwable  {
      String string0 = "qgy\"Dtiy%:2$RC64!";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("qgy\"Dtiy%:2.RC64!", string1);
      assertNotNull(string1);
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = "F";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("float", string1);
      assertNotNull(string1);
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = "[Lj<vava.lang.Clss";
      String string1 = ClassUtils.getShortClassName(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("Clss[]", string1);
      assertNotNull(string1);
  }

  @Test
  public void test44()  throws Throwable  {
      String string0 = "[";
      String string1 = ClassUtils.getShortCanonicalName(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("][]", string1);
      assertNotNull(string1);
  }

  @Test
  public void test45()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
      
      String string0 = ClassUtils.getShortCanonicalName(class1);
      assertEquals("", string0);
      assertNotNull(string0);
      
      String string1 = ClassUtils.getShortClassName(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test
  public void test46()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
      String string0 = ClassUtils.getShortClassName(classArray0[0]);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test47()  throws Throwable  {
      String string0 = null;
      double double0 = 0.0;
      Double double1 = new Double(double0);
      assertTrue(double1.equals((Object)double0));
      assertEquals(0.0, (double)double1, 0.01D);
      
      String string1 = ClassUtils.getShortClassName((Object) double1, string0);
      assertTrue(double1.equals((Object)double0));
      assertEquals("Double", string1);
      assertNotNull(string1);
  }

  @Test
  public void test48()  throws Throwable  {
      String string0 = "char";
      boolean boolean0 = true;
      Class<?> class0 = ClassUtils.getClass(string0, boolean0);
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("char", class0.toString());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isAnnotation());
      assertNotNull(class0);
      
      Class<Double> class1 = null;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0);
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isArray());
      assertEquals("char", class0.toString());
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isAnnotation());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test49()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertNotNull(class0);
      
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals(1041, class0.getModifiers());
      assertEquals(false, class0.isAnnotation());
      assertEquals(false, class0.isSynthetic());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isInterface());
      assertEquals(false, class0.isArray());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test50()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertNotNull(classUtils0);
  }

  @Test
  public void test51()  throws Throwable  {
      long long0 = (-819L);
      Long long1 = new Long(long0);
      assertTrue(long1.equals((Object)long0));
      assertEquals((-819L), (long)long1);
      
      String string0 = "Gh[XREv";
      String string1 = ClassUtils.getShortCanonicalName((Object) long1, string0);
      assertTrue(long1.equals((Object)long0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("Long", string1);
      assertNotNull(string1);
  }

  @Test
  public void test52()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isInterface());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertNotNull(class0);
      
      boolean boolean0 = true;
      Class<Long> class1 = Long.class;
      boolean boolean1 = ClassUtils.isAssignable(class1, class0, boolean0);
      assertEquals(false, class0.isSynthetic());
      assertEquals(false, class0.isArray());
      assertEquals(false, class0.isInterface());
      assertEquals("boolean", class0.toString());
      assertEquals(false, class0.isAnnotation());
      assertEquals(true, class0.isPrimitive());
      assertEquals(false, class0.isEnum());
      assertEquals(1041, class0.getModifiers());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }
}
