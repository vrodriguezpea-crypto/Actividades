/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Arrays;

public class NewClass2 {
    
    public static void main(String[] args) {
        System.out.println("DECLARACION E INICIALIZACION");
        
        //Forma 1
        int[] numeros = new int[5];
        
            numeros[0] = 10;
            numeros[1] = 15;
            numeros[2] = 20;
            numeros[3] = 19; 
            numeros[4] = 14;
            
       //Forma 2
       
       String[] frutas = {"Manzana", "Platano", "Naranja", "Uva"}; 
       
       //Forma 3
       
       double [] precios = new double [] {1.5, 2.75, 3.99}; 
       
        System.out.println("Array de numeros: " + Arrays.toString(numeros));
        System.out.println("Array de frutas: " +  Arrays.toString(frutas));
         System.out.println("Array de precios: " + Arrays.toString(precios));
         
         
         //ACCESO A ELEMENTOS
         
         System.out.println(" ACCESO A ELEMENTOS");
         
         System.out.println("⚠ Los indices empiezan por 0");
         
         System.out.println(" Frutas[0]= " + frutas[0]);
         System.out.println(" Frutas[3]= " + frutas[3]);
         System.out.println("  Tamaño TOTAL " + frutas.length);
         
         //RECORRER UN ARRAY
         
         System.out.println(" RECORRER UN ARRAY  METODO CLASICO");
         
         for (int i = 0; i < numeros.length; i++) {
                System.out.println(" numeros[ "+ i + "] = " + numeros[i]);
                
                System.out.println();
                
        }
         
            System.out.println("RECORRER CON FOR EACH");
             
             for (String fruta: frutas){
                 System.out.println(" Fruta: " + fruta);
             }
             
              System.out.println();
              
              
              //MODIFICAR ELEMENTOS
              
              System.out.println("MODIFICAR ELEMENTOS");
              
              System.out.println(" Antes:  numeros[0]" + numeros[0]);
              numeros [0] = 999;
              System.out.println(" Despues numeros[0]" + numeros[0]);
              
                //RECORRER UN ARRAY
         
         System.out.println(" RECORRER UN ARRAY  METODO CLASICO");
         
         for (int i = 0; i < numeros.length; i++) {
                System.out.println(" numeros[ "+ i + "] = " + numeros[i]);
                
                System.out.println();       
        }
         
         //CALCULAR SUMA Y PROMEDIO
         
         System.out.println("OPERACIONES UTILES");
            int suma = 0;
            int maximo = numeros[0];
            int minimo = numeros[0];
            
            for (int num : numeros){
                suma += num;
                if (num > maximo) maximo = num;
                if (num < minimo) minimo = num;
            }
            
            double promedio = (double) suma / numeros.length;
            
            System.out.println(" Suma total: " + suma);
            System.out.println(" Promedio " + promedio);
            System.out.println(" Maximo: " + maximo);
            System.out.println(" Minimo: "+ minimo);
            
            // BUSCAR UN ELEMENTO
            
            System.out.println("BUSCAR UN ELEMENTO");
                String buscada = "Naranja";
                boolean encontrada = false;
                
                for (int i = 0; i < frutas.length; i++) {
                    if (frutas[i].equals(buscada)){
                        System.out.println(" ✅ " + buscada + " esta en el indice " + i);
                            encontrada = true;
                            break;
                    }
                }
                if (!encontrada) System.out.println(" ❌ No se encontró " + buscada );
                      System.out.println();
                
          // ARRAYS BIDIMENSIONALES 8MATRIZ 3 X 3)
          
          System.out.println("ARRAYS BIDIMENSIONALES MATRIZ 3 X 3"); 
                
               int[][] matriz = {
                   {1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9}
               }; 
             
               for (int i = 0; i < matriz.length; i++) {
                   System.out.print("  ");
                   for (int j = 0; j < matriz[i].length; j++) {
                       System.out.print(matriz[i][j] + " ");
                }    
                     System.out.println();
        }
     
            
               System.out.println("\n matriz[1][2] = " + matriz[1][2] + "(fila 1, columna 2)");
               
                System.out.println( "BUSCAR TODAS LAS APARICIONES \n");
                
                int [][]  repetidos ={
                    {1, 2, 3},
                    {4, 5, 6},
                    {3, 8, 9}
                
                
                };
                
              int buscarRepetido = 3;
              boolean hayAlguno = false;

                    for (int i = 0; i < repetidos.length; i++) {

                         for (int j = 0; j < repetidos[i].length; j++) {

                            if (repetidos[i][j] == buscarRepetido) {

                              System.out.println("ENCONTRADO EN FILA " + i   + ", columna " + j);
                                                                              

            hayAlguno = true;
        }
    }
}

    if (!hayAlguno) {
         System.out.println("El número " + buscarRepetido + " no se ha encontrado.");
}
                
            // ORDENAR UN ARRAY
            System.out.println("ORDENAR UN ARRAY \n");
            
            int[] desordenado = {5, 2, 4, 8, 1};
            System.out.println(" Desordenado: " + Arrays.toString(desordenado));
            Arrays.sort(desordenado);
            System.out.println(" Ordenado: " + Arrays.toString(desordenado) + "\n");
            
            // ERRORES 
            
            System.out.println("ERRORES");
            System.out.println(" Si intentas acceder a frutas [10] da error");
           
            try {
            System.out.println(frutas[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
                System.out.println("Excepcion capturada" + e.getMessage());
        }
            
            
            
        }
    
    
}
                
               
               
            
               
               
              
    
    
     
    
       

