package in.co.collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListCollection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("B");
		System.out.println(list);
		HashMap map = new HashMap();
		map.put(1, "65");
		map.put(2, "65");
		map.put(3, "65");
		System.out.println(map);
		Set set = new TreeSet();
		set.add(50);
		set.add(40);
		set.add(30);
		set.add(20);
		System.out.println(set);
		Queue queue = new LinkedList();
		queue.add("Z");
		queue.add("B");
		queue.add("C");
		queue.add("A");
		System.out.println(queue);
		Deque deque = new LinkedList();
		deque.addLast("Z");
		deque.addLast("A");
		deque.addLast("M");
		deque.addLast("B");
		System.out.println(deque);
	}
}
