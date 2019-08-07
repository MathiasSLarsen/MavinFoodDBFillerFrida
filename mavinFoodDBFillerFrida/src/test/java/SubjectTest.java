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
        
        FileInputStream file = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\Food App\\Frida20190612\\Frida20190612en.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(1);
            
        FileInputStream file2 = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\Food App\\Frida20190612\\Frida20190612da.xlsx"));
        Workbook workbook2 = new XSSFWorkbook(file2);
        Sheet sheet2 = workbook2.getSheetAt(1);
        
        
        for (int i = 0; i < xml.getSubjectArray().size(); i++){
            org.apache.poi.ss.usermodel.Row row = sheet.getRow(i);
            org.apache.poi.ss.usermodel.Row row2 = sheet2.getRow(i);
            Subject subject = xml.getSubjectArray().get(i);
            
            assertEquals(subject.getName(),row.getCell(1).getStringCellValue());
        }   
    }
// TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
