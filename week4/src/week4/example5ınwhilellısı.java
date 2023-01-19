/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example5ınwhilellısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" İki sayı arasındaki 4 ve 9 a tam bolunebilen sayıları hesaplamak icin lutfen sırasıyla iki deger giriniz ");
        System.out.println(" Us deger ");
        int a = input.nextInt();
        System.out.println(" Alt deger ");
        int b = input.nextInt();
        
        while(b<a)
        {
            if(b%4==0 && b%9==0)
            {
                System.out.println(b+" Tam bolunebilen sayılar ");
            }
                
            b = b+1 ;
                }
        System.out.println(b);
        
        
        
                
        }
    }
    
}
