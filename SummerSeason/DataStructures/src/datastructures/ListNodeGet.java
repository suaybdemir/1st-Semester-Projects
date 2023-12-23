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
public class ListNodeGet {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) { 
ListNode a = new ListNode(10); 
a.next = new ListNode(20); 
a.next.next = new ListNode(30); 
int result = get(a, 2); 
System.out.println(result); 
} 

static int get(ListNode b, int index) { 
ListNode c = b; 
for(int i = 0; i<index; i++) { 
c = c.next; } 
return c.data; 
}

    
}
