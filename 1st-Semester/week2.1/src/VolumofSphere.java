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
 
public class VolumofSphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of sphere.I will calculate the volume:");
        
        double r = input.nextInt();
        
        double π = 3.14 ;
                    
        double volume = (double)(r*r*r)*π*4/3 ;
        
        System.out.println("volume of the sphere value is:"+volume);
        
       
        
        
        
        
        
        
    }
    
}
