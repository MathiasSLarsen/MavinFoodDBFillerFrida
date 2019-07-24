/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavinfooddbfillerfrida;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author Lenovo
 */
public class DTO {
    public Connection getConnection() throws Exception{
    
        try{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/foodDB";
        String userName = "root";
        String password = "2ad62a37f";
        Class.forName(driver);
        
            java.sql.Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
            return (Connection) conn;
        }catch(Exception e){System.out.println(e);}
        
    return null;
    }
    
    public void uploadIngredient(String name, int kj, int kcal, float totalN, float protien, float carbohydrates, float addedSugar, float fat, float fiber, float alcohol, float ash, float drymatter, float water)throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("insert into ingredient (name, kj, kcal, totalN, protien, carbohydrates, addedSugar, fat, fiber, alcohol, ash, drymatter, water) "
                                                                       + "values ('"+name+"', "+kj+", "+kcal+", "+totalN+", "+protien+", "+carbohydrates+", "+addedSugar+", "+fat+", "+fiber+", "+alcohol+", "+ash+", "+drymatter+", "+water+") ");
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }
    public void uploadAllergens(int gluten, int milk, int egg, int peanut, int soy, int wheat, int fish, int shellfish, int sesame, int id,  boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if (isIngredient){
            statment = conn.prepareStatement("insert into allergens (gluten, milk, egg, peanut, soy, wheat, fish, shellfish, sesame, ingredient_idIngredient) "
                                                            + "values ("+gluten+", "+milk+", "+egg+", "+peanut+", "+soy+", "+wheat+", "+fish+", "+shellfish+", "+sesame+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into allergens (gluten, milk, egg, peanut, soy, wheat, fish, shellfish, sesame, product_idproduct) "
                                                            + "values ("+gluten+", "+milk+", "+egg+", "+peanut+", "+soy+", "+wheat+", "+fish+", "+shellfish+", "+sesame+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }    
    public void uploadAminoAcids(int isoleucine, int leucine, int lysine, int methionine, int cystine, int phenylalanine, int tyrosine, int threonine, int tryptophan, int valin, int arginine, int histidine, int alanine, int asparticAcid, int glutamicAcid, int glycine, int proline, int serin, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into aminoacids (isoleucine, leucine,lysine, methionine, cystine, phenylalanine,tyrosine, threonine, tryptophan, valin, arginine, histidine, alanine, asparticAcid, glutamicAcid, glycine, proline, serin, ingredient_idIngredient) \n" +
                                                            "values ("+isoleucine+", "+leucine+", "+lysine+", "+methionine+", "+cystine+", "+phenylalanine+", "+tyrosine+", "+threonine+", "+tryptophan+", "+valin+" ,"+arginine+" ,"+histidine+", "+alanine+", "+asparticAcid+", "+glutamicAcid+", "+glycine+", "+proline+", "+serin+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into aminoacids (isoleucine, leucine,lysine, methionine, cystine, phenylalanine,tyrosine, threonine, tryptophan, valin, arginine, histidine, alanine, asparticAcid, glutamicAcid, glycine, proline, serin, product_idproduct) \n" +
                                                            "values ("+isoleucine+", "+leucine+", "+lysine+", "+methionine+", "+cystine+", "+phenylalanine+", "+tyrosine+", "+threonine+", "+tryptophan+", "+valin+" ,"+arginine+" ,"+histidine+", "+alanine+", "+asparticAcid+", "+glutamicAcid+", "+glycine+", "+proline+", "+serin+", "+id+");");
        }
       statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadcarbohydrates(float fructose, float glucose, float monosaccharidesTotal, float lactose, float maltose, float sucrose, float disaccharidesTotal, float sugarsTotal, float starch, float Hexoses, float ThePentoses, float UronicAcids, float cellulose, float lignin, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into carbohydrates (fructose, glucose, monosaccharidesTotal, lactose, maltose, sucrose, disaccharidesTotal, sugarsTotal, starch, `(a)Hexoses`, `(b)ThePentoses`, `(c)UronicAcids`, cellulose, lignin, ingredient_idIngredient) "
                + "                                         values ("+fructose+", "+glucose+", "+monosaccharidesTotal+", "+lactose+", "+maltose+", "+sucrose+", "+disaccharidesTotal+", "+sugarsTotal+", "+starch+", "+Hexoses+", "+ThePentoses+", "+UronicAcids+", "+cellulose+", "+lignin+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into carbohydrates (fructose, glucose, monosaccharidesTotal, lactose, maltose, sucrose, disaccharidesTotal, sugarsTotal, starch, `(a)Hexoses`, `(b)ThePentoses`, `(c)UronicAcids`, cellulose, lignin, product_idproduct) "
                + "                                         values ("+fructose+", "+glucose+", "+monosaccharidesTotal+", "+lactose+", "+maltose+", "+sucrose+", "+disaccharidesTotal+", "+sugarsTotal+", "+starch+", "+Hexoses+", "+ThePentoses+", "+UronicAcids+", "+cellulose+", "+lignin+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }    
    public void uploadcolor(String name, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into color (name, ingredient_idIngredient) values ('"+name+"', "+id+");");
        }else{
            statment = conn.prepareStatement("insert into color (name, product_idproduct) values ('"+name+"', "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadFactors(float waste, float proteinConversionFactor, float fattyAcidConversionFactor, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into factors (waste, proteinConversionFactor, fattyAcidConversionFactor, ingredient_idIngredient) values ("+waste+", "+proteinConversionFactor+", "+fattyAcidConversionFactor+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into factors (waste, proteinConversionFactor, fattyAcidConversionFactor, product_idproduct) values ("+waste+", "+proteinConversionFactor+", "+fattyAcidConversionFactor+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadFattyacidssums(float otherFattyAcids, float sumSaturated, float sumMonounsaturated, float sumPolyunsaturated, float fattyAcidsTotal, float sumN3FattyAcids, float sumN6FattyAcids, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into fattyacidssums (otherFattyAcids, sumSaturated, sumMonounsaturated, sumPolyunsaturated, fattyAcidsTotal, `sumN-3FattyAcids`, `sumN-6FattyAcids`, ingredient_idIngredient) "
                + "                                         values ("+otherFattyAcids+", "+sumSaturated+", "+sumMonounsaturated+", "+sumPolyunsaturated+", "+fattyAcidsTotal+", "+sumN3FattyAcids+", "+sumN6FattyAcids+", "+id+")");
        }else{
            statment = conn.prepareStatement("insert into fattyacidssums (otherFattyAcids, sumSaturated, sumMonounsaturated, sumPolyunsaturated, fattyAcidsTotal, `sumN-3FattyAcids`, `sumN-6FattyAcids`, product_idproduct) "
                + "                                         values ("+otherFattyAcids+", "+sumSaturated+", "+sumMonounsaturated+", "+sumPolyunsaturated+", "+fattyAcidsTotal+", "+sumN3FattyAcids+", "+sumN6FattyAcids+", "+id+")");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadfoodGroup(String name, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into foodgroup (name, ingredient_idIngredient) values ('"+name+"', "+id+");");
        }else{
            statment = conn.prepareStatement("insert into foodgroup (name, product_idproduct) values ('"+name+"', "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    } 
    public void uploadMinerals(float sodium, float potassium, float calcium, float magnesium, float phosphorus, float iron, float copper, float zink, float iodine, float manganese, float chromium, float selenium, float molybdenum, float nickel, float mercury, float arsenic, float cadmium, float leadMineral,int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into minerals (sodium, potassium, calcium, magnesium, phosphorus, iron, copper, zink, iodine, manganese, chromium, selenium, molybdenum, nickel, mercury, arsenic, cadmium, leadMineral, ingredient_idIngredient) "
                + "                                         values ("+sodium+", "+potassium+", "+calcium+", "+magnesium+", "+phosphorus+", "+iron+", "+copper+", "+zink+", "+iodine+", "+manganese+", "+chromium+", "+selenium+", "+molybdenum+", "+nickel+", "+mercury+", "+arsenic+", "+cadmium+", "+leadMineral+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into minerals (sodium, potassium, calcium, magnesium, phosphorus, iron, copper, zink, iodine, manganese, chromium, selenium, molybdenum, nickel, mercury, arsenic, cadmium, leadMineral, product_idproduct) "
                + "                                         values ("+sodium+", "+potassium+", "+calcium+", "+magnesium+", "+phosphorus+", "+iron+", "+copper+", "+zink+", "+iodine+", "+manganese+", "+chromium+", "+selenium+", "+molybdenum+", "+nickel+", "+mercury+", "+arsenic+", "+cadmium+", "+leadMineral+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadMonosaturatedfattyacids(float c141n5, float c161n7, float c181n9, float c181n7, float c201n11, float c221n9, float c221n11, float c241n9, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into monosaturatedfattyacids (`c14:1n-5`, `c16:1n-7`, `c18:1n-9`, `c18:1n-7`, `c20:1n-11`, `c22:1n-9`, `c22:1n-11`, `c24:1n-9`, ingredient_idIngredient) "
                + "                                         values ("+c141n5+", "+c161n7+", "+c181n9+", "+c181n7+", "+c201n11+", "+c221n9+", "+c221n11+", "+c241n9+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into monosaturatedfattyacids (`c14:1n-5`, `c16:1n-7`, `c18:1n-9`, `c18:1n-7`, `c20:1n-11`, `c22:1n-9`, `c22:1n-11`, `c24:1n-9`, product_idproduct) "
                + "                                         values ("+c141n5+", "+c161n7+", "+c181n9+", "+c181n7+", "+c201n11+", "+c221n9+", "+c221n11+", "+c241n9+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadName(String dk, String latin, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into name (dk, latin, ingredient_idIngredient) values ('"+dk+"', '"+latin+"', "+id+");");
        }else{
            statment = conn.prepareStatement("insert into name (dk, latin, product_idproduct) values ('"+dk+"', '"+latin+"', "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadPolyunsaturatedfattyacids(float c182n6, float c183n3, float c184n3, float c202n6, float c203n3, float c203n6, float c205n3, float c225n3, float c226n3, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into polyunsaturatedfattyacids (`c18:2n-6`, `c18:3n-3`, `c18:4n-3`,`c20:2n-6`, `c20:3n-3`, `c20:3n-6`, `c20:5n-3`, `c22:5n-3`, `c22:6n-3`, ingredient_idIngredient) "
                + "                                             values ("+c182n6+", "+c183n3+", "+c184n3+", "+c202n6+", "+c203n3+", "+c203n6+", "+c205n3+", "+c225n3+", "+c226n3+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into polyunsaturatedfattyacids (`c18:2n-6`, `c18:3n-3`, `c18:4n-3`,`c20:2n-6`, `c20:3n-3`, `c20:3n-6`, `c20:5n-3`, `c22:5n-3`, `c22:6n-3`, product_idproduct) "
                + "                                             values ("+c182n6+", "+c183n3+", "+c184n3+", "+c202n6+", "+c203n3+", "+c203n6+", "+c205n3+", "+c225n3+", "+c226n3+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadSaturatedfattyacids(float c40, float c60, float c80, float c100, float c120, float c140, float c160, float c170, float c180, float c200, float c220, float c240, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into saturatedfattyacids (`c4:0`, `c6:0`, `c8:0`, `c10:0`, `c12:0`, `c14:0`, `c16:0`, `c17:0`, `c18:0`, `c20:0`, `c22:0`, `c24:0`, ingredient_idIngredient) "
                + "                                     values ("+c40+", "+c60+", "+c80+", "+c100+", "+c120+", "+c140+", "+c160+", "+c170+", "+c180+", "+c200+", "+c220+", "+c240+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into saturatedfattyacids (`c4:0`, `c6:0`, `c8:0`, `c10:0`, `c12:0`, `c14:0`, `c16:0`, `c17:0`, `c18:0`, `c20:0`, `c22:0`, `c24:0`, product_idproduct) "
                + "                                     values ("+c40+", "+c60+", "+c80+", "+c100+", "+c120+", "+c140+", "+c160+", "+c170+", "+c180+", "+c200+", "+c220+", "+c240+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadSterols(float cholesterol, int id, boolean isIngredient) throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment;
        if(isIngredient){
            statment = conn.prepareStatement("insert into sterols (cholesterol, ingredient_idIngredient) values ("+cholesterol+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into sterols (cholesterol, product_idproduct) values ("+cholesterol+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadSupermarkedgroup(String name, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into supermarkedgroup (name, ingredient_idIngredient) values ('"+name+"', "+id+");");
        }else{
            statment = conn.prepareStatement("insert into supermarkedgroup (name, product_idproduct) values ('"+name+"', "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadVariety(String name, int ingredient_idIngredient) throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("insert into variety  (name, ingredient_idIngredient) values ('"+name+"', "+ingredient_idIngredient+");");
        statment.execute();
        }catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("Minerals inserted");
        }
    }  
    public void uploadVitamins(float vitaminA, float retinol, float betaCarotene, float vitaminD, float D3Cholecalciferol, float _25Hydroxycholecalciferol, float vitaminE, float alphaTocopherol, float vitaminK1, float vitaminB1, float vitaminB2Riboflavin, float NiacinEquivalent, float niacin, float vitaminB6, float pantothenic, float biotin, float folate, float b12, float cVitamin, float LAscorbicAcid, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into vitamins (vitaminA, retinol, `beta-carotene`, vitaminD, `D3-cholecalciferol`, `25-hydroxycholecalciferol`, vitaminE, `alpha-tocopherol`, vitaminK1, vitaminB1, `vitaminB2-Riboflavin`, NiacinEquivalent, niacin, vitaminB6, pantothenic, biotin, folate, b12, cVitamin, `L-ascorbicAcid`, ingredient_idIngredient) "
                + "                                 values ("+vitaminA+", "+retinol+", "+betaCarotene+", "+vitaminD+", "+D3Cholecalciferol+", "+_25Hydroxycholecalciferol+", "+vitaminE+", "+alphaTocopherol+", "+vitaminK1+", "+vitaminB1+", "+vitaminB2Riboflavin+", "+NiacinEquivalent+", "+niacin+", "+vitaminB6+", "+pantothenic+", "+biotin+", "+folate+", "+b12+", "+cVitamin+", "+LAscorbicAcid+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into vitamins (vitaminA, retinol, `beta-carotene`, vitaminD, `D3-cholecalciferol`, `25-hydroxycholecalciferol`, vitaminE, `alpha-tocopherol`, vitaminK1, vitaminB1, `vitaminB2-Riboflavin`, NiacinEquivalent, niacin, vitaminB6, pantothenic, biotin, folate, b12, cVitamin, `L-ascorbicAcid`, product_idproduct) "
                + "                                 values ("+vitaminA+", "+retinol+", "+betaCarotene+", "+vitaminD+", "+D3Cholecalciferol+", "+_25Hydroxycholecalciferol+", "+vitaminE+", "+alphaTocopherol+", "+vitaminK1+", "+vitaminB1+", "+vitaminB2Riboflavin+", "+NiacinEquivalent+", "+niacin+", "+vitaminB6+", "+pantothenic+", "+biotin+", "+folate+", "+b12+", "+cVitamin+", "+LAscorbicAcid+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadProduct(String name, int kj, int kcal, float totalN, float protien, float carbohydrates, float addedSugar, float fat, float fiber, float vitaminB1, float alcohol, float ash, float dryMatter, float water) throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("insert into product (name, kj, kcal, totalN, protien, carbohydrates, addedSugar, fat, fiber, alcohol, ash, dryMatter, water) "
                + "                                 values ('"+name+"', "+kj+", "+kcal+", "+totalN+", "+protien+", "+carbohydrates+", "+addedSugar+", "+fat+", "+fiber+", "+alcohol+", "+ash+", "+dryMatter+", "+water+");");
        statment.execute();
        }catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("Minerals inserted");
        }
    }  
    public int getIngridentId(String name) throws Exception{
        int id = 0; 
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("select idIngredient from ingredient where name = '"+name+"';");
        ResultSet resultSet = statment.executeQuery();
        if (resultSet.next()){
            id = resultSet.getInt("idIngredient");
        }
        return id;
        }catch(Exception e){System.out.println(e);}
        return id;
    }
    public int getProductId(String name) throws Exception{
        int id = 0; 
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("select idproduct from product where name = '"+name+"';");
        ResultSet resultSet = statment.executeQuery();
        if (resultSet.next()){
            id = resultSet.getInt("idproduct");
        }
        return id;
        }catch(Exception e){System.out.println(e);}
        return id;
    }
}
