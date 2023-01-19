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
public class ODV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir sayı yaz sana tersten yazayım ");
        System.out.print(" Sayıyı yazdır ");
        int a = input.nextInt();
        double c = 0 ;
        
        while(a>0)
        {
            double kalan = a%10 ;
            
          c = c*10 + kalan ;
          a = a/10  ;
          
            
            
                        
            
           
        }
        System.out.println(c);
    }
    
    
}
