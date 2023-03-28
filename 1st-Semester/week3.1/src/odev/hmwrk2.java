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
public class hmwrk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" 1 ile 7 arasında bir sayı girin.Size hangi gün oldugunu soyliyeyim. ");
        int a = input.nextInt();
        if(a==7){
            System.out.println(a+" Pazar ");
        }
        if(a==6){
            System.out.println(a+" Cumartesi ");
            }
        if(a==5){
            System.out.println(a+" Cuma ");
        }
            if(a==4){
                System.out.println(a+" Perşembe ");
            }
            if(a==3)
            {
                System.out.println(a+" Çarşamba ");
            }
           if(a==2){
                System.out.println(a+ " Salı ");
            }
            if(a==1)
            {System.out.println(a+" Pazartesi ");
            }
            
        
        }
    }
    

