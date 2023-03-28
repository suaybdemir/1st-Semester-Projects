/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author PC
 */
public class Asal_ama_her_basamagindaki_sayide_asal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Her basamagındaki sayi asal olan 10 ile 99 arasındaki sayıları yazdıran program . 
        
        int a = 99 ;
        int b  ;
        int c ;
        int d ;
        
        for (int i = 10; i < 99; i++) {
            
            
                b = i%10 ;//birler basamgındaki sayiyi al
                if(b==2 || b==3 || b==5 || b==7 )//bu sayı asalsa devam et
                {
                    
                    
                    if(i%10==2 || i%10==3 || i%10==5 || i%10==7)//Yuzler basamagındaki sayı asalsa yazdır
                        
                    {
                        System.out.println(i);
                    }
                }
            
          
            
        }
        
    }
    
}
