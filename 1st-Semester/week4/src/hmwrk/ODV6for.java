/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwrk;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class ODV6for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print(" Bolenlerinin hesaplanmasini istediginiz bir sayiyi yaziniz ");
        double a = input.nextInt();
        int b = 0 ;
        int c = 0 ;
        for (int i = 0; i <a; i++)
        {
             if(a%i == 0)
             { System.out.println(i);}
        }
    }
    
}
