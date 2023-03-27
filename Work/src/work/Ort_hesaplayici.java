/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ort_hesaplayici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int arr[]=new int[255];
        for (int i = 0; i < 255; i++) {
            System.out.println("Lutfen "+(i+1)+" inci notu giriniz");
            arr[i]= input.nextInt();
            if(i!=0 )
            {
                arr[i]+=arr[i-1];
            }
            System.out.println("Su anki ortalama "+(arr[i]/(i*(i+1)/2)));
            System.out.println("Program calismayi bitirsin mi? Eger bitecekse e bitmeycekse h yazınız");
            String a = input.nextLine();
            if(a=="e")
            {
                i = 255;
            }
            
                
        }
        
    }
    
}
