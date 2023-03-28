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
public class Basamaklaritoplamifibonacciolantamsayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Basamklarındaki rakamlarin toplami herhhangi bir fibonacci sayisina esit olan sayilari yazdıran program .
        
        int  b = 0 ;
        int c = 1 ;
        int e  ;
        int d = 1 ;
        int f ;
        
        
        for (int i = 1; i < 99; i++)//1 den 99 a kadar fibonacci terimi yazdir
        {
            c += b ;//iki terim oncek sayilarin toplamini bul ve su anda olunan terime o sayiyi yazdirmis ol
            b = c- b ;//bir sonraki terimin degerini almıs olur
            
            
                for (int j = 1; j < 99; j++){//Fibonacci sayilarinin herhangi bir sayinin rakmalarının toplami seklinde yazilabilmesi icin bir for dongusune gir 
                if(j==c && j<10)// Eger bu sayi tek basamakli ise ve bir i'ninci terimdeki fibonacci sayisina esit ise o sayiyi yazdir
                {
                    System.out.println(j);
                }
                else if(j>=10 && j==c)// Eger bu sayi iki basamakli ise ve bir i'ninci terimdeki fibonacci sayisina esit ise o sayiyi yazdir
                {
                    e = j%10 + j/10 ;//Birler ve onlar basamagındaki rakamlarin toplamini bul
                    System.out.println(e);
                }
            }
                
                
        }
        
    }
    
}
