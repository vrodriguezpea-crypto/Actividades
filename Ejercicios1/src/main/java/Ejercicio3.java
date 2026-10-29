/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int suma = 0; //Variable acamulada
        
        // Los primeros 50 numeros naturales del 1 al 50
            for (int i = 1; i <= 50; i++) {
            
                    suma += i;  // Equivale a suma = suma + i
        }
            System.out.println("La suma de los primeros 50 numeros es: " + suma);
    }
}
