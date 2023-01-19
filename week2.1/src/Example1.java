/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;// javanın util kütüphanesinne ait scanner sınıfı

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lütfen hesaplanmasını istediğiniz km giriniz:");
        
        Scanner input = new Scanner(System.in);
        
        float km = input.nextFloat(); // Kullanıcıdan km aldık
        float m = km * 1000f; // km'den m'ye dönüşüm yaptık
        System.out.println("Hesaplanan metre:"+m);
        
        
       
    }
    
}
