/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class Promedio {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double sumaCalificaciones = 0;
        
        // Usamos un bucle para pedir las 5 calificaciones
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la calificación " + i + " : ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion; // Sumamos cada calificación
             
           } 
        // Calculamos el promedio
         double promedio = sumaCalificaciones / 5;
          
            // Estructura condicional para ver si es aprobado o suspenso
                if (promedio >= 6) {
                    System.out.println("El alumno está aprobado");
            } else {
                    System.out.println("El alumno está suspenso");
        }
     scanner.close();
    }
}
