
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */
public class Edades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esValido = false;
        
        int edad = 0;
        
        while (!esValido) {      
            
            System.out.println("Ingresa tu edad: ");
            
            
            try {
            edad  = sc.nextInt();
            esValido = true;
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingresa solo números enteros." + e.getMessage());
            
            sc.nextLine();
        }
       }
        System.out.println("¡Gracias! Tu edad es: " + edad);
        
        
        sc.close();
    }
    
}
