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
public class Asalcarpanbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Verilen sayinin asal carpanlarini bulan program .
        
        int n ;
        int sayac = 1  ;
        int c = 1 ;
        do
        {
            System.out.println(" Lutfen bir 1'den buyuk bir sayi girin");
            n = input.nextInt();// Klavyeden bir sayi al
        }while(n<0);
        
        for (int i = 2; i < n; i++) {
            if(n%i==0)
            {

            for (int j = 2; j < i; j++) {
                if(i%j!=0)
                {
                    sayac++;
                    if(sayac+1==i)
                    {
                        System.out.println(i);
                    }
                }

            }
        }
        
        }
    
}
