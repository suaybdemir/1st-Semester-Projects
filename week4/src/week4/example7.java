/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print(" Bir sayı giriniz ");
        int a = input.nextInt();
        boolean asalmi = true ;// varsayım
        for (int i =2; i < a; i++) {
            if(a%i == 0)
            {
                asalmi = false;
            }
            
        }
        if(asalmi==true && a!=1)
        {
            System.out.println("Sayı asaldır");
        }
        else
        {
            System.out.println("Sayı asal degildir");
        }
        
        }
            
        }
     
    
    

