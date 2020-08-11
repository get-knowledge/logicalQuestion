package com.gobeyond.question.general;

public class LinkedList<T> {

	Node<T> head = null;

	int size = 0;

	public Node<T> get(int index) {
		Node<T> node = head;
		// get by index
		return node;
	}

	public void add(T t) {
		// add element
		size++;
	}

	public void delete(int index) {
		// delete element
		size--;
	}

	public void findMiddleElement() {
		get((size - 1) / 2);
	}

}
