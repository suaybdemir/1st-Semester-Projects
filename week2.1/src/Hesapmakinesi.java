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



public class Hesapmakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 3 number");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = a*b*c ;
        System.out.println("Multiplication:"+d);
        
               double e = a+b+c ; 
                System.out.println("Addition:"+e);
                double f = a+b-c ;
                        System.out.println("Subtraction(1.+2.-3):"+f);
                        double g = a-b+c ;
                                System.out.println("Subtraction(1.-2.+3.):"+g);
                                double h = -a+b+c ;
                                        System.out.println("Subtraction(-1.+2.+3.):"+h);
                                        double j = (a+b+c)/3 ;
                                        System.out.println("Average:"+j);
                                        double k = (a*b*c) ;
                                 
                                        
                                        
    }
    
}
