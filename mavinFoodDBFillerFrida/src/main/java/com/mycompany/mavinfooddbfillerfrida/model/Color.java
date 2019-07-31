/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavinfooddbfillerfrida.model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Color {
    private String name;
    private ArrayList<String> colors; 

    public Color() {
        this.colors = new ArrayList();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < colors.size(); i++){
            stringBuilder.append(colors.get(i));
            stringBuilder.append(" \n");
        }
        return stringBuilder.toString();
    }
    public void removeColor(){
        if(colors.size() > 0){
            colors.remove(colors.size()-1);
        }
    }
    public void addColor(String color){
        colors.add(color);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
