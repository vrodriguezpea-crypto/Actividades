/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class AnioBisiesto {
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);
          
          System.out.println("Ingresa un año para verificar si es bisiesto: ");
          
            int anio = scanner.nextInt();
            
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " SI es Bisiesto");
            
        } else {
                System.out.println("El año " + anio + " NO es Bisiesto");     
                
        }
            scanner.close();
    }
    
    
}
