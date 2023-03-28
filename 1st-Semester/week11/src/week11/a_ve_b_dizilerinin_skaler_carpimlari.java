/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class a_ve_b_dizilerinin_skaler_carpimlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N;
        int toplam = 0;
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin");
            N = input.nextInt();
        }while(N<0);
        int[] a = new int[N];//a dizisinin uzunlugu tanimlandi
        int[] b = new int[N];//b dizisinin uzunlugu tanimlandi
        for (int i = 0; i < a.length ; i++) {//a dizisinin degerlerinin giriyoruz
            System.out.println((i+1)+" inci a dizinin degerini girin");
            a[i]= input.nextInt();
        }
        for (int i = 0; i < b.length; i++) {//b dizisinin degerlerini giriyoruz
            System.out.println((i+1)+" inci b dizinin degerini girin");
            b[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {//skaler carpimlari buluyoruz
            toplam += a[i]*b[i] ;
        }
        System.out.println(" Skaler carpimlarin sonucu "+toplam+" dir.");
    }
    
}
