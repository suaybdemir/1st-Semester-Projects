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
public class TwoDimensionArraySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir satir ve sutun sayisi girin");
        int n = input.nextInt();
        int[][]a=new int[n][n];
        System.out.println(" A matrisi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+" inci satir ve "+j+" inci sutun : ");
                a[i][j]=input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>i)
                {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(" Ana kosegen uzeri toplami: "+sum);
    }
    
}
