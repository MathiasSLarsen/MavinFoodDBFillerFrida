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
public class MonosaturatedFattyAcids {
    private float c141n5;
    private float c151;
    private float c161n7;
    private float c171n7;
    private float c181n9;
    private float c181n7;
    private float c201n9;
    private float c201n11;
    private float c221n9;
    private float c221n11;
    private float c241n9;
    private float other;

    public String toString(){
        return "**************\n"+
                "MonosaturatedFattyAcids\n"+
                "c14:1n-5; "+c141n5+"\n" +
                "c15:1; "+c151+"\n" +
                "c16:1n-7; "+c161n7+"\n" +
                "c17:1n-7; "+c171n7+"\n" +
                "c18:1n-9; "+c181n9+"\n" +
                "c18:1n-7; "+c181n7+"\n" +
                "c20:1n-9; "+c201n9+"\n" +
                "c20:1n-11; "+c201n11+"\n" +
                "c22:1n-9; "+c221n9+"\n" +
                "c22:1n-11; "+c221n11+"\n" +
                "c24:1n-9; "+c241n9+"\n" +
                "other; "+other+"\n";
    }
    
    public float getOther() {
        return other;
    }

    public void setOther(float other) {
        this.other = other;
    }

    
    public float getC201n9() {
        return c201n9;
    }

    public void setC201n9(float c201n9) {
        this.c201n9 = c201n9;
    }
    public float getC171n7() {
        return c171n7;
    }

    public void setC171n7(float c171n7) {
        this.c171n7 = c171n7;
    }
    
    public float getC151() {
        return c151;
    }

    public void setC151(float c151) {
        this.c151 = c151;
    }
    public float getC141n5() {
        return c141n5;
    }

    public void setC141n5(float c141n5) {
        this.c141n5 = c141n5;
    }

    public float getC161n7() {
        return c161n7;
    }

    public void setC161n7(float c161n7) {
        this.c161n7 = c161n7;
    }

    public float getC181n9() {
        return c181n9;
    }

    public void setC181n9(float c181n9) {
        this.c181n9 = c181n9;
    }

    public float getC181n7() {
        return c181n7;
    }

    public void setC181n7(float c181n7) {
        this.c181n7 = c181n7;
    }

    public float getC201n11() {
        return c201n11;
    }

    public void setC201n11(float c201n11) {
        this.c201n11 = c201n11;
    }

    public float getC221n9() {
        return c221n9;
    }

    public void setC221n9(float c221n9) {
        this.c221n9 = c221n9;
    }

    public float getC221n11() {
        return c221n11;
    }

    public void setC221n11(float c221n11) {
        this.c221n11 = c221n11;
    }

    public float getC241n9() {
        return c241n9;
    }

    public void setC241n9(float c241n9) {
        this.c241n9 = c241n9;
    }
    
    
}
