/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vize_1_calismalari;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Kare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int a ;
                 
        do
        {
            System.out.println(" Lutfen 2'den buyuk bir tamsayi giriniz");
            a = input.nextInt();
        }while(a<2);
        
        for (int i =  1 ; i <= a; i++) 
        {
            if(i==a || i==1)
            {
                for (int j = 1; j <= a; j++) {
                    System.out.print("*");
                }
            }
            else
                for (int j = 1; j <=a; j++)
                {
                if(j==1 || j==a)
                {
                    System.out.print("*");
                }
                else
                        System.out.print(" ");
             
                
                
            }
            System.out.println();
        }
    }
    
}
