package com.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTestCases {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("--------Test addFirst--------");
		linkedListDemo.addFirst(70);
		linkedListDemo.addFirst(30);
		linkedListDemo.addFirst(56);
		linkedListDemo.printList();
	}
	
	@Test
	public void given3NumbersWhenAppendedShouldBeAddedToLast() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("---------Test addLast--------");		
		linkedListDemo.addLast(56);
		linkedListDemo.addLast(30);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();		
	}
	
	@Test
	public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("--------Test inMiddle--------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();
		
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();
	}
	
	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("-------Test deleteFirst------");
		linkedListDemo.addLast(56);
		linkedListDemo.addLast(30);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();
		linkedListDemo.deleteFirst();
		linkedListDemo.printList();
	}
	
	@Test
	public void givenLastElementWhenDeletedShouldLinkedListResult() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("-------Test deleteLast------");
		linkedListDemo.addLast(56);
		linkedListDemo.addLast(30);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();
		linkedListDemo.deleteLast();
		linkedListDemo.printList();
	}
	
	@Test
	public void TestSearchElement() {		
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("-------Test searchElement------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();
		System.out.println("Search element 30 Result is : "+linkedListDemo.searchElement(30));
		System.out.println();
	}
	
	@Test
	public void TestSearchThenInsertElement() {
		LinkedListDemo<Integer> linkedListDemo = new LinkedListDemo<Integer>();
		System.out.println("-------Test searchThenInsert------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();
		Boolean val= linkedListDemo.searchThenInsert(30, 40);
	    linkedListDemo.printList();
		assertEquals(true, val);
	}
}
