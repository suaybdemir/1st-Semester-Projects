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
public class Bagdasik_Sayilar_Gelistirlmeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// cok sayi tanimlandı nasil kısaltılabilir?
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Alınan iki sayinin onlar basamagındaki rakamlar esit ve birler basamagındaki sayilarin toplami 10 a esitse bu sayılara bagdasik sayilar denir .
        
        int a;
        int b ;
        int c ;
        int d ;
        int e ;
        int f ;
        
        do
        {
            System.out.println(" Bir sayi gir");
            a = input.nextInt();// 1.sayi alındı
            System.out.println(" Bir sayi daha gir ");
            b = input.nextInt();// 2.sayi alindi
            
        }while(a<0 || b<0);
        
        c = a%10 ;// 1.sayinin birler basamgındaki rakam alindi
        d = (a-c)/10 % 10 ;// 1.sayinin onlar basamagındaki rakam alındı
        e = b%10 ;// 2.sayinin birler basamagındaki rakam alindi
        f = ( b-e )/10 % 10 ;// 2.sayinin onlar basamagındaki rakam alındi
        
        if(c+e == 10 && d==f)//Eger 1. ve 2. sayinin birler basamagındaki rakamların toplami 10 a esit ve onlar basamagındaki rakamlar esit ise yazdir
        {
            System.out.println(" Bunlar bagdasik sayilardir");
        }
        else//Eger baska bir durum soz konusu ise yazdir
            
            
            System.out.println(" Bunlar bagdasik sayilar degildir");
        
    }
    
}
