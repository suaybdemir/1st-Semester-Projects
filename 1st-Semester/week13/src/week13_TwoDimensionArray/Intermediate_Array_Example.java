/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13_TwoDimensionArray;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Intermediate_Array_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir satir sayisi girin");
        int satir = input.nextInt();
        System.out.println(" Lutfen bir sutun sayisi girin");
        int sutun = input.nextInt();
        
        int[][] a = new int[satir][sutun];
        int[][] b = new int[satir][sutun];
        int [][]toplam = new int[satir][sutun];
        int [][]carpim = new int[satir][sutun];
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println((i+1)+" inci satırın"+(j+1)+" sutununu girin A dizisinde");
                a[i][j]= input.nextInt();
                System.out.println((i+1)+" inci satırın"+(j+1)+" sutununu girin B dizisinde");
                b[i][j]=input.nextInt();
                
            }
        }
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                toplam[i][j]= a[j][j]+ b[i][j];
            }
        }
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println((i+1)+"inci satir"+(j+1)+" ninci sutun icin a ve b matrislerinin toplamı");
                System.out.println(toplam[i][j]);
            }
        }

        
    }
    
}
