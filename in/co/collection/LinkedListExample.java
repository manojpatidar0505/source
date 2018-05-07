package in.co.collection;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add("manoj");
	list.add(10);
	list.add(null);
	list.add("manoj");
	System.out.println(list);
	list.set(0, "patidar");
	System.out.println(list);
	list.set(0, "man");
	System.out.println(list);
	list.removeLast();
	System.out.println(list);
}
}
