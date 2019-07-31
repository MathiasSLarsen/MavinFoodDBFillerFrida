/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavinfooddbfillerfrida.model;

/**
 *
 * @author Lenovo
 */
public class Carbohydrates {
    private float fructose;
    private float galactose;
    private float glucose;
    private float monosaccharidesTotal;
    private float lactose;
    private float maltose;
    private float sucrose;
    private float disaccharidesTotal;
    private float maltotriose;
    private float raffinose;
    private float otherSugars;
    private float sugarsTotal;
    private float sorbitol;
    private float mannitol;
    private float inositol;
    private float maltitol;
    private float sugarAlcoholsTotal;
    private float starch;
    private float IDF;
    private float SDFP;
    private float SDFS;
    private float aHexoses;
    private float bThePentoses;
    private float cUronicAcids;
    private float cellulose;
    private float lignin;
    private float crudeFibers;
    private float naturalDietFibre;

    public String toString(){
        return  "***********"+
                "Carbohydrates"+
                "fructose; "+fructose+"\n" +
                "galactose; "+galactose+"\n" +
                "glucose; "+glucose+"\n" +
                "monosaccharidesTotal; "+monosaccharidesTotal+"\n" +
                "lactose; "+lactose+"\n" +
                "maltose; "+maltose+"\n" +
                "sucrose; "+sucrose+"\n" +
                "disaccharidesTotal; "+disaccharidesTotal+"\n" +
                "maltotriose; "+maltotriose+"\n" +
                "raffinose; "+raffinose+"\n" +
                "otherSugars; "+otherSugars+"\n" +
                "sugarsTotal; "+sugarsTotal+"\n" +
                "sorbitol; "+sorbitol+"\n" +
                "mannitol; "+mannitol+"\n" +
                "inositol; "+inositol+"\n" +
                "maltitol; "+maltitol+"\n" +
                "sugarAlcoholsTotal; "+sugarAlcoholsTotal+"\n" +
                "starch; "+starch+"\n" +
                "IDF; "+IDF+"\n" +
                "SDFP; "+SDFP+"\n" +
                "SDFS; "+SDFS+"\n" +
                "aHexoses; "+aHexoses+"\n" +
                "bThePentoses; "+bThePentoses+"\n" +
                "cUronicAcids; "+cUronicAcids+"\n" +
                "cellulose; "+cellulose+"\n" +
                "lignin; "+lignin+"\n" +
                "crudeFibers; "+crudeFibers+"\n" +
                "naturalDietFibre; "+naturalDietFibre+"\n";
    }
    public float getNaturalDietFibre() {
        return naturalDietFibre;
    }

    public void setNaturalDietFibre(float naturalDietFibre) {
        this.naturalDietFibre = naturalDietFibre;
    }

    public float getCrudeFibers() {
        return crudeFibers;
    }

    public void setCrudeFibers(float crudeFibers) {
        this.crudeFibers = crudeFibers;
    }

    
    public float getSDFS() {
        return SDFS;
    }

    public void setSDFS(float SDFS) {
        this.SDFS = SDFS;
    }
    public float getSDFP() {
        return SDFP;
    }

    public void setSDFP(float SDFP) {
        this.SDFP = SDFP;
    }
    public float getIDF() {
        return IDF;
    }

    public void setIDF(float IDF) {
        this.IDF = IDF;
    }
    public float getSugarAlcoholsTotal() {
        return sugarAlcoholsTotal;
    }

    public void setSugarAlcoholsTotal(float sugarAlcoholsTotal) {
        this.sugarAlcoholsTotal = sugarAlcoholsTotal;
    }
    public float getMaltitol() {
        return maltitol;
    }

    public void setMaltitol(float maltitol) {
        this.maltitol = maltitol;
    }
    public float getInositol() {
        return inositol;
    }

    public void setInositol(float inositol) {
        this.inositol = inositol;
    }
    public float getMannitol() {
        return mannitol;
    }

    public void setMannitol(float mannitol) {
        this.mannitol = mannitol;
    }
    public float getSorbitol() {
        return sorbitol;
    }

    public void setSorbitol(float sorbitol) {
        this.sorbitol = sorbitol;
    }
    public float getOtherSugars() {
        return otherSugars;
    }

    public void setOtherSugars(float otherSugars) {
        this.otherSugars = otherSugars;
    }
    public float getRaffinose() {
        return raffinose;
    }

    public void setRaffinose(float raffinose) {
        this.raffinose = raffinose;
    }
    public float getMaltotriose() {
        return maltotriose;
    }

    public void setMaltotriose(float maltotriose) {
        this.maltotriose = maltotriose;
    }
    public float getGalactose() {
        return galactose;
    }

    public void setGalactose(float galactose) {
        this.galactose = galactose;
    }
    public float getFructose() {
        return fructose;
    }

    public void setFructose(float fructose) {
        this.fructose = fructose;
    }

    public float getGlucose() {
        return glucose;
    }

    public void setGlucose(float glucose) {
        this.glucose = glucose;
    }

    public float getMonosaccharidesTotal() {
        return monosaccharidesTotal;
    }

    public void setMonosaccharidesTotal(float monosaccharidesTotal) {
        this.monosaccharidesTotal = monosaccharidesTotal;
    }

    public float getLactose() {
        return lactose;
    }

    public void setLactose(float lactose) {
        this.lactose = lactose;
    }

    public float getMaltose() {
        return maltose;
    }

    public void setMaltose(float maltose) {
        this.maltose = maltose;
    }

    public float getSucrose() {
        return sucrose;
    }

    public void setSucrose(float sucrose) {
        this.sucrose = sucrose;
    }

    public float getDisaccharidesTotal() {
        return disaccharidesTotal;
    }

    public void setDisaccharidesTotal(float disaccharidesTotal) {
        this.disaccharidesTotal = disaccharidesTotal;
    }

    public float getSugarsTotal() {
        return sugarsTotal;
    }

    public void setSugarsTotal(float sugarsTotal) {
        this.sugarsTotal = sugarsTotal;
    }

    public float getStarch() {
        return starch;
    }

    public void setStarch(float starch) {
        this.starch = starch;
    }

    public float getaHexoses() {
        return aHexoses;
    }

    public void setaHexoses(float aHexoses) {
        this.aHexoses = aHexoses;
    }

    public float getbThePentoses() {
        return bThePentoses;
    }

    public void setbThePentoses(float bThePentoses) {
        this.bThePentoses = bThePentoses;
    }

    public float getcUronicAcids() {
        return cUronicAcids;
    }

    public void setcUronicAcids(float cUronicAcids) {
        this.cUronicAcids = cUronicAcids;
    }

    public float getCellulose() {
        return cellulose;
    }

    public void setCellulose(float cellulose) {
        this.cellulose = cellulose;
    }

    public float getLignin() {
        return lignin;
    }

    public void setLignin(float lignin) {
        this.lignin = lignin;
    }
    
    
    
}
