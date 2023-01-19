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
public class hmwrk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
     
        System.out.println(" Lutfen bir ucgenin 1. kenarınının buyuklugunu giriniz ");
        double a = input.nextInt();
        System.out.println(" Lutfen bir ucgenin 2.kenarının buyuklugunu giriniz ");
        double b = input.nextInt();
        System.out.println(" Lutfen bir ucgenin 3.kenarının buyuklugunu giriniz ");
        double c = input.nextInt();
       
                if(b==c && b==a){
            System.out.println(" Bu ucgen bir eskenar ucgendir ");
        }
        if(b>a && b>c && a>c){
            System.out.println(" Bu ucgen bir cesitkenardir ");
        }
        if(b>a && b>c && c>a){
            System.out.println(" Bu ucgen bir cesitkenardir ");
        }
        if(a>b && a>c && b>c){
            System.out.println(" Bu ucgen bir cesitkenardir ");
        }
        if(a>b && a>c && c>b){
            System.out.println(" Bu ucgen bir cesitkenardir ");
            if(c>b && c>a && b>a){
                System.out.println(" Bu ucgen bir cesitkenardir ");
            }
            if(c>b && c>a && a>b){
            System.out.println(" Bu ucgen bir cesitkenardir ");
            }
            if(a==b && c>a){
                System.out.println(" Bu ucgen bir ikizkenardir ");
                if(a==b && a>c){
                    System.out.println(" Bu ucgen bir ikizkenardir ");
                    if(a==c && b>c){
                        System.out.println(" Bu ucgen bir izikenardir ");
                        if(a==c && b<c){
                                                       System.out.println(" Bu ucgen bir ikizkenardir ");}
                        }}
                    }
                }
                        
            }
            
        }
              
                
        
        
    }
    

