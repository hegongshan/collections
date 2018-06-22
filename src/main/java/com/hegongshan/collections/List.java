package com.hegongshan.collections;

public interface List<E> {
	
	int size();
	
	boolean isEmpty();
	
	boolean add(E e);
	
	void add(int index, E e);
	
	E remove(int index);
	
	boolean remove(Object obj);
	
	E get(int index);
	
	E set(int index, E e);
	
	void clear();
	
	boolean contains(Object obj);
	
	int indexOf(Object obj);
	
	int lastIndexOf(Object obj);

}
