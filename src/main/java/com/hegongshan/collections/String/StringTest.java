package com.hegongshan.collections.String;

public class StringTest {
	
	//bf
	static int indexOf(String str,String str2) {
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

}
