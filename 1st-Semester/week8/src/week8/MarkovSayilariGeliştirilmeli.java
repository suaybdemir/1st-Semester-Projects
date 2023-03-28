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
public class MarkovSayilariGeliştirilmeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // x,y,z elemanıdır [1,50] için markov sayilarini listeleyen program ;
        
        for (int i = 1; i <= 50 ; i++) {
            for (int j = 1 ; j <=50; j++) {
                for (int k = 1 ; k <=50; k++) {
                    if(i*i+j*j+k*k==3*i*j*k*k)
                    {
                        System.out.println(i+","+j+","+k);//saglayan i j k degerleri yazdirilir
                    }
                }
            }
        }
        
        
        
        
    }
    
}
