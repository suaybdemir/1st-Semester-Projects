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
public class ODV4while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Kac tane sayının birler basamagındaki sayıların toplamını yazdırmak istiyorsun ?" );
        int a = input.nextInt();
        int t = 0 ;
        int i = 0 ;
        while(i<a)
        {
            i += 1 ;
            System.out.println(" Sayı gir ");
            int b = input.nextInt();
            t += b%10 ;
            
            System.out.println(t);
            
        }
    }
    
}
