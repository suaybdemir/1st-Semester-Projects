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
public class ListNodeIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
ListNode a = new ListNode(10); 
a.next = new ListNode(20); 
a.next.next = new ListNode(30); 
a = addMiddle(a, 2, 35); 
while(a != null) { 
System.out.println(a.data); 
a = a.next; } 
} 

static ListNode addMiddle(ListNode b, int index, int value) { 
ListNode c = b; 
for(int i = 1; i<index; i++) { 
c = c.next; } 
ListNode add = new ListNode(value, c.next); 
c.next = add; 
return b; 
}

    
}
