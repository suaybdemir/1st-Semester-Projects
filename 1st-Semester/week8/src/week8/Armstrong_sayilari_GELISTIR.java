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
public class Armstrong_sayilari_GELISTIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Bir sayının rakamlarının kuplerinin toplamlari eger verilen sayiya esit oluyorsa bu sayiya armstrong sayi denir . Buna gore 100 ile 999 arasındaki armstrong sayilari ;
        
        int a ;
        int b ;
        int c ;
        
        for (int i =100  ; i < 999; i++) {
           
            a = i%10 ;//birler basamagındaki rakamı al
            b = (i-a)/10 % 10 ;//onlar basamgındaki rakamı al
            c = (i-b*10-a) /100 % 10 ;//Yuzler basamagındaki rakamı al
            
            if(i==a*a*a+b*b*b+c*c*c)//Bu sayıalraın teker teker  kuplerinin toplamı dongudeki sayiya esit oluyorsa yazdır
            {
                System.out.println(i);
            }
        }
        
        
    }
    
}
