package in.co.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListNew {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("M");
		list.add("A");
		list.add("N");
		list.add("O");
		list.add("J");
		list.add("P");
		list.add("A");
		list.add("T");
		list.add("I");
		list.add("D");
		list.add("A");
		list.add("R");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
