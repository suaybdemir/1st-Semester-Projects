/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author PC
 */
public class e_to_x_with_bynom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //e^x sayisi lim n giderken sonsuza (1+ x/n )^n seklinde hesaplanabilmektedir.Buna gore girilen x ve n degerlerine gore e^x sayisinin degerini bulan program 
        System.out.println(" e^n for enter a amount of n ");
        double n = input.nextDouble();
        System.out.println(" please enter amount of x");
        double x = input.nextDouble();
        
        
        double sonuc = Math.pow(((1 + (x/n))),n) ;
        
        System.out.println(" Sonuc = "+sonuc);
        
        
        
        
    }
    
}
