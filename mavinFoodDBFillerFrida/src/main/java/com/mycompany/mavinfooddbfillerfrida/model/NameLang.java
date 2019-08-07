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
public class NameLang {
    private String dk;
    private String latin;

    
    public String toString(){
        return "navn: "+dk+"\n";
    }
    public String getDk() {
        return dk;
    }

    public void setDk(String dk) {
        this.dk = dk;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }
}
