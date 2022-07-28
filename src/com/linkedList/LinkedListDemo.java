package com.linkedList;

public class LinkedListDemo<T> {
	Node<T> head;

	// add -first Node
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// add -Last Node
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	//print List Method
	public void printList() {
		if (head == null) {
			System.out.println(" List Is Empty .");
			return;
		}
		Node<T> currentNode = head;
		while (currentNode!= null) {
			System.out.print(" "+currentNode + " ->");
			currentNode = currentNode.next;
		}
		System.out.println(" null");
	}

	public static void main(String[] args) {

		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		
		linkedListDemo.addFirst(70);
		linkedListDemo.printList();			// 70  -> null
		
		linkedListDemo.addFirst(30);
		linkedListDemo.printList();			// 30  -> 70  -> null
		
		linkedListDemo.addFirst(56);
		linkedListDemo.printList();			// 56  -> 30  -> 70  -> null
		
	}

}
