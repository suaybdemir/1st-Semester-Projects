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
public class ortalama_bulucu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N ;
        int toplam_aritmetik=0;
        int carpim = 1 ;
        double toplam_harmonik=0;
        int toplam_kontraharmonik=0;
        do
        {
            System.out.println(" Lutfen bir dizi uzunlugu giriniz ");
            N = input.nextInt();
        }while(N<0);
        int[]a=new int[N];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+" inci a dizi teriminin degerini girin");
            a[i]= input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            toplam_aritmetik+=a[i];
            carpim*=a[i];
            toplam_harmonik+= 1/a[i] ;
            toplam_kontraharmonik+=a[i]*a[i];
        }
        double ao = toplam_aritmetik/N ;
        double go = Math.pow(carpim,(1/N));
        double ho = N/toplam_harmonik ;
        double kho = toplam_kontraharmonik/toplam_aritmetik ;
        System.out.println(" Aritmetik Ortalama = "+ao+" Geometrik Ortalama = "+go+" Harmonik Ortalama = "+ho+" Kontraharmonik Ortalama = "+kho);
    }
    
}
