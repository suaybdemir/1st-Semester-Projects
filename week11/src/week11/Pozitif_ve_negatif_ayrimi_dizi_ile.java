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
public class Pozitif_ve_negatif_ayrimi_dizi_ile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N ;
        int sayac_pozitif = 0;
        {
            System.out.println(" Dizinin terim sayi degerini girin");
            N = input.nextInt();
        }while(N<0);
        int[]a=new int[N];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+" inci dizinin degerini girin");
            a[i]=input.nextInt();
            if(a[i]>=0){
                sayac_pozitif++;//dizi buyuklugunu bulmak icin bir sayac 
            }
        }
        int d = sayac_pozitif ;
        int e = N-sayac_pozitif ;
        int sayac_b = 0 ;// b dizisinin terim sayisi icin bir sayac
        int sayac_c = 0;//c dizisinin terim sayisi icin bir sayac
        int[]b=new int[d];
        int[]c=new int[e];
        for (int i = 0; i < a.length; i++) {
           if(a[i]>=0){
              b[sayac_b]=a[i];
              sayac_b++;
           }
           else
               c[sayac_c]=a[i];
               sayac_c++;
        }
        for (int i = 0; i < d; i++) {
            System.out.println(b[i]+" b dizisinin elemanıdır ");
        }
        for (int i = 0; i < e; i++) {
            System.out.println(c[i]+" c dizisinin elemanıdır ");
        }
    }
    
}
