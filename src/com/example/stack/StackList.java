package com.example.stack;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<String> str = new Stack<String>();
		str.push("Tushar");
		str.push("Vishal");
		str.push("Piyush");
		str.push("Hitesh");
		System.out.println(str);
		str.peek();
		System.out.println("Peek : " + str);
		str.pop();
		System.out.println("Pop : " + str);
	}

}
