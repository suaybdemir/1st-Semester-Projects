/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class i_bolu_i_faktoriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N ;
        int fakt = 1 ; 
        double toplam = 0 ;
        do
        {
            System.out.println(" Lutfen bir terim sayisi giriniz ");
            N = input.nextInt();
        }while(N<1);
  
        for (int i = 1; i <= N ; i++) {
                        for (int j = 1; j <= i  ; j++) 
            {
                fakt *=  j ;
                    }
                    toplam += (double)  i/fakt ;
                    System.out.println(toplam);
                }
    }
        
        }
        
    }
    
}
