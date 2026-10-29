/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner; 

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero para ver su tabla de multiplicar: ");
            
                int numero = teclado.nextInt();
                
                System.out.println("Tabla de multiplicar del " + numero + " : " );
                
                    for (int i = 1; i <= 10; i++) {
                        
                        int resultado = numero * i;
                        
                        System.out.println( numero + " X " + i + " = " + resultado);
        }
                    teclado.close();
    }
}
