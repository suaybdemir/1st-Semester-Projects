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
public class Floyd_triangular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* 1 den baslanarak bir artan bir dizide , birinci satıra bir tane ikinci satıra ise aritmetik sayilarin devamını iki aritmetik sayiyi yazdırma mantıgı ıle ilerleyen bir
        dızıye floyd ucgeni denir . Buna gore yapılan program ; */
        
        
        int a;
        do
        {
            
            System.out.println(" Bir satir sayisi gir ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1 ; i <=a ; i++)
        {
            for (int j = 1 ; j <=i ; j++)
            {
               System.out.print(j+" ");//bir sutun yazdir
            }
            System.out.println();//bir satir yazdir
        }
    }
    
}
