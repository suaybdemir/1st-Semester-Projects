/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevler;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class title105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        int b = 0;
        int c = 0;
        
        int e = 0;
        int toplam_1 = 0;
        
        do
        {
            System.out.println(" Lutfen bir tamsayi gir");
            a = input.nextInt();
        }while(a<0);
        
        while(b<a)
        {
            b++;
            if(a%b==0)
            {
                toplam_1 += b ;
                c ++;
            }
            
        }
        int d = toplam_1/c ;
        if( d*c == toplam_1 )
        {
            System.out.println(" Bu bir aritmetik sayıdır ");
        }
        else
            System.out.println(" Bu bir artimetik sayı degildir ");
        
            
        
    }
    
}
