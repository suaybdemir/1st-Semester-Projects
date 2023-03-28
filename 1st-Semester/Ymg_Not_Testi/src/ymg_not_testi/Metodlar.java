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
public class Metodlar{
    
    public double birincinot;
    public double ikincinot;
    
    public Metodlar(double birincinot,double ikincinot){
        this.ikincinot = ikincinot ;
        this.birincinot = birincinot ;
    }
    
    public Metodlar()
    {
        this.ikincinot = -1;
        this.birincinot = -1 ;
        
    }
    public Metodlar(int a)
    {
        this.birincinot = birincinot ;
        
    }
    
    public double avg_generate()
    {
        return this.birincinot*0.4 + this.ikincinot*0.6 ;
    }
    
    public String result()
    {
        
        double avg = avg_generate();
        
        
        String not = new String();
   
       
            if(avg<=100 && avg>=90)
            {
                not = ("AA");
            }
            if(avg<=89 && avg>=85)
            {
                not = ("BA");
            }
            if(avg<=84 && avg>=80)
            {
                not = ("BB");
            }   
            if(avg<=79 && avg>=75)
            {
                not =("CB");
            }
            if(avg<=74 && avg>=70)
            {
                not = ("CC");
            }
            if(avg<=69 && avg>=1)
            {
                not = ("FD");
            }
            if(avg==0)
            {
                not = ("FF");
            }
            
            return not; 
    }
}
    
       
    
    

