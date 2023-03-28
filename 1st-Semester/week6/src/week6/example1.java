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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir sayi giriniz ");
        int a = input.nextInt();
        int sayac = 0 ;
        for (int i = 1; i<=a ; i++)
            
        {
            
            for (int k = 1;  k<=sayac ; k++) //Bosluk
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= a-sayac ; k++) //yıldız
            {
                System.out.print("*");
            }
            sayac += 1 ;
            System.out.println();//alt satır
              }
            
      
            

            
            
            
            
            
      
    }
    
}
