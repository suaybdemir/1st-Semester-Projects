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
public class Hmwrk_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//internetten alınan diziyi kucukten buyuge dogru yazdıran program
        int N ;
        do
        {
            System.out.println("Lutfen bir indis degeri giriniz");
            N = input.nextInt();
        }while(N<0);
        
        int [][] arr = new int [N][N];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println((i+1)+" inci satirda "+(j+1)+" inci sutunun degerini gir");
                arr[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++)   
        {  
        for (int j = i + 1; j < arr.length; j++)   
        {  
        int tmp = 0;  
            for (int k = 0; k < arr.length; k++) {
                
           
        if (arr[k][i] > arr[k][j])   
        {  
        tmp = arr[k][i];  
        arr[k][i] = arr[k][j];  
        arr[k][j] = tmp;  
        }  
        }  
        } 
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
}
        
