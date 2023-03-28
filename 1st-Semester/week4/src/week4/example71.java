/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir sayının asal olup olmadıgını gormek ıcın bir sayı giriniz ");
        int a = input.nextInt();
        int b = 2;
        int asal = 0 ;
        int asal_degil = 0 ;
                 
        while( b<a)
        {
                    
            if(a != 1 && a%b != 0)
            {
                                           b=b+1 ;      
                                System.out.println(" Bu sayı asal ");
                         }
            else
            {
                                             
            System.out.println( " Bu sayı asal degil ");
                                                                             
            }
            
           
                   }
       
             
            
         
                    
        
      
       
         
         
                
        


    
      
               
 
            
                    
        
        
    
    
