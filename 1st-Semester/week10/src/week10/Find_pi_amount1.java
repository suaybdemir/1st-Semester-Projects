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
public class Find_pi_amount1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N ;
        double toplam = 0;
        
        do
        {
            System.out.println(" Lutfen bir N sayisi girin ");
            N = input.nextInt();
        }while(N<0);
        
        for (int i = 0; i <= N ; i++) {
            if(i%2==1)
            {
                toplam += (double) -1 / ((2*i)+1);
         }
            else
                toplam +=  (double) 1 / ((2*i)+1) ;
            
            System.out.println(toplam);
        }
        
        
    }
    
}
