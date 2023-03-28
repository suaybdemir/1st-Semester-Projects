/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevler;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class odv58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        do
        {
            System.out.println(" Lutfen 7 den buuyk bir tamsayı gir ");
            a = input.nextInt();
            
        }
        while(a<=7);
        
        for (int i = 0; i <= a; i++)
        {
            for (int j = 0; j <=a ; j++)
            {
                
                int  b = 3*i + 5*j ;
                if(a==b)
                {
                    System.out.println("sayı  "+3*i+" = i  ve "+5*j+" = j");
                }
                   
               
                
               
                
            }
           
             
              
              }
            
            }
    
        }
    }
    
}
