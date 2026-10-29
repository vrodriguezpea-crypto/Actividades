/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class EjemploDelimitador {
    public static void main(String[] args) {
        Scanner sc = new Scanner("manzana,pera,uva,naranja");
            sc.useDelimiter(",");
            
            while (sc.hasNext()) {            
                System.out.println(sc.next());
        }
            sc.close();
    }
}
