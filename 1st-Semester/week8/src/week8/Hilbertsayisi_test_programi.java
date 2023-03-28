
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
public class Hilbertsayisi_test_programi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // 0 dan baslayıp 4k+1 kuralı ile ilerleyen dizideki sayilara " Hilbert sayisi " denir . Buna gore olusturulan program ;
        
        int a ;
        int b = 0 ;//Toplama islemi icin yapilan tanimlama
        do
        {
            System.out.println(" Lutfen bir sayi giriniz ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 0 ; i < a; i++)
        {
        if(a==4*i+1)//Hilbert sayisi ise b yi 1 arttır
        {
            b++;
        
            
        }

    }
        if(b==1)//a ya kadar olan bir i sayi dongusu ile sadece 1 tane hilbert olusturulabilir dolayısıyla b=1 ise bu sayi hilberttir.Eger sayi 1 ise yazdir
        {
            System.out.println(" Bu "+a+" sayisi hilbert sayisidir");
        }
        else// b=0 ise yazdir
            System.out.println(" Bu "+a+" sayisi hilbert sayisi degildir");
}
