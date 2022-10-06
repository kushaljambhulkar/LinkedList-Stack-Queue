package com.LinkeddList;
import java.util.*;
class QNode {
	int data;
	QNode next;

	QNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Queue {
    QNode front;
	QNode rear;

	void enque(int val) {
		QNode n = new QNode(val);
		if (rear == front && rear == null) {
			n.next = rear;
			rear = n;
			front = rear;
			return;
		}
		rear.next = n;
		rear = n;
	}
	void deque() {
		if (front == null) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("Deleted front: " + front.data);
		front = front.next;
	
}

	void printQueue() {
		QNode temp = this.front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}
	}
		
	

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque(56);
		q.enque(30);
		q.enque(70);
		q.deque();
		q.printQueue();
	}
}
