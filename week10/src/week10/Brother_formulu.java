/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Brother_formulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int k ;
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin ");
            k = input.nextInt();
        }while(k<0);
        
        int fakt = 1 ;
        double toplam = 0;
        
        for (int i = 0; i <= k ; i++) {
            for (int j = 1; j <= ((2*i)+1); j++) {
                fakt *= j ;
                
            }
            toplam +=  (double) ((2*i)+2)/(fakt) ;
            
            System.out.println(toplam);
        }
        
        
    }
    
}
