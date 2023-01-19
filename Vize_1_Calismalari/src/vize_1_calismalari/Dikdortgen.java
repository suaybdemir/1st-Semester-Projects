/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vize_1_calismalari;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Dikdortgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
		Scanner klavye=new Scanner(System.in);
		System.out.println("Dikdörtgenin yüksekliği kaç birim olsun?");
		int yukseklik=klavye.nextInt();
		System.out.println("Dikdörtgenin genisliği kaç birim olsun?");
		int genislik=klavye.nextInt();
		
		//dikdörtgenin üst kısmı
                
                
		for (int j=1; j<=genislik; j++)
		{
			System.out.print("o ");//satır genişliği kadar yan yana o karakteri yazdır
		}
		System.out.println();//satır sonu bir satır aşağı geç
		
		//dikdörtgenin orta kısmı
		for (int i=1; i<=yukseklik-2; i++) //satır yüksekliği-2 kere bu işlemi tekrarla
		{
			System.out.print("o ");
			for (int j=1; j<=genislik-2; j++)
			{
				System.out.print("  ");//satır genişliği-2 tane yan yana boşluk karakteri yazdır
			}
			System.out.println("o");//satır sonundaki yıldızı ekle ve bir satır aşağı geç
		}
		
		//dikdörtgenin tabanı
		for (int j=1; j<=genislik; j++)
		{
			System.out.print("o ");//satır genişliği kadar yan yana o karakteri yazdır
		}
		
       
 
        
         
            
                    
        
        
            
        
              
    }
    
}
