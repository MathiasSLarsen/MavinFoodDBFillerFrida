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
public class Subject {
    
    private String name;
    private int ingredient_idIngredient;
    private int product_idproduct;
    private int kj;
    private int kcal;
    private float totalN;
    private float protien;
    private float carbohydratesTotal;
    private float addedSugar;
    private float fat;
    private float fiber;
    private float alcohol;
    private float ash;
    private float dryMatter;
    private float water;
    
    private Allergens allergens; 
    private AminoAcids aminoAcids;
    private Carbohydrates carbohydrates;
    private Color color;
    private Factors factors;
    private FattyAcidsSums fattyAcidsSums;
    private Minerals minerals;
    private MonosaturatedFattyAcids MonosaturatedFattyAcids;
    private Name nameLang;
    private PolyunsaturatedFattyAcids polyunsaturatedFattyAcids;
    private SaturatedFattyAcids saturatedFattyAcids;
    private Sterols sterols;
    private SupermarkedGroup supermarkedGroup;
    private Vitamins vitamins;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIngredient_idIngredient() {
        return ingredient_idIngredient;
    }

    public void setIngredient_idIngredient(int ingredient_idIngredient) {
        this.ingredient_idIngredient = ingredient_idIngredient;
    }

    public int getProduct_idproduct() {
        return product_idproduct;
    }

    public void setProduct_idproduct(int product_idproduct) {
        this.product_idproduct = product_idproduct;
    }

    public int getKj() {
        return kj;
    }

    public void setKj(int kj) {
        this.kj = kj;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public float getTotalN() {
        return totalN;
    }

    public void setTotalN(float totalN) {
        this.totalN = totalN;
    }

    public float getProtien() {
        return protien;
    }

    public void setProtien(float protien) {
        this.protien = protien;
    }

    public float getCarbohydrates() {
        return carbohydratesTotal;
    }

    public void setCarbohydrates(float carbohydratesTotal) {
        this.carbohydratesTotal = carbohydratesTotal;
    }

    public float getAddedSugar() {
        return addedSugar;
    }

    public void setAddedSugar(float addedSugar) {
        this.addedSugar = addedSugar;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getFiber() {
        return fiber;
    }

    public void setFiber(float fiber) {
        this.fiber = fiber;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public float getAsh() {
        return ash;
    }

    public void setAsh(float ash) {
        this.ash = ash;
    }

    public float getDryMatter() {
        return dryMatter;
    }

    public void setDryMatter(float dryMatter) {
        this.dryMatter = dryMatter;
    }

    public float getWater() {
        return water;
    }

    public void setWater(float water) {
        this.water = water;
    }
    
    
}
