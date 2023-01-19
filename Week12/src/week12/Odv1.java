/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author PC
 */
public class Odv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir ifade giriniz");
        String a = input.nextLine();
        Random rand = new Random();
        for (int i = 0; i < a.length(); i++) {
            
            int b = a.length();
            int c = rand.nextInt(b);
            if(c%2==0){
                System.out.print(Character.toLowerCase(a.charAt(i)));
            }
            else
                System.out.print(Character.toUpperCase(a.charAt(i)));
            
        }
        
        
        
        
        
        
        
                
    }
    
}
