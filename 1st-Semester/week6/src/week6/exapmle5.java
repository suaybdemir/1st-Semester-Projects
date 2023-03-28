/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class exapmle5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int max = 99;
        int min = 1;
        int randomsayi = (int) ((Math.random() * (max-min +1) + min));
        int deneme = 0 ;
        while(true)
        {
            System.out.println(" Lutfen 1 ile 99");
            int sayi = input.nextInt();
            deneme++;
            if(sayi>randomsayi)
            {
                System.out.println(" Lutfen daha kucuk ");
            }
            else if(randomsayi>sayi)
            {
                System.out.println(" Lutfen daha buyuk bir sayi giriniz ");
                
            }
            else if(randomsayi == sayi)
            {
                System.out.println(" Tebrikler dogru tahmin ");
                break ;//donguden cikar
            }
            
        }
        System.out.println(deneme+" kadar tahminde dogru sonuca ulastiniz ");
    }
    /* 
    Random r = new Random();                               |baska gösterimdir|
    int randomsayi = r.nextInt(99)+1;
    */
    
    
    
    
}
