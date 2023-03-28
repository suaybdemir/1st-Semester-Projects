
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Delannoy_sayisi__YAPILAMADI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int m,n ;
        int sayac = 0 ;
        
      
       do
       {
           System.out.println(" Bir sayi girin");
           m = input.nextInt();
           System.out.println(" Bir sayi daha girin ");
           n = input.nextInt();
       }while(m<0 && n<0);
     
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(i==0 || j==0)
                {
                    sayac++;
                }
                else 
                    for (int k = 1; k <= i; k++) {
                        for (int f = 1; f <= n; f++) {
                                sayac++;
                        }
                    }
                }
                
                    
            }
        System.out.println(sayac);
        }
    }     
       
      
        
    

