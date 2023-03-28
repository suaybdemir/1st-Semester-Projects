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
public class OreHarmonikSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a ;
        double sayac1 = 0 ;
        double sayi = 0 ;
        double toplam1 = 0 ;
        double b ;
        int c ;
        do
        {
            System.out.println(" Lutfen bir sayi giriniz ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1; i <= a; i++) {
            if(a%i==0)
            {
                sayac1++;
                sayi = i ;
                toplam1 += 1 /sayi ;

            }
            
        }
        
        b = (double) sayac1/toplam1 ;//sonuc bulundu
        c = (int) Math.round(b) ;//ondalıklardan kurtulundu
      
        if(c==b){
        System.out.println(a+" Bu bir harmonik sayidir ");}
        else
            System.out.println(a+" Bu bir harmonik sayi degildir ");
        
        
        
        
        
        

    }
    
}
