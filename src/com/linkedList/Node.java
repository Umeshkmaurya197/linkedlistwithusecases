package com.linkedList;

public class Node<T> {
	T data;
	Node<T> next;
	public Node() {
		super();
	}
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		return data+" ";
	};
}
