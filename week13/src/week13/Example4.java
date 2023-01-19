/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir satir ve sutun sayisi gir");
        int n = input.nextInt();
        int b ;
        int[][]a= new int[n][n];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println((i+1)+"inci satir ve "+(j+1)+" inci sutunu girin");
                a[i][j]=input.nextInt();
            }
        }
        int maxrow=0 , maxcol=0 , minrow=0,mincol=0;
        int maxelement = a[0][0],minelement= a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]>maxelement)
                {
                    maxelement=a[i][j];
                    maxrow= i;maxcol = j;
                    
                }
                if(a[i][j]<minelement)
                {
                    minelement = a[i][j];
                    minrow = i; mincol = j;
                }
            }
        }
        System.out.println("max element :"+maxelement+" ve indisi :"+maxrow+","+maxcol);
        System.out.println("min element :"+minelement+" ve indisi :"+minrow+","+mincol);
        
    }
    
}
