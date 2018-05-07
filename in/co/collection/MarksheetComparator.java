package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MarksheetComparator {
	public static void main(String[] args) {
		ArrayList marksheet = new ArrayList();
		marksheet.add(new Marksheet(10, "Abc", 10));
		marksheet.add(new Marksheet(50, "Def", 20));
		marksheet.add(new Marksheet(2, "xyz", 30));
		marksheet.add(new Marksheet(9, "pqr", 40));
		OrderByName cname = new OrderByName();
		Collections.sort(marksheet, cname);
		for (Object o : marksheet) {
			System.out.println(o);

		}
		System.out.println("***************");
		OrderByMarksDesc marksdec = new OrderByMarksDesc();
		Collections.sort(marksheet, marksdec);
		for (Object o : marksheet) {
			System.out.println(o);

		}

	}
}
