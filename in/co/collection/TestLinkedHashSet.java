package in.co.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("Z");
		set.add("m");
		set.add("b");
		set.add("p");
		set.add("a");
		System.out.println(set);
		/*Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			set.add("mm");
			
		}*/
		Stack stack=new Stack();
		stack.add("A");
		stack.add("D");
		stack.add("C");stack.add("BS");
		
		Enumeration e = stack.elements();
		 stack.add("ns");
	      System.out.println("Print the enumeration");

	      while(e.hasMoreElements()) {
	    	 
	         System.out.println("Value is: "+e.nextElement());
	      }
		
	}
}
