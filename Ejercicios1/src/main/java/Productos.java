/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vrodriguez
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.MatchResult;

public class Productos {
    public static void main(String[] args) {
        Scanner sc = new Scanner("producto1 1.0, producto2 3.5, producto3 2.3");
        Pattern p = Pattern.compile("(\\w+)\\s+(\\d+\\.\\d+)");
        double total = 0;
        
        while (sc.hasNext()) {            
            if (sc.findInLine(p) != null){
                MatchResult mr = sc.match();
                System.out.println(mr.group(1) + " cuesta " + mr.group(2));
                    total += Double.parseDouble(mr.group(2));
            } else {
                sc.nextLine();
            }
        }
        
        System.out.println("Total: " + total);
        sc.close();
    }
}
