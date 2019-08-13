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
public class MonounsaturatedFattyAcidsTrans {
    private float c141Trans9;
    private float c161Trans;
    private float c181TransN9;
    private float c201Trans;
    private float c221Trans;
    private float c182TransUndifferentiated;

    public String toString(){
        return "****************\n"+
                "MonounsaturatedFattyAcidsTrans \n"+
                "c14:1-Trans-9; "+c141Trans9+"\n" +
                "c16:1-Trans; "+c161Trans+"\n" +
                "c18:1-Trans-N9; "+c181TransN9+"\n" +
                "c20:1-Trans; "+c201Trans+"\n" +
                "c22:1-Trans; "+c221Trans+"\n" +
                "c18:2-TransUndifferentiated; "+c182TransUndifferentiated+"\n";
    }
    public float getC141Trans9() {
        return c141Trans9;
    }

    public void setC141Trans9(float c141Trans9) {
        this.c141Trans9 = c141Trans9;
    }

    public float getC161Trans() {
        return c161Trans;
    }

    public void setC161Trans(float c161Trans) {
        this.c161Trans = c161Trans;
    }

    public float getC181TransN9() {
        return c181TransN9;
    }

    public void setC181TransN9(float c181TransN9) {
        this.c181TransN9 = c181TransN9;
    }

    public float getC201Trans() {
        return c201Trans;
    }

    public void setC201Trans(float c201Trans) {
        this.c201Trans = c201Trans;
    }

    public float getC221Trans() {
        return c221Trans;
    }

    public void setC221Trans(float c221Trans) {
        this.c221Trans = c221Trans;
    }

    public float getC182TransUndifferentiated() {
        return c182TransUndifferentiated;
    }

    public void setC182TransUndifferentiated(float c182TransUndifferentiated) {
        this.c182TransUndifferentiated = c182TransUndifferentiated;
    }
}
