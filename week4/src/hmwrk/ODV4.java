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
public class ODV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Kac tane sayinin birler basamagindaki sayıların toplamını istiyorusn? ");
        int n = input.nextInt();
        int t = 0 ;
        for (int i = 0; i < n; i++ )
        {
        System.out.println(" bir deger gir ");
        int a = input.nextInt();
        t = t + a%10 ;
        
        System.out.println(t);
        }
        
        
            
        
        
                
        
      
                
            
            
        
        
        
    }
    
}
