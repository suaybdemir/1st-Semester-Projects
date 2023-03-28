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
public class Brother_formulu_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N ;
        double toplam = 0 ;
        
        
        do
        {
            System.out.println(" Bir terim sayisi ");
            N = input.nextInt();
        }while(N<=0);
        
        for (int i = 0; i <= N ; i++){
           int temp = (2*i)+ 1 ;
           int fakt = 1 ;
            for (int j = 1; j <= temp; j++) {
                fakt *= j ;
            }
            toplam += (double) (temp+1)/fakt ;
            System.out.println(toplam);
        }
        
    }
    
}
