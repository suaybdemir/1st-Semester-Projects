/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Swap_High_w_Low {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Random r = new Random();
        int n ;
        {
            System.out.println(" Lutfen bir dizi buyuklugu girin");
            n = input.nextInt();
        }while(n<0);
        int[] a = new int[n];
        /*
        for (int i = 0; i < randomsayi.length; i++) {
            randomsayi[i]= r.nextInt(100);
            System.out.println(randomsayi[i]+"**");
        }
        int min = randomsayi[0];
        
        for (int i = 0; i < randomsayi.length; i++) {
            for (int j = 0; j < randomsayi.length; j++) {
                if(randomsayi[i]<randomsayi[j]){
                    randomsayi[i] = randomsayi[j];
                }
            }
            System.out.println(randomsayi[i]);
        }
*/
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+"inci sayi");
            a[i] = input.nextInt();
        }
        for (int i = 1; i < a.length/2; i++) {
            int g = a[i];
            a[i]=a[n-1-i];
            a[n+1-i]=g ;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        }
    
}
