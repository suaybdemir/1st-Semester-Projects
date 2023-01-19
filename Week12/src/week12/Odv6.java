/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Odv6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ASCII kod degeri kadar yildiz yazdiran program
        System.out.println(" Lutfen bir ifade yazin");
        String a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i);
            for (int j = 1; j < b-64; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
}
