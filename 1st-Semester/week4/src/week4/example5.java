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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println( " Lütfen alt sayıyı giriniz ");
        int alt_sinir = input.nextInt();
        System.out.println("Lütfen üst sayıyı giriniz");
        int ust_sinir = input.nextInt();
        
        for (int i = alt_sinir; i <= ust_sinir ; i++) {
            if(i%9 == 0 || i%4 == 0)
                System.out.println(i);
        }
    }
    
}
