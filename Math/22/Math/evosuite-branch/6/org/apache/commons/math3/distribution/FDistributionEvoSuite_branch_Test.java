/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:25:16 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FDistributionEvoSuite_branch_Test extends FDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 523;
      Well44497a well44497a0 = new Well44497a((long) int0);
      assertNotNull(well44497a0);
      
      double double0 = 0.0;
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution((RandomGenerator) well44497a0, (double) int0, double0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 0.0;
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1.8428773880004883;
      FDistribution fDistribution0 = new FDistribution(double0, double0, double0);
      assertNotNull(fDistribution0);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.8428773880004883, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.8428773880004883, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      
      double double1 = fDistribution0.sample();
      assertEquals(9.873254410724597, double1, 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.8428773880004883, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.8428773880004883, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = fDistribution0.density(double1);
      assertEquals(0.00876480119702088, double2, 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.8428773880004883, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.8428773880004883, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1018.208715;
      FDistribution fDistribution0 = new FDistribution(double0, double0);
      assertNotNull(fDistribution0);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0019680996339417, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertFalse(boolean0);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0019680996339417, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 1018.208715;
      FDistribution fDistribution0 = new FDistribution(double0, double0);
      assertNotNull(fDistribution0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0019680996339417, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, fDistribution0.isSupportConnected());
      
      int int0 = 523;
      double[] doubleArray0 = fDistribution0.sample(int0);
      assertArrayEquals(new double[] {1.084700539085967, 1.0207742128110908, 1.0098452632179322, 0.9975369723601442, 0.998382923066403, 0.9317592043632015, 1.0879176393178935, 1.010345748342933, 0.9778472180440894, 0.9806187632721733, 1.0100946037609742, 0.908549883028845, 0.9495627796124314, 0.9761664471940353, 1.0863864104206764, 0.988435670439534, 1.094678187243416, 0.9277528233971253, 0.945502519984297, 1.016919873699485, 0.9610073454172228, 1.0331071212835932, 1.049927463023224, 0.9958775597264465, 0.9632714806371315, 1.056141526419163, 0.9760055359330086, 0.9939529226128493, 0.941948889536297, 0.9216601741450345, 0.9936731351298207, 0.9694136688638366, 0.9280389995223477, 0.9799166974755592, 0.9998107060540311, 0.9368704553630841, 0.8875092333258793, 0.9333467525499193, 1.0023787317198767, 1.0712481169663457, 1.0105665975849951, 1.045545061827426, 0.9403840805251106, 1.070830567471883, 1.104063259193557, 1.0483894288242124, 1.0384287242961663, 1.0202625295274317, 1.160872621611827, 0.8919597014666589, 1.0753060431358352, 1.0028383826385159, 0.9426832190315566, 1.0015863898387778, 1.052598154764652, 1.0017069528239175, 1.0302774585071122, 1.0008239608596046, 0.9012445581526588, 0.9964110778833631, 1.0502933465709228, 1.120537451397936, 0.9633009372846882, 0.9622983854869307, 1.01206218835347, 0.9444782713894155, 0.906143351210649, 0.9563258606722174, 0.9874527459109809, 0.995644653770212, 0.9340800012399839, 1.031713463955979, 1.0952215005220016, 0.992413199847504, 1.1219844056509172, 0.9809976184459929, 0.9419976905526574, 0.8841358200745946, 0.9869328509007141, 1.0718055142605247, 0.8899217605807961, 0.9197156586685138, 1.011219167140713, 1.0966368535884663, 1.0214840586924232, 1.1271722089610856, 0.9604685741338189, 1.0036387455434852, 1.0765766830278518, 0.9552752901346854, 0.9902300153827931, 0.9321473236672961, 1.0426538892731, 1.0200229210792002, 1.0344396155778235, 1.0589443005742358, 1.061999178315951, 0.9087770350980682, 1.0193534910118944, 0.9201460511910373, 0.9853434954208907, 1.087610671262134, 0.8718079923704071, 1.034213415056735, 1.141996635218871, 1.0967643144568613, 0.8906184971890861, 1.0583626846545076, 0.9630305832986967, 1.0098989648524461, 0.9299020985671708, 1.0166113757151305, 1.0171001238935933, 1.026370542821057, 0.9903702562533973, 1.0077280030811366, 1.0996659482608804, 0.9791042822020933, 0.9733201416907381, 1.0050129439116766, 1.1175870707269429, 0.9791638976661847, 1.0260974462566042, 1.110487107007426, 1.0424945146077547, 1.1061099539833592, 0.8873298204298835, 1.0067659947785108, 0.9575286311675644, 1.029987501659689, 1.038619993875881, 1.0363486193903944, 0.9707890902226994, 0.9882677571443488, 0.9557066855933316, 1.0560930984279595, 0.9254810671890243, 1.0429193365294478, 1.0217922568908209, 0.9784289874540195, 1.0352573572023056, 0.9490197110032055, 0.9230865249537779, 0.9602607987610294, 1.0018967019116942, 0.9699013788117403, 1.0338505222476426, 0.9455460816747847, 0.9228871135439675, 0.9920089046088595, 1.0075920308557247, 1.0266609150167298, 0.8954029658658662, 1.097391699491168, 0.9927263928995593, 1.0169625702096916, 1.0004798390740448, 0.9319059171194425, 0.9634930769946882, 1.0371714835977877, 1.0934319174666725, 0.9771152225252545, 1.088109852947094, 0.9559325709323594, 1.084139440992047, 0.9414062856822781, 0.9508184352561018, 0.9167071245238491, 1.1206472220779593, 1.1174937031804395, 0.9449667731193377, 1.0305352372881693, 1.1002631580805609, 1.0466940710631238, 1.030401741241897, 0.8555490660730549, 0.9824698051456583, 1.0477542609174204, 0.9970789525289131, 0.926120807305798, 1.0343614834216763, 0.9573792823707266, 1.046084990871745, 0.9838652348489515, 0.9367006055661732, 0.9267075868505781, 1.0018361447474435, 1.019708156320759, 0.902071642554947, 0.9859385241722103, 1.1305576534079271, 0.9998738333881635, 0.9924947949749718, 0.9830070246819779, 1.0442809669223845, 1.077444145291265, 1.033622741490541, 1.0337394519842908, 0.982146478764184, 1.055749071372075, 0.9578442948478206, 1.0545464779375342, 0.9700647296819782, 1.0573719871336396, 1.0085193986786976, 1.108279217397037, 1.1138731945716085, 0.9204514396898792, 1.053799696061202, 1.0272451190660605, 1.0339650010295571, 0.9447205987163925, 0.9855024927353414, 0.979939672987899, 1.0319180138098123, 0.9764040149075034, 0.926286238617, 0.9251083371063117, 0.9959783438914452, 0.9424236068843753, 1.0351549483156568, 0.9772736932431543, 0.9296652341769145, 1.107698167236391, 1.033688429766032, 1.0697954546429989, 1.022788256630718, 1.0460124259443464, 0.977358930167575, 0.9334063356399634, 0.961915633291117, 1.0578277970424874, 0.9917722770654492, 1.022812198717043, 0.9917714350856791, 0.974407882039589, 0.9473131075485619, 1.0872524136062125, 0.9459824702981194, 0.9887806296280759, 0.9488907882898467, 0.9930135053399475, 1.00119626655269, 0.9713458609476816, 0.9540892345942847, 1.047823828020391, 0.9826238105661705, 0.9918395528367645, 0.9975970396750484, 0.9311689373482195, 0.9594504156657447, 1.0147368203081173, 0.9648106901186605, 1.0049232239468233, 1.0945439455382033, 1.0286460816603171, 0.9922552994009004, 0.987452325048158, 0.9313072746262682, 0.989002837381471, 0.9248156009571138, 0.9286330045911962, 1.0271388220023359, 1.058457755406572, 1.123547772690709, 0.9943444799063781, 0.9869684337334662, 0.9659084362307079, 1.0084588402263943, 0.9781650347273756, 1.1159791037521922, 1.0089442847621661, 0.9409163710577783, 0.9814981865902446, 1.0229040540300076, 0.9118643422190058, 0.9514009787069078, 0.9418059134626169, 1.015144198708683, 1.011468789931479, 1.0521003743283026, 1.0218879264513243, 0.8798646620352539, 1.0534560722873754, 0.9922400650892446, 0.984039556812854, 1.015141898438211, 0.9535539981205315, 1.0482812638144625, 1.0552991838606618, 0.999591402296227, 1.0292325274252847, 1.0445579210560212, 1.081229190291919, 0.9976035829629514, 1.0157771350330025, 1.0175122735157895, 0.9593307123221114, 0.920186471632714, 1.0297162980391736, 1.1155200467084356, 0.9637506538496883, 0.9412376188507743, 0.9023358858714122, 1.0292295279975792, 1.0167812724205074, 0.9955470832224774, 0.9466642121917406, 0.9484996881561959, 1.092277292814284, 0.973438332792652, 0.8830025499279599, 0.9473643025791055, 0.9967459670879378, 0.9270286077358438, 0.8953442950293757, 0.9675709336086616, 1.0077514637395326, 0.8548009572778142, 1.04322458195857, 1.0190201744668266, 1.0316069776708465, 1.007452493745048, 0.910429936733504, 0.9998091716824594, 1.0816717678367693, 1.125643254338516, 1.0992110905976415, 0.9021337763270152, 0.9549637710695092, 1.0003922378803516, 0.9981110062608884, 1.0952180501282125, 1.09385553973877, 1.0224428835420611, 1.049695781376013, 0.9515630295887443, 1.0749463136354644, 1.139316459222098, 1.0652614801619278, 1.0463295196031177, 1.0681157704874535, 0.9934859863377026, 0.9238510335090282, 1.154701980388339, 0.933187310734088, 0.8958522601689084, 0.9217119858394086, 0.942753901143361, 0.9925456861816535, 1.0001130220914058, 0.933606924044663, 0.9591836927155183, 0.9255434111088958, 1.020193083719837, 0.9761751701795818, 1.0596662826471461, 1.0184286421149313, 1.0495877968771004, 1.0110915582077387, 0.9615761165399177, 0.9677013246461723, 1.0101796120873447, 0.9753551315375795, 0.9990793849469112, 0.9459748398295946, 0.9877727819548119, 0.9652130247450915, 0.9894875003195291, 1.0036302619603386, 0.9254696294626862, 0.9405995916508092, 0.9031249369330745, 0.8700630733466779, 1.0687550045403023, 0.9932495801681114, 0.8905564894744736, 0.9568110569032839, 1.0419275560076566, 1.0495389829273756, 0.9888739295064307, 1.0136602357954447, 0.99337026343234, 1.0574602604434844, 1.0455381852271408, 1.0476904403122034, 0.9557561532670823, 0.9989606566402858, 0.8882604624659802, 0.9268234018160192, 0.9201458527368945, 1.1678632225198546, 1.009375027272881, 1.0251912268762704, 0.9756583975390227, 0.9877939592732461, 1.0677760552279694, 0.9312540382876745, 0.982593260731912, 0.9798576696353916, 0.9925900853565467, 1.0550310133403091, 0.972646816630338, 0.8803189800990582, 1.0152744584770967, 0.9148381969331598, 1.0989443232984355, 1.0024322385232014, 0.9746059336399613, 1.0294923738555588, 0.8885524371171446, 0.9732956711764612, 0.9447616886151279, 1.0123842318119651, 0.9932579213307817, 0.954952056139316, 0.9905813956404387, 1.0334568889733755, 1.094193120906944, 0.9296188308660707, 1.0804943588345488, 1.1854418655439394, 1.1403692955009443, 1.0438932323097758, 1.0119628789054502, 0.9815247954472768, 1.0452784717211396, 1.0106817552286038, 1.0110776959587477, 0.9047197277167022, 1.1182345672764877, 0.9412145223814554, 0.9757116021825358, 0.9171400242353716, 1.0718434466007223, 1.0401741320698217, 0.9485475196162273, 0.9321094634729984, 0.9459271638804612, 1.1167040332192804, 1.0060923354032674, 1.0294401505029251, 1.057211002152866, 1.0546173074698684, 0.9630139167911174, 1.0537978113307214, 0.9308900152148749, 1.0016786305369954, 0.8814458621338597, 1.0256238592359517, 1.0935537951206176, 1.0173725636483788, 1.0255772636569458, 0.9481630256851821, 0.882065923219956, 0.9440489539648609, 0.9458089826861178, 1.008215359755139, 0.9194196450578447, 1.132375175064676, 1.0624902305093762, 0.94069737078548, 0.9760725568355262, 0.9486187112077149, 0.9882946948401327, 0.9329234737595912, 1.016724714474104, 1.0661067235805337, 0.9606559256763897, 1.0039797119661098, 0.9389888284808945, 1.0285705366677553, 1.0652882520455804, 0.8915504715900201, 0.9200929297408673, 1.0016743176684144, 1.0158239605659973, 1.0307695838717803, 1.0602765775560163, 1.1285461088430546, 0.9117870463007023, 1.053937537485005, 0.9382405636332051, 0.9926094567584771, 0.9863149965502156, 0.9645741325836942, 0.9835304035126103, 1.0895825447009273, 0.9913566544586441, 1.070168723917874, 0.9884543029863105, 1.0844435525624263, 1.0094151864492908, 1.0189756226636077, 1.0602900649036329, 1.088487083399552, 1.0052102129057403, 0.9725753857914137, 0.9306699839435915, 0.99949002119581, 0.9541362806375623, 0.998684494186783, 0.9917332791004361, 1.0520523896514733, 1.0289226858187086, 1.0662596211164315, 0.9389715719088454, 1.073218683067567, 1.027285106384877, 1.0222538639492287, 0.9467018728500439, 1.0189724922373855, 1.0770362630610257, 0.9222062510315361, 1.0624268014928877, 0.9937763035814314, 0.9806229324505855, 1.0433719861771629, 1.0221963430124763, 1.0556981943214123, 0.9186388154299627, 0.93683455142727, 1.0736270336527616}, doubleArray0, 0.01);
      assertNotNull(doubleArray0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0019680996339417, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(1018.208715, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, fDistribution0.isSupportConnected());
  }

  @Test
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 703;
      intArray0[0] = int0;
      Well19937a well19937a0 = new Well19937a(intArray0);
      assertArrayEquals(new int[] {703}, intArray0);
      assertNotNull(well19937a0);
      
      FDistribution fDistribution0 = new FDistribution((RandomGenerator) well19937a0, (double) intArray0[0], (double) intArray0[0], (double) intArray0[0]);
      assertArrayEquals(new int[] {703}, intArray0);
      assertNotNull(fDistribution0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0028530670470757, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(703.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(703.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
      
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertFalse(boolean0);
      assertArrayEquals(new int[] {703}, intArray0);
      assertEquals(false, fDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0028530670470757, fDistribution0.getNumericalMean(), 0.01D);
      assertEquals(false, fDistribution0.isSupportLowerBoundInclusive());
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, fDistribution0.isSupportConnected());
      assertEquals(703.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(703.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01D);
  }
}
