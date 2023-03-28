/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Example_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Random r = new Random();
        
        int n;
        {
            System.out.println(" Lutfen bir N degeri girin");
            n = input.nextInt();
        }while(n<0);
        
        int [] randomsayi = new int [n];
        
        for (int i = 0; i < randomsayi.length; i++) {
            randomsayi[i]= r.nextInt(100);
        }
        
        int max = randomsayi[0];
        int min = randomsayi[0];
        int index = 0;
        int indexmin = 0;
        for (int i = 0; i < randomsayi.length; i++) {
            if(randomsayi[i]>max){
            max = randomsayi[i];
            index = i ;
        }
            else
                min = randomsayi[i];
                indexmin = i ;
            
            System.out.println(index+" indisindeki max deger "+max+" dır ");
            System.out.println(indexmin+" indisindeki min deger "+min+" dır ");
        
    }
    
}
