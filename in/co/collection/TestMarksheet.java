package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
		ArrayList marksheet = new ArrayList();
		marksheet.add(new Marksheet(1, "Rahul", 10));
		marksheet.add(new Marksheet(5, "Ram", 20));

		marksheet.add(new Marksheet(7, "shayam", 30));

		marksheet.add(new Marksheet(2, "karan", 40));
		Collections.sort(marksheet);
		for (Object o : marksheet) {
			System.out.println(o);

		}
		String a = "A";
		System.out.println(a.equals("a"));

	}
}
