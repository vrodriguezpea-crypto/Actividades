/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;

public class EjemploFindInLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner("abcdef12123");
        
        String n1 = sc.findInLine("\\w+");
        System.out.println("Primer numero: " + n1);
       
        sc.close();
    }
}
