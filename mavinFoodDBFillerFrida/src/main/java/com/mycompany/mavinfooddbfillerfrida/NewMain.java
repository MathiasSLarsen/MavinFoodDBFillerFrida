/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavinfooddbfillerfrida;

import com.mycompany.mavinfooddbfillerfrida.model.Subject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\Food App\\Frida20190612\\Frida20190612en.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(1);
            
            System.out.println(sheet.getSheetName());
            Row row = sheet.getRow(1);
            
                Subject subject = new Subject();
                Cell cell;
                subject.setName(row.getCell(1).getStringCellValue());
                subject.factors.setWaste((float) row.getCell(2).getNumericCellValue());
                subject.setKj((int) row.getCell(3).getNumericCellValue());
                subject.setKcal((int) row.getCell(4).getNumericCellValue());
                subject.setTotalN((float) row.getCell(5).getNumericCellValue());
                subject.setProtien((float) row.getCell(7).getNumericCellValue());
                subject.setCarbohydrates((float) row.getCell(10).getNumericCellValue());
                subject.setAddedSugar((float) row.getCell(11).getNumericCellValue());
                subject.setFiber((float) row.getCell(12).getNumericCellValue());
                subject.setFat((float) row.getCell(13).getNumericCellValue());
                subject.factors.setFattyAcidConversionFactor((float) row.getCell(14).getNumericCellValue());
                subject.setAlcohol((float) row.getCell(15).getNumericCellValue());
                subject.setAsh((float) row.getCell(16).getNumericCellValue());
                subject.setDryMatter((float) row.getCell(17).getNumericCellValue());
                subject.setWater((float) row.getCell(18).getNumericCellValue());
                subject.vitamins.setVitaminA((float) row.getCell(19).getNumericCellValue());
                subject.vitamins.setRetinol((float) row.getCell(20).getNumericCellValue());
                subject.vitamins.setVitaminD((float) row.getCell(21).getNumericCellValue());
                subject.vitamins.setD3Cholecalciferol((float) row.getCell(22).getNumericCellValue());
                subject.vitamins.setD2Ergocalciferol((float) row.getCell(23).getNumericCellValue());
                subject.vitamins.set25hydroxycholecalciferol((float) row.getCell(24).getNumericCellValue());
                subject.vitamins.setVitaminE((float) row.getCell(25).getNumericCellValue());
                subject.vitamins.setAlphaTocopherol((float) row.getCell(26).getNumericCellValue());
                subject.vitamins.setGammaTocopherol((float) row.getCell(27).getNumericCellValue());
                subject.vitamins.setDeltaTocopherol((float) row.getCell(28).getNumericCellValue());
                subject.vitamins.setAlphaTokotrienol((float) row.getCell(29).getNumericCellValue());
                subject.vitamins.setVitaminK1((float) row.getCell(30).getNumericCellValue());
                subject.vitamins.setVitaminB1((float) row.getCell(31).getNumericCellValue());
                subject.vitamins.setThiamine((float) row.getCell(32).getNumericCellValue());
                subject.vitamins.setHydroxyethylthiazole((float) row.getCell(33).getNumericCellValue());
                subject.vitamins.setVitaminB2Riboflavin((float) row.getCell(34).getNumericCellValue());
                subject.vitamins.setNiacinEquivalent((float) row.getCell(35).getNumericCellValue());
                subject.vitamins.setNiacin((float) row.getCell(36).getNumericCellValue());
                subject.vitamins.setVitaminB6((float) row.getCell(37).getNumericCellValue());
                subject.vitamins.setPantothenic((float) row.getCell(38).getNumericCellValue());
                subject.vitamins.setFolate((float) row.getCell(39).getNumericCellValue());
                subject.vitamins.setB12((float) row.getCell(41).getNumericCellValue());
                subject.vitamins.setcVitamin((float) row.getCell(42).getNumericCellValue());
                subject.vitamins.setLAscorbicAcid((float) row.getCell(43).getNumericCellValue());
                subject.vitamins.setLDehydroascorbicAcid((float) row.getCell(44).getNumericCellValue());
                subject.minerals.setSulfur((float) row.getCell(45).getNumericCellValue());
                subject.minerals.setChloride((float) row.getCell(46).getNumericCellValue());
                subject.minerals.setSodium((float) row.getCell(47).getNumericCellValue());
                subject.minerals.setPotassium((float) row.getCell(48).getNumericCellValue());
                subject.minerals.setCalcium((float) row.getCell(49).getNumericCellValue());
                subject.minerals.setMagnesium((float) row.getCell(50).getNumericCellValue());
                subject.minerals.setPhosphorus((float) row.getCell(51).getNumericCellValue());
                subject.minerals.setIron((float) row.getCell(52).getNumericCellValue());
                subject.minerals.setCopper((float) row.getCell(53).getNumericCellValue());
                subject.minerals.setZink((float) row.getCell(54).getNumericCellValue());
                subject.minerals.setIodine((float) row.getCell(55).getNumericCellValue());
                subject.minerals.setManganese((float) row.getCell(56).getNumericCellValue());
                subject.minerals.setChromium((float) row.getCell(57).getNumericCellValue());
                subject.minerals.setSelenium((float) row.getCell(58).getNumericCellValue());
                subject.minerals.setMolybdenum((float) row.getCell(59).getNumericCellValue());
                subject.minerals.setColbalt((float) row.getCell(60).getNumericCellValue());
                subject.minerals.setNickel((float) row.getCell(61).getNumericCellValue());
                subject.minerals.setFluoron((float) row.getCell(62).getNumericCellValue());
                subject.minerals.setSilicon((float) row.getCell(63).getNumericCellValue());
                subject.minerals.setRubidium((float) row.getCell(64).getNumericCellValue());
                subject.minerals.setAluminum((float) row.getCell(65).getNumericCellValue());
                subject.minerals.setBoron((float) row.getCell(66).getNumericCellValue());
                subject.minerals.setBromine((float) row.getCell(67).getNumericCellValue());
                subject.minerals.setMercury((float) row.getCell(68).getNumericCellValue());
                subject.minerals.setArsenic((float) row.getCell(69).getNumericCellValue());
                subject.minerals.setCadmium((float) row.getCell(70).getNumericCellValue());
                subject.minerals.setLead((float) row.getCell(71).getNumericCellValue());
                subject.minerals.setTin((float) row.getCell(72).getNumericCellValue());
                subject.organicAcids.setlLacticAcid((float) row.getCell(73).getNumericCellValue());
                subject.organicAcids.setdLacticAcid((float) row.getCell(74).getNumericCellValue());
                subject.organicAcids.setLaticAcidTotal((float) row.getCell(75).getNumericCellValue());
                subject.organicAcids.setCitricAcid((float) row.getCell(76).getNumericCellValue());
                subject.organicAcids.setOxalicAcid((float) row.getCell(77).getNumericCellValue());
                subject.organicAcids.setMalicAcid((float) row.getCell(78).getNumericCellValue());
                subject.organicAcids.setAceticAcid((float) row.getCell(79).getNumericCellValue());
                subject.organicAcids.setBenzoicAcid((float) row.getCell(80).getNumericCellValue());
                subject.organicAcids.setSorbicAcid((float) row.getCell(81).getNumericCellValue());
                subject.organicAcids.setPropionic((float) row.getCell(82).getNumericCellValue());
                subject.organicAcids.setOrganicAcidsTotal((float) row.getCell(83).getNumericCellValue());
                subject.biogeneamines.setHistamine((float) row.getCell(84).getNumericCellValue());
                subject.biogeneamines.setTyramine((float) row.getCell(85).getNumericCellValue());
                subject.biogeneamines.setPhenylethylamine((float) row.getCell(86).getNumericCellValue());
                subject.biogeneamines.setPutrescine((float) row.getCell(87).getNumericCellValue());
                subject.biogeneamines.setCadaverine((float) row.getCell(88).getNumericCellValue());
                subject.biogeneamines.setSpermine((float) row.getCell(89).getNumericCellValue());
                subject.biogeneamines.setSpermidine((float) row.getCell(90).getNumericCellValue());
                subject.biogeneamines.setSerotonin((float) row.getCell(91).getNumericCellValue());
                subject.carbohydrates.setFructose((float) row.getCell(92).getNumericCellValue());
                subject.carbohydrates.setGalactose((float) row.getCell(93).getNumericCellValue());
                subject.carbohydrates.setGlucose((float) row.getCell(94).getNumericCellValue());
                subject.carbohydrates.setMonosaccharidesTotal((float) row.getCell(95).getNumericCellValue());
                subject.carbohydrates.setLactose((float) row.getCell(96).getNumericCellValue());
                subject.carbohydrates.setMaltose((float) row.getCell(97).getNumericCellValue());
                subject.carbohydrates.setSucrose((float) row.getCell(98).getNumericCellValue());
                subject.carbohydrates.setDisaccharidesTotal((float) row.getCell(99).getNumericCellValue());
                subject.carbohydrates.setMaltotriose((float) row.getCell(100).getNumericCellValue());
                subject.carbohydrates.setRaffinose((float) row.getCell(101).getNumericCellValue());
                subject.carbohydrates.setOtherSugars((float) row.getCell(102).getNumericCellValue());
                subject.carbohydrates.setSugarsTotal((float) row.getCell(103).getNumericCellValue());
                subject.carbohydrates.setSorbitol((float) row.getCell(104).getNumericCellValue());
                subject.carbohydrates.setMannitol((float) row.getCell(105).getNumericCellValue());
                subject.carbohydrates.setInositol((float) row.getCell(106).getNumericCellValue());
                subject.carbohydrates.setMaltitol((float) row.getCell(107).getNumericCellValue());
                subject.carbohydrates.setSugarAlcoholsTotal((float) row.getCell(108).getNumericCellValue());
                subject.carbohydrates.setStarch((float) row.getCell(109).getNumericCellValue());
                subject.carbohydrates.setIDF((float) row.getCell(110).getNumericCellValue());
                subject.carbohydrates.setSDFP((float) row.getCell(111).getNumericCellValue());
                subject.carbohydrates.setSDFS((float) row.getCell(112).getNumericCellValue());
                subject.carbohydrates.setaHexoses((float) row.getCell(113).getNumericCellValue());
                subject.carbohydrates.setbThePentoses((float) row.getCell(114).getNumericCellValue());
                subject.carbohydrates.setcUronicAcids((float) row.getCell(115).getNumericCellValue());
                subject.carbohydrates.setCellulose((float) row.getCell(116).getNumericCellValue());
                subject.carbohydrates.setLignin((float) row.getCell(117).getNumericCellValue());
                subject.carbohydrates.setCrudeFibers((float) row.getCell(118).getNumericCellValue());
                subject.carbohydrates.setNaturalDietFibre((float) row.getCell(119).getNumericCellValue());
                subject.saturatedFattyAcids.setC40((float) row.getCell(120).getNumericCellValue());
                subject.saturatedFattyAcids.setC60((float) row.getCell(121).getNumericCellValue());
                subject.saturatedFattyAcids.setC80((float) row.getCell(122).getNumericCellValue());
                subject.saturatedFattyAcids.setC100((float) row.getCell(123).getNumericCellValue());
                subject.saturatedFattyAcids.setC120((float) row.getCell(124).getNumericCellValue());
                subject.saturatedFattyAcids.setC130((float) row.getCell(125).getNumericCellValue());
                subject.saturatedFattyAcids.setC140((float) row.getCell(126).getNumericCellValue());
                subject.saturatedFattyAcids.setC150((float) row.getCell(127).getNumericCellValue());
                subject.saturatedFattyAcids.setC160((float) row.getCell(128).getNumericCellValue());
                subject.saturatedFattyAcids.setC170((float) row.getCell(129).getNumericCellValue());
                subject.saturatedFattyAcids.setC180((float) row.getCell(130).getNumericCellValue());
                subject.saturatedFattyAcids.setC200((float) row.getCell(131).getNumericCellValue());
                subject.saturatedFattyAcids.setC210((float) row.getCell(132).getNumericCellValue());
                subject.saturatedFattyAcids.setC220((float) row.getCell(133).getNumericCellValue());
                subject.saturatedFattyAcids.setC230((float) row.getCell(134).getNumericCellValue());
                subject.saturatedFattyAcids.setC240((float) row.getCell(135).getNumericCellValue());
                subject.saturatedFattyAcids.setOther((float) row.getCell(136).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC141n5((float) row.getCell(137).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC151((float) row.getCell(138).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC161n7((float) row.getCell(139).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC171n7((float) row.getCell(140).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC181n9((float) row.getCell(141).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC181n7((float) row.getCell(142).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC201n9((float) row.getCell(143).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC201n11((float) row.getCell(144).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC221n9((float) row.getCell(145).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC201n11((float) row.getCell(146).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC221n9((float) row.getCell(147).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC221n11((float) row.getCell(148).getNumericCellValue());
                subject.monosaturatedFattyAcids.setC241n9((float) row.getCell(149).getNumericCellValue());
                subject.monosaturatedFattyAcids.setOther((float) row.getCell(150).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC182n6((float) row.getCell(151).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC182((float) row.getCell(152).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC183n3((float) row.getCell(153).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC183n6((float) row.getCell(154).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC184n3((float) row.getCell(155).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC202n6((float) row.getCell(156).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC222n6((float) row.getCell(157).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC224n6((float) row.getCell(158).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC225n6((float) row.getCell(159).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC203n3((float) row.getCell(160).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC204n3((float) row.getCell(161).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC203n6((float) row.getCell(162).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC204n6((float) row.getCell(163).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC205n3((float) row.getCell(164).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC225n3((float) row.getCell(165).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setC226n3((float) row.getCell(166).getNumericCellValue());
                subject.polyunsaturatedFattyAcids.setOther((float) row.getCell(167).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC141Trans9((float) row.getCell(168).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC161Trans((float) row.getCell(169).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC181TransN9((float) row.getCell(170).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC201Trans((float) row.getCell(171).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC221Trans((float) row.getCell(172).getNumericCellValue());
                subject.monounsaturatedFattyAcids.setC182TransUndifferentiated((float) row.getCell(173).getNumericCellValue());
                subject.fattyAcidsSums.setOtherFattyAcids((float) row.getCell(174).getNumericCellValue());
                subject.fattyAcidsSums.setSumSaturated((float) row.getCell(175).getNumericCellValue());
                subject.fattyAcidsSums.setSumMonounsaturated((float) row.getCell(176).getNumericCellValue());
                subject.fattyAcidsSums.setSumPolyunsaturated((float) row.getCell(177).getNumericCellValue());
                subject.fattyAcidsSums.setTransFattyAcidsTotal((float) row.getCell(178).getNumericCellValue());
                subject.fattyAcidsSums.setFattyAcidsTotal((float) row.getCell(179).getNumericCellValue());
                subject.fattyAcidsSums.setSumN3FattyAcids((float) row.getCell(180).getNumericCellValue());
                subject.fattyAcidsSums.setSumN6FattyAcids((float) row.getCell(181).getNumericCellValue());
                subject.sterols.setCholesterol((int) row.getCell(182).getNumericCellValue());
                subject.aminoAcids.setIsoleucine((int) row.getCell(183).getNumericCellValue());
                subject.aminoAcids.setLeucine((int) row.getCell(184).getNumericCellValue());
                subject.aminoAcids.setLysine((int) row.getCell(185).getNumericCellValue());
                subject.aminoAcids.setMethionine((int) row.getCell(186).getNumericCellValue());
                subject.aminoAcids.setCystine((int) row.getCell(187).getNumericCellValue());
                subject.aminoAcids.setPhenylalanine((int) row.getCell(188).getNumericCellValue());
                subject.aminoAcids.setTyrosine((int) row.getCell(189).getNumericCellValue());
                subject.aminoAcids.setThreonine((int) row.getCell(190).getNumericCellValue());
                subject.aminoAcids.setTryptophan((int) row.getCell(191).getNumericCellValue());
                subject.aminoAcids.setValin((int) row.getCell(192).getNumericCellValue());
                subject.aminoAcids.setArginine((int) row.getCell(193).getNumericCellValue());
                subject.aminoAcids.setHistidine((int) row.getCell(194).getNumericCellValue());
                subject.aminoAcids.setAlanine((int) row.getCell(195).getNumericCellValue());
                subject.aminoAcids.setAsparticAcid((int) row.getCell(196).getNumericCellValue());
                subject.aminoAcids.setGlutamicAcid((int) row.getCell(197).getNumericCellValue());
                subject.aminoAcids.setGlycine((int) row.getCell(198).getNumericCellValue());
                subject.aminoAcids.setProline((int) row.getCell(199).getNumericCellValue());
                subject.aminoAcids.setHydroxyproline((int) row.getCell(200).getNumericCellValue());
                subject.aminoAcids.setSerin((int) row.getCell(201).getNumericCellValue());
                subject.aminoAcids.setBetaCarotene((int) row.getCell(202).getNumericCellValue());
                
        } catch (FileNotFoundException fileNotFoundException) {System.out.println(fileNotFoundException);}
    }    
}
