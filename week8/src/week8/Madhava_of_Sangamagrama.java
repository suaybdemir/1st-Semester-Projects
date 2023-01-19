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
public class Madhava_of_Sangamagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Pi sayısı yaklasik olarak sqrt12 *  ( 1 - 1/3*3  + 1 / 5*3^2 - 1/ 7*3^3 .... ) formulu ile hesaplanabilir . Buna gore terim sayisi girilen programda pi yaklasik olarak ; 
        
            int a;//  terim sayisi icin 
            double b = 0 ;// bir sayi icin tolama isareti 
            double p ;// bir sayi icin
            double fin ; //sonucu bulmak icin yapılan islem
            do
            {
                System.out.println(" Lutfen bir terim sayisi girin");
                a = input.nextInt();
                
            }while(a<0);
            
            for (int i = 0; i <= a-1; i++) {//
             b += Math.pow(-1,i)/(((2*i)+1)*Math.pow(3,i)) ;
        }
            
        p = Math.pow(12,1/2);// 
        
        fin =p*b ;//
        
        System.out.println(" Pi nin yaklasik degeri "+fin+" dir .");
        
        
    }
    
}
