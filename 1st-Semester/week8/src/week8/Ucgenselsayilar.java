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
public class Ucgenselsayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Ucgensel sayilar n.(n+1)/2 formulu ile hesaplanabilir.Buna gore girilen terim sayisina gore ucgensel sayilari hesaplayan program;*/
        
        int a ;
        int b ;
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i <=a ; i++)
        {
        b = i ;    
        b = b*(b+1)/2 ;
            System.out.println(b);
            
        }
        
    }
    
}
