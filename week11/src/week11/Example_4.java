/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Example_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N;
        int toplam = 0;
        double ortalama ;
        do
        {
            System.out.println(" Lutfen bir kisi sayisi girin");
            N = input.nextInt();
        }while(N<0);
        
        Random r = new Random();
        /*
        int [] a = new int [N];
        
        for (int i = 0; i < a.length; i++) {
            a[i]= r.nextInt(100);
            toplam+= a[i];
        }
        ortalama = toplam / N ;
        
        for (int i = 0; i < a.length; i++) {
            if(ortalama>a[i]){
                System.out.println(a[i]+" alan "+(i+1)" inci ogrenci kaldın ");
            }
        }
*/ 
        int toplam1 = 0 ;
        int[] notlar = new int [N];
        for (int i = 0 ; i < notlar.length; i++) {
            System.out.print((i+1)+" inci not: " );
            notlar[i] = input.nextInt();
        }
       
        for (int i = 0; i < notlar.length; i++) {
            toplam+= notlar[i];
        }
        int ort = toplam / notlar.length ;
        
        for (int i = 0; i < notlar.length; i++) {
            if(notlar[i]<ort){
                System.out.println((i+1)+" inci ogrenci kaldın ve not ortalaman "+notlar[i]);
                toplam1++;
            }
        }
        System.out.println(toplam1+" Ogrenci kaldi ve "+(N-toplam1)+" ogrenci gecti");
        
        
        
        
    }
    
}
