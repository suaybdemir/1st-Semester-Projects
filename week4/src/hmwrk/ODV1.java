/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author PC
 */
public class ODV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Klavyeden giirlen uzunlugu , secilen birime donustur");
        System.out.println(" Bir uzunlugu cm cinsinden girin ");
        double a = input.nextInt();

        
        System.out.println(" Neye donusturmek isterisiniz? ");
        System.out.print(" mm=1 dm=2 km=3 ");
        double b = input.nextInt();
        if(b==1)
        {
            a = a*10 ;
            
           
        }
        if(b==2)
        {
            a = a/10 ;
             
        }
        if(b==3)
        {
             a =  a /Math.pow(10,5) ;
              
        }
        System.out.println("cevap "+a);
    
         }
      
            }
        
    
        
        
    
}
