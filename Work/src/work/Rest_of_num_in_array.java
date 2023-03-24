/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Rest_of_num_in_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int arr[]=new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i]=r.nextInt();
        }
        rest_of_num(arr,0,arr.length);
    }
    public static int[] rest_of_num(int arr[],int low,int high)
    {
        int mid = (high-low)/2;
        if(high>1)
        {
            return rest_of_num(arr,low,mid);
        }
        else
            System.out.println(arr[mid]);
        return arr;
    }
    
}
