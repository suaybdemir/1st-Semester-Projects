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
public class Cullensayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // (n*2^n)+1 seklinde yazılabilen sayilara " Cullen sayilari" denir . Buna gore verilen terim sayisina gore , verilen degere gore , o deger kadar yazdıran program .
        
        int a ;
        double b ;
        do
        {
            System.out.println(" Bir terim sayisi gir ");
            a = input.nextInt();
            
        }while(a<0);
        
        for (int i = 1 ; i < a; i++) {
            b = i*Math.pow(2,i)+1 ;//n*2^n + 1 olan Cullen i bulur
            
            System.out.println(b);//Cullen sayisini yazdir
        }
        
    }
    
}
