/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Brothers_formulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Brothers formulune gore "e" sayisini yaklasik olarak bulan program . Brothers formulu = Sigma(toplam) 0 dan sonsuza kadar , (2k+2) / (2k+1) ! = e 
        
        int N;//Klavyeden bir sayi almak icin tanimladik
        int fakt = 1 ;// Bir faktoriyel islemi icin tanımlama yaptık
        double toplam = 0 ;// Toplama islemi icin tanimlama yaptik
        do
        {
            System.out.println(" Please enter a amount of term");
            N = input.nextInt();// Sayıyı klavyeden aldik
        }while(N<0);
        
        for (int i = 0; i <= N; i++) {//0 dan klavyeden alinan terim dahil klavyedeki terime kadar terim sayisinda islem yapmaya basladik
            int temp = (2*i) + 1 ;//İslemleri basitlestirmek adina bir tanımlama yaptık yani 2k+1 formatı tanımlaması
            for (int j = 1; j <= temp ; j++) {//Faktoriyel islemi yapmak icin for dongusu kullaniyoruz 
                fakt *= j ;
            }
            
            toplam += (double) (temp+1)/fakt ;// 2*i+2 / 2k+1 ! islemini gerceklestiriyoruz
            System.out.println(toplam);
            
       
        
        
    }
    
}
