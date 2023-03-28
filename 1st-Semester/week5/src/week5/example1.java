/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi;
        do { 
            System.out.println("Lutfen pzitif bir tamsayı giriniz");
            sayi = input.nextInt();
        }while(sayi<=0);
        
            System.out.println("Girilen sayı: "+sayi);
                   }
    /*
    System.out.println(" Lütfen pozitif bir tamsayı giriniz");
    int sayi = input.nextInt();
    while(sayi<=0)
    {
    System.out.print(" Lütfen pozitif bir tamsayı giriniz");
     sayi = input.nextInt();
    }
    
    */
    }
    
}
