/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevler;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class title97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a ;
        int b;
        int c = 0;
        int d = 0;
        int toplam_1 = 0;
        int toplam_2 = 0;
        
        do
        {
            System.out.println(" Bir sayı giriniz ");
            a = input.nextInt();
            System.out.println(" Lutfen bir sayi daha girinz ");
            b = input.nextInt();
            
                    
        }while(a<0 || b<0);
        
        while(c<a)
        {
            c++ ;
            if(a%c==0)
            {
                toplam_1 += c ;
                
            }
                    
        }
        while(d<b)
        {   
         d++;
         
         if(b%d==0)
         {
             toplam_2 += d ;
         }
    }
        
        toplam_1 -= a ;
        toplam_2 -= b ;
        
        if(toplam_1==b || toplam_2==a)
        {
            System.out.println(" Bunlar dost sayılardır ");
        }
        else
            System.out.println(toplam_1+" Bunlar dost sayı degildir "+toplam_2);
    
}
