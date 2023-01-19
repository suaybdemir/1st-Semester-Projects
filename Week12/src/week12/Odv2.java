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
public class Odv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Buyuk harfi kucuk , kucuk harfi buyuk olarak yazdirir
        System.out.println(" Bir ifade girin");
        String a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==Character.toLowerCase(a.charAt(i)))
            {
                System.out.print(Character.toUpperCase(a.charAt(i)));
            }
            else
                System.out.print(Character.toLowerCase(a.charAt(i)));
        }
        
    }
    
}
