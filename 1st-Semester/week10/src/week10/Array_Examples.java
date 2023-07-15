/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Array_Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n ;
        do
        {
            System.out.println(" Dizi uzunlugu sec " );
            n = input.nextInt();
                    
        }while(n<0);
        
        int[] sayi = new int[n]; // n uzunlugunda int tipinde bir sayı dizisi
        
        //System.out.println(sayi[sayi.length-1]);
        System.out.println(" \nDizinin uzunlugu "+ sayi.length);
        
        
        // sayi dizisine 0-100 arası rastgele deger atama
        
        for (int i = 0; i <= sayi.length-1; i++) {
            System.out.print((i+1)+" \ninci sayi: ");
            sayi[i] = input.nextInt();
            
           
        }
        for (int i = 0; i <= sayi.length-1 ; i++) 
        {
            System.out.println(i+"\n. indis: "+sayi[i]);  
            System.out.println("");
        }
        
        
        
        // Sayi dizisindeki elemanların toplami
        
        int toplam = 0 ;
        
        for (int i = 0; i <= sayi.length-1 ; i++) {
            toplam += sayi[i] ;
        }
        System.out.println();
        System.out.println(" Indislerin toplami= "+toplam);
        
        double b ;
        b = (double) toplam / sayi.length ;
        System.out.println("\n"+b);
    }
    
}
