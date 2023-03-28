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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        int S = 1 ;
        int tek_toplam = 0 ;
        int cift_toplam = 0 ;
        
        while(S<=n)
        {
            if (S%2 == 0)
            {cift_toplam = cift_toplam + S; }
            else
            {
                tek_toplam = tek_toplam + S;
            }
            S=S+1 ;
        }
        System.out.println("Tek toplam: "+tek_toplam +" ve Cift toplam: "+ cift_toplam);
            }
        
        
        }
        
    }
    
}
