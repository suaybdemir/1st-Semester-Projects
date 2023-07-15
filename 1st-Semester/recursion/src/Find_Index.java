/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Find_Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi = {1,3,5,11,15,19,23,25};
        int index = binarysearch(dizi,23,0,dizi.length-1);
        System.out.println("Aranan eleman indeksi: "+index);
    }
    
    public static int binarysearch(int[] array, int x, int low, int high) {
        if(high>low) {
            int middle = (low + high) / 2;
            if(x == array[middle]){ // base case
                return middle; 
            }
            else if (x > array[middle]) {
                int updated_low = middle + 1;
                return binarysearch(array,x,updated_low,high);
            }
            else if (x < array[middle]) {
                int updated_high = middle - 1;
                return binarysearch(array,x,low,updated_high);
            }
        }
        return -1;
    }

    
}
