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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a ;
        int sayac = 0;
        do
        {
            System.out.println(" 0 dan buyuk bir tamsayi gir ");
            a = input.nextInt();
            
        }while(a<=0);
        
        for (int i = 0; i <= a; i++)
        {
                                           
            for (int j = 0; j<=a-i ; j++)//bosluk
            {
                System.out.print(" ");
            }
                                                
            for (int j = 0 ; j <=sayac ; j++)
            {
                System.out.print("*");//yıldız
            }
            
            sayac += 1 ;
            System.out.println();//satır
        }
        
        
    }
    
}
