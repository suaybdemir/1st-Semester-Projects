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
public class Eksik_Sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Tam bolenlerinin toplamı , sayının iki katından eksik ise bu tur sayılara " eksik sayilar " denir . Buna gore eksik sayilari yazdıran program .
        
        int a;
        int b = 0 ;
        int c ;
        do
        {
            System.out.println(" Lutfen bir pozitif tamsayi giriniz");
            a = input.nextInt();
            
        }while(a<0);
        
        for (int i = 1 ; i < a; i++){//Bolenlerin toplamini bulmaya yarar
            if(a%i==0)
            {
                b += i ;
            }
        }
        if(b<2*a)//eger iki katindan kucuk ise bu sayi eksik sayidir
        {
            
            c = a-b ;
            
            System.out.println(" Bu sayi "+a+" eksik sayidir ve eksiklik miktarida "+c+" kadardir ");//Ne kadar eksik oldugunuda yazdır
                    
        }
        else if(b<=2*a)//eger esit buyukse bu sayi eksik sayı degildir
        {
            System.out.println(" Bu "+a+" sayisi eksik sayi degildir");
        }
        
    }
    
}
