/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucak_ev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class birinci_ay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int arr[][]=new int[12][3];
        int arr1[][]=new int[3][50];
        
        expenses_and_spend_amount(arr,arr1);
        
    }
    public static int[][] expenses_and_spend_amount(int arr[][],int arr1[][])
    {
        Random r = new Random();
        int sayac = 0;
        int toplam = 0;
        int S = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 50; j++) {
                arr1[i][j]= r.nextInt();
                toplam+=arr1[i][j];
            }
            arr[sayac][i]=toplam;
            sayac++;
            System.out.println(arr[sayac][i]);
        }
        
        out(arr);
        return arr;
    }
    public static int[][] out(int arr[][])
    {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println((i+1)+" inci kisinin "+(j+1)+" inci aydaki toplam borcu "+arr[i][j]+ " TL dir.");
            }
        }
        return arr;
    }
    
}
