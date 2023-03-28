/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class example1virgul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here77
        Scanner input = new Scanner(System.in);
        int s ;
                do {
                    System.out.println(" Lutfen pozitif bir tamsayi giriniz ");
                    s = input.nextInt();
                    
                }while(s<=0);
                
                System.out.print(s);
                
                        
        
    }
    
}
