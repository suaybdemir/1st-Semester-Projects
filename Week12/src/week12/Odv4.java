/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Odv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir ifade girin");
        String a = input.nextLine();
        char sesli[]={'a','e','ı','i','o','ö','u','ü'};
        char k1[] = new char[255];
        char k2[] = new char[255];
        int sayac1 = 0;
        int sayac2 = 0;
        for (int i = 0; i < a.length(); i++) {
            char h = Character.toLowerCase(a.charAt(i));
            for (int j = 0; j < 8; j++) {
                if(sesli[j]==h){
                    
                    k1[sayac1]=h;
                    sayac1++;
                }
                else
                    k2[sayac2]=h;
                sayac2++;
                
            }
                    
        }
        for (int i = 0; i < sayac1; i++) {
            if(k1[i]!=k1[i+1])
            {
            System.out.println(k1[i]+" k1 dizisinin bir elemanıdır");
        }
        }
        for (int i = 0; i < sayac2; i++) {
            for (int j = 0; j < sayac2; j++) {
                if(k2[i]!=k2[j] )
            {
            System.out.println(k2[i]+" k2 dizisinin bir elemanıdır");
        }
            }
            
        }
        
        
    }
    
}
