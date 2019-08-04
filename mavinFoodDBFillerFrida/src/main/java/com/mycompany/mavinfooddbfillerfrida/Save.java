/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavinfooddbfillerfrida;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Save {
    
    public int load() throws FileNotFoundException{
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Food App\\MavinFoodDBFillerFrida\\mavinFoodDBFillerFrida\\save.txt");
        int savePoint;
        try (Scanner scanner = new Scanner(file)) {
            savePoint = scanner.nextInt();
        }
        return savePoint;
        
    }
    
    public void save(int savepoint) throws IOException{
        try (Writer writer = new FileWriter("C:\\Users\\Lenovo\\Desktop\\Food App\\MavinFoodDBFillerFrida\\mavinFoodDBFillerFrida\\save.txt")) {
            writer.write(savepoint + "");
        }
       
    }
}
