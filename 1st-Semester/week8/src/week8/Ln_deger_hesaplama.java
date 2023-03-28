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
public class Ln_deger_hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Ln degeri 1/a*(a+1) + 1/(a+2)(a+3) + ....... seklinde yaklasik olarak hesaplanabilir . Buna gore girilen terim sayisina gore yaklasık olarak Ln(2) nin degerini bulan program ;
        
        int c = 1;//while donguusu kullanılacagı icin bir artım islemi donguyu durdurabilmek icin gereklidir dolayısıyla bir toplam islemi yapilmalidir
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the term number ");
        int b = input.nextInt();
        
        
        int a = 1 ;//yukaridaki formule gore tanımlanmis a sayisi
                               
        double toplam = 0 ;
        double toplam_1 = 0  ;
        
        while(c<b)
        {
                
                
                 
                 toplam += a*(a+1);
                 
                 
                 toplam_1 += 1/toplam ;
                                 
                 c++ ;
                 
                  a+= 2 ;//bir sonraki isleme gecildiginde a nın 2 artmasi gereklidir
                 
                 
                 
                    
        }
        System.out.println(" Ln2 degeri girilen terim sayisina gore "+toplam_1);
        
        
    }
    
}
