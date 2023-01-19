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
public class Fibonacci_prime_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Fibonacci sayilari 1 , 1 , 2 , 3 gibi artan dizi olup yazılacak terimden onceki iki sayinin toplamı bulunup o terime yazilir ve bu islem bu dongu ile ilerler.
        Buna gore ; Fibonacci sayilarının asal olanlarını yazdıran program .
        */
        
        int a;
      
        int c = 1 ;
        int b = 0;
        int d = 0 ;
        
        
        do
        {
            System.out.println(" Please enter a term number for Fibonacci prime number and numbers  ");
            a = input.nextInt(); 
        }while(a<0);
        
        for (int i = 1 ; i < a; i++) {
            
            
                b += c ;//kendinden onceki iki terimi toplar ve kendi terimine yazdirir
                c = b - c ;//kendinden bir sonraki terimin degerini alır
                
                for (int j = 2 ; j < b; j++) {//Asal bolenleri yazdirabilmek icin donguye aldik
                if(b%j ==0)// bolunemiyorsa donguyu bitir
                {
                    j = b ;
                }
                else if(j==b-1)//eger dongunun sonuna kadar gidebilmisse yazdir
                {
                    System.out.println(b);
                }
                
            }
        }
        
        
        
    }
    
}
