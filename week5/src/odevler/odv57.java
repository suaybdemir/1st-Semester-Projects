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
public class odv57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        
        do
        {
            System.out.println(" Bir pozitif tamasyı gir sonra onun 2 sayının karesi seklinde yazılıp yazılamıycagını hrsaplıyaıym ");
             a = input.nextInt();
        }
        while(a<0);
       
        for (int i = 0; i <=a; i++)
        {
            for (int j = 0; j <=a ; j++)
            {
                int b = i*i + j*j ;
                
                if(a==b)
                {
                    System.out.println(" sayi = "+i*i+"^2 + "+j*j+"^2");
                    
                
                 
                
                
            }
            
          
        }
            
            
           
        }
       
        }
        
    }
    
}
