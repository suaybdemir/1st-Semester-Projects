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
public class Hmwrk_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//alt ucgen b matrisi olusturan program
        int S = 0;
        int N;
        do
        {
            System.out.println("Lutfen bir indis sayisi girin");
            N = input.nextInt();
        }while(N<0);
        int dizi[][]=new int[N][N];
        for (int i = 1; i <N; i++) {
            for (int j = 1; j <N; j++) {
                if(j>i)//alt ucgen b matrisi icin j nin i den buyuk oldugu durumlar geceerlidir
                {
                    dizi[i][j]=0;
                }
            }
        }
            
    }
    
}
