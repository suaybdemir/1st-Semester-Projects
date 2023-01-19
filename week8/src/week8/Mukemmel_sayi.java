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
public class Mukemmel_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Kendisi haric butun pozitif tamsyi carpanları ( tam bolenleri ) toplamı , yine kendisine esit olan sayilara " mukemmel sayi " denir . Ornegin 6=1+2+3 , 
        28=1+2+4+7+14 birer mukemmel sayidir . Buna gore mukemmel sayiyi bulan program */
        
        
            int a ;
            int b =1 ;// girilen sayiya esitlemek icin 1 den baslattim . Bir toplama islemi
            do
            {
                System.out.println(" Lutfen bir pozitif tamsayi girn ");
                a = input.nextInt();
            }while(a<0);
            
            for (int i = 2; i < a; i++) {
            if(a%i==0)
            {
                b += a/i ;
            }
        }
            if(b == a )
            {
                System.out.println(a+" Bu sayi mukemmel sayidir ");
            }
            else
                System.out.println(a+" Bu sayi mukemmel sayi degildir");
    }
    
}
