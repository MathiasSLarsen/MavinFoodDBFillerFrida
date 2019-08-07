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
public class FattyAcidsSums {
    private float otherFattyAcids;
    private float sumSaturated;
    private float sumMonounsaturated;
    private float sumPolyunsaturated;
    private float transFattyAcidsTotal;
    private float fattyAcidsTotal;
    private float sumN3FattyAcids;
    private float sumN6FattyAcids;

    public String toString(){
        return "*************\n"+
                "FattyAcidsSums"+
                "otherFattyAcids; "+otherFattyAcids+"\n" +
                "sumSaturated; "+sumSaturated+"\n" +
                "sumMonounsaturated; "+sumMonounsaturated+"\n" +
                "sumPolyunsaturated; "+sumPolyunsaturated+"\n" +
                "transFattyAcidsTotal; "+transFattyAcidsTotal+"\n" +
                "fattyAcidsTotal; "+fattyAcidsTotal+"\n" +
                "sumN3FattyAcids; "+sumN3FattyAcids+"\n"+
                "sumN6FattyAcids; "+sumN6FattyAcids+"";
    }
    public float getTransFattyAcidsTotal() {
        return transFattyAcidsTotal;
    }

    public void setTransFattyAcidsTotal(float transFattyAcidsTotal) {
        this.transFattyAcidsTotal = transFattyAcidsTotal;
    }
    public float getOtherFattyAcids() {
        return otherFattyAcids;
    }

    public void setOtherFattyAcids(float otherFattyAcids) {
        this.otherFattyAcids = otherFattyAcids;
    }

    public float getSumSaturated() {
        return sumSaturated;
    }

    public void setSumSaturated(float sumSaturated) {
        this.sumSaturated = sumSaturated;
    }

    public float getSumMonounsaturated() {
        return sumMonounsaturated;
    }

    public void setSumMonounsaturated(float sumMonounsaturated) {
        this.sumMonounsaturated = sumMonounsaturated;
    }

    public float getSumPolyunsaturated() {
        return sumPolyunsaturated;
    }

    public void setSumPolyunsaturated(float sumPolyunsaturated) {
        this.sumPolyunsaturated = sumPolyunsaturated;
    }

    public float getFattyAcidsTotal() {
        return fattyAcidsTotal;
    }

    public void setFattyAcidsTotal(float fattyAcidsTotal) {
        this.fattyAcidsTotal = fattyAcidsTotal;
    }

    public float getSumN3FattyAcids() {
        return sumN3FattyAcids;
    }

    public void setSumN3FattyAcids(float sumN3FattyAcids) {
        this.sumN3FattyAcids = sumN3FattyAcids;
    }

    public float getSumN6FattyAcids() {
        return sumN6FattyAcids;
    }

    public void setSumN6FattyAcids(float sumN6FattyAcids) {
        this.sumN6FattyAcids = sumN6FattyAcids;
    }
   
    
    
}
