/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavinfooddbfillerfrida.DTO;
import com.mycompany.mavinfooddbfillerfrida.XMLParser;
import com.mycompany.mavinfooddbfillerfrida.model.Subject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class DBTest {
    
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void DBTest() throws IOException, Exception{
        DTO dto = new DTO();
        XMLParser xml = new XMLParser();
        xml.Makeobjects();
        int IID;
        double d = 0.0000001;
        Subject subject = null;
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select idIngredient, nameEN from ingredient;");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            IID = rs.getInt("idIngredient");
            for(int i = 0; i < xml.getSubjectArray().size(); i++){
                if(rs.getString("nameEN").equals(xml.getSubjectArray().get(i).getName())){
                    subject = xml.getSubjectArray().get(i);
                    break;
                }
            }
            statement = conn.prepareStatement("select * from ingredient where idIngredient ="+IID+";");
            ResultSet rs2 = statement.executeQuery();
            
            assertEquals(rs2.getInt("kj"), subject.getKj());
            assertEquals(rs2.getInt("kcal"), subject.getKcal());
            assertEquals(rs2.getFloat("totalN"), subject.getTotalN(), d);
            assertEquals(rs2.getFloat("protien"), subject.getProtien(), d);
            assertEquals(rs2.getFloat("carbohydrates"), subject.getCarbohydrates() ,d);
            assertEquals(rs2.getFloat("addedSugar"), subject.getAddedSugar() ,d);
            assertEquals(rs2.getFloat("fat"), subject.getFat() ,d);
            assertEquals(rs2.getFloat("fiber"), subject.getFiber() ,d);
            assertEquals(rs2.getFloat("alcohol"), subject.getAlcohol() ,d);
            assertEquals(rs2.getFloat("ash"), subject.getAsh() ,d);
            assertEquals(rs2.getFloat("dryMatter"), subject.getDryMatter() ,d);
            assertEquals(rs2.getFloat("water"), subject.getWater() ,d);
            assertEquals(rs2.getString("DB"), subject.getDB());
            
            
        }
    }
}
