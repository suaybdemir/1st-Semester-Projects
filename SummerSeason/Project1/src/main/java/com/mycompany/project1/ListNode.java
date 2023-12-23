/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author PC
 */
public class ListNode {
    int data;
    ListNode next;
}

ListNode()
{
    this.data = -1;
    this.next = null;

}

ListNode(int data)
{
    this.data = data;
    this.next = null;
}

ListNode(int data, ListNode next)
{
    this.data= data;
    this.next = next;
}
