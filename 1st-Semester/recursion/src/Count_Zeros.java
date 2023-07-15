/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Count_Zeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int zeros = count_zeros(5201020);
        System.out.println("Sayıdaki 0 sayısı: "+ zeros);
    }
    
    public static int count_zeros(int num){
        if( num == 0){ // base case 1
            return 1;
        }
        else if (num < 10){ // base case 2
            return 0;
        }
        else{
            int last_digit = num % 10; // birler basamağındaki sayıyı bulur
            int updated_num = (int) num / 10; 
            if (last_digit == 0){
                return 1 + count_zeros(updated_num);
            }
            else{
                return 0 + count_zeros(updated_num);
            }
        }      
    }
    
}
