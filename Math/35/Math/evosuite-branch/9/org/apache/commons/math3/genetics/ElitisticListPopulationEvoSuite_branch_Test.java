/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:30:41 GMT 2014
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
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      int int0 = 2712;
      double double0 = (-1788.2);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1,788.2)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 1;
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(int0, int0);
      assertNotNull(elitisticListPopulation0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[]", elitisticListPopulation0.toString());
      assertEquals(0, elitisticListPopulation0.getPopulationSize());
      
      Chromosome chromosome0 = null;
      elitisticListPopulation0.addChromosome(chromosome0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      
      ElitisticListPopulation elitisticListPopulation1 = (ElitisticListPopulation)elitisticListPopulation0.nextGeneration();
      assertNotNull(elitisticListPopulation1);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01D);
      assertEquals(1, elitisticListPopulation0.getPopulationLimit());
      assertEquals("[null]", elitisticListPopulation0.toString());
      assertEquals(1, elitisticListPopulation0.getPopulationSize());
      assertEquals(1.0, elitisticListPopulation1.getElitismRate(), 0.01D);
      assertEquals("[null]", elitisticListPopulation1.toString());
      assertEquals(1, elitisticListPopulation1.getPopulationLimit());
      assertEquals(1, elitisticListPopulation1.getPopulationSize());
      assertFalse(elitisticListPopulation0.equals((Object)elitisticListPopulation1));
      assertFalse(elitisticListPopulation1.equals((Object)elitisticListPopulation0));
      assertNotSame(elitisticListPopulation0, elitisticListPopulation1);
      assertNotSame(elitisticListPopulation1, elitisticListPopulation0);
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      int int0 = 2712;
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) linkedList0, int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (2,712)
         //
      }
  }
}
