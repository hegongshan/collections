package com.hegongshan.collections;

public abstract class LinkedList<E> implements List<E>{
	
	abstract void linkFirst(E e);
	
	abstract void linkLast(E e);
	
	abstract E getFirst();
	
	abstract void reverse();
	
	@Override
	public boolean remove(Object obj) {
		int index = indexOf(obj);
		if(index != -1) {
			remove(index);
			return true;
		}
		return false;
	}
	
	/**
	 * 结点索引从0开始到size-1
	 * @param index
	 */
	protected void checkElementIndex(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + size());
		}
	}

	/**
	 * 可以添加结点的位置，索引从0开始到size
	 * @param index
	 */
	protected void checkPositionIndex(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + size());
		}
	}

}
