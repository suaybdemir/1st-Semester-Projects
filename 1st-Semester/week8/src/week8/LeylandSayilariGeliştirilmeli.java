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
public class LeylandSayilariGeliştirilmeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // x>1 ve y>1   olmak uzere x^y + y^x seklinde olusturlan sayılara verilen ada " Leyland sayilari " denir . Buna gore x ve y nin belirlenen aralıgına gore yapılan program ;
        
        int x ;
        int y ; 
        double a ;
        
        do
        {
            System.out.println(" Lutfen bir deger girin ");
            x = input.nextInt();
            System.out.println(" Lutfen bir deger daha girin ");
            y = input.nextInt();
        }while(x<0 || y<0);
        
        for (int i = 2; i <= x; i++) {// x degeri ikiden fazla oldugu icin 2 den baslatildi . 
            for (int j = 2; j <= y; j++) {//y degeri ikiden fazla oldugu icin 2 den baslatildi 
                  a = Math.pow(i,j)+Math.pow(j,i);//x^y + y^x islemi yapiliyor
                  System.out.println(a);//her dongude yazdir
            }
        }
                
        
        
    }
    
}
