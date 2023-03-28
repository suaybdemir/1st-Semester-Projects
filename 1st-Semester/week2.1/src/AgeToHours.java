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
public class AgeToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Whats Your Age?");
        double a = input.nextInt();
        System.out.println("What month were you born in?");
        double month = input.nextInt();
        System.out.println("What day born you?");
        double day1 = input.nextInt();
        System.out.println("what time were you born?");
        double hour = input.nextInt();
        double finish = ((hour)+(day1)*24)+((month)*30*24)+(a*12*30*24);
        System.out.println("Your age with hours:"+finish);
        
        
    
        
        
        
    }
    
}
