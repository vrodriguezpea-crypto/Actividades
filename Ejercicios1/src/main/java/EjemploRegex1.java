/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class EjemploRegex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner("42 abc 100 xyz");
        
            while (sc.hasNext()) {
            
                if (sc.hasNext("\\d+")) {
                    String num = sc.next("\\d+");
                    System.out.println("Numero: " + num);
                    
                } else {
                
                     sc.next(); 
                } 
        }
            sc.close();
    }
    
}
