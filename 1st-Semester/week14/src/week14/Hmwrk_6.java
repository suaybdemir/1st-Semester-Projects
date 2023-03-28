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
public class Hmwrk_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir deger girin");
        int N = input.nextInt();
        yıldız(N);
    }
    public static void yıldız(int N)
    {
        for (int i = 0; i <=N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
