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
public class ODV7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Kombinasyon hesabi icin yani n'nin r'li kombinasyonu icin bir n degeri girin ");
        int n = input.nextInt();
        System.out.println(" Simdide r degerini girin");
        int r = input.nextInt();
        int faktoriyeln = 1 ;
        int faktoriyelr = 1 ;
        int faktoriyelc = 1 ;
        int c = n-r ;
        
        
        while(n>0)
        {
            faktoriyeln *= n ;
                    n = n-1 ;
        }
        
        while(r>0)
        {
            faktoriyelr *= r ;
            r = r-1 ;
            
        }
        while(c>0)
            
        {       faktoriyelc *= c ;
               c = c-1  ;
    }
            
        
            
            
            
         double sonuc = faktoriyeln/(faktoriyelr * faktoriyelc) ;
         System.out.println("Sonuc: "+sonuc);
        
            
            
        
        
    }
    
}
