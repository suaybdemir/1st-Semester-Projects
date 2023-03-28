/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class ODV9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ondalıklı bir sayı gir");
        double a = input.nextDouble() ;
                              
        double b =  Math.floor(a);
        System.out.println(b);
        double ondalık = a-b ;
        double tam = Math.floor(a);
        System.out.println(" Ondalıklı kısım:"+ondalık+" Tam kısım:"+tam);
        
     
        
   
        
        
        
         
            
        
      
        
    }
    
}
