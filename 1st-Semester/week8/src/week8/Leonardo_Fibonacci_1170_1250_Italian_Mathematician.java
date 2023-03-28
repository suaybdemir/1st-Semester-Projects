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
public class Leonardo_Fibonacci_1170_1250_Italian_Mathematician {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Fibonacci sayilari 1 , 1 , 2 , 3 gibi artan dizi olup yazılacak terimden onceki iki sayinin toplamı bulunup o terime yazilir ve bu islem bu dongu ile ilerler. Bu programda
        yine istenilen dizideki sayı bulunacak lakin o dizinin bir eksigi ve bir artısı cikti olarak yazdirilacaktir */
        
        int a;
        int b = 1 ;//b ikinci terim olarak varsayılmistir
        int c = 1 ;//birinci terim olarak varsayilmistir
        int d = 1 ;//while dongusu kullanıldıgindan dongunun bir sure bitmesi icin artım islemlerinde kullanılan bir toplamdir 
        int toplam_1 ;
        int toplam_2 ;
        
        
        do
        {
            System.out.println(" Lutfen finocci sırasi girin ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i < a; i++) {
            
                            
            while(d<a)
            {   
             
                b += c ;
                
                c = b - c ;
                
                d++ ;
                
            }
             
           
         }
        
        toplam_1 = b-c ;//bir onceki terimi bul
        
        toplam_2 = b+c ;//bir sonraki terimi bul
        
        System.out.println(" Sayi "+b+" dir . Bir onceki sayi "+toplam_1+" dir . Bir sonraki sayi "+toplam_2+" dir .");//out
        
    }
    
}
