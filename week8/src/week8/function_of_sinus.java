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
public class function_of_sinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*sin(x) fonksiyonu x - x^3 /3! + x^5 /5! - x^7 /7! + x^9/9! - .... seklinde hesaplanabilmektedir.Buna gore girilen x aci degeri ve terim sayisina gore sin(x)'in degerini 
        bulan program.
        */
        
        int k ;//terim sayisi
        int x ;//aci
        int a = 0 ;//toplama
        int b = 1 ;//faktoriyel
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin ");
            k = input.nextInt();
            System.out.println(" Lutfen bir aci girin ");
            x = input.nextInt();
            
        }while(k<0 && x<0 );
        
        for (int i = 1 ; i <= k; i++) {//1 terimde islem yapmak icin kullanılan for
            for (int j = 1; j <=((2*i)-1); j++)
            {
                b = b*j ;//faktoriyel hesaplama
                        
                
                
               
            }
             a += ((Math.pow(-1, (k-1)) * Math.pow(x , ((2*k)-1))) / b ) ;//formulizasyona gore yapilan islem
             
             if(i==k)//for dısında intialize olamadıgından yazdırma islemini for un icinde kullanmak icin kullanılan if
             {
                 System.out.println(a);
             }
             
        }
        
        
    }
    
}
