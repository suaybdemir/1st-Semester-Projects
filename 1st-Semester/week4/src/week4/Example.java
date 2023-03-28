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
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir pozitif sayı giriniz ");
        double n = input.nextInt();
        int S = 1;
        int toplam = 0 ;
        while(S<=n)
        {
            if(S%2 !=0)
            { toplam = toplam + S ;
            }
            S=S+1 ;
        }
          System.out.println(" Toplam: "+toplam);  }
            
            
      
        }
    
    
}
