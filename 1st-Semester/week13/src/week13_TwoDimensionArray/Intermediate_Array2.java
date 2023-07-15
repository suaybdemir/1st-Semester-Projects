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
public class Intermediate_Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen A ya vereceginiz satir sayisini girin");
        int satir1 = input.nextInt();
        System.out.println(" Lutfen A ya vereceginiz sutun sayisini girin");
        int sutun1 = input.nextInt();
        System.out.println(" Lutfen B ye vereceginiz sutun sayisini girin");
        int satir2 = input.nextInt();
        System.out.println(" Lutfen B ye vereceginiz sutun sayisini girin");
        int sutun2 = input.nextInt();
        
        int[][] a = new int[satir1][sutun1];
        int[][] b = new int[satir2][sutun2];
        int[][]carpim = new int[satir1][sutun2];
        
                for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                System.out.println((i+1)+" inci satırın"+(j+1)+" sutununu girin A dizisinde");
                a[i][j]= input.nextInt();
            }
        }
            for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                System.out.println((i+1)+" inci satırın"+(j+1)+" sutununu girin B dizisinde");
                b[i][j]=input.nextInt();
                
            }
        }
        
        
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                for (int k = 0; k < satir2; k++) {
                    carpim[i][j] += a[i][k]*b[k][j];
                }
            }         
        }
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                System.out.println(carpim[i][j]);
            }
        }
        
        
    }
    
}
