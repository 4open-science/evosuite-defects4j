/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 16:52:07 GMT 2014
 */

package org.jfree.data.time;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class TimeSeriesEvoSuite_branch_Test_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(6000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 5000);
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.7"); 
            java.lang.System.setProperty("java.home", "/usr/local/packages6/java/jdk1.7.0_55/jre"); 
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Chart/9/7/run_evosuite.pl_25571_1418316085"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Chart/9/7/run_evosuite.pl_25571_1418316085/build:/scratch/ac1gf/Chart/9/7/run_evosuite.pl_25571_1418316085/lib/servlet.jar"); 
    java.lang.System.setProperty("java.class.version", "51.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.7.0_55-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.7.0_55"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.7"); 
    java.lang.System.setProperty("java.vm.version", "24.55-b03"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "2.6.32-431.23.3.el6.x86_64"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.home", "/home/ac1gf"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ac1gf"); 
    java.lang.System.setProperty("user.timezone", "GB-Eire"); 
                                                                                                                                                                                                                                      }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(TimeSeriesEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.general.PieDataset",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.xy.IntervalXYZDataset",
      "org.jfree.data.KeyedValueComparator",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.Vector",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.xy.YIntervalDataItem",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Week",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.data.general.CombinationDataset",
      "org.jfree.data.xy.VectorDataItem",
      "org.jfree.data.time.Hour",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.Values",
      "org.jfree.data.gantt.Task",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.time.Month",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.data.general.CombinedDataset$DatasetInfo",
      "org.jfree.data.time.DynamicTimeSeriesCollection$ValueSequence",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.xy.XIntervalDataItem",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.Value",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.data.xy.VectorXYDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.WindDataItem",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.KeyedValueDataset",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.KeyedValue",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.data.DataUtilities",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Day",
      "org.jfree.data.Values2D",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.Range",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.xy.XYIntervalDataItem"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(TimeSeriesEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.Month",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.Minute",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.gantt.Task",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.data.Range",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.ComparableObjectItem",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.statistics.BoxAndWhiskerItem"
    );
  }
}
