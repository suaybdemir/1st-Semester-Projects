/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class hmwrk8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir sayı girin aradışı gelen sayıların kareleriyle beraber olan toplam sonucu vereyim ");
        double n = input.nextInt();
        double tamkare = n*(n+1)*(2*n+1)/6;
        System.out.println(tamkare+" Tam karelerin toplami");
    }
    
}
