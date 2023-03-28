/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Odv7ERROR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir ifade giriniz");
        String a = input.nextLine();
        for (int i = a.length()/2; i>=0 ; i--) {
            System.out.print(a.charAt(i));
        }
        for (int j = a.length(); j > (a.length()/2) +1; j--) {
            System.out.print(a.charAt(j));
        }
    }
    
}
