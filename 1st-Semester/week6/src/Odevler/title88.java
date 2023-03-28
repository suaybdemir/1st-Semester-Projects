/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevler;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class title88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a ;
        do
        {
            System.out.println(" 1 ' den buyuk bir tamsayı girmeni istiyorum");
            a = input.nextInt();
            
        }while(a<=1);
         
      
        
        for (int i = 1; i <a; i++)
        {
         if(a%i==0)
         {
             double j = a/i ;
             if(i%j!= 0 || j%i!= 0)
             {
                 System.out.println(" Asal sayı bolenleri "+i);
                 
             }
             
             
         }
        }
              }
    
}


