/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week15;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Example1 {

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
        notlar = generatenotes(notlar);
        int[] ogrencino = generatearray(N,10000,20000);
        double[] ortalamalar = avg_notes(notlar);
        int[][] report  = get_maxmin(notlar,ogrencino);
        arr_print(report);
                
    }
    
    public static void arr_print(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+"inci elemena: "+array[i]);
        }
    }
    public static void arr_print(double[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+"inci elemena: "+array[i]);
        }
    }
    
    public static void arr_print(int[][]array)
    {
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println((i+1)+", "+(j+1)+" elemanın "+array[i][j]);
            }
        }
    }
    public static int[] generatearray(int N,int lb,int ub)
    {
        int[] array = new int[N];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(lb + (ub-lb)*r.nextDouble());
        }
        return array;
        
    }
    public static int[][] generatenotes(int[][] array)
    {
        int row = array.length;
        int col = array[0].length;
        Random r = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = r.nextInt(100);
            }
        }
        return array;
    }
    
    //M ders N sutundan olusan notlar dizisinde herbir derse ait
    //notları hesaplayıp bir dizi formatında döndüren metot
    public static double[] avg_notes(int[][] array)
    {
        int row = array.length;
        int col = array[0].length;
        double[] avg = new double[row];
        for (int i = 0; i < row; i++) {
            int toplam = 0;
            for (int j = 0; j < col; j++) {
                toplam+=array[i][j];
            }
            avg[i] = (double) toplam/col ;
        }
        
        return avg;
        
    }
    public static int[][] get_maxmin(int[][]array, int[] ogrencino)
    {
        int row = array.length;
        int col = array[0].length;
        int[][]rapor = new int[row][4];//min,min index,max,maxindex
        //derse ait max min bulma
        for (int i = 0; i < row; i++) {
            int max = array[i][0] , min = array[i][0];
            int maxid=0,minid=0;
            for (int j = 0; j < col; j++) {
                
            
                if(array[i][j]>max)
                {
                    max=array[i][j];
                    maxid= ogrencino[j];
                }
                if(array[i][j]<min)
                {
                    min=array[i][j];
                    minid=ogrencino[j];
                }
            }
            rapor[i][0]=max; rapor[i][1]=maxid; rapor[i][2]=min;rapor[i][3]=minid;
            }
        
        return rapor;
    }
    
    
    
}
