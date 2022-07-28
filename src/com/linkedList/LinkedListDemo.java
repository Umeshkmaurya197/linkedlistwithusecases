package com.linkedList;

public class LinkedListDemo<T> {
	Node<T> head;
	int size;

	public LinkedListDemo() {
		this.size = 0;
	}

	// add -first Node
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
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
		size++;
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

	// add middle
	public void addMiddle(int position, T data) {
		Node<T> newNode = new Node<>(data);
		if (position > size) {
			System.out.println(" Given position " + position + " is out of bound");
		}
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		if (position == 1) {
			addFirst(data);
			return;
		}
		Node<T> currentNode = head;
		int count = 1;
		while (count < position - 1) {
			currentNode = currentNode.next;
			count++;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}

	// delete First Elements
	public void deleteFirst() {
		if (head == null) {
			System.out.println(" List is empty nothing to delete .");
			return;
		}
		size--;
		head = head.next;
	}

	// delete Last Node
	public void deleteLast() {
		if (head == null) {
			System.out.println(" List is empty nothing to delete .");
			return;
		}
		size--;
		Node<T> secondLastNode = head;
		Node<T> lastNode = head.next;
		while (lastNode.next != null) {
			secondLastNode = secondLastNode.next;
			lastNode = lastNode.next;
		}
		secondLastNode.next = null;

	}

	// Search Element
	public boolean searchElement(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			System.out.println(" List is empty .");
			return false;
		}
		int i = 0;
		Node<T> currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}

	// print List Method
	public void printList() {
		if (head == null) {
			System.out.println(" List Is Empty .");
			return;
		}
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(" " + currentNode + " ->");
			currentNode = currentNode.next;
		}
		System.out.println(" null");
	}

	public static void main(String[] args) {

		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		LinkedListDemo<Integer> linkedListDemo2 = new LinkedListDemo<Integer>();
		LinkedListDemo<Integer> linkedListDemo3 = new LinkedListDemo<Integer>();

		linkedListDemo.addFirst(70);
		linkedListDemo.printList(); // 70 -> null

		linkedListDemo.addFirst(30);
		linkedListDemo.printList(); // 30 -> 70 -> null

		linkedListDemo.addFirst(56);
		linkedListDemo.printList(); // 56 -> 30 -> 70 -> null

		System.out.println(" ");

		linkedListDemo2.addLast(56);
		linkedListDemo2.printList(); // 56 -> null

		linkedListDemo2.addLast(30);
		linkedListDemo2.printList(); // 56 -> 30 -> null

		linkedListDemo2.addLast(70);
		linkedListDemo2.printList(); // 56 -> 30 -> 70 -> null

		System.out.println(" ");
		linkedListDemo3.addFirst(56);
		linkedListDemo3.addLast(70);
		linkedListDemo3.printList(); // 56 -> 70 -> null

		linkedListDemo3.addMiddle(2, 30);
		linkedListDemo3.printList(); // 56 -> 30 -> 70 -> null

		linkedListDemo3.deleteFirst();
		linkedListDemo3.printList(); // 30 -> 70 -> null

		linkedListDemo3.deleteLast();
		linkedListDemo3.printList(); // 30 -> null

		System.out.println(" ");
		linkedListDemo3.addFirst(56);
		linkedListDemo3.addLast(70);
		linkedListDemo3.printList(); // 56 -> 30 -> 70 -> null
		boolean result = linkedListDemo3.searchElement(30);
		System.out.println(" Searching for element 30 in the list , result is : "+result);
		
	}

}
