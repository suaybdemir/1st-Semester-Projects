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
public class Heterometriksayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Bir sayının bir fazlası ile çarpımını olusturan sayıları yazdıran program 
        
        int a ;
        
        do
        {
            System.out.println(" Bir sayi girin");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i < a; i++)//bir sayi dongusu
        {
            for (int j = 1; j < a; j++)//baska bir sayi dongusu
            {
                if(i==j*(j+1))//eger i sayisi bir sayinin kendisi ve kendisinin bir fazlasi ile carpimi seklinde yazılabiliyorsa yazdir
            {
                System.out.println(i);
            }
            }
                    
                
        }
        
    }
    
}
