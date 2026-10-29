/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Locale;
import java.util.Scanner;

public class Datos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Altura (m): "); 
        double altura = sc.nextDouble();
        
        System.out.println("\n --- Datos ingresados ---");
        
        System.out.println("Nombre:" + nombre);
     
        System.out.println("Edad:" + edad);
        
        System.out.println("Altura:" + altura);
        
        sc.close();
    }
    
}
