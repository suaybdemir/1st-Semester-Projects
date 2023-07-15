/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Max_Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lütfen 1.sayıyı giriniz.");
        int a = input.nextInt();
        System.out.println("Lütfen 2.sayıyı girniz.");
        int b = input.nextInt();
        System.out.println("Lütfen 3.sayıyı girniz.");
        int c = input.nextInt();
        if(a>b && a>c ){ 
            System.out.println(" En büyük sayı " + a);
        }
        else if(b>c && b>a ){
            System.out.println("En büyük sayı " + b);
        }
        else if(c>a && c>b){
            System.out.println("En büyük sayı " + c);
        }
        else {
            System.out.println("En büyük sayı yoktur");
            
        }
            
        }
        
    }
    
}
