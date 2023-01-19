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
public class Pyhthagorean_triplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Pisagor uclusu girilem iki sayının , mesela a ve b tamsayilari girilsin , a^2 + b^2 = c^2 olabiliyorsa bu a,b,c uclusu pisagor uclusudr . Buna gore 
        c^2 = a^2 + b^2 yi saglayan a,b degerlerini yazdiran program ; */
        
        int c ;
        do
        {
            System.out.println(" Bir pozitif tamsayi girin ");
            c = input.nextInt();
            
        }while(c<0);
        
        for (int a = 1 ; a < c  ; a++)//0 sayısını ise katmamak icin c yi dahil etmedik
        {
            for (int b = 1 ; b < c ; b++) //0 sayisini ise katmamak icin c sayisini dahil etmedik
            {
                
                if( a*a + b*b == c*c )
                {
                
                System.out.println(" Saglayan a degeri = "+a+" saglayan b degeri = "+b+" saglayan c degeri = "+c);
                
            }
        }
            
        }
        {
        
        
                    
        
    }
    
}
