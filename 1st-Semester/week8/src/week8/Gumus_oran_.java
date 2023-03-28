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
public class Gumus_oran_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Verilen bir dogru parcasını altın orana gore ikiye bolen program . */
        
        int a ;//klavyeden bir uzunluk degeri almak icin tanimlama yap
        double b ;
        double c ;

        do
        {
            System.out.println(" Lutfen bir uzunluk girin ");
            a = input.nextInt();
        }while(a<0);
        
         b = ( double) a / (1 + (Math.sqrt(2)+1)) ;//uzunlugu gumus orana uygun bol ve bir kenarin degerini olustur
         
         c = a- b ;//diger kalan uzunlugu bul
        
        System.out.println(b+ " ile "+c);//kucukten buyuge dogru kenarlari yazdir
        
        
        
        
        
        
        
        
        
        
    
}
