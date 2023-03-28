/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi ;
        do{
            System.out.println("0 ile 100 arası bir tamsayı gir");
            sayi = input.nextInt();
        }
        while(sayi<=0 || sayi>100);
        
        System.out.println(sayi);
              
    
        
    
    
   


                
        
        
    }
    
}
