/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.MatchResult;

public class ProductosTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce productos (formato: nombre precio, ...):");
        System.out.print("> ");
        String entrada = sc.nextLine();
        
        Scanner scTexto = new  Scanner(entrada);
        
         Pattern p = Pattern.compile("(\\w+)\\s+(\\d+\\.\\d+)");
            double total = 0;
            
            while (scTexto.hasNext()) {
                if (scTexto.findInLine(p) != null){
                        MatchResult mr = scTexto.match();
                        
                        System.out.println(mr.group(1) + " cuesta " + mr.group(2));
                            total += Double.parseDouble(mr.group(2));                    
                } else {
                    scTexto.nextLine();
                }         
        }
            System.out.println("Total: " + total);
            scTexto.close();
            sc.close();
    }
    
}
