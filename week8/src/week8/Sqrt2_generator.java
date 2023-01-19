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
public class Sqrt2_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Klavyeden girilen terim sayisina gore kok2 nin yaklasik olarak degerini bulan program
        
        int a  ;
        double b ;
        double c  ;
        
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i <=a; i++) 
        {
            
            c = i ;//i ye dokunmamak icin yapilan bir denk alma islemi
            c += 2 + 1/c ;//yaklasik olarak olusturulabilen formulizasyona gore olusturulan denkleme
            
           
                
        if(i==a)//"initialize" olabilmesi icin for dongusu icerisinde
        {
            b = 1 + (1/ c);
            System.out.println("Sqrt 2 approx. "+b);
                
        }
        
           
        }
        
         
        
    }
    
}
