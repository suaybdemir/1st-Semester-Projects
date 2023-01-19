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
public class Polinom_degerinin_dizi_ile_hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N;
        int b ;// polinomun degiskende yerine koyulacak olan sayidir
        int toplam = 0;
        do
        {
            System.out.println(" Lutfen bir dizi uzunlugu girin ");
            N = input.nextInt();
            System.out.println(" Polinom tamsayi olan hangi x degeri icin hesaplama yapacak ? ");
            b = input.nextInt();
        }while(N<0 && b<0);
        int[]a= new int[N];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+" inci dizi teriminin buyuklugunu girin");
            a[i]=input.nextInt();
        }
        for (int i = a.length ; i==0 ; i--) {//en yuksek terimli diziden baslayarak 0 a dogru giderken toplama yaptirmak icin bir for
            toplam+= a[i]*Math.pow(b,(Math.pow(b,i)));
        }
        System.out.println(" Polinomun sonucu "+b+" dir.");
    }
    
}
