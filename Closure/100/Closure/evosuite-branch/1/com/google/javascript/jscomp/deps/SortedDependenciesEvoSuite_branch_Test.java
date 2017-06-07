/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:36:16 GMT 2014
 */

package com.google.javascript.jscomp.deps;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.deps.SimpleDependencyInfo;
import com.google.javascript.jscomp.deps.SortedDependencies;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SortedDependenciesEvoSuite_branch_Test extends SortedDependenciesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      String string0 = "t";
      ArrayList<String> arrayList1 = new ArrayList<String>();
      assertNotNull(arrayList1);
      assertEquals(0, arrayList1.size());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) arrayList1, (List<String>) arrayList1);
      assertNotNull(simpleDependencyInfo0);
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      assertEquals(0, arrayList1.size());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      assertEquals(0, arrayList1.size());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertTrue(boolean0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(sortedDependencies0);
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      
      LinkedList<SimpleDependencyInfo> linkedList0 = new LinkedList<SimpleDependencyInfo>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) linkedList0);
      assertNotNull(list0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "z";
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector0, (List<String>) vector0);
      assertNotNull(simpleDependencyInfo0);
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertTrue(boolean0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(sortedDependencies0);
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      
      boolean boolean1 = vector0.add(string0);
      assertEquals("[z]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals(1, vector0.size());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(list0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[z], requires=[z])]", arrayList0.toString());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = "z";
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector0, (List<String>) vector0);
      assertNotNull(simpleDependencyInfo0);
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertTrue(boolean0);
      
      boolean boolean1 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      assertEquals(2, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[]), DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(sortedDependencies0);
      assertEquals(2, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[]), DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedDependenciesOf((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(list0);
      assertEquals(2, arrayList0.size());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[]), DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(2, list0.size());
      assertEquals(false, list0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      String string0 = "t";
      ArrayList<String> arrayList1 = new ArrayList<String>();
      assertNotNull(arrayList1);
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      assertEquals(0, arrayList1.size());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) arrayList1, (List<String>) arrayList1);
      assertNotNull(simpleDependencyInfo0);
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      assertEquals(0, arrayList1.size());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals("[]", arrayList1.toString());
      assertEquals(0, arrayList1.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertTrue(boolean0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(sortedDependencies0);
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getSortedList();
      assertNotNull(list0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      
      String string0 = "t";
      ArrayList<String> arrayList1 = new ArrayList<String>();
      assertNotNull(arrayList1);
      assertEquals(true, arrayList1.isEmpty());
      assertEquals(0, arrayList1.size());
      assertEquals("[]", arrayList1.toString());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) arrayList1, (List<String>) arrayList1);
      assertNotNull(simpleDependencyInfo0);
      assertEquals(true, arrayList1.isEmpty());
      assertEquals(0, arrayList1.size());
      assertEquals("[]", arrayList1.toString());
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(true, arrayList1.isEmpty());
      assertEquals(0, arrayList1.size());
      assertEquals("[]", arrayList1.toString());
      assertEquals("t", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("t", simpleDependencyInfo0.getName());
      assertTrue(boolean0);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
      assertNotNull(sortedDependencies0);
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      
      List<SimpleDependencyInfo> list0 = sortedDependencies0.getInputsWithoutProvides();
      assertNotNull(list0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertEquals("[DependencyInfo(relativePath='t', path='t', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = "z";
      ArrayList<SimpleDependencyInfo> arrayList0 = new ArrayList<SimpleDependencyInfo>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      
      Vector<String> vector0 = new Vector<String>();
      assertNotNull(vector0);
      assertEquals(true, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo(string0, string0, (List<String>) vector0, (List<String>) vector0);
      assertNotNull(simpleDependencyInfo0);
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals(true, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      
      boolean boolean0 = arrayList0.add(simpleDependencyInfo0);
      assertEquals("z", simpleDependencyInfo0.getPathRelativeToClosureBase());
      assertEquals("z", simpleDependencyInfo0.getName());
      assertEquals(true, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals("[DependencyInfo(relativePath='z', path='z', provides=[], requires=[])]", arrayList0.toString());
      assertEquals(false, arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertTrue(boolean0);
      
      boolean boolean1 = vector0.add(string0);
      assertEquals(false, vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[z]", vector0.toString());
      assertEquals(1, vector0.size());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      SortedDependencies<SimpleDependencyInfo> sortedDependencies0 = null;
      try {
        sortedDependencies0 = new SortedDependencies<SimpleDependencyInfo>((List<SimpleDependencyInfo>) arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // z -> z
         //
      }
  }
}