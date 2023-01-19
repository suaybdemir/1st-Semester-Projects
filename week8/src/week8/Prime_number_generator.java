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
public class Prime_number_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Klavyeden girilen sayiyi asal mi degil mi kontrol eden program ; 
        
        int a ;
        int b = 1 ;
        {
            System.out.println(" Bir sayi girin");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 2; i < a; i++) {
            if(a%i!=0)//bolunemiyorsa 1 arttır . a yı for dongusu icersinde dahil etmedigimizden dolayi b yi 1 den baslatmis oldum
            {
                b++;
            }
        }
        if(b+1==a)//bir fazlasi sayinin kendisine esit oldugu durumda yazdır
        {
            System.out.println(" asal sayi");
        }
        else
            System.out.println(" asal sayi degildir");
        
    }
    
}
