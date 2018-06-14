package com.hegongshan.collections;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
	
	private static int DEFAULT_CAPACITY = 10;
	private Object[] elementData;
	private int size = 0;

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayStack(int capacity) {
		elementData = new Object[capacity];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void push(E e) {
		ensureCapacity();
		elementData[size++] = e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("size:"+size);
		}
		return (E) elementData[--size];
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if(size == 0) {
			throw new IndexOutOfBoundsException("size:"+size);
		}
		return (E) elementData[size-1];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ArrayStack [");
		for(int i = 0;i<size;i++) {
			if(i == size -1) {
				sb.append(elementData[i]);
			} else {
				sb.append(elementData[i]+",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	private void ensureCapacity() {
		if(size >= elementData.length) {
			elementData = Arrays.copyOf(elementData, elementData.length + (elementData.length >> 1));
		}
	}

}
