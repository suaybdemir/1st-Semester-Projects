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


public class RadiantoGradian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please give me radian angle and after I will transfort the gradian angle:" );
        double radian = input.nextInt();
        double transformation = (double)radian*20/9;
        System.out.println("Gradian value is:"+transformation);
        
        
                
                
    }
    
}
