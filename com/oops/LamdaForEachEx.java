package com.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaForEachEx {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("E");
	list.add("D");
	list.add("C");
	list.add("B");
	list.add("A");
	
	//Collections.sort(list);
	list.forEach((n)->System.out.println(n));
}
}
