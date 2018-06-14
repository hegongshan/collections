package com.hegongshan.collections;

public class LinkedStack<E> implements Stack<E> {

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class Node<E> {
		Node<E> next;
		E data;
		Node(Node<E> next, E data) {
			super();
			this.next = next;
			this.data = data;
		}
	}

}
