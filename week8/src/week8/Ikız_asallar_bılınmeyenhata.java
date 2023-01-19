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
public class Ikız_asallar_bılınmeyenhata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /*İki asal sayi arasındaki fark 2 ise bunlar ikiz asaldır.Bu mantıga gore ikiz asalları bulan program.*/
        
          int a ;
          int b = 1 ;//bolen sayaci
          int c = 1 ;//bolen sayaci
          do
          {
              System.out.println(" Lutfen bir pozitif tamsayi girin");
              a = input.nextInt();
          }while(a<0);
        
          for (int i = 1; i <= a ; i++) {
              for (int j = 2 ; j < a; j++) {
                  if(i%j!=0)
                  {
                      b++;//i bir sayiya bolunemediginde eger o sayoya esit olursa asaldır demek icin yapilan bir islemdir
                  }
              }
          
              for (int j = 2; j < i+2; j++) {
                  if(i+2%j==0)
                  {
                      c++;//bolen sayacidir
                  }
              }
          if(i==b+1 && i+2==c+1 )//b i ye esit oldugu durumda veya i nin c ye esit oldugu durumda yapilan bir islem
          {
              System.out.println(i+","+(i+2));
          }
         
    }
          
    
}
