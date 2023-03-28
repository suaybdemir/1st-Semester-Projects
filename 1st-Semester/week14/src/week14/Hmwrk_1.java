/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hmwrk_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int N ;
        do
        {
            System.out.println(" Lutfen bir pozitif tamsayi giriniz");
            N = input.nextInt();
        }while(N<0);
        
        karetoplam(N);
    }
    public static void karetoplam(int N)
    {
        int toplam = 0;
        for (int i = 1; i <= N; i++) {
            toplam += i*i ;
        }
        System.out.println("Kare toplamlar: "+toplam);
    }
    
}
