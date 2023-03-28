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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Fibonacci sayilari 1 , 1 , 2 , 3 gibi artan dizi olup yazılacak terimden onceki iki sayinin toplamı bulunup o terime yazilir ve bu islem bu dongu ile ilerler.
        Buna gore fibonacci sayilarini yazdiran program . */
        
        int a ;
        int b = 0 ;
        int c = 1 ;
        do
        {
            System.out.println(" Kac sıra fibonacci yazdiralacak ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i < a; i++) {
            c = b+c ;//kendinden iki onceki terimi toplar ve kendi terimine toplamini yazdirmis olur
            b = c-b ;//bir sonraki terimin degerini alır
            
            System.out.println(b);
        }
        
        
    }
    
}
