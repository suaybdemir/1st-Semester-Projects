/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Example_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        int N ;
        do
        {
            System.out.println(" Lutfen pozitif bir N degeri girin");
            N = input.nextInt();
        }while(N<0);
        // N uzunlugunda dizi tanımlama
        Random r = new Random() ;
      
        int [] randomsayi= new int[N];
        // radomsayi dizisine rastgele 0-99 arası sayilar atama
        for (int i = 0; i < randomsayi.length ; i++) {
            randomsayi[i] = r.nextInt(100);
            System.out.println(randomsayi[i]+"**");
            }
        
        //random sayi dizisinde minimum bulma
        int min = randomsayi[0];// 0.elemanın minimum oldugunu varsaydık
        int index = 0;//sayi dizisinin adresidir
        for (int i = 1; i < randomsayi.length ; i++) {
            if(randomsayi[i]<min){
            min = randomsayi[i];
            index = i ;
        }
            System.out.println(index+" indisinde minimum deger "+min+" olur ");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
