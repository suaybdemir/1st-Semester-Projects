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
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String c ;
        int s = 0;
        int[]yer = new int[255];
        char B[]= {'a','e','ı','i','o','ö','u','ü'};
        System.out.println(" Bir ifade giriniz ");
        c = input.nextLine();
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if(c.charAt(i)==B[j]){
                    s++;
                    yer[s-1]=i+1;
                }
            }
        }
        System.out.println("");
        
        
        
    }
    
}
