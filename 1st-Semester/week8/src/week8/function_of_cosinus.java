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
public class function_of_cosinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* cos fonksiyonu 1 - x^2 / 2! + x^4/4! - x^6/6! + ..... seklinde hesaplanabilmektedir.Buna gore girilen terim ve x aci degerine gore cos(x) in degerini bulan program*/
        
        int k ;//terim sayisi
        int x ;//aci
        double a = 1 ;//faktoriyel
        int b = 1 ;//Toplam
        
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin ");
            k = input.nextInt();
            System.out.println(" Lutfen bir aci degeri girin ");
            x = input.nextInt();
        }while(k<0 && x<0);
        
        for (int i = 0; i <= k; i++) {//terim sayisi icin bir for
            for (int j = 1; j <= 2*k ; j++) {//faktoriyel "for" u 
                
                a *= j ;//faktoriyel hesaplama
                
            }
            b += Math.pow( -1 , k )*Math.pow(x,2*k )/a ;//formulizasyona gore yapilan toplama islemi
            
            
            
        }
        System.out.println(b);
        
        
    }
    
}
