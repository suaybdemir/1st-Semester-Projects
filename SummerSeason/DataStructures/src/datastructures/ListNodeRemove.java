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
public class ListNodeRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
ListNode a = new ListNode(10); 
a.next = new ListNode(20); 
a.next.next = new ListNode(30); 
a = remove(a, 1); 
while(a != null) { 
System.out.println(a.data); 
a = a.next; }
} 

static ListNode remove(ListNode b, int index) { 
ListNode c = b; 
for(int i = 1; i<index; i++) { 
c = c.next; } 
c.next = c.next.next; 
return b; 
}

    
}
