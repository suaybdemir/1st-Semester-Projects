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
public class ODV6while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Tam bolenlerin hespalanması icin lutfen bir tam sayı degeri giriniz ");
        int a = input.nextInt();
        int b = 0 ;
        int c = 0 ;
       
        while(b<a)
        {
            b= b+1 ;
            if(a%b == 0)
            {
                System.out.println(" Bolenler: "+b);
                        
            }
                
                
        }
    }
    
}
