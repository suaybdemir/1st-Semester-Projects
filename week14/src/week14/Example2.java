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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int[] sayi={10,7,5,12,18,32};
         array_mean(sayi);
         maxmin(sayi);
         System.out.println("Artırmadan once: "+sayi);
         int sayi1 = incrementby(sayi,3);
         System.out.println("Artırdıktan sonra: "+sayi1);
         sayi1 = incrementby(5,3);
    }
    public static void array_mean(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        double mean = (double) sum/array.length;
        System.out.println("Dizinin ortalaması:"+mean);
    }
    public static void maxmin(int[]array){
        int max = array[0];
        int min = array[0];
        int miniindex=0,maxindex=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[0]){
                max = array[i];
                maxindex=i;
            }
            else if(array[i]<array[0]){
                min = array[i];
                miniindex=i;
            }
            
        }
        System.out.println("Max:"+max+" Min:"+min);
        System.out.println("Dizinin minimum indeksi"+miniindex+" Dizinin maksimum indeksi"+maxindex);
    }
    public static int incrementby(int num,int index)
    {
        num += index ;
        return num;
    }
    
}
