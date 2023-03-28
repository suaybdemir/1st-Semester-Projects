/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;// javanın util kütüphanesine ait Scanner sınıfı

public class OhmLaws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //
        System.out.println("I'm 008.Please follow the steps:"); // kullanıcıya bilgi verildi
        System.out.println("Please enter the V,I,R:");// kullanıcıdan bilgi istedik
        System.out.println("V:");
        double v = input.nextInt();
        System.out.println("I:");
                        double ı = input.nextInt();//I ya işlev verildi
                        System.out.println("R:");
                                        double r = input.nextInt();// R ye islev verildi
        double calculation1 = ı*r ; //türetildi
        double calculation2 = v/r ;
        double calculation3 = v/ı ;
        System.out.println("V value is:"+calculation1);//hesaplamalar yapıldı
        System.out.println("I value is:"+calculation2);
        System.out.println("R value is:"+calculation3);
        
       
        
                
        
        
                                        
                
    }
    
}
