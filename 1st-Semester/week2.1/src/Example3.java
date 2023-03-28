/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner; //



        
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen toplamını , carpimini ve ortalamasını hesaplamak icin 3 sayı giriniz(sıra önemli degil)");
        System.out.println("1.sayı:");
        int a = input.nextInt();
        System.out.println("2.sayı:");
        int b = input.nextInt();
        System.out.println("3.sayı:");
        int c = input.nextInt();
                                   
                        int toplam = a+b+c ; // Sayıları topladık
         int carpim = a*b*c ; // Sayıları çarptık
         double ortalamahesaplama = (double)(a+b+c)/3 ; // Ortalama aldık
             System.out.println(" Toplam :" + toplam + " Carpim : " + carpim + " Ortalama : " + ortalamahesaplama );
           
             
            
                
              
         
           
         
    }
    
}
