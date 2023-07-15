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
public class Find_Sqrt_Amount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen degerini bulmak istediginiz ikinci dereceden koklu sayının icindeki degerini giriniz");
        double x = input.nextInt();
        gen(x);
        
    }
    public  static double gen(double x)
    {

        double a = x/2;
        int c = 0;
        while(c==0)
        {
         if(a*a/x>=1 && a*a/x<=11/10)
         {
                             c++; 
         }
         else if(a*a<x)
         {
             a*=3/2;
         }
         else if(a*a>x)
         {
             a*=1/2;
         }
        }
        print(a,x);
        return a;
        }
    public static void print(double a,double x)
    {
            System.out.println(x+" nın kokunu degeri yaklasik olarak"+a+" dir");
    }
    }

                        