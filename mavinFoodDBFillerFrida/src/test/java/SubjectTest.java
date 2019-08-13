/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavinfooddbfillerfrida.XMLParser;
import com.mycompany.mavinfooddbfillerfrida.model.Subject;
import com.mysql.cj.result.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class SubjectTest {
    
    public SubjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSubject() throws IOException{
        XMLParser xml = new XMLParser();
        xml.Makeobjects();
        
        FileInputStream file = new FileInputStream(new File("C:\\Users\\Matt\\Desktop\\FoodApp\\Frida20190612\\Frida20190612en.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(1);
            
        FileInputStream file2 = new FileInputStream(new File("C:\\Users\\Matt\\Desktop\\FoodApp\\Frida20190612\\Frida20190612da.xlsx"));
        Workbook workbook2 = new XSSFWorkbook(file2);
        Sheet sheet2 = workbook2.getSheetAt(1);
        
        double delta = 0.000001;
        
        for (int i = 0; i < xml.getSubjectArray().size(); i++){
            org.apache.poi.ss.usermodel.Row row = sheet.getRow(i+1);
            org.apache.poi.ss.usermodel.Row row2 = sheet2.getRow(i+1);
            Subject subject = xml.getSubjectArray().get(i);
            
            assertEquals(subject.getName(),row.getCell(1).getStringCellValue());
            assertEquals(subject.factors.getWaste(), row.getCell(2).getNumericCellValue(), delta);
            assertEquals(subject.getKj(), row.getCell(3).getNumericCellValue(), delta);
            assertEquals(subject.getKcal(), row.getCell(4).getNumericCellValue(), delta);
            assertEquals(subject.getTotalN(), row.getCell(6).getNumericCellValue(), delta);
            assertEquals(subject.getProtien(), row.getCell(8).getNumericCellValue(), delta);
            assertEquals(subject.getCarbohydrates(), row.getCell(11).getNumericCellValue(), delta);
            assertEquals(subject.getAddedSugar(), row.getCell(12).getNumericCellValue(), delta);
            assertEquals(subject.getFiber(), row.getCell(13).getNumericCellValue(), delta);
            assertEquals(subject.getFat(), row.getCell(14).getNumericCellValue(), delta);
            assertEquals(subject.factors.getFattyAcidConversionFactor(), row.getCell(15).getNumericCellValue(), delta);
            assertEquals(subject.getAlcohol(), row.getCell(16).getNumericCellValue(), delta);
            assertEquals(subject.getAsh(), row.getCell(17).getNumericCellValue(),delta);
            assertEquals(subject.getDryMatter(), row.getCell(18).getNumericCellValue(), delta);
            assertEquals(subject.getWater(), row.getCell(19).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminA(), row.getCell(20).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getRetinol(), row.getCell(21).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminD(), row.getCell(22).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getD3Cholecalciferol(), row.getCell(23).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getD2Ergocalciferol(), row.getCell(24).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminD325hydroxy(), row.getCell(25).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.get25hydroxycholecalciferol(), row.getCell(26).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminE(), row.getCell(27).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getAlphaTocopherol(), row.getCell(28).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getGammaTocopherol(), row.getCell(29).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getDeltaTocopherol(), row.getCell(30).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getAlphaTokotrienol(), row.getCell(31).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminK1(), row.getCell(32).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminB1(), row.getCell(33).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getThiamine(), row.getCell(34).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getHydroxyethylthiazole(), row.getCell(35).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminB2Riboflavin(), row.getCell(36).getNumericCellValue(),delta);
            assertEquals(subject.vitamins.getNiacinEquivalent(), row.getCell(37).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getNiacin(), row.getCell(38).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getVitaminB6(), row.getCell(39).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getPantothenic(), row.getCell(40).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getBiotin(), row.getCell(41).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getFolate(), row.getCell(42).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getB12(), row.getCell(44).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getcVitamin(), row.getCell(45).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getLAscorbicAcid(), row.getCell(46).getNumericCellValue(), delta);
            assertEquals(subject.vitamins.getLDehydroascorbicAcid(), row.getCell(47).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getSulfur(), row.getCell(48).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getChloride(), row.getCell(49).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getSodium(), row.getCell(50).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getPotassium(), row.getCell(51).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getCalcium(), row.getCell(52).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getMagnesium(), row.getCell(53).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getPhosphorus(), row.getCell(54).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getIron(), row.getCell(55).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getCopper(), row.getCell(56).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getZink(), row.getCell(57).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getIodine(), row.getCell(58).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getManganese(), row.getCell(59).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getChromium(), row.getCell(60).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getSelenium(), row.getCell(61).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getMolybdenum(), row.getCell(62).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getColbalt(), row.getCell(63).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getNickel(), row.getCell(64).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getFluoron(), row.getCell(65).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getSilicon(), row.getCell(66).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getRubidium(), row.getCell(67).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getAluminum(), row.getCell(68).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getBoron(), row.getCell(69).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getBromine(), row.getCell(70).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getMercury(), row.getCell(71).getNumericCellValue(),delta);
            assertEquals(subject.minerals.getArsenic(), row.getCell(72).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getCadmium(), row.getCell(73).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getLead(), row.getCell(74).getNumericCellValue(), delta);
            assertEquals(subject.minerals.getTin(), row.getCell(75).getNumericCellValue(), delta);
            assertEquals(subject.organicAcids.getlLacticAcid(), row.getCell(76).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getdLacticAcid(), row.getCell(77).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getLaticAcidTotal(), row.getCell(78).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getCitricAcid(), row.getCell(79).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getOxalicAcid(), row.getCell(80).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getMalicAcid(), row.getCell(81).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getAceticAcid(), row.getCell(82).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getBenzoicAcid(), row.getCell(83).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getSorbicAcid(), row.getCell(84).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getPropionic(), row.getCell(85).getNumericCellValue(),delta);
            assertEquals(subject.organicAcids.getOrganicAcidsTotal(), row.getCell(86).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getHistamine(), row.getCell(87).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getTyramine(), row.getCell(88).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getPhenylethylamine(), row.getCell(89).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getPutrescine(), row.getCell(90).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getCadaverine(), row.getCell(91).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getSpermine(), row.getCell(92).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getSpermidine(), row.getCell(93).getNumericCellValue(),delta);
            assertEquals(subject.biogeneamines.getSerotonin(), row.getCell(94).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getFructose(), row.getCell(95).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getGalactose(), row.getCell(96).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getGlucose(), row.getCell(97).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getMonosaccharidesTotal(), row.getCell(98).getNumericCellValue(), delta);
            assertEquals(subject.carbohydrates.getLactose(), row.getCell(99).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getMaltose(), row.getCell(100).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSucrose(), row.getCell(101).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getDisaccharidesTotal(), row.getCell(102).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getMaltotriose(), row.getCell(103).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getRaffinose(), row.getCell(104).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getOtherSugars(), row.getCell(105).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSugarsTotal(), row.getCell(106).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSorbitol(), row.getCell(107).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getMannitol(), row.getCell(108).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getInositol(), row.getCell(109).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getMaltitol(), row.getCell(110).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSugarAlcoholsTotal(), row.getCell(111).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getStarch(), row.getCell(112).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getIDF(), row.getCell(113).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSDFP(), row.getCell(114).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getSDFS(), row.getCell(115).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getaHexoses(), row.getCell(116).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getbThePentoses(), row.getCell(117).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getcUronicAcids(), row.getCell(118).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getCellulose(), row.getCell(119).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getLignin(), row.getCell(120).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getCrudeFibers(), row.getCell(121).getNumericCellValue(),delta);
            assertEquals(subject.carbohydrates.getNaturalDietFibre(), row.getCell(122).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC40(), row.getCell(123).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC60(), row.getCell(124).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC80(), row.getCell(125).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC100(), row.getCell(126).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC120(), row.getCell(127).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC121n1(), row.getCell(128).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC130(), row.getCell(129).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC140(), row.getCell(130).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC150(), row.getCell(131).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC160(), row.getCell(132).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC170(), row.getCell(133).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC180(), row.getCell(134).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC200(), row.getCell(135).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC210(), row.getCell(136).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC220(), row.getCell(137).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC230(), row.getCell(138).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getC240(), row.getCell(139).getNumericCellValue(),delta);
            assertEquals(subject.saturatedFattyAcids.getOther(), row.getCell(140).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC141n5(), row.getCell(141).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC151(), row.getCell(142).getNumericCellValue(), delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC161n7(), row.getCell(143).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC171n7(), row.getCell(144).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC181n9(), row.getCell(145).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC181n7(), row.getCell(146).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC201n9(), row.getCell(147).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC201n11(), row.getCell(148).getNumericCellValue(), delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC221n9(), row.getCell(149).getNumericCellValue(), delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC221n11(), row.getCell(150).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcids.getC241n9(), row.getCell(151).getNumericCellValue(), delta);
            assertEquals(subject.monounsaturatedFattyAcids.getOther(), row.getCell(152).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC182n6(), row.getCell(153).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC182(), row.getCell(154).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC183n3(), row.getCell(155).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC183n6(), row.getCell(156).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC184n3(), row.getCell(157).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC202n6(), row.getCell(158).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC222n6(), row.getCell(159).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC224n6(), row.getCell(160).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC225n6(), row.getCell(161).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC203n3(), row.getCell(162).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC204n3(), row.getCell(163).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC203n6(), row.getCell(164).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC204n6(), row.getCell(165).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC205n3(), row.getCell(166).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC225n3(), row.getCell(167).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getC226n3(), row.getCell(168).getNumericCellValue(),delta);
            assertEquals(subject.polyunsaturatedFattyAcids.getOther(), row.getCell(169).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC141Trans9(), row.getCell(170).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC161Trans(), row.getCell(171).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC181TransN9(), row.getCell(172).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC201Trans(), row.getCell(173).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC221Trans(), row.getCell(174).getNumericCellValue(),delta);
            assertEquals(subject.monounsaturatedFattyAcidsTrans.getC182TransUndifferentiated(), row.getCell(175).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getOtherFattyAcids(), row.getCell(176).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getSumSaturated(), row.getCell(177).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getSumMonounsaturated(), row.getCell(178).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getSumPolyunsaturated(), row.getCell(179).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getTransFattyAcidsTotal(), row.getCell(180).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getFattyAcidsTotal(), row.getCell(181).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getSumN3FattyAcids(), row.getCell(182).getNumericCellValue(),delta);
            assertEquals(subject.fattyAcidsSums.getSumN6FattyAcids(), row.getCell(183).getNumericCellValue(),delta);
            assertEquals(subject.sterols.getCholesterol(), row.getCell(184).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getIsoleucine(), row.getCell(185).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getLeucine(), row.getCell(186).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getLysine(), row.getCell(187).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getMethionine(), row.getCell(188).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getCystine(), row.getCell(189).getNumericCellValue(), delta);
            assertEquals(subject.aminoAcids.getPhenylalanine(), row.getCell(190).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getTyrosine(), row.getCell(191).getNumericCellValue(), delta);
            assertEquals(subject.aminoAcids.getThreonine(), row.getCell(192).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getTryptophan(), row.getCell(193).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getValin(), row.getCell(194).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getArginine(), row.getCell(195).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getHistidine(), row.getCell(196).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getAlanine(), row.getCell(197).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getAsparticAcid(), row.getCell(198).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getGlutamicAcid(), row.getCell(199).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getGlycine(), row.getCell(200).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getProline(), row.getCell(201).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getHydroxyproline(), row.getCell(202).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getSerin(), row.getCell(203).getNumericCellValue(),delta);
            assertEquals(subject.aminoAcids.getBetaCarotene(), row.getCell(204).getNumericCellValue(),delta);
            
            
            
            
        }   
    }
// TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
