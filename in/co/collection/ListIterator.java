package in.co.collection;

import java.util.ArrayList;

public class ListIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("Z");
		list.add("B");
		list.add("c");
		list.add("D");
		int size = list.size();
		System.out.println(list);
		Object a=null;
		java.util.ListIterator iterator = list.listIterator();
		for (int i = size; i >= 0; i--) {
			while (iterator.hasNext()) {
				a=iterator.next();

			}
			list.add(i, a);
		}
		System.out.println(list);

		/*
		 * System.out.println("------------"); while(iterator.hasPrevious()){
		 * System.out.println(iterator.previous()); }
		 */

	}
}
