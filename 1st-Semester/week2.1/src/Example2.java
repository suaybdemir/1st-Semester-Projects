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
 
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit derecesini giriniz:");
        double fahrenheit = input.nextDouble(); // Adım 2
        double celcius = (fahrenheit-32) / 1.8; //Adım 3
        System.out.println("Hesaplanan Celcius:"+celcius); // Adım 4
        
    }
    
}
