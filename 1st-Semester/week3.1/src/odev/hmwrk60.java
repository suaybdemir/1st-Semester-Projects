/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class hmwrk60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir sayı giriniz ");
        double a = input.nextInt();
        System.out.println(" Lutfen bir sayı daha giriniz ");
        double b = input.nextInt();
              double toplam1 = 0 ;
                            double c = 0 ;
        while(c<b)
  {
      
      toplam1 = toplam1 + a + 1  ;
      c = c+1 ;
      
  }
    
   System.out.println(c);
   toplam1 = (toplam1)-c  ;
    
   
   System.out.println(toplam1+" carpma sonucu ");
    }
    
}
