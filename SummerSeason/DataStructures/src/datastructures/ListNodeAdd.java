/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author PC
 */
public class ListNodeAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode a = new ListNode(10);
        a.next = new ListNode(20);
        a.next.next = new ListNode(30);
        System.out.println("Başlangıç:"+a.data);
        a = addFirst(a,50);
        System.out.println("Başlangıç:"+a.data);
        
    }
    
    static ListNode addFirst(ListNode b,int value)
    {
        ListNode c = new ListNode(value,b);
        return c;
    }
    
}
