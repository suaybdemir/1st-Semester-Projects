/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14;

/**
 *
 * @author PC
 */
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+" inci index");
            numbers[i]=assign_num();
            numbers[i]=assign_num1();
            int ub=50;
            int N=10;
            int[]sayi=new int[N];
            Random r = new Random();
            for (int j = 0; j < sayi.length; j++) {
                sayi[i]=r.nextInt();
            }
        }
        int[] sayi1 = randomarray(50,10);
    }
    public static int[] randomarray(int ub,int N)
    {
           
            int[]sayi=new int[N];
            Random r = new Random();
            for (int j = 0; j < sayi.length; j++) {
                sayi[i]=r.nextInt();
            }
            return sayi;
    }
    public static int assign_num()
    {
        Scanner input = new Scanner(System.in);
        int sayi;
        do
        {
            System.out.println("0-100 arası sayi girin");
            sayi = input.nextInt();
        }while(sayi<0 || sayi>100);
        return sayi;
        
    }
    public static int assign_num1(int lb,int ub)
    {
        Scanner input = new Scanner(System.in);
        int sayi;
        do
        {
            System.out.println("0-100 arası sayi girin");
            sayi = input.nextInt();
        }while(sayi<lb || sayi>ub);
        return sayi;
        
    }
    
    
    
}
