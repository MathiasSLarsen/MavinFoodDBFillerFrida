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
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/foodDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String userName = "root";
        String password = "2ad62a37f";
        Class.forName(driver);
        
            java.sql.Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
            return (Connection) conn;
        }catch(Exception e){System.out.println(e);}
        
    return null;
    }
    
    public void uploadIngredient(String name, int kj, int kcal, float totalN, float protien, float carbohydrates, float addedSugar, float fat, float fiber, float alcohol, float ash, float drymatter, float water, String DB)throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("insert into ingredient (nameEN, kj, kcal, totalN, protien, carbohydrates, addedSugar, fat, fiber, alcohol, ash, drymatter, water, DB) "
                                                                       + "values ('"+name+"', "+kj+", "+kcal+", "+totalN+", "+protien+", "+carbohydrates+", "+addedSugar+", "+fat+", "+fiber+", "+alcohol+", "+ash+", "+drymatter+", "+water+", '"+DB+"') ");
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
    public void uploadAminoAcids(int isoleucine, int leucine, int lysine, int methionine, int cystine, int phenylalanine, int tyrosine, int threonine, int tryptophan, int valin, int arginine, int histidine, int alanine, int asparticAcid, int glutamicAcid, int glycine, int proline, int hydroxyproline, int serin, int betaCarotene, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into aminoacids (isoleucine, leucine,lysine, methionine, cystine, phenylalanine,tyrosine, threonine, tryptophan, valin, arginine, histidine, alanine, asparticAcid, glutamicAcid, glycine, proline, hydroxyproline, serin, betaCarotene, ingredient_idIngredient) \n" +
                                                            "values ("+isoleucine+", "+leucine+", "+lysine+", "+methionine+", "+cystine+", "+phenylalanine+", "+tyrosine+", "+threonine+", "+tryptophan+", "+valin+" ,"+arginine+" ,"+histidine+", "+alanine+", "+asparticAcid+", "+glutamicAcid+", "+glycine+", "+proline+", "+hydroxyproline+", "+serin+", "+betaCarotene+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into aminoacids (isoleucine, leucine,lysine, methionine, cystine, phenylalanine,tyrosine, threonine, tryptophan, valin, arginine, histidine, alanine, asparticAcid, glutamicAcid, glycine, proline, hydroxyproline, serin, betaCarotene, product_idproduct) \n" +
                                                            "values ("+isoleucine+", "+leucine+", "+lysine+", "+methionine+", "+cystine+", "+phenylalanine+", "+tyrosine+", "+threonine+", "+tryptophan+", "+valin+" ,"+arginine+" ,"+histidine+", "+alanine+", "+asparticAcid+", "+glutamicAcid+", "+glycine+", "+proline+", "+hydroxyproline+", "+serin+", "+betaCarotene+", "+id+");");
        }
       statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadcarbohydrates(float fructose, float galactose, float glucose, float monosaccharidesTotal, float lactose, float maltose, float sucrose, float disaccharidesTotal, float maltotriose, float raffinose, float otherSugars, float sugarsTotal, float sorbitol, float mannitol, float inositol, float maltitol, float sugarAlcoholsTotal, float starch, float IDF, float SDFP, float SDFS, float Hexoses, float ThePentoses, float UronicAcids, float cellulose, float lignin, float crudeFibers, float naturalDietFibre, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into carbohydrates (fructose, galactose, glucose, monosaccharidesTotal, lactose, maltose, sucrose, disaccharidesTotal, maltotriose, raffinose, otherSugars,  sugarsTotal, sorbitol, mannitol, inositol, maltitol, sugarAlcoholsTotal, starch, IDF, SDFP, SDFS, `(a)Hexoses`, `(b)ThePentoses`, `(c)UronicAcids`, cellulose, lignin, crudeFibers, naturalDietFibre, ingredient_idIngredient) "
                + "                                         values ("+fructose+", "+galactose+", "+glucose+", "+monosaccharidesTotal+", "+lactose+", "+maltose+", "+sucrose+", "+disaccharidesTotal+", "+maltotriose+", "+raffinose+", "+otherSugars+", "+sugarsTotal+", "+sorbitol+", "+mannitol+", "+inositol+", "+maltitol+", "+sugarAlcoholsTotal+", "+starch+", "+IDF+", "+SDFP+", "+SDFS+", "+Hexoses+", "+ThePentoses+", "+UronicAcids+", "+cellulose+", "+lignin+", "+crudeFibers+", "+naturalDietFibre+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into carbohydrates (fructose, galactose, glucose, monosaccharidesTotal, lactose, maltose, sucrose, disaccharidesTotal, maltotriose, raffinose, otherSugars, sugarsTotal, sorbitol, mannitol, inositol, maltitol, sugarAlcoholsTotal, starch, IDF, SDFP, SDFS, `(a)Hexoses`, `(b)ThePentoses`, `(c)UronicAcids`, cellulose, lignin, crudeFibers, naturalDietFibre, product_idproduct) "
                + "                                         values ("+fructose+", "+galactose+", "+glucose+", "+monosaccharidesTotal+", "+lactose+", "+maltose+", "+sucrose+", "+disaccharidesTotal+", "+maltotriose+", "+raffinose+", "+otherSugars+", "+sugarsTotal+", "+sorbitol+", "+mannitol+", "+inositol+", "+maltitol+", "+sugarAlcoholsTotal+", "+starch+", "+IDF+", "+SDFP+", "+SDFS+", "+Hexoses+", "+ThePentoses+", "+UronicAcids+", "+cellulose+", "+lignin+", "+crudeFibers+", "+naturalDietFibre+", "+id+");");
        
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
    public void uploadFattyacidssums(float otherFattyAcids, float sumSaturated, float sumMonounsaturated, float sumPolyunsaturated, float transFattyAcidsTotal, float fattyAcidsTotal, float sumN3FattyAcids, float sumN6FattyAcids, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into fattyacidssums (otherFattyAcids, sumSaturated, sumMonounsaturated, sumPolyunsaturated, transFattyAcidsTotal, fattyAcidsTotal, `sumN-3FattyAcids`, `sumN-6FattyAcids`, ingredient_idIngredient) "
                + "                                         values ("+otherFattyAcids+", "+sumSaturated+", "+sumMonounsaturated+", "+sumPolyunsaturated+", "+transFattyAcidsTotal+", "+fattyAcidsTotal+", "+sumN3FattyAcids+", "+sumN6FattyAcids+", "+id+")");
        }else{
            statment = conn.prepareStatement("insert into fattyacidssums (otherFattyAcids, sumSaturated, sumMonounsaturated, sumPolyunsaturated, transFattyAcidsTotal, fattyAcidsTotal, `sumN-3FattyAcids`, `sumN-6FattyAcids`, product_idproduct) "
                + "                                         values ("+otherFattyAcids+", "+sumSaturated+", "+sumMonounsaturated+", "+sumPolyunsaturated+", "+transFattyAcidsTotal+", "+fattyAcidsTotal+", "+sumN3FattyAcids+", "+sumN6FattyAcids+", "+id+")");
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
    public void uploadMinerals(float sulfur, float chloride, float sodium, float potassium, float calcium, float magnesium, float phosphorus, float iron, float copper, float zink, float iodine, float manganese, float chromium, float selenium, float molybdenum, float colbalt, float nickel, float fluoron, float silicon, float rubidium, float aluminum, float boron, float bromine, float mercury, float arsenic, float cadmium, float leadMineral, float tin, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into minerals (sulfur, chloride, sodium, potassium, calcium, magnesium, phosphorus, iron, copper, zink, iodine, manganese, chromium, selenium, molybdenum, colbalt, nickel, fluoron, silicon, rubidium, aluminum, boron, bromine, mercury, arsenic, cadmium, leadMineral, tin, ingredient_idIngredient) "
                + "                                         values ("+sulfur+", "+chloride+", "+sodium+", "+potassium+", "+calcium+", "+magnesium+", "+phosphorus+", "+iron+", "+copper+", "+zink+", "+iodine+", "+manganese+", "+chromium+", "+selenium+", "+molybdenum+", "+colbalt+", "+nickel+", "+fluoron+", "+silicon+", "+rubidium+", "+aluminum+", "+boron+", "+bromine+", "+mercury+", "+arsenic+", "+cadmium+", "+leadMineral+", "+tin+", "+id+");");
        
        }else{
            statment = conn.prepareStatement("insert into minerals (sulfur, chloride, sodium, potassium, calcium, magnesium, phosphorus, iron, copper, zink, iodine, manganese, chromium, selenium, molybdenum, colbalt, nickel, fluoron, silicon, rubidium, aluminum, boron, bromine, mercury, arsenic, cadmium, leadMineral, tin, product_idproduct) "
                + "                                         values ("+sulfur+", "+chloride+", "+sodium+", "+potassium+", "+calcium+", "+magnesium+", "+phosphorus+", "+iron+", "+copper+", "+zink+", "+iodine+", "+manganese+", "+chromium+", "+selenium+", "+molybdenum+", "+colbalt+", "+nickel+", "+fluoron+", "+silicon+", "+rubidium+", "+aluminum+", "+boron+", "+bromine+", "+mercury+", "+arsenic+", "+cadmium+", "+leadMineral+", "+tin+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadMonounsaturatedfattyacids( float c141n5, float c151, float c161n7, float c171n7, float c181n9, float c181n7, float c201n9, float c201n11, float c221n9, float c221n11, float c241n9, float other, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into monounsaturatedfattyacids (`c14:1n-5`, `c15:1`, `c16:1n-7`, `c17:1n-7`, `c18:1n-9`, `c18:1n-7`, `c20:1n-9`, `c20:1n-11`, `c22:1n-9`, `c22:1n-11`, `c24:1n-9`, `other`, ingredient_idIngredient) "
                + "                                         values ( "+c141n5+", "+c151+", "+c161n7+", "+c171n7+", "+c181n9+", "+c181n7+", "+c201n9+", "+c201n11+", "+c221n9+", "+c221n11+", "+c241n9+", "+other+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into monounsaturatedfattyacids ( `c14:1n-5`, `c15:1`, `c16:1n-7`, `c17:1n-7`, `c18:1n-9`, `c18:1n-7`, `c20:1n-9`, `c20:1n-11`, `c22:1n-9`, `c22:1n-11`, `c24:1n-9`, `other`, product_idproduct) "
                + "                                         values ( "+c141n5+", "+c151+", "+c161n7+", "+c171n7+", "+c181n9+", "+c181n7+", "+c201n9+", "+c201n11+", "+c221n9+", "+c221n11+", "+c241n9+", "+other+", "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadMonounsaturatedfattyacidsTrans(float c141Trans9, float c161Trans, float c181Transn9, float c201Trans, float c221Trans, float c182TransUndifferentiated, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into monounsaturatedfattyacidsTrans (`c14:1Trans-9`, `c16:1Trans`, `c18:1Trans-n-9`, `c20:1Trans`, `c22:1Trans`, `c18:2TransUndifferentiated`, ingredient_idIngredient) "
                    + "                     values ("+c141Trans9+", "+c161Trans+", "+c181Transn9+", "+c201Trans+", "+c221Trans+", "+c182TransUndifferentiated+","+id+" );");
        }else{
            statment = conn.prepareStatement("insert into monounsaturatedfattyacidsTrans (`c14:1Trans-9`, `c16:1Trans`, `c18:1Trans-n-9`, `c20:1Trans`, `c22:1Trans`, `c18:2TransUndifferentiated`, product_idproduct) "
                    + "                     values ("+c141Trans9+", "+c161Trans+", "+c181Transn9+", "+c201Trans+", "+c221Trans+", "+c182TransUndifferentiated+","+id+" );");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadName(String dk, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into namelang (dk, ingredient_idIngredient) values ('"+dk+"', "+id+");");
        }else{
            statment = conn.prepareStatement("insert into namelang (dk, product_idproduct) values ('"+dk+"', "+id+");");
        
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadPolyunsaturatedfattyacids(float c182n6, float c182, float c183n3, float c183n6, float c184n3, float c202n6, float c222n6, float c224n6, float c225n6, float c203n3, float c204n3,  float c203n6, float c204n6, float c205n3, float c225n3, float c226n3, float other, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into polyunsaturatedfattyacids (`c18:2n-6`, `c18:2`, `c18:3n-3`, `c18:3n-6`, `c18:4n-3`,`c20:2n-6`, `c22:2n-6`, `c22:4n-6`, `c22:5n-6` ,`c20:3n-3`, `c20:4n-3`, `c20:3n-6`, `c20:4n-6`, `c20:5n-3`, `c22:5n-3`, `c22:6n-3`, other, ingredient_idIngredient) "
                + "                                             values ("+c182n6+", "+c182+", "+c183n3+", "+c183n6+", "+c184n3+", "+c202n6+","+c222n6+", "+c224n6+", "+c225n6+", "+c203n3+", "+c204n3+", "+c203n6+","+c204n6+", "+c205n3+", "+c225n3+", "+c226n3+", "+other+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into polyunsaturatedfattyacids (`c18:2n-6`, `c18:2`, `c18:3n-3`, `c18:3n-6`, `c18:4n-3`,`c20:2n-6`, `c22:2n-6`, `c22:4n-6`, `c22:5n-6`,`c20:3n-3`, `c20:4n-3`, `c20:3n-6`, `c20:4n-6`, `c20:5n-3`, `c22:5n-3`, `c22:6n-3`, other, product_idproduct) "
                + "                                             values ("+c182n6+", "+c182+", "+c183n3+", "+c183n6+", "+c184n3+", "+c202n6+", "+c222n6+", "+c224n6+", "+c225n6+", "+c203n3+", "+c204n3+", "+c203n6+", "+c204n6+", "+c205n3+", "+c225n3+", "+c226n3+", "+other+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadSaturatedfattyacids(float c40, float c60, float c80, float c100, float c120, float c121n1, float c130, float c140, float c150, float c160, float c170, float c180, float c200, float c210, float c220, float c230, float c240, float other, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into saturatedfattyacids (`c4:0`, `c6:0`, `c8:0`, `c10:0`, `c12:0`,`c12:1,n-1`, `c13:0`, `c14:0`, `c15:0`, `c16:0`, `c17:0`, `c18:0`, `c20:0`, `c21:0`, `c22:0`, `c23:0`, `c24:0`, other, ingredient_idIngredient) "
                + "                                     values ("+c40+", "+c60+", "+c80+", "+c100+", "+c120+", "+c121n1+", "+c130+", "+c140+", "+c150+", "+c160+", "+c170+", "+c180+", "+c200+", "+c210+", "+c220+", "+c230+", "+c240+", "+other+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into saturatedfattyacids (`c4:0`, `c6:0`, `c8:0`, `c10:0`, `c12:0`,`c12:1,n-1`, `c13:0`, `c14:0`, `c15:0`, `c16:0`, `c17:0`, `c18:0`, `c20:0`, `c21:0`, `c22:0`, `c23:0`, `c24:0`, other, product_idproduct) "
                + "                                     values ("+c40+", "+c60+", "+c80+", "+c100+", "+c120+", "+c121n1+", "+c130+", "+c140+", "+c150+", "+c160+", "+c170+", "+c180+", "+c200+", "+c210+", "+c220+", "+c230+", "+c240+", "+other+", "+id+");");
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
    public void uploadVitamins(float vitaminA, float retinol, float vitaminD, float D3Cholecalciferol, float D2Ergocalciferol, float vitaminD325hydroxy, float _25Hydroxycholecalciferol, float vitaminE, float alphaTocopherol, float gammaTocopherol, float deltaTocopherol, float alphaTokotrienol, float vitaminK1, float vitaminB1, float thiamine, float hydroxyethylthiazole, float vitaminB2Riboflavin, float NiacinEquivalent, float niacin, float vitaminB6, float pantothenic, float biotin, float folate, float b12, float cVitamin, float LAscorbicAcid, float LDehydroascorbicAcid, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into vitamins (vitaminA, retinol, vitaminD, `D3-cholecalciferol`, `D2Ergocalciferol`, `vitaminD325hydroxy`, `25-hydroxycholecalciferol`, vitaminE, `alpha-tocopherol`, `gamma-tocopherol`, `delta-tocopherol`, `alpha-tokotrienol`, vitaminK1, vitaminB1, `thiamine`, `hydroxyethylthiazole`, `vitaminB2-Riboflavin`, NiacinEquivalent, niacin, vitaminB6, pantothenic, biotin, folate, b12, cVitamin, `L-ascorbicAcid`,`L-dehydroascorbicAcid`, ingredient_idIngredient) "
                + "                                 values ("+vitaminA+", "+retinol+", "+vitaminD+", "+D3Cholecalciferol+","+D2Ergocalciferol+","+vitaminD325hydroxy+", "+_25Hydroxycholecalciferol+", "+vitaminE+", "+alphaTocopherol+", "+gammaTocopherol+", "+deltaTocopherol+", "+alphaTokotrienol+", "+vitaminK1+", "+vitaminB1+", "+thiamine+", "+hydroxyethylthiazole+", "+vitaminB2Riboflavin+", "+NiacinEquivalent+", "+niacin+", "+vitaminB6+", "+pantothenic+", "+biotin+", "+folate+", "+b12+", "+cVitamin+", "+LAscorbicAcid+", "+LDehydroascorbicAcid+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into vitamins (vitaminA, retinol, vitaminD, `D3-cholecalciferol`, `D2Ergocalciferol`,`vitaminD325hydroxy`, `25-hydroxycholecalciferol`, vitaminE, `alpha-tocopherol`, `gamma-tocopherol`, `delta-tocopherol`, `alpha-tokotrienol`, vitaminK1, vitaminB1, `thiamine`, `hydroxyethylthiazole`, `vitaminB2-Riboflavin`, NiacinEquivalent, niacin, vitaminB6, pantothenic, biotin, folate, b12, cVitamin, `L-ascorbicAcid`,`L-dehydroascorbicAcid`, product_idproduct) "
                + "                                 values ("+vitaminA+", "+retinol+", "+vitaminD+", "+D3Cholecalciferol+","+D2Ergocalciferol+","+vitaminD325hydroxy+", "+_25Hydroxycholecalciferol+", "+vitaminE+", "+alphaTocopherol+", "+gammaTocopherol+", "+deltaTocopherol+", "+alphaTokotrienol+", "+vitaminK1+", "+vitaminB1+", "+thiamine+", "+hydroxyethylthiazole+", "+vitaminB2Riboflavin+", "+NiacinEquivalent+", "+niacin+", "+vitaminB6+", "+pantothenic+", "+biotin+", "+folate+", "+b12+", "+cVitamin+", "+LAscorbicAcid+", "+LDehydroascorbicAcid+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadOrganicAcids(float lLacticAcid, float dLacticAcid, float laticAcidTotal, float citricAcid, float oxalicAcid, float malicAcid, float aceticAcid, float benzoicAcid, float sorbicAcid, float propionic, float organicAcidsTotal, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into organicacids (`l-lacticAcid`, `d-lacticAcid`, laticAcidTotal, citricAcid, oxalicAcid, malicAcid, aceticAcid, benzoicAcid, sorbicAcid, propionic, organicAcidsTotal, ingredient_idIngredient)"
                    + "                      values ("+lLacticAcid+", "+dLacticAcid+", "+laticAcidTotal+", "+citricAcid+", "+oxalicAcid+", "+malicAcid+", "+aceticAcid+", "+benzoicAcid+", "+sorbicAcid+", "+propionic+", "+organicAcidsTotal+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into organicacids (`l-lacticAcid`, `d-lacticAcid`, laticAcidTotal, citricAcid, oxalicAcid, malicAcid, aceticAcid, benzoicAcid, sorbicAcid, propionic, organicAcidsTotal, product_idproduct)"
                    + "                      values ("+lLacticAcid+", "+dLacticAcid+", "+laticAcidTotal+", "+citricAcid+", "+oxalicAcid+", "+malicAcid+", "+aceticAcid+", "+benzoicAcid+", "+sorbicAcid+", "+propionic+", "+organicAcidsTotal+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadBiogeneamines(float histamine, float tyramine, float phenylethylamine, float putrescine, float cadaverine, float spermine, float spermidine, float serotonin, int id, boolean isIngredient) throws Exception{
        try{
            PreparedStatement statment;
        Connection conn = getConnection();
        if(isIngredient){
            statment = conn.prepareStatement("insert into biogeneamines (histamine, tyramine, phenylethylamine, putrescine, cadaverine, spermine, spermidine, serotonin, ingredient_idIngredient) "
                    + "                        values ("+histamine+", "+tyramine+", "+phenylethylamine+", "+putrescine+", "+cadaverine+", "+spermine+", "+spermidine+", "+serotonin+", "+id+");");
        }else{
            statment = conn.prepareStatement("insert into biogeneamines (histamine, tyramine, phenylethylamine, putrescine, cadaverine, spermine, spermidine, serotonin, product_idproduct) "
                    + "                        values ("+histamine+", "+tyramine+", "+phenylethylamine+", "+putrescine+", "+cadaverine+", "+spermine+", "+spermidine+", "+serotonin+", "+id+");");
        }
        statment.execute();
        }catch(Exception e){System.out.println(e);}
    }  
    public void uploadProduct(String name, int kj, int kcal, float totalN, float protien, float carbohydrates, float addedSugar, float fat, float fiber, float alcohol, float ash, float dryMatter, float water, String DB) throws Exception{
        try{
        Connection conn = getConnection();
        PreparedStatement statment = conn.prepareStatement("insert into product (nameEN, kj, kcal, totalN, protien, carbohydrates, addedSugar, fat, fiber, alcohol, ash, dryMatter, water, DB) "
                + "                                 values ('"+name+"', "+kj+", "+kcal+", "+totalN+", "+protien+", "+carbohydrates+", "+addedSugar+", "+fat+", "+fiber+", "+alcohol+", "+ash+", "+dryMatter+", "+water+", '"+DB+"');");
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
        PreparedStatement statment = conn.prepareStatement("select idIngredient from ingredient where nameEN = '"+name+"';");
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
        PreparedStatement statment = conn.prepareStatement("select idproduct from product where nameEN = '"+name+"';");
        ResultSet resultSet = statment.executeQuery();
        if (resultSet.next()){
            id = resultSet.getInt("idproduct");
        }
        return id;
        }catch(Exception e){System.out.println(e);}
        return id;
    }
}
