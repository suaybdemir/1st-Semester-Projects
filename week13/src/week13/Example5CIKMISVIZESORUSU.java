/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author PC
 */
public class Example5CIKMISVIZESORUSU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Ders Sayısı:");
        int M = input.nextInt();
        System.out.println("Ogrenci Sayisi");
        int N = input.nextInt();
        
        int[][] notlar = new int[M][N];
        int[] ogrencino = new int[N];
        double[] ortalamalar = new double[M];
        int[][]rapor = new int [M][4];
        //random ogrenci id olusturma
        for (int i = 0; i < N; i++) {
            ogrencino[i]=(int) (10000+(20000-10000)*r.nextDouble());
        }
        // rastgele 0-99 arası not dizisini atama
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                notlar[i][j]= r.nextInt(100);
            }
        }
        //ortalamaları hesaplama
        for (int i = 0; i < M; i++) {
            int toplam = 0;
            for (int j = 0; j < N; j++) {
                toplam+=notlar[i][j];
            }
            ortalamalar[i]= (double) toplam/N ;
        }
        //derse ait max min bulma
        for (int i = 0; i < M; i++) {
            int max = notlar[i][0],min = notlar[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < N; j++) {
                if(notlar[i][j]>max)
                {
                    max=notlar[i][j];
                    maxid= ogrencino[j];
                }
                if(notlar[i][j]<min)
                {
                    min=notlar[i][j];
                    minid=ogrencino[j];
                }
            }
        }
        rapor[i][0]= max ; rapor[i][1]=maxid ;rapor[i][2]=min ;rapor[i][3]=minid;
        System.out.println("max :"+rapor[i][0]+" maxid :"+rapor[i][1]+" min: "+rapor[i][2]+" minid "+rapor[i][3]);
    }
    
}
