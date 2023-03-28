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
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir deger girin");
        String a = input.nextLine();
        
        for (int i = 0; i < a.length()/2; i++) {
            System.out.print(Character.toLowerCase(a.charAt(i)));
            System.out.print(Character.toLowerCase(a.length()-1-i));
        }
        if(a.length() %2 ==1){
            System.out.println(Character.toLowerCase(a.charAt(a.length()/2)));
        }
    }
    
}
