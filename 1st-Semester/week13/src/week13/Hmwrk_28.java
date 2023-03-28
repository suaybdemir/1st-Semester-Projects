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
public class Hmwrk_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N ;
        do
        {
            System.out.println("Lutfen Sirket Sayilarini Giriniz");
            N = input.nextInt();
        }while(N<0);
        
        int A[][]=new int[N][12];
        double Toplam[]=new double[N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println((i+1)+" inci sirketin "+(j+1)+" ıncı aydaki karını girin");
                A[i][j]=input.nextInt();
            }
            
        }
        for (int i = 0; i < N; i++) {
            int max=A[i][0];
            int maxindex=0;
            int min=A[i][0];
            int minindex=0;
            for (int j = 0; j < 12; j++) {
                Toplam[i]+=A[i][j];
                if(A[i][j]>max)
                {
                    max=A[i][j];
                    maxindex=j;
                }
                if(A[i][j]<A[i][0])
                {
                    min=A[i][j];
                    minindex=j;
                }
                if(j==11)
                {
                System.out.println((i+1)+" inci sirketin "+maxindex+" ayında max kar degeri "+max);//max indexi ve max karı bir sirket icin yazdiran islem alttaki islemde aynılarınının min islemi icin olanıdır
                System.out.println((i+1)+" inci sirketin "+minindex+" ayında min kar degeri "+min);
                }
                
            }
            
            
        }
        for (int i = 0; i < N; i++) {//Birinci indis bir sirketin yıllık toplam gelirini olusturuyor buna gore 12 ile bolumu yıllık ortalama karını vercektir
            System.out.println((i+1)+" inci sirketin yıllık ortalama karı : "+(Toplam[i]/12));
        }
        for (int i = 0; i < A.length; i++)   //kucukten buyuge sıralama islemi
        {  
        for (int j = i + 1; j < A.length; j++)   
        {  
        int tmp = 0;  
            for (int k = 0; k < A.length; k++) {
                
           
        if (A[k][i] > A[k][j])   
        {  
        tmp = A[k][i];  
        A[k][i] = A[k][j];  
        A[k][j] = tmp;  
        }  
        }  
        } 
        }
        for (int i = 0; i < A.length; i++) {//kcuukten buyuge dizin yazdirma islemi
            for (int j = 0; j < A.length; j++) {
                System.out.println((i+1)+" inci satirda "+(j+1)+" inci sutunun degeri "+A[i][j]);
            }
        }
        
    }
    
}
