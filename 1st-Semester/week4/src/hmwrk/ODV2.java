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
public class ODV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int b = 0 ;
        System.out.println("f(x)= x^2 - 5x + 3 fonksiyonunun isaretini gostericem bir deger ile  ");
                System.out.print(" Bir deger gir ");
                double a = input.nextInt();
                if(a*a - 5*a + 3 > 0 )
                {
                    b +=1 ; 
                }
               if(a*a - 5*a + 3 == 0)
               {
                   b += 0 ;
               }
               if(a*a - 5*a + 3 < 0 )
               {
                   b += -1 ;
               }
               System.out.println(b);
                }
                
                
    }
    
}
