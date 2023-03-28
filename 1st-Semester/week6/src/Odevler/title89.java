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
public class title89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        int b = 2;
        int c = 2;
        int d = 0;
                
        do 
        {
            System.out.println(" Lutfen pozitif bir tamsayı giriniz ");
            a = input.nextInt();
        }while(a<1);
        
        while(b<a)
        {
            if(a%b==0)
            {
                d++;
            }
            b++;
        }
        while(c<a+2)
        {
            if(a+2%c==0)
            {
                d++;
            }
            c++;
        }
        if(d==0)
            
        {
            System.out.println(" Bu sayı bir chen asalıdır");
            
        }
        else
            System.out.println(" Bu sayı bir chen asalı degildir ");
    }
    
}
