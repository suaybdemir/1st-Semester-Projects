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
public class Example6ONEMLISORU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir ifade girin");
        String txt = input.nextLine();
        char[]sesli= {'a','e','i','o','u'};
        int [] yer = new int [255];
        int sayac = 0;
        for (int i = 0; i < sesli.length; i++) {
            char h = Character.toLowerCase(txt.charAt(i));
            
            for (int j = 0; j < sesli.length; j++) {
                if(sesli[j]==h){
                    //System.out.println((i+1)+" inci karakter");
                    sayac++;
                    yer[sayac]=i;
                }
            }
        }
        for (int i = 0; i < sayac; i++) {
            System.out.print((yer[i]+1)+", \n");
        }
        System.out.println("Toplam sesli harf: "+sayac);
         
    }
    
}
