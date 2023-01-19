/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Monte_Carlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int r ;
        double s;
        do
        {
            System.out.println(" Lutfen bir yaricap girin ");
            r = input.nextInt();
        }while(r<0);
        
        s = ((Math.PI*r*r)/(2*r*2*r)) * 4  ;
        
        System.out.println(s);
        
    }
    
}
