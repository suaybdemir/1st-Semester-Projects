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
public class Mukemmel_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Klavyeden girilen ust sinir icin " MS = 2^n * ( 2^n+1 - 1 ) carpimiyla elde edilen sayilarin (2^n+1 - 1 ) kısmı asal sayi ise , 
        carpim sonucu " mmukemmel sayi " dir . " kritere gore " mukemmel sayı " ların listesini veren program .
        */
        
        int n ;
        double a ;//2^n in degeri icin tanimlama
        int b = 0;//bolunen bir terim yoksa 1 arttır ma icin gerekli tanimlama
        double c ;
        double m ;
        do
        {
            System.out.println(" Bir deger girin");
            n = input.nextInt();
        }while(n<0);
        
        a = Math.pow(2,n);
        c = Math.pow(2,n+1) -1 ;
        
        
        for (int i = 2; i < c  ; i++) {
            if( c % i != 0)
            {
                b++;
            }
                
        }
        
        m =  a*(c) ;
        
        if(b+2==c)
        {
           
           
            System.out.println(m+" Bu sayi bir mukemmel sayidir");
        }
        else
            
            System.out.println(" Verilen degere gore bir mukemmel sayi olusturulamadı ve bu sayi ile olusturulan sayi "+m+" dir .");
            
                    
            
        
    }
    
}
