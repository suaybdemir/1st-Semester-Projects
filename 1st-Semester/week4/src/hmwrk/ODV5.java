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
public class ODV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Iki sayı gir. 1.yi 2.ye bolucem  ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(" Sondan kacinci basamagin degerini istiyorsun ");
        int d = input.nextInt();
        double c = a/b ;
        double e = Math.pow(10,d) ;
        double modd = (double) (c % e) ;
        
        System.out.println(modd);
        
                
       
        
        
       
    }
    
}
