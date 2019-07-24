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
                
            
        } catch (FileNotFoundException fileNotFoundException) {System.out.println(fileNotFoundException);}
    }    
}
