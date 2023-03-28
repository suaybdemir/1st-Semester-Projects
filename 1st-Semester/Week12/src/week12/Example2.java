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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        System.out.println("Lutfen bir ifade giriniz");
        String txt = input.nextLine();
        System.out.println("Lutfen bir harf giriniz ");
        char ch = input.nextLine().charAt(0);
        
        for (int i = 0; i < txt.length(); i++) {
            if(ch==txt.charAt(i)){
                System.out.println((i+1)+"inci ifadede istenilen sayi vardır"+txt.charAt(i));
                sayac++;
            }
        }
        System.out.println(sayac+"\n tane kadar ifadede vardır");
        
        
    }
    
}
