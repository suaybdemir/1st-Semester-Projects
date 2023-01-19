/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hmwrk_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N ;
        do
        {
            System.out.println(" Lutfen pozitif bir tamsayi giriniz");
            N = input.nextInt();
        }while(N<0);
        
        
    }
    public static void asalkontrol(int N)
    {
        int sum = 2;
        for (int i = 2; i < N; i++) {
            if(N%i==0)
            {
                i=N;// Bolen varsa programı ugrastırma donguyu direk bitir
                
            }
            else
                sum++;// Bolen yoksa bir attırma yap ve eger bu arttırmalarının sayısının iki fazlasi o sayiya esit oluyorsa zaten o sayinin herhangi gibi bir boleni yoktur
                
                
        }
        if(sum==N)
        {
            System.out.println(" Bu bir asal sayidir");
        }
        else
            System.out.println(" Bu asal sayi degildir");
        
        
    }
    
    
}
