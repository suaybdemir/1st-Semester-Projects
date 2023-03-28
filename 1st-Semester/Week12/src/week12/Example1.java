
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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir deger giriniz");
        String txt = input.nextLine();
        
        char ch = 'A';
        char ch2 = 'a';
        System.out.println((int)ch);
        System.out.println((int)ch2);
        for (int i = 0; i < txt.length(); i++) {
            System.out.println((i+1)+"inci harf: "+txt.charAt(i));
        }
        
        if(txt.equals(" Emrah ")){
            System.out.println("Evet");
        }
        else 
        {
            System.out.println("Hayır");
        }
        
    }
    
}
