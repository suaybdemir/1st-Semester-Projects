
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
public class Eulerian_sayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Eularian sayisi formulizasyonuna gore yapilan program.Formul = (-1)^i * m+1 in i'lisi * (n+1-i)^m nin 0 dan basalyarak n ye kadar olan toplamidir .
        int n ;
        int m ;
        int fakt = 1;
        double toplam = 0 ;
        do
        {
            System.out.println(" Birinci degeri girin");
            n = input.nextInt();
            System.out.println(" İkinci degeri girin");
            m = input.nextInt();
        }while(n<0 && m<0 );
        
        for (int i = 0; i <= n; i++) {
            for (int j = m+1 ; j==m+1-i ; j--) {
                fakt *= j;
            }
            toplam += Math.pow(-1,i)*fakt*Math.pow(n+1-i,m) ;
            System.out.println(toplam);
        }
        
        
        
    }
    
}
