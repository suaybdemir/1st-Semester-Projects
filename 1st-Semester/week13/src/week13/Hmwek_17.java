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
public class Hmwek_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Ust ucgen matrisi olusturan program
        int S=0;
        int N;
        do
        {
            System.out.println("Lutfen bir indis sayisi girin");
            N = input.nextInt();
        }while(N<0);
        
        int dizi[][]=new int[N][N];
        for (int i = 1; i <N; i++) {
            for (int j = 1; j <N; j++) {
                if(i>j){// i nin j den buyuk oldugu durumlarda bu matris olusur
                    dizi[i][j]=0;
                }
            }
        }
    }
    
}
