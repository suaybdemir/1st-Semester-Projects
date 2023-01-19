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
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Tribonacci bir terimin uc oncesindeki terimlerin toplamina esit olmasıyla olsturulan dizidir.Buna gore giirlen terim sayisina gore tribonacci dizisini olusturan program*/
        
        
        int n = 1 ;
        int m;
        int a = 0 ;
        int b  = 0 ;
        int c = 1 ;
        int d ;
        do
        {
            System.out.println(" Enter the term number ");
            m = input.nextInt();
        }while(m<0);
        
        while(n<m) {
            
           d  = c ;//c yi bir degerde tutmak gerektiginden baska bir degere atma islemi tanimlandi
          
            c = a+b+c ;//c sayisi olusturuldu
            
            a = b ;//a bir terim ilerideki terimin degerini aldı
            
            b = d ;//b bir terim ilerideki terimin degerini aldı
            
            
            
            System.out.println(c);
            
            n++;
        }
        
        
        
    }
    
}
