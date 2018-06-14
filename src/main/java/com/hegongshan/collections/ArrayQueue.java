package com.hegongshan.collections;

import java.util.Arrays;

/**
 * 循环队列，以数组的尾部当队尾
 * @author hegongshan
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
	
	private static final int DEFAULT_CAPACITY = 5;
	private Object[] elementData;
	private int first;
	private int last;
	
	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayQueue(int capacity) {
		elementData = new Object[capacity];
		first = last = 0;
	}

	@Override
	public boolean isEmpty() {
		return first == last;
	}

	@Override
	public int size() {
		return (last - first + elementData.length) % elementData.length;
	}

	@Override
	public void enqueue(E e) {
		ensureCapacity();
		last = (last + 1) % elementData.length;
		elementData[last] =e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("size:-1");
		}
		first = (first + 1) % elementData.length;
		return (E) elementData[first];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ArrayQueue [");
		int index = (first + 1) % elementData.length;
		for(int i = 0;i< size();i++) {
			if(index == last) {
				sb.append(elementData[last]);
			} else {
				sb.append(elementData[index]+",");
			}
			index = (index + 1) % elementData.length;
		}
		sb.append("]");
		return sb.toString();
	}
	
	private void ensureCapacity() {
		if((last +1) % elementData.length == first) {
			int incrementSize = elementData.length >> 1;
			int oldSize = elementData.length;
			elementData = Arrays.copyOf(elementData, oldSize + incrementSize);

			//如果队尾last在队首元素first的前面，则需要重新确定队首元素的位置
			if(first > last) {
				for (int i = oldSize - 1 ; i >= first ; i--) {
					//将队首first到原来数组最大下标之间的元素后移incrementSize个位置
					elementData[i+incrementSize] = elementData[i];
				}
				first += incrementSize;
			}
		}
	}

}
