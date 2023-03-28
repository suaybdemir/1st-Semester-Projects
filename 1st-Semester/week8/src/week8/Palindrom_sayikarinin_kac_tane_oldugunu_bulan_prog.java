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
public class Palindrom_sayikarinin_kac_tane_oldugunu_bulan_prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Yazilislari ve okunuslari ayni olan sayilara palindrom sayilar denir.Buna gore girilen basamak sayisina gore kac tane palindrom sayisi oldugunu 
        yazdiran program*/
                
        int a ;
        double b ;
        do
        {
            System.out.println(" Lutfen bir sayi giriniz ");
            a = input.nextInt();
        }while(a<0);
        
        b = 9*Math.pow(10,(a-1)/2) ;
        
        System.out.println(b);
        
        
        
    }
    
}
