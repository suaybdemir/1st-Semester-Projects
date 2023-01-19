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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a ;
        double b ;
        do{
            System.out.println("vize notun");
             a = input.nextDouble();
            System.out.println("final notun");
            b = input.nextDouble();
        }while(a>100 || a<0 || b>100 || b<0);
        
        
        
        double ortalama = a*0.4 + b*0.6 ;
        
        if(ortalama<=100 && ortalama>=80)
        {
            System.out.println(" A "+ortalama);
        }
        else if(ortalama<80 && ortalama>=60)
        {
            System.out.println(" B "+ortalama);
        }
        else if(ortalama<60 && ortalama>=50)
        {
            System.out.println(" C "+ortalama);
        }
        else if(ortalama<=49 && ortalama>=0)
        {
            System.out.println(" D "+ortalama);
            
        }
         
        
        
        
        
        }
        
    }
    
}
