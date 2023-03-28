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


public class PotentialanKineticEnergy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Hello , My name is 007.I'm calculating potential and kinetic energies:");
        System.out.println("Give me a distance of the ground(meter):");
          double distance = input.nextInt();
        System.out.println("Give me a mass of matter(kg):");
        double mass1 = input.nextInt();
          double gravity = 9.84 ;
      double calculation1 = (distance)*(mass1)*(gravity) ;
      System.out.println("Potential energy value of matter:"+calculation1);
          System.out.println("Now ,I will calculate the kinetical energy:");
      System.out.println("Write the mass value:");
       double mass2 = input.nextInt();
       
      System.out.println("wrtie the velocity of matter:");
      
              
     double velocity = input.nextInt();
             
             
     double calculation2 = (mass2)*(velocity)*(velocity)/2 ;
             System.out.println("Kinetical energy value of matter:"+calculation2);
      
              
      
        
       
      
        
    }
    
}
