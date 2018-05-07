package in.co.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverse {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("Befor Reverse" + list);
		Iterator iterator1 = list.descendingIterator();
		/*
		 * while (iterator1.hasNext()) { iterator1.next();
		 * 
		 * }
		 * 
		 * while (iterator1.hasPrevious()) {
		 * System.out.println(iterator1.previous()); }
		 */
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
