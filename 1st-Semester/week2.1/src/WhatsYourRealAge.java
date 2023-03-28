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

public class WhatsYourRealAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours you are sleeping?:");
        double h = input.nextDouble();
        System.out.println("Are u doing sport?(between 0 and 1));");
        double s = input.nextDouble();
        System.out.println("Do you hava a lot of free time(between 0 and 1):");
        double f = input.nextDouble();
        System.out.println("Rate your all happinies(between 0 and 1):");
        double ha = input.nextDouble();
        System.out.println("Rate your all unhappinies(between 0 and 1):");
        double uh = input.nextDouble();
        System.out.println("Rate your health situtation(between 0 and 1):");
        double hs = input.nextDouble();
        System.out.println("Whats your age?:");
        double a = input.nextDouble();
        
        double realage = 0.72*a*f*hs/s*ha*uh*h ;
        
      
        System.out.println("Your real age:"+realage);
        
        
      
        
                
        
                
    }
    
}
