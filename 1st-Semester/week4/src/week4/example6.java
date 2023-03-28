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
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayı gir");
        int n = input.nextInt();
        int toplam = 0 ;
      
        while(n>0)
        {
            int kalan = n%10;
            toplam += kalan;
           
            
            n = n/10 ;
        }
       
        System.out.println(toplam+"Sonuc");
                    
            
        }
    }
    

