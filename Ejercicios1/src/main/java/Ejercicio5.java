/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */


import java.util.*;


public class Ejercicio5 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
      
        
        do {            
             int edad = 0;
             boolean error;
             respuesta = sc.next();
        do {            
            error = false; //Asumo que no hay error
            
            System.out.println("Ingresa tu edad: ");
            
            try {
                
                edad = sc.nextInt();
                
               } catch (InputMismatchException e) {
                   
                   System.out.println("Error: Porfavor ingresa numeros enteros");
                                    sc.nextLine();
                                    error = true;
            }     
        } while (error);
        
            System.out.println(" Error ingresa solo numeros enteros");
                sc.nextLine();
                
                error = true;
       
        
            
        } while (respuesta.equalsIgnoreCase ("s"));  // Si responde "s" o "S" vuelve a empezar el bucle anterior
        
        System.out.println("Programa terminado ¡Hasta luego!");
   }
}
