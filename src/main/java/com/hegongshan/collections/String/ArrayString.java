package com.hegongshan.collections.String;

/**
 * 顺序串
 * @author hegongshan https://www.hegongshan.com
 *
 */
public class ArrayString {
	
	private char[] elementData;
	
	public int length() {
		return elementData.length;
	}
	
	public boolean isEmpty() {
		return length() == 0;
	}
	
	public char charAt(int index) {
		checkElementIndex(index);
		return elementData[index];
	}
	
	public char[] toCharArray() {
		return elementData;
	}
	
	private void checkElementIndex(int index) {
		if(index < 0 || index >= elementData.length) {
			throw new ArrayIndexOutOfBoundsException("length:"+length()+",index:"+index);
		}
	}
	
}
