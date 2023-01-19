/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Random_number_generator_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Rastgele bilgisayar tarafından atanan bir degeri bulmaya calıstiginiz bir programdir . Ayiretten kac denemede buldugunuzuda gorebilirsiniz.
        
        int b = 0 ;//deneme sayisidr
        
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
        int upperbound = 25 ;
        int int_random = rand.nextInt(upperbound);
        
        System.out.println(" Enter a integer ");
        int a = input.nextInt();

        if(a == int_random && b<=10)
        {
            System.out.println(" Su kadar denemde "+b+" dogru bildiniz ");
            
        }
        else if(b>10)
        {
            
            System.out.println(" Bilemediniz ");
        
        }
        
    
}
