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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a =5;int b=3;
        numsum(a,b);
        /*
        int a = 9 , b=3;
        */
        numsum(a, b);
        incrementby1(a);
        incrementby1(b);
       int[] sayi={10,7,5,12,18,32};
       array_mean(sayi);
        
        
    }
    public static void firstmethod(){
        
    }
    public static void numsum(int num1 , int num2){
        int result = num1+num2;
        System.out.println("Result:"+result);
    }
    public static void incrementby1(int num1){
        int sonuc  = num1 + 1 ;
        System.out.println("Result:"+sonuc);
    }
    public static void array_mean(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        double mean = (double) sum/array.length;
        System.out.println("Dizinin ortalaması:"+mean);
    }
    
}
