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
public class Tausayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Tam bolenlerinin sayisina bolunebilen sayılara "tau" sayisi denir.Buna gore klavyeden girilen ust sınıra gore tau sayisini bulan program. */
        
        int a ;
        int b = 0 ;//bir sayac
        do
            
        {
            System.out.println("bir sinir deger girin ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i =1 ; i <=a; i++) {
           if(a%i==0)
           {
               b++;//Boleni oldugu takdirde b yi 1 arttırıyoruz ki bolen sayisini bulalim 
           }
           
        }
        if(a%b==0)//eger tam bolenlerin sayisi verilen sayiya tam bolunebiliyorsa yazdir
        {
            System.out.println(" Bu sayi bir tau sayisidir");
        }
        else
            
            System.out.println(" Bu sayi tau sayisi degildir");
        
    }
    
}
