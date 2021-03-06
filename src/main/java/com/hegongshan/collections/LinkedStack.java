package com.hegongshan.collections;

/**
 * 链栈
 * @author hegongshan
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E> {

	private Node<E> peek;
	private int size;

	@Override
	public boolean isEmpty() {
		return peek == null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void push(E e) {
		Node<E> x = new Node<E>(e, null);
		if (peek == null) {
			peek = x;
		} else {
			x.next = peek;
			peek = x;
		}
		size++;
	}

	@Override
	public E pop() {
		if (peek == null) {
			throw new NullPointerException();
		}
		Node<E> x = peek;
		peek = peek.next;
		size--;
		return x.data;
	}

	@Override
	public E peek() {
		if (peek == null) {
			throw new NullPointerException();
		}
		return peek.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LinkedStack [");
		Node<E> x = peek;
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
