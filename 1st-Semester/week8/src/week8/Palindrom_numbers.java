/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Palindrom_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*Bastan ve sondan yazılıslari veya okunusları ayni olan sayilara palindrom sayilari denir.Buna gore 100-9999 arasındaki palindrom sayilarini yazdıran program */
        
        
        int a = 9999;
        
        for (int i = 100; i <= a; i++) {
            if(i<=999)//3 Basamakli sayilar icin islem
            {
                for (int j = 1; j <= 9; j++) {
                    for (int k = 0; k <= 9; k++) {
                        for (int b = 0; b <= 9; b++) {
                            if(i==100*j + 10*k + b && j==b)
                            {
                                System.out.println(i);
                            }
                        }
                    }
                }
            }
            else //4 basamakli sayilar icin islem
                for (int j = 1; j <= 9; j++) {
                    for (int k = 0; k <= 9; k++) {
                        for (int b = 0; b <= 9; b++) {
                            for (int c = 0; c <=9; c++) {
                                if(i==1000*j + 100*k + 10*b + c && j==c && k==b)
                                {
                                    System.out.println(i);
                                }
                            }
                        }
                    }
                }
            
        }
        
        
        
    }
    
}
