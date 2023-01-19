/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hmwrk_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//matrisin simetrik olup olmadıgını gostoren program
        int N ;
        int kontrol = 0;
        do
        {
            System.out.println("Lutfen bir indis degeri giriniz");
            N = input.nextInt();
        }while(N<0);
        
        int A[][]=new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Lutfen"+(i+1)+" satirinda "+(j+1)+" inci sutunun degerini giriniz");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(A[i][j]==A[j][i])//simetriklerin birbirine esit oldugu durummlarda kontrol 1 artar
                {
                    kontrol++;
                }
            }
        }
        if(kontrol==N*N)//kontrolun toplami , toplam matris icindeki eleman sayisina esitse bu dizi simetriktir
        {
            System.out.println("Dizi simetriktir");
        }
        else
            System.out.println("Dizi simetrik degildir");
    }
    
}
