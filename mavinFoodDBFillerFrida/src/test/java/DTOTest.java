/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavinfooddbfillerfrida.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class DTOTest {
    static DTO dto = new DTO();
    static double delta = 0.1;
    static int IID;
    static int PID;
    
    public DTOTest() throws Exception {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        dto.uploadIngredient("testIngredient", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, "testDB");
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from ingredient where nameEN = 'testIngredient';");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testIngredient", rs.getString("nameEN"));
            assertEquals(1, rs.getInt("kj"));
            assertEquals(2, rs.getInt("kcal"));
            assertEquals(3, rs.getFloat("totalN"), delta);
            assertEquals(4, rs.getFloat("protien"), delta);
            assertEquals(5, rs.getFloat("carbohydrates"), delta);
            assertEquals(6, rs.getFloat("addedSugar"), delta);
            assertEquals(7, rs.getFloat("fat"), delta);
            assertEquals(8, rs.getFloat("fiber"), delta);
            assertEquals(9, rs.getFloat("alcohol"), delta);
            assertEquals(10, rs.getFloat("ash"), delta);
            assertEquals(11, rs.getFloat("dryMatter"), delta);
            assertEquals(12, rs.getFloat("water"), delta);
            assertEquals("testDB", rs.getString("DB"));
        }else{
            fail();
        }
        IID = dto.getIngridentId("testIngredient");
    
        dto.uploadProduct("testProduct", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, "testDB");
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from product where nameEN = 'testProduct';");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testProduct", rs.getString("nameEN"));
            assertEquals(1, rs.getInt("kj"));
            assertEquals(2, rs.getInt("kcal"));
            assertEquals(3, rs.getFloat("totalN"), delta);
            assertEquals(4, rs.getFloat("protien"), delta);
            assertEquals(5, rs.getFloat("carbohydrates"), delta);
            assertEquals(6, rs.getFloat("addedSugar"),delta);
            assertEquals(7, rs.getFloat("fat"),delta);
            assertEquals(8, rs.getFloat("fiber"),delta);
            assertEquals(9, rs.getFloat("alcohol"),delta);
            assertEquals(10, rs.getFloat("ash"),delta);
            assertEquals(11, rs.getFloat("dryMatter"),delta);
            assertEquals(12, rs.getFloat("water"),delta);
            assertEquals("testDB", rs.getString("DB"));
        }else{
            fail();
        }
        PID = dto.getProductId("testProduct");
        System.out.println("køre jeg mere en 1 gang????");
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        
        IID = dto.getIngridentId("testIngredient");
        PID = dto.getProductId("testProduct");
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("delete from ingredient where idIngredient = "+IID+";");
        statement.execute();
        
        statement = conn.prepareStatement("delete from product where idproduct ="+PID+";");
        statement.execute();
        System.out.println("I should run last!!!");

    }
    
    @Before
    public void setUp() throws Exception {
        
    }
    
    @After
    public void tearDown() throws SQLException, Exception {
        
    }
/*
    @Test
    public void uploadIngrdientTest() throws Exception{
        dto.uploadIngredient("testIngredient", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, "testDB");
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from ingredient where nameEN = 'testIngredient';");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testIngredient", rs.getString("nameEN"));
            assertEquals(1, rs.getInt("kj"));
            assertEquals(2, rs.getInt("kcal"));
            assertEquals(3, rs.getFloat("totalN"), delta);
            assertEquals(4, rs.getFloat("protien"), delta);
            assertEquals(5, rs.getFloat("carbohydrates"), delta);
            assertEquals(6, rs.getFloat("addedSugar"), delta);
            assertEquals(7, rs.getFloat("fat"), delta);
            assertEquals(8, rs.getFloat("fiber"), delta);
            assertEquals(9, rs.getFloat("alcohol"), delta);
            assertEquals(10, rs.getFloat("ash"), delta);
            assertEquals(11, rs.getFloat("dryMatter"), delta);
            assertEquals(12, rs.getFloat("water"), delta);
            assertEquals("testDB", rs.getString("DB"));
        }else{
            fail();
        }
        IID = dto.getIngridentId("testingredient");
    
    }
    
    @Test
    public void uploadProductTest() throws Exception{
        dto.uploadProduct("testProduct", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, "testDB");
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from product where nameEN = 'testProduct';");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testProduct", rs.getString("nameEN"));
            assertEquals(1, rs.getInt("kj"));
            assertEquals(2, rs.getInt("kcal"));
            assertEquals(3, rs.getFloat("totalN"), delta);
            assertEquals(4, rs.getFloat("protien"), delta);
            assertEquals(5, rs.getFloat("carbohydrates"), delta);
            assertEquals(6, rs.getFloat("addedSugar"),delta);
            assertEquals(7, rs.getFloat("fat"),delta);
            assertEquals(8, rs.getFloat("fiber"),delta);
            assertEquals(9, rs.getFloat("alcohol"),delta);
            assertEquals(10, rs.getFloat("ash"),delta);
            assertEquals(11, rs.getFloat("dryMatter"),delta);
            assertEquals(12, rs.getFloat("water"),delta);
            assertEquals("testDB", rs.getString("DB"));
        }else{
            fail();
        }
        PID = dto.getIngridentId("testProduct");
    }
    */
    @Test
    public void uploadAllergensTest() throws Exception{
        
        dto.uploadAllergens(1, 2, 3, 4, 5, 6, 7, 8, 9, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from allergens where ingredient_idIngredient = "+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getInt("gluten"));
            assertEquals(2, rs.getInt("milk"));
            assertEquals(3, rs.getInt("egg"));
            assertEquals(4, rs.getInt("peanut"));
            assertEquals(5, rs.getInt("soy"));
            assertEquals(6, rs.getInt("wheat"));
            assertEquals(7, rs.getInt("fish"));
            assertEquals(8, rs.getInt("shellfish"));
            assertEquals(9, rs.getInt("sesame"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadAllergens(1, 2, 3, 4, 5, 6, 7, 8, 9, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from allergens where product_idProduct = "+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getInt("gluten"));
            assertEquals(2, rs.getInt("milk"));
            assertEquals(3, rs.getInt("egg"));
            assertEquals(4, rs.getInt("peanut"));
            assertEquals(5, rs.getInt("soy"));
            assertEquals(6, rs.getInt("wheat"));
            assertEquals(7, rs.getInt("fish"));
            assertEquals(8, rs.getInt("shellfish"));
            assertEquals(9, rs.getInt("sesame"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadAminoAcidsTest() throws Exception{
        dto.uploadAminoAcids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from aminoacids where ingredient_idIngredient = "+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getInt("isoleucine"));
            assertEquals(2, rs.getInt("leucine"));
            assertEquals(3, rs.getInt("lysine"));
            assertEquals(4, rs.getInt("methionine"));
            assertEquals(5, rs.getInt("cystine"));
            assertEquals(6, rs.getInt("phenylalanine"));
            assertEquals(7, rs.getInt("tyrosine"));
            assertEquals(8, rs.getInt("threonine"));
            assertEquals(9, rs.getInt("tryptophan"));
            assertEquals(10, rs.getInt("valin"));
            assertEquals(11, rs.getInt("arginine"));
            assertEquals(12, rs.getInt("histidine"));
            assertEquals(13, rs.getInt("alanine"));
            assertEquals(14, rs.getInt("asparticAcid"));
            assertEquals(15, rs.getInt("glutamicAcid"));
            assertEquals(16, rs.getInt("glycine"));
            assertEquals(17, rs.getInt("proline"));
            assertEquals(18, rs.getInt("hydroxyproline"));
            assertEquals(19, rs.getInt("serin"));
            assertEquals(20, rs.getInt("betaCarotene"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idproduct"));        
        }else{
            fail();
        }
        
        dto.uploadAminoAcids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from aminoacids where product_idproduct = "+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getInt("isoleucine"));
            assertEquals(2, rs.getInt("leucine"));
            assertEquals(3, rs.getInt("lysine"));
            assertEquals(4, rs.getInt("methionine"));
            assertEquals(5, rs.getInt("cystine"));
            assertEquals(6, rs.getInt("phenylalanine"));
            assertEquals(7, rs.getInt("tyrosine"));
            assertEquals(8, rs.getInt("threonine"));
            assertEquals(9, rs.getInt("tryptophan"));
            assertEquals(10, rs.getInt("valin"));
            assertEquals(11, rs.getInt("arginine"));
            assertEquals(12, rs.getInt("histidine"));
            assertEquals(13, rs.getInt("alanine"));
            assertEquals(14, rs.getInt("asparticAcid"));
            assertEquals(15, rs.getInt("glutamicAcid"));
            assertEquals(16, rs.getInt("glycine"));
            assertEquals(17, rs.getInt("proline"));
            assertEquals(18, rs.getInt("hydroxyproline"));
            assertEquals(19, rs.getInt("serin"));
            assertEquals(20, rs.getInt("betaCarotene"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idproduct"));        
        }else{
            fail();
        }
    
    }
    
    @Test
    public void uploadcarbohydratesTest() throws Exception{
        dto.uploadcarbohydrates(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from carbohydrates where ingredient_idIngredient = "+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("fructose"), delta);
            assertEquals(2, rs.getFloat("galactose"), delta);
            assertEquals(3, rs.getFloat("glucose"), delta);
            assertEquals(4, rs.getFloat("monosaccharidesTotal"), delta);
            assertEquals(5, rs.getFloat("lactose"), delta);
            assertEquals(6, rs.getFloat("maltose"), delta);
            assertEquals(7, rs.getFloat("sucrose"), delta);
            assertEquals(8, rs.getFloat("disaccharidesTotal"), delta);
            assertEquals(9, rs.getFloat("maltotriose"), delta);
            assertEquals(10, rs.getFloat("raffinose"), delta);
            assertEquals(11, rs.getFloat("otherSugars"), delta);
            assertEquals(12, rs.getFloat("sugarsTotal"), delta);
            assertEquals(13, rs.getFloat("sorbitol"), delta);
            assertEquals(14, rs.getFloat("mannitol"), delta);
            assertEquals(15, rs.getFloat("inositol"), delta);
            assertEquals(16, rs.getFloat("maltitol"), delta);
            assertEquals(17, rs.getFloat("sugarAlcoholsTotal"), delta);
            assertEquals(18, rs.getFloat("starch"), delta);
            assertEquals(19, rs.getFloat("IDF"), delta);
            assertEquals(20, rs.getFloat("SDFP"), delta);
            assertEquals(21, rs.getFloat("SDFS"), delta);
            assertEquals(22, rs.getFloat("(a)Hexoses"), delta);
            assertEquals(23, rs.getFloat("(b)ThePentoses"), delta);
            assertEquals(24, rs.getFloat("(c)UronicAcids"), delta);
            assertEquals(25, rs.getFloat("cellulose"), delta);
            assertEquals(26, rs.getFloat("lignin"), delta);
            assertEquals(27, rs.getFloat("crudeFibers"), delta);
            assertEquals(28, rs.getFloat("naturalDietFibre"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idproduct"));
        }else{
            fail();
        }
        dto.uploadcarbohydrates(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from carbohydrates where product_idProduct = "+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("fructose"), delta);
            assertEquals(2, rs.getFloat("galactose"), delta);
            assertEquals(3, rs.getFloat("glucose"), delta);
            assertEquals(4, rs.getFloat("monosaccharidesTotal"), delta);
            assertEquals(5, rs.getFloat("lactose"), delta);
            assertEquals(6, rs.getFloat("maltose"), delta);
            assertEquals(7, rs.getFloat("sucrose"), delta);
            assertEquals(8, rs.getFloat("disaccharidesTotal"), delta);
            assertEquals(9, rs.getFloat("maltotriose"), delta);
            assertEquals(10, rs.getFloat("raffinose"), delta);
            assertEquals(11, rs.getFloat("otherSugars"), delta);
            assertEquals(12, rs.getFloat("sugarsTotal"), delta);
            assertEquals(13, rs.getFloat("sorbitol"), delta);
            assertEquals(14, rs.getFloat("mannitol"), delta);
            assertEquals(15, rs.getFloat("inositol"), delta);
            assertEquals(16, rs.getFloat("maltitol"), delta);
            assertEquals(17, rs.getFloat("sugarAlcoholsTotal"), delta);
            assertEquals(18, rs.getFloat("starch"), delta);
            assertEquals(19, rs.getFloat("IDF"), delta);
            assertEquals(20, rs.getFloat("SDFP"), delta);
            assertEquals(21, rs.getFloat("SDFS"), delta);
            assertEquals(22, rs.getFloat("(a)Hexoses"), delta);
            assertEquals(23, rs.getFloat("(b)ThePentoses"), delta);
            assertEquals(24, rs.getFloat("(c)UronicAcids"), delta);
            assertEquals(25, rs.getFloat("cellulose"), delta);
            assertEquals(26, rs.getFloat("lignin"), delta);
            assertEquals(27, rs.getFloat("crudeFibers"), delta);
            assertEquals(28, rs.getFloat("naturalDietFibre"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idproduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadColorTest() throws Exception{
        dto.uploadcolor("test", IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from color where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("test", rs.getString("name"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        dto.uploadcolor("test", PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from color where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("test", rs.getString("name"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadFactorsTest() throws Exception{
        dto.uploadFactors(1, 2, 3, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from factors where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("waste"), delta);
            assertEquals(2, rs.getFloat("proteinConversionFactor"), delta);
            assertEquals(3, rs.getFloat("fattyAcidConversionFactor"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadFactors(1, 2, 3, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from factors where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("waste"), delta);
            assertEquals(2, rs.getFloat("proteinConversionFactor"), delta);
            assertEquals(3, rs.getFloat("fattyAcidConversionFactor"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadFattyAcidsSumsTest() throws Exception{
        dto.uploadFattyacidssums(1, 2, 3, 4, 5, 6, 7, 8, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from fattyacidssums where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("otherFattyAcids"), delta);
            assertEquals(2, rs.getFloat("sumSaturated"), delta);
            assertEquals(3, rs.getFloat("sumMonounsaturated"), delta);
            assertEquals(4, rs.getFloat("sumPolyunsaturated"), delta);
            assertEquals(5, rs.getFloat("transFattyAcidsTotal"), delta);
            assertEquals(6, rs.getFloat("fattyAcidsTotal"), delta);
            assertEquals(7, rs.getFloat("sumN-3FattyAcids"), delta);
            assertEquals(8, rs.getFloat("sumN-6FattyAcids"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadFattyacidssums(1, 2, 3, 4, 5, 6, 7, 8, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from fattyacidssums where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("otherFattyAcids"), delta);
            assertEquals(2, rs.getFloat("sumSaturated"), delta);
            assertEquals(3, rs.getFloat("sumMonounsaturated"), delta);
            assertEquals(4, rs.getFloat("sumPolyunsaturated"), delta);
            assertEquals(5, rs.getFloat("transFattyAcidsTotal"), delta);
            assertEquals(6, rs.getFloat("fattyAcidsTotal"), delta);
            assertEquals(7, rs.getFloat("sumN-3FattyAcids"), delta);
            assertEquals(8, rs.getFloat("sumN-6FattyAcids"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadFoodGroupTest() throws Exception{
        dto.uploadfoodGroup("testIngredient", IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from foodgroup where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testIngredient", rs.getString("name"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadfoodGroup("testProduct", PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from foodgroup where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testProduct", rs.getString("name"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadMineralsTest() throws Exception{
        dto.uploadMinerals(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from minerals where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("sulfur"), delta);
            assertEquals(2, rs.getFloat("chloride"), delta);
            assertEquals(3, rs.getFloat("sodium"), delta);
            assertEquals(4, rs.getFloat("potassium"), delta);
            assertEquals(5, rs.getFloat("calcium"), delta);
            assertEquals(6, rs.getFloat("magnesium"), delta);
            assertEquals(7, rs.getFloat("phosphorus"), delta);
            assertEquals(8, rs.getFloat("iron"), delta);
            assertEquals(9, rs.getFloat("copper"), delta);
            assertEquals(10, rs.getFloat("zink"), delta);
            assertEquals(11, rs.getFloat("iodine"), delta);
            assertEquals(12, rs.getFloat("manganese"), delta);
            assertEquals(13, rs.getFloat("chromium"), delta);
            assertEquals(14, rs.getFloat("selenium"), delta);
            assertEquals(15, rs.getFloat("molybdenum"), delta);
            assertEquals(16, rs.getFloat("colbalt"), delta);
            assertEquals(17, rs.getFloat("nickel"), delta);
            assertEquals(18, rs.getFloat("fluoron"), delta);
            assertEquals(19, rs.getFloat("silicon"), delta);
            assertEquals(20, rs.getFloat("rubidium"), delta);
            assertEquals(21, rs.getFloat("aluminum"), delta);
            assertEquals(22, rs.getFloat("boron"), delta);
            assertEquals(23, rs.getFloat("bromine"), delta);
            assertEquals(24, rs.getFloat("mercury"), delta);
            assertEquals(25, rs.getFloat("arsenic"), delta);
            assertEquals(26, rs.getFloat("cadmium"), delta);
            assertEquals(27, rs.getFloat("leadMineral"), delta);
            assertEquals(28, rs.getFloat("tin"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadMinerals(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from minerals where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("sulfur"), delta);
            assertEquals(2, rs.getFloat("chloride"), delta);
            assertEquals(3, rs.getFloat("sodium"), delta);
            assertEquals(4, rs.getFloat("potassium"), delta);
            assertEquals(5, rs.getFloat("calcium"), delta);
            assertEquals(6, rs.getFloat("magnesium"), delta);
            assertEquals(7, rs.getFloat("phosphorus"), delta);
            assertEquals(8, rs.getFloat("iron"), delta);
            assertEquals(9, rs.getFloat("copper"), delta);
            assertEquals(10, rs.getFloat("zink"), delta);
            assertEquals(11, rs.getFloat("iodine"), delta);
            assertEquals(12, rs.getFloat("manganese"), delta);
            assertEquals(13, rs.getFloat("chromium"), delta);
            assertEquals(14, rs.getFloat("selenium"), delta);
            assertEquals(15, rs.getFloat("molybdenum"), delta);
            assertEquals(16, rs.getFloat("colbalt"), delta);
            assertEquals(17, rs.getFloat("nickel"), delta);
            assertEquals(18, rs.getFloat("fluoron"), delta);
            assertEquals(19, rs.getFloat("silicon"), delta);
            assertEquals(20, rs.getFloat("rubidium"), delta);
            assertEquals(21, rs.getFloat("aluminum"), delta);
            assertEquals(22, rs.getFloat("boron"), delta);
            assertEquals(23, rs.getFloat("bromine"), delta);
            assertEquals(24, rs.getFloat("mercury"), delta);
            assertEquals(25, rs.getFloat("arsenic"), delta);
            assertEquals(26, rs.getFloat("cadmium"), delta);
            assertEquals(27, rs.getFloat("leadMineral"), delta);
            assertEquals(28, rs.getFloat("tin"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadMonounsaturatedFattyAcidsTest() throws Exception{
        dto.uploadMonounsaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from monounsaturatedfattyacids where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c14:1n-5"), delta);
            assertEquals(2, rs.getFloat("c15:1"), delta);
            assertEquals(3, rs.getFloat("c16:1n-7"), delta);
            assertEquals(4, rs.getFloat("c17:1n-7"), delta);
            assertEquals(5, rs.getFloat("c18:1n-9"), delta);
            assertEquals(6, rs.getFloat("c18:1n-7"), delta);
            assertEquals(7, rs.getFloat("c20:1n-9"), delta);
            assertEquals(8, rs.getFloat("c20:1n-11"), delta);
            assertEquals(9, rs.getFloat("c22:1n-9"), delta);
            assertEquals(10, rs.getFloat("c22:1n-11"), delta);
            assertEquals(11, rs.getFloat("c24:1n-9"), delta);
            assertEquals(12, rs.getFloat("other"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadMonounsaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from monounsaturatedfattyacids where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c14:1n-5"), delta);
            assertEquals(2, rs.getFloat("c15:1"), delta);
            assertEquals(3, rs.getFloat("c16:1n-7"), delta);
            assertEquals(4, rs.getFloat("c17:1n-7"), delta);
            assertEquals(5, rs.getFloat("c18:1n-9"), delta);
            assertEquals(6, rs.getFloat("c18:1n-7"), delta);
            assertEquals(7, rs.getFloat("c20:1n-9"), delta);
            assertEquals(8, rs.getFloat("c20:1n-11"), delta);
            assertEquals(9, rs.getFloat("c22:1n-9"), delta);
            assertEquals(10, rs.getFloat("c22:1n-11"), delta);
            assertEquals(11, rs.getFloat("c24:1n-9"), delta);
            assertEquals(12, rs.getFloat("other"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadMonounsaturatedFattyAcidsTransTest() throws Exception{
        dto.uploadMonounsaturatedfattyacidsTrans(1, 2, 3, 4, 5, 6, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from monounsaturatedfattyacidstrans where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            assertEquals(1, rs.getFloat("c14:1Trans-9"),delta);
            assertEquals(2, rs.getFloat("c16:1Trans"),delta);
            assertEquals(3, rs.getFloat("c18:1Trans-n-9"),delta);
            assertEquals(4, rs.getFloat("c20:1Trans"),delta);
            assertEquals(5, rs.getFloat("c22:1Trans"),delta);
            assertEquals(6, rs.getFloat("c18:2TransUndifferentiated"),delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadMonounsaturatedfattyacidsTrans(1, 2, 3, 4, 5, 6, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from monounsaturatedfattyacidstrans where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if (rs.next()){
            assertEquals(1, rs.getFloat("c14:1Trans-9"),delta);
            assertEquals(2, rs.getFloat("c16:1Trans"),delta);
            assertEquals(3, rs.getFloat("c18:1Trans-n-9"),delta);
            assertEquals(4, rs.getFloat("c20:1Trans"),delta);
            assertEquals(5, rs.getFloat("c22:1Trans"),delta);
            assertEquals(6, rs.getFloat("c18:2TransUndifferentiated"),delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadNameTest() throws Exception{
        dto.uploadName("testName", IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from namelang where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testName", rs.getString("dk"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadName("testNameProduct", PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from namelang where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testNameProduct", rs.getString("dk"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadPolyunsaturatedFattyAcidsTest() throws Exception{
        dto.uploadPolyunsaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from polyunsaturatedfattyacids where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c18:2n-6"), delta);
            assertEquals(2, rs.getFloat("c18:2"), delta);
            assertEquals(3, rs.getFloat("c18:3n-3"), delta);
            assertEquals(4, rs.getFloat("c18:3n-6"), delta);
            assertEquals(5, rs.getFloat("c18:4n-3"), delta);
            assertEquals(6, rs.getFloat("c20:2n-6"), delta);
            assertEquals(7, rs.getFloat("c22:2n-6"), delta);
            assertEquals(8, rs.getFloat("c22:4n-6"), delta);
            assertEquals(9, rs.getFloat("c22:5n-6"), delta);
            assertEquals(10, rs.getFloat("c20:3n-3"), delta);
            assertEquals(11, rs.getFloat("c20:4n-3"), delta);
            assertEquals(12, rs.getFloat("c20:3n-6"), delta);
            assertEquals(13, rs.getFloat("c20:4n-6"), delta);
            assertEquals(14, rs.getFloat("c20:5n-3"), delta);
            assertEquals(15, rs.getFloat("c22:5n-3"), delta);
            assertEquals(16, rs.getFloat("c22:6n-3"), delta);
            assertEquals(17, rs.getFloat("other"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idproduct"));
        }else{
            fail();
        }
        
        dto.uploadPolyunsaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from polyunsaturatedfattyacids where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c18:2n-6"), delta);
            assertEquals(2, rs.getFloat("c18:2"), delta);
            assertEquals(3, rs.getFloat("c18:3n-3"), delta);
            assertEquals(4, rs.getFloat("c18:3n-6"), delta);
            assertEquals(5, rs.getFloat("c18:4n-3"), delta);
            assertEquals(6, rs.getFloat("c20:2n-6"), delta);
            assertEquals(7, rs.getFloat("c22:2n-6"), delta);
            assertEquals(8, rs.getFloat("c22:4n-6"), delta);
            assertEquals(9, rs.getFloat("c22:5n-6"), delta);
            assertEquals(10, rs.getFloat("c20:3n-3"), delta);
            assertEquals(11, rs.getFloat("c20:4n-3"), delta);
            assertEquals(12, rs.getFloat("c20:3n-6"), delta);
            assertEquals(13, rs.getFloat("c20:4n-6"), delta);
            assertEquals(14, rs.getFloat("c20:5n-3"), delta);
            assertEquals(15, rs.getFloat("c22:5n-3"), delta);
            assertEquals(16, rs.getFloat("c22:6n-3"), delta);
            assertEquals(17, rs.getFloat("other"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idproduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadSaturatedFattAcidsTest() throws Exception{
        dto.uploadSaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from saturatedfattyacids where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c4:0"), delta);
            assertEquals(2, rs.getFloat("c6:0"), delta);
            assertEquals(3, rs.getFloat("c8:0"), delta);
            assertEquals(4, rs.getFloat("c10:0"), delta);
            assertEquals(5, rs.getFloat("c12:0"), delta);
            assertEquals(6, rs.getFloat("c12:1,n-1"), delta);
            assertEquals(7, rs.getFloat("c13:0"), delta);
            assertEquals(8, rs.getFloat("c14:0"), delta);
            assertEquals(9, rs.getFloat("c15:0"), delta);
            assertEquals(10, rs.getFloat("c16:0"), delta);
            assertEquals(11, rs.getFloat("c17:0"), delta);
            assertEquals(12, rs.getFloat("c18:0"), delta);
            assertEquals(13, rs.getFloat("c20:0"), delta);
            assertEquals(14, rs.getFloat("c21:0"), delta);
            assertEquals(15, rs.getFloat("c22:0"), delta);
            assertEquals(16, rs.getFloat("c23:0"), delta);
            assertEquals(17, rs.getFloat("c24:0"), delta);
            assertEquals(18, rs.getFloat("other"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadSaturatedfattyacids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from saturatedfattyacids where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("c4:0"), delta);
            assertEquals(2, rs.getFloat("c6:0"), delta);
            assertEquals(3, rs.getFloat("c8:0"), delta);
            assertEquals(4, rs.getFloat("c10:0"), delta);
            assertEquals(5, rs.getFloat("c12:0"), delta);
            assertEquals(6, rs.getFloat("c12:1,n-1"), delta);
            assertEquals(7, rs.getFloat("c13:0"), delta);
            assertEquals(8, rs.getFloat("c14:0"), delta);
            assertEquals(9, rs.getFloat("c15:0"), delta);
            assertEquals(10, rs.getFloat("c16:0"), delta);
            assertEquals(11, rs.getFloat("c17:0"), delta);
            assertEquals(12, rs.getFloat("c18:0"), delta);
            assertEquals(13, rs.getFloat("c20:0"), delta);
            assertEquals(14, rs.getFloat("c21:0"), delta);
            assertEquals(15, rs.getFloat("c22:0"), delta);
            assertEquals(16, rs.getFloat("c23:0"), delta);
            assertEquals(17, rs.getFloat("c24:0"), delta);
            assertEquals(18, rs.getFloat("other"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadSterols() throws Exception{
        dto.uploadSterols(1, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from sterols where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("cholesterol"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadSterols(1, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from sterols where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("cholesterol"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadSupermarkedGroupTest() throws Exception{
        dto.uploadSupermarkedgroup("testGroup", IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from supermarkedgroup where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testGroup", rs.getString("name"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadSupermarkedgroup("testGroupProduct", PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from supermarkedgroup where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("testGroupProduct", rs.getString("name"));
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
    }
    
    @Test
    public void uploadVarietyTest() throws Exception{
        dto.uploadVariety("test", IID);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from variety where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals("test", rs.getString("name"));
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadVitaminsTest() throws Exception{
        dto.uploadVitamins(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from vitamins where ingredient_idIngredient = "+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("vitaminA"), delta);
            assertEquals(2, rs.getFloat("retinol"), delta);
            assertEquals(3, rs.getFloat("vitaminD"), delta);
            assertEquals(4, rs.getFloat("D3-cholecalciferol"), delta);
            assertEquals(5, rs.getFloat("D2Ergocalciferol"), delta);
            assertEquals(6, rs.getFloat("vitaminD325hydroxy"), delta);
            assertEquals(7, rs.getFloat("25-hydroxycholecalciferol"), delta);
            assertEquals(8, rs.getFloat("vitaminE"), delta);
            assertEquals(9, rs.getFloat("alpha-tocopherol"), delta);
            assertEquals(10, rs.getFloat("gamma-tocopherol"), delta);
            assertEquals(11, rs.getFloat("delta-tocopherol"), delta);
            assertEquals(12, rs.getFloat("alpha-tokotrienol"), delta);
            assertEquals(13, rs.getFloat("vitaminK1"), delta);
            assertEquals(14, rs.getFloat("vitaminB1"), delta);
            assertEquals(15, rs.getFloat("thiamine"), delta);
            assertEquals(16, rs.getFloat("hydroxyethylthiazole"), delta);
            assertEquals(17, rs.getFloat("vitaminB2-Riboflavin"), delta);
            assertEquals(18, rs.getFloat("NiacinEquivalent"), delta);
            assertEquals(19, rs.getFloat("niacin"), delta);
            assertEquals(20, rs.getFloat("vitaminB6"), delta);
            assertEquals(21, rs.getFloat("pantothenic"), delta);
            assertEquals(22, rs.getFloat("biotin"), delta);
            assertEquals(23, rs.getFloat("folate"), delta);
            assertEquals(24, rs.getFloat("b12"), delta);
            assertEquals(25, rs.getFloat("cVitamin"), delta);
            assertEquals(26, rs.getFloat("L-ascorbicAcid"), delta);
            assertEquals(27, rs.getFloat("L-dehydroascorbicAcid"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadVitamins(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from vitamins where product_idProduct = "+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("vitaminA"), delta);
            assertEquals(2, rs.getFloat("retinol"), delta);
            assertEquals(3, rs.getFloat("vitaminD"), delta);
            assertEquals(4, rs.getFloat("D3-cholecalciferol"), delta);
            assertEquals(5, rs.getFloat("D2Ergocalciferol"), delta);
            assertEquals(6, rs.getFloat("vitaminD325hydroxy"), delta);
            assertEquals(7, rs.getFloat("25-hydroxycholecalciferol"), delta);
            assertEquals(8, rs.getFloat("vitaminE"), delta);
            assertEquals(9, rs.getFloat("alpha-tocopherol"), delta);
            assertEquals(10, rs.getFloat("gamma-tocopherol"), delta);
            assertEquals(11, rs.getFloat("delta-tocopherol"), delta);
            assertEquals(12, rs.getFloat("alpha-tokotrienol"), delta);
            assertEquals(13, rs.getFloat("vitaminK1"), delta);
            assertEquals(14, rs.getFloat("vitaminB1"), delta);
            assertEquals(15, rs.getFloat("thiamine"), delta);
            assertEquals(16, rs.getFloat("hydroxyethylthiazole"), delta);
            assertEquals(17, rs.getFloat("vitaminB2-Riboflavin"), delta);
            assertEquals(18, rs.getFloat("NiacinEquivalent"), delta);
            assertEquals(19, rs.getFloat("niacin"), delta);
            assertEquals(20, rs.getFloat("vitaminB6"), delta);
            assertEquals(21, rs.getFloat("pantothenic"), delta);
            assertEquals(22, rs.getFloat("biotin"), delta);
            assertEquals(23, rs.getFloat("folate"), delta);
            assertEquals(24, rs.getFloat("b12"), delta);
            assertEquals(25, rs.getFloat("cVitamin"), delta);
            assertEquals(26, rs.getFloat("L-ascorbicAcid"), delta);
            assertEquals(27, rs.getFloat("L-dehydroascorbicAcid"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadOrganicAcidsTest() throws Exception{
        dto.uploadOrganicAcids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from organicacids where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("l-lacticAcid"), delta);
            assertEquals(2, rs.getFloat("d-lacticAcid"), delta);
            assertEquals(3, rs.getFloat("laticAcidTotal"), delta);
            assertEquals(4, rs.getFloat("citricAcid"), delta);
            assertEquals(5, rs.getFloat("oxalicAcid"), delta);
            assertEquals(6, rs.getFloat("malicAcid"), delta);
            assertEquals(7, rs.getFloat("aceticAcid"), delta);
            assertEquals(8, rs.getFloat("benzoicAcid"), delta);
            assertEquals(9, rs.getFloat("sorbicAcid"), delta);
            assertEquals(10, rs.getFloat("propionic"), delta);
            assertEquals(11, rs.getFloat("organicAcidsTotal"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadOrganicAcids(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from organicacids where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("l-lacticAcid"), delta);
            assertEquals(2, rs.getFloat("d-lacticAcid"), delta);
            assertEquals(3, rs.getFloat("laticAcidTotal"), delta);
            assertEquals(4, rs.getFloat("citricAcid"), delta);
            assertEquals(5, rs.getFloat("oxalicAcid"), delta);
            assertEquals(6, rs.getFloat("malicAcid"), delta);
            assertEquals(7, rs.getFloat("aceticAcid"), delta);
            assertEquals(8, rs.getFloat("benzoicAcid"), delta);
            assertEquals(9, rs.getFloat("sorbicAcid"), delta);
            assertEquals(10, rs.getFloat("propionic"), delta);
            assertEquals(11, rs.getFloat("organicAcidsTotal"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
    
    @Test
    public void uploadBioaminesTest() throws Exception{
        dto.uploadBiogeneamines(1, 2, 3, 4, 5, 6, 7, 8, IID, true);
        Connection conn = dto.getConnection();
        PreparedStatement statement = conn.prepareStatement("select * from biogeneamines where ingredient_idIngredient ="+IID+";");
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("histamine"), delta);
            assertEquals(2, rs.getFloat("tyramine"), delta);
            assertEquals(3, rs.getFloat("phenylethylamine"), delta);
            assertEquals(4, rs.getFloat("putrescine"), delta);
            assertEquals(5, rs.getFloat("cadaverine"), delta);
            assertEquals(6, rs.getFloat("spermine"), delta);
            assertEquals(7, rs.getFloat("spermidine"), delta);
            assertEquals(8, rs.getFloat("serotonin"), delta);
            assertEquals(IID, rs.getInt("ingredient_idIngredient"));
            assertEquals(0, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
        
        dto.uploadBiogeneamines(1, 2, 3, 4, 5, 6, 7, 8, PID, false);
        conn = dto.getConnection();
        statement = conn.prepareStatement("select * from biogeneamines where product_idProduct ="+PID+";");
        rs = statement.executeQuery();
        if(rs.next()){
            assertEquals(1, rs.getFloat("histamine"), delta);
            assertEquals(2, rs.getFloat("tyramine"), delta);
            assertEquals(3, rs.getFloat("phenylethylamine"), delta);
            assertEquals(4, rs.getFloat("putrescine"), delta);
            assertEquals(5, rs.getFloat("cadaverine"), delta);
            assertEquals(6, rs.getFloat("spermine"), delta);
            assertEquals(7, rs.getFloat("spermidine"), delta);
            assertEquals(8, rs.getFloat("serotonin"), delta);
            assertEquals(0, rs.getInt("ingredient_idIngredient"));
            assertEquals(PID, rs.getInt("product_idProduct"));
        }else{
            fail();
        }
    }
}
