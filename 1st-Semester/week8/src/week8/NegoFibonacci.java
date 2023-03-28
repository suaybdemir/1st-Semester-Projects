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
public class NegoFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* " NegaFibonacci sayıları" , Fibonacci serisinin negatif indisli elemanlarıdır . NegoFibonacci sayılarının ilk sekiz tanesi 1,-1,2,-3,5,-8,13,-21 seklindedir.
        Buna gore klavyeden girilen terim sayisina gore diziyi bulan program .*/
        
        int a ;
        int b = 1 ;//1.terim
        int c = 0 ;//2.terim
        int d = 1 ;//sayac
        
        do
        {
            System.out.println(" Please eneter a term ");
            a = input.nextInt();
            
        }while(a<0);
        
        System.out.println("1");
        
             while(d<=a-1)
             {
                 
                 
                     
                 b = c-b  ;
                 c = c-b ;
                 
                 
                 System.out.println(b);
                 d++;
             }
        
        
    }
    
}
