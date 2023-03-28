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
public class e_to_x_with_factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /*e^x sayisi 1+ x/1! + x^2/2! + x^3/2! +.... seklinde yazilabilmektedir.Buna gore klavyeden girilen x ve n degerlerine gore e^x sayisini bulan program;*/
        System.out.println(" Lutfen bir x degeri giriniz ");
        double x = input.nextDouble();
        System.out.println(" Lutfen bir us degeri girin ");
        double k = input.nextDouble();
        
        double a = k;
        double b = 1 ;//faktoriyel hesaplama icin kullanılan tanımlama
        double toplam = 0;
        int sayac = 0;
                           
        while(sayac<k)
        {
            while(a<k)
                {
                b = b*(b+1);//faktoriyel islemiydi
                a++ ;//while icin
                toplam = toplam + Math.pow(x,k)/b ;//e^x in matematiksel formulizasyon seklinde bulunabilmesi icin yapilmis bir formulizasyon
                }
                sayac++ ;
        }
        double e = toplam + 1 ;//bir fazlasi e sayisina esit
        System.out.println(" e to x equal to "+e);
    }
    
}
