/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Fibonacci_dizisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n;
        int yeni;
       
        {
            System.out.println(" Lutfen bir terim sayisi girin");
            n = input.nextInt();
            
        }while(n<0);
        
        int [] fiboc = new int [n];
        /*
        fiboc[0]=1 ;
        if(n>=0){
        System.out.println(fiboc[0]);
        fiboc[1]=1 ;
        
        if(n>=1){
            System.out.println(fiboc[1]);}*/
        
        for (int i = 2; i < fiboc.length; i++) {
            /*fiboc[i] =fiboc[i-1] + fiboc[i-2] ;
            System.out.println(fiboc[i]);*/
            yeni = fiboc[i-1]+fiboc[i-2] ;
            fiboc[i] = yeni ;
        }
        for (int i = 0; i < fiboc.length; i++) {
            if(i==fiboc.length-1){
            System.out.print(fiboc[i]+",");
        }
            else
                System.out.println(fiboc[i]+",");
                }
        
        
        
        
    }
    
}
