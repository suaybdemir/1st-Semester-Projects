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
public class Hmwrk_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Matrislerde sondan bir onceki satir ve sutunun degerini hesaplayan program 
        int N;
        int S=0;
        do
        {
            System.out.println("Bir matris indis uzunlugu girin");
            N = input.nextInt();
        }while(N<0);
        int[][]dizi=new int[N][N];
        for (int i = 1; i <N; i++) {
            for (int j = 1; j <N; j++) {
               if(i==j)//i nin j ye esit oldugu durumlar istedigimiz durumlardır.Ornek 1,3 ve 3,1 mesela.!!Ama iki kere toplama islemi yaptırmak istemedigimiz icin toplama islemi if'in icinde
               {
                   S+=dizi[i][j];
               }
               else
                   S+=dizi[i][j];//bir ustteki acıklama ile aynı mantıktadır
            }
        }
        System.out.println("Sonuc"+S);
    }
    
}
