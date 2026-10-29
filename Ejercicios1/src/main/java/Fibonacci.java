/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("¿Cuantos numeros de la serie de Fibonacci deseas imprimir? ");
        
        int n = scanner.nextInt();
        
        // Validamos que el numero ingresado es positivo
        
            if (n <= 0) {
                System.out.println("Por favor, ingresa un numero mayor a 0");
        } else {
                // Variables para almacenar los dos primeros numeros
                 long primero = 0;
                 long segundo = 1;
                 
                 System.out.println("Los primeros " + n + " numeros de la serie de Fibonacci son: ");
                
                 // bucle para calcular e imprimir la serie
                 
                 for (int i = 1; i <= n; i++) {
                     System.out.println(primero + " ");
                     
                     // Calcular el siguiente numero sumando los dos anteriores
                     
                     long siguiente = primero + segundo;
                     
                     //Actualizamos los valores para la próxima iteración 
                     
                     primero = segundo;
                     segundo = siguiente;
                }
                  System.out.println();
        }
          scanner.close();
    }
    
}
