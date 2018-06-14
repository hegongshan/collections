package com.hegongshan.collections;

/**
 * 栈
 * @author hegongshan
 *
 * @param <E>
 */
public interface Stack<E> {
	/**
	 * 是否为空
	 * @return 若为空，返回true，否则，返回false
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @return 栈中元素个数
	 */
	int size();
	
	/**
	 * 进栈
	 * @param e 待进栈的元素
	 */
	void push(E e);
	
	/**
	 * 栈顶元素出栈，并返回其值
	 * @return 栈顶元素的值
	 */
	E pop();
	
	/**
	 * 
	 * @return 当前栈顶元素的值
	 */
	E peek();

}
