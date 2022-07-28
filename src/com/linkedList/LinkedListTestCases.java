package com.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class LinkedListTestCases {
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestSearchElement() {
		LinkedListDemo<Integer> linkedListDemo =new LinkedListDemo<Integer>();
		linkedListDemo.addFirst(56);
		linkedListDemo.addLast(70);
		linkedListDemo.addMiddle(2, 30);
		assertEquals(true,linkedListDemo.searchElement(30));
	}
	
}
