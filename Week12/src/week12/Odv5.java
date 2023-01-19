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
public class Odv5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ortadan ikiye bolunme yapilir sonrasinda ortadan baslanılarak bir soldaki bir sadaki sirasi ile yazdirilir
        System.out.println(" Lutfen bir ifade giriniz");
        String a = input.nextLine();
        int n = a.length()/2 ;
        System.out.println(a.length());
        for (int i = 1; i < n; i++) {
            System.out.print(a.charAt(n+i));
            System.out.print(a.charAt(n+1-i));
        }
    }
    
}
