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
public class Hmwrk_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir dizi uzunlugu girin");
        int N = input.nextInt();
       
        lowtohigh(N);
        
    }
    public static void lowtohigh(int N)
    {
            Scanner input = new Scanner(System.in);
                    int []arr=new int[N];
                    for (int i = 0; i < arr.length ; i++) {
                        System.out.println((i+1)+" inci dizinin degerini girin");
                        arr[i]=input.nextInt();
        }
                    
        for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
} 
}
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
