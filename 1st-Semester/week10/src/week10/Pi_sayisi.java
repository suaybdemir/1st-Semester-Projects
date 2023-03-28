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
public class Pi_sayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int k ;
        double toplam = 0 ;
        double b ;
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin ");
            k = input.nextInt();
        }while(k<0);
        
        for (int i = 0; i <= k ; i++) {
            
            toplam += Math.pow(-1, i) / ((2*i)+1) ;
            
            
            b = 4*(toplam) ;
        
        System.out.println(b);
            
            
        }
        
        
        
        
        
    }
    
}
