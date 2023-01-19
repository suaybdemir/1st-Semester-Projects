/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hmwrk_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Yedek kosegen ustunde kalan elemanların toplamını hesaplayan program
        int toplam = 0 ;
        int a;
        do
        {
            System.out.println(" Lutfen indis degerini girin");
            a = input.nextInt();
           
        }while(a<0);
        int[][]dizi=new int [a][a];
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a; j++) {
                if(i>j)//i nin j den buyuk oldugu durumlarda bu durum gecerli olacagı icin i>j
                {
                   toplam+=dizi[i][j];
                }
            }
        }
        System.out.println(" Sonuc "+toplam);
    }
    
}
