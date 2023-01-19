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
public class Hmwrk_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//İki matrisin sutun carpimindan B dizisi olusturan program
        int carpim = 1 ;
        int N;
        do
        {
            System.out.println("Lutfen bir indis sayisi girin");
            N = input.nextInt();
        }while(N<0);
        int B[]=new int[N];
        int A[][]=new int[N][N];
        for (int i = 1; i <N; i++) {
            for (int j = 1; j<N; j++) {
                carpim*=A[i][j];//sutunların carpiminin hesaplanma islemidir
                if(j==N)
                {
                    B[i] = carpim;//sutunlarin carpimi diziye aktarilmis oldu
                    carpim=1;//carpimlarin resetlenmesi icin yapilan bir esitleme islemi
                }
            }
        }
    }
    
}
