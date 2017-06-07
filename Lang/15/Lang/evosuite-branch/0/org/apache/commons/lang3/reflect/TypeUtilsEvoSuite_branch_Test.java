/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:37:15 GMT 2014
 */

package org.apache.commons.lang3.reflect;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypeUtilsEvoSuite_branch_Test extends TypeUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = TypeUtils.getArrayComponentType((Type) class0);
      assertNull(type0);
  }

  @Test
  public void test01()  throws Throwable  {
      Type type0 = null;
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
      
      boolean boolean0 = TypeUtils.isArrayType(type1);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.getRawType((Type) class0, (Type) class0);
      assertNotNull(class1);
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isPrimitive());
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isAnnotation());
      assertEquals("class java.lang.Object", class1.toString());
      assertEquals(1, class1.getModifiers());
      assertEquals(false, class1.isSynthetic());
      
      boolean boolean0 = TypeUtils.isArrayType((Type) class1);
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isPrimitive());
      assertEquals(false, class1.isInterface());
      assertEquals(false, class1.isAnnotation());
      assertEquals("class java.lang.Object", class1.toString());
      assertEquals(1, class1.getModifiers());
      assertEquals(false, class1.isSynthetic());
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      Class<Object> class0 = null;
      // Undeclared exception!
      try {
        Class<?> class1 = TypeUtils.getRawType((Type) class0, (Type) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertNotNull(map0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      Type[] typeArray0 = new Type[9];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertFalse(typeArray1.equals((Object)typeArray0));
      assertFalse(typeArray0.equals((Object)typeArray1));
      assertNotSame(typeArray1, typeArray0);
      assertNotSame(typeArray0, typeArray1);
      assertNotNull(typeArray1);
      
      Type[] typeArray2 = TypeUtils.normalizeUpperBounds(typeArray1);
      assertFalse(typeArray1.equals((Object)typeArray0));
      assertFalse(typeArray2.equals((Object)typeArray0));
      assertFalse(typeArray0.equals((Object)typeArray2));
      assertFalse(typeArray0.equals((Object)typeArray1));
      assertNotSame(typeArray1, typeArray0);
      assertSame(typeArray1, typeArray2);
      assertSame(typeArray2, typeArray1);
      assertNotSame(typeArray2, typeArray0);
      assertNotSame(typeArray0, typeArray2);
      assertNotSame(typeArray0, typeArray1);
      assertNotNull(typeArray2);
  }

  @Test
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object> class1 = null;
      boolean boolean0 = TypeUtils.isInstance((Object) class1, (Type) class0);
      assertTrue(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Type type0 = null;
      boolean boolean0 = TypeUtils.isInstance((Object) type0, type0);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeUtils.isInstance((Object) class0, (Type) class0);
      assertTrue(boolean0);
  }

  @Test
  public void test09() {}
//   @Test
//   public void test09()  throws Throwable  {
//       Class<TypeVariable> class0 = TypeVariable.class;
//       Class<Object> class1 = Object.class;
//       Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
//       assertNotNull(map0);
//       assertEquals(0, map0.size());
//       assertEquals(true, map0.isEmpty());
//   }

  @Test
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<?> class1 = TypeUtils.getRawType((Type) class0, (Type) class0);
      assertNotNull(class1);
      assertEquals(1, class1.getModifiers());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isSynthetic());
      assertEquals("class java.lang.Object", class1.toString());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isPrimitive());
      assertEquals(false, class1.isAnnotation());
      assertEquals(false, class1.isInterface());
      
      Class<Object> class2 = null;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class1, (Class<?>) class2);
      assertNull(map0);
      assertEquals(1, class1.getModifiers());
      assertEquals(false, class1.isArray());
      assertEquals(false, class1.isSynthetic());
      assertEquals("class java.lang.Object", class1.toString());
      assertEquals(false, class1.isEnum());
      assertEquals(false, class1.isPrimitive());
      assertEquals(false, class1.isAnnotation());
      assertEquals(false, class1.isInterface());
  }

  @Test
  public void test11()  throws Throwable  {
      Type type0 = null;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try {
        Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(type0, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[9];
      typeArray0[1] = (Type) class0;
      assertNotNull(typeArray0[1]);
      
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertFalse(typeArray1.equals((Object)typeArray0));
      assertFalse(typeArray0.equals((Object)typeArray1));
      assertNotSame(typeArray1, typeArray0);
      assertNotSame(typeArray0, typeArray1);
      assertNotNull(typeArray1);
  }

  @Test
  public void test13()  throws Throwable  {
      Type type0 = null;
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
      
      boolean boolean0 = TypeUtils.isAssignable(type1, type1);
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      assertNotNull(typeUtils0);
  }
}
