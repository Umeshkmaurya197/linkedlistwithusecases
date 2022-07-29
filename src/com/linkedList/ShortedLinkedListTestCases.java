package com.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortedLinkedListTestCases {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
		System.out.println("--------Test addFirst--------");
		linkedListDemo.addFirst(70);
		linkedListDemo.addFirst(30);
		linkedListDemo.addFirst(56);

		linkedListDemo.printList();
	}

	@Test
	public void given3NumbersWhenAppendedShouldBeAddedToLast() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
		System.out.println("---------Test addLast--------");
		linkedListDemo.addLast(56);
		linkedListDemo.addLast(30);
		linkedListDemo.addLast(70);

		linkedListDemo.printList();
	}

	@Test
	public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
		System.out.println("--------Test inMiddle--------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();

		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();
	}

	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
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
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
		System.out.println("-------Test deleteLast------");
		linkedListDemo.addLast(56);
		linkedListDemo.addLast(30);
		linkedListDemo.addLast(70);
		linkedListDemo.printList();

		linkedListDemo.deleteLast();
		linkedListDemo.printList();
	}

	@Test
	public void given1ElementWhenInsertedShouldReturnTrueIfElementExistsInLinkedList() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();System.out.println("-------Test searchElement------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();

		System.out.println("Search element 30 Result is : " + linkedListDemo.searchElement(30));
	}

	@Test
	public void given2ElementWhenSearchThenInsertShouldReturnTrueIfElementExistsAndInsertedNextToElement() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();System.out.println("-------Test searchThenInsert------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.printList();

		Boolean val = linkedListDemo.searchThenInsert(30, 40);
		linkedListDemo.printList();
		assertEquals(true, val);
	}

	@Test
	public void given4ElementWhenDeleteNodeShouldFindAndDeleteTheNode() {
		SortedLinkedList<Integer> linkedListDemo = new SortedLinkedList<Integer>();
		System.out.println("-------Test deleteNode------");
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		linkedListDemo.searchThenInsert(30, 40);
		linkedListDemo.printList();

		linkedListDemo.deleteNode(40);
		linkedListDemo.printList();
	}
}
