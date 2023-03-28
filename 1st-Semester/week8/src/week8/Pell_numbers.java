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
public class Pell_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Pell sayisinin kapali formulu  ((1+2^1/2 ) ^k - (1-2^1/2 ) ^k )/2*2^1/2 dir . Buna gore girilen terim sayisi kadar pell sayisi ; */
        int k = 1 ;
        int a;
        
        {
            System.out.println(" Enter a term number for pell's ");
            a = input.nextInt();
            
        }while(a<0);
        
        
        for (int i = 0 ; i <= a; i++) 
        {
            
                
            double birinci = Math.pow((1 + Math.sqrt(2)) , i) ;
            double ikinci = Math.pow((1 - Math.sqrt(2)) , i) ;
            double ucuncu = 2*Math.sqrt(2);
            
            double pell = (birinci-ikinci)/ucuncu ;
            
            
           
            
            System.out.println(pell);
            
        
        }
        
        
        
        
    }
    
}
