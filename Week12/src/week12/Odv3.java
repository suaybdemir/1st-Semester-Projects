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
public class Odv3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //iki buyuk iki kucuk olacak sekilde harfi yazdirir
        System.out.println(" Lutfen bir ifade girin");
        String a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            int r = i%4;
            if(r<2)
            {
                System.out.print(Character.toUpperCase(a.charAt(i)));
            }
            else
                System.out.print(a.charAt(i));
        }
        
    }
    
}
