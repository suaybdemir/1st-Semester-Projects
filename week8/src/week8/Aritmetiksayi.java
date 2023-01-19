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
public class Aritmetiksayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Tam bolenlerinin sayisinın kendisine bolumu eger bir tamsayiya esitse bu sayi aritmetik sayidir .
        
        int a ;//klavyeden girilecek sayinin tanimlamasini yap
        int b = 0 ;//Bolen sayisini bulmak icin bir tanimlama yaptik
        int c = 0 ;//Bolen sayilarinin toplamini bulmaya yarayan bir tanımlama
        
        do
        {
            System.out.println(" Lutfen bir pozitif tamsayi girin");
            a = input.nextInt();//Bir sayi aldik
        }while(a<0);
        
            for (int i = 1 ; i < a; i++) {
            if(a%i==0)
            {
                c = c + i ;// Bolen sayinin toplamlarini 
                b++;//Bolen sayisini almak icin bir toplama islemi yapiliyor
                
            }
            
        }
            if(c%b==0)//Eger tam bolenlerin toplami bolen sayisina tam bolunebiliyorsa yazdir
            {
                System.out.println(" Bu bir artimetik sayidir ");
            }
            else//Eger bolunemiyorsa yazdır
                System.out.println(" Bu bir aritmetik sayi degildir ");
        
    }
    
}
