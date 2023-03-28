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
public class Kare_ucgensel_sayilar_GELISTIRELIBILIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Kare ucgen sayilar K0 = 1 , K1 = 36 olmak uzere Ki = (6*sqrt(Ki-1)-sqrt(Ki-2))^2 iterasyon islemi ile hesaplanabilir . Bu mantıga gore yazılan program 
        
        int a ;// klavyeden girilecek olan 
        double b = 1 ;// 1. terim degeri tanimlandi
        double c = 36 ;// 2.terim tanımlamasi
        double d ;// 3.terimde b ve c ye bagli olarak degismesi kabuldur
        
        do
        {
            System.out.println(" Lutfen bir terim sayisi isteyin");
            a = input.nextInt();
        }while(a<0);
        
        if(a==0)
        {
            System.out.println("1");// a 0 a esitse yazdir 
        }
        else if(a==1)
        {
            System.out.println("36");//a 1 esitese yazdir
        }
        else
        {
        
        for (int i = 1 ; i <=a-2; i++) {//bir donguye girilir lakin a=0 ve a=1 durumlari oldugundan!! terim sayisinin duzgun bir sekilde isleme alinabilmesi icin a-2 den baslar
            
            d = ((6*Math.sqrt(c))-Math.sqrt(b))*((6*Math.sqrt(c))-Math.sqrt(b)) ;//Ki = (6*sqrt(Ki-1)-sqrt(Ki-2))^2 iterasyon islemidir
            b = c ;//ilk terimi ikinci terim gibi gorur
            c = d ;//ikinci terimi ucuncu terim gibi gorur
            if(i==a-2)// d degeri for dongusu icerisinde "initalize" oldugu icin for icinde yazdırma yapilmalidir . Bu nedenle dongu bittginnde yazdirilmasi icin if kullanildi
            {
                System.out.println(d);
            }
            
          
        }
        }
        
        
        
        
        
        
        
        
    }
    
}
