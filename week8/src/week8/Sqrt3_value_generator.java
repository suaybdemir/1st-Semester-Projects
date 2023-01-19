/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Sqrt3_value_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        // Klavyeden girilen terim sayisina gore kok3 un yaklasik oalrak degerini bulan program 
            int a ;
            double b ;
            double c ;
            do
            {
                System.out.println(" Lutfen bir terim sayisi girin ");
                a = input.nextInt();
            }while(a<0);
            
            for (int i = 1; i <= a; i++) {
            b = i ;//i ye dokunmamak icin yapilan bir denk alma islemi
            b += 1 + 1 / (2+(1/b)) ;//Matematik formulizasyona gore yapilan islem
            
            if(i==a)
            {
             c = 1 + (1 / b) ;  //Matematiksel formulizasyona gore yapilan islem
                System.out.println(c);
            }
        }
        
    }
    
}
