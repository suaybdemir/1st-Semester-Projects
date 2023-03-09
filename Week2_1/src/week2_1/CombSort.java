/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_1;

/**
 *
 * @author PC
 */
public class CombSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public static void combsort(int arr[])
    {
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[j+i])
                {
                    int tmp = arr[j+i];
                    arr[j+i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        
    }
    
}
