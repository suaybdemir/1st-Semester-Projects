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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        System.out.println(" Lutfen bir ifade giriniz");
        String txt = input.nextLine();
        for (int i = txt.length()-1 ; i>=0 ; i--) {
            if(sayac%2==0){
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            sayac++;
                
        }    
        
    }
    
}
