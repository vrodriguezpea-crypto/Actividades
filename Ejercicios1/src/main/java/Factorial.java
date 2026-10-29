/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;
        
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        long factorial = 1;
        
        int i = 1;
        
        while (i<=numero) {            
            factorial = factorial * i;
            i++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        scanner.close();
    }
}
