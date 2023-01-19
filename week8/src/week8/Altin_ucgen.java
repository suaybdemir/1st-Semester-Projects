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
public class Altin_ucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Altın ucgen olusmasi icin bir ikizkenar ucgen gerekir . Uzun kenarının kısa kenarına bolumu altın oranı saglayan ucgen kenarlarını yazdıran program
        
        double a ;//klavyeden sayi girmek icin tanımlama yap
        double b ;
        double c ;
        do
        {
            System.out.println(" Lutfen en uzun olan kenarın buyuklugunu girin");
            a = input.nextDouble();//Klavyeden en uzun olan kenar alındı
        }while(a<0);
        
        b = (1+ Math.sqrt(5))*a / 2 ;// b kenarı altın orana gore bulundu
        
        System.out.println(" Uzun kenar "+b+" kısa kenar "+a);
        
      
     
        
    }
    
}
