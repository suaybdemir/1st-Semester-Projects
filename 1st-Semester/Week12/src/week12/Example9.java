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
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir ifade giriniz ");
        String txt = input.nextLine();
        char[] dizi = {' ',',',';','.',':','!'};
        
        int sayac = 0;
        for (int i = 0; i < txt.length(); i++) {
            char h = txt.charAt(i);
            for (int j = 0; j < dizi.length; j++) {
                if(h==dizi[j]){
                    sayac++;
                }
            }
        }
        System.out.println("Cumlede toplam " + sayac + " kelime vardır ");
                
    }
    
}
