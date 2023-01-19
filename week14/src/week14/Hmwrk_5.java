/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hmwrk_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi olan satir sayisi girin");
        int row = input.nextInt();
        System.out.println("Lutfen pozitif bir tamsayi olan sutun sayisi girin");
        int col = input.nextInt();
        
        int A [][]= new int[row][col];
        int B [][]= new int[row][col];
        int sum [][] = new int[row][col];
        dizitoplami(A,B,sum);
    }
    public static void dizitoplami(int A[][],int B[][],int sum[][])
    {
        
        for (int i = 0; i < sum.length-1; i++) {
            for (int j = 0; j < sum.length-1; j++) {
                sum[i][j]+=A[i][j]+B[i][j];
            }
        }
    }
    
}
