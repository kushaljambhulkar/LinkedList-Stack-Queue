package com.LinkeddList;
import java.util.*;
class Node{
    Node next;
    int data;
    Node(int value){
    this.data = value;
    this.next=null;
    }	
}
public class Stack {
    Node first;
    Stack(){
        first = null;
    }
    void push(int value) {
		Node n = new Node(value);
		n.next=first;
		first=n;
	}
    void pop() {
		if( first==null) {
		System.out.println("Stack is Empty");
		return;
		}
		first=first.next;	
	}
    int peak() {
		if(first==null) {
			System.out.println("Stack is Empty");
			return-1;	
		}
		return first.data;
	}
    void printstack() {
		Node temp = this.first;
		while (temp != null) {
			System.out.println(temp.data );
			temp = temp.next;
        }	
	}
    public static void main(String[] args) {
        Stack p = new Stack();
		p.push(70);
		p.push(30);
		p.push(56);
		p.peak();
		p.pop();
		p.pop();
		p.pop();
		p.printstack();
		System.out.println("Stack is Empty");
    }
}

