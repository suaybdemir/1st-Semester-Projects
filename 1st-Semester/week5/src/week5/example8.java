/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Satır gir");
        int a = input.nextInt();
        
        for (int i = 1; i <=a; i++) 
        {
            for (int j = 1 ; j <=i; j++) 
            {
                
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
    
}
