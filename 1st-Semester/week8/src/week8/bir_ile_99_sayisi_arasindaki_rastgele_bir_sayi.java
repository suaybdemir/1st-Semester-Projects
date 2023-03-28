
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author PC
 */
public class bir_ile_99_sayisi_arasindaki_rastgele_bir_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // 0 ile 99 arasında bilgisayar tarfından rastgele secilen bir sayiyi bulmanı isteyen bir program.
        Random rand = new Random();
        
        int upperbound = 100 ;
        int a ;
       do
       {
           System.out.println(" Bir tamsayi girin 0 ile 99 arasinda");
            a = input.nextInt();
       }while(a!=upperbound);
       
    }
    
}
