/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
             System.out.println("Ingresa el dividendo: ");
                double dividendo = sc.nextDouble();
            System.out.println("Ingresa el divisor: ");
                double divisor = sc.nextDouble();
                
                if (divisor == 0){
                    throw new ArithmeticException ("NO se puede dividir entre 0");
                }
                
                double resultado = dividendo / divisor;
                
                    System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            
            //Atrapa cualquier excepcion
            
            System.out.println(" ERES TONTO Error:" + e.getMessage());
        }
        
        sc.close();
    }
}
