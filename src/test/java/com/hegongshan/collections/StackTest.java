package com.hegongshan.collections;

import org.junit.Test;

public class StackTest {
	
	@Test
	public void testArrayStack() {
		Stack<String> s = new ArrayStack<>();
		s.push("hgs");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.push("yy");
		s.push("whu");
		for (int i = 0; i < 15; i++) {
			s.push("iloveyou");
		}
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.pop();
		System.out.println(s);
	}
	
	@Test
	public void testLinkedStack() {
		Stack<String> s = new LinkedStack<>();
		s.push("hgs");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.push("yy");
		s.push("whu");
		System.out.println(s.peek());
		for (int i = 0; i < 15; i++) {
			s.push("iloveyou"+i);
		}
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.pop();
		System.out.println(s);
	}

}
