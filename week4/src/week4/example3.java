/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Faktorıyel hesaplamak ıcın bır sayı girin ");
        int n = input.nextInt();
        int S = 1 ;
        int faktoriyel = 1 ;
        while(S<=n)
        {
            faktoriyel *= S;//faktoriyel = faktoriyel * S
            S +=1; // S=S+1
        }
        System.out.println("sonuc "+faktoriyel);
        
        
    }
        
        
            
            
                    
        }
    
    
}
