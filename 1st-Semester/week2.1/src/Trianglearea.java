/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;



public class Trianglearea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pleae write the triangles lengths:");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the value of first:");
         double a = input.nextInt();
       System.out.println("Please enter the value of second:");
               double b = input.nextInt();
                
        double alan = a*b/2 ;
        
        System.out.println("Triangle area equal to:"+alan);
        
                
                
         }
    
}
