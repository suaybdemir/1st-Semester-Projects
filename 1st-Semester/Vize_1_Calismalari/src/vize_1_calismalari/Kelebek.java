/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vize_1_calismalari;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Kelebek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir satir sayısı gir");
        int satir = input.nextInt();
        
        for (int i = 1 ; i <= satir; i++)
        {
            for (int sutun = 1 ; sutun<=satir ; sutun++) 
            {
            if(i==1 || i == sutun || i == satir || i+sutun==satir+1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
            }
        System.out.println();
    
        }
    }
    
}
