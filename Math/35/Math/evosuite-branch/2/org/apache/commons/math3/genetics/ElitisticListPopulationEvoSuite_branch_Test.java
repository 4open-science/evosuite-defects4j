/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:23:37 GMT 2014
 */

package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ElitisticListPopulationEvoSuite_branch_Test extends ElitisticListPopulationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 162;
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (162)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 50;
      double double0 = (-1.0);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      int int0 = 1;
      Chromosome chromosome0 = null;
      boolean boolean0 = linkedList0.add(chromosome0);
      assertTrue(boolean0);
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, (double) int0);
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertNotNull(elitisticListPopulation0);
      
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      assertFalse(elitisticListPopulation0.equals((Object)elitisticListPopulation1));
      assertFalse(elitisticListPopulation1.equals((Object)elitisticListPopulation0));
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1.0, elitisticListPopulation1.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation1.toString());
      assertEquals(1, elitisticListPopulation1.getPopulationSize());
      assertEquals(1, elitisticListPopulation1.getPopulationLimit());
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      assertNotSame(elitisticListPopulation0, elitisticListPopulation1);
      assertNotSame(elitisticListPopulation1, elitisticListPopulation0);
      assertNotNull(elitisticListPopulation1);
  }
}
