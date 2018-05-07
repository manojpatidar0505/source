package in.co.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
public static void main(String[] args) {
	SortedSet set=new TreeSet() ;
	set.add("A");
	set.add("Z");
	set.add("Y");
	set.add("B");
	set.add("C");
	set.add("1");
	
	System.out.println(set);
	SortedSet set1=new TreeSet() ;
	
	set1.add(100);
	set1.add(200);
	set1.add(10);
	System.out.println(set1.first());
	set1.add(5);
	set1.add(2);
	set1.add(1);
	
	System.out.println(set1);
	
	System.out.println(set1.first());
}
}
