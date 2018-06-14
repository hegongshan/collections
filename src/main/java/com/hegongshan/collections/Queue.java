package com.hegongshan.collections;

/**
 * 队列
 * @author hegongshan
 *
 * @param <E>
 */
public interface Queue<E> {
	
	/**
	 * 是否为空
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 队列长度
	 * @return
	 */
	int size();
	
	/**
	 * 进队
	 * @param e
	 */
	void enqueue(E e);
	
	/**
	 * 出队
	 */
	E dequeue();
}
