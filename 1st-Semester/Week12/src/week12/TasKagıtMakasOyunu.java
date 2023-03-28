/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class TasKagıtMakasOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] rps= {"r","p","s"};
        String bilgisayar = rps[new Random().nextInt(rps.length)];
        while(true){
        System.out.println(" Choose a r,p or s");
        
        String kullanıcı =  input.nextLine();
        
        if(kullanıcı.equals("r")||kullanıcı.equals("p")||kullanıcı.equals("s")){
            break;
        }
            System.out.println(kullanıcı+" gecerli bir hareket degil");
        }
            
        System.out.println("Bilgisayarın hareketi"+bilgisayar);
        
        if(kullanıcı.equals(bilgisayar)){
            System.out.println("Tie");
        }
       
            
        
                    
        
        
    }
        
        
    }
    
}
