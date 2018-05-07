package in.co.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("1");
		stack.push("50");
		stack.push("3");
		System.out.println(stack);
		Stack stack2 = new Stack();
		for (Object o : stack) {
			System.out.println(o);
			stack2.push(o);
			System.out.println("peek" + stack.peek());

		}
		stack2.push(15);
		System.out.println(stack2);
	}
}