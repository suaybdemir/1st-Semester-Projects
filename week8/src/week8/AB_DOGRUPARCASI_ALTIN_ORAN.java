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
public class AB_DOGRUPARCASI_ALTIN_ORAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Bu program bir uzunlugu verilen ucgenin diger kenarlarını altin oran ile bulmaya yarar . 
        
        int ab ;//AB kenarı tanimla
        double cb ;//CB kenari tanimla
        double ac ;//AC kenari tanimla
        do
        {
            System.out.println(" Lutfen bir dogru parcasi uzunlugunu girin");
            ab = input.nextInt();//AB kenarının uzunluk degeri alındı
            
        }while(ab<0);
        
        cb = 2*ab / (1 + Math.sqrt(5)) ;//CB uzunlugu bulundu
        ac = 2*cb / (1 + Math.sqrt(5)) ;//AC uzunlugu bulundu
        
        System.out.println(" CB uzunlugu "+cb+" AC uzunlugu "+ac);//CB ve AC uzunlugu yazdırıldı
    }
    
}
