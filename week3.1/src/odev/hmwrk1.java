/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package odev;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class hmwrk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Bir sayı giriniz ");
        double a = input.nextInt();
        if(a==0)
        {
            System.out.println(a+" Sayı sıfırdır ");
            
        }
        if(a>0){
            System.out.println(a+ " Sayı pozitiftir ");
            
        }
       if(a<0) {
            System.out.println(a+" Sayı negatiftir ");
            
            }
            
        }
    }
    

