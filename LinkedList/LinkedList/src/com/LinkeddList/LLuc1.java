package com.LinkeddList;
public class LLuc1 {
// Represent a node of the singly linked list
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
//	Represented the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;
//addNode() will add a new node to the list
	public void addNode(int data) {
//		Create a New Node
		Node newNode = new Node(data);
//		Check if the list is empty
		if(head == null) {
//			if list is empty both head and tail will point to new node
			head = newNode;
			tail = newNode;
		}
		else
		{
//			newNode will be added after tail such that tails next will point to newNode
			tail.next = newNode;
//			newNode Will become new tail of the list
			tail = newNode;
		}
	}
//	display() will display all the nodes present in the list
	public void display() {
//		Node current will point to head
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of Singly linked list: ");
		while(current != null) {
//			prints each node by incrementing pointer	
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LLuc1 sList = new LLuc1();	
//		Add nodess to list 
		sList.addNode(56);
		sList.addNode(30);
		sList.addNode(70);
		sList.display();
	}
}
