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

public class bestheeledshoesforladys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Best Sheeled Shoes for Ladys!:");
        
        System.out.println("Please follow the steps for results and choose a number between 0 and 1:");
        System.out.println("How Many Likes Your Shoes:");
         double p = input.nextInt();
         System.out.println("How many years you are using a sheeled shoess?");
         double y = input.nextInt();
         System.out.println("How much?(Sterlin):");
         double m = input.nextInt();
         System.out.println("How many years have your shoes been in fashion?:");
         double t = input.nextInt();
         System.out.println("Do you use a alcohol(between 0 and 1):");
         double A = input.nextInt();
         System.out.println("How beautifull?");
         double L = input.nextInt();
         
        double Q =  p*(y+9)/(t+1)*(A+1)*(y+10)*(L + 20*m) ;
                                               
                  System.out.println("Your Q value is:"+Q);
                  System.out.println("Whats your sheeled shoes biritish size:");
                  double s = input.nextInt();
                  double h = Q*(12+3*s/8);
                  System.out.println("Your perfect sheeled shoes for heel lenght is(cm):"+h);
                  
                  
         
         
         
         
        
        
                
        
        
        
        
    }
    
}
