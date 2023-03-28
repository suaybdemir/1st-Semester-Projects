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
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi = 5;
        System.out.println("Arttırmaadana once"+sayi);
        sayi = incrementby(sayi,3);
        int sayi2=10;
        System.out.println("Arttırmadan sonra"+sayi2);
        sayi2 = incrementby(10,2);
        
    }
    public static int incrementby(int num,int index)
    {
        num+=index;
        return num;
    }
    
}
