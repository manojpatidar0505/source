package in.co.collection;

import java.util.TreeSet;

public class ComparartorTest {
public static void main(String[] args) {
	TreeSet set=new TreeSet(/*new MyCpmparator()*/);
	set.add(10);
	set.add(20);
	set.add(110);
	set.add(500);
	set.add(5);
	System.out.println(set);
	}
}
