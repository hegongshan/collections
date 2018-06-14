package com.hegongshan.collections;

public class LinkedQueue<E> implements Queue<E>{

	private Node<E> first;//队首
	private Node<E> last;//队尾
	private int size = 0;
	
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void enqueue(E e) {
		Node<E> x = new Node<E>(e,null);
		if(last == null) {
			first = last = x; 
		} else {
			last.next = x;
			last = x;
		}
		size++;
	}

	@Override
	public E dequeue() {
		if(first == null) {
			throw new NullPointerException();
		}
		Node<E> x = first;
		first = first.next;
		size--;
		return x.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LinkedQueue [");
		Node<E> x = first;
		while (x != null) {
			if (x.next == null) {
				sb.append(x.data);
			} else {
				sb.append(x.data + ",");
			}
			x = x.next;
		}
		sb.append("]");
		return sb.toString();
	}

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data, Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}
	}

}
