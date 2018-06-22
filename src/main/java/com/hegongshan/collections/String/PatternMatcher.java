package com.hegongshan.collections.String;

/**
 * 常用的模式匹配算法，如BF，KMP
 * @author hegongshan https://www.hegongshan.com
 *
 */
public class PatternMatcher {
	
	/**
	 * brute force算法
	 * @param str 主串
	 * @param str2 模式串
	 * @return 模式串在主串中首次出现的位置，若主串中不存在模式串，则返回-1
	 */
	static int indexOfWithBF(String str,String str2) {
		int i = 0,j = 0;
		while (i <str.length() && j < str2.length()) {
			if(str.charAt(i) == str2.charAt(j)) {
				i++;
				j++;
			} else {
				i = i-j +1;
				j=0;
			}
		}
		if(j >= str2.length()) {
			return i-str2.length();
		}
		return -1;
	}
	/**
	 * KMP算法
	 * @param s
	 * @param t
	 * @return
	 */
	static int indexOfWithKMP(String s,String t) {
		int[] next = getNext(t);
		int i = 0 , j = 0;
		while(i<s.length()&&j<t.length()) {
			if(j==-1 || s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if(j>=t.length()) {
			return i-t.length();
		} else {
			return -1;
		}
	}
	
	/**
	 * 改进后的KMP算法
	 * @param s
	 * @param t
	 * @return
	 */
	static int indexOfWithKMPImproved(String s,String t) {
		int[] next = getNextVal(t);
		int i = 0 , j = 0;
		while(i<s.length()&&j<t.length()) {
			if(j==-1 || s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if(j>=t.length()) {
			return i-t.length();
		} else {
			return -1;
		}
	}
	
	private static int[] getNext(String t) {
		int[] next = new int[t.length()];
		int i = 0,k = -1;
		next[0] = -1;
		while(i < t.length() - 1) {
			if(k == -1 || t.charAt(i) == t.charAt(k)) {
				i++;
				k++;
				next[i] = k;
			} else {
				k = next[k];
			}
		}
		return next;
	}
	//改进后的nextVal
	private static int[] getNextVal(String t) {
		int[] nextVal = new int[t.length()];
		int i = 0,k = -1;
		while(i<t.length()) {
			if(k == -1 || t.charAt(i) == t.charAt(k)) {
				i++;
				k++;
				if(t.charAt(i) != t.charAt(k)) {
					nextVal[i] = k;
				} else {
					nextVal[i] = nextVal[k];
				}
			} else {
				k = nextVal[k];
			}
		}
		return nextVal;
	}

}
