package in.co.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailPassFailSafe {
	public static void main(String[] args) {
		/*
		 * ArrayList arrayList = new ArrayList(); // CopyOnWriteArrayList
		 * arrayList = new CopyOnWriteArrayList(); for (int i = 0; i <= 10; i++)
		 * { arrayList.add(i);
		 * 
		 * } Iterator iterator = arrayList.iterator(); while
		 * (iterator.hasNext()) { Integer o = (Integer) iterator.next(); if (o
		 * == 5) { arrayList.add("12"); } }
		 * 
		 * System.out.println(arrayList);
		 */

		Stack stack = new Stack();
		stack.push("10");
		stack.push("10");
		stack.push("10");
		stack.push("20");
		stack.push("10");
		stack.push("10");
		Enumeration en = stack.elements();
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			if (s == "20") {
				stack.push("50");
			}
			
		}
		System.out.println(stack);
	}

}
