/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Hmwrk_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dizinin satir sayisini girin");
        int row = input.nextInt();
        System.out.println("Lutfen dizinin sutun sayisini giriniz");
        int col = input.nextInt();
        System.out.println("Lutfen pozitif bir tamsayı olan ust sinir degeri girin");
        int ub = input.nextInt();
        
        rastgelesayi(row,col,ub);
        
    }
    public static void rastgelesayi(int row,int col,int ub)
    {
        Random r = new Random();
        double[][]arr=new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=r.nextInt(ub);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j]);
            }
        }
        
    }
    
}
