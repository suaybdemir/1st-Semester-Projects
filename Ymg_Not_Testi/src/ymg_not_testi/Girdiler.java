/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymg_not_testi;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Girdiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Metodlar girdi = new Metodlar(80,40);
        
        double avg = girdi.avg_generate();
        
        String not = girdi.result();
        
        System.out.println(" Ortalama "+avg);
        System.out.println(" Not "+not);
        
    }
    
}
