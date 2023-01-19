/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ODV8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print(" Bir pozitif tamsayı giriniz ");
        int a = input.nextInt();
        int b = 0 ;
        int cift_toplam = 0 ;
        int tek_toplam = 0 ;
        int toplam = 0 ;
        while(b<a)
        {
            
            b += 1 ; 
            if(b%2==0)
            { 
                cift_toplam = cift_toplam + b ;
            }
            else 
            {
                tek_toplam += b ;
            }
            
            toplam += b ;
        
        }
        
        System.out.println(" Cift toplam: " + cift_toplam + " Tek toplam: "+ tek_toplam +" Toplam: "+toplam );
        
    }
    
}
