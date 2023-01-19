/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int min = 1 ;
        int max = 99 ;
        int b = (int)(Math.random()*(max-min +1 )+min);
        System.out.println(" Lutfen bir sayi giriniz ");
        int a = input.nextInt();
        while(a<b)
        {
            System.out.println(" Lutfen daha buyuk bir sayi girniz ");
            a = input.nextInt();
        }
        while(b<a)
        {
            System.out.println(" Lutfen daha kucuk bir sayi giriniz ");
            a = input.nextInt();
        }
        if(a==b)
        {
            System.out.println("Bıldın");
        }
    
}
