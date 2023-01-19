/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        Scanner input = new Scanner(System.in);
        int a;
        do
        {
            System.out.println(" Lutfen 0 dan buyuk bir tamsayi giriniz ");
            a = input.nextInt();
            
        }while(a<=0 || a%2 == 0);
         
        for (int i = 1 ; i <= a ; i++)
        {
             if ( i==1 || i == a )
             {
                 for (int j = 1; j <= a; j++)
                 {
                     System.out.print("*");
                 }
                 
             }
             else//satır aradaki satır ise
             {
                 for (int j = 1; j <=a ; j++) 
                 {
                    if(j==1 || j==a )//ilk sütun veya son sütun ise
                    {
                        System.out.print("*");
                        
                    }
                    else//diğer sütunlar ise
                    {
                        System.out.print(" ");
                    }
             }
                 System.out.println();//alt satıra geç 
             }
             
     
        
        
        
        
        
        
            
        
       
      
        
            
                 
             }
    
}
