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
public class JohnWallis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // John Wallis , Pi / 2 = 4/3 * 16/15 * 36/35 *64/63 ...... şeklindeki ardışık çarpımlara eşittir demiş. Buna gore pi yaklasik olarak ; 
        
        int a ;
        double b = 1 ;
        do
        {
            System.out.println(" Lutfen bir terim sayisi girin");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1; i < a; i++) {
            b = b* 4*i*i / ((4*i*i) - 1) ;//4k^2 / 4k^2 -1 formatinda terimler olsuturuldugu icin bu sekilde bir sayiya entegre ettim
        }
        b = b*2 ;//bu b sayisinin 2 ile carpimi pi sayisina esit oldugundan 2 katıni aldim
        
        System.out.println(b);
    }
    
}
